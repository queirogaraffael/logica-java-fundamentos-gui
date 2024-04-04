package exercicio3.application;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {

		// solicita ao usuário um valor de entrada
		int valorEntrada = Integer.parseInt(JOptionPane.showInputDialog("Entrada: "));

		// implementação do FOR
		StringBuilder valoresFor = new StringBuilder();

		for (int i = 0; i < valorEntrada; i++) {
			valoresFor.append("for: ").append(i).append("\n");
		}

		JOptionPane.showMessageDialog(null, valoresFor, "For", JOptionPane.INFORMATION_MESSAGE);

		// implementação do WHILE
		StringBuilder valoresWhile = new StringBuilder();
		int valorInicialWhile = 0;

		while (valorInicialWhile < valorEntrada) {
			valoresWhile.append("while: ").append(valorInicialWhile).append("\n");
			valorInicialWhile += 1;
		}

		JOptionPane.showMessageDialog(null, valoresWhile, "While", JOptionPane.INFORMATION_MESSAGE);

		// implementação do do-while
		StringBuilder valoresDoWhile = new StringBuilder();
		int valorInicialDoWhile = 0;

		do {
			valoresDoWhile.append("do-while: ").append(valorInicialDoWhile).append("\n");
			valorInicialDoWhile += 1;

		} while (valorInicialDoWhile < valorEntrada);

		JOptionPane.showMessageDialog(null, valoresDoWhile, "Do-While", JOptionPane.INFORMATION_MESSAGE);
	}

}
