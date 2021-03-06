package uniandes.isis2304.superAndes.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

class SQLUtil {

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
	public SQLUtil(PersistenciaSuperAndes psa)
	{
		this.psa = psa;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para obtener un nuevo n�mero de secuencia
	 * @param pm - El manejador de persistencia
	 * @return El n�mero de secuencia generado
	 */
	public long nextval(PersistenceManager pm)
	{
        Query q = pm.newQuery(SQL, "SELECT "+ psa.darSeqSuperAndes() + ".nextval FROM DUAL");
        q.setResultClass(Long.class);
        long resp = (long) q.executeUnique();
        return resp;
	}
	
	/**
	 * Crea y ejecuta las sentencias SQL para cada tabla de la base de datos 
	 * @param pm - El manejador de persistencia
	 * @return Un arreglo con 21 n�meros que indican el n�mero de tuplas borradas en las tablas ProveedoresProducto, ProductoOrdenPedido, FacturaProducto,
	 * ClienteSucursal, ProductosEnBodega, ProductosEnEstante, SucursalProducto, HistorialPromociones, Bodega, Estante, Promocion, Producto, Categoria, Tipo,
	 * Factura, PersonaNatural, Empresa, Cliente, OrdenPedido, Sucursal, Proveedor.
	 */
	public long[] limpiarSuperAndes(PersistenceManager pm)
	{
		Query qProveedoresProducto		= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaProveedoresProducto() );
		Query qProductoOrdenPedido	 	= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaProductoOrdenPedido() );
		Query qFacturaProducto 			= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaFacturaProducto() );
		Query qClienteSucursal 			= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaClienteSucursal() );
		Query qProductosEnBodega 		= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaProductosEnBodega() );
		Query qProductosEnEstante		= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaProductosEnEstante() );
		Query qSucursalProducto 		= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaSucursalProducto() );
		Query qHistorialPromociones		= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaHistorialPromociones() );
		Query qBodega 					= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaBodega() );
		Query qEstante 					= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaEstante() );
		Query qPromocion 				= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaPromocion() );
		Query qProducto 				= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaProducto() );
		Query qCategoria 				= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaCategoria() );
		Query qTipo 					= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaTipo() );
		Query qFactura 					= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaFactura() );
		Query qPersonaNatural 			= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaPersonaNatural() );
		Query qEmpresa 					= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaEmpresa() );
		Query qCliente 					= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaCliente() );
		Query qOrdenPedido 				= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaOrdenPedido() );
		Query qSucursal 				= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaSucursal() );	
		Query qProveedor 				= pm.newQuery(SQL, "DELETE FROM " + psa.darTablaProveedor() );				
		
		long proveedoresProductoEliminados = (long) qProveedoresProducto.executeUnique();
		long productoOrdenPedidoEliminados = (long) qProductoOrdenPedido.executeUnique();
		long facturaProductoEliminados = (long) qFacturaProducto.executeUnique();
		long clienteSucursalEliminados = (long) qClienteSucursal.executeUnique();
		long productosEnBodegaEliminados = (long) qProductosEnBodega.executeUnique();
		long productosEnEstanteEliminados = (long) qProductosEnEstante.executeUnique();
		long sucursalProductoEliminados = (long) qSucursalProducto.executeUnique();
		long historialPromocionesEliminados = (long) qHistorialPromociones.executeUnique();
		long bodegaEliminados = (long) qBodega.executeUnique();
		long estanteEliminados = (long) qEstante.executeUnique();
		long promocionEliminados = (long) qPromocion.executeUnique();
		long productoEliminados = (long) qProducto.executeUnique();
		long categoriaEliminados = (long) qCategoria.executeUnique();
		long tipoEliminados = (long) qTipo.executeUnique();
		long facturaEliminados = (long) qFactura.executeUnique();
		long personaNaturalEliminados = (long) qPersonaNatural.executeUnique();
		long empresaEliminados = (long) qEmpresa.executeUnique();
		long clienteEliminados = (long) qCliente.executeUnique();	
		long ordenPedidoEliminados = (long) qOrdenPedido.executeUnique();
		long sucursalEliminados = (long) qSucursal.executeUnique();
		long proveedorEliminados = (long) qProveedor.executeUnique();
		
		return new long[] {proveedoresProductoEliminados, productoOrdenPedidoEliminados, facturaProductoEliminados, clienteSucursalEliminados, 
				productosEnBodegaEliminados, productosEnEstanteEliminados, sucursalProductoEliminados, historialPromocionesEliminados, 
				bodegaEliminados, estanteEliminados, promocionEliminados, productoEliminados, categoriaEliminados, tipoEliminados,
				facturaEliminados, personaNaturalEliminados, empresaEliminados, clienteEliminados, ordenPedidoEliminados, sucursalEliminados, proveedorEliminados};
	}
}
