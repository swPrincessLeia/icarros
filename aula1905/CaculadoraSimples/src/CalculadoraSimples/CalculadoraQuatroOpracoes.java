package CalculadoraSimples;

import java.awt.Color;
import java.awt.Component;
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

public class CalculadoraQuatroOpracoes extends JFrame {

	private static final Component NULL = null;
	private JPanel contentPane;
	private JTextField textValorA;
	private JTextField textValorB;
	private JTextField textResultado;
	public Double resultado = 0.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraQuatroOpracoes frame = new CalculadoraQuatroOpracoes();
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

	public double calcular(String valorA, String valorB, String operacaoMatemtica) {

		try {
			switch (operacaoMatemtica) {

			case "+":
				resultado = Double.parseDouble(valorA) + Double.parseDouble(valorB);
				break;
			case "-":
				resultado = Double.parseDouble(valorA) - Double.parseDouble(valorB);
				break;
			case "/":
				resultado = Double.parseDouble(valorA) / Double.parseDouble(valorB);
				break;
			case "*":
				resultado = Double.parseDouble(valorA) * Double.parseDouble(valorB);
				break;
			default:
				break;

			}
		} catch (Exception e) {

			JOptionPane.showMessageDialog(NULL, "Voc� n�o digitou um n�mero!");

		}
		return resultado;
	}

	public CalculadoraQuatroOpracoes() {
		setTitle("Super Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblValorA = new JLabel("Valor A");
		lblValorA.setFont(new Font("Consolas", Font.BOLD, 20));
		lblValorA.setForeground(new Color(255, 255, 255));
		lblValorA.setBounds(99, 105, 86, 30);
		contentPane.add(lblValorA);

		JLabel lblValorB = new JLabel("Valor B");
		lblValorB.setForeground(Color.WHITE);
		lblValorB.setFont(new Font("Consolas", Font.BOLD, 20));
		lblValorB.setBounds(99, 169, 99, 30);
		contentPane.add(lblValorB);

		textValorA = new JTextField();
		textValorA.setFont(new Font("Consolas", Font.BOLD, 20));
		textValorA.setBounds(99, 128, 86, 30);
		contentPane.add(textValorA);
		textValorA.setColumns(10);

		textValorB = new JTextField();
		textValorB.setFont(new Font("Consolas", Font.BOLD, 20));
		textValorB.setBounds(99, 190, 86, 30);
		contentPane.add(textValorB);
		textValorB.setColumns(10);

		JButton btnSoma = new JButton("+");
		btnSoma.setForeground(new Color(255, 255, 255));
		btnSoma.setBackground(new Color(0, 191, 255));
		btnSoma.setFont(new Font("Consolas", Font.BOLD, 20));
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado = calcular(textValorA.getText(), textValorB.getText(), "+");

			}
		});
		btnSoma.setBounds(208, 105, 49, 36);
		contentPane.add(btnSoma);

		JButton btnSubtracao = new JButton("-");
		btnSubtracao.setBackground(new Color(0, 191, 255));
		btnSubtracao.setForeground(new Color(255, 255, 255));
		btnSubtracao.setFont(new Font("Consolas", Font.BOLD, 20));
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado = calcular(textValorA.getText(), textValorB.getText(), "-");

			}

		});
		btnSubtracao.setBounds(208, 145, 49, 36);
		contentPane.add(btnSubtracao);

		JButton btnDivisao = new JButton("/");
		btnDivisao.setBackground(new Color(0, 191, 255));
		btnDivisao.setFont(new Font("Consolas", Font.BOLD, 20));
		btnDivisao.setForeground(new Color(255, 255, 255));
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado = calcular(textValorA.getText(), textValorB.getText(), "/");
			}

		});
		btnDivisao.setBounds(267, 105, 49, 35);
		contentPane.add(btnDivisao);

		JButton btnMultiplicacao = new JButton("*");
		btnMultiplicacao.setBackground(new Color(0, 191, 255));
		btnMultiplicacao.setForeground(new Color(255, 255, 255));
		btnMultiplicacao.setFont(new Font("Consolas", Font.BOLD, 20));
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado = calcular(textValorA.getText(), textValorB.getText(), "*");
			}
		});
		btnMultiplicacao.setBounds(267, 145, 49, 36);
		contentPane.add(btnMultiplicacao);

		textResultado = new JTextField();
		textResultado.setEditable(false);
		textResultado.setFont(new Font("Consolas", Font.BOLD, 20));
		textResultado.setBounds(99, 32, 217, 32);
		contentPane.add(textResultado);
		textResultado.setColumns(10);

		JButton btnIgual = new JButton("=");
		btnIgual.setBackground(new Color(127, 255, 0));
		btnIgual.setForeground(new Color(255, 255, 255));
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textValorA.getText().isEmpty() || textValorB.getText().isEmpty()) {

					JOptionPane.showMessageDialog(NULL, "Por favor, insira os valores num�ricos");
				} else {
					textResultado.setText(Double.toString(resultado));
				}

			}
		});
		btnIgual.setFont(new Font("Consolas", Font.BOLD, 24));
		btnIgual.setBounds(267, 186, 50, 36);
		contentPane.add(btnIgual);

		JButton btnLimpar = new JButton("C");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorA.setText(" ");
				textValorB.setText(" ");
				textResultado.setText("");
				resultado =0.0;
				// String resultadoString = Double.toString(resultado);
				// resultado =0.0;
				textValorA.requestFocus();
			}
		});
		btnLimpar.setFont(new Font("Consolas", Font.BOLD, 20));
		btnLimpar.setForeground(new Color(255, 255, 255));
		btnLimpar.setBackground(new Color(255, 0, 0));
		btnLimpar.setBounds(207, 186, 50, 36);
		contentPane.add(btnLimpar);

	}

}
