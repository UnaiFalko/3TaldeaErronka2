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

	}
