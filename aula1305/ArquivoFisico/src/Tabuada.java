import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int multiplicando, multiplicador;
        //entregar
		String path = "C:\\Users\\danie\\Downloads\\Icarros\\icarros-aulas\\icarros1305\\ArquivoFisico\\tabuada.txt";
		FileWriter arquivo = new FileWriter(path);
		PrintWriter gravarArquivo = new PrintWriter(arquivo);

		for (int resposta = 0; resposta < 100; resposta++) {

			for (multiplicando = 1; multiplicando <= 10; multiplicando++) {
				gravarArquivo.printf("\nTabuada do %d ", multiplicando);
				for (multiplicador = 0; multiplicador <= 10; multiplicador++) {
					resposta = multiplicando * multiplicador;
					gravarArquivo.printf("\n %d * %d  = %d", multiplicando, multiplicador, resposta);
				}
			}

		}

		arquivo.close();

	}
}