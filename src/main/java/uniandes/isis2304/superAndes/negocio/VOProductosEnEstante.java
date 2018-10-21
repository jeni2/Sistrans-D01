package uniandes.isis2304.superAndes.negocio;

/**
 * Interfaz para los m�todos get de Producto en estante.
 * Sirve para proteger la informaci�n del negocio de posibles manipulaciones desde la interfaz.
 * @author Andr�s Hern�ndez.
 */
public interface VOProductosEnEstante {
	
	/**
	 * @return id del estante donde se guarda el producto.
	 */
	public long getIdEstante();
	
	/**
	 * @return cantidad del producto guardado en el estante.
	 */
	public int getCantidad();
	
	/**
	 * @return Codigo de barras del producto guardado en el estante.
	 */
	public String getCodigoBarrasProducto();
	
	/**
	 * Cadena de caracteres con todos los atributos de ProductosEnEstante.
	 */
	@Override
	public String toString();
}
