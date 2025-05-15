package APP;

import java.sql.SQLException;
import java.util.Scanner;

import Controller.ControladorUsuario;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

public class Main {
	public static void main(String[] args) throws SQLException {
		ControladorUsuario controlador = new ControladorUsuario();
		controlador.mostrarTodos();
		Scanner sc = new Scanner(System.in);
		do {
			Menuaerakutsi();
		}
	}
	
}
