package View;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.connect;
import modelo.pertsona;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JLabel;
import java.awt.Font;

public class ErabiltzaileaEzabatu extends JFrame {
	
	connect conexion = new connect();
	pertsona personita = new pertsona();
	public String erabilitakodnia;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErabiltzaileaEzabatu frame = new ErabiltzaileaEzabatu();
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
	public ErabiltzaileaEzabatu() throws SQLException {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\1AW3-8\\Downloads\\Taldea1-20250513T103019Z-001\\Taldea1\\argazkiak\\Logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("      NAN");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(165, 118, 90, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Erabiltzaileak Ezabatu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(134, 10, 167, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("EZABATU");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				connect Con=new connect();
				try {
					Con.pertsonaezabatu(erabilitakodnia);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				System.exit(0);
				
			}
		});
		btnNewButton.setBounds(170, 202, 85, 21);
		contentPane.add(btnNewButton);
		
		JComboBox<String> comboBox = new JComboBox();
		comboBox.setBounds(165, 149, 96, 21);
		
		contentPane.add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				    erabilitakodnia = comboBox.getSelectedItem().toString();
			} 
		} 
		); 
		List<pertsona> lista = conexion.getAll();
		for (pertsona p : lista) {
			comboBox.addItem(p.getNAN());
		}
		conexion.getAll().get(conexion.getAll().size()-2);
		
		
	        }
	
	
}
