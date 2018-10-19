package uniandes.isis2304.superAndes.negocio;


/**
 * Interfaz para los m�todos get del HistorialPromociones.
 * Sirve para proteger la informaci�n del negocio de posibles manipulaciones desde la interfaz.
 * @author Andr�s Hern�ndez.
 */
public interface VOHistorialPromociones {

	public String getProducto();
	
	public long getPromocion();	

	/**
	 * Cadena de caracteres con todos los atributos de.
	 */
	@Override
	public String toString();
}
