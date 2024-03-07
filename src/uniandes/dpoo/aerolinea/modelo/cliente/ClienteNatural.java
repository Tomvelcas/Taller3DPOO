package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente {
	//atributos
	public String NATURAL = "Natural";
	private String nombre;
	private String id;
	
	//ctor
	
	public ClienteNatural(String nombre) {
		super();
		this.nombre = nombre;
		this.id = ids();
	}
	//getters

	public String getIdentificador() {
		return id;
	}
	public String getTipoCliente() {
		return NATURAL;
	}
	public String ids() {
	    int numero;
	    String codigo;
	    numero = (int) (Math.random() * 10e7);
	    codigo = String.format("C%07d", numero); 

	    while (codigos.contains(codigo)) {
	        numero = (int) (Math.random() * 10e7);
	        codigo = String.format("C%07d", numero);
	    }

	    codigos.add(codigo); 
	    return codigo;
	}
}
