
public class Print {
	
	public static void main(String[] args) {
		
	String nome, endereco, email, estado;		
	int idade;
	
	nome = "Ginanildo Vidal Marques";
	endereco = "Rua Deus me Chama, 1000";
	email = "giva@gama.com.br";
	estado = "sp";		
	idade = 35;
	
	
System.out.println("\nNome" + nome +
		"			\nEndereço: " + endereco+
					"\nIdade: " + idade +
					"\nEmail: " + email +
					"\nEstado: " + estado);

System.out.printf("\nNome: %s \nEndereço: %s \nIdade: %d \nEmail: %s \nEstado: %s" , nome, endereco, idade, email, estado); 

	}

}

