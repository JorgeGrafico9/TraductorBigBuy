/*
 * Copyright (C) 2017 ADMINISTRACION2
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package traductor_bigb;

import java.io.*;
import javax.swing.*;

/**
 *
 * @author ADMINISTRACION2
 */
public class Traductor_BigBuy extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public Traductor_BigBuy() {
        super("Traductor BigBuy");
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /*
    * VARIABLES A IMPLEMENTAR
    */
    public String PATHCATEGORIAS = "";
    public String PATHPRODUCTOS = "";
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel2 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        Ventana = new javax.swing.JPanel();
        ACEPTAR = new javax.swing.JButton();
        FieldPathCAT = new javax.swing.JTextField();
        FieldPathPROD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SubirArchivo1 = new javax.swing.JButton();
        SubirArchivo2 = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ACEPTAR.setText("Aceptar");
        ACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACEPTARActionPerformed(evt);
            }
        });

        FieldPathCAT.setName("CSVCategorias"); // NOI18N
        FieldPathCAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPathCATActionPerformed(evt);
            }
        });

        FieldPathPROD.setName("CSVProductos"); // NOI18N
        FieldPathPROD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPathPRODActionPerformed(evt);
            }
        });

        jLabel1.setText("CSV Categorías");

        jLabel2.setText("CSV Productos");

        SubirArchivo1.setText("Subir archivo");
        SubirArchivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubirArchivo1ActionPerformed(evt);
            }
        });

        SubirArchivo2.setText("Subir archivo");
        SubirArchivo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubirArchivo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VentanaLayout = new javax.swing.GroupLayout(Ventana);
        Ventana.setLayout(VentanaLayout);
        VentanaLayout.setHorizontalGroup(
            VentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(VentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(VentanaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(FieldPathCAT, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SubirArchivo1))
                    .addGroup(VentanaLayout.createSequentialGroup()
                        .addGroup(VentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ACEPTAR)
                            .addGroup(VentanaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(FieldPathPROD, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(SubirArchivo2)))
                .addGap(52, 52, 52))
        );
        VentanaLayout.setVerticalGroup(
            VentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(VentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldPathCAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(SubirArchivo1))
                .addGap(33, 33, 33)
                .addGroup(VentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldPathPROD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(SubirArchivo2))
                .addGap(40, 40, 40)
                .addComponent(ACEPTAR)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ventana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ventana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACEPTARActionPerformed
        // TODO add your handling code here        
        
        //Acciones previas
        
        
        //Recojo lo que está puesto en los campos de texto y lo meto en las variables públicas
       String CSVCatPath = new String (FieldPathCAT.getText());
       String CSVProdPath = new String (FieldPathPROD.getText());
       PATHCATEGORIAS = CSVCatPath;
       PATHPRODUCTOS = CSVProdPath;
       
       
       
       //Enseño mensajes
       JOptionPane.showMessageDialog(null, "Los campos recogidos son: " + PATHCATEGORIAS + " y " + PATHPRODUCTOS);
       
       // Aquí se llama a TRADUCTOR CSV
       
        Traductor_CSV traductor = new Traductor_CSV(PATHCATEGORIAS, PATHPRODUCTOS);
        traductor.run();
        
//        Si se ha creado el archivo, entonces... 
//       if (true){
//        JOptionPane.showMessageDialog(null, "Se ha creado el archivo traducido satisfactoriamente.");
//       }
    }//GEN-LAST:event_ACEPTARActionPerformed

    private void FieldPathPRODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPathPRODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPathPRODActionPerformed

    private void FieldPathCATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPathCATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPathCATActionPerformed

    private void SubirArchivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubirArchivo1ActionPerformed
        // TODO add your handling code here:
      
        JFileChooser file=new JFileChooser();
        file.showOpenDialog(this);
        
        try {
            File archivo = file.getSelectedFile();
            FieldPathCAT.setText(archivo.getPath());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e+"" +
           "\nNo se ha encontrado el archivo",
                 "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_SubirArchivo1ActionPerformed

    private void SubirArchivo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubirArchivo2ActionPerformed
        // TODO add your handling code here:
         JFileChooser file=new JFileChooser();
        file.showOpenDialog(this);
         try {
            File archivo = file.getSelectedFile();
            FieldPathPROD.setText(archivo.getPath());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e+"" +
           "\nNo se ha encontrado el archivo",
                 "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SubirArchivo2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        Traductor_BigBuy v = new Traductor_BigBuy();
        v.setVisible(true);
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Traductor_BigBuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Traductor_BigBuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Traductor_BigBuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Traductor_BigBuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Traductor_BigBuy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACEPTAR;
    private javax.swing.JTextField FieldPathCAT;
    private javax.swing.JTextField FieldPathPROD;
    private javax.swing.JButton SubirArchivo1;
    private javax.swing.JButton SubirArchivo2;
    private javax.swing.JPanel Ventana;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
