package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO implements CRUD{
    Connection con;
    Conexion cn =new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar() {
        List<Producto> lista = new ArrayList<>();
        String sql="SELECT * FROM productos";
        try{
        con=cn.Conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while (rs.next()){
                Producto p = new Producto();
                
                p.setIdproducto(rs.getInt(1));
                p.setCodproducto(rs.getString(2));
                p.setNomproducto(rs.getString(3));
                p.setPrecioproducto(rs.getInt(4));
                p.setStock(rs.getInt(5));
                lista.add(p);
                
                
        }            
        }catch(Exception e){}
        return lista;
    }
    
    public int add(Object[] o) {
        int r=0;
        String sql="INSERT into productos(cod_producto,nom_producto,precio_producto,stock)values(?,?,?,?)";
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
        String sql="update cliente set cod_producto=?,nom_producto=?,precio_producto=?,stock=? where id_producto=?";
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
        String sql="delete from producto where id_producto=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch(Exception e){
            
        } 
    }
}
