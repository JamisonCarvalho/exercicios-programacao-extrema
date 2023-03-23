import java.util.LinkedHashSet;


public class Principal {

	public static void main(String[] args) {

		// LinkedHashSet
		LinkedHashSet<String> listaNome = new LinkedHashSet<>();
		listaNome.add("Jamison");
		listaNome.add("Brenda");
		listaNome.add("Tiana");
		listaNome.add("Sara");
		
		
		for(String nome: listaNome) {
			System.out.println(nome);
		}

	}

}
