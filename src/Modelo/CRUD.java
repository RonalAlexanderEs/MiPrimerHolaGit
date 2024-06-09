package Modelo;
import java.util.List;

public interface CRUD {
    public List listar();
    public int add(Object []o);
    public int update(Object []o);
    public void delete(int id);
    
    
}
