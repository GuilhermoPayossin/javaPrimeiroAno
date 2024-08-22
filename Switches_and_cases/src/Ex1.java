import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String i;
		
		System.out.print("Digite uma letra: ");
		i = in.next().toLowerCase();
		
		if (i.equals("a") || i.equals("e") || i.equals("i") || i.equals("o") || i.equals("u")) {
			System.out.println("Sua letra é uma vogal");
		} else {
			System.out.println("Sua letra não é uma vogal");
		}
		
		in.close();
	}

}