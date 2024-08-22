import java.util.Random;

public class Ex6 {

	public static void main(String[] args) {
		
		int x[] = new int[10];
		Random rd = new Random();
		boolean status;
		
		for (int i = 0; i < x.length;) {
			x[i] = rd.nextInt(x.length);
			status = false;
			for (int j = 0; j < i; j++) {
				if(x[i] == x[j]) {
					status = true;
					break;
				}
			}
			if (!status) {
				System.out.print(x[i] + " ");
				i++;
			}
		}

	}
	
}
