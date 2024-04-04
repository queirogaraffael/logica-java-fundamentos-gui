package exercicio1.application;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Programa informa se o número é positivo, negativo ou neutro");

		int valorEntrada = Integer.parseInt(JOptionPane.showInputDialog("Entrada: "));

		if (valorEntrada > 0) {
			JOptionPane.showMessageDialog(null, "Número positivo");
		} else if (valorEntrada < 0) {
			JOptionPane.showMessageDialog(null, "Número negativo");
		} else {
			JOptionPane.showMessageDialog(null, "Número Neutro");
		}

	}

}
