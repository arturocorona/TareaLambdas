package gestioninventarios.controlador;

import gestioninventarios.modelo.Producto;
import java.util.ArrayList;
import java.util.List;
import mx.uach.fing.manejousuarios.dao.UsuariosDao;
import mx.uach.fing.manejousuarios.datos.Usuario;

/**
 * Clase encargada del manejo de altas, bajas, cambios y consultas de los
 * productos.
 *
 * @author Oscar Arturo Corona Chavira
 */
public class Productos {

    public List<Producto> getUsuarios() {
        List<Usuario> usuarios = new UsuariosDao().list();
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.toString());
        }

        return usuarios;
    }

}
