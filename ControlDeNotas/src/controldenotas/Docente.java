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

    public Docente(int Codigo, int CantidadNotasSeg, int[] NotasSegs, String Nombre, String PrimerAp, String SegundAp, String Correo, double Contraseña) {
        this.Codigo = Codigo;
        this.CantidadNotasSeg = CantidadNotasSeg;
        this.NotasSegs = new int[CantidadNotasSeg];
        this.PrimerAp = PrimerAp;
        this.SegundAp = SegundAp;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Contraseña = Contraseña;
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
