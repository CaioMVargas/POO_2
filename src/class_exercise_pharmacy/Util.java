package class_exercise_pharmacy;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Util {
	public static Medicamento selecionaMedicamento(ArrayList<Medicamento> lista) {
	    String menuMed = "";
	    int cont = 1;
	    for (Medicamento m : lista) {
	        menuMed += cont + " - " + m.getNome() + "\n";
	        cont++;
	    }
	    int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuMed));
	    return lista.get(escolha - 1);
	}

}
