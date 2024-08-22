import java.util.Random;

public class Exemplo_RNG {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int x = rd.nextInt();
		int y = rd.nextInt(50);
		int z = rd.nextInt(10, 20);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
