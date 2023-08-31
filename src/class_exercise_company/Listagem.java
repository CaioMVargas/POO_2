package class_exercise_company;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Listagem {

	public static void main(String[] args) {

		List<Contrato> funcionarios = new ArrayList();

		Contrato funcionario = new Contrato();

		String menu = "1 - Contratar Funcionário\n" + "2 - Listar quantidade de funcionários da empresa\n"
				+ "4 - Sair!";

		Integer op = 0;

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));

			if (op == 1) {

				funcionario.contratar();
				funcionarios.add(funcionario);

			}

			if (op == 2) {

				JOptionPane.showMessageDialog(null, "Total de funcionários: " + Contrato.getTotalFuncionarios().toString());

			}

			if (op != 1 && op != 2 && op != 3 && op != 4) {

				JOptionPane.showMessageDialog(null, "Opção não encontrada!");
				op = 4;
			}
		} while (op != 4);
	}
}