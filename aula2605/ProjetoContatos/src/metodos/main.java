package metodos;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.List;

import objetos.Contato;

public class main {

	public static void main(String[] args) {

		CRUDContato crud = new CRUDContato();
		crud.Conectar();

		// ________________________________________________________________________________________
		// Iserir vários nomes
		// ________________________________________________________________________________________

		
	/*	List<String> listaNomes = Arrays.asList("Joana", "Matheus", "Thales", "Thaís", "Lucas", "Daniela", "Caio",
				"Lucas", "Carina", "Ricardo", "Noa");

		for (String nome : listaNomes) {

			String teste = Normalizer.normalize(nome, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
			crud.inserirContato(nome, 25, teste.toLowerCase() + "@icarros.com.br", "Desenvolvedor");
		}
		
	*/	
		for(Contato c: crud.listarTodosContatos()) {
		
			System.out.println("\nID: " + c.getIdContato() +
					            "\nNome: " + c.getNomeContato()+
				                 "\nIdade: " + c.getIdadeContato()+
				                  "\nE-mail: " + c.getEmailContato()+
				                   "\nFunção: " + c.getFuncaoContato());
													
		}
		

		// ________________________________________________________________________________________
		// Teste crud
		// ________________________________________________________________________________________

		// crud.editarContato("19", null, 0, null, null);
		//crud.inserirContato("Princess Leia", 0, null, null);
		// crud.excluirContato("2");
		// crud.reiniciarAutoIncrementoId();
		// crud.PesquisarContato("leia");

		// ________________________________________________________________________________________
		// Deletar vários registros
		// ________________________________________________________________________________________

		
		
		/*for (int i = 0; i <= 200; i++) {

			String num = Integer.toString(i);
			crud.excluirContato(num);

		}
		*/

	}

}
