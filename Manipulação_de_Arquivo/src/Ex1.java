import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex1 {
	public static void main(String[] args) {
		
		String linha;
		FileReader file;
		BufferedReader buffer;
		String[] aux;
		double media;
		
		try {
			file = new FileReader("aluno.txt");
			buffer = new BufferedReader(file);
			while((linha = buffer.readLine()) != null) {
				aux = linha.split(";");
				media = 0;
				for(int i = 1; i < aux.length; i++) {
					media += Double.parseDouble(aux[i]);
				}
				media = media / (aux.length - 1);
				System.out.println(aux[0]);
				System.out.println("Média = " + String.format("%.2f", media));
				if(media >= 6) {
					System.out.println("APROVADO");
				}
				else {
					System.out.println("REPROVADO");
				}
				System.out.println();	
			}
		}		
		catch (FileNotFoundException e) {
			System.err.println("Erro ao abrir o arquivo");
		} 
		catch (IOException e) {
			System.err.println("Erro ao ler dados do arquivo");
		}
	}
}