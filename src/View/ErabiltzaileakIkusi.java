package View;

import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import modelo.connect;
import modelo.pertsona;

import javax.swing.JTable;

public class ErabiltzaileakIkusi extends JFrame {
	connect conexion = new connect();
	pertsona personita = new pertsona();

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
					ErabiltzaileakIkusi frame = new ErabiltzaileakIkusi();
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
	public ErabiltzaileakIkusi() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(26, 70, 462, 201);
		contentPane.add(table);
		DefaultTableModel model = new DefaultTableModel();
		table.setModel(model);
		
		model.addColumn("NAN");
		model.addColumn("Izena");
		model.addColumn("Abizena");
		model.addColumn("Rola");
		model.addColumn("Emaila");
		model.addColumn("Telefonoa");
		model.addColumn("Pasahitza");
		model.addRow(new Object[]{});
		model.addRow(new Object[]{});
		model.addRow(new Object[]{});
		
		JTable table_1 = new JTable();
		table_1.setBounds(26, 54, 462, 21);
		contentPane.add(table_1);
		DefaultTableModel model1 = new DefaultTableModel();
		table_1.setModel(model1);
		model1.addColumn("1");
		model1.addColumn("2");
		model1.addColumn("3");
		model1.addColumn("4");
		model1.addColumn("5");
		model1.addColumn("6");
		model1.addColumn("6");
		model1.addRow(new Object[]{"NAN", "Izena", "Abizena", "Rola", "Emaila", "Telefonoa", "Pasahitza"});
		
		List<pertsona> lista = conexion.getAll();
		for (pertsona p : lista) {
			System.out.println(lista);
		}
		
		
		conexion.getAll().get(conexion.getAll().size()-2);
	}
}
