import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// String 
		
		Scanner teclado = new Scanner(System.in);
		/*String nome;
		
		System.out.println("Digite seu nome");
		nome = teclado.next();
		
		System.out.println("Olá, " + nome); */


		//Exercício com String
		
		String nome, mat, situacao, turma;
		double n1, n2, media;
		
		System.out.println("Digite a turma: ");
		turma = teclado.next();
		
		for( int i = 0; i < 3 ; i++ ) {
			System.out.println("Digite seu nome: ");
			nome = teclado.next();
			System.out.println("Digite sua matrícula: ");
			mat = teclado.next();
			
			
			System.out.println("Digite sua primeira nota: ");
			n1 = teclado.nextDouble();
			System.out.println("Digite sua segunda nota: ");
			n2 = teclado.nextDouble();
			
			media = (n1 + n2) / 2;

			if(media >= 6) {
				System.out.println("Parabéns " + nome + " sua média foi de " + media + " você está APROVADO.");
			} else {
				System.out.println(nome + " sua média está abaixo de 6.0 por isso você está REPROVADO.");
			}
			
			
			System.out.println("------------------------------------------------------");
						
			
			
		}

	}

}
