package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;

public class SeKoKargatu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeKoKargatu frame = new SeKoKargatu();
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
	public SeKoKargatu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrSegurtasunKopia = new JTextArea();
		txtrSegurtasunKopia.setForeground(new Color(0, 64, 128));
		txtrSegurtasunKopia.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		txtrSegurtasunKopia.setBackground(new Color(192, 192, 192));
		txtrSegurtasunKopia.setText("Segurtasun Kopia modu onean kargatu da!");
		txtrSegurtasunKopia.setBounds(22, 93, 404, 37);
		contentPane.add(txtrSegurtasunKopia);
	}

}
