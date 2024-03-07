package uniandes.dpoo.aerolinea.modelo.cliente;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	// atributos
	private List<Tiquete> tiquetesSinUsar;
	private List<Tiquete> tiquetesUsados;
	protected static Set<String> codigos = new HashSet<>(); 

	// ctor
	public Cliente() {
	    this.tiquetesSinUsar = new LinkedList<>(); 
	    this.tiquetesUsados = new LinkedList<>();
	}

	// métodos
	public List<Tiquete> getTiquetesSinUsar() {
	    return this.tiquetesSinUsar;
	}

	public abstract String getTipoCliente();

	public abstract String getIdentificador();

	public void agregarTiquete(Tiquete tiquete) {
	    this.tiquetesSinUsar.add(tiquete);
	}

	public int calcularValorTotalTiquetes() {
	    int sumatoria = 0;
	    for (Tiquete tiquete : this.tiquetesUsados) {
	        sumatoria += tiquete.getTarifa();
	    }
	    for (Tiquete tiquete : this.tiquetesSinUsar) {
	        sumatoria += tiquete.getTarifa();
	    }
	    
	    return sumatoria;
	}

	public void usarTiquetes (Vuelo vuelo) {
		
		for (Tiquete tiquete: vuelo.getTiquetes()) {
			if (tiquetesSinUsar.contains(tiquete)) {
				tiquete.marcarComoUsado();
				tiquetesSinUsar.remove(tiquete);
				tiquetesUsados.add(tiquete);
			}
		}

	}



}
