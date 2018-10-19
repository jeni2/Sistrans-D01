package uniandes.isis2304.superAndes.negocio;

/**
 * Interfaz para los m�todos get de SucursalProducto.
 * Sirve para proteger la informaci�n del negocio de posibles manipulaciones desde la interfaz.
 * @author Andr�s Hern�ndez.
 */
public interface VOSucursalProducto {

	public String getDireccionSucursal();
	
	public String getCiudadSucursal();
	
	public String getProducto();
	
	/**
	 * Cadena de caracteres con todos los atributos de SucursalProducto.
	 */
	@Override
	public String toString();
}
