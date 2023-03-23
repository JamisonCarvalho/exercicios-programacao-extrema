// salvar como Exercicio14.java

import javax.swing.*;

class Exercicio14

{
	public static void main (String entrada[])
	{
		//declarações de variáveis
		int n1, n2, div;
		double pot;
		String msg = "";
		
		//processamento
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro", "Coleta de dados"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro","Coleta de dados"));
		
		//processamento
		div = (int)n1 / (int)n2;
		pot = Math.pow(n1,n2);
		
		//saída de dados
		msg = msg + "O quociente de " + n1 + " e " + n2 + " = " + div + "\n";
		msg = msg + "A potencia do " + n1 + " por " + n2 + " = " + pot + "\n";
		JOptionPane.showMessageDialog(null, msg);
		
		System.exit(0);
		
	}
}