import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double x1, x2, x3;
		
		System.out.print("Digite o primeiro valor do triângulo: ");
		x1 = in.nextDouble();
		System.out.print("Digite o segundo valor do triângulo: ");
		x2 = in.nextDouble();
		System.out.print("Digite o terceiro valor do triângulo: ");
		x3 = in.nextDouble();
		
		if (validar(x1, x2, x3) == true) {
			System.out.print("Os valores formam um triângulo");
			classificar(x1, x2, x3);
		} else {
			System.err.println("Os valores inseridos não formam um triangulo!");			
		}
		
	}
	public static boolean validar (double x1, double x2, double x3) {
			return (x1 < x2 + x3 && x2 < 1 + 3 && x3 < x1 + x2);
	}
	
	public static void classificar (double x1, double x2, double x3) {
		if (x1 == x2 && x2 == x3) {
			System.out.print(" equilatero");
		} else if (x1 == x2 || x2 == x3 || x1 == x3) {
			System.out.print(" isòceles");
		} else if (x1 != x2 && x2 != x3 && x1 != x3) {
			System.out.print(" escaleno");
		}
		
	}

}
