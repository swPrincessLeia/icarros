package mediaNotas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClaculaMediaNotas extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textNome;
	private JTextField textNota1;
	private JTextField textNota2;
	private JTable table;
	DefaultTableModel model;
	private JScrollPane scrollPane;
	private JButton btnExcluir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClaculaMediaNotas frame = new ClaculaMediaNotas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClaculaMediaNotas() {
		setTitle("Sistemas de Notas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 433);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textId = new JTextField();
		textId.setBounds(506, 124, 44, 20);
		contentPane.add(textId);
		textId.setColumns(10);

		JLabel lblId = new JLabel("ID:");
		lblId.setBackground(Color.WHITE);
		lblId.setForeground(Color.BLACK);
		lblId.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblId.setBounds(474, 125, 22, 14);
		contentPane.add(lblId);

		textNome = new JTextField();
		textNome.setBounds(547, 168, 243, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);

		textNota1 = new JTextField();
		textNota1.setBounds(547, 227, 78, 20);
		contentPane.add(textNota1);
		textNota1.setColumns(10);

		textNota2 = new JTextField();
		textNota2.setBounds(547, 278, 78, 20);
		contentPane.add(textNota2);
		textNota2.setColumns(10);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.BLACK);
		lblNome.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNome.setBounds(474, 169, 151, 14);
		contentPane.add(lblNome);

		JLabel lblNota1 = new JLabel("Nota P1:");
		lblNota1.setForeground(Color.BLACK);
		lblNota1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNota1.setBounds(474, 228, 151, 14);
		contentPane.add(lblNota1);

		JLabel lblNota2 = new JLabel("Nota P2:");
		lblNota2.setForeground(Color.BLACK);
		lblNota2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNota2.setBounds(474, 279, 151, 14);
		contentPane.add(lblNota2);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 124, 454, 174);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Segoe UI", Font.BOLD, 13));
		scrollPane.setViewportView(table);
		model = new DefaultTableModel();
		Object[] column = { "ID", "Nome", "Nota P1", "Nota P2", "M�dia", "Status" };
		Object[] row = new Object[6];
		model.setColumnIdentifiers(column);
		table.setModel(model);

		table.setBackground(Color.WHITE);
		table.setForeground(Color.BLACK);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textId.getText().equals("") || textNome.getText().equals("") || textNota1.getText().equals("")
						|| textNota2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos");

				}

				try {

					row[0] = textId.getText();
					row[1] = textNome.getText();
					row[2] = textNota1.getText();
					row[3] = textNota2.getText();

					double nota1 = Double.parseDouble(textNota1.getText());
					double nota2 = Double.parseDouble(textNota2.getText());
					double media = (nota1 + nota2) / 2;
					row[4] = media;

					if (media > 5) {
						row[5] = "Aprovado(a)";

					}
					if (media < 5) {
						row[5] = "Reprovado(a)";
					}
					if (media == 5) {
						row[5] = "Recupera��o";
					}

					textNota1.getText();

					model.addRow(row);

					textId.setText("");
					textNome.setText("");
					textNota1.setText("");
					textNota2.setText("");

				} catch (Exception erro) {
					System.out.println("Erro");
					JOptionPane.showMessageDialog(null, "Preencha os valores corretos!");

				}

			}

		});
		btnSalvar.setForeground(Color.WHITE);
		btnSalvar.setBackground(new Color(50, 205, 50));
		btnSalvar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnSalvar.setBounds(141, 325, 86, 23);
		contentPane.add(btnSalvar);

		btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int linha = table.getSelectedRow();

				if (linha >= 0) {
					
					
					int opcao = JOptionPane.showConfirmDialog(btnExcluir, "Deseja remover?");
					
					if (opcao == 0) {
						model.removeRow(linha);
						JOptionPane.showMessageDialog(null, "Registro removido com sucesso!");
					}
					
					
				} else {

					JOptionPane.showMessageDialog(null, "Sem registros para excluir, ou registro n�o selecionado");

				}

			}
		});
		btnExcluir.setForeground(Color.WHITE);
		btnExcluir.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnExcluir.setBackground(Color.RED);
		btnExcluir.setBounds(249, 325, 86, 23);
		contentPane.add(btnExcluir);
		
		JLabel lblNewLabel = new JLabel("Sistema de Gerenciamento de Notas");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 27));
		lblNewLabel.setBounds(116, 47, 544, 23);
		contentPane.add(lblNewLabel);
	}
}
