package gestioninventarios.aplicacion;

import gestioninventarios.dao.Conexion;

/**
 *
 * @author Oscar Arturo Corona Chavira
 */
public class aplicacion {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        conexion.getConexion();
    }
}
