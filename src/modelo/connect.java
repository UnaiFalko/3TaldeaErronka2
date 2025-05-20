package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;

import View.ErabiltzaileaEditatu;

public class connect {

	private Connection conexion() {
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

}}
