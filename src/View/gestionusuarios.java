package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

public class gestionusuarios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ErabiltzaileaGehitu erabiltzaileagehitu;
	private ErabiltzaileaEzabatu erabiltzaileaezabatu;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gestionusuarios frame = new gestionusuarios();
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
	public gestionusuarios() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\1AW3-8\\Downloads\\Taldea1-20250513T103019Z-001\\Taldea1\\argazkiak\\Logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(1, 2, 2, 2));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2,2));
		
		JButton btnNewButton = new JButton("Erabiltzailea Gehitu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(erabiltzaileagehitu != null) {
					erabiltzaileagehitu.setVisible(true);;
				}else {
					erabiltzaileagehitu = new ErabiltzaileaGehitu();
					erabiltzaileagehitu.setVisible(true);
				}
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Erabiltzailea Ezabatu");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(erabiltzaileaezabatu != null) {
					erabiltzaileaezabatu.setVisible(true);;
				}else {
					erabiltzaileaezabatu = new ErabiltzaileaEzabatu();
					erabiltzaileaezabatu.setVisible(true);
				}
			}
		});
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("Erabiltzaileak Ikusi");
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Erabiltzaileak editatu");
		contentPane.add(btnNewButton_2);
	}

}
