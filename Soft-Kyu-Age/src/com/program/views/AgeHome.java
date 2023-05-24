package com.program.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgeHome extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgeHome frame = new AgeHome();
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
	public AgeHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 420);

		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("TENTAR!");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String text = textField.getText();
					Integer number = Integer.parseInt(text);
					JLabel mensagem = new JLabel("Vocês Erraram!");
					
					
					mensagem.setPreferredSize(new Dimension(400, 100));
					
					// Defina o tamanho desejado do painel
					JPanel panelMensagem = new JPanel();
					panelMensagem.add(mensagem);
					if (number == 23) {
						Mensagem frame = new Mensagem();
						frame.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, panelMensagem, "Título da mensagem", JOptionPane.INFORMATION_MESSAGE);
						//JOptionPane.showMessageDialog(null,"Vocês Erraram!");
					}
				} catch (Exception e2) {
					JLabel mensagem2 = new JLabel("Voce digitou um tipo não numerico");
					mensagem2.setPreferredSize(new Dimension(400, 100));
					JPanel panelMensagem2 = new JPanel();
					panelMensagem2.add(mensagem2);
					
					JOptionPane.showMessageDialog(null, panelMensagem2, "Título da mensagem", JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
		btnNewButton.setBounds(288, 267, 130, 56);
		contentPane.add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(269, 150, 169, 56);
		contentPane.add(textField);
		textField.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(210, 32, 296, 48);
		contentPane.add(panel);

		JLabel lblNewLabel = new JLabel("Soft Kyu Age");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.RED);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.BOLD, 39));
	}
}
