
import java.util.Scanner;

public class ProcessaNotas {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String[] alunos = new String[3];
		Double[] prova1 = new Double[3], prova2 = new Double[3], media = new Double[3];

		System.out.println("\nExerc�cio 5: Calcular a m�dia das provas");

		for (int i = 0; i < alunos.length; i++) {
			
			System.out.println("Informe o nome do aluno:");
			alunos[i] = in.nextLine();

			System.out.println("Informe suas notas");

			System.out.println("Prova 1:");
			prova1[i] = in.nextDouble();
			System.out.println("Prova 2:");
			prova2[i] = in.nextDouble();
			media[i] = (prova1[i] + prova2[i])/2;
			in.nextLine();
		}
		
		for (int i = 0; i < alunos.length; i++) {
			if (media[i] > 7) {
				System.out.println("\nAluno: " + alunos[i] + 
								    "\nNota 1: " + prova1[i] + 
								     "\nNota 2: " + prova2[i] +
									  "\nM�dia final: " + media[i] + 
									   "\nParab�ns aprovado!");
			} else {
				System.out.println("\nAluno: " + alunos[i] + 
						            "\nNota 1: " + prova1[i] + 
						             "\nNota 2: " + prova2[i] +
						              "\nM�dia final: " + media[i] + 
						               "\nReprovado, estude mais!");
		
				}
			}
		
		
		}
	}

