import java.util.Random;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner in = new Scanner(System.in);
		int linha, coluna;
		
		System.out.print("Digite a quantidade de linhas: ");
		linha = in.nextInt();
		System.out.print("Digite a quantidade de colunas: ");
		coluna = in.nextInt();
		
		in.close();
		
		int[][] x = new int[linha][coluna];
		int[][] y = new int[coluna][linha];
		
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				x[i][j] = rd.nextInt(0, 101);
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < coluna; i++) {
			for (int j = 0; j < linha; j++) {
				y[i][j] = x[j][i];
				System.out.print(y[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
