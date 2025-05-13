package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class reservaentradas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reservaentradas frame = new reservaentradas();
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
	public reservaentradas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEn = new JLabel("Entradak Erreserbatu");
		lblEn.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblEn.setBounds(10, 24, 200, 21);
		contentPane.add(lblEn);
		
		JButton btnNewButton = new JButton("SAIOAK DESKARGATU");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 219, 133, 21);
		contentPane.add(btnNewButton);
		
		JButton btnErreserbakGehitu = new JButton("ERRESERBAK GEHITU");
		btnErreserbakGehitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnErreserbakGehitu.setBounds(293, 219, 133, 21);
		contentPane.add(btnErreserbakGehitu);
		table = new JTable();
		table.setBounds(26, 70, 381, 129);
		contentPane.add(table);
		DefaultTableModel model = new DefaultTableModel();
		table.setModel(model);
		model.addColumn("ID_SESION");
		model.addColumn("paco");
		model.addColumn("Abizena");
		model.addColumn("Ordaintze Metodoa");
		model.addRow(new Object[]{"Dato 1", "Dato 2", "Dato 3"});
        model.addRow(new Object[]{"Dato 4", "Dato 5", "Dato 6"});
        
		
	}
}
