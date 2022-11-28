/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_univerisdad.BL;

import java.sql.Blob;




/**
 *
 * @author Adry Moisés
 */
public class prounivBL2 {
    String matricula, parcial1, parcial2, parcial3, ordinario, extraordinario , asignatura, nombre, apellidoP, apellidoM, curp;
    int idInscripcion,idCarrera, genero;
    Blob certificado, cita, curpD, actaN;

    public Blob getCertificado() {
        return certificado;
    }

    public void setCertificado(Blob certificado) {
        this.certificado = certificado;
    }

    public Blob getCita() {
        return cita;
    }

    public void setCita(Blob cita) {
        this.cita = cita;
    }

    public Blob getCurpD() {
        return curpD;
    }

    public void setCurpD(Blob curpD) {
        this.curpD = curpD;
    }

    public Blob getActaN() {
        return actaN;
    }

    public void setActaN(Blob actaN) {
        this.actaN = actaN;
    }

    

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }
    

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }
    

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getParcial1() {
        return parcial1;
    }

    public void setParcial1(String parcial1) {
        this.parcial1 = parcial1;
    }

    public String getParcial2() {
        return parcial2;
    }

    public void setParcial2(String parcial2) {
        this.parcial2 = parcial2;
    }

    public String getParcial3() {
        return parcial3;
    }

    public void setParcial3(String parcial3) {
        this.parcial3 = parcial3;
    }

    public String getOrdinario() {
        return ordinario;
    }

    public void setOrdinario(String ordinario) {
        this.ordinario = ordinario;
    }

    public String getExtraordinario() {
        return extraordinario;
    }

    public void setExtraordinario(String extraordinario) {
        this.extraordinario = extraordinario;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    
}
