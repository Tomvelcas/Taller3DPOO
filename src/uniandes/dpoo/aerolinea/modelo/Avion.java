package uniandes.dpoo.aerolinea.modelo;

public class Avion {
	private String nombre;
	private int capacidad;
	
	//ctor 
	public Avion(String nombre, int capacidad) {
		this.nombre = nombre;
		this.capacidad = capacidad;
	}
	//getter
	public String getNombre() {
		return nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	

	
}
