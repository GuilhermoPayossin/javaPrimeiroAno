import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int i = 0;
		String temp;
		
		while (i != 4) {
			System.out.println("Bem-vindo ao menu, escolha uma opção:");
			System.out.println("------------------||------------------");
			System.out.println("Opção 1: A Yasmin é linda");
			System.out.println("Opção 2: A Carol é linda");
			System.out.println("Opção 3: Lucas Bunda Mole");
			System.out.println("Opção 4: Sair");
			i = in.nextInt();
			if (i == 1) {
				System.out.println("Escolheu a primeira opção, precione qualquer tecla para voltar");
				temp = in.next();
				i = 0;
			} else if (i == 2) {
				System.out.println("Escolheu a segunda opção, precione qualquer tecla para voltar");
				temp = in.next();
			} else {
				System.out.println("Escolheu a terceira opção, precione qualquer tecla para voltar");
				temp = in.next();
			}
		}
		in.close();
	}

}
