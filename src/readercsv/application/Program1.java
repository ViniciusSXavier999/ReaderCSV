package readercsv.application;

// LENDO ARQUIVO TEXTO ATRAVES DO FILE E SCANNER 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instanciei um objeto do tipo FILE que aponta para o caminho do arquivo
		File file = new File("C:\\Users\\ViniciusXavier\\Documents\\Leitor de CSV\\ReaderCSV\\in.txt");
		Scanner leia = null;

		try {
			leia = new Scanner(file);

			/*
			 * A função hasNextline vai retornar verdadeiro enquanto eu não chegar no fim do
			 * arquivo
			 * 
			 */
			while (leia.hasNextLine()) {
				System.out.println(leia.nextLine()); /*
														 * nextLine -> vai ler as linhas e posicionar o cursor do
														 * arquivo na proxima linha
														 *
														 * 
														 */
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());

		}

		// vai executar mesmo se der certo ou errado
		finally {

			// Caso o arquivo não exista
			if (leia != null) {
				leia.close();
			}
		}

	}

}
