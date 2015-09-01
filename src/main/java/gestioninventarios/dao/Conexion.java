package gestioninventarios.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Clase encargada exclusivamente de la conexion a la base de datos.
 * @author Oscar Arturo Corona Chavira
 */
public class Conexion {
    
    private static  Conexion conexion;
    
    private Connection connection;
    
    public Conexion(){
    }
    
    public static  Conexion getInstance(){
        if (conexion == null) {
            conexion = new Conexion();
        }
        return conexion;
    }
    
    public Connection getConexion(){
        if (connection == null) {
            
            String driver = "org.sqlite.JDBC"; //escribir el driver de la base de datos
            String cadenaConexion = "jdbc:sqlite:inventario.db";
            
            try {
                Class.forName(driver);
                Connection con = DriverManager.getConnection(cadenaConexion);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Conexion.class.getName())
                        .log(Level.SEVERE, null, ex);
                //TODO atender recuperacion a fallos
            }
        }
        return this.connection;
    }
}
