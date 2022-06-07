package metodos;

import java.sql.SQLException;
import java.util.ArrayList;

import objetos.Contato;

public class CRUDContato extends ConexaoBD {

	// ________________________________________________________________________________________
	// M�todo para inserir um registro, todos os campos s�o not null
	// ________________________________________________________________________________________
	public void inserirContato(String nome, int idade, String email, String funcao) {

		try {
			String query = "insert into contatos(nome, idade, email, funcao) values('" + nome + "', " + idade + ",'"
					+ email + "','" + funcao + "');";
			this.statement.executeUpdate(query);

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

	// ________________________________________________________________________________________
	// M�todo para atualizar registro
	// ________________________________________________________________________________________
	public void editarContato(String id, String nome, int idade, String email, String funcao) {

		try {

			String query = "update contatos set nome='" + nome + "', idade=" + idade + ", email='" + email
					+ "', funcao='" + funcao + "'where id=" + id + ";";
			this.statement.executeLargeUpdate(query);

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());

		}

	}

	// ________________________________________________________________________________________
	// M�todo para excluir um registro
	// ________________________________________________________________________________________
	public void excluirContato(String id) {

		try {
			String query = "delete from contatos where id=" + id + ";";
			this.statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());

		}

	}

	// ________________________________________________________________________________________
	// M�todo que lista todos os registros
	// ________________________________________________________________________________________

	public ArrayList<Contato> listarTodosContatos() {

		ArrayList<Contato> lista = new ArrayList<Contato>();
		String id, nome, email, funcao;
		int idade;

		try {
			String query = "select * from icarros.contatos";
			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();

			while (this.resultset.next()) {

				id = resultset.getString("id");
				nome = resultset.getString("nome");
				idade = resultset.getInt("idade");
				email = resultset.getNString("email");
				funcao = resultset.getString("funcao");

				Contato c = new Contato(id, nome, idade, email, funcao);

				lista.add(c);
			}

		} catch (Exception e) {
			System.out.println("Erro" + e.getMessage());

		}

		return lista;

	}

	// ________________________________________________________________________________________
	// M�todo que lista todos os registros
	// ________________________________________________________________________________________

	public ArrayList<Contato> PesquisarContato(String substring) {

		ArrayList<Contato> lista = new ArrayList<Contato>();
		String id, nome, email, funcao;
		int idade;

		try {
			String query = "select * from icarros.contatos where email like '%" + substring + "%' "
					+ "or funcao like '%" + substring + "%'"
					+ "or nome like '%" + substring + "%'"
					+ "or idade like '%" + substring + "%'";

			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();
			while (this.resultset.next()) {

				id = resultset.getString("id");
				nome = resultset.getString("nome");
				idade = resultset.getInt("idade");
				email = resultset.getNString("email");
				funcao = resultset.getString("funcao");

				Contato c = new Contato(id, nome, idade, email, funcao);

				lista.add(c);
			}

		} catch (Exception e) {
			System.out.println("Erro" + e.getMessage());

		}

		return lista;

	}

	
	// ________________________________________________________________________________________
		// M�todo que lista todos os registros
		// ________________________________________________________________________________________

		public ArrayList<Contato> PesquisarID(String id) {

			ArrayList<Contato> lista = new ArrayList<Contato>();
			String idCont, nome, email, funcao;
			int idade;

			try {
				String query = "select * from icarros.contatos where id="+id+";";
						
				this.resultset = this.statement.executeQuery(query);
				this.statement = this.connection.createStatement();
				while (this.resultset.next()) {

					idCont = resultset.getString("id");
					nome = resultset.getString("nome");
					idade = resultset.getInt("idade");
					email = resultset.getNString("email");
					funcao = resultset.getString("funcao");

					Contato c = new Contato(id, nome, idade, email, funcao);

					lista.add(c);
				}

			} catch (SQLException e) {
				System.out.println("Erro" + e.getMessage());

			}

			return lista;

		}
	// ________________________________________________________________________________________
	// M�todo que lista todos os registros
	// ________________________________________________________________________________________

	public void reiniciarAutoIncrementoId() {

		try {
			String query = "ALTER TABLE contatos AUTO_INCREMENT = 1;";
			this.statement.executeLargeUpdate(query);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());

		}

	}

}
