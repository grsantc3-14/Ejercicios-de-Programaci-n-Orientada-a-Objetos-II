package uaz.isw.domain;

import java.io.Serializable;

public class Persona implements Serializable{
    private static final long serialVersionUID=1L;
    private int idPersona;
    private String nombre;
    private String appellido;
    private String email;
    private String telefono;
    
    //Agregamos los constructores

    public Persona() {
    }

    public Persona(int idPersona, String nombre, String appellido, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.appellido = appellido;
        this.email = email;
        this.telefono = telefono;
    }
    
    //Agregamos los metodos Set y Get

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppellido() {
        return appellido;
    }

    public void setAppellido(String appellido) {
        this.appellido = appellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //Agregamos un metodo toString que permita concatenar todos los atributos

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", appellido=" + appellido + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
    
    
}
