package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{
	//atributos
	private String horaSalida;
	private String horaLlegada;
	private String codigoRuta;
	private Aeropuerto destino;
	private Aeropuerto origen;
	
	//ctor
    public Ruta(String horaSalida, String horaLlegada, String codigoRuta) {
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.codigoRuta = codigoRuta;
		this.destino = destino;
		this.origen = origen;
	}
    //getter

	public String getHoraSalida() {
		return horaSalida;
	}



	public String getHoraLlegada() {
		return horaLlegada;
	}



	public String getCodigoRuta() {
		return codigoRuta;
	}
	
	public Aeropuerto getOrigen() {
		return origen;
		
	}
	
	public Aeropuerto getDestino() {
		return destino;
		
	}
	
	public int getDuracion() {
	    int horasSalida = getHoras(horaSalida);
	    int minutosSalida = getMinutos(horaSalida);
	    int horasLlegada = getHoras(horaLlegada);
	    int minutosLlegada = getMinutos(horaLlegada);
	    
	    int minutosTotalesSalida = horasSalida * 60 + minutosSalida;
	    int minutosTotalesLlegada = horasLlegada * 60 + minutosLlegada;
	    
	    int duracion;
	    if (minutosTotalesSalida > minutosTotalesLlegada) {
	        duracion = (24 * 60 - minutosTotalesSalida) + minutosTotalesLlegada;
	    } else {
	        duracion = minutosTotalesLlegada - minutosTotalesSalida;
	    }
	    
	    return duracion;
	}

    /**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }





	/**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

    
}
