package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class inicionsesiada extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicionsesiada frame = new inicionsesiada();
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
	public inicionsesiada() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSaioaHasi = new JLabel("SAIOA HASI");
		lblSaioaHasi.setFont(new Font("Georgia", Font.PLAIN, 16));
		lblSaioaHasi.setBounds(171, 58, 101, 21);
		contentPane.add(lblSaioaHasi);
		
		JLabel lblErabiltzailea = new JLabel("ERABILTZAILEA");
		lblErabiltzailea.setFont(new Font("Georgia", Font.PLAIN, 13));
		lblErabiltzailea.setBounds(39, 106, 110, 21);
		contentPane.add(lblErabiltzailea);
		
		JLabel lblPasahitza = new JLabel("PASAHITZA");
		lblPasahitza.setFont(new Font("Georgia", Font.PLAIN, 13));
		lblPasahitza.setBounds(39, 137, 110, 21);
		contentPane.add(lblPasahitza);
		
		textField = new JTextField();
		textField.setBounds(171, 108, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(171, 139, 96, 19);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("SAIOA HASI");
		btnNewButton.setFont(new Font("Georgia", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(156, 201, 127, 25);
		contentPane.add(btnNewButton);
	}
}
