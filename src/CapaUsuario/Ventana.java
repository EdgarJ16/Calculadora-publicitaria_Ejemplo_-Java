/*
 *EDGAR JACOB MORENO
  PROYECTO PROGAMACION INTERMEDIA MANEJO DE ARCHIVOS JAVA
CARNE :0117660514
 */
package CapaUsuario;

import CapaDatos.*;

import javax.swing.JOptionPane;
import CapaLogica.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

//Para Imprimir la Fecha 
/**
 *
 * @author edgar
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    //Instancias de manejo de archivos 
    // para clientes 
    //ArregloClientes vecClientes = new ArregloClientes();  
    
    public ArregloClientes vecCliente = new ArregloClientes();
    private DatosCliente cliente = new DatosCliente();
    ArchivoClientes archCliente = new ArchivoClientes();

    public ArregloAnuncio vecAnuncio = new ArregloAnuncio();
    private DatosAnuncios anuncio = new DatosAnuncios();
    ArchivoAnuncios archAnuncio = new ArchivoAnuncios();

    public LectorCliente lectorCliente = new LectorCliente();
    public LectorAnuncio lectorAnuncio = new LectorAnuncio();

    public Ventana() throws FileNotFoundException {
//SE CARGAN LOS DATOS DEL ARCHIVO AL PROGRAMA
        try {
            lectorCliente.abrirArchCliente();
            lectorCliente.leerArchClientes(vecCliente.getVector());
            lectorCliente.cerrar();
           

        } catch (Exception ex) {

        }

        try {

            lectorAnuncio.abrirArchAnuncio();
            lectorAnuncio.leerArchAnuncios(vecAnuncio.getAnContratados());

            lectorAnuncio.cerrar();

           

        } catch (Exception e) {

        }
        // Una vez que se generan los datos se sobre escribe el archivo

        vecAnuncio.printOnSystem();
        vecCliente.printOnSystem();
        initComponents();

    }

    //instancias u objetos 
    //OBJETOS
    AnuncioImagen aImagen = new AnuncioImagen("", "", 0.0, 0);
    AnuncioTradicional aTradicional = new AnuncioTradicional("", "", false, 0);
    AnuncioFrecuente aFrecuente = new AnuncioFrecuente("", "", 0.0, 0);

    VentanaImagen ventanaImagen = new VentanaImagen();
    VentanaDescuentoi ventanaDescuento = new VentanaDescuentoi();
    VentanaTradicional ventanaTradicional = new VentanaTradicional();

    //SI LOS ARCHIVOS CONTIENEN INFORMACION ESTA SE AGREGA A LOS ARRAYLISTS DEFINIDOS PREVIAMENTE
    //VARIABLES 
    private double mili = 0.0;
    private double desc = 0.0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Descripcion = new javax.swing.JTextField();
        botonCalcular = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        varFecha = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();
        lblSeccion = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        seccion = new javax.swing.JComboBox<>();
        botonConfirma = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Tipo = new javax.swing.JComboBox<>();
        botonComprar = new javax.swing.JButton();
        fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CALCULADORA ANUNCIOS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "TITULO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11)))); // NOI18N

        Titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 510, 60));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESCRIPCIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 510, 70));

        botonCalcular.setBackground(new java.awt.Color(51, 204, 0));
        botonCalcular.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botonCalcular.setForeground(new java.awt.Color(0, 51, 51));
        botonCalcular.setText("COTIZAR");
        botonCalcular.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        botonCalcular.setEnabled(false);
        botonCalcular.setFocusable(false);
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(botonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 270, 60));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("DESGLOCE ");

        jLabel3.setText("FECHA      :");

        jLabel5.setText("Cantidad de Caracteres :");

        jLabel6.setText("Precio con IVA incluido  :");

        jLabel7.setText("Seccion                          :");

        jLabel8.setText("Tipo                                :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTipo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSeccion))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPrecio))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(lblCuenta)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varFecha)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblCuenta))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblSeccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblPrecio))
                .addGap(312, 312, 312))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 270, 210));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("SECCIÓN"));

        seccion.setMaximumRowCount(5);
        seccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacionales", "Internacionales", "Deportes", "Culturales", "Económicos" }));
        seccion.setToolTipText("");
        seccion.setBorder(new javax.swing.border.MatteBorder(null));
        seccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(seccion, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(seccion)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 510, 60));

        botonConfirma.setBackground(new java.awt.Color(0, 153, 153));
        botonConfirma.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonConfirma.setText("CONFIRMAR DATOS");
        botonConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmaActionPerformed(evt);
            }
        });
        getContentPane().add(botonConfirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 510, 50));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 560, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Imagen", "Tradicional", "Cliente Frecuente" }));
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tipo, 0, 476, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 510, 70));

        botonComprar.setBackground(new java.awt.Color(0, 153, 0));
        botonComprar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botonComprar.setForeground(new java.awt.Color(204, 204, 255));
        botonComprar.setText(">>> COMPRAR <<< ");
        botonComprar.setEnabled(false);
        botonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarActionPerformed(evt);
            }
        });
        getContentPane().add(botonComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 270, 50));

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaUsuario/Fondo.png"))); // NOI18N
        getContentPane().add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seccionActionPerformed

    }//GEN-LAST:event_seccionActionPerformed
//PARA LA FECHA ; SE CREA EL FORMATO Y SE SETEA LA DECHA DEL DISPOSITIVO

    public void miFecha() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        varFecha.setText(dtf.format(now));

    }

//    ESTE BOTON CONFIRMA LOS DATOS DE LOS OBJETOS TEXTFIELD
    private void botonConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmaActionPerformed
//se ingresan los datos del output al sistema

        String opcion = String.valueOf(seccion.getSelectedItem());
        String tipo = String.valueOf(Tipo.getSelectedItem());
        int cuenta;

        String titulo = Titulo.getText();
        String descripcion = Descripcion.getText();

        try {
            //Una vez se instancio el objeto se procede a realizar las validaciones

            char letra;
            cuenta = 0;
            for (int i = 0; i < titulo.length(); i++) {
                letra = titulo.charAt(i);
                cuenta++;

            }
            if (cuenta > 15) {
                throw new Exception("Titulo debe contener 15 caracteres o menos");
            }

            if (titulo.length() == 0) {
                throw new Exception("POR FAVOR DIGITAR TITULO");
            }

            //VALIDACIONn PARA DESCRIPCION
            if (descripcion.length() == 0) {
                throw new Exception("POR FAVOR DIGITAR ALGUNA DESCRIPCION");
            }

            JOptionPane.showMessageDialog(null, "DATOS ALMACENADOS CORRECTAMENTE");
            String valSeccion = seccion.getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "SECCION ESCOGIDA : " + valSeccion);
            JOptionPane.showMessageDialog(null, "TITULO: " + titulo);
            JOptionPane.showMessageDialog(null, "DESCRIPCION: " + descripcion);

            botonCalcular.setEnabled(true);
            cuenta = 0;
            //EL switch instancia los objetos segun escoja el usuario 
            switch (tipo) {
                case "Imagen":
                    aImagen.reset();//Resetea el precio
                    ventanaImagen.setVisible(true);
                    aImagen.setTitulo(titulo);
                    aImagen.setDescripcion(descripcion);
                    aImagen.cuentaLetras(titulo, descripcion);
                    cuenta = aImagen.getCantidadLetras();
                    aImagen.setPrecio(cuenta, opcion);

                    break;

                case "Tradicional":
                    aTradicional.reset();
                    ventanaTradicional.setVisible(true);

                    aTradicional.setTitulo(titulo);
                    aTradicional.setDescripcion(descripcion);
                    aTradicional.cuentaLetras(titulo, descripcion);
                    cuenta = aTradicional.getCantidadLetras();
                    aTradicional.setPrecio(cuenta, opcion);
                    break;

                case "Cliente Frecuente":
                    aFrecuente.reset();
                    ventanaDescuento.setVisible(true);

                    aFrecuente.setTitulo(titulo);
                    aFrecuente.setDescripcion(descripcion);
                    System.out.println(descripcion);
                    aFrecuente.cuentaLetras(titulo, descripcion);
                    cuenta = aFrecuente.getCantidadLetras();
                    System.out.println(cuenta);
                    aFrecuente.setPrecio(cuenta, opcion);
                    break;
            }

        } catch (Exception error) {

            JOptionPane.showMessageDialog(null, error);

        }
        botonConfirma.setEnabled(false);

    }//GEN-LAST:event_botonConfirmaActionPerformed

    private void TituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TituloActionPerformed
// ESTE BOTON SE ACTIVA UNA VEZ QUE SE CONFIRMAN LOS DATOS

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        String tipo = String.valueOf(Tipo.getSelectedItem());
        String opcion = String.valueOf(seccion.getSelectedItem());
        boolean descuento = false;
        double precio = 0.0;
        int cuenta = 0;
        // UNA VEZ INSTANCIADOS LOS OBJETOS SE PROCEDE A REALIZAR LAS OPERACIONES O COMPORTAMIENTOS DE CADA UNO 
        //SEGUN LA SELECCION DEL USUARIO 
        try {

            miFecha();
            switch (tipo) {
                case "Imagen":
                    //se abre la ventana donde se pueden digitar los datos para ingresar los milimetros 
                    mili = Double.parseDouble(ventanaImagen.txtMili.getText());
                    aImagen.setMili(mili);
                    precio = aImagen.precioAnuincio();
                    //se aplica el IVA 
                    precio += precio * 0.13;
                    JOptionPane.showMessageDialog(null, "El precio del anuncio con imagen es :" + precio);
                    cuenta = aImagen.getCantidadLetras();

                    break;

                case "Tradicional":
                    if (ventanaTradicional.desc == true && aTradicional.getCantidadLetras() > 15) {
                        descuento = true;
                    } else {
                        ventanaTradicional.lblDesc.setText("NO");
                    }
                    aTradicional.setDescuento(descuento);
                    precio = aTradicional.precioAnuincio();
                    //se aplica el IVA 
                    precio += precio * 0.13;
                    JOptionPane.showMessageDialog(null, "El precio del anuncio es :" + precio + "\n descuento ?: " + ventanaTradicional.lblDesc.getText());
                    cuenta = aTradicional.getCantidadLetras();

                    break;

                case "Cliente Frecuente":

                    desc = Double.parseDouble(ventanaDescuento.txtDesc.getText()) / 100;
                    aFrecuente.setDescuento(desc);
                    precio = aFrecuente.precioAnuincio();
                    //se aplica el IVA 
                    precio += precio * 0.13;
                    JOptionPane.showMessageDialog(null, "El precio del anuncio es :" + precio);
                    cuenta = aFrecuente.getCantidadLetras();

                    break;
            }

        } catch (Exception e) {

        }

        //enerada con la herramienta grafica que provee netbeans
        lblCuenta.setText(String.valueOf(cuenta));
        lblSeccion.setText(opcion);
        lblTipo.setText(tipo);
        lblPrecio.setText(String.valueOf(precio));
        botonComprar.setEnabled(true);
        botonCalcular.setEnabled(false);
        botonConfirma.setEnabled(true);
    }//GEN-LAST:event_botonCalcularActionPerformed
// ESTE ES EL BOTON QUE PERMITE REGRESAR AL MENU PRINCIPAL 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoActionPerformed

    private void botonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarActionPerformed
        //Se cargan los datos en los vectores antes de la logica de negocio 

        botonComprar.setEnabled(false);
        String tipo = String.valueOf(Tipo.getSelectedItem());

        double precio = 0.0;
        int cuenta = 0;
          //LIPAR BUFFER
            vecCliente.getVector().clear();
            vecAnuncio.getAnContratados().clear();

        
        // UNA VEZ INSTANCIADOS LOS OBJETOS SE PROCEDE A REALIZAR LAS OPERACIONES O COMPORTAMIENTOS DE CADA UNO 
        //SEGUN LA SELECCION DEL USUARIO 
        try {

            try {
                lectorCliente.abrirArchCliente();
                lectorCliente.leerArchClientes(vecCliente.getVector());
                lectorCliente.cerrar();
            } catch (Exception ex) {
                
            }

            try {
                lectorAnuncio.abrirArchAnuncio();
                lectorAnuncio.leerArchAnuncios(vecAnuncio.getAnContratados());
                lectorAnuncio.cerrar();
            } catch (Exception ex) {
               
            }
            vecCliente.printOnSystem();
            vecAnuncio.printOnSystem();

            miFecha();
            switch (tipo) {
                case "Imagen":

                    precio = aImagen.precioAnuincio() + aImagen.precioAnuincio() * 0.13;
                    //se aplica el IVA 

                    JOptionPane.showMessageDialog(null, "El precio del anuncio con imagen es :" + precio);

                    cuenta = aImagen.getCantidadLetras();
                    //se almacena en el arreglo

                    //se crea al nuevo cliente que compra el anuncio
                    try {

                        int reply = JOptionPane.showConfirmDialog(null, "ES UN CLIENTE NUEVO?", "DATOS CLIENTE", JOptionPane.YES_NO_OPTION);
                        if (reply == JOptionPane.YES_OPTION) {

                            try {
                                //Se aggrega un nuevo cliente al registro    

                                //En este punto cliente tiene un id 0 temporal 
                                vecCliente.agregar(cliente);
                                //UNA VEZ AGREGADO AL CLIENTE SE PROCEDE A AGREGAR EL ANUNCIO CON EL ID DEFINIDO POR ARREGLO CLIENTE
                                anuncio.setId(cliente.getId()); // se asigna el id del cliente 
                                anuncio.setTipo(tipo);
                                anuncio.setTitulo(aImagen.getTitulo());
                                anuncio.setCosto(precio);
                                //Una vez el objeto ya contiene los datos se incluye en el arreglo para ser añadido al archivo posteriormente 

                                vecAnuncio.Vender(anuncio, cliente);

                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "ERROR : " + e);

                            }

                        } else {

                            try {
                                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "POR FAVOR INGRESE EL ID DEL CLIENTE QUE REALIZA LA COMPRA"));
                                //En este caso el ususario le indica al programa que es un cliente ya registrado por lo que no se agrega un nuevo cliente 
                                //Se busca en el registro en caso de no encontrarse entonces se agrega 

                                if (!vecCliente.eval(id)) {
                                    JOptionPane.showMessageDialog(null, "CLIENTE NO REGISTRADO FAVOR SELECCIONAR CLIENTE NUEVO");

                                } else {
                                    DatosCliente x = vecCliente.buscarCliente(id);
                                    //Se almacena el anuncio vendido 
                                    anuncio.setId(x.getId()); // se asigna el id del cliente 
                                    anuncio.setTipo(tipo);
                                    anuncio.setTitulo(aImagen.getTitulo());
                                    anuncio.setCosto(precio);

                                    vecAnuncio.Vender(anuncio, x);

                                    JOptionPane.showMessageDialog(null, "ANUNCIO REGISTRADO PARA CLIENTE" + id);
                                }
                            } catch (Exception e) {
                            }

                        }

                    } catch (Exception e) {

                    }

                    aImagen.reset();//Resetea el precio

                    //se guarda lo que tenga el arreglo en el registro
                    break;

                case "Tradicional":

                    precio = aTradicional.precioAnuincio();
                    //se aplica el IVA 
                    precio += precio * 0.13;
                    JOptionPane.showMessageDialog(null, "El precio del anuncio es :" + precio + "\n descuento ?: " + ventanaTradicional.lblDesc.getText());
                    cuenta = aTradicional.getCantidadLetras();
                    //se crea al nuevo cliente que compra el anuncio
                    try {

                        int reply = JOptionPane.showConfirmDialog(null, "ES UN CLIENTE NUEVO?", "DATOS CLIENTE", JOptionPane.YES_NO_OPTION);
                        if (reply == JOptionPane.YES_OPTION) {

                            try {
                                //Se aggrega un nuevo cliente al registro    

                                //En este punto cliente tiene un id 0 temporal 
                                vecCliente.agregar(cliente);
                                //UNA VEZ AGREGADO AL CLIENTE SE PROCEDE A AGREGAR EL ANUNCIO CON EL ID DEFINIDO POR ARREGLO CLIENTE
                                anuncio.setId(cliente.getId()); // se asigna el id del cliente 
                                anuncio.setTipo(tipo);
                                anuncio.setTitulo(aTradicional.getTitulo());
                                anuncio.setCosto(precio);
                                //Una vez el objeto ya contiene los datos se incluye en el arreglo para ser añadido al archivo posteriormente 

                                vecAnuncio.Vender(anuncio, cliente);

                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "ERROR : " + e);

                            }

                        } else {

                            try {
                                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "POR FAVOR INGRESE EL ID DEL CLIENTE QUE REALIZA LA COMPRA"));
                                //En este caso el ususario le indica al programa que es un cliente ya registrado por lo que no se agrega un nuevo cliente 
                                //Se busca en el registro en caso de no encontrarse entonces se agrega 

                                if (!vecCliente.eval(id)) {
                                    JOptionPane.showMessageDialog(null, "CLIENTE NO REGISTRADO FAVOR SELECCIONAR CLIENTE NUEVO");

                                } else {
                                    DatosCliente x = vecCliente.buscarCliente(id);
                                    //Se almacena el anuncio vendido 
                                    anuncio.setId(x.getId()); // se asigna el id del cliente 
                                    anuncio.setTipo(tipo);
                                    anuncio.setTitulo(aTradicional.getTitulo());
                                    anuncio.setCosto(precio);
                                    vecAnuncio.Vender(anuncio, x);

                                    JOptionPane.showMessageDialog(null, "ANUNCIO REGISTRADO PARA CLIENTE" + id);
                                }
                            } catch (Exception e) {
                            }

                        }

                    } catch (Exception e) {

                    }

                    aTradicional.reset();

                    break;

                case "Cliente Frecuente":

                    desc = Double.parseDouble(ventanaDescuento.txtDesc.getText()) / 100;
                    aFrecuente.setDescuento(desc);
                    precio = aFrecuente.precioAnuincio();
                    //se aplica el IVA 
                    precio += precio * 0.13;
                    JOptionPane.showMessageDialog(null, "El precio del anuncio es :" + precio);
                    cuenta = aFrecuente.getCantidadLetras();

                    //se crea al nuevo cliente que compra el anuncio
                    try {

                        int reply = JOptionPane.showConfirmDialog(null, "ES UN CLIENTE NUEVO?", "DATOS CLIENTE", JOptionPane.YES_NO_OPTION);
                        if (reply == JOptionPane.YES_OPTION) {

                            try {
                                //Se aggrega un nuevo cliente al registro    

                                //En este punto cliente tiene un id 0 temporal 
                                vecCliente.agregar(cliente);
                                //UNA VEZ AGREGADO AL CLIENTE SE PROCEDE A AGREGAR EL ANUNCIO CON EL ID DEFINIDO POR ARREGLO CLIENTE
                                anuncio.setId(cliente.getId()); // se asigna el id del cliente 
                                anuncio.setTipo(tipo);
                                anuncio.setTitulo(aFrecuente.getTitulo());
                                anuncio.setCosto(precio);
                                //Una vez el objeto ya contiene los datos se incluye en el arreglo para ser añadido al archivo posteriormente 

                                vecAnuncio.Vender(anuncio, cliente);

                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "ERROR : " + e);

                            }

                        } else {

                            try {
                                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "POR FAVOR INGRESE EL ID DEL CLIENTE QUE REALIZA LA COMPRA"));
                                //En este caso el ususario le indica al programa que es un cliente ya registrado por lo que no se agrega un nuevo cliente 
                                //Se busca en el registro en caso de no encontrarse entonces se agrega 

                                if (!vecCliente.eval(id)) {
                                    JOptionPane.showMessageDialog(null, "CLIENTE NO REGISTRADO FAVOR SELECCIONAR CLIENTE NUEVO");

                                } else {
                                    DatosCliente x = vecCliente.buscarCliente(id);
                                    //Se almacena el anuncio vendido 
                                    anuncio.setId(x.getId()); // se asigna el id del cliente 
                                    anuncio.setTipo(tipo);
                                    anuncio.setTitulo(aFrecuente.getTitulo());
                                    anuncio.setCosto(precio);
                                    vecAnuncio.Vender(anuncio, x);
                                    JOptionPane.showMessageDialog(null, "ANUNCIO REGISTRADO PARA CLIENTE" + id);

                                }
                            } catch (Exception e) {
                            }

                        }

                    } catch (Exception e) {

                    }
                    aFrecuente.reset();

                    break;
            }

        } catch (Exception e) {

        }
        try {
            //UNA VEZ ALMACENADOS LOS OBJETOS EN LOS ARREGLOS DEFINIDOS SE PROCEDE A IMPRIMIR EN LOS ARCHIVOS LA INFROMACION CORRESPONDIENTE
            //Imprime datos en el archivo
            archCliente.abrirArchivo();
            archCliente.imprime(vecCliente.getVector());
            archCliente.cerrarArchivo();

            archAnuncio.abrirArchivo();
            archAnuncio.imprime(vecAnuncio.getAnContratados());
            archAnuncio.cerrarArchivo();
            //Imprime vectores en consola
            vecCliente.printOnSystem();
            vecAnuncio.printOnSystem();

            //LIPAR BUFFER
            vecCliente.getVector().clear();
            vecAnuncio.getAnContratados().clear();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_botonComprarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Descripcion;
    private javax.swing.JComboBox<String> Tipo;
    public javax.swing.JTextField Titulo;
    public javax.swing.JButton botonCalcular;
    public javax.swing.JButton botonComprar;
    public javax.swing.JButton botonConfirma;
    public javax.swing.JLabel fondo2;
    public javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JLabel lblCuenta;
    public javax.swing.JLabel lblPrecio;
    public javax.swing.JLabel lblSeccion;
    public javax.swing.JLabel lblTipo;
    private javax.swing.JComboBox<String> seccion;
    public javax.swing.JLabel varFecha;
    // End of variables declaration//GEN-END:variables
}
