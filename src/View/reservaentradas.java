package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Controller.connect;
import modelo.reserva;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Toolkit;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

public class reservaentradas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	reserva paco  = new reserva();
	connect conexion = new connect();
	private DefaultTableModel model;
	

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
 
					reservaentradas ventana = new reservaentradas();
					ventana.setVisible(true);
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
	 * @throws SQLException 
	 */
	public reservaentradas() throws SQLException {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\1AW3-25\\Downloads\\Taldea1-20250513T103019Z-001\\Taldea1\\argazkiak\\Logo.png"));
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
		    	fileChooser.setDialogTitle("XML");
		    	fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos XML", "xml"));
		    	fileChooser.setAcceptAllFileFilterUsed(false);

		    	int seleccion = fileChooser.showOpenDialog(null);
		    	if (seleccion == JFileChooser.APPROVE_OPTION) {
		    	    File archivoXML = fileChooser.getSelectedFile();

		    	    List<reserva> reservas = conexion.parsearXML(archivoXML);

		    	    DefaultTableModel model = (DefaultTableModel) table.getModel();
		    	    

		    	    for (reserva r : reservas) {
		    	        Object[] fila = {
		    	            r.getId_sesion(), r.getNombre(), r.getApellido(), r.getDni(), r.getMetodoPago()
		    	        };
		    	        model.addRow(fila);
		    	    
		    	   Controller.connect.insertarReserva(r.getId_sesion(), r.getNombre(), r.getApellido(), r.getDni(), r.getMetodoPago());
		    	    
		    	   
		    	}
		    	}
		    }
		});

		btnErreserbakGehitu.setBounds(259, 219, 167, 21);
		contentPane.add(btnErreserbakGehitu);
		String[] columnas = {"ID Sesion","Nombre","Apellido","DNI","MetodoPago"};
		DefaultTableModel model = new DefaultTableModel(columnas,0);
		table = new JTable();
		table.setBounds(26, 70, 381, 129);
		table.setModel(model);
		contentPane.add(table);
		connect.reservakIkusi();
		
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