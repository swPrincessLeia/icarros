import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;

public class Consulta extends JFrame {

	private JPanel jTatble;
	private JTextField textBuscar;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta frame = new Consulta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static class ScrollPane {

	}

	/**
	 * Create the frame.
	 */
	public Consulta() {
		setTitle("Consultas");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 512);
		jTatble = new JPanel();
		jTatble.setBackground(new Color(0, 0, 51));
		jTatble.setForeground(Color.CYAN);
		jTatble.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(jTatble);
		jTatble.setLayout(null);

		JButton btnBuscarFiltroEmail = new JButton("Buscar");
		btnBuscarFiltroEmail.setForeground(new Color(255, 255, 255));
		btnBuscarFiltroEmail.setBackground(new Color(0, 0, 51));
		btnBuscarFiltroEmail.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnBuscarFiltroEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				if (textBuscar.getText().isEmpty()) {
					textArea.setText("");
					JOptionPane.showMessageDialog(null, "Caixa de busca vazia!");
				}else {
				BuscaDeContatos buscaContatos = new BuscaDeContatos();
				buscaContatos.Conectar();
				String email = textBuscar.getText();

				if (buscaContatos.estaConectado()) {					
					
					StringBuilder concatenaRegistro = new StringBuilder();
					// como set apaga o registro anterior
					// foi realizado um append para poder exibir a lista compleata
					if (buscaContatos.buscaContatos(email).size() > 0) {

						for (String registro : buscaContatos.buscaContatos(email)) {
							concatenaRegistro.append(registro);
							textArea.setText(concatenaRegistro.toString());
						}
					} else {
						textArea.setText("\nSem Registros");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Erro!");
				}

			}
			}
		});

		btnBuscarFiltroEmail.setBounds(428, 24, 103, 31);
		jTatble.add(btnBuscarFiltroEmail);

		JButton btnExibirTodos = new JButton("Listar registros");
		btnExibirTodos.setForeground(new Color(255, 255, 255));
		btnExibirTodos.setBackground(new Color(0, 0, 51));
		btnExibirTodos.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnExibirTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ListaDeContatos listaContatos = new ListaDeContatos();
				listaContatos.Conectar();

				if (listaContatos.estaConectado()) {
					StringBuilder concatenaRegistro = new StringBuilder();
					// como set apagava o registro anterior
					// foi realizado um append para poder exibir a lista compleata
					for (String registro : listaContatos.listaContatos()) {
						concatenaRegistro.append(registro);
						textArea.setText(concatenaRegistro.toString());
					}

				} else {

					JOptionPane.showMessageDialog(null, "Erro!");

				}
			}
		});

		btnExibirTodos.setBounds(541, 24, 165, 31);
		jTatble.add(btnExibirTodos);

		textBuscar = new JTextField();
		textBuscar.setForeground(Color.LIGHT_GRAY);
		textBuscar.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		textBuscar.setBounds(32, 16, 386, 39);
		jTatble.add(textBuscar);
		textBuscar.setColumns(10);

		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setForeground(Color.LIGHT_GRAY);
		textArea.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(32, 71, 674, 372);
		jTatble.add(textArea);

		// 2h tentando descobrir como usar o scrollPane, pra achar a solu��o em um video
		// de 2m:57s
		// https://www.youtube.com/watch?v=GfJokob_eGM&ab_channel=TechWorld
		JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(32, 72, 674, 371);
		jTatble.add(scrollPane);

	}
}
