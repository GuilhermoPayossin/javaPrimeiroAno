
public class Teste1 {

	public static void main(String[] args) {
		
		String a = "Hello world";
		char[] charA = a.toCharArray();
		
		for (char c : charA) {
			System.out.print(c);
		}
		
		System.out.println();
		
		System.out.println(a);
		
		System.out.println(a.charAt(4));
	}

}
