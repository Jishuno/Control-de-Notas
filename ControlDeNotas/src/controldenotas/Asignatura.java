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
public class Asignatura {
    private ArrayList<Estudiante> Estudiantes;
    private Docente Docente;
    private String NombreAsignatura;

    public Asignatura(ArrayList<Estudiante> Estudiantes, Docente Docente, String NombreAsignatura) {
        this.Estudiantes = Estudiantes;
        this.Docente = Docente;
        this.NombreAsignatura = NombreAsignatura;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return Estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> Estudiantes) {
        this.Estudiantes = Estudiantes;
    }

    public Docente getDocente() {
        return Docente;
    }

    public void setDocente(Docente Docente) {
        this.Docente = Docente;
    }

    public String getNombreAsignatura() {
        return NombreAsignatura;
    }

    public void setNombreAsignatura(String NombreAsignatura) {
        this.NombreAsignatura = NombreAsignatura;
    }
    
    
    
}
