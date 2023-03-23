import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = input.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = input.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = input.nextDouble();
		
		media = (nota1 + nota2 + nota3) /3;
		System.out.println("A sua média é " + media);
		
		if (media >= 7) {
			System.out.println("Você está aprovado!");
			System.out.println("Parabéns!");
		} 
		else {
			if(media < 4 ) {
				System.out.println("Você está reprovado!");
			}
			else {
				System.out.println("Final");
			}
		}
	}

}
