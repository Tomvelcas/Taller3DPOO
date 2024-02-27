package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {
	//atributos
	public double IMPUESTO = 0.28;
	//metodos
	public int calcularTarifa( Vuelo vuelo, Cliente cliente) {
		return -1;
	}
	protected  int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return -1;
	}
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		return -1;
	}
	protected int calcularDistanciaVuelo(Ruta ruta) {
		return -1;
	}
	protected int calcularValorImpuestos(int costoBase) {
		return -1;
	}
	
}
