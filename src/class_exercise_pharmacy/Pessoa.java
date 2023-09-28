package class_exercise_pharmacy;

import java.util.ArrayList;

import javax.swing.JOptionPane;

class Pessoa {
    private String nome;
    private String sintoma;
    private Medicamento medicamentos;
    private ArrayList<String> condicaosaude = new ArrayList<String>();
    
    public void cadastrar(ArrayList<Medicamento> medicamentos) {
        setNome(JOptionPane.showInputDialog("Informe o nome:"));
        setSintoma(JOptionPane.showInputDialog("Informe o sintoma"));
        cadastrarCondicaoSaude();
    }
    
    public void cadastrarCondicaoSaude() {
        String condicaoSaude = JOptionPane.showInputDialog("Digite a contraindica��o:");
        condicaosaude.add(condicaoSaude);
    }

    public void avaliarMedicamento(Medicamento medicamento) {
        if (medicamento.getIndicacoes().contains(getSintoma())) {
            for (String condicao : getCondicaosaude()) {
                if (medicamento.getContraindicacoes().contains(condicao)) {
                    JOptionPane.showMessageDialog(null, "N�o � aconselh�vel tomar esse medicamento devido � condi��o de sa�de.");
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "� seguro tomar esse medicamento.");
        } else {
            JOptionPane.showMessageDialog(null, "Esse medicamento n�o � indicado para o sintoma apresentado.");
        }
    }
    
    public String exibirDados() {
        return getNome() + "(" + getSintoma() + ")" + getMedicamentos().exibirDados();
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}



	public Medicamento getMedicamentos() {
		return medicamentos;
	}



	public void setMedicamentos(Medicamento medicamentos) {
		this.medicamentos = medicamentos;
	}

	public ArrayList<String> getCondicaosaude() {
		return condicaosaude;
	}

	public void setCondicaosaude(ArrayList<String> condicaosaude) {
		this.condicaosaude = condicaosaude;
	}


	
	
	
	
}
