package gestioninventarios.aplicacion;

import gestioninventarios.dao.Conexion;
import gestioninventarios.dao.ProductosDao;
import gestioninventarios.modelo.Producto;

/**
 *
 * @author Oscar Arturo Corona Chavira
 */
public class aplicacion {
    public static void main(String[] args) {
        Producto p = new Producto(01, "descripcion", "clasificacion", 50.0, 30, 50, 10);
        ProductosDao pdao = new ProductosDao();
        pdao.create(p);
    }
}
