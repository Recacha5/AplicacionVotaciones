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
public class Persona {
    
    private String nombre;
    private String voto;

    public Persona(String nombre, String voto) {
        this.nombre = nombre;
        this.voto = voto;
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

    /**
     * @return the voto
     */
    public String getVoto() {
        return voto;
    }

    /**
     * @param voto the voto to set
     */
    public void setVoto(String voto) {
        this.voto = voto;
    }
    
    
    
}
