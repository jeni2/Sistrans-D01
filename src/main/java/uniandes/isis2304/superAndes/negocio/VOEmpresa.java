package uniandes.isis2304.superAndes.negocio;


/**
 * Interfaz para los m�todos get de Empresa.
 * Sirve para proteger la informaci�n del negocio de posibles manipulaciones desde la interfaz.
 * @author Andr�s Hern�ndez.
 */
public interface VOEmpresa {

	public String getNit();
	
	public String getDireccion();
	
	/**
	 * Cadena de caracteres con todos los atributos de Empresa.
	 */
	@Override
	public String toString();	
}