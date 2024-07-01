package application;

import javax.swing.JOptionPane;

public class Delta {

	public static void main(String[] args) {
		double a, b, c, resultado;
		a = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o valor A: "));
		b = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o valor B: "));
		c = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o valor C: "));
		resultado = b*b-4*a*c;
		JOptionPane.showMessageDialog(null, "O resultado de delta é: " + resultado);
		
	}

}
