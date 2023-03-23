//salvar como MeuPrimeiroExercicioJava.java

//nome da classe
class MeuPrimeiroExercicioJava
{
	//módulo principal com a entrada pela linha de comando
	public static void main (String entrada[])
	{
		//declaração de variáveis
			int idade = 30;
			String nome = "Jamison Carvalho dos Santos";
			String curso = "Ciencia da computacao";
			String faculdade = "Descomplica Faculdade Digital";
			int formatura = 2026;
			char genero = 'M';
			double peso = 89.60;
			
			System.out.println("Oi, me chamo " + nome + ", tenho anos " + idade + " e peso " + peso + ".");
			System.out.println("Estou estudando " + curso + " pela " + faculdade + " e esta previsto para me formar no ano de " + formatura + ". Foi uma prazer em te conhecer.");
			
			System.exit(0);
	}

}