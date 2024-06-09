package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpleadoDAO {
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion con = new Conexion();
    Connection acceso;
     
    public Empleado Ingresar(String Dni,String User){
    Empleado em = new Empleado();
    String sql = "SELECT * FROM vendedor WHERE Dni=? AND User=? ";
    try {
        acceso=con.Conectar();
        ps=acceso.prepareStatement(sql);
        ps.setString(1,Dni);
        ps.setString(2,User);
        rs=ps.executeQuery();

        while(rs.next()){
            em.setId(rs.getInt(1));
            em.setDni(rs.getString(2));
            em.setNombre(rs.getString(3));
            em.setTelefono(rs.getString(4));
            em.setUser(rs.getString(5));
        }
    } catch(Exception e){ 
    }
    return em;
    }
    
}
