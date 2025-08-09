package com.inventario.manteles.igu;

import com.inventario.manteles.modelo.Cliente;
import com.inventario.manteles.modelo.Controladora;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class BuscarCliente extends javax.swing.JInternalFrame {

    Controladora control = null;
    Cliente clienteCaptado = null;

    public BuscarCliente() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
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

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblClientesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 430, 250));

        btnSeleccionar.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconSeleccionar.png")); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoGrisOscuro.jpg"))); // NOI18N
        fondo.setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 300));

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
        String titulos[] = {"Nombres", "Apellidos", "Distrito", "Dirección", "Referencia", "Telefono", "Deuda"};
        modelTable.setColumnIdentifiers(titulos);

        // Cargar los datos desde la base de datos
        List<Cliente> listaClientes = control.traerClientes();

        //  Recorrer la lista y mostrar cada uno de los elementos en la tabla
        if (listaClientes != null) {
            for (Cliente cliente : listaClientes) {
                Object[] objeto = {
                    cliente.getNombres(),
                    cliente.getApellidos(),
                    cliente.getDistrito(),
                    cliente.getDireccion(),
                    cliente.getReferencia(),
                    cliente.getTelefono(),
                    cliente.getDeuda()
                };
                modelTable.addRow(objeto);
            }
        }

        tblClientes.setModel(modelTable);
    }
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargarTabla();
    }//GEN-LAST:event_formInternalFrameOpened

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked

    }//GEN-LAST:event_tblClientesMouseClicked

    private void tblClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMousePressed
        String nombres = String.valueOf(tblClientes.getValueAt(tblClientes.getSelectedRow(), 0));
        String apellidos = String.valueOf(tblClientes.getValueAt(tblClientes.getSelectedRow(), 1));

        Cliente clienteEncontrado = control.buscarClienteNombresApellidos(nombres, apellidos);
        this.clienteCaptado = clienteEncontrado;
        AsignarProductoUsuario.clienteCaptado = clienteEncontrado;
    }//GEN-LAST:event_tblClientesMousePressed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        dispose();
        AsignarProductoUsuario.txtBuscarCliente.setText(clienteCaptado.getNombres() + " " + clienteCaptado.getApellidos());
    }//GEN-LAST:event_btnSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}
