import java.util.Random;

public class Ex6 {

	public static void main(String[] args) {

		int[][] array = new int[4][4];
		int[] highest;
		
		populateArray(array);
		
		System.out.print("Matriz populada: ");
		System.out.println();
		print(array);
		
		highest = highestValuePerLine(array);
		System.out.print("Maior valor em cada linha: ");
		print(highest);
		
		highestValuePerLine(array);
		
	}
	
	public static void print (int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void print (int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
	
	public static void populateArray (int[][] array) {
		Random rd = new Random();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = rd.nextInt(10, 101);
			}
		}
	}
	
	public static int[] highestValuePerLine (int[][] array) {
		int[] highest = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			highest[i] = Integer.MIN_VALUE;
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] > highest[i]) {
					highest[i] = array[i][j];
				}
			}
		}
		return highest;
	}
}