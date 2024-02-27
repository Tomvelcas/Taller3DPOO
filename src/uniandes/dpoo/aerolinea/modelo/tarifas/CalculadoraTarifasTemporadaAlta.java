package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas  {
//	atributos
	protected int COSTO_POR_KM = 1000;
//	metodos
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return -1;
	}
	public double calcularPorcentajeDescuento(Cliente cliente) {
		return -1;
	}
	
}
