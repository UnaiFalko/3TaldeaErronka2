package APP;

import java.sql.SQLException;

import Controller.ControladorUsuario;

public class Main {
	public static void main(String[] args) throws SQLException {
		ControladorUsuario controlador = new ControladorUsuario();
		controlador.mostrarTodos();
	}
}
