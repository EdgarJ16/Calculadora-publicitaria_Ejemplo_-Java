/*
 *EDGAR JACOB MORENO
  PROYECTO PROGAMACION INTERMEDIA MANEJO DE ARCHIVOS JAVA
CARNE :0117660514
 */
package CapaDatos;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 * En este archivo se guardaran la informacion de los clientes por lo tanto se
 * les asigna un id debe contener los metodos de agregar modificar y actualizar
 *
 * @author edgar
 */
public class ArchivoClientes {

    ObjectOutputStream salidaO;

    //Se prepara el archivo
    public void abrirArchivo() throws FileNotFoundException {
        File archivo = new File("Clientes.dat");
        try {

            salidaO = new ObjectOutputStream(new FileOutputStream("Clientes.dat"));

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un  error ");
        }

    }

    // metodo que agrega datos al archivo 
    public void imprime(ArrayList vector) {
        Iterator list = vector.iterator();
        DatosCliente dat = new DatosCliente();

        try {
            while (list.hasNext()) {
                dat = (DatosCliente) list.next();

                salidaO.writeObject(dat);

            }

        } catch (Exception e) {

        }

    }
// se cierra el archivo

    public void cerrarArchivo() {
        try {
            if (salidaO != null) {
                salidaO.close();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
