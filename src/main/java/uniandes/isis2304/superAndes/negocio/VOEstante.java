package uniandes.isis2304.superAndes.negocio;

/**
 * Interfaz para los m�todos get del Estante.
 * Sirve para proteger la informaci�n del negocio de posibles manipulaciones desde la interfaz.
 * @author Andr�s Hern�ndez.
 */
public interface VOEstante {

	/**
	 * @return id �nico del estante.
	 */
	public long getId();
	
	/**
	 * @return capacidad en peso del estante.
	 */
	public double getCapacidadPeso();
	
	/**
	 * @return capacidad en volumen de 
	 */
	public double getCapacidadVolumen();
	
	/**
	 * @return Tipo de productos que almacena el estante.
	 */
	public String getTipo();
	
	/**
	 * @return id de la sucursal del estante.
	 */
	public long getIdSucursal();

	/**
	 * Cadena de caracteres con todos los atributos de Estante.
	 */
	@Override
	public String toString();
}
