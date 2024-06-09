package Modelo;

public class Producto {
   
    private int idproducto;
    private String codproducto;
    private String nomproducto;
    private double precioproducto;
    private int stock;

    
    public Producto(){}
    public Producto(int idproducto,String codproducto, String nomproducto, double precioproducto, int stock) {
        this.idproducto=idproducto;
        this.codproducto = codproducto;
        this.nomproducto = nomproducto;
        this.precioproducto = precioproducto;
        this.stock = stock;
    }

    
    public int getIdproducto(){
        return idproducto;
    }
    
    public void setIdproducto(int idproducto){
        this.idproducto=idproducto;
    }
    
    public String getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(String codproducto) {
        this.codproducto = codproducto;
    }

    public String getNomproducto() {
        return nomproducto;
    }

    public void setNomproducto(String nomproducto) {
        this.nomproducto = nomproducto;
    }

    public double getPrecioproducto() {
        return precioproducto;
    }

    public void setPrecioproducto(double precioproducto) {
        this.precioproducto = precioproducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}
