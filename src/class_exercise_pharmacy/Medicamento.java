package class_exercise_pharmacy;

import java.util.ArrayList;

import javax.swing.JOptionPane;

class Medicamento {
    private String nome;
    private int administracao;
    private ArrayList<String> contraindicacoes = new ArrayList<String>();
    private ArrayList<String> indicacoes = new ArrayList<String>(); 

    public Medicamento() {
        cadastrar();
    }

    public void cadastrar() {
        setNome(JOptionPane.showInputDialog("Nome do medicamento"));
        String menuAdm = "1 - Injetável \n"
                       + "2 - Tópico \n"
                       + "3 - Oral";
        administracao = Integer.parseInt(JOptionPane.showInputDialog(menuAdm));
        cadastrarContraindicacoes();
        cadastrarIndicacoes();
    }

    public void cadastrarContraindicacoes() {
        String contraIndicacao = JOptionPane.showInputDialog("Digite a contraindicação:");
        contraindicacoes.add(contraIndicacao); 
    }

    public void cadastrarIndicacoes() {
        String indicacao = JOptionPane.showInputDialog("Digite a indicação:");
        indicacoes.add(indicacao); 
    }

    public String exibirDados() {
        return getNome() + "(" + getAdministracao() + ") - " + getContraindicacoes() + " - " + getIndicacoes();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAdministracao() {
        return administracao;
    }

    public void setAdministracao(int administracao) {
        this.administracao = administracao;
    }

	public ArrayList<String> getContraindicacoes() {
		return contraindicacoes;
	}

	public void setContraindicacoes(ArrayList<String> contraindicacoes) {
		this.contraindicacoes = contraindicacoes;
	}

	public ArrayList<String> getIndicacoes() {
		return indicacoes;
	}

	public void setIndicacoes(ArrayList<String> indicacoes) {
		this.indicacoes = indicacoes;
	}
}
   
