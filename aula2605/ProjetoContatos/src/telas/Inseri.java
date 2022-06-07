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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import metodos.CRUDContato;

public class Inseri extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textIdade;
	private JTextField textEmail;
	private JTextField textFuncao;
	private JButton btnS;
	private JButton btnI;
	private JButton btnD;
	private JButton btnU;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inseri frame = new Inseri();
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
	public Inseri() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel.setBounds(27, 100, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Idade:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(27, 131, 62, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("E-mail:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(27, 171, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Fun\u00E7\u00E3o:");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(27, 196, 77, 14);
		contentPane.add(lblNewLabel_3);

		textNome = new JTextField();
		textNome.setBounds(95, 100, 282, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);

		textIdade = new JTextField();
		textIdade.setBounds(95, 131, 86, 20);
		contentPane.add(textIdade);
		textIdade.setColumns(10);

		textEmail = new JTextField();
		textEmail.setBounds(95, 165, 282, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);

		textFuncao = new JTextField();
		textFuncao.setBounds(95, 196, 282, 20);
		contentPane.add(textFuncao);
		textFuncao.setColumns(10);

		JButton btnProcessar = new JButton("Salvar");
		btnProcessar.setBackground(new Color(255, 255, 255));
		btnProcessar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnProcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					CRUDContato contato = new CRUDContato();
					contato.Conectar();
					String nome = textNome.getText();
					String i = textIdade.getText();
					int idade = Integer.parseInt(i);
					String email = textEmail.getText();
					String funcao = textFuncao.getText();

					contato.inserirContato(nome, idade, email, funcao);
					JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!!");
					textNome.setText("");
					textIdade.setText("");
					textEmail.setText("");
					textFuncao.setText("");
					
				} catch (Exception erro) {
					JOptionPane.showMessageDialog(null, "Informe os dados corretamente!");
				}

			

			}
		});
		btnProcessar.setBounds(150, 227, 89, 23);
		contentPane.add(btnProcessar);

		btnS = new JButton("S");
		btnS.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnS.setBackground(new Color(255, 255, 255));
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleciona s = new Seleciona();
				s.setVisible(true);
			}
		});
		btnS.setBounds(43, 12, 61, 23);
		contentPane.add(btnS);

		btnI = new JButton("I");
		btnI.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnI.setEnabled(false);
		btnI.setBackground(new Color(255, 255, 255));
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Inseri i = new Inseri();
				i.setVisible(true);
			
				
			}
		});
		btnI.setBounds(129, 12, 61, 23);
		contentPane.add(btnI);

		btnD = new JButton("D");
		btnD.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnD.setBackground(new Color(255, 255, 255));
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Remove r = new Remove();
				r.setVisible(true);;

			}
		});
		btnD.setBounds(213, 12, 61, 23);
		contentPane.add(btnD);

		btnU = new JButton("U");
		btnU.setEnabled(false);
		btnU.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnU.setBackground(new Color(255, 255, 255));
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atualiza a = new Atualiza();
				a.setVisible(true);
			}
		});
		btnU.setBounds(300, 12, 61, 23);
		contentPane.add(btnU);

		lblNewLabel_4 = new JLabel("Inserindo um  Registro no Banco de Dados");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_4.setBounds(58, 62, 298, 14);
		contentPane.add(lblNewLabel_4);

	}
}
