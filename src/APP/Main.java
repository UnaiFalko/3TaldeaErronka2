package APP;

import java.sql.SQLException;
import java.util.Scanner;

import Controller.ControladorUsuario;
import modelo.pertsona;
import modelo.reserva;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import org.w3c.dom.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

public class Main {

	public static void main(String[] args) {
	
		       List<reserva> reservas = leerXML("C:\\Users\\1AW3-8\\Downloads\\reserva.xml");
		        mostrarTabla(reservas);
		    }

		    public static List<reserva> leerXML(String ruta) {
		        List<reserva> reservas = new ArrayList<>();

		        try {
		            File archivoXML = new File(ruta);
		            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		            Document doc = dBuilder.parse(archivoXML);
		            doc.getDocumentElement().normalize();
		            Element root = doc.getDocumentElement();
		            NodeList nList = doc.getElementsByTagName("reserva");
		            for (int i = 0; i < nList.getLength(); i++) {
		            Node node = nList.item(i); 
		            if (node.getNodeType() == Node.ELEMENT_NODE) {
		            	Element elem = (Element) node;
		            	int id_sesion = Integer.parseInt(elem.getElementsByTagName("id_sesion").item(0).getTextContent());
	                    String nombre = elem.getElementsByTagName("nombre").item(0).getTextContent();
	                    String apellido = elem.getElementsByTagName("apellido").item(0).getTextContent();
	                    String dni = elem.getElementsByTagName("dni").item(0).getTextContent();
	                    String metodoPago = elem.getElementsByTagName("metodoPago").item(0).getTextContent();
	                    reserva r = new reserva(id_sesion, nombre, apellido, dni, metodoPago);
	                    System.out.println(r);
	                    reservas.add(r);
	                    System.out.println("ahora"+ reservas.size());
		            }}

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
		}

=======
	public static void main(String[] args) throws SQLException {
		ControladorUsuario controlador = new ControladorUsuario();
		controlador.mostrarTodos();
		Scanner sc = new Scanner(System.in);
		do {
			Menuaerakutsi();
		}
	}
	
}
