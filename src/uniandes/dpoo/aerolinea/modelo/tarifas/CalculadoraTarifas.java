package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {
	//atributos
	// Atributos
	public double IMPUESTO = 0.28;

	// Métodos
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
	    double costoBase = calcularCostoBase(vuelo, cliente); 
	    double porcentajeDescuento = calcularPorcentajeDescuento(cliente); 

	    double costoDespuesDeDescuento = costoBase - (costoBase * porcentajeDescuento);
	    double tarifaFinal = costoDespuesDeDescuento + calcularValorImpuestos((int)costoDespuesDeDescuento);
	    return (int) tarifaFinal;
	}

	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);

	protected abstract double calcularPorcentajeDescuento(Cliente cliente);

	protected int calcularValorImpuestos(int costoBase) {
	    double impuesto = costoBase * IMPUESTO;
	    return (int) impuesto;
		}
	}