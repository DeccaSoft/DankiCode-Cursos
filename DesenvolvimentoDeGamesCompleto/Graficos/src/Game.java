import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {
	
	public static JFrame frame;
	private Thread thread;
	private boolean isRunnig = true;
	private final int WIDTH = 240;
	private final int HEIGHT = 160;
	private final int SCALE = 3;
	private BufferedImage image;
	private Spritesheet sheet; //Utlizando a Classe Spritesheet
	private BufferedImage[] player;
	private int frames = 0;
	private int maxFrames = 10; //de quantos em quantos frames o personagem ser? animado
	private int currAnimation = 0;
	private int maxAnimation = 3;
	
	public Game() {
		
		sheet = new Spritesheet("/spritesheet.png");
		player = new BufferedImage[4];
		player[0] = sheet.getSprite(0, 0, 16, 16);
		player[1] = sheet.getSprite(16, 0, 16, 16);
		player[2] = sheet.getSprite(0, 0, 16, 16);
		player[3] = sheet.getSprite(32, 0, 16, 16);
		setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE)); //Seta as dimens?es do Frame
		initFrame();
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		
	}
	
	public void initFrame() {
		
		frame = new JFrame("Game #1"); //Criai um novo Frame com t?tulo "Game #1"
		frame.add(this); //Adiciona o Frame
		frame.setResizable(false); //Usu?rio n?o pode redimensionar a janela
		frame.pack(); //Ap?s adiconado o Cavas, ele calcula as dimens?es a serem setadas
		//ou seja, redimensiona a janela de acordp com os componentes adicinados
		frame.setLocationRelativeTo(null); //Janela deve ficar no centro
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Ao fechar o Frame tamb?m fechar a Aplica??o
		frame.setVisible(true); //Ao iniciar o frame j? fica visivel
		
	}
	
	public synchronized void start() {
		
		thread = new Thread(this);
		thread.start();
		isRunnig = true;
		
	}
	
	public synchronized void stop() {
		isRunnig = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		Game game = new Game();
		game.start();
		
	}
	
	public void tick() { //Update... aqui est? toda a l?gica do jogo
		frames++;
		if(frames > maxFrames) {
			frames = 0;
			currAnimation++;
			if(currAnimation > maxAnimation) {
				currAnimation = 0;
			}
		}
	}
	
	public void render() { //M?todo para rederizar tudo
		
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3); //Sequencia de buffres para otimizar a renderiza??o
			return;
		}
		Graphics g = image.getGraphics();; //A partir de agora podemos renderizar a vontade
		g.setColor(new Color(0, 0, 255));
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		//g.setColor(Color.GREEN);
		//g.fillOval(0, 40, 50, 50);
		//g.setFont(new Font("Arial", Font.BOLD, 20));
		//g.setColor(Color.WHITE);
		//g.drawString("Ol? Mundo!!!", 19, 19);
		
		/*Renderiza??o do Jogo*/
		
		Graphics2D g2 = (Graphics2D) g;
		//g2.rotate(Math.toRadians(90), 90+8, 90+8); //Rotaciona 90 graus na posi??o 98,
		//pois ele se encontra na posi??o 90 e 8 ? a metade de 16, ou seja, o meio do boneco
		g2.drawImage(player[currAnimation], 90, 90, null);
		
		/***/
		g.dispose(); //M?todo de otimiza??o para limpar dados n?o utilizados mais na imagem
		g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0, WIDTH*SCALE, HEIGHT*SCALE, null);
		bs.show();
	}
	
	@Override
	public void run() {
		
		long lastTime = System.nanoTime(); //Pega o tempo atual do computador em nanosegundos ao iniciar o jogo
		double amountOfTicks = 60.0; //60 frames por segundo
		double ns = 1000000000 / amountOfTicks; //Dividindo 1 segundo 60 (amountOfTicks),
		//afim de personalizar o momento dos Ticks (Updates)... 60fps
		double delta = 0;
		int frames = 0;
		double timer = System.currentTimeMillis();
		
		while(isRunnig) {
			long now = System.nanoTime(); //Pega o tempo atual
			delta += (now - lastTime) / ns;
			lastTime = now;
			if(delta >= 1) {
				tick();
				render();
				frames++;
				delta--;
			}
			if(System.currentTimeMillis() - timer >= 1000) {
				System.out.println("FPS: " + frames);
				frames = 0;
				timer += 1000; //Mesma coisa que timer = System.currentTimeMillis()
			}
		}
		stop();
	}

}
