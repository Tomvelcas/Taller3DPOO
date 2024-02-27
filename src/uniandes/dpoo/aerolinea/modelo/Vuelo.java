package uniandes.dpoo.aerolinea.modelo;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;

public class Vuelo {
	//atributos
	private String fecha;
	private Avion avion;
	private Ruta ruta;
	//metodos
	public Vuelo(String fecha, Avion avion, Ruta ruta) {
		super();
		this.fecha = fecha;
		this.avion = avion;
		this.ruta = ruta;
	}
	//getters
	public String getFecha() {
		return fecha;
	}
	public Avion getAvion() {
		return avion;
	}
	public Ruta getRuta() {
		return ruta;
	}
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		return -1;
	}
	
	public boolean equals (Object obj) {
		return false;
	}
}
