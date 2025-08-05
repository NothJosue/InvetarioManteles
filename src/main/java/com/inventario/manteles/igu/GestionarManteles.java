package com.inventario.manteles.igu;

import com.google.protobuf.StringValue;
import com.inventario.manteles.modelo.Controladora;
import com.inventario.manteles.modelo.MesaACrochet;
import com.inventario.manteles.modelo.Rol;
import com.inventario.manteles.modelo.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionarManteles extends javax.swing.JInternalFrame {

    Controladora control = null;
    MesaACrochet mantelMesaCaptado = null;

    public GestionarManteles() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblManteles = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cmbForma = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbColor = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbCantidadSillas = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtTamanio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblManteles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblManteles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMantelesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblMantelesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblManteles);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 530, 250));

        btnEliminar.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconEliminar.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconEditar.png")); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("GESTIÓN DE MANTELES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 290, -1));

        jPanel1.setPreferredSize(new java.awt.Dimension(660, 40));

        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Forma : ");

        cmbForma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Ovalado", "Redondo", "Rectangular", "Cuadrado" }));
        cmbForma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFormaActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Color :");

        cmbColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Perla", "Navideño" }));

        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("# de Sillas :");

        cmbCantidadSillas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "4", "6", "8", "10" }));
        cmbCantidadSillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCantidadSillasActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Tamaño (cm) :");

        txtTamanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamanioActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Precio :");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Cantidad :");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbForma, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCantidadSillas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(295, 295, 295))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCantidadSillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 780, 140));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoGrisOscuro.jpg"))); // NOI18N
        fondo.setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiar() {
        txtTamanio.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        cmbCantidadSillas.setSelectedIndex(0);
        cmbColor.setSelectedIndex(0);
        cmbForma.setSelectedIndex(0);
    }

    public void cargarTabla() {
        DefaultTableModel modelTable = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        // Colocar los valores de las filas y columnas
        String titulos[] = {"Forma", "Color", "# Sillas", "Tamaño", "Cantidad", "Precio"};
        modelTable.setColumnIdentifiers(titulos);

        // Cargar los datos desde la base de datos
        List<MesaACrochet> listasMesas = control.traerListaMesas();

        //  Recorrer la lista y mostrar cada uno de los elementos en la tabla
        if (listasMesas != null) {
            for (MesaACrochet mesa : listasMesas) {
                Object[] objeto = {
                    mesa.getForma(),
                    mesa.getColor(),
                    mesa.getNumeroSillas(),
                    mesa.getTamanio(),
                    mesa.getCantidad(),
                    mesa.getPrecio()
                };
                modelTable.addRow(objeto);
            }
        }

        tblManteles.setModel(modelTable);
    }
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargarTabla();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (mantelMesaCaptado != null) {
            control.eliminarMantelMesa(mantelMesaCaptado.getId());
            JOptionPane.showMessageDialog(null, "Mantel eliminado exitosamente", "Mantel Eliminado", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "El mantel no se pudo eliminar", "Mantel NO Eliminado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        mantelMesaCaptado.setTamanio(Float.parseFloat(txtTamanio.getText()));
        mantelMesaCaptado.setPrecio(Float.parseFloat(txtPrecio.getText()));
        mantelMesaCaptado.setCantidad(Integer.parseInt(txtCantidad.getText()));
        mantelMesaCaptado.setForma(String.valueOf(cmbForma.getSelectedItem()));
        mantelMesaCaptado.setColor(String.valueOf(cmbColor.getSelectedItem()));
        mantelMesaCaptado.setNumeroSillas(Integer.parseInt(String.valueOf(cmbCantidadSillas.getSelectedItem())));


        control.actualizarMantelMesa(mantelMesaCaptado);
        
        JOptionPane.showMessageDialog(null, "Mantel de mesa actualizado correctamente", "Mantel Actualizado", JOptionPane.INFORMATION_MESSAGE);

        cargarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tblMantelesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMantelesMouseClicked

    }//GEN-LAST:event_tblMantelesMouseClicked

    private void tblMantelesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMantelesMousePressed

        String forma = String.valueOf(tblManteles.getValueAt(tblManteles.getSelectedRow(), 0));
        String color = String.valueOf(tblManteles.getValueAt(tblManteles.getSelectedRow(), 1));
        int numero_sillas = Integer.parseInt(String.valueOf(tblManteles.getValueAt(tblManteles.getSelectedRow(), 2)));
        float tamanio = Float.parseFloat(String.valueOf(tblManteles.getValueAt(tblManteles.getSelectedRow(), 3)));
        var mantelMesaEncontrado = control.buscarMantelMesaFCNT(forma, color, numero_sillas, tamanio);

        txtTamanio.setText(Float.toString(mantelMesaEncontrado.getTamanio()));
        txtCantidad.setText(Integer.toString(mantelMesaEncontrado.getCantidad()));
        txtPrecio.setText(Float.toString(mantelMesaEncontrado.getPrecio()));
        cmbCantidadSillas.setSelectedItem(Integer.toString(mantelMesaEncontrado.getNumeroSillas()));
        cmbColor.setSelectedItem(mantelMesaEncontrado.getColor());
        cmbForma.setSelectedItem(mantelMesaEncontrado.getForma());

        this.mantelMesaCaptado = mantelMesaEncontrado;
    }//GEN-LAST:event_tblMantelesMousePressed

    private void cmbFormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFormaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFormaActionPerformed

    private void cmbCantidadSillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCantidadSillasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCantidadSillasActionPerformed

    private void txtTamanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamanioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTamanioActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cmbCantidadSillas;
    private javax.swing.JComboBox<String> cmbColor;
    private javax.swing.JComboBox<String> cmbForma;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManteles;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTamanio;
    // End of variables declaration//GEN-END:variables
}
