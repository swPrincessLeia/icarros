package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import metodos.CRUDContato;
import objetos.Contato;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Remove extends JFrame {

	private JPanel contentPane;
	private JTextField textId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Remove frame = new Remove();
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
	public Remove() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Entre com o id desejado:");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(66, 132, 176, 36);
		contentPane.add(lblNewLabel);

		textId = new JTextField();
		textId.setBounds(244, 143, 86, 20);
		contentPane.add(textId);
		textId.setColumns(10);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CRUDContato contato = new CRUDContato();
				contato.Conectar();
				String idTela = textId.getText();
				boolean IDNaoEncontrado = true;

				for (Contato c : contato.PesquisarID(idTela)) {
					if (idTela.equals(c.getIdContato())) {
						IDNaoEncontrado = false;
					}

				}
				if (IDNaoEncontrado) {
					JOptionPane.showMessageDialog(null, "ID n�o encontrado!");
				} else {
					int opcao = JOptionPane.showConfirmDialog(btnExcluir, "Deseja remover o ID " + idTela + " ?");
					// JOptionPane.showMessageDialog(btnExcluir, "op��o: " + opcao );
					if (opcao == 0) {
						contato.excluirContato(idTela);
						JOptionPane.showMessageDialog(null, "Registro removido com sucesso!");
					}
				}
			}
		});
		btnExcluir.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnExcluir.setBounds(244, 190, 89, 23);
		contentPane.add(btnExcluir);

		JLabel lblNewLabel_1 = new JLabel("Excluindo Registro do banco de dados");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_1.setBounds(66, 89, 333, 32);
		contentPane.add(lblNewLabel_1);

		JButton btnS = new JButton("S");
		btnS.setBackground(new Color(255, 255, 255));
		btnS.setFont(new Font("Segoe UI", Font.BOLD, 22));
		btnS.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Seleciona s = new Seleciona();
				s.setVisible(true);
			}
		});
		btnS.setBounds(48, 25, 61, 23);
		contentPane.add(btnS);

		JButton btnI = new JButton("I");
		btnI.setFont(new Font("Segoe UI", Font.BOLD, 22));
		btnI.setBackground(new Color(255, 255, 255));
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inseri i = new Inseri();
				i.setVisible(true);
			}
		});
		btnI.setBounds(127, 25, 61, 23);
		contentPane.add(btnI);

		JButton btnD = new JButton("D");
		btnD.setEnabled(false);
		btnD.setBackground(new Color(255, 255, 255));
		btnD.setFont(new Font("Segoe UI", Font.BOLD, 22));
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Remove r = new Remove();
				r.setVisible(true);
			}
		});
		btnD.setBounds(208, 25, 61, 23);
		contentPane.add(btnD);

		JButton btnU = new JButton("U");
		btnU.setEnabled(false);
		btnU.setFont(new Font("Segoe UI", Font.BOLD, 22));
		btnU.setBackground(new Color(255, 255, 255));
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atualiza a = new Atualiza();
				a.setVisible(true);
			}
		});
		btnU.setBounds(289, 25, 61, 23);
		contentPane.add(btnU);
	}

}
