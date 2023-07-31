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
public class AnuncioImagen extends Anuncio {
    //Encapsulamiento

    private double Mili = 0.0;

    //Constructor
    public AnuncioImagen(String Titulo, String Descripcion, double mili, double total) {
        super(Titulo, Descripcion, total);
        this.Mili = mili;
    }

    //setters y getters 
    public void setMili(double mili) {
        this.Mili = mili;
    }

    public double getMili() {
        return Mili;
    }

    //Metodo mejorado
    @Override
    public double precioAnuincio() {
        double precio = super.getPrecio();

        if (Mili == 0.0) {
            return precio;
        }
        double val = 25 * Mili;
        precio += val;
        return precio;
    }
}
