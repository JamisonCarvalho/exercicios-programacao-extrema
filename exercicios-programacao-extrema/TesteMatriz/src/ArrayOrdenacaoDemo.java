//package br.com.java.aula;
import java.util.Arrays;

public class ArrayOrdenacaoDemo {

	public static void main(String[] args) {
		// Declarando matriz de elemtenos flutuantes
		
		float[] resultadoArray = {
			69.4f,
			75.3f,
			43.22f,
			55.21f,
			35.87f,
			87.02f
		};
		
		System.out.println("Matriz antes da ordenação - " + Arrays.toString(resultadoArray));
		
		//a linha abaixo ordenará a matriz em ordem crescente
		
		Arrays.sort(resultadoArray); System.out.println("Matriz depois da ordenação - " + Arrays.toString(resultadoArray));
	}
	
	}
