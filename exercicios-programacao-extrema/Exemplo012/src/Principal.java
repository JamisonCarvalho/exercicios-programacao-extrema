import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//instrução de loop FOR
		
		/*for (int i = 1; i <= 5 ; i++) {
			System.out.println(i);
		};*/
		
		
		for( int a = 1; a <= 2; a++) {
			double n1, n2, m;
			Scanner input = new Scanner(System.in);
			
			
			System.out.println("Aluno " + a);
			
			System.out.println("Digite a nota 1: ");
			n1 = input.nextDouble();
			
			System.out.println("Digite a nota 2: ");
			n2 = input.nextDouble();
			
			m = (n1 + n2) / 2;
			System.out.println("Média: " + m);
		}
		

	}

}
