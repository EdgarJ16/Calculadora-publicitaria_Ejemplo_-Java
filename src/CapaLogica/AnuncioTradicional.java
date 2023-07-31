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
public class AnuncioTradicional extends Anuncio {

    private boolean descuento = false;
//Constructor explicito  

    public AnuncioTradicional(String Titulo, String Descripcion, boolean desc, double total) {
        super(Titulo, Descripcion, total);
        this.descuento = desc;
    }
    //Encapsulamiento

    //Set descuento
    public void setDescuento(boolean desc) {
        descuento = desc;
    }

    public boolean getDescuento() {
        return descuento;
    }

    //uso de polimorfismo para sobre escribir el metodo de la 
    //super clase Anuncio 
    @Override
    public double precioAnuincio() {
        double precio = super.getPrecio();
        //Se efectuan los descuentos 
        boolean val = getDescuento();
        if (val) {
            if (totalLetras > 15 && totalLetras < 19.9) {
                precio = precio - (precio * 0.03);
            } else if (totalLetras > 20 && totalLetras < 24.9) {
                precio = precio - (precio * 0.06);
            } else if (totalLetras > 24 && totalLetras < 29.9) {
                precio = precio - (precio * 0.09);
            } else if (totalLetras > 30 && totalLetras < 34.9) {
                precio = precio - (precio * 0.12);
            } else if (totalLetras > 35 && totalLetras < 39.9) {
                precio = precio - (precio * 0.15);
            } else if (totalLetras > 40 && totalLetras < 44.9) {
                precio = precio - (precio * 0.18);
            } else if (totalLetras > 45 && totalLetras < 49.9) {
                precio = precio - (precio * 0.21);
            } else if (totalLetras > 50) {
                precio = precio - (precio * 0.24);
            }
        }
        return precio;
    }

}
