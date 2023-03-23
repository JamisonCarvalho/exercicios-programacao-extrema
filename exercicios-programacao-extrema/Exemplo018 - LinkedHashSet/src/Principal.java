import java.util.ArrayList;
import java.util.LinkedHashSet;


public class Principal {

	public static void main(String[] args) {

		// LinkedHashSet
		ArrayList<Integer> numerosArrayList = new ArrayList<>();
		numerosArrayList.add(8);
		numerosArrayList.add(5);
		numerosArrayList.add(8);
		
		System.out.println("ArrayList: " + numerosArrayList);
		
		LinkedHashSet<Integer> numeroLinkedHashSet = new LinkedHashSet<>(numerosArrayList);
		System.out.println("LinkedHashSet: " + numeroLinkedHashSet);
		

	}

}
