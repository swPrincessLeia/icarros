package objetos;

public class Contato {

	private int idadeContato;
	private String idContato, nomeContato, emailContato, funcaoContato;

	public Contato(String idContato, String nomeContato, int idadeContato, String emailContato, String funcaoContato) {

		this.idContato = idContato;
		this.nomeContato = nomeContato;
		this.idadeContato = idadeContato;
		this.emailContato = emailContato;
		this.funcaoContato = funcaoContato;

	}

	public String getIdContato() {
		return idContato;
	}

	public void setIdContato(String idContato) {
		this.idContato = idContato;
	}

	public int getIdadeContato() {
		return idadeContato;
	}

	public void setIdadeContato(int idadeContato) {
		this.idadeContato = idadeContato;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getEmailContato() {
		return emailContato;
	}

	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}

	public String getFuncaoContato() {
		return funcaoContato;
	}

	public void setFuncaoContato(String funcaoContato) {
		this.funcaoContato = funcaoContato;
	}

}
