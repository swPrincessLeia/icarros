package telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import metodos.CRUDContato;
import objetos.Contato;

public class Seleciona extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextArea textDado;
	private JButton btnS;
	private JButton btnI;
	private JButton btnD;
	private JButton btnU;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seleciona frame = new Seleciona();
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
	public Seleciona() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Pesquisando um  Registro no Banco de Dados");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel.setBounds(64, 45, 320, 53);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Entre com o ID desejado:");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(21, 109, 168, 27);
		contentPane.add(lblNewLabel_1);

		JButton btnProcessar = new JButton("Pesquisar");
		btnProcessar.setBackground(new Color(255, 255, 255));
		btnProcessar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnProcessar.setForeground(new Color(0, 0, 0));
		btnProcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CRUDContato contato = new CRUDContato();
				contato.Conectar();
				String idTela = textId.getText();
				boolean IDNaoEncontrado = true;
			
				
				for (Contato c : contato.PesquisarID(idTela)) {

					if (idTela.equals(c.getIdContato())) {
						textDado.setText("\nID: " + c.getIdContato() +
										 "\nNome: " + c.getNomeContato()+
										 "\nIdade: " + c.getIdadeContato()+
										 "\nE-mail: " + c.getEmailContato()+
										 "\nFun��o: " + c.getFuncaoContato());
						
						IDNaoEncontrado = false;
					} 						
				}				
					
				if(IDNaoEncontrado) {
					JOptionPane.showMessageDialog(null, "ID n�o encontrado!");
				}
			}
		});
		btnProcessar.setBounds(53, 209, 102, 23);
		contentPane.add(btnProcessar);

		textId = new JTextField();
		textId.setBounds(64, 158, 86, 20);
		contentPane.add(textId);
		textId.setColumns(10);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(208, 109, 216, 140);
		contentPane.add(scrollPane);

		textDado = new JTextArea();
		textDado.setBackground(new Color(70, 130, 180));
		textDado.setFont(new Font("Segoe UI", Font.BOLD, 13));
		scrollPane.setViewportView(textDado);

		btnS = new JButton("S");
		btnS.setEnabled(false);
		btnS.setBackground(new Color(255, 255, 255));
		btnS.setFont(new Font("Segoe UI", Font.BOLD, 22));
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleciona s = new Seleciona();
				s.setVisible(true);
			}
		});
		btnS.setBounds(46, 25, 61, 23);
		contentPane.add(btnS);

		btnI = new JButton("I");
		btnI.setFont(new Font("Segoe UI", Font.BOLD, 22));
		btnI.setBackground(new Color(255, 255, 255));
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inseri i = new Inseri();
				i.setVisible(true);
			}
		});
		btnI.setBounds(137, 25, 61, 23);
		contentPane.add(btnI);

		btnD = new JButton("D");
		btnD.setFont(new Font("Segoe UI", Font.BOLD, 22));
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Remove r = new Remove();
				r.setVisible(true);
			}
		});
		btnD.setBounds(228, 25, 61, 23);
		contentPane.add(btnD);

		btnU = new JButton("U");
		btnU.setEnabled(false);
		btnU.setBackground(new Color(255, 255, 255));
		btnU.setFont(new Font("Segoe UI", Font.BOLD, 22));
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atualiza a = new Atualiza();
				a.setVisible(true);

			}
		});
		btnU.setBounds(312, 25, 61, 23);
		contentPane.add(btnU);

	}
}
