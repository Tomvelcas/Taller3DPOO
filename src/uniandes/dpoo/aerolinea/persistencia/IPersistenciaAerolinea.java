package uniandes.dpoo.aerolinea.persistencia;

import uniandes.dpoo.aerolinea.modelo.Aerolinea;

public interface IPersistenciaAerolinea {
	
	public void cargarAerolinea(String archivo, Aerolinea aereolinea);
	
	public void salvarAerolinea(String Archivo, Aerolinea aereolinea);
	
}
