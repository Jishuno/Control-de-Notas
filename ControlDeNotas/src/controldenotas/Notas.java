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
public class Notas {
    private float Parcial1;
    private float Parcial2;
    private float Seguimiento;
    private float Definitiva;

    public Notas(float Parcial1, float Parcial2, float Seguimiento) {
        this.Parcial1 = Parcial1;
        this.Parcial2 = Parcial2;
        this.Seguimiento = Seguimiento;
    }

    public float getParcial1() {
        return Parcial1;
    }

    public void setParcial1(float Parcial1) {
        this.Parcial1 = Parcial1;
    }

    public float getParcial2() {
        return Parcial2;
    }

    public void setParcial2(float Parcial2) {
        this.Parcial2 = Parcial2;
    }

    public float getSeguimiento() {
        return Seguimiento;
    }

    public void setSeguimiento(float Seguimiento) {
        this.Seguimiento = Seguimiento;
    }

    public float getDefinitiva() {
        return Definitiva;
    }

    public void setDefinitiva(float Definitiva) {
        this.Definitiva = Definitiva;
    }
    
    
}
