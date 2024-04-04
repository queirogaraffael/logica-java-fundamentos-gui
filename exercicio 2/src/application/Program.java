package exercicio2.application;

import javax.swing.JOptionPane;

import exercicio2.constantes.DiasDaSemana;

public class Program {

	public static void main(String[] args) {
		int valorEntrada = Integer.parseInt(JOptionPane.showInputDialog("Entrada: "));
		String dia = "";
		
		switch (valorEntrada) {
		case DiasDaSemana.DOMINGO:
			dia = "Domingo";
			break;
		case DiasDaSemana.SEGUNDA:
			dia = "Segunda";
			break;
		case DiasDaSemana.TERCA:
			dia = "Terça";
			break;
		case DiasDaSemana.QUARTA:
			dia = "Quarta";
			break;
		case DiasDaSemana.QUINTA:
			dia = "Quinta";
			break;
		case DiasDaSemana.SEXTA:
			dia = "Sexta";
			break;
		default:
			dia = "Sábado";
			break;

		}

		JOptionPane.showMessageDialog(null, dia, "Dia da semana:", JOptionPane.INFORMATION_MESSAGE);

	}

}
