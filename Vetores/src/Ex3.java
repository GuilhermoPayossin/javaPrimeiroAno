import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double[] x = new double[12];
		String[] y = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		double media = 0;
		
		for(int i = 0; i < x.length; i++) {
			System.out.println("Digite a temperatura media de " + y[i] + ": ");
			x[i] = in.nextDouble();
			
			media += x[i];
		}
		media /= x.length;
		
		System.out.println("A media de temperatura anual foi de: " + String.format("%.1f", media));
		
		for (int i = 0; i < y.length; i++) {
			if (x[i] > media) {
				System.out.println((i + 1) + " - " + y[i] + " | Temperatura: " + String.format("%.1f", x[i]));
			}
		}
		in.close();
	}

}
