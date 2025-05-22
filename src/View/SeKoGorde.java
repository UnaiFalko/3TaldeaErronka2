package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;

public class SeKoGorde extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeKoGorde frame = new SeKoGorde();
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
	public SeKoGorde() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrSegurtasunKopiaModu = new JTextArea();
		txtrSegurtasunKopiaModu.setColumns(2);
		txtrSegurtasunKopiaModu.setRows(2);
		txtrSegurtasunKopiaModu.setForeground(new Color(0, 64, 128));
		txtrSegurtasunKopiaModu.setBackground(new Color(192, 192, 192));
		txtrSegurtasunKopiaModu.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		txtrSegurtasunKopiaModu.setText("Segurtasun kopia modu onean gorde da!");
		txtrSegurtasunKopiaModu.setBounds(28, 102, 385, 45);
		contentPane.add(txtrSegurtasunKopiaModu);
	}
}