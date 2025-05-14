package View;

import java.util.List;

import modelo.pertsona;

public class vista {
	public void mostrar(List<pertsona> lista) {
		if(lista == null) {
			System.out.println("Lista vacia");
			return;
		}
		
		for(pertsona p : lista) {
			System.out.println("NAN: "+ p.getNAN() + "Izena: "+ p.getIzena()+ "Abizena: "+ p.getAbizena()+ "Rola: "+ p.getRola()+ "Emaila: "+ p.getEmaila()+ "Telefonoa: "+ p.getTelefonoa()+ "Pasahitza: "+ p.getPasahitza()) ;
		}
	}
}
