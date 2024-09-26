import java.util.Random;

public class Ex7 {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		double average, deviation;
		
		fillArray(array);
		print(array);
		
		average = arrayAverage(array);
		System.out.println("\nMédia = " + average);
		
		deviation = standardDeviation(average, array);
		System.out.println("Desvio padrão = " + String.format("%.4f", deviation));

	}
	
	public static void fillArray (int[] array) {
		Random rd = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(10, 101);
		}
	}
	
	public static void print (int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
	
	public static double arrayAverage (int[] array) {
		double sum = 0;
		
		for (int i : array) {
			sum += i;
		}
		
		return sum / array.length;
		
	}
	
	public static double standardDeviation (double average, int[] array) {
		double sum = 0;
		
		for (int i : array) {
			sum += Math.pow(i - average, 2);
		}
		
		return Math.sqrt(sum / (array.length - 1));
	}
}
