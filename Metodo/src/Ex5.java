import java.util.Random;

public class Ex5 {

	public static void main(String[] args) {
		/*																				*/
		/*Contexto: Popular um array usando uma função, imprimir os valores do array	*/
		/*com outra função e realizar uma inversão de valores, imprimir novamente os 	*/
		/*valores do array para confirmação.											*/		
		/*																				*/
		
		int[] array = new int[10];
		
		populateArray(array);
		
		System.out.println("Array populado: ");
		print(array);
		
		reverseArray(array);
		
		System.out.println("\nArray invertido: ");
		print(array);

	}
	
	//Não é necessário retorno de valores devido a propriedade de enviar apenas o endereço do array, não o valor em um endereço
	public static void populateArray (int[] array) {
		
		Random rd = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(10, 101);
		}
	}
	
	public static void reverseArray (int[] array) {
		int temp;
		
		for (int i = 0; i < array.length / 2; i++) {
			temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length -1 - i] = temp;
		}
	}
	
	public static void print (int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
