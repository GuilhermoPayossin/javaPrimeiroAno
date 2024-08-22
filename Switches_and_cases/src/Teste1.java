import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n, s;
		
		System.out.println("Escolha uma opção:\n1 = if-else\n2 = switch-case\n3=?");
		s = in.nextInt();
		
		System.out.println("Digite um valor inteiro");
		n = in.nextInt();
		n = n % 2;
		
		switch (s) {
			case 1:
				
				if (n == 0) {
					System.out.println("Par");
				} else {
					System.out.println("Ímpar");
				}
				
				break;
			case 2:
				
				switch (n) {
					case 0:
						System.out.println("Par");
						break;
					default:
						System.out.println("Ímpar");
						break;
				}
				
				break;
			case 3:
				
				System.out.println((n == 0) ? "Par" : "Ímpar");
				
				break;
			default:
				System.err.println("Comando inválido");
				break;	
		}
		in.close();
	}
}