import java.util.InputMismatchException;
import java.util.Scanner;

public class ProcessaTudo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		MousePreco mouse = new MousePreco();
		TecladoPreco teclado = new TecladoPreco();
		ImpressoraPreco impressora = new ImpressoraPreco();
		ScannerPreco scanner = new ScannerPreco();
		MonitorPreco monitor = new MonitorPreco();
		boolean repete = true;

		// do{} while() baseado nos exemplos dos colegas mostrado em aula!
		do {
			try {
				System.out.println("\nInforme a op��o desejada\n" + 
									"\n1 - Mouse" + 
								     "\n2 - Teclado" + 
									  "\n3 - Impressora"+ 
									   "\n4 - Scanner" +
										"\n5 - Monitor" + 
										 "\n6 - Sair");
				
				int opcaoMenu = entrada.nextInt();

				switch (opcaoMenu) {

				case 1:
					mouse.msgPrecoMouse();
					break;
				case 2:
					teclado.msgPrecoTeclado();
					break;
				case 3:
					impressora.msgPrecoImpressora();
					break;
				case 4:
					scanner.msgPrecoScanner();
					break;
				case 5:
					monitor.msgPrecoMonitor();
					break;
				case 6:
					System.out.println("\nPrograma ecerrado.");
					repete = false;
					break;
				default:
					System.out.println("\nOp��o inv�lida. Escolha uma op��o entre 1 e 6.");

				}
			} catch (InputMismatchException e) {
				System.out.println("Caractere inv�lido. Programa encerrado!");
				break;
			}
		} while (repete);
	}

}
