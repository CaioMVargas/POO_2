package class_exercise_company;

import javax.swing.JOptionPane;

public class Contrato {
	private static Integer totalFuncionarios = 0;
	private static Integer idadeMinima = 18;

	private String nome;
	private Integer idade;

	public void contratar() {

		String continua = "";

		do {

			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));

			nome = JOptionPane.showInputDialog("Digite o nome:");

			if (idade >= idadeMinima) {

				totalFuncionarios++;

				JOptionPane.showMessageDialog(null, "Funcion�rio " + nome + " contratado com sucesso!");
			} else {

				JOptionPane.showMessageDialog(null, "Funcion�rio " + nome + " n�o pode ser contratado devido � idade.");
			}

			continua = JOptionPane.showInputDialog("Deseja contratar mais? S/N");

		} while (continua.toUpperCase().equals("S"));
	}

	public static Integer getTotalFuncionarios() {
		return totalFuncionarios;
	}

	public static Integer getIdadeMinima() {
		return idadeMinima;
	}
}