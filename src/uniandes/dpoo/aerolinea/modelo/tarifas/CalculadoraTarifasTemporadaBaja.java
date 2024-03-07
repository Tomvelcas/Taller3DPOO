package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;
import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas{
//	atributos
	protected int COSTO_POR_KM_NATURAL = 600;
	protected int COSTO_POR_KM_CORPORATIVO = 900;
	protected double DESCUENTO_PEQ = 0.02;
	protected double DESCUENTO_MEDIANAS = 0.1;
	protected double DESCUENTO_GRANDES = 0.2;
//	metodos
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
	    Aeropuerto origen = vuelo.getRuta().getOrigen();
	    Aeropuerto destino = vuelo.getRuta().getDestino();
	    int distancia = Aeropuerto.calcularDistancia(origen, destino);
	    int costoBase;

	    if (cliente.getTipoCliente().equals("Natural")) {
	        costoBase = distancia * COSTO_POR_KM_NATURAL;
	    } else {
	        costoBase = distancia * COSTO_POR_KM_CORPORATIVO;
	    }

	    return costoBase;
	}

	public double calcularPorcentajeDescuento(Cliente cliente) {
	    double porcentajeDescuento = 0;

	    if (cliente.getTipoCliente().equals("Corporativo")) {
	        ClienteCorporativo clienteCorporativo = (ClienteCorporativo) cliente;
	        int tamanoEmpresa = clienteCorporativo.getTamanoEmpresa();

	        if (tamanoEmpresa == 1) {
	            porcentajeDescuento = DESCUENTO_GRANDES;
	        } else if (tamanoEmpresa == 2) {
	            porcentajeDescuento = DESCUENTO_MEDIANAS;
	        } else if (tamanoEmpresa == 3) {
	            porcentajeDescuento = DESCUENTO_PEQ;
	        }
	    }

	    return porcentajeDescuento;
		}

	}



