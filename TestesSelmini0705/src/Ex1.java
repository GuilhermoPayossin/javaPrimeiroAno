import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double num, maiorNum = Integer.MIN_VALUE;
		
		for (int i = 0; i < 15; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor: ");
			num = in.nextDouble();
			if (num > maiorNum) {
				maiorNum = num;
			}
		}
		in.close();
		System.out.println("O maior número é " + String.format("%.0f", maiorNum));	
	}
}
