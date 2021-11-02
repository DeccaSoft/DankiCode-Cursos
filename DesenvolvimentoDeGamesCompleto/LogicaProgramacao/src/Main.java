
public class Main {

	public static void main(String[] args) {
		System.out.println("------------Aula 001 - Hello World!!!----------------");
		System.out.println("Hello World!!!");
		
		System.out.println("------------Aula 002 - Variáveis----------------");
		int idade = 24;
		System.out.println("Minha Idade é " + idade);
		idade =25;
		System.out.println("Minha Idade é " + idade);
		
		System.out.println("------------Aula 003 - Tipos de Variáveis----------------");
		int numero = 26;
		String texto = "Olá Mundo!!!";
		boolean booleana = true;
		char caractere = 'A';
		double decimal = 24.9;
		System.out.println(numero);
		System.out.println(texto);
		System.out.println(booleana);
		System.out.println(caractere);
		System.out.println(decimal);
		
		System.out.println("------------Aula 004 - Constantes----------------");
		final int VIDA_MAXIMA = 10;
		// VIDA_MAXIMA = 20 => Constantes não podem ter o seu valor alterado!!!
		System.out.println(VIDA_MAXIMA);
		
		System.out.println("------------Aula 005 - Arrays----------------");
		String[] nome = new String[5];
		nome[0] = "André";
		nome[1] = "Morais";
		System.out.println("Meu nome é: " + nome[0] + " " + nome[1]);
		
		//Arrays MultiDimensionais...
		String[][] nomes = new String[5][5];
		nomes[0][0] = "Azevedo";
		System.out.println(nomes[0][0]);
		
		System.out.println("------------Aula 006 - Condições----------------");
		int vida = 100;
		if(vida >= 100) {
			vida++;
			System.out.println("OBA!!! Ganhou mais uma Vida!!!");
		}else if(vida >=50 && vida < 100){
			System.out.println("Chegue a 100 de Vida e Ganhe mais uma Vida de Bônus");
		}else {
			System.out.println("Você precisa ganhar mais vidas...");
		}
		
		System.out.println("------------Aula 007 - Condições 2----------------");
		int life = 100;
		switch (life) {
		case 90:
			System.out.println("Faltam 10 Vidas para você ganhar uma Vida de Bônus!");
			break;
		case 30:
			System.out.println("A partir de agora você está mais rápido...");
		default:
			System.out.println("Você precisa ganhar mais vidas...");
			break;
		}
		
		System.out.println("------------Aula 007 - Matemática Avançada----------------");
		int vida1 = 80;
		int vida2 = 90;
		int vida3 = 100;
		int vidaFinal = vida1 + vida2 + vida3;
		int vidaFinal2 = ((vida1 + vida2) / 2) * 2;
		System.out.println(vidaFinal + vidaFinal2);
		
		//Operadores
		//E = && ... OU = ||
		if((vida1 > 80 && vida2 > 100) || (vidaFinal + vidaFinal2) >= 300) {
			System.out.println("Você está indo muito bem!!!");
		}
		
		System.out.println("------------Aula 008 - Loop----------------");
		//while
		int contador = 1;
		while(contador <= 10) {
			System.out.println("Contador: " + contador);
			contador++;
		}
		
		//for
		for(int i = 1; i<=10; i++) {
			System.out.println("Contador2: " + i);
		}
		
		//do while
		int contador3 = 1;
		do {
			System.out.println("Contador3: " + contador3);
			contador3++;
		}while(contador3 <=10);
		
	}
}
