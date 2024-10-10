import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		//Realizar um programa para criptogração em cifra de César
		
		Scanner in = new Scanner(System.in);
		String word, encrypted;
		int rotation;
		
		System.out.print("Digite a palavra que será criptografada: ");
		word = in.next();
		System.out.print("Digite a quantidade de rotações que seram feitas: ");
		rotation = in.nextInt();
		
		in.close();
		
		System.out.println("Palavra antes da criptografia: " + word);
		encrypted = rotacionar(word, rotation);
		System.out.println("Palavra criptografada:" + encrypted);
		
	}
	
	public static String rotacionar (String word, int rotation) {
		char letter, encryptedLetter;
		String encryptedWord = "";
		
		for (int i = 0; i < word.length(); i++) {
			letter = word.charAt(i);
			if (Character.isUpperCase(letter)) {
				encryptedLetter = (char)((letter - 'A' + rotation) % 26 + 'A');
				encryptedWord += encryptedLetter;
			} else if (Character.isLowerCase(letter)) {
				encryptedLetter = (char)((letter - 'a' + rotation) % 26 + 'a');
				encryptedWord += encryptedLetter;
			}
		}
		return encryptedWord;
	}
}
