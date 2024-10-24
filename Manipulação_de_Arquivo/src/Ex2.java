import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex2 {

	public static void main(String[] args) {
		
		String linha;
		FileReader file;
		BufferedReader buffer;
		String[] aux;
		double a, b, c;
		int equilatero = 0, escaleno = 0, isoceles = 0, naoTriangulo = 0;
		
		try {
			file = new FileReader("dados.txt");
			buffer = new BufferedReader(file);
			while ((linha = buffer.readLine()) != null) {
				aux = linha.split(";");
				a = Double.parseDouble(aux[0]);
				b = Double.parseDouble(aux[1]);
				c = Double.parseDouble(aux[2]);
				
				if (a < b + c && b < a + c && c < a + b) {
					if (a == b && b == c) {
						equilatero++;
					} else if (a == b && a == c && b == c) {
						isoceles++;
					} else {
						escaleno++;
					}
				} else {
					naoTriangulo++;
				}
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("Erro ao encontrar o arquivo");
		} catch (IOException e) {
			System.err.println("Erro ao ler o arquivo");
		}
		
		System.out.println("Total de triângulos equilateros: " + equilatero);
		System.out.println("Total de triângulos isoceles: " + isoceles);
		System.out.println("Total de triângulos escalenos: " + escaleno);
		System.out.println("Total de não triângulos: " + naoTriangulo);

	}

}
