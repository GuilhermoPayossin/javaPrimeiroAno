//Programa que exibir� um menu de op��es
//(1. Cadastrar, 2. Pesquisar, 3. Imprimir e 4. Finalizar) O programa dever� gerar uma lista de convidados

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;;

public class DesafioJanela {

	static String[] lista = new String[5];
	
	public static void main(String[] args) {
		
		int opcao;
		
		while(true) {
			opcao = parseInt(showInputDialog(menu()));
			if(opcao == 4) {
				break;
			}if(opcao < 1 || opcao > 4) {
				showMessageDialog(null, "Op��o inv�lida");
			}
		}
	}

	public static Object menu() {
		String aux = "";
		aux +="1. Cadastrar\n";
		aux +="2. Pesquisar\n";
		aux +="3. Imprimir\n";
		aux +="4. Finalizar\n";
		return aux;
	}
	
	
}
