package uniandes.isis2304.superAndes.persistencia;

import java.util.Date;
import java.util.List;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.superAndes.negocio.Producto;

class SQLProducto {

	// -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
	
	/**
	 * Cadena que representa el tipo de consulta que se va a realizar en las sentencias de acceso a la base de datos
	 * Se renombra ac� para facilitar la escritura de las sentencias
	 */
	private final static String SQL = PersistenciaSuperAndes.SQL;
		
	// -----------------------------------------------------------------
    // Atributos.
    // -----------------------------------------------------------------
	
	/**
	 * El manejador de persistencia general de la aplicaci�n
	 */
	private PersistenciaSuperAndes psa;
	
	// -----------------------------------------------------------------
    // M�todos.
    // -----------------------------------------------------------------
	
	/**
	 * Constructor
	 * @param psa - El Manejador de persistencia de la aplicaci�n
	 */
	public SQLProducto(PersistenciaSuperAndes psa)
	{
		this.psa = psa;
	}
	
	
	public long adicionarProducto(PersistenceManager pm, String codigoBarras, String nombre, String marca, 
			double precioUnitario, String presentacion, double precioUnidadMedida, int cantidadPresentacion, 
			double peso, String unidadMedidaPeso, double volumen, String unidadMedidaVolumen, double calidad, 
			int nivelReorden, Date fechaVencimiento, String categoria, boolean estaEnPromocion)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + psa.darTablaProducto() + " (codigobarras, nombre, marca, preciounitario, presentacion, preciounidadmedida, cantidadpresentacion, peso, unidadmedidapeso, volumen, unidadmedidavolumen, calidad, nivelreorden, fechavencimiento, categoria, promocion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		q.setParameters(nombre, marca, precioUnitario, presentacion, precioUnidadMedida, cantidadPresentacion, 
						peso, unidadMedidaPeso, volumen, unidadMedidaVolumen, calidad, nivelReorden, fechaVencimiento,
						categoria, estaEnPromocion);
		return (long) q.executeUnique();
	}
	
	
	public long eliminarProductoCodigoBarras(PersistenceManager pm, String codigoBarras)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + psa.darTablaProducto() + " WHERE codigobarras = ?");
		q.setParameters(codigoBarras);
		return (long) q.executeUnique();
	}
	

	public Producto darProducto(PersistenceManager pm, String codigoBarras)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + psa.darTablaProducto() + "WHERE codigobarras = ?");
		q.setResultClass(Producto.class);
		q.setParameters(codigoBarras);
		return (Producto) q.executeUnique();
	}

	
	public List<Producto> darProductos(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + psa.darTablaProducto());
		q.setResultClass(Producto.class);
		return (List<Producto>) q.executeList();
	}


	public long nuevaPromocion(PersistenceManager pm, String codigoBarras)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + psa.darTablaProducto() + "SET promocion = 1 WHERE codigobarras = ?");
		q.setParameters(codigoBarras);
		return (long) q.executeUnique();
	}
	
	
	public long terminarPromocion(PersistenceManager pm, String codigoBarras)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + psa.darTablaProducto() + "SET promocion = 0 WHERE codigobarras = ?");
		q.setParameters(codigoBarras);
		return (long) q.executeUnique();
	}
}
