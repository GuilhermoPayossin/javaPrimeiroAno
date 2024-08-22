import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int x[] = new int[rd.nextInt(5, 12)];
		int temp;
		
		System.out.println("Desordenado");
		for (int i = 0; i < x.length; i++) {
			x[i] = rd.nextInt(51);
			System.out.print(x[i] + " ");
		}
		//-----------------------
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length - 1; j++) {
				if (x[j] > x[j + 1]) {
					temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;
				}
			}
		}
		//------------------------
		System.out.println("\nOrdenado");
		for (int i : x) {
			System.out.print(i + 1 + " ");
		}
	}
}
