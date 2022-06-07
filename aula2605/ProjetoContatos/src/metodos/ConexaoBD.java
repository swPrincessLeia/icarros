package metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ConexaoBD {
	// Atributos protected para poderem ser acessados nas classes que ir�o extender, se � seguro encapsular assim? n�o sei
	// ConexaoBD
	protected Connection connection = null;
	protected java.sql.Statement statement = null;
	protected ResultSet resultset = null;

	// Criando conex�o com o banco
	public void Conectar() {

		String servidor = "jdbc:mysql://localhost/icarros";
		String usuario = "root";
		String senha = "bd@5A";
		String driver = "com.mysql.cj.jdbc.Driver";

		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();

		} catch (Exception e) {

			System.out.println("Erro" + e.getMessage());
		}
	}

	public boolean estaConectado() {

		if (this.connection != null) {
			return true;
		} else {
			return false;
		}
	}

}

