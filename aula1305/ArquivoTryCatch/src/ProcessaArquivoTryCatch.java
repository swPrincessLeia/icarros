import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/*
 * Utilize try catch para escrever fisicamente o arquivo Adicionar todos os
 * produtos numa lista.
 */


public class ProcessaArquivoTryCatch {
	
	public static void main(String[] args) {
		// asList, comentando em aula por algum colega
		List<String> produtos = Arrays.asList("Mouse", "Teclado", "Scanner", "Impressora", "Monitor");

		int dia = 13;
		int mes = 05;
		int ano = 2022;
		Date data = new Date(ano - 1900, mes - 1, dia);// n�o sei se seria a forma adequada
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String path = "C:\\Users\\danie\\Downloads\\Icarros\\icarros-aulas\\icarros1305\\ArquivoTryCatch\\produtos.txt";

		if (!new File(path).exists()) {

			try {

				FileWriter arquivo = new FileWriter(path);
				PrintWriter gravarArquivo = new PrintWriter(arquivo);

				gravarArquivo.printf("Produtos Cadastrados" + "\n" + sdf.format(data));
				for (int i = 0; i < produtos.size(); i++) {

					gravarArquivo.printf("\n" + produtos.get(i));

				}
				arquivo.close();				
				System.out.println("Arquivo gravado com sucesso!");
			} catch (IOException e) {
				System.out.println("Erro: � poss�vel que o nome do seu arquivo esteja errado.");

			}

		} else {
			System.out.println("Arquivo j� existe!");
		}
	}
}
