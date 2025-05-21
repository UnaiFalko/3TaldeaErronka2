package modelo;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import View.ErabiltzaileaEditatu;


public class connect {

	public static Connection conexion() {
		String url = "jdbc:mysql://localhost:3306/reservaentradas";
		String username = "root";
		String password = "";
		Connection conexion = null;

		try {
			conexion = DriverManager.getConnection(url, username, password);
			// System.out.println("Datu basera konektatuta");

		} catch (SQLException e) {
			System.out.println("Errorea konektatzen " + e.getMessage());
		}

		return conexion;
	}

	public List<pertsona> getAll() throws SQLException {
		List<pertsona> lista = new ArrayList<>();
		Connection con = conexion();
		Statement st = con.createStatement();
		ResultSet resultSet = (ResultSet) st.executeQuery("SELECT * FROM persona;");

		while (resultSet.next()) {
			String NAN = resultSet.getString("DNI");
			String izena = resultSet.getString("nombre");
			String abizena = resultSet.getString("apellido");
			String rola = resultSet.getString("rol");
			String emaila = resultSet.getString("email");
			int telefonoa = resultSet.getInt("telefono");
			String pasahitza = resultSet.getString("contrasenya");
			pertsona p = new pertsona(NAN, izena, abizena, rola, emaila, telefonoa, pasahitza);
			lista.add(p);
		}
		return lista;

	}

	public List<pertsona> dniak() throws SQLException {
		List<pertsona> lista = new ArrayList<>();
		Connection con = conexion();
		Statement st = con.createStatement();
		ResultSet resultSet = (ResultSet) st.executeQuery("SELECT dni FROM persona;");
		return lista;
	}

	public void pertsonaSortu(connect con, String NAN, String izena, String abizena, String rola, String emaila,
			int telefonoa, String pasahitza) throws SQLException {

		Connection dbConnection = null;
		Statement statement = null;

		String insertTableSQL = "INSERT INTO persona (DNI, nombre, apellido, rol, email, telefono, contrasenya) "
				+ "VALUES ('" + NAN + "', '" + izena + "', '" + abizena + "', '" + rola + "', '" + emaila + "', "
				+ telefonoa + ", '" + pasahitza + "')";
		try {
			dbConnection = conexion();
			statement = dbConnection.createStatement();
			statement.executeUpdate(insertTableSQL);

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (statement != null) {
				statement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}
		}

	}

	public void pertsonaeditatu(String izena, String abizena, String rola, String emaila, int telefonoa,
			String pasahitza, String dniberria) throws SQLException {
		Connection dbConnection = null;
		Statement statement = null;
		pertsona per = new pertsona();
		ErabiltzaileaEditatu ered = new ErabiltzaileaEditatu();
		
		ered.erabilitakodnia = dniberria; 

				String updateTableSQL = "UPDATE persona SET " + "nombre = '" + izena + "', " + "apellido = '" + abizena
						+ "', " + "rol = '" + rola + "', " + "email = '" + emaila + "', " + "telefono = '" + telefonoa
						+ "', " + "contrasenya = '" + pasahitza + "' " + "WHERE DNI = '" + dniberria + "'";
				
			
			try {
				dbConnection = conexion();
				statement = dbConnection.createStatement();
				statement.executeUpdate(updateTableSQL);
			
			}
			 catch (SQLException e) {

				System.out.println(e.getMessage());

			} finally {

				if (statement != null) {
					statement.close();
				}

				if (dbConnection != null) {
					dbConnection.close();
				}
			}

}
	public Object[][] getTableData() throws SQLException {
		Object[][] data = new Object[this.getAll().size()][7];
		
		for(int i = 0; i < getAll().size(); i ++) {
			
			data[i][0] = getAll().get(i).getNAN();
			data[i][1] = getAll().get(i).getIzena();
			data[i][2] = getAll().get(i).getAbizena();
			data[i][3] = getAll().get(i).getRola();
			data[i][4] = getAll().get(i).getEmaila();
			data[i][5] = getAll().get(i).getTelefonoa();
			data[i][6] = getAll().get(i).getPasahitza();
		}
		
		return data;
	}
	
	
	
	
	    //ErabiltzaileakIkusi
	    public static void mostrarTabla(List<reserva> reservas) {
	        String[] columnas = {"id_sesion", "nombre", "apellido", "dni", "metodoPago"};
	        DefaultTableModel modelo = new DefaultTableModel(columnas, 0
	        		);

	        for (reserva r : reservas) {
	            Object[] fila = {r.getId_sesion(), r.getNombre(), r.getApellido(), r.getDni(), r.getMetodoPago()};
	            modelo.addRow(fila);
	        }

	        JTable tabla = new JTable(modelo);
	        JScrollPane scrollPane = new JScrollPane(tabla);

	        JFrame frame = new JFrame("Datos del XML");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.add(scrollPane);
	        frame.setSize(900, 300);
	        frame.setVisible(true);
	    }
	    
	    public List<reserva> parsearXML(File archivo) {
	        List<reserva> reservas = new ArrayList<>();
	        try {
	            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	            Document doc = dBuilder.parse(archivo);
	            doc.getDocumentElement().normalize();

	            NodeList nList = doc.getElementsByTagName("reserva");

	            for (int i = 0; i < nList.getLength(); i++) {
	                Node nodo = nList.item(i);

	                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
	                    Element elem = (Element) nodo;

	                    int id_sesion = Integer.parseInt(elem.getElementsByTagName("id_sesion").item(0).getTextContent());
	                    String nombre = elem.getElementsByTagName("nombre").item(0).getTextContent();
	                    String apellido = elem.getElementsByTagName("apellido").item(0).getTextContent();
	                    String dni = elem.getElementsByTagName("dni").item(0).getTextContent();
	                    String metodoPago = elem.getElementsByTagName("metodoPago").item(0).getTextContent();
	                    reserva r = new reserva(id_sesion, nombre, apellido, dni, metodoPago);

	                    reservas.add(new reserva(id_sesion, nombre, apellido, dni, metodoPago));
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return reservas;
	    }
	    
	    //Reserva gehitu Datu Basera
	    public static void insertarReserva(int idRepresentacion, String apellido, String dni, String metodoPago, String nombre) {
	    	String url = "jdbc:mysql://localhost:3306/reservaentradas";
			String username = "root";
			String password = "";
			Connection conexion = null;

			try {
				conexion = DriverManager.getConnection(url, username, password);
	            
	            String checkDNI = "SELECT * FROM persona WHERE DNI = ?";
	            PreparedStatement checkStmt = conexion.prepareStatement(checkDNI);
	            checkStmt.setString(1, dni);
	            ResultSet rs = checkStmt.executeQuery();

	            
	            if (!rs.next()) {
	                String insertPersona = "INSERT INTO persona (DNI, nombre, apellido) VALUES (?, ?, ?)";
	                PreparedStatement insertStmt = conexion.prepareStatement(insertPersona);
	                insertStmt.setString(1, dni);
	                insertStmt.setString(2, nombre);
	                insertStmt.setString(3, apellido);
	                insertStmt.executeUpdate();
	                insertStmt.close();
	            }

	           
	            String insertReserva = "INSERT INTO reserva (nombre, apellido, dni, metodoPago) VALUES (?, ?, ?, ?)";
	            PreparedStatement reservaStmt = conexion.prepareStatement(insertReserva);
	            reservaStmt.setString(1, nombre);
	            reservaStmt.setString(2, apellido);
	            reservaStmt.setString(3, dni);
	            reservaStmt.setString(4, metodoPago);
	            reservaStmt.executeUpdate();

	            reservaStmt.close();
	            checkStmt.close();
	            conexion.close();

	            JOptionPane.showMessageDialog(null, "Erreserbatuta.");

	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, "Errorea Erreserbatzen: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
	    public List<pertsona> kargatuSegurtasunKopia(String ruta) throws FileNotFoundException, IOException {
			List<pertsona> lista = new ArrayList<>();
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta)) ) {
				lista = (List<pertsona>) ois.readObject();
				System.out.println("Copia de seguridad cargada");
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			return lista;
		}
	    
}