package main;

public class Medias {

	public static void main(String[] args) {
		
		double media1 = (8 + 9 + 7) / 3;
		System.out.println("A média aritmética dos números 8, 9 e 7 é: " + media1);
		
		double media2 = (4 + 5 + 6) / 3;
		System.out.println("\nA média dos números 4, 5 e 6 é: " + media2);
		
		double somaMedias = media1 + media2;
		System.out.println("\nA soma das duas médias é: " + somaMedias);
		
		double mediaMedias = somaMedias / 2;
		System.out.println("\nA média das duas médias é: " + mediaMedias);		
	}

}
