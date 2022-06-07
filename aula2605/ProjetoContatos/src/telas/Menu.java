package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnS = new JButton("S");
		btnS.setBackground(new Color(255, 255, 255));
		btnS.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleciona s = new Seleciona();
						s.show(true);
			}
		});
		btnS.setBounds(39, 36, 60, 23);
		contentPane.add(btnS);
		
		JButton btnI = new JButton("I");
		btnI.setBackground(new Color(255, 255, 255));
		btnI.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inseri i = new Inseri();
				i.show(true);
			}
		});
		btnI.setBounds(137, 36, 60, 23);
		contentPane.add(btnI);
		
		JButton btnD = new JButton("D");
		btnD.setBackground(new Color(255, 255, 255));
		btnD.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Remove r = new Remove();
				r.show(true);
				
			}
		});
		btnD.setBounds(230, 36, 60, 23);
		contentPane.add(btnD);
		
		JButton btnU = new JButton("U");
		btnU.setEnabled(false);
		btnU.setBackground(new Color(255, 255, 255));
		btnU.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atualiza a= new Atualiza();
				a.show(true);
			}
		});
		btnU.setBounds(324, 36, 60, 23);
		contentPane.add(btnU);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(Color.WHITE);
		panel.setBounds(44, 91, 340, 159);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Bem Vindo(a)!");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 25));
		panel.add(lblNewLabel);
	}
}
