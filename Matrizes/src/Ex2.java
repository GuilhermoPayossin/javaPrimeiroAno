import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {

		int[][] x = new int[10][10];
		Random rd = new Random();
		int maior = 0;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j] = rd.nextInt(50);
				System.out.print(x[i][j] + "\t");
				if (x[i][j] > maior) {
					maior = x[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.print("Maior = " + maior + " | Indice(s): ");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				if (x[i][j] == maior) {
					System.out.print("[" + i + ", " + j + "]");
				}
			}
		}

	}

}
