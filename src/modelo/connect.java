package modelo;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

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
				}}
			}

			
			public void pertsonaezabatu(String dniberria) throws SQLException {
				Connection dbConnection = null;
				Statement statement = null;
				pertsona per = new pertsona();
				ErabiltzaileaEditatu ered = new ErabiltzaileaEditatu();
				
				ered.erabilitakodnia = dniberria; 

					String deleteTableSQL = "DELETE FROM persona WHERE DNI = '" + dniberria + "'";
					
					try {
						dbConnection = conexion();
						statement = dbConnection.createStatement();
						statement.executeUpdate(deleteTableSQL);
					
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
			public static void saioakdeskargatu () throws ParserConfigurationException, SQLException, TransformerException {
				// Nombre del archivo XML de salida
				String xmlFile = "descargadatos.xml";

				// Crear el documento XML
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder db = dbf.newDocumentBuilder();
				Document doc = db.newDocument();

				// Crear el elemento raíz
				Element root = doc.createElement("Representaciones");
				doc.appendChild(root);

				// Establecer la conexión a la base de datos
				try {
					Connection con = conexion();
					Statement st = con.createStatement();
					String query = "SELECT * FROM representacion";
					ResultSet rs = st.executeQuery(query);



						while (rs.next()) {
							// Crear un elemento "usuario" para cada fila
							Element idRepresentacion = doc.createElement("idRepresentacion");
							root.appendChild(idRepresentacion);

							// Crear elementos para los atributos
							Element cifteatro = doc.createElement("cifteatro");
							cifteatro.appendChild(doc.createTextNode(rs.getString("cifteatro")));
							idRepresentacion.appendChild(cifteatro);

							Element idobra = doc.createElement("idobra");
							idobra.appendChild(doc.createTextNode(rs.getString("idobra")));
							idRepresentacion.appendChild(idobra);

							Element hora = doc.createElement("hora");
							idobra.appendChild(doc.createTextNode(rs.getString("hora")));
							idRepresentacion.appendChild(hora);

							Element dia = doc.createElement("dia");
							idobra.appendChild(doc.createTextNode(rs.getString("dia")));
							idRepresentacion.appendChild(dia);
							
							Element aforo = doc.createElement("aforo");
							idobra.appendChild(doc.createTextNode(rs.getString("aforo")));
							idRepresentacion.appendChild(aforo);
					}

					// Escribir el documento XML a un archivo
					TransformerFactory transformerFactory = TransformerFactory.newInstance();
					Transformer transformer = transformerFactory.newTransformer();
					DOMSource source = new DOMSource(doc);
					StreamResult result = new StreamResult(new File(xmlFile));
					transformer.transform(source, result);

					System.out.println("Archivo XML creado: " + xmlFile);

				} finally {
				}
			}
			

}
