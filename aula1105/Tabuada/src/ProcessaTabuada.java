import java.util.Scanner;

public class ProcessaTabuada {

	public static void main(String[] args) {

		int multiplicando, multiplicador, resp;
		Scanner in = new Scanner(System.in);

		System.out.println("\nExerc�cio 1: Digitar um n�mero e retornar a tabuada:");
		System.out.println("\nDigite o n�mero o qual deseja saber a tabuada");
		multiplicando = in.nextInt();

		System.out.println("\nTabuada do n�mero " + multiplicando + " �: \n");

		for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
			resp = multiplicando * multiplicador;
			System.out.println(multiplicando + " * " + multiplicador + " = " + resp);
		}

		System.out.println("\nExerc�cio 2: informar um n�mero de 1 a 9 e retornar a tabuada:");
		System.out.println("\nDigite um numero entre 1 e 9: ");
		multiplicando = in.nextInt();

		if (multiplicando > 0 && multiplicando < 10) {

			for (multiplicador = 0; multiplicador <= 10; multiplicador++) {
				resp = multiplicando * multiplicador;
				System.out.println(multiplicando + " * " + multiplicador + " = " + resp);
			}

		} else {
			System.out.println("\nErro: n�mero digitado n�o est� entre 1 e 9.");
		}

		System.out.println("\nExerc�cio 3: tuabuada do 1 at� 10:");
		System.out.println("\nTabuada de 1 at� 10:");

		for (multiplicando = 1; multiplicando <= 10; multiplicando++) {
			System.out.println("\nTabuada do " + multiplicando);
			for (multiplicador = 0; multiplicador <= 10; multiplicador++) {
				System.out.println(multiplicando + " * " + multiplicador + " = " + multiplicando * multiplicador);
			}
		}
	}
}
