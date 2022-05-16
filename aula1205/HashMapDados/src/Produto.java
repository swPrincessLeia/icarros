import java.util.Objects;

public class Produto {

	String nomeProduto, marca;
	double preco;

	public Produto(String nomeProduto, String marca, double preco) {
		this.nomeProduto = nomeProduto;
		this.marca = marca;
		this.preco = preco;

	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public String getMarca() {
		return marca;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, nomeProduto, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(nomeProduto, other.nomeProduto)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}

}