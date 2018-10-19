package uniandes.isis2304.superAndes.negocio;

import java.util.Date;

/**
 * Interfaz para los m�todos get de .
 * Sirve para proteger la informaci�n del negocio de posibles manipulaciones desde la interfaz.
 * @author Andr�s Hern�ndez.
 */
public interface VOPromocion {

	public long getId();
	
	public String getDescripcion();
	
	public double getPrecio();
	
	public Date getInicio();
	
	public Date getFin();
	
	public int getUnidadesDisponibles();
	
	public int getUnidadesVentidas();
	
	public String getProveedor();

}