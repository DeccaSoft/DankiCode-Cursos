package oo;

public class Main extends TesteAbstract implements MinhaInterface{

	public static void main(String[] args) {
		
		Player player = new Player();
		player.iniciarJogador();
		
		Inimigo inimigo = new Inimigo();
		inimigo.iniciarInimigo();
		
		Player player2 = new Player();
		player2.iniciarJogador();
		
		new Player().iniciarJogador(); //Aqui acho que REINICIA o último Player
		
		System.out.println(player);
		System.out.println(inimigo);
		System.out.println(player2);
		System.out.println(player2);
		
		System.out.println("----------------Aula 2 - InnerClasses---------------------");
		new Main().instanceMain2();

		System.out.println("----------------Aula 2 - Classes Abstratatas---------------------");

		System.out.println("----------------Aula 3 - Interfaces---------------------");

	}

	public void instanceMain2() {
		new Main2().print1();;
	}
	
	private class Main2{
		//InnerClass
		public void print1() {
			System.out.println("----------------Aula 2 - InnerClasses---------------------");
			System.out.println("Dentro do Método print1() da InnerClasse Main2 dentro da Classe Main");
		}
	}
	
	public void chamarMetodoAbstract() {
		System.out.println("----------------Aula 2 - Classes Abstratatas---------------------");
		this.instanceMain2();
		iniciarJogo();
	}
	
	public void iniciarJogo() {
		System.out.println("----------------Aula 2 - Classes Abstratatas---------------------");
		System.out.println("Aqui sobrescrevo o método da Classe TesteAbstract... Iniciando Jogo");
	}
	
	public void metodo() {
		System.out.println("----------------Aula 3 - Interfaces---------------------");
		System.out.println("Carregando Interface");
	}

	@Override
	public void iniciar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void morrer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void perdervida() {
		// TODO Auto-generated method stub
		
	}
}
