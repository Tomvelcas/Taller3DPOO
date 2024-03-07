package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.GeneradorTiquetes;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	//atributos
	private String fecha;
	private Avion avion;
	private Ruta ruta;
	private Map<String, Tiquete> ticket;
	//metodos
	public Vuelo(String fecha, Avion avion, Ruta ruta) {
		this.fecha = fecha;
		this.avion = avion;
		this.ruta = ruta;
		ticket = new HashMap<String, Tiquete>();
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
	public Collection <Tiquete> getTiquetes() {
		return ticket.values();
	}
	
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) throws VueloSobrevendidoException {
	    int totalTiquetes = ticket.size() + cantidad;
	    
	    if (totalTiquetes <= avion.getCapacidad()) {
	    	
	        int tarifaIndividual = calculadora.calcularTarifa(this, cliente);
	        int precio = tarifaIndividual * cantidad;
	        
	        for (int i = 0; i < cantidad; i++) {
	            Tiquete nuevoTiquete = GeneradorTiquetes.generarTiquete(this, cliente, tarifaIndividual);
	            ticket.put(nuevoTiquete.getCodigo(), nuevoTiquete);
	            cliente.agregarTiquete(nuevoTiquete);
	            GeneradorTiquetes.registrarTiquete(nuevoTiquete);
	        }
	        return precio;
	    } else {
	        throw new VueloSobrevendidoException(this);
	    }
	}

	
	public boolean equals (Object obj) {
		return super.equals(obj);
	}

}
