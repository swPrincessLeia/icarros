import java.util.Scanner;

public class Media {

public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		
		String nomeAluno;
		double nota1, nota2, nota3, nota4, media;
		
			
	
	System.out.println("Informe o nome do aluno:");
	nomeAluno=  in.nextLine();
	
	System.out.println("Informe suas notas");
	System.out.println("Nota 1:");
	nota1 = in.nextInt();
	System.out.println("Nota 2:");
	nota2 = in.nextInt();
	System.out.println("Nota 3:");
	nota3 = in.nextInt();
	System.out.println("Nota 4:");
	nota4 = in.nextInt();
	
	System.out.println("\nAluno: " + nomeAluno +
					   "\nNota 1: " +nota1+
					   "\nNota 2: " +nota2+
					   "\nNota 3: " +nota3+
					   "\nNota 4: " +nota4); 
	
	media= (nota1+nota2+nota3+nota4)/4;
	
	System.out.println("\nSua m�dia �: " + media );
					   
			
	if(media<5) {
		System.out.println("Aluno reprovado");		
	}else if(media==5) {
		System.out.println("Aluno em recupera��o");
	} else {
		System.out.println("Aluno aprovado");
	}
		 
	
	}

}


