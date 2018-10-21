package uniandes.isis2304.superAndes.negocio;

/**
 * Interfaz para los m�todos get de Sucursal.
 * Sirve para proteger la informaci�n del negocio de posibles manipulaciones desde la interfaz.
 * @author Andr�s Hern�ndez.
 */
public interface VOSucursal {

	// -----------------------------------------------------------------
    // M�todos.
    // -----------------------------------------------------------------
	
	/**
	 * @return El id de la sucursal.
	 */
	public long getId();
	
	/**
	 * @return La direcci�n de la sucursal.
	 */
	public String getDireccion();
	
	/**
	 * @return La ciudad de la sucursal.
	 */
	public String getCiudad();
	
	/**
	 * @return El nombre de la sucursal.
	 */
	public String getNombre();
	
	/**
	 * @return la segmentaci�n de mercado de la sucursal.
	 */
	public String getSegmentacionMercado();
	
	/**
	 * @return el tama�o de la sucursal.
	 */
	public int getTamanio();
	
	/**
	 * Cadena de caracteres con todos los atributos de Sucursal.
	 */
	@Override
	public String toString();
}
