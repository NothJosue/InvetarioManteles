package com.inventario.manteles.igu;

import com.inventario.manteles.modelo.Controladora;
import com.inventario.manteles.modelo.MesaACrochet;
import javax.swing.JOptionPane;

public class NuevoMantel extends javax.swing.JInternalFrame {

    Controladora control = null;
    
    public NuevoMantel() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbCantidadSillas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbForma = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbColor = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTamanio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCantidad1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCantidad2 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Nuevo Mantel");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("# de Sillas :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 70, 20));

        cmbCantidadSillas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "4", "6", "8", "10" }));
        cmbCantidadSillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCantidadSillasActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCantidadSillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 140, -1));

        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Forma : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 77, -1));

        cmbForma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Ovalado", "Redondo", "Rectangular", "Cuadrado" }));
        cmbForma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFormaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbForma, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 140, -1));

        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Color :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 77, -1));

        cmbColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Perla", "Navideño" }));
        getContentPane().add(cmbColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 140, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Ejemplo 1.6m  = 160cm");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Tamaño (cm) :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txtTamanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamanioActionPerformed(evt);
            }
        });
        getContentPane().add(txtTamanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 140, -1));

        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Precio :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 77, -1));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 140, -1));

        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Cantidad :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 77, -1));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 140, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconLimpiar.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconGuardar.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\fondo_gris.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 430));

        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Cantidad :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 77, -1));

        txtCantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidad1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 140, -1));

        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Cantidad :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 77, -1));

        txtCantidad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidad2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFormaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFormaActionPerformed

    private void txtTamanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamanioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTamanioActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    
    public void limpiar(){
        txtTamanio.setText("");
        txtPrecio.setText("");
        txtCantidad.setText("");

        cmbCantidadSillas.setSelectedIndex(0);
        cmbColor.setSelectedIndex(0);
        cmbForma.setSelectedIndex(0);
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        final Integer NUMERO_SILLAS[] = {null, 4, 6, 8, 10};
        final String FORMAS[] = {null, "Ovalado", "Redondo", "Rectangular", "Cuadrado"};
        final String COLORES[] = {null, "Perla", "Navideño"};
        Integer cantidad_sillas = NUMERO_SILLAS[cmbCantidadSillas.getSelectedIndex()];
        String tipo_forma = (String) FORMAS[cmbForma.getSelectedIndex()];
        String tipo_color = (String) COLORES[cmbColor.getSelectedIndex()];

        if (cantidad_sillas != null
            && tipo_forma != null
            && tipo_color != null
            && txtTamanio.getText() != null
            && txtPrecio.getText() != null
            && txtCantidad.getText() != null) {

            var mantelMesa = new MesaACrochet(
                tipo_color,
                Float.parseFloat(txtTamanio.getText()),
                Float.parseFloat(txtPrecio.getText()),
                Integer.parseInt(txtCantidad.getText()),
                tipo_forma,
                cantidad_sillas
            );
            control.crearMantelMesa(mantelMesa);
            JOptionPane.showMessageDialog(null, "Registro exitoso", "Registrando Mantel", JOptionPane.INFORMATION_MESSAGE);
            limpiar();

        } else {
            JOptionPane.showMessageDialog(null, "Tiene que llenar todos los campos para podrer registrar el mantel", "Llenar los campos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbCantidadSillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCantidadSillasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCantidadSillasActionPerformed

    private void txtCantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidad1ActionPerformed

    private void txtCantidad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidad2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbCantidadSillas;
    private javax.swing.JComboBox<String> cmbColor;
    private javax.swing.JComboBox<String> cmbForma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidad1;
    private javax.swing.JTextField txtCantidad2;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTamanio;
    // End of variables declaration//GEN-END:variables
}
