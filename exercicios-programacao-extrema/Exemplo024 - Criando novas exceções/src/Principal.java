import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// Criando novas exceções
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
				
		do {
			System.out.println("Digite o número 1 ou 2:");
			System.out.println();
		
			try {
				opcao = teclado.nextInt();
				switch(opcao) {
					case 1:
						System.out.println("Você diigitou a oção " + opcao);
						break;
					case 2:
						System.out.println("Você diigitou a oção " + opcao);
						break;
					default:
						throw new Excecao("ERRO");
				}
				
			}
			catch(Excecao excecao){
				System.out.println(excecao.getMessage());
			}
			finally {
				System.out.println("---------------------------------------------------");
			}
		} while(true);
			
	}

}
