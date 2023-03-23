
/*public class Principal {

	public static void main(String[] args) {
		
		

	}

}*/

public class Principal{
	
	public static void main(String[] args) {
		
		Funcionario joao = new Funcionario();
		joao.setSalario(1000);
		
		System.out.println(joao.getSalario()); //vai imprimir 1000,00
		
		Funcionario tiago = new Funcionario();
		tiago.setSalario(2000);
		
		System.out.println(tiago.getSalario()); //vai imprimir 2000,00
	}
}

public class Funcionario {
	
	private String nome;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario (double salario) {
		this.salario = salario;
	}
	
	public double calculoSalario() {
		return this.getSalario();
	}
}



public class Coordenador extends Funcionario{
	private int quantidadeAlunos;
	
	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}
	
	public void setQuantidadeAlunos(int quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}
	
	public double calculoSalario() {
		return getQuantidadeAlunos() * 20;
	}
}


