import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;


public class Principal {

	public static void main(String[] args) {

		// LINKEDLIST
		LinkedList<String> listaNome = new LinkedList<>();
		listaNome.add("Jamison");
		listaNome.add("Brenda");
		listaNome.add("Tiana");
		listaNome.add("Sara");
	
		
		for(String nome: listaNome) {
			System.out.println(nome);
		}

	}

}
