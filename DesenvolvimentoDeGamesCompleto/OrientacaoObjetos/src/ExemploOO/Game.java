package ExemploOO;

public class Game {

	
	private Player player;
	private Inimigo inimigo;
	
	public Game() {
		player = new Player();
		inimigo =  new Inimigo();
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		Player player = game.getPlayer();
		player.atacarInimigo(game.getInimigo());
		//Testando se funcionou a retirada de ponto de vida do inimigo
		System.out.println("Inimigo agora possui vida = " + game.getInimigo().life);
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Inimigo getInimigo() {
		return inimigo;
	}

	public void setInimigo(Inimigo inimigo) {
		this.inimigo = inimigo;
	}
	
	
}
