package uniandes.isis2304.superAndes.negocio;


/**
 * Interfaz para los m�todos get de persona natural.
 * Sirve para proteger la informaci�n del negocio de posibles manipulaciones desde la interfaz.
 * @author Andr�s Hern�ndez.
 */
public interface VOPersonaNatural {

	public String getDocumento();
	
	public String getTipoDocumento();
	
	/**
	 * Cadena de caracteres con todos los atributos de Persona natural.
	 */
	@Override
	public String toString();
}
