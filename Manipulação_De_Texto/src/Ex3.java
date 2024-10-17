import java.util.Random;
import java.util.Scanner;

public class Ex3 {
	//Recriação do jogo da forca
	
	static String[] words = {"JAVA", "FIAP", "NEXT", "ROBO"};
	static char[] foundLetters;
	static String hiddenWord;
	static char letter;
	static int misses = 0;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Random rd = new Random();
		
		/*System.out.print("Digite suas palavras: ");
		for (int i = 0; i < words.length; i++) {
			words[i] = in.next().toUpperCase();
		}*/
		
		hiddenWord = words[rd.nextInt(words.length)];
		foundLetters = new char[hiddenWord.length()];
		for (int i = 0; i < foundLetters.length; i++) {
			foundLetters[i] = '_';
		}
		
		while (misses < 6 && !solved()) {
			System.out.print("A palavra é: ");
			for (char c : foundLetters) {
				System.out.print(c + " ");
			}
			
			System.out.print("\nDigite uma Letra: ");
			letter = in.next().toUpperCase().charAt(0);
			
			if (!verify()) {
				misses++;
				System.err.println("Você errou pela " + misses + "° vez, ainda resta(m) " + (6 - misses) + " tentativa(s)");
			}
			System.out.println();	
		}
		in.close();
	}

	public static boolean verify() {
		boolean found = false;
		for (int i = 0; i < hiddenWord.length(); i++) {
			if (letter == hiddenWord.charAt(i)) {
				foundLetters[i] = letter;
				found = true;
			}
		}
		return found;
	}

	public static boolean solved() {
		for (char c : foundLetters) {
			if (c == '_') {
				return false;
			}
		}
		return true;
	}

}