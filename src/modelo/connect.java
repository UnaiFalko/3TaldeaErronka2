package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

public class connect {

	    private Connection conexion() {
	        String url = "jdbc:mysql://localhost:3306/reservaentradas";
	        String username = "root";
	        String password = "";
	        Connection conexion = null;
	        
	        
	        try {
	           conexion = DriverManager.getConnection(url, username, password);
	            //System.out.println("Datu basera konektatuta");
	            
	        } catch (SQLException e) {
	            System.out.println("Errorea konektatzen " + e.getMessage());
	        }
	 
	        return conexion;
	    }
	    public List<pertsona> getAll() throws SQLException{
        	List<pertsona> lista = new ArrayList<>();
        	Connection con = conexion();
 	        Statement st = con.createStatement();
 	       ResultSet resultSet = (ResultSet) st.executeQuery("SELECT * FROM persona;");
 	        
 	        
 	        while (resultSet.next()) {
 	            String NAN = resultSet.getString("DNI");
 	            String izena= resultSet.getString("nombre");
 	            String abizena= resultSet.getString("apellido");
 	            String rola= resultSet.getString("rol");
 	            String emaila= resultSet.getString("email");
 	            int telefonoa = resultSet.getInt("telefono");
 	            String pasahitza= resultSet.getString("contrasenya");
 	            pertsona p = new pertsona(NAN, izena, abizena, rola, emaila,telefonoa,pasahitza);
 	            lista.add(p);
 	        }
        	return lista;
        	
	    }
	    public void insertar_persona(String NAN, String izena, String abizena, String rola, String emaila, int telefonoa,String pasahitza) throws SQLException {

	        // como hago para insertar los parametro de entrada a la tabla personas
	    Connection dbConnection = null;
	    Statement statement = null;

	    String insertTableSQL = "INSERT INTO persona "
	            + "(DNI, nombre, apellido, rol, email, telefono,contraseña"
	            + "VALUES"
	            + "(" + NAN + "," + izena + "," + abizena + "," + rola + "," + emaila + "," + telefonoa +","+ pasahitza +  ")";

	    try {
	        dbConnection = conexion();
	        statement = dbConnection.createStatement();

	        // execute insert SQL stetement
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
}

	    
	    


