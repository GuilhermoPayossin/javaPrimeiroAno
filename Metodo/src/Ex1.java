import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int x;

		System.out.print("Digite um valor inteiro e positivo: ");
		x = in.nextInt();
		do {
			if (x < 1) {
				System.err.print("Valor inválido! Digite novamente: ");
				x = in.nextInt();
			}
		} while (x < 1);
		
		in.close();
		
		imprimir(x);
		
	}
	
	public static void imprimir(int x) {
		System.out.print("Divisores: ");
		for (int i = -x; i <= x; i++) {
			if (i != 0 && x % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
