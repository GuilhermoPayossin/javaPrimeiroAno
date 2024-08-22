import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double media = 0;
		int qtd;
		
		
		System.out.print("Digite quantos funcionários serão registrados: ");
		qtd = in.nextInt();
		System.out.println("--------------------------------------------------");
		
		double x[] = new double[qtd];
		String nome[] = new String[qtd];
		
		for (int i = 0; i < x.length; i++) {
			in.nextLine();
			System.out.print("Digite o nome do funcionário: ");
			nome[i] = in.nextLine();
			System.out.print("Digite o salário do funcionário: ");
			x[i] = in.nextDouble();
			media += x[i];
			System.out.println("--------------------------------------------------");
		}
		in.close();
		
		media /= x.length;
		System.out.println("A média salarial dos funcionários é de R$" + String.format("%.2f", media));
	}

}
