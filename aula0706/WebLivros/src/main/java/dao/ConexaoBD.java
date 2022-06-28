package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConexaoBD {

	protected Connection connection = null;
	protected java.sql.Statement statement = null;
	//PreparedStatement permitiu que o banco inserisse a data, pois não estava aceitando, obrigada Thales!
	protected PreparedStatement preparedStatement  = null;//https://pt.stackoverflow.com/questions/99620/qual-a-diferen%C3%A7a-entre-o-statement-e-o-preparedstatement
	protected ResultSet resultset = null;

	public void conectar() {

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
