import java.util.ArrayList;

public class BuscaDeContatos extends ListaDeContatos {
	//ia colocar tudo na mesma classe, mas vi um colega usar extends e aderir a ideia!\o/\o/

	public ArrayList<String> buscaContatos(String emailBusca) {
		
		// o legal seria criar uma classe de contatos e criar uma lista desse objeto :/
		ArrayList<String> listaContatos = new ArrayList<>();

		try {

			String query = "select * from icarros.contatos where email like '%" + emailBusca + "%'";

			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();

			while (this.resultset.next()) {

				String meuID = resultset.getString("id");
				String meuNome = resultset.getString("nome");
				int idade = resultset.getInt("idade");
				String email = resultset.getNString("email");
				String funcao = resultset.getString("funcao");
				// guarda cada tupla em uma String no array listaContatos
				String retornaRegistro = "\n " + "   Id: " + meuID + 
								         "\n " + "   Nome: " + meuNome + 
									     "\n " + "   Idade: " + idade +
										 "\n " + "   E-mail: " + email + 
										 "\n " + "   Função: " + funcao +"\n";

				listaContatos.add(retornaRegistro);
			}

		} catch (Exception e) {
			System.out.println("Erro" + e.getMessage());

		}
		//retorna uma lista de String com os contatos, onde cada registro é um elemento da lista, péssimo isso :/
		return listaContatos;
	}

}
