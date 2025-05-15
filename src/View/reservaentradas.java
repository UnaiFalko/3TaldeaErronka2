package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

public class reservaentradas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

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

	public class FiltroDeXML extends FileFilter
	{
	   public boolean accept (File fichero)
	   {
	      return fichero.getName().endsWith(".xml");
	   }
	   public String getDescription()
	   {
	      return ("Filtro XML");
	   }
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
		btnNewButton.setBounds(10, 219, 167, 21);
		contentPane.add(btnNewButton);
		
		JButton btnErreserbakGehitu = new JButton("ERRESERBAK GEHITU:");
		btnErreserbakGehitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileFilter(new FiltroDeXML());
				int seleccion = fileChooser.showOpenDialog(getParent());
				
			}
		});
		btnErreserbakGehitu.setBounds(259, 219, 167, 21);
		contentPane.add(btnErreserbakGehitu);
		table = new JTable();
		table.setBounds(26, 70, 381, 129);
		contentPane.add(table);
		DefaultTableModel model = new DefaultTableModel();
		table.setModel(model);
		
		model.addColumn("ID_SESION");
		model.addColumn("paco");
		model.addColumn("Abizena");
		model.addColumn("NAN");
		model.addColumn("Ordaintze Metodoa");
		model.addRow(new Object[]{"1", "Kepa", "Capipe", "12345678P", "Paypal"});
		model.addRow(new Object[]{"2", "Unai", "Garralon", "32414425G", "Visa"});
		model.addRow(new Object[]{"3", "Ekain", "Calvinho", "89204294K", "Visa"});
		model.addRow(new Object[]{"4", "JeanCarlo", "Toro", "323486597", "Mastercard"});
		/**/
		table_1 = new JTable();
		table_1.setBounds(26, 54, 381, 21);
		contentPane.add(table_1);
		DefaultTableModel model1 = new DefaultTableModel();
		table_1.setModel(model1);
		model1.addColumn("1");
		model1.addColumn("2");
		model1.addColumn("3");
		model1.addColumn("4");
		model1.addColumn("5");
		model1.addRow(new Object[]{"ID_SESION", "Izena", "Abizena", "NAN", "Ordaintze Metodoa"});
        
		
	}
}
