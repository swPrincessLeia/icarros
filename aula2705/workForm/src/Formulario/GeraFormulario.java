package Formulario;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GeraFormulario extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textIdade;
	private JTable table;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeraFormulario frame = new GeraFormulario();
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
	public GeraFormulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 473);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Formul\u00E1rio");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 23));
		lblNewLabel.setBounds(247, 29, 152, 42);
		contentPane.add(lblNewLabel);

		JLabel lblId = new JLabel("ID Cliente:");
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblId.setBounds(13, 79, 85, 30);
		contentPane.add(lblId);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNome.setBounds(13, 138, 54, 19);
		contentPane.add(lblNome);

		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblEmail.setBounds(13, 190, 64, 14);
		contentPane.add(lblEmail);

		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setForeground(Color.WHITE);
		lblIdade.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblIdade.setBounds(13, 237, 46, 14);
		contentPane.add(lblIdade);

		textId = new JTextField();
		textId.setFont(new Font("Segoe UI", Font.BOLD, 13));
		textId.setBounds(90, 86, 67, 20);
		contentPane.add(textId);
		textId.setColumns(10);

		textNome = new JTextField();
		textNome.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textNome.setBounds(69, 138, 279, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);

		textEmail = new JTextField();
		textEmail.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textEmail.setBounds(69, 188, 244, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);

		textIdade = new JTextField();
		textIdade.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textIdade.setBounds(69, 235, 46, 20);
		contentPane.add(textIdade);
		textIdade.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			
		});
		scrollPane.setBounds(378, 101, 279, 268);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int contador = table.getSelectedRow();
				textId.setText(model.getValueAt(contador,0).toString());
				textNome.setText(model.getValueAt(contador,1).toString());
				textEmail.setText(model.getValueAt(contador,2).toString());
				textIdade.setText(model.getValueAt(contador,3).toString());
			}
		});
		scrollPane.setViewportView(table);
		model = new DefaultTableModel();
		Object[] column = { "ID", "Nome", "Email", "Idade" };
		Object[] row = new Object[4];
		model.setColumnIdentifiers(column);
		table.setModel(model);

		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textId.getText().equals("") || textNome.getText().equals("") || textEmail.getText().equals("")
						|| textIdade.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Pro favor, preencha todos os campos!");
				}

				row[0] = textId.getText();
				row[1] = textNome.getText();
				row[2] = textEmail.getText();
				row[3] = textIdade.getText();
				model.addRow(row);

				textId.setText("");
				textNome.setText("");
				textEmail.setText("");
				textIdade.setText("");

			}
		});
		btnAdicionar.setForeground(Color.WHITE);
		btnAdicionar.setBackground(new Color(0, 204, 51));
		btnAdicionar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnAdicionar.setBounds(69, 320, 97, 23);
		contentPane.add(btnAdicionar);

		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				int contador = table.getSelectedRow();
				model.setValueAt(textId.getText(), contador, 0);
				model.setValueAt(textNome.getText(), contador, 1);		
				model.setValueAt(textEmail.getText(), contador, 2);
				model.setValueAt(textIdade.getText(), contador, 3);
						
			}
		});
		btnAtualizar.setForeground(Color.WHITE);
		btnAtualizar.setBackground(new Color(51, 204, 255));
		btnAtualizar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnAtualizar.setBounds(188, 320, 97, 23);
		contentPane.add(btnAtualizar);

		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int contador = table.getSelectedRow();
				System.out.println(table.getSelectedRow());

				//if(model.getRowCount()>0)
				//table.requestFocus();
				if (contador >= 0) {
					
					model.removeRow(contador);
				} else {

					JOptionPane.showMessageDialog(null, "Sem registros para excluir, ou registro n�o selecionado");

				}
			}
		});
		btnDeletar.setForeground(Color.WHITE);
		btnDeletar.setBackground(new Color(255, 51, 51));
		btnDeletar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnDeletar.setBounds(69, 358, 97, 23);
		contentPane.add(btnDeletar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textId.setText("");
				textNome.setText("");
				textEmail.setText("");
				textIdade.setText(""); 
				textId.requestFocus();

			}
		});
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setBackground(new Color(255, 102, 0));
		btnLimpar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnLimpar.setBounds(188, 358, 97, 23);
		contentPane.add(btnLimpar);

		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBackground(SystemColor.activeCaption);
		textPane.setForeground(Color.CYAN);
		textPane.setBounds(0, 11, 693, 19);
		contentPane.add(textPane);

	}
}
