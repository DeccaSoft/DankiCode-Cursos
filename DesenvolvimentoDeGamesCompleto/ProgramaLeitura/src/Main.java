import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("---------------------Aula 1 - Scanner--------------------");
		Scanner in = new Scanner(System.in);
		String nome, idade, peso, cidade, estado, pais;
		System.out.print("Por favor, Digite o seu Nome: ");
		nome = in.nextLine();
		System.out.print("Por favor, Digite o sua Idade: ");
		idade = in.nextLine();
		System.out.print("Por favor, Digite o seu Peso: ");
		peso = in.nextLine();
		System.out.print("Por favor, Digite o sua Cidade: ");
		cidade = in.nextLine();
		System.out.print("Por favor, Digite o seu Estado: ");
		estado = in.nextLine();
		System.out.print("Por favor, Digite o seu Pa�s: ");
		pais = in.nextLine();
		System.out.println("Ol�, " + nome + ", vamos come�ar?");
		
		System.out.println("---------------------Aula 2 - N�meros Aleat�rios--------------------");
		Random rand = new Random();
		System.out.println("Vo�� deseja ir para qual dire��o?");
		System.out.println("(W= Frente; S= Volta; A= Esquerda; D= Direita)");
		String comando = in.nextLine();
		if(comando.contentEquals("W")) {
			System.out.println("Andou uma casa para frente...");
			System.out.println("Um Inimigo surgiu!!!");
			System.out.println("O que deseja fazer? (K= Atacar; L= Fugir)");
			comando = in.nextLine();
			if(comando.contentEquals("K")) {
				if(rand.nextInt(100) >= 75) {
					System.out.println("Voc� Matou o Inimigo... Parab�ns, Voc� Ganhou o Jogo!!!");
				}else {
					System.out.println("Voc� Morreu!!! Fim de Jogo...");
				}
			}else if(comando.contentEquals("L")) {
				System.out.println("Voc� Fugiu... O jogo terminou!");
			}	
		}else if(comando.contentEquals("S")) {
			System.out.println("Vo�� quer Realmente Voltar ao Mapa Anterior?");
		}
		
	}

}
