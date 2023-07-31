/*
 *EDGAR JACOB MORENO
  PROYECTO PROGAMACION INTERMEDIA MANEJO DE ARCHIVOS JAVA
CARNE :0117660514
 */
package CapaLogica;

/**
 *
 * @author edgar
 */
//En la siguiente clase se procede a escribir los metodos de la logica funcional 
//para el presente programa 
//Super clase 
public abstract class Anuncio {

    //ENCAPSULAMIENTO
    protected String anuncioTitulo;
    protected String anuncioDescripcion;
    protected int totalLetras = 0;
    protected double valTotal = 0.0;
    //constructor

    public Anuncio(String Titulo, String Descripcion, double total) {
        this.anuncioTitulo = Titulo;
        this.anuncioDescripcion = Descripcion;
        this.valTotal = total;
    }

    //SETERS Y GETTERS 
    //Setters
    public void setPrecio(int totalLetras, String opcionCombo) {

        int cantidadLetras = totalLetras;
        switch (opcionCombo) {
            case "Internacionales":
                valTotal = cantidadLetras * 70;
                break;
            case "Nacionales":
                valTotal = cantidadLetras * 80;
                break;

            case "Deportes":
                valTotal = cantidadLetras * 90;
                break;

            case "Culturales":
                valTotal = cantidadLetras * 85;
                break;

            case "Económicos":
                valTotal = cantidadLetras * 50;
                break;
        }

    }

    //titulo
    public void setTitulo(String Titulo) {
        this.anuncioTitulo = Titulo;
    }

    //descripcion 
    public void setDescripcion(String Descripcion) {
        this.anuncioDescripcion = Descripcion;
    }

    //Getters
    //obtiene titulo
    public String getTitulo() {
        return anuncioTitulo;
    }

    //obtiene descripcion 
    public String getDescripcion() {
        return anuncioDescripcion;
    }

    public int getCantidadLetras() {
        return totalLetras;
    }

    public double getPrecio() {
        return valTotal;
    }

    public void reset() {
        this.valTotal = 0.0;
        this.totalLetras = 0;
        this.anuncioDescripcion = "";
        this.anuncioTitulo = "";

    }

    // FUNCIONAMIENTOS LOGICOS
    //CALCULAR CANTIDAD DE LETRAS
    //Primero se determinan cuantas letras posee el titulo y la descripcion 
    public int cuentaLetras(String Titulo, String Descripcion) {

        //Ciclo cuenta letras en el titulo
        for (int i = 0; i < Titulo.length(); i++) {
            totalLetras++;
        }
        //ciclo cuenta letras en la descripcion 
        for (int i = 0; i < Descripcion.length(); i++) {
            totalLetras++;
        }

        return totalLetras;
    }

    //metodom abstracto que sera modificado 
    public abstract double precioAnuincio();
}
