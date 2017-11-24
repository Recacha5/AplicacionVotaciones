/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionvotaciones;

/**
 *
 * @author Alex Recacha
 */
public class Votacion {
    private Persona vPersonas[];
    private int si;
    private int no;
    private int blanco;
    private boolean estado;
    private String nombre;

    public Votacion(String nombre) {
        this.vPersonas = new Persona[5];
        this.si = 0;
        this.no = 0;
        this.blanco = 0;
        this.estado = true;
        this.nombre = nombre;
    }

    /**
     * @return the vPersonas
     */
    public Persona[] getvPersonas() {
        return vPersonas;
    }

    /**
     * @param vPersonas the vPersonas to set
     */
    public void setvPersonas(Persona[] vPersonas) {
        this.vPersonas = vPersonas;
    }

    /**
     * @return the si
     */
    public int getSi() {
        return si;
    }

    /**
     * @param si the si to set
     */
    public void setSi(int si) {
        this.si = si;
    }

    /**
     * @return the no
     */
    public int getNo() {
        return no;
    }

    /**
     * @param no the no to set
     */
    public void setNo(int no) {
        this.no = no;
    }

    /**
     * @return the blanco
     */
    public int getBlanco() {
        return blanco;
    }

    /**
     * @param blanco the blanco to set
     */
    public void setBlanco(int blanco) {
        this.blanco = blanco;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
