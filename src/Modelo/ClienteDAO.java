package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements CRUD{
    
    Connection con;
    Conexion cn =new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public List listar() {
        List<Cliente> lista = new ArrayList<>();
        String sql="SELECT * FROM cliente";
        try{
        con=cn.Conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while (rs.next()){
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setTelefono(rs.getString(4));
                c.setDirec(rs.getString(5));
                lista.add(c);
                
                
        }            
        }catch(Exception e){}
        return lista;
    }

    
    public int add(Object[] o) {
        int r=0;
        String sql="INSERT into cliente(Dni,Nombres,Telefono,Direccion)values(?,?,?,?)";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r=ps.executeUpdate();
        }catch(Exception e){
        } 
        return r;
    }

    public int update(Object []o) {
        int r=0;
        String sql="update cliente set Dni=?,Nombres=?,Telefono=?,Direccion=? where id_cliente=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);           
            r=ps.executeUpdate();
        }catch(Exception e){
        } 
        return r;
    }

    public void delete(int id) {
        String sql="delete from cliente where id_cliente=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch(Exception e){
            
        } 
    }
    
    
}
