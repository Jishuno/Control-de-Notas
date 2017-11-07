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
    private int CodigoEstu;
    private ArrayList<Notas> Notas;

    public Estudiante(int doc, String[] Asig, ArrayList<Notas> Notas, String Nombre, String PrimerAp, String SegundAp, String Correo, double Contraseña) {
        this.doc = doc;
        this.Asig = Asig;
        this.Notas = Notas;
        this.Nombre = Nombre;
        this.PrimerAp = PrimerAp;
        this.SegundAp = SegundAp;
        this.Correo = Correo;
        this.Contraseña = Contraseña;
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

    @Override
    public String getNombre() {
        return Nombre;
    }

    @Override
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public int getTipoUser() {
        return TipoUser;
    }

    @Override
    public void setTipoUser(int TipoUser) {
        this.TipoUser = TipoUser;
    }

    public int getCodigoEstu() {
        return CodigoEstu;
    }

    public void setCodigoEstu(int CodigoEstu) {
        this.CodigoEstu = CodigoEstu;
    }

    @Override
    public String getPrimerAp() {
        return PrimerAp;
    }

    @Override
    public void setPrimerAp(String PrimerAp) {
        this.PrimerAp = PrimerAp;
    }

    @Override
    public String getSegundAp() {
        return SegundAp;
    }

    @Override
    public void setSegundAp(String SegundAp) {
        this.SegundAp = SegundAp;
    }
    
    
}
