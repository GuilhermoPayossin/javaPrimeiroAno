import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[]x = new int[10];
		int cont = 0;
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("Digite o valor " + (i + 1) + ": ");
			x[i] = in.nextInt();
			
			if (x[i] % 2 == 0) {
				cont++;
			}
		}
	System.out.println(cont + " valores são pares e " + (x.length - cont) + " são impares");
		in.close();

	}

}
