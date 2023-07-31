/*
 *EDGAR JACOB MORENO
  PROYECTO PROGAMACION INTERMEDIA MANEJO DE ARCHIVOS JAVA
CARNE :0117660514
 */
package CapaDatos;

import java.util.ArrayList;

/**
 *
 * @author edgar
 */
public class ArregloAnuncio {

    private ArrayList<DatosAnuncios> vecAnuncio = new ArrayList<DatosAnuncios>();

    //Agregar Anuncios a la lista 
    public void Vender(DatosAnuncios a, DatosCliente c) {//el anuncio a consultar, el cliente que consulta 

        //Una vez agregado se le asigna un ID
        a.setId(c.getId());
        vecAnuncio.add(a);

    }

    //metodo evalua repetidos en la lista 
    public boolean eval(DatosAnuncios c) {
        for (DatosAnuncios x : this.vecAnuncio) {
            if (c.getId() == x.getId()) {
                return true;
            }

        }
        return false;
    }
//metodo para obtener el arreglo 

    public ArrayList getAnContratados() {
        return this.vecAnuncio;
    }

//Metodo buscar
    public String Buscar(String tipo) {
        String datos = "ANUNCIOS CONSULTADOS \nTIPO :" + tipo + "\n";

        for (DatosAnuncios x : vecAnuncio) {
            String aux = x.getTipo();
            if (tipo == null ? aux == null : tipo.equals(aux)) {
                datos += "| Tipo :" + x.getTipo() + "-Titulo :" + x.getTitulo() + "-Costo :" + x.getCosto() + "-Id cliente :" + x.getId() + "|\n";
            }

        }
        return datos;
    }
//metodo buscar sobrecargado

    public String Buscar(int id) {
        String datos = "ANUNCIOS CONSULTADOS \n";
        for (DatosAnuncios x : vecAnuncio) {
            if (id == x.getId()) {
                datos = datos + "| Tipo :" + x.getTipo() + "-Titulo :" + x.getTitulo() + "-Costo :" + x.getCosto() + "-Id cliente :" + x.getId() + "|\n";
            }
        }
        return datos;
    }

    //metodo Buscar y devuelve anuncio
    public void printOnSystem() {
        String dato = "ANUNCIOS: \n";
        for (DatosAnuncios i : vecAnuncio) {

            dato += ("-Titulo : " + i.getTitulo() + "-Tipo:" + i.getTipo() + "-ID de cliente asignado :" + String.valueOf(i.getId()) + "-\n");

        }
        System.out.println(dato);
        System.out.println("Cantidad dedatos leidos :" + vecAnuncio.size());

    }

    //Metodo para imprimir en un text area 
    public String getVectorValues() {

        StringBuilder values = new StringBuilder();

        if (vecAnuncio != null) {
            for (DatosAnuncios i : vecAnuncio) {

                values.append("Titulo : ").append(i.getTitulo()).append("-Tipo :").append(i.getTipo()).append("-ID Cliente" + i.getId()).append("-Precio:" + i.getCosto() + " Colones\n");
            }
        }
        return values.toString();
    }
}
