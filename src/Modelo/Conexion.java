package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    private String url= "jdbc:mysql://localhost:3306/ventas01";
    private String user = "root";
    private String pass = "";
    
    public Connection Conectar(){
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
        }
        return con;
    }
    
    

}
