import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;


public class Principal {

	public static void main(String[] args) {

		// ARRAYLIST
		/*
		ArrayList<String> listaNome = new ArrayList<>();
		listaNome.add("Jamison");
		listaNome.add("Brenda");
		listaNome.add("Tiana");
		listaNome.add("Sara");
		
		System.out.println("Antes");
		
		for(String nome: listaNome) {
			System.out.println(nome);
		}
		
		listaNome.set(1,"JP");
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Depois");
		
		for(String nome: listaNome) {
			System.out.println(nome);
		}
		
		List<String> listaNome = new ArrayList<>();
		listaNome.add("Jamison");
		listaNome.add("Brenda");
		listaNome.add("Tiana");
		listaNome.add("Sara");
		
		for(String nome: listaNome) {
			System.out.println(nome);
		}
		*/
		
		// VECTOR
		Vector<String> listaNome = new ArrayList<>();
		listaNome.add("Jamison");
		listaNome.add("Brenda");
		listaNome.add("Tiana");
		listaNome.add("Sara");
		
		for (String nome: listaNome) {
			System.out.println(nome);
		}
		
	}

}
