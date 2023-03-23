
public class Principal {

	public static void main(String[] args) {
		
		// Capturando exceção
		try {
			int resultado = 10 / 0;
			System.out.println(resultado);
		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}
		
	}

}
