package uniandes.isis2304.superAndes.negocio;

/**
 * Interfaz para los m�todos get de .
 * Sirve para proteger la informaci�n del negocio de posibles manipulaciones desde la interfaz.
 * @author Andr�s Hern�ndez.
 */
public interface VOTipo {

	// -----------------------------------------------------------------
    // M�todos.
    // -----------------------------------------------------------------

	/**
	 * @return nombre del tipo.
	 */
	public String getNombre();
	
	/**
	 * @return categoria del tipo.
	 */
	public String getCategoria();
	
	/**
	 * Cadena de caracteres con todos los atributos del Tipo.
	 */
	@Override
	public String toString();
}
