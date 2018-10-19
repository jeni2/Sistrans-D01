package uniandes.isis2304.superAndes.negocio;


/**
 * Interfaz para los m�todos get de Cliente .
 * Sirve para proteger la informaci�n del negocio de posibles manipulaciones desde la interfaz.
 * @author Andr�s Hern�ndez.
 */
public interface VOCliente {

	public String getCorreoElectronico();
	
	public String getNombre();
	
	public int getPuntos();
}