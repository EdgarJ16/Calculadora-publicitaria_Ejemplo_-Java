/*
 *EDGAR JACOB MORENO
  PROYECTO PROGAMACION INTERMEDIA MANEJO DE ARCHIVOS JAVA
CARNE :0117660514
 */
package CapaDatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author edgar
 */
public class ArchivoAnuncios {

    ObjectOutputStream salidaO;

    //Se prepara el archivo
    public void abrirArchivo() throws FileNotFoundException {
        File archivo = new File("Anuncios.dat");
        try {
           
             salidaO = new ObjectOutputStream(new FileOutputStream("Anuncios.dat"));
            
           

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un  error ");
        }

    }
    
  

    // metodo que agrega datos al archivo de una lista
    public void imprime(ArrayList vector) {
        Iterator list = vector.iterator();
        DatosAnuncios dat = new DatosAnuncios();

        try {
            while (list.hasNext()) {
                dat = (DatosAnuncios) list.next();
                //GRABA OBJETOS 
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
