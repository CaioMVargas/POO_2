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

				JOptionPane.showMessageDialog(null, "Funcionário " + nome + " contratado com sucesso!");
			} else {

				JOptionPane.showMessageDialog(null, "Funcionário " + nome + " não pode ser contratado devido à idade.");
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