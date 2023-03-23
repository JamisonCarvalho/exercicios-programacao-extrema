import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		/* EXEMPLO 1 da aula 3
		 
		 double nota1 = 9.0;
		double nota2 = 10;
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println (media);*/
		
		int valor ;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println ("Digite um número: ");
		valor = teclado.nextInt();
		
		System.out.println(valor / 2);
		System.out.println(valor % 2);
		
	}

}
