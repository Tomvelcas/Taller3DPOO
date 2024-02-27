package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	//atributos
	private String codigo;
	private int tarifa;		
	private boolean usado;
	private Cliente cliente;
	private Vuelo vuelo;
	//ctor
	public Tiquete(String codigo,Vuelo vuelo, Cliente clienteComprador, int tarifa) {
		super();
		this.codigo = codigo;
		this.vuelo = vuelo;
		this.cliente = clienteComprador;
		this.tarifa = tarifa;

	}
	//getters
	public Cliente getCliente() {
		return null;
	}
	public Vuelo getVuelo() {
		return null;
	}
	public String getCodigo() {
		return codigo;
	}
	public int getTarifa() {
		return tarifa;
	}
	
	
	
}
