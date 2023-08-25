package class_exercise;


import javax.swing.JOptionPane;

public class Car {
	
	String marca;
	Integer anoDeFabricacao;
	String cor;
	
	
	void cadastra() {
		while (marca == null || marca.equalsIgnoreCase("")) {
            marca = JOptionPane.showInputDialog("Informe a marca:");
            	if (marca.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Preencha os campos corretamente!");
            }
        }
		while (anoDeFabricacao == null || anoDeFabricacao == 0) {
			anoDeFabricacao = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de fabricação:"));
            	if (anoDeFabricacao == null || anoDeFabricacao == 0) {
                JOptionPane.showMessageDialog(null, "Preencha os campos corretamente!");
            }
        }
		while (cor == null || cor.equalsIgnoreCase("")) {
			cor = JOptionPane.showInputDialog("Informe a cor:");
            	if (cor.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Preencha os campos corretamente!");
            }
        }
	}
	String exibirDados() {
		return marca + " - " + anoDeFabricacao + " - " + cor +"\n";
	}
}
