package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import View.ErabiltzaileaEditatu;
import modelo.pertsona;
import modelo.reserva;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;

public class connect {

	/**
	 * Datubaseagaz konexioa hartzen duen metodoa da hau,beharrezkoa da.
	 * @return conexion
	 */
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
	
	/**
	 * Pertsona klasearen atributu guztiak hartzen duen metodoa da
	 * @return lista
	 * @throws SQLException SQL-ren errorea
	 */
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
	/**
	 * Pertsonatik dniak aukeratzeko behar den metodoa da hau
	 * @return lista
	 * @throws SQLException SQL-ren errorea
	 */
	public List<pertsona> dniak() throws SQLException {
		List<pertsona> lista = new ArrayList<>();
		Connection con = conexion();
		Statement st = con.createStatement();
		ResultSet resultSet = (ResultSet) st.executeQuery("SELECT dni FROM persona;");
		return lista;
	}
		/**
		 * Pertsona berri bat sortzeko behar den metodoa da hau
		 * @param con conexiño motako atributua da
		 * @param NAN Pertsonak-en String motako atributua
		 * @param izena Pertsonak-en String motako atributua
		 * @param abizena Pertsonak-en String motako atributua
		 * @param rola Pertsonak-en String motako atributua
		 * @param emaila Pertsonak-en String motako atributua
		 * @param telefonoa Pertsonak-en Int motako atributua
		 * @param pasahitza Pertsonak-en String motako atributua
		 * @throws SQLException SQLak errorea ematen badu detektatzeko erabiltzen dena
		 */
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
	/**
	 * Pertsona editatzeko erabiltzen den metodoa
	 * @param izena Pertsonak-en String motako atributua
	 * @param abizena Pertsonak-en String motako atributua
	 * @param rola Pertsonak-en String motako atributua
	 * @param emaila Pertsonak-en String motako atributua
	 * @param telefonoa Pertsonak-en String motako atributua
	 * @param pasahitza Pertsonak-en String motako atributua
	 * @param dniberria DNI berria gordetzeko erabiltzen den atributua
	 * @throws SQLException SQLak errorea ematen badu detektatzeko erabiltzen dena
	 */
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

			/**
			 * Pertsona klasea ezabatzeko erabiltzen den metodoa
			 * @param dniberria DNI berria gordetzeko erabiltzen den atributua
			 * @throws SQLException SQLak errorea ematen badu detektatzeko erabiltzen dena		
			 */
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
			/**
			 * XMl-a exportatzekoe erabiltzen den metodoa
			 * @throws ParserConfigurationException metodoak eman ahal duen errore bat
			 * @throws SQLException SQLak errorea ematen badu detektatzeko erabiltzen dena		
			 * @throws TransformerException metodoak eman ahal duen errore bat
			 */
			public static void saioakdeskargatu () throws ParserConfigurationException, SQLException, TransformerException {
				// Nombre del archivo XML de salida
				String xmlFile = "descargadatos.xml";

				// Crear el documento XML
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder db = dbf.newDocumentBuilder();
				Document doc = db.newDocument();

				// Crear el elemento raíz
				Element root = doc.createElement("teatro");
				doc.appendChild(root);

				// Establecer la conexión a la base de datos
				try {
					Connection con = conexion();
					Statement st = con.createStatement();
					String query = "SELECT * FROM representacion";
					ResultSet rs = st.executeQuery(query);



						while (rs.next()) {
							// Crear un elemento para cada fila
							Element idRepresentacion = doc.createElement("representacion");
							root.appendChild(idRepresentacion);

							// Crear elementos para los atributos
							Element cifteatro = doc.createElement("codigo");
							cifteatro.appendChild(doc.createTextNode(rs.getString("cifteatro")));
							idRepresentacion.appendChild(cifteatro);

							Element idobra = doc.createElement("idsesion");
							idobra.appendChild(doc.createTextNode(rs.getString("idobra")));
							idRepresentacion.appendChild(idobra);

							Element hora = doc.createElement("hora");
							hora.appendChild(doc.createTextNode(rs.getString("hora")));
							idRepresentacion.appendChild(hora);

							Element dia = doc.createElement("dia");
							dia.appendChild(doc.createTextNode(rs.getString("dia")));
							idRepresentacion.appendChild(dia);
							
							Element aforo = doc.createElement("aforo");
							aforo.appendChild(doc.createTextNode(rs.getString("aforo")));
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
			/**
			 * Reserva datubasera gehitzeko erabiltzen den metodoa da hau
			 * @param idRepresentacion irudikapena klaseko int motako bariablea
			 * @param apellido Pertsona klaseko String motako bariablea
			 * @param dni Pertsona klaseko String motako bariablea
			 * @param metodoPago Reserva klaseko String motako bariablea
			 * @param nombre Pertsona klaseko String motako bariablea
			 */
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
		    /**
		     * XML archivoa detektatzeko erabiltzen den metodoa da hau
		     * @param archivo XML importatutako archivoa
		     * @return reserva
		     */
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
		    
		    /**
		     * Segurtasun kopia gordetzen duen metodoa da hau
		     * @throws SQLException SQL txarto badago eman ahal duen errorea da.
		     */
		    
		    public static void sekurtasunagorde() throws SQLException {

		   
		        try {
		            FileOutputStream fos = new FileOutputStream("Sekurtasunkopia");
		            ObjectOutputStream idatzi = new ObjectOutputStream(fos);
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
		    			
		            for (int i = 0; i < lista.size(); i++) {
		                idatzi.writeObject(lista);
		            }
		            idatzi.close();
		            fos.close();
		    		}

		        } catch (Exception e) {
		            System.out.println("Ez da ondo sortu " + e.getMessage());
		        }
		    }
		    
	    	/**
	    	 * Binairoa kargatzen duen metodoa da hau
	    	 * @param tableModel salbuespenak kontrolatzeko erabiliko dugu
	    	 * @throws IOException salbuespenak kontrolatzeko erabiliko dugu
	    	 * @throws ClassNotFoundException salbuespenak kontrolatzeko erabiliko dugu
	    	 */
		    public static void binarioaKargatu(DefaultTableModel tableModel) throws IOException, ClassNotFoundException {

			 	 String filepath = "";
		            JFileChooser aukeratu = new JFileChooser();
		            aukeratu.setCurrentDirectory(new File("."));
		            int result = aukeratu.showOpenDialog(aukeratu);
		            if (result == JFileChooser.APPROVE_OPTION) {

		                File selectedFile = aukeratu.getSelectedFile();

		                filepath = selectedFile.getAbsolutePath();
		    	
		    	
		        try {
		            FileInputStream fis = new FileInputStream("");
		            ObjectInputStream leer;

		            while (fis.available() > 0) {
		                leer = new ObjectInputStream(fis);
		               
		                try {
				        FileOutputStream fos = new FileOutputStream("Sekurtasunkopia");
				        ObjectOutputStream idatzi = new ObjectOutputStream(fos);
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
			    			
			            for (int i = 0; i < lista.size(); i++) {
			                idatzi.writeObject(lista);
			            }
			            idatzi.close();
			            fos.close();
			    		}
		                
		                tableModel.setRowCount(0);
		                for (int i = 0; i < lista.size(); i++) {
		                    tableModel.addRow(new Object[] { lista.get(i).getNAN(), lista.get(i).getIzena(),
		                    lista.get(i).getAbizena(), lista.get(i).getRola(), lista.get(i).getEmaila(), 
		                    lista.get(i).getTelefonoa(), lista.get(i).getPasahitza() });
		                }
		                }finally {}

		            } } catch (Exception e) {
		            System.out.println("Datuak Ondo igo dira. ");

		        }

		    }
}}
