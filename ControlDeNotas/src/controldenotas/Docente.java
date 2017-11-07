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
public class Docente extends Usuario {
    private int Codigo;
    private int CantidadNotasSeg;
    private int[] NotasSegs;

    public Docente(int Codigo, int CantidadNotasSeg, int[] NotasSegs) {
        this.Codigo = Codigo;
        this.CantidadNotasSeg = CantidadNotasSeg;
        this.NotasSegs = new int[CantidadNotasSeg];
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getCantidadNotasSeg() {
        return CantidadNotasSeg;
    }

    public void setCantidadNotasSeg(int CantidadNotasSeg) {
        this.CantidadNotasSeg = CantidadNotasSeg;
    }

    public int[] getNotasSegs() {
        return NotasSegs;
    }

    public void setNotasSegs(int[] NotasSegs) {
        this.NotasSegs = NotasSegs;
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
