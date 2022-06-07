package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import metodos.CRUDContato;
import objetos.Contato;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Atualiza extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textNome;
	private JTextField textIdade;
	private JTextField textEmail;
	private JTextField textFuncao;
	private JTable table;
	DefaultTableModel model;
	private JButton btnEditar;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atualiza frame = new Atualiza();
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
	public Atualiza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id:");
		lblNewLabel.setBounds(10, 51, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(10, 86, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Idade:");
		lblNewLabel_2.setBounds(10, 111, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("E-mail:");
		lblNewLabel_3.setBounds(10, 136, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fun\u00E7\u00E3o:");
		lblNewLabel_4.setBounds(10, 171, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textId = new JTextField();
		textId.setBounds(67, 48, 86, 20);
		contentPane.add(textId);
		textId.setColumns(10);
		
		textNome = new JTextField();
		textNome.setBounds(67, 83, 86, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textIdade = new JTextField();
		textIdade.setBounds(66, 108, 86, 20);
		contentPane.add(textIdade);
		textIdade.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(66, 133, 86, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textFuncao = new JTextField();
		textFuncao.setBounds(66, 168, 86, 20);
		contentPane.add(textFuncao);
		textFuncao.setColumns(10);
		
		table = new JTable();
		Object[] column = { "ID", "Nome"};
		Object[] row = new Object[2];
		model.setColumnIdentifiers(column);// identificando os campos

		table.setModel(model);
		
		
		table.setBounds(209, 48, 215, 202);
		contentPane.add(table);
		
		btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnEditar.setBounds(67, 227, 89, 23);
		contentPane.add(btnEditar);
	}
}
