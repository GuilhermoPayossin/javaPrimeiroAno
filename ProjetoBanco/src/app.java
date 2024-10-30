import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class app {
	static String[] cpf = new String[5];
	static String[] nome = new String[5];
	static double[] saldo = new double[5];
	
	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		int opcao;
		
		while (true) {
			try {
				opcao = parseInt(showInputDialog(montarMenu()));
				if (opcao == 6) {
					break;
				}		
				if (opcao < 1 || opcao > 6) {
					showMessageDialog(null, "Opção inválida");
				} else {
					switch(opcao) {
					case 1:
						abrirConta();
						break;
					case 2:
						sacar();
						break;
					case 3:
						depositar();
						break;
					case 4:
						consultarSaldo();
						break;
					case 5:
						fecharConta();
						break;
					}
				}
			} catch (NumberFormatException e) {
				showMessageDialog(null, "A opção deve ser um número");
			}
		}

	}
	
	private static String montarMenu() {
		StringBuilder builder = new StringBuilder();
		builder.append("Escolha uma operação:\n")
			   .append("1 - Abrir conta\n")
			   .append("2 - Sacar\n")
			   .append("3 - Depositar\n")
			   .append("4 - Consultar saldo\n")
			   .append("5 - Fechar conta\n")
			   .append("6 - Finalizar\n");
		return builder.toString();
	}
	
}
