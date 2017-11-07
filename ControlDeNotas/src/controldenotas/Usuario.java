/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldenotas;

/**
 *
 * @author Jonat
 */
public class Usuario {
    protected String Nombre;
    protected String PrimerAp;
    protected String SegundAp;
    protected int TipoUser;
    protected String Correo;
    protected double Contraseña;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTipoUser() {
        return TipoUser;
    }

    public void setTipoUser(int TipoUser) {
        this.TipoUser = TipoUser;
    }

    public String getPrimerAp() {
        return PrimerAp;
    }

    public void setPrimerAp(String PrimerAp) {
        this.PrimerAp = PrimerAp;
    }

    public String getSegundAp() {
        return SegundAp;
    }

    public void setSegundAp(String SegundAp) {
        this.SegundAp = SegundAp;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public double getContraseña() {
        return Contraseña;
    }

    public void setContraseña(double Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    
    
}
