import java.util.TreeMap;
import java.util.Hashtable;

public class Principal {

	public static void main(String[] args) {
		
		//TreeMap
		
		TreeMap <String, String> mapaNomes = new TreeMap<>();
		mapaNomes.put("vava", "Oswaldo");
		mapaNomes.put("gisa", "Gisele");
		mapaNomes.put("giugiu", "Giuliana");
		System.out.println("TreeMap de nomes: " + mapaNomes);
		
		System.out.println("Chaves: " + mapaNomes.keySet());
		System.out.println("Valores: " + mapaNomes.values());
		System.out.println("Chave/valor: " + mapaNomes.entrySet());
		
	}

}
