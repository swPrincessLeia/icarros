
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessaArrayList {

	public static void main(String[] args) {
		ArrayList<String> produtos = new ArrayList<String>();
		ArrayList<Double> precos = new ArrayList<Double>();

		teste(produtos, precos);

	}

	public static void teste(ArrayList<String> produtos, ArrayList<Double> precos) {

		Scanner in = new Scanner(System.in);

		String msg = "10- voltar para o menu de op��es \n 0-encerrar programa";
		int menu1 = 10;
		int tam = 2;

		String menu = "Bem-vindo!" + "\n1 - Cadastrar" + "\n2 - Consultar" + "\n3 - Visualizar" + "\n4 - Excluir"
				+ "\n5 - Alterar registro" +"\n6 - Sair";
		if (menu1 == 0) {
			System.out.println("Bem Vindo");
		} else if (menu1 == 10) {
			System.out.println(menu);

			int op = in.nextInt();

			switch (op) {

			case 1:
				System.out.println("Cadastro de produto");

				for (int i = 0; i < tam; i++) {

					in.nextLine();
					System.out.print("Digite o nome do produto eletr�nico: ");
					String nomeProduto = in.nextLine();
					produtos.add(nomeProduto);

					System.out.print("Digite o pre�o do produto eletr�nico: ");
					double preco = in.nextDouble();
					precos.add(preco);

				}
				System.out.println(msg);
				menu1 = in.nextInt();
				teste2(menu1, produtos, precos);

				break;

			case 2:
				System.out.println("Consultar nome e pre�o do produto");

				System.out.println("Informe o id do produto");
				int id = in.nextInt();
				System.out.println("produto: " + produtos.get(id - 1) + "\nPre�o: R$ " + precos.get(id - 1));

				System.out.println(msg);
				menu1 = in.nextInt();
				teste2(menu1, produtos, precos);
				break;

			case 3:
				System.out.println("vizualizar todos os produtos");

				for (int m = 0; m < produtos.size(); m++) {

					System.out.println("produto: " + produtos.get(m) + "\nPre�o: R$ " + precos.get(m));
				}

				System.out.println(msg);
				menu1 = in.nextInt();
				teste2(menu1, produtos, precos);
				break;

			case 4:
				System.out.println("Remover um produto: informa o id do produto");
				int r = in.nextInt();
				produtos.remove(r - 1);
				precos.remove(r - 1);
				System.out.println("Produto removido");

				System.out.println(msg);
				menu1 = in.nextInt();
				teste2(menu1, produtos, precos);
				break;

			case 5:
				System.out.println("Alterar o nome do produto: \n Informe o id do produto");
				int t = in.nextInt();
				in.nextLine();
				System.out.println("Informe o novo nome");
				String u = in.nextLine();

				System.out.println("Alterar o pre�o do produto: \nInforma o id do produto");
				int te = in.nextInt();
				in.nextLine();
				System.out.println("Informa o novo pre�o");
				double p = in.nextDouble();

				produtos.set(t - 1, u);
				precos.set(te - 1, p);

				System.out.println("Produto alterado");

				System.out.println(msg);
				menu1 = in.nextInt();
				teste2(menu1, produtos, precos);
				break;

			default:
				System.out.println("Op��o inv�lida");
				System.out.println(msg);
				menu1 = in.nextInt();
				teste2(menu1, produtos, precos);
			}

		}

	}

	public static void teste2(int menu1, ArrayList<String> produtos, ArrayList<Double> precos) {

		if (menu1 == 10) {

			teste(produtos, precos);

		} else {
			System.out.println("Boa noite!");

		}
	}
}
