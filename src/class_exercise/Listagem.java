package class_exercise;

import javax.swing.JOptionPane;

import class_exercise.Car;

public class Listagem {
	public static void main(String[] args) {
int n = Integer.parseInt(JOptionPane.showInputDialog("Qtd carros"));
		
		Car cars[] = new Car[n];
		
		String listagem = "";
		
		for (int i = 0; i < n; i++) {
			Car c = new Car();
			c.cadastra();
			cars[i] = c;
			listagem += c.exibirDados();
		}
		JOptionPane.showMessageDialog(null, listagem);
	}
}
