package Control;

import Modelo.Empleado;
import Modelo.EmpleadoDAO;


public class EmpleadoController {
    
    EmpleadoDAO empleadoDao = new EmpleadoDAO();
    
    public Empleado Ingresar(String Dni,String User){
        Empleado empleado = new Empleado();
        
        return empleadoDao.Ingresar(Dni, User);
    }
    
}
