import java.util.Scanner;

public class Ex1_Alt {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String i;
		
		System.out.print("Digite uma letra: ");
		i = in.next().toLowerCase();
		
		switch (i) {
			case "a", "e", "i", "o", "u":
				System.out.println("Sua letra é uma vogal");
				break;
			default:
				System.out.println("Sua letra não é uma vogal");
				break;
		}
		
		/* OU 
		 * switch (i) {
		 * 	case "a":
		 * 	case "e":
		 * 	case "i":
		 * 	case "o":
		 * 	case "u":
		 * 		System.out.println("Sua letra é uma vogal");
		 * 		break;
		 * 	default:
		 * 		System.out.print("Sua letra não é uma vogal");
		 * }*/
		
		in.close();
	}

}