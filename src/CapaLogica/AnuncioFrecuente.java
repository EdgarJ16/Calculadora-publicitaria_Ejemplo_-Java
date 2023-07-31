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
public class AnuncioFrecuente extends Anuncio {

    //Encapsulamiento 
    private double descuento = 0.0; //Descuento determinado por usuari@

//Constructor
    public AnuncioFrecuente(String Titulo, String Descripcion, double desc, double total) {
        super(Titulo, Descripcion, total);
        this.descuento = desc;
    }

    //Setters Y getterd
    public void setDescuento(double desc) {
        descuento = desc;
    }

    public double getDescuento() {
        return descuento;
    }

    //polimorfismo
    @Override
    public double precioAnuincio() {

        double precio;
        precio = super.getPrecio();
        System.out.println(precio);
        if (descuento == 0.0) {
            return precio;
        }
        precio -= descuento * precio;

        return precio;
    }
}
