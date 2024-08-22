import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[]x = new int[10];
		int maior = Integer.MIN_VALUE, menor = 0;
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("Digite o valor " + (i + 1));
			x[i] = in.nextInt();
			
			if (x[i] > maior) {
				maior = x[i];
			}
			
			if (i == 0 || x[i] < menor) {
				menor = x[i];
			}
		}
		System.out.println("Maior valor = " + maior);
		System.out.println("Menor valor = " + menor);
		in.close();
	}

}
