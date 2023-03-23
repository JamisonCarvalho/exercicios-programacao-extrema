
public class Principal {

	public static void main(String[] args) {

		String nome = "Jamison";
		String sobreNome = "Carvalho";
		String nomeGuerra = "Jamison";
		String sobrenome = new String("Jamison");
		
		if (nome == nomeGuerra)
			System.out.println("Nomes iguais");
		else
			System.out.println("Nomes diferentes");
		
		if (nome == sobrenome)
			System.out.println("Nomes iguais");
		else
			System.out.println("Nomes diferentes");
		
		// Usando o objeto de comparação EQUALS
		if (nome.equals(nomeGuerra))
			System.out.println("Nomes iguais");
		else
			System.out.println("Nomes diferentes");
		
		if (nome.equals(sobrenome))
			System.out.println("Nomes iguais");
		else
			System.out.println("Nomes diferentes");
	
		System.out.println("");
		System.out.println("----- SÓ PRA SEPERAR O CONTEÚDO -----");
		System.out.println("");
		String nomeC = "Jamison Carvalho";
		
		System.out.println(nomeC);
		// mostra o número de caracteres da string
		System.out.println(nomeC.length());
		
		// deixa toda a string minúscula
		System.out.println(nomeC.toLowerCase());
		
		// deixa toda a string maiúscula
		System.out.println(nomeC.toUpperCase());
		
		// pega o caracteres na posição desejado da string "so botar o numero do caracter entre parenteses"
		System.out.println(nomeC.charAt(2));
		
		// ver se a string está vazia
		System.out.println(nomeC.isEmpty());
		
		// ver a posição
		System.out.println(nomeC.indexOf("son"));
		
		// verifica se existe 
		System.out.println(nomeC.contains("son"));
		
		// concatena as strings
		System.out.println(nomeC.concat(" dos Santos"));
		
		// compara o conteúdo
		System.out.println(nomeC.equals("jamison carvalho"));
		
		//compara o conteúdo ignorando se é maiúscula ou minúscula
		System.out.println(nomeC.equalsIgnoreCase("jamison carvalho"));
		
		System.out.println("");
		System.out.println("----- SÓ PRA SEPERAR O CONTEÚDO -----");
		System.out.println("");
		
		// StringBuffer
		
		String nomeCompleto = nome + "" + sobreNome;
		String nomeComBuffer;
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(nome);
		buffer.append(sobreNome);
		
		nomeComBuffer = buffer.toString();
		
		System.out.println(nomeComBuffer);
		
		// StringBuilder
		
		System.out.println("");
		System.out.println("----- SÓ PRA SEPERAR O CONTEÚDO -----");
		System.out.println("");
				
		StringBuilder builder = new StringBuilder();
			
		nomeComBuffer = buffer.toString();
		
		System.out.println(nomeComBuffer);
		
	}

}
