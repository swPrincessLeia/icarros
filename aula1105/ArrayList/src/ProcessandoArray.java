import java.util.ArrayList;

public class ProcessandoArray {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<String>();

		nomes.add("Renan");
		nomes.add("Tha�s");
		nomes.add("Thales");

		System.out.println(nomes);
		nomes.set(2, "Alexandre");
		System.out.println(nomes);

		nomes.remove(0);
		System.out.println(nomes);
		System.out.println(nomes.size());

		System.out.println();

	}
}
