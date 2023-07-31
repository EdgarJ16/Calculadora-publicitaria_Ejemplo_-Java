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

/**
 *
 * @author edgar
 */
public class LectorCliente {

    //Instancias 
    ObjectInputStream entradaO; // vA  a recibir los datos del archivo

    public void abrirArchCliente() {
        try {
            entradaO = new ObjectInputStream(new FileInputStream("Clientes.dat"));

        } catch (IOException e) {

        }

    }

    public void leerArchClientes(ArrayList<DatosCliente> lista)
            throws Exception {
        DatosCliente objeto = new DatosCliente();
        try {

            //LEctura de objetos del archivo 
            while (objeto != null) {

                objeto = new DatosCliente();
                objeto = (DatosCliente) entradaO.readObject();//se lee el objeto del archivo y se almacena en el objeto "objeto"
                lista.add(objeto);
                int watch = objeto.getId();
            }

        } catch (Exception e) {
            System.out.println("lectura realizada");

        }

    }

    public void cerrar() {
        try {
            entradaO.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
