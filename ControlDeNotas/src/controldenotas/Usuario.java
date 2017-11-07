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
    protected int TipoUser;

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
    
    
}
