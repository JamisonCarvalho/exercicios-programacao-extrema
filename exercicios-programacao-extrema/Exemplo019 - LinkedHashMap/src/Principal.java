import java.util.LinkedHashMap;
import java.util.Hashtable;

public class Principal {

	public static void main(String[] args) {
		
		//LinkedHashMap
		
		LinkedHashMap <String, String> listaNomes = new LinkedHashMap<>();
		listaNomes.put("vava", "Oswaldo");
		listaNomes.put("gisa", "Gisele");
		listaNomes.put("giugiu", "Giuliana");
		System.out.println("LinkedHashMap1: " + listaNomes);
		
		String valor = listaNomes.get(2);
		// Creating a LinkedHashMap from other LinkedHashMap	
		
		LinkedHashMap<String, String> novaListaNomes = new LinkedHashMap<>(listaNomes);
		novaListaNomes.put("Jubis", "Jujuba");
		System.out.println("LinkedHashMap2: " + novaListaNomes);
		
		
	}

}
