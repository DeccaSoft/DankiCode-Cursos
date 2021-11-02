
public class Teste {
	public static void main(String[] args) {
		int v0 = 3;
		int v1 = v0++;
		int v2 = ++v1;
		v1 += v0;
		v2 += --v1;
		
		System.out.println(v0);
		System.out.println(v1);
		System.out.println(v2);
		
		System.out.println("-------------");
		
		int total = 0;
		int c[] = new int[10];
		for (int i = 0; i<c.length; i++) {
			c[i] = i + i;
		}
		for (int i = 0; i<c.length; i++) {
			total += c[i];
		}
		System.out.println(total);
		
		System.out.println("_----------------------");
		
		String nome = "João";
		   imprimeNome("Empty");
		  
		   
			System.out.println("_----------------------");
		   int x, y;
		   double z;

		   x = 5;
		   y = 2;
		   z = x / y;
		   System.out.print(z);
	}
	

	public static void imprimeNome(String nome) {
		   if(!nome.isEmpty()){
			    System.out.println("Tudo bem " + nome + "?");
		   } else { 
			    System.out.println("O nome é " + nome + "?");
		   }
	}
}
