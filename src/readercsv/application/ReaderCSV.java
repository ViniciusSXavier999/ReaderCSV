package readercsv.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.AlunoCSV;

public class ReaderCSV {

		public static void main(String[] args) {

			// Caminho do arquivo CSV 
			String arquivo = "C:\\Users\\ViniciusXavier\\Documents\\Leitor de CSV\\ReaderCSV\\alunos.csv";
			
			List<AlunoCSV> list = new ArrayList<AlunoCSV>();
			
			/*
			 * FileReader -> Em Java é uma classe que usamos para ler dados de um arquivo.
			 * 
			 * BufferedReader -> Ele gerencia a memoria para leitura, vai tratar a leitura de uma
			 * forma otimizada e mais rapida 
			 * 
			 * */
			
			// -------------------------------------------------------------------------------------
			
			
			// Utilizando o try with resources
			
			/*
			 * TRY WITH RESOURCES 
			 * 
			 * Ele permite declarar o bloco try ja instanciando os recursos na mesma linha do try e o que
			 * a gente instanciar de recurso nessa linha do try, vai ser desalocado de forma automatizada
			 * quando o escopo do try acabar 
			 * 
			 * */
			try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
				
				/*
				 * O método readLine() da classe Console em Java é usado para ler uma única 
				 * linha de texto do console.
				 * 
				 * */
				
				String line = br.readLine();
				line = br.readLine();
				while (line != null) {
					
					/*
					 * split analisa a string e recorta a string em partes  com base no que a gente 
					 * coloca entre as ""
					 * 
					 * */
					String[] vect = line.split(";");
					
					String nome = vect[0];
					Integer idade = Integer.parseInt(vect[1]);
					String sexo = vect[2];
					
					// Instanciando aluno para inserir na lista 
					AlunoCSV alunos = new AlunoCSV(nome, idade, sexo);
					
					// Inserindo alunos na lista 
					list.add(alunos);
					
					line = br.readLine();
				}	
				
				System.out.println("ALUNOS:");
				for (AlunoCSV p : list) {
					System.out.println(p);
				}
			}
			catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}

