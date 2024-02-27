package uniandes.dpoo.aerolinea.modelo.cliente;
import java.util.LinkedList;
import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Avion;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	//atributos
	
	private List<Tiquete> tiquetesSinUsar;
	private List<Tiquete> tiquetesUsados;
	
	//metodos
	public Cliente() {
		tiquetesSinUsar = new LinkedList<Tiquete>( );
		tiquetesUsados = new LinkedList<Tiquete>( );
		
		
	}
	public String getTipoCliente() {
		return null;
	}
	public String getidentificador() {
		return null;
	}
	public void agregarTiquete(Tiquete tiquete) {
		
	}
	public int calcularValorTotaltiquetes() {
		return -1;
	}
	public void usarTiquetes(Vuelo vuelo) {
		
	}
}
