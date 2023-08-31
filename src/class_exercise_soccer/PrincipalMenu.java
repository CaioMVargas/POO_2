package class_exercise_soccer;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class PrincipalMenu {

    public static void main(String[] args) {

        ArrayList<Time> times = new ArrayList<>();

        ArrayList<Jogador> jogadores = new ArrayList<>();

        Time time = new Time();

        String menu = "1 - Cadastrar Jogador\n"
                + "2 - Buscar jogador artilheiro\n"
                + "3 - Buscar Time com mais gols\n"
                + "4 - Listar todos os jogadores de um time\n"
                + "5 - Sair!";

        int op = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (op == 1) {

                time.cadastrar();
                times.add(time);
            }

            if (op == 2) {
                Jogador artilheiro = time.artilheiroCampeonato();

                JOptionPane.showMessageDialog(null, "O jogador com mais gols do campeonato é: " + artilheiro.getNome() + " com " + artilheiro.getGols() + " gols.");
            }

            if (op == 3) {
                Time timeComMaiorSaldo = time.timeMaiorSaldoGols(times);
                int maiorSaldo = 0;

                for (Time t : times) {
                    int saldo = t.saldoGolTime();
                    if (saldo > maiorSaldo) {
                        maiorSaldo = saldo;
                        timeComMaiorSaldo = t;
                    }
                    JOptionPane.showMessageDialog(null, "O Time com mais gols no campeonato: " + timeComMaiorSaldo.getNome());
                }

            }

            if (op == 4) {

                String result = new String();

                for (Time t : times) {

                    result += t.exibirJogadores();
                }

                JOptionPane.showMessageDialog(null, result);
            }

        } while (op != 5);
    }
}