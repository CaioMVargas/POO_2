package class_exercise;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import class_exercise.Car;

public class CadastroBusca {
	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<Car>();
		String menu = "1 - Cadastrar\n"
				+ "2 - Buscar por cor\n"
				+ "3 - Buscar por marca\n"
				+ "4 - Buscar por ano\n"
				+ "5 - Sair!";
		
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (op == 1) {
				Car c = new Car();
				c.cadastra();
				cars.add(c);
			}
			
			if (op == 2) {
			    String buscarCor = JOptionPane.showInputDialog(null, "Informe a cor do carro:");
			    String result = "Carros com a cor " + buscarCor + "\n\n";
			    Integer totalCarrosComCor = 0;
			    
			    for (Car c : cars) {
			        if (c.cor.equalsIgnoreCase(buscarCor)) {
			            result += c.exibirDados();
			            totalCarrosComCor++;
			        }
			    }
			    if (cars.size() > 0) {
			        double percentual = ((double) totalCarrosComCor / cars.size()) * 100;
			        result += "\nPercentual: " + percentual + "% dos carros têm a cor " + buscarCor;
			    }

			    JOptionPane.showMessageDialog(null, result);
			}
			
			if (op == 3) {
				String buscarMarca = JOptionPane.showInputDialog(null, "Informe a marca do carro:");
				String result = "Carros com a marca "+ buscarMarca +"\n\n";
				Integer totalCarrosMarca = 0;
				
				
				for(Car c: cars) {
				if(c.marca.equalsIgnoreCase(buscarMarca)) {
					result += c.exibirDados();
					totalCarrosMarca++;
					}
				}
				
				if (cars.size() > 0) {
			        double percentual = ((double) totalCarrosMarca / cars.size()) * 100;
			        result += "\nPercentual: " + percentual + "% dos carros têm a mesma marca " + buscarMarca;
			    }
				
				JOptionPane.showMessageDialog(null, result);
			}
			
			if (op == 4) {
				Integer buscarAno = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o ano de fabricação:"));
				String result = "Carros com o ano de fabricação "+ buscarAno +"\n\n";
				Integer totalCarrosAno = 0;
				
				for(Car c: cars) {
				if(c.anoDeFabricacao.equals(buscarAno)) {
					result += c.exibirDados();
					totalCarrosAno++;
					
					}
				}
				if (cars.size() > 0) {
			        double percentual = ((double) totalCarrosAno / cars.size()) * 100;
			        result += "\nPercentual: " + percentual + "% dos carros que tem a data de fabricação " + buscarAno;
			    } 
				
				JOptionPane.showMessageDialog(null, result);
			}
			
		}while(op != 5);
	}
}
