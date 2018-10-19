package uniandes.isis2304.superAndes.negocio;


/**
 * Interfaz para los m�todos get de factura producto.
 * Sirve para proteger la informaci�n del negocio de posibles manipulaciones desde la interfaz.
 * @author Andr�s Hern�ndez.
 */
public interface VOFacturaProducto {

	public long getFactura();
	
	public int getCantidad();
	
	public String getProducto();
	
	/**
	 * Cadena de caracteres con todos los atributos de FacturaProducto.
	 */
	@Override
	public String toString();	
}