public class Teste1 {

	public static void main(String[] args) {
		int x = 10, y = 20, resultado = imprimir(x, y);
		
		
		System.out.println(resultado);
		imprimir(x, y); //Argumento
	}
	
	public static int imprimir(int a, int b) { //Parametro
		int resultado = a + b;
		return resultado;
	}

}
