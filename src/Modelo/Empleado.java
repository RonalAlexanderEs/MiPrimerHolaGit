package Modelo;

public class Empleado {
private int id;
private String Dni;
private String nombre;
private String telefono;
private String User;

    public Empleado(){
    }
    
    public Empleado(int id, String Dni, String nombre, String telefono, String User) {
        this.id = id;
        this.Dni = Dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.User = User;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }




    
}
