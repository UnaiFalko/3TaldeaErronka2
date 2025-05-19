package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BBDD.FutbolistaConnect;
import Modelo.Futbolista;
import modelo.connect;
import modelo.pertsona;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

public class ErabiltzaileaGehitu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtJJ;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErabiltzaileaGehitu frame = new ErabiltzaileaGehitu();
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
	public ErabiltzaileaGehitu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\1AW3-8\\Downloads\\Taldea1-20250513T103019Z-001\\Taldea1\\argazkiak\\Logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtJJ = new JTextField();
		txtJJ.setBounds(94, 41, 96, 19);
		contentPane.add(txtJJ);
		txtJJ.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NAN");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(24, 40, 48, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Erabiltzaileak Gehitu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(149, 5, 141, 13);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(94, 70, 96, 19);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(94, 99, 96, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(94, 128, 96, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(94, 157, 96, 19);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(94, 184, 96, 19);
		contentPane.add(textField_4);
		
		JLabel lblIzena = new JLabel("Izena");
		lblIzena.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIzena.setBounds(24, 69, 48, 19);
		contentPane.add(lblIzena);
		
		JLabel lblAbizena = new JLabel("Abizena");
		lblAbizena.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAbizena.setBounds(24, 98, 48, 19);
		contentPane.add(lblAbizena);
		
		JLabel lblRola = new JLabel("Rola");
		lblRola.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRola.setBounds(24, 127, 48, 19);
		contentPane.add(lblRola);
		
		JLabel lblEmaila = new JLabel("Emaila");
		lblEmaila.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmaila.setBounds(24, 156, 48, 19);
		contentPane.add(lblEmaila);
		
		JLabel lblTelefonoa = new JLabel("Telefonoa");
		lblTelefonoa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTelefonoa.setBounds(24, 183, 60, 19);
		contentPane.add(lblTelefonoa);
		
		JLabel lblPasahitza = new JLabel("Pasahitza");
		lblPasahitza.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPasahitza.setBounds(24, 212, 60, 19);
		contentPane.add(lblPasahitza);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(94, 213, 96, 19);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("Gehitu");
		btnNewButton.setBounds(170, 242, 85, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				pertsona per = new pertsona();
				per.setNAN(txtJJ.getText());
				per.setIzena(textField.getText());
				per.setAbizena(textField_1.getText());
				per.setRola(textField_2.getText());
				per.setEmaila(textField_3.getText());
				per.setTelefonoa(Integer.parseInt(textField_4.getText()));
				per.setPasahitza(textField_5.getText());
			
				
				
				connect Con=new connect();
				System.out.println(txtJJ.getText());
//				per.setNAN(txtJJ.getText());
				//System.out.println(per.setNAN(txtJJ.getText()));
				try {
					Con.pertsonaSortu(Con, txtJJ.getText(), textField.getText(),  textField_1.getText(),  textField_2.getText(),  textField_3.getText(), Integer.parseInt(textField_4.getText())  , textField_5.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				System.exit(0);
			}
		});
	}
}
