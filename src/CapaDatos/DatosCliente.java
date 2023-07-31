/*
 *EDGAR JACOB MORENO
  PROYECTO PROGAMACION INTERMEDIA MANEJO DE ARCHIVOS JAVA
CARNE :0117660514
 */
package CapaDatos;

import java.io.Serializable;

/**
 *
 * @author edgar
 */
public class DatosCliente implements Serializable {

    //Encapsulamiento 
    private String nombre, ape_1, ape_2;
    private int id;

    //Constructor
    public DatosCliente() {
        this.id = 0;
        this.nombre = "";
        this.ape_1 = "";
        this.ape_2 = "";

    }

    public DatosCliente(String nom, String a1, String a2, int c) {
        this.id = c;
        this.nombre = nom;
        this.ape_1 = a1;
        this.ape_2 = a2;
    }

    //Setters y getters
    public void setId(int d) {
        this.id = d;
    }

    public int getId() {
        return id;
    }

    //
    public void setNom(String nom) {
        this.nombre = nom;
    }

    public String getNom() {
        return nombre;
    }

    //
    public void setApe_1(String ape) {
        this.ape_1 = ape;
    }

    public String getApe_1() {
        return ape_1;
    }

    //
    public void setApe_2(String ape) {
        this.ape_2 = ape;
    }

    public String getApe_2() {
        return ape_2;
    }
    //

}
