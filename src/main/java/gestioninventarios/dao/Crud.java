package gestioninventarios.dao;

import java.util.List;

/**
 *
 * @author Oscar Arturo Corona Chavira
 */
public interface Crud <T> {
    
    public List<T>list();
    
    public void create(T producto);
    
    public void update(T producto);
    
    public void eliminar(Integer id);
}
