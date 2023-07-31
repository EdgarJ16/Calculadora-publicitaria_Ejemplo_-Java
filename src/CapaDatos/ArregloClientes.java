/*
 *EDGAR JACOB MORENO
  PROYECTO PROGAMACION INTERMEDIA MANEJO DE ARCHIVOS JAVA
CARNE :0117660514
 */
package CapaDatos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author edgar
 */
public class ArregloClientes {

    //Encapsulamiento 
    private ArrayList<DatosCliente> vecCliente = new ArrayList<>();
    private Random randint = new Random();

//Constructor 
    //Agregar clientes a la lista 
    public void agregar(DatosCliente c) throws Exception {
        //se determina si el cliente que se desea agregar ya esta en  la lista 

        //si no se encuentra se procede a agregar el cliente al vector 
        //Una vez agregado se le asigna un ID
        int id = 0;
        boolean flag = true;
        while (flag) {
            id = randint.nextInt(999) + 1;
            flag = eval(id);
        }
        c.setId(id);

        //una vez asignado el id se procede a definir el nombre 
        try {
            String data = "X";
            //se define el nombre 
            data = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL CLIENTE");
            if (data.isEmpty()) {
                throw new Exception("DEBE DIGITAR ALGO");

            }
            c.setNom(data);
            //se definen Los apellidos 

            data = JOptionPane.showInputDialog("DIGITE EL APELLODO 1 DEL CLIENTE");
            if (data.isEmpty()) {
                throw new Exception("DEBE DIGITAR ALGO");

            }
            c.setApe_1(data);
            data = JOptionPane.showInputDialog("DIGITE EL APELLODO 2 DEL CLIENTE");
            if (data.isEmpty()) {
                throw new Exception("DEBE DIGITAR ALGO");

            }
            JOptionPane.showMessageDialog(null, "se asigno un id");
            c.setApe_2(data);
            JOptionPane.showMessageDialog(null, "El CLIENTE ID ES " + c.getId());

            vecCliente.add(c);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "  >> ERROR <<");

        }

    }

    //MEtodo que elimina un registro 
    public void eliminar(int id) {

        DatosCliente eliminar = new DatosCliente();

        try {

            if (!eval(id)) {
                throw new Exception("REGISTRO NO ENCONTRADO");

            } else {
                eliminar = buscarCliente(id);

                for (DatosCliente i : vecCliente) {
                    if (i.getId() == eliminar.getId()) {
                        vecCliente.remove(i);
                        JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
                    }

                }

            }

        } catch (Exception ex) {
            Logger.getLogger(ArregloClientes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR SE ENCONTRARON ANUNCIOS ASIGNADOS");
        }

    }

    public void eliminar(int id, ArregloAnuncio vector) {

        DatosCliente eliminar = new DatosCliente();

        try {

            if (!eval(id)) {
                throw new Exception("REGISTRO NO ENCONTRADO");

            } else {
                eliminar = buscarCliente(id);
                for (Object i : vector.getAnContratados()) {
                    DatosAnuncios a = new DatosAnuncios();
                    a = (DatosAnuncios) i;

                    if (a.getId() == eliminar.getId()) {
                        throw new Exception("ESTE CLIENTE TIENE ANUNCIOS REGISTRADOS");
                    }

                }

                for (DatosCliente i : vecCliente) {
                    if (i.getId() == eliminar.getId()) {
                        vecCliente.remove(i);
                        JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
                    }

                }

            }

        } catch (Exception ex) {
            Logger.getLogger(ArregloClientes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    //Metodo que actualiza un registro
    public void actualizar() throws Exception{
        int id = Integer.parseInt(JOptionPane.showInputDialog("PORFAVOR DIGITE EL ID DEL REGISTRO A MODIFICAR"));
        DatosCliente nuevo = new DatosCliente();

        try {

            if (!eval(id)) {
                throw new Exception("REGISTRO NO ENCONTRADO");

            } else {
                nuevo = buscarCliente(id);
                System.out.println("Registro a modificar " + nuevo.getApe_1() + " " + nuevo.getApe_2() + " " + nuevo.getNom());
                int auxId = nuevo.getId();
                //Se elimina el registro consiltado guardando el id 
                eliminar(id);

                String data = "X";
                //se define el nombre 
                data = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL CLIENTE");
                if (data.isEmpty()) {
                    throw new Exception("DEBE DIGITAR ALGO");

                }
                nuevo.setNom(data);
                //se definen Los apellidos 

                data = JOptionPane.showInputDialog("DIGITE EL APELLODO 1 DEL CLIENTE");
                if (data.isEmpty()) {
                    throw new Exception("DEBE DIGITAR ALGO");

                }
                nuevo.setApe_1(data);
                data = JOptionPane.showInputDialog("DIGITE EL APELLODO 2 DEL CLIENTE");
                if (data.isEmpty()) {
                    throw new Exception("DEBE DIGITAR ALGO");

                }

                nuevo.setApe_2(data);
                nuevo.setId(auxId);
                JOptionPane.showMessageDialog(null, "SE  MODIFICO EL REGISTRO");
                System.out.println("Registro Modificado " + nuevo.getApe_1() + " " + nuevo.getApe_2() + " " + nuevo.getNom());

            }

        } catch (Exception ex) {
            Logger.getLogger(ArregloClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
  

    }

    //metodo evalua repetidos en la lista 
    public boolean eval(int id) {
        ArrayList<DatosCliente> vec = getVector();
        int eval =0;
        for(DatosCliente i : vec){
            eval = i.getId();
           if (id == eval) {

                return true;

            }

        
        }
        
//            for (int i = 0; i < vec.size(); i++) {
//                int eval = vec.get(i).getId();
//
//
//            }
        return false;
    }
//metodo para obtener el arreglo 

    public ArrayList getVector() {
        return vecCliente;
    }
//Metodo busca un valor por idcliente ydevuelve el objeto 

    public DatosCliente buscarCliente(int id) {
        for (DatosCliente i : vecCliente) {
            if (i.getId() == id) {
                return i;
            }

        }
        return null;
    }

    //Imprimir datos del arreglo en el sistema
    public void printOnSystem() {
        String dato = "ClIENTES \n";
        for (DatosCliente i : vecCliente) {

            dato += ("-Nombre : " + i.getNom() + "-Apellido 1 :" + i.getApe_1() + "-Apellido 2 :" + i.getApe_2() + "-Cliente id :" + String.valueOf(i.getId()) + "-\n");

        }
        System.out.println(dato);
        System.out.println("cantidad de ojetos en la lista :" + vecCliente.size());
    }

}
