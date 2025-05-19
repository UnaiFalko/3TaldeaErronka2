package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.connect;
import modelo.pertsona;

import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

public class ErabiltzaileaEditatu extends JFrame {
	
	connect conexion = new connect();
	pertsona personita = new pertsona();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JComboBox<String> comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErabiltzaileaEditatu frame = new ErabiltzaileaEditatu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public ErabiltzaileaEditatu() throws SQLException {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\1AW3-8\\Downloads\\Taldea1-20250513T103019Z-001\\Taldea1\\argazkiak\\Logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAN");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(24, 40, 48, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Erabiltzaileak Editatu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(134, 10, 141, 13);
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
		
		JButton btnNewButton = new JButton("Editatu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(170, 242, 85, 21);
		contentPane.add(btnNewButton);
		
		comboBox = new JComboBox();
		comboBox.setBounds(94, 40, 96, 21);
		
		contentPane.add(comboBox);
		List<pertsona> lista = conexion.getAll();
		for (pertsona p : lista) {
			comboBox.addItem(p.getNAN());
		}
		conexion.getAll().get(conexion.getAll().size()-2);
		
		
	
	
	
	btnNewButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			
			pertsona per = new pertsona();
			per.setIzena(textField.getText());
			per.setAbizena(textField_1.getText());
			per.setRola(textField_2.getText());
			per.setEmaila(textField_3.getText());
			per.setTelefonoa(Integer.parseInt(textField_4.getText()));
			per.setPasahitza(textField_5.getText());
			
		
			
			
			connect Con=new connect();
//			per.setNAN(txtJJ.getText());
			//System.out.println(per.setNAN(txtJJ.getText()));
			try {
				Con.pertsonaeditatu(textField.getText(),  textField_1.getText(),  textField_2.getText(),  textField_3.getText(), Integer.parseInt(textField_4.getText())  , textField_5.getText());
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			System.exit(0);
		}
	});
}
}
