package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente {
	//atributos
	public String NATURAL = "Natural";
	private String nombre;
	
	//ctor
	
	public ClienteNatural(String nombre) {
		super();
		this.nombre = nombre;
	}
	//getters

	public String getIdentificador() {
		return null;
	}
	public String getTipoCliente() {
		return null;
	}
    
}
