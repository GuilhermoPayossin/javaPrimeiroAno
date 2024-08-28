import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {
		
		int[][] x = new int[4][4];
		Random rd = new Random();
		int ds = 0, dp = 0;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j] = rd.nextInt(1, 30);				
			}	
		}
		
		System.out.println();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print(x[i][j] + "\t");
			}		
			System.out.println();
		}
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				if (i == j) {
					dp += x[i][j]; // OU dp += x[i][i]
				}
				
				if (i + j == x.length - 1) {
					ds += x[i][j];
					}
				
			}
		
		}
		System.out.print("\tDP: " + dp + " | DS: " + ds);
	}

}
