import java.util.Random;

public class Ex6 {

	public static void main(String[] args) {

		int[][] array = new int[4][4];
		int[] highest;
		
		populateArray(array);
		
		System.out.print("Matriz populada: ");
		print(array);
		
		highest = highestValuePerLine(array);
		print(maior);
		
		System.out.println("Maior valor em cada linha: ");
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
	
	public static void populateArray (int[][] array) {
		Random rd = new Random();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = rd.nextInt(10, 101);
			}
		}
	}
	
	public static void highestValuePerLine (int[][] array) {
		int highest;
		
		for (int i = 0; i < array.length; i++) {
			highest = array[i][0];
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] > highest) {
					System.out.println("Maior valor na linha " + (i + 1) + " localizado no índicie " + i + ", " + j);
				}
			}
		}
	}
}
