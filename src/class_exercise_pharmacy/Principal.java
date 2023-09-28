package class_exercise_pharmacy;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import class_exercise_classroom.Aluno;
import class_exercise_classroom.Disciplina;
import class_exercise_classroom.Professor;

public class Principal {
	private static ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public static void main(String[] args) {
		
		int op = 0;
		do {
			op = menu();
			switch (op) {
			case 1:
				 Medicamento m = new Medicamento();
				    m.cadastrar();
				    medicamentos.add(m);
				break;
			case 2:
				Pessoa p = new Pessoa();
			    p.cadastrar(medicamentos);
			    pessoas.add(p);
			    
				break;
			case 3:
                if (medicamentos.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não há medicamentos cadastrados.");
                } else {
                    Medicamento medicamentoEscolhido = Util.selecionaMedicamento(medicamentos);

                    if (!pessoas.isEmpty()) {
                        Pessoa pessoa = pessoas.get(pessoas.size() - 1);
                        pessoa.avaliarMedicamento(medicamentoEscolhido);
                    } else {
                        JOptionPane.showMessageDialog(null, "É necessário cadastrar pelo menos uma pessoa antes de avaliar.");
                    }
                }
                break;


			
			}
		}while(op != 4);
	}
	
	public static int menu() {
		String menu = "1 - Cadastrar Medicamento\n"
				+ "2 - Cadastrar Pessoas\n"
				+ "3 - Informa se o paciente pode tomar o remédio\n"
				+ "4 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}
		
		}

