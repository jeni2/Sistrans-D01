package uniandes.isis2304.superAndes.negocio;

/**
 * Interfaz para los m�todos get de ClienteSucursal.
 * Sirve para proteger la informaci�n del negocio de posibles manipulaciones desde la interfaz.
 * @author Andr�s Hern�ndez.
 */
public interface VOClienteSucursal {

	public String getCliente();
	
	public String getDireccionSucursal();

	public String getCiudadSucursal();
	
	/**
	 * Cadena de caracteres con todos los atributos de ClienteSurcursal.
	 */
	@Override
	public String toString();
}
