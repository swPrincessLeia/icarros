package Calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class ProcessaCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textValor1;
	private JTextField textValor2;
	private JTextField textResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProcessaCalculadora frame = new ProcessaCalculadora();
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
	public ProcessaCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValor1 = new JLabel("Valor 1");
		lblValor1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblValor1.setBounds(79, 11, 86, 27);
		contentPane.add(lblValor1);
		
		JLabel lblValor2 = new JLabel(" Valor 2");
		lblValor2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblValor2.setBounds(79, 106, 86, 26);
		contentPane.add(lblValor2);
		
		textValor1 = new JTextField();
		textValor1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textValor1.setBounds(59, 49, 127, 41);
		contentPane.add(textValor1);
		textValor1.setColumns(10);
		
		textValor2 = new JTextField();
		textValor2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textValor2.setBounds(59, 143, 127, 40);
		contentPane.add(textValor2);
		textValor2.setColumns(10);
		
		textResultado = new JTextField();
		textResultado.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textResultado.setBounds(251, 91, 110, 63);
		contentPane.add(textResultado);
		textResultado.setColumns(10);
		
		JButton btnSoma = new JButton("Somar");
		btnSoma.setBackground(new Color(255, 255, 255));
		btnSoma.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String num1, num2;
				int resultado;
				
			
				num1 = textValor1.getText();
				num2 = textValor2.getText();
				resultado = Integer.parseInt(num1) +  Integer.parseInt(num2);
				/* fazendo um gato na aplicação
				
				//textResultado.setText(""+resultado);
				 * */
				
				//convertendo o valor inteiro para string
				
				textResultado.setText(Integer.toString(resultado));
				
				
			}
		});
		btnSoma.setBounds(70, 194, 95, 34);
		contentPane.add(btnSoma);
		
		JLabel lblNewLabel = new JLabel("=");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 53));
		lblNewLabel.setBounds(203, 93, 46, 39);
		contentPane.add(lblNewLabel);
	}
}
