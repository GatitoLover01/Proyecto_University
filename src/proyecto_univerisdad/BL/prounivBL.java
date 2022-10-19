/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_univerisdad.BL;

/**
 *
 * @author erick
 */
public class prounivBL {
    String matricula, contraseña, id_asig, nombre_asig, creditos;

    public String getId_asig() {
        return id_asig;
    }

    public void setId_asig(String id_asig) {
        this.id_asig = id_asig;
    }

    public String getNombre_asig() {
        return nombre_asig;
    }

    public void setNombre_asig(String nombre_asig) {
        this.nombre_asig = nombre_asig;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }
    int categoria;

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
