import java.util.ArrayList;

public class ListaDeContatos extends ConexaoBD {
	//ia colocar tudo na mesma classe, mas vi um colega usar extends e aderi a ideia!\o/\o/

	public ArrayList<String> listaContatos() {

		// o legal seria criar uma classe de contatos e criar uma lista desse objeto :/
		ArrayList<String> listaContatos = new ArrayList<>();

		try {
			String query = "select * from icarros.contatos";
			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();

			while (this.resultset.next()) {

				String id_contatos = resultset.getString("id");
				String nome_contatos = resultset.getString("nome");
				int idade_contatos = resultset.getInt("idade");
				String email_contatos = resultset.getNString("email");
				String funcao_contatos = resultset.getString("funcao");
				// guarda cada tupla em uma String no array listaContatos
				String retornaRegistro = "\n " + "   Id: " + id_contatos + 
										 "\n " + "   Nome: " + nome_contatos + 
										 "\n " + "   Idade: " + idade_contatos +
										 "\n " + "   E-mail: " + email_contatos + 
										 "\n " + "   Fun��o: " + funcao_contatos +"\n";

				listaContatos.add(retornaRegistro);
			}

		} catch (Exception e) {
			System.out.println("Erro" + e.getMessage());

		}
		//retorna uma lista de String com os contatos, onde cada registro � um elemento da lista
		return listaContatos;

	}

}
