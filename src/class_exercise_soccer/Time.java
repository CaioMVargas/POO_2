package class_exercise_soccer;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Time {
	
	private String nome;

	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	
	public void cadastrar() {
		setNome (JOptionPane.showInputDialog("Nome time"));
		String continua = "";
		do {
			Jogador j = new Jogador();
			j.cadastrar();
			jogadores.add(j);
			continua = JOptionPane
					.showInputDialog("Mais jogadores? S/N");
		}while(continua.equalsIgnoreCase("S"));
	}
	
	public String exibir() {
		String dados = "*** " + getNome() + "***\n";
		for(Jogador j: jogadores) {
			dados += j.exibir();
		}
		return dados;
	}
	
	public Jogador artilheiroCampeonato() {
		Jogador art = jogadores.get(0);
		for(Jogador j : jogadores ) {
			if(j.getGols() > art.getGols()) {
				art = j;
			}
		}
		return art;
}
	
	public int saldoGolTime() {
        int saldoGols = 0;
        for (Jogador j : jogadores) {
            saldoGols += j.getGols();
        }
        return saldoGols;
    }

    public static Time timeMaiorSaldoGols(ArrayList<Time> times) {
        Time timeMaiorSaldo = null;
        int maiorSaldo = 0;

        for (Time time : times) {
            int saldo = time.saldoGolTime();
            if (saldo > maiorSaldo) {
                maiorSaldo = saldo;
                timeMaiorSaldo = time;
            }
        }

        return timeMaiorSaldo;
    }
    
    public String exibirJogadores() {
        String dados = " Jogadores do Time " + getNome() + "\n";
        for (Jogador j : jogadores) {
            dados += j.exibir();
        }
        return dados;
    }
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}


	
	

}