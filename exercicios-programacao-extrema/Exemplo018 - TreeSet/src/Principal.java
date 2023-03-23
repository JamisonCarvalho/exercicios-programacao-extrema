import java.util.HashSet;


public class Principal {

	public static void main(String[] args) {

		// HashSet
		HashSet<String> listaNome = new HashSet<>();
		listaNome.add("Jamison");
		listaNome.add("Brenda");
		listaNome.add("Tiana");
		listaNome.add("Sara");
		
		
		for(String nome: listaNome) {
			System.out.println(nome);
		}

	}

}
