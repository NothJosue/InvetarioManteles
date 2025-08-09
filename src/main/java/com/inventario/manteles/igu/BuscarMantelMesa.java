package com.inventario.manteles.igu;

import com.inventario.manteles.modelo.Controladora;
import com.inventario.manteles.modelo.MesaACrochet;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class BuscarMantelMesa extends javax.swing.JInternalFrame {

    Controladora control = null;
    MesaACrochet mantelMesaCaptado = null;

    public BuscarMantelMesa() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblManteles = new javax.swing.JTable();
        btnSeleccionar = new javax.swing.JButton();
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, 250));

        btnSeleccionar.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconSeleccionar.png")); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoGrisOscuro.jpg"))); // NOI18N
        fondo.setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents


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

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        dispose();
        AsignarProductoUsuario.txtBuscarMantel.setText(mantelMesaCaptado.getForma() + " " + mantelMesaCaptado.getColor() + " " + String.valueOf(mantelMesaCaptado.getNumeroSillas()) + " sillas");
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void tblMantelesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMantelesMouseClicked

    }//GEN-LAST:event_tblMantelesMouseClicked

    private void tblMantelesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMantelesMousePressed

        String forma = String.valueOf(tblManteles.getValueAt(tblManteles.getSelectedRow(), 0));
        String color = String.valueOf(tblManteles.getValueAt(tblManteles.getSelectedRow(), 1));
        int numero_sillas = Integer.parseInt(String.valueOf(tblManteles.getValueAt(tblManteles.getSelectedRow(), 2)));
        float tamanio = Float.parseFloat(String.valueOf(tblManteles.getValueAt(tblManteles.getSelectedRow(), 3)));
        var mantelMesaEncontrado = control.buscarMantelMesaFCNT(forma, color, numero_sillas, tamanio);

        this.mantelMesaCaptado = mantelMesaEncontrado;
        AsignarProductoUsuario.mantelCaptado = mantelMesaEncontrado;
    }//GEN-LAST:event_tblMantelesMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManteles;
    // End of variables declaration//GEN-END:variables
}
