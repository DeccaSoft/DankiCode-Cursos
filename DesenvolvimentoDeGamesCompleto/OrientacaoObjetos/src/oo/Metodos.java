package oo;

public class Metodos {

	public static void main(String[] args) {
		
		String atributo1 = "AtributoTexto";
		
		new Player2().nascer();
		Player player = new Player();
		player.nascer(); //Não ERA possível acessar, pois o método ERA privado
		new Metodos();
	}
	
	public Metodos() {
		System.out.println("Construtor");
	}

}
