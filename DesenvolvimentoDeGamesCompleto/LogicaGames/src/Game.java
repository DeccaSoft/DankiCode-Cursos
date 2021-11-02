import java.util.ArrayList;

public class Game implements Runnable{
	
	public boolean isRunning;
	private Thread thread;
	public ArrayList<Entidade> entidades = new ArrayList<>();
	
	public Game() {
		entidades.add(new Entidade());
		entidades.add(new Entidade());
		entidades.add(new Entidade());
		entidades.add(new Entidade());
		entidades.add(new Entidade());
		for(int i=0; i<entidades.size(); i++) {
			Entidade e = entidades.get(0);
		}
	}

	public static void main(String[] args) {
		
		Game game = new Game();
		game.start();
		
	}
	
	public synchronized void start() {
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public void tick() {
		//Controla a atualização o Jogo de tempos em tempos
		System.out.println("Tick");
	}
	
	public void render() {
		//Renderiza o Jogo de tempos em tempos
		System.out.println("Render");
	}

	@Override
	public void run() {
		System.out.println("Iniciando o Loop do Jogo...");
		while (isRunning) {
			//Loop do Jogo
			tick();
			render();
			//A seguir uma das formas de implementar a quantidade de fps. Depois será visto uma forma mais profissional!
			try {
				//Fazendo rodar o loop (a Thread) 60 vezes por segundo ... [60fps]
				Thread.sleep(1000/60); //Pausa de 1 em 1 segundo ... 1000ms = 1 minuto / 60
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
