package Controller;
import modelo.connect;
import modelo.pertsona;
	import View.vista;

import java.sql.SQLException;
import java.util.List;
public class ControladorUsuario {

	

	    private connect con;
	    private vista vista;

	    public ControladorUsuario() {
	        con = new connect();
	        vista = new vista();
	    }

	    public void mostrarTodos() throws SQLException {
	    	connect db = new connect();
	        List<pertsona> lista = db.getAll();
	        vista v = new vista();
	        v.mostrar(lista);
	    }
	}
