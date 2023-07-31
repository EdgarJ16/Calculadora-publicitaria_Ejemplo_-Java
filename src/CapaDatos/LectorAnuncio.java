/*
 *EDGAR JACOB MORENO
  PROYECTO PROGAMACION INTERMEDIA MANEJO DE ARCHIVOS JAVA
CARNE :0117660514
 */
package CapaDatos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author edgar
 */
public class LectorAnuncio {

    //Instancias 
    ObjectInputStream entradaO; // vA  a recibir los datos del archivo

    public void abrirArchAnuncio() {
        try {
            entradaO = new ObjectInputStream(new FileInputStream("Anuncios.dat"));

        } catch (IOException e) {

        }

    }

    public void leerArchAnuncios(ArrayList lista)
            throws Exception {
        DatosAnuncios objeto = new DatosAnuncios();
        try {
            while (objeto != null) {
                objeto = new DatosAnuncios();
                objeto = (DatosAnuncios) entradaO.readObject();
                lista.add(objeto);

            }
        } catch (java.io.EOFException eof) {
            System.out.println("Llego a Fin de archivo");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.err.println("Fallo leyendo archivo");
        }

    }

    public void cerrar() {
        try {
            entradaO.close();
        } catch (IOException ex) {

        }
    }

}
