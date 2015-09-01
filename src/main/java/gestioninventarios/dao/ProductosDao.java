package gestioninventarios.dao;

import gestioninventarios.modelo.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oscar Arturo Corona Chavira
 */
public class ProductosDao implements Crud <Producto> {

    @Override
    public List<Producto> list() {
        List<Producto> productos = new ArrayList();

        try {
            Statement st = Conexion.getInstance()
                    .getConexion().createStatement();
            ResultSet rs = st.executeQuery(String.format("SELECT %s FROM %s;", Producto.fieldsToString(), Producto.TABLE));
            while (rs.next()) {                    
                    Integer id = rs.getInt(Producto.FIELDS[0]);
                    String descripcion = rs.getString(Producto.FIELDS[1]);
                    String clasificacion = rs.getString(Producto.FIELDS[2]);
                    Double precio = rs.getDouble(Producto.FIELDS[3]);
                    Integer existencia = rs.getInt(Producto.FIELDS[4]);
                    Integer existenciaMaxima = rs.getInt(Producto.FIELDS[5]);
                    Integer existenciaMinima = rs.getInt(Producto.FIELDS[6]);
                Producto prod = new Producto(id, descripcion, clasificacion, precio, existencia, existenciaMaxima, existenciaMinima);
                productos.add(prod);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductosDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return productos;
    }
    
    @Override
    public void create(Producto producto) {
        
        if (!(producto.getClave()== null)) {
            throw new IllegalArgumentException("Ya existe ese producto...");
        }
        
        try {
            Statement st = Conexion.getInstance()
                    .getConexion().createStatement();
            st.executeQuery(String.format("INSERT INTO %s (%s) "+
                    "VALUES ('%s' '%s' %s %s %s %s);",
                    Producto.TABLE,
                    Producto.fieldsToStringNoId(),
                    producto.getDescripcion(),
                    producto.getClasificacion(),
                    producto.getPrecio(),
                    producto.getExistencia(),
                    producto.getExistenciaMaxima(),
                    producto.getExistenciaMinima()));
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
