package uniandes.isis2304.superAndes.negocio;


/**
 * Interfaz para los m�todos get de Proveedor.
 * Sirve para proteger la informaci�n del negocio de posibles manipulaciones desde la interfaz.
 * @author Andr�s Hern�ndez.
 */
public interface VOProveedor 
{
	public String getNit();
		
	public String getNombre();

	public double getCalificacionCalidad();
	
	/**
	 * Cadena de caracteres con todos los atributos de.
	 */
	@Override
	public String toString();
}
