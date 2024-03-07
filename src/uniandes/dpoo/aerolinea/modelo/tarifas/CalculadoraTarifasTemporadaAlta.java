package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas  {
//	atributos
	protected int COSTO_POR_KM = 1000;
//	metodos
	public int calcularCostoBase (Vuelo vuelo, Cliente cliente) {
		Aeropuerto origen=vuelo.getRuta().getOrigen();
		Aeropuerto destino=vuelo.getRuta().getDestino();
		int d= Aeropuerto.calcularDistancia(origen,destino);
	
		return d*COSTO_POR_KM;
	}
	public double calcularPorcentajeDescuento(Cliente cliente) {
		//no importa si es corporativo o un cliente natural
		return 0;
	}
	
}
