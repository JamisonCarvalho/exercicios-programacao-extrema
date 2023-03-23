import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Principal {

	public static void main(String[] args) {

		// ITERATOR
		/*
		ArrayList<String> listaNome = new ArrayList<>();
		listaNome.add("Jamison");
		listaNome.add("Brenda");
		listaNome.add("Tiana");
		listaNome.add("Sara");
		
		java.util.Iterator<String> iterator = listaNome.iterator();
		
		// hasNext é pra ver se tem o próximo da fila
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		*/
		
		// COMPARATOR
		/*
		ArrayList<String> listaNomes = new ArrayList<>();
		listaNomes.add("Jamison");
		listaNomes.add("Brenda");
		listaNomes.add("Tiana");
		listaNomes.add("Sara");
		
		System.out.println("Elementos antes da ordenação:");
		
		for (int i = 0; i < listaNomes.size(); i++)
			System.out.println(listaNomes.get(i));
			
		Comparator<Object> comparator = Collections.reverseOrder();
		Collections.sort(listaNomes, comparator);
		
		System.out.println("Elementos depois da ordenação:");
		
		for(String nome: listaNomes)
			System.out.println(nome);
		*/
		
		ArrayList<Produto> s = new ArrayList<Produto>();
		
		s.add(new Produto (123, "Blusa",520));
		s.add(new Produto (234, "Meia", 213));
		s.add(new Produto (345, "Casco", 101));
		s.add(new Produto (456, "Boné", 59));
		s.add(new Produto (567, "Camisa", 10));
		
		System.out.println("Lista antes da ordenação:");
		
		for (Produto shop: s) {
			System.out.println(shop.quantidadeEstoque + " " + shop.nomeProduto + " " + shop.codigoProduto);
		}

		System.out.println();
		System.out.println("Lista depois da ordenação:");
		
		Collections.sort(s, new EstoqueComparator());
		
		for (Produto shop : s) {
			System.out.println(shop.quantidadeEstoque
					+ " - " + shop.nomeProduto
					+ " - " + shop.codigoProduto);
		}
	}

}
