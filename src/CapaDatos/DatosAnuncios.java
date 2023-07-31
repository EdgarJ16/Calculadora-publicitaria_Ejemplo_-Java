package CapaDatos;

import java.io.Serializable;

/*
 *EDGAR JACOB MORENO
  PROYECTO PROGAMACION INTERMEDIA MANEJO DE ARCHIVOS JAVA
CARNE :0117660514
 */
public class DatosAnuncios implements Serializable {

    //Encapsulamiento 
    String titulo, tipo;
    int id;
    double costo;

    //Constructor
    public DatosAnuncios() {
        this.costo = 0.0;
        this.titulo = "";
        this.tipo = "";
        this.id = 0;
    }

    public DatosAnuncios(String tip, String tit, double c, int ide) {
        this.costo = c;
        this.titulo = tit;
        this.tipo = tip;
        this.id = ide;
    }

    //Setters y getters
    public void setId(int d) {
        this.id = d;
    }

    public int getId() {
        return id;
    }

    //
    public void setTipo(String tip) {
        this.tipo = tip;
    }

    public String getTipo() {
        return tipo;
    }

    //
    public void setTitulo(String tit) {
        this.titulo = tit;
    }

    public String getTitulo() {
        return titulo;
    }

    //
    public void setCosto(double c) {
        this.costo = c;
    }

    public double getCosto() {
        return costo;
    }
    //

}
