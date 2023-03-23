import discentes.AlunoSuperior;

public class Principal {

	public static void main(String[] args) {

		AlunoSuperior alunoSuperior = new AlunoSuperior();
		
		//alunoSuperior.nome = "Jamison";
		
		alunoSuperior.setNome("Jamison");
		//alunoSuperior.teste = 10;
		alunoSuperior.setTeste(10);
		//alunoSuperior.prova = 9;
		alunoSuperior.setProva(9);
		
		
		System.out.println(alunoSuperior.getMedia());
		System.out.println(alunoSuperior.getNome());
	}

}
