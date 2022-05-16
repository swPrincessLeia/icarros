import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class ProcessaDadosHashMap {

	public static void main(String[] args) {
		// entregar
		Scanner in = new Scanner(System.in);
		HashMap<Produto, Integer> marcasProdutos = new HashMap<Produto, Integer>();
		int op;
		int QuantidadeProdutos = 0;
		boolean continua = true;

		do {

			try {
				System.out.println("\nDigite a op��o desejada" + 
									"\n1 - Inserir Produtos " +
									 "\n2 - Listar todos od produtos " +
									  "\n3 - Consultar produto por marca " + 
									   "\n4 - Excluir produto espec�fico " + 
									  	"\n5 - Sair ");

				op = in.nextInt();
				in.nextLine();

				switch (op) {
				case 1:
					if (QuantidadeProdutos > 4) {
						System.out.println("Lista de cheia, exclua algum produto para adicionair mais produtos!");
					} else {
						while (QuantidadeProdutos <= 4) {
							System.out.println("\nProduto " + (QuantidadeProdutos + 1) + " de 5" + "\nDigite o nome do produto");
							String nomeProduto = in.nextLine();
							System.out.println("Produto " + (QuantidadeProdutos + 1) + " de 5" + "\nDigite a marca");
							String marca = in.nextLine();
							System.out.println("Produto " + (QuantidadeProdutos + 1) + " de 5" + "\nDigite o pre�o");
							double preco = in.nextDouble();
							Produto produto = new Produto(nomeProduto, marca, preco);
							in.nextLine();
							marcasProdutos.put(produto, QuantidadeProdutos);
							QuantidadeProdutos++;
						}
					}
					continua = true;
					break;

				case 2:
					listaDeProdutos(marcasProdutos, QuantidadeProdutos);
					continua = true;
					break;

				case 3:
					if (QuantidadeProdutos == 0) {
						System.out.println("A lista de produtos est� vazia!");
						break;
					}
					System.out.println("\nDigite a marca que deseja consultar a lista de produtos");
					String cons = in.nextLine();
					int countaMarca = 0;

					for (Produto key : marcasProdutos.keySet()) {
						if (Objects.equals(key.getMarca(), cons)) {
							System.out.println("Equals id: " + marcasProdutos.get(key) + "\nMarca: " + key.getMarca()
									+ "\nItem: " + key.nomeProduto + "\nPre�o: " + key.preco);
							System.out.println("_______________________________");
							countaMarca++;
						}
						continue;
					}
					if (countaMarca == 0) {
						System.out.println("Marca n�o econtrada!");
					}
					continua = true;
					break;

				case 4:
					boolean resp = listaDeProdutos(marcasProdutos, QuantidadeProdutos);
					if (resp == true) {
						break;
					}
					int verificaIdProduto = 0;
					System.out.println("\nDigite o id do produto que deseja excluir");
					int idProduto = in.nextInt();

					for (Produto key : marcasProdutos.keySet()) {
						if (marcasProdutos.get(key) == idProduto) {
							marcasProdutos.remove(key);
							QuantidadeProdutos--;
							verificaIdProduto++;
							System.out.println("\nProduto removido com sucesso!");
							break;
						}
					}
					if (verificaIdProduto == 0) {
						System.out.println("Id n�o econtrado!");
					}
					continua = true;
					break;

				case 5:
					System.out.println("Programa encerrado!");
					continua = false;
					break;

				default:
					System.out.println("\nOp��o de n�mero inv�lida!");
				}
			} catch (InputMismatchException e) {
				System.out.println("Programa encerrado!" + "\n "
						+ " 	                   /~\\   Oh c�us! Op��o inv�lida! Adeus!\r\n"
						+ "                          (O O) _/                 \r\n"
						+ "                          _\\=/_                         \r\n"
						+ "          ___            /  _  \\                         \r\n"
						+ "         / ()\\          //|/.\\|\\\\                        \r\n"
						+ "       _|_____|_       ||  \\_/  ||                       \r\n"
						+ "      | | === | |      || |\\ /| ||                       \r\n"
						+ "      |_|  O  |_|       # \\_ _/ #                        \r\n"
						+ "       ||  O  ||          | | |                          \r\n"
						+ "       ||__*__||          | | |                          \r\n"
						+ "      |~ \\___/ ~|         []|[]                          \r\n"
						+ "      /=\\ /=\\ /=\\         | | |                          \r\n"
						+ "______[_]_[_]_[_]________/_]_[_\\_____" + "");
				break;
			}

		} while (continua == true);

	}

	public static boolean listaDeProdutos(HashMap<Produto, Integer> marcasProdutos, int QuantidadeProdutos) {

		if (QuantidadeProdutos == 0) {
			System.out.println("A lista de produtos est� vazia");
			return true;
		} else {

			for (Produto key : marcasProdutos.keySet()) {
				System.out.println("id: " + marcasProdutos.get(key) + "\nMarca: " + key.getMarca() + "\nItem: "
						+ key.getNomeProduto() + "\nPre�o: " + key.getPreco());
				System.out.println("_______________________________");
			}
			return false;
		}
	}
}
