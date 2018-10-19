package uniandes.isis2304.superAndes.persistencia;

import java.util.List;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.superAndes.negocio.Empresa;

class SQLEmpresa {

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
	public SQLEmpresa(PersistenciaSuperAndes psa)
	{
		this.psa = psa;
	}
	
	public long adicionarEmpresa(PersistenceManager pm, String nit, String direccion)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + psa.darTablaEmpresa() + " (nit, direccion) VALUES (?, ?)");
		q.setParameters(nit, direccion);
		return (long) q.executeUnique();
	}
	
	
	public long eliminarEmpresaPorNit(PersistenceManager pm, String nit)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + psa.darTablaEmpresa() + " WHERE nit = ?");
		q.setParameters(nit);
		return (long) q.executeUnique();
	}
	

	public long eliminarEmpresaPorDireccion(PersistenceManager pm, String direccion)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + psa.darTablaEmpresa() + " WHERE direccion = ?");
		q.setParameters(direccion);
		return (long) q.executeUnique();
	}
	
	
	public Empresa darEmpresa(PersistenceManager pm, String nit)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + psa.darTablaEmpresa() + "WHERE nit = ?");
		q.setResultClass(Empresa.class);
		q.setParameters(nit);
		return (Empresa) q.executeUnique();
	}
	
	public List<Empresa> darEmpresas(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + psa.darTablaEmpresa());
		q.setResultClass(Empresa.class);
		return (List<Empresa>) q.executeList();
	}
}