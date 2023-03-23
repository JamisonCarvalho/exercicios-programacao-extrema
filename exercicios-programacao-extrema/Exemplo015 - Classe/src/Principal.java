
public class Principal {

	public static void main(String[] args) {
		
		// CLASSE
		
		/*
		  Aluno aluno = new Aluno();
		 
		 Professor professor = new Professor();
		 
		
		 aluno.setNome("Jamison");
		 aluno.prova = 10;
		 aluno.teste = 10;
		
		System.out.println (aluno.nome);
		System.out.println (aluno.getMedia());
				
		professor.setNome("Oswaldin");
		professor.setSalario(1000);
		
		System.out.println (professor.getNome());
		System.out.println (professor.getSalario());
		System.out.println (professor.getSalarioLiquido());
		System.out.println (professor.getInss());
		*/
		
		AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
		AlunoEnsinoSuperior alunoEnsinoSuperior = new AlunoEnsinoSuperior();
		
		alunoEnsinoMedio.nome = "Jamison";
		alunoEnsinoMedio.teste = 8;
		alunoEnsinoMedio.prova = 9;
		
		System.out.println("----- ALUNO DO ENSINO MÉDIO -----");
		System.out.println("Nome: " + alunoEnsinoMedio.nome);
		System.out.println("Media: " + alunoEnsinoMedio.getMedia());
		
		alunoEnsinoSuperior.nome = "Jamison 2";
		alunoEnsinoSuperior.teste = 8;
		alunoEnsinoSuperior.prova = 9;
		
		System.out.println("");
		
		System.out.println("----- ALUNO DO ENSINO SUPERIOR -----");
		System.out.println("Nome: " + alunoEnsinoSuperior.nome);
		System.out.println("Media: " + alunoEnsinoSuperior.getMedia());
	}

}
