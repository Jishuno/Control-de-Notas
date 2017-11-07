/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldenotas;

import java.util.ArrayList;

/**
 *
 * @author Jonat
 */
public class Estudiante extends Usuario {
    private int doc;
    private String[] Asig;
    private ArrayList<Notas> Notas;

    public Estudiante(int doc, String[] Asig, ArrayList<Notas> Notas) {
        this.doc = doc;
        this.Asig = Asig;
        this.Notas = Notas;
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    public String[] getAsig() {
        return Asig;
    }

    public void setAsig(String[] Asig) {
        this.Asig = Asig;
    }

    public ArrayList<Notas> getNotas() {
        return Notas;
    }

    public void setNotas(ArrayList<Notas> Notas) {
        this.Notas = Notas;
    }

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
