import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[][]x = new int [3][3];
		
		//entrada de dados
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print("Digite um valor: ");
				x[i][j] = in.nextInt();				
			}	
		}
		in.close();
		//impressão no formato tabular
		
		System.out.println();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print(x[i][j] + "\t");
			}		
			System.out.println();
		}
		
	}

}
