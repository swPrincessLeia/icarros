import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double valor1, valor2, resp;
		int op;
		
		try {
			
			do {

				System.out.println("\nDigite a op��o desejada" + 
									"\n1 - Adi��o " + 
									 "\n2 - Subtra��o " + 
									  "\n3 - Divis�o " +
									   "\n4 - Multiplica��o " + 
										"\n5 - Sair ");

				op = in.nextInt();
				if (op == 5) {

					System.out.println("\nAdeus!");
					break;
				} else {

					switch (op) {

					case 1:
						System.out.println("Soma\nDigite o Valor 1");
						valor1 = in.nextDouble();
						System.out.println("Digite o Valor 2");
						valor2 = in.nextDouble();
						resp = valor1 + valor2;
						System.out.println("Resposta: " + resp);
						break;

					case 2:
						System.out.println("Subtra��o\nDigite o Valor 1");
						valor1 = in.nextDouble();
						System.out.println("Digite o Valor 2");
						valor2 = in.nextDouble();
						resp = valor1 - valor2;
						System.out.println("Resposta: " + resp);
						break;

					case 3:
						System.out.println("Divis�o\nDigite o Valor 1");
						valor1 = in.nextDouble();
						System.out.println("Digite o Valor 2");
						valor2 = in.nextDouble();
						resp = valor1 / valor2;
						System.out.println("Resposta: " + resp);
						break;

					case 4:
						System.out.println("Multiplica��o\nDigite o Valor 1");
						valor1 = in.nextDouble();
						System.out.println("Digite o Valor 2");
						valor2 = in.nextDouble();
						resp = valor1 * valor2;
						System.out.println("Resposta: " + resp);
						break;
					case 5:
						System.out.println("Tchau!");
						break;
					default:
						System.out.println("\nOp��o de n�mero inv�lida!");

					}
				}

			} while (op!= 5);

		} catch (Exception e) {
			System.out.println("Voc� n�o digitou um n�mero. Programa encerrado! :/");
		}
	}
}
