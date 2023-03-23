import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// Capturando múltiplas exceções
		
		Scanner scanner = new Scanner(System.in);
		int valor;
				
		try {
			System.out.println("Digite o denomiador: ");
			valor = scanner.nextInt();			
			
			int resultado = 1000 / valor;
			System.out.println(resultado);
		} 
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		} 
		catch (InputMismatchException e) {
			System.out.println("InputMismatchException => " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Erro => " + e.getMessage());
		}
		
	}

}
