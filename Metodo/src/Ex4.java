import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double a, b, c, delta;
		double[] raiz;
		
		System.out.print("Informe o primeiro valor da equação: ");
		a = in.nextDouble();
		System.out.print("Informe o segundo valor da equação: ");
		b = in.nextDouble();
		System.out.print("Informe o terceiro valor da equação: ");
		c = in.nextDouble();
		
		in.close();
		
		delta = calcularDelta(a, b ,c);

		if (delta < 0) {
			System.err.println("A equação não possuí raiz real!");
		} else {
			raiz = calcularRaiz(a, b, delta);
			System.out.println("X1 = " + raiz[0]);
			System.out.println("X2 = " + raiz[1]);
		}
		
	}
	
	public static double calcularDelta (double a, double b, double c) {
		return Math.pow(b, 2) - 4 * a * c;
	}
	
	public static double[] calcularRaiz (double a, double b, double delta) {
		double[] raiz = new double[2];
		
		raiz[0] = (-b + Math.sqrt(delta))/(2 * a);
		raiz[1] = (-b - Math.sqrt(delta))/(2 * a);
		
		return raiz;
	}

}
