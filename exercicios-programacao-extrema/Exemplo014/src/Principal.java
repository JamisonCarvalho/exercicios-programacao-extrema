
public class Principal {

	public static void main(String[] args) {
		// Array
		
		//int[] nota = new int[3];
		/*
		int[] nota = {9, 8, 10};
		
		for(int valor:nota)
			System.out.println(valor);
		*/
		
		//Array bidimensional
		
		/*
		int[][] matriz = new int [2] [3];
		int i, j;
		
		matriz[0] [0] = 1;
		matriz[0] [1] = 2;
		matriz[0] [2] = 3;
		matriz[1] [0] = 4;
		matriz[1] [1] = 5;
		matriz[1] [2] = 6;
		
		for(i = 0; i < 2; i++) {
			for(j = 0; j < 3; j++) {
				System.out.println(matriz[i][j]);
			}	
		}
		*/
		
		int i,j;
		int matriz[] [] = {{ 0, 1, 2},{ 3, 4, 5}};
		
		for(i = 0; i < 2; i++) {
			for(j = 0; j < 3; j++) {
				System.out.println(matriz[i][j]);
			}
		}
	}
}
