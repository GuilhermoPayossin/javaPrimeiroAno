import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n1, n2;
		
		do {
			System.out.print("Digite um valor: ");
			n1 =  in.nextInt();
			System.out.print("Agora, digite um valor maior que o primeiro: ");
			n2 =  in.nextInt();
			
			if (n1 >= n2) {
				System.err.println("Valores inválidos! Digite os valores novamente");
			}
			
		} while (n1 >= n2);
		
		in.close();
		
		if (n2 <= n1) {
			System.err.println("Valores inválidos");
		} else {
			System.out.println("Os números impares entre os dois valores digitados são: ");
			while (n1 <= n2) {
				if (n1 % 2 == 1) {
					System.out.print(n1 + " ");
					n1++;
				}
			}
		}
	}
}