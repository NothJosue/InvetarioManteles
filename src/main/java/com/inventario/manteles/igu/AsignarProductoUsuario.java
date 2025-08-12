package com.inventario.manteles.igu;

import com.inventario.manteles.modelo.Cliente;
import com.inventario.manteles.modelo.Compra;
import com.inventario.manteles.modelo.Controladora;
import com.inventario.manteles.modelo.MesaACrochet;
import java.util.Locale;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AsignarProductoUsuario extends javax.swing.JInternalFrame {

    Controladora control = null;
    static Cliente clienteCaptado = null;
    static MesaACrochet mantelCaptado = null;

    public AsignarProductoUsuario() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAsignacion = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAsignar = new javax.swing.JButton();
        txtBuscarCliente = new javax.swing.JTextField();
        txtBuscarMantel = new javax.swing.JTextField();
        btnBuscarMantel = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        dtFechaVenta = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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

        tblAsignacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblAsignacion.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblAsignacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAsignacionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAsignacionMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblAsignacion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 760, 250));

        jPanel1.setPreferredSize(new java.awt.Dimension(660, 40));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Cliente : ");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Mantel : ");

        btnAsignar.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconGuardar.png")); // NOI18N
        btnAsignar.setText("Asignar");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        txtBuscarCliente.setEditable(false);
        txtBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarClienteActionPerformed(evt);
            }
        });

        txtBuscarMantel.setEditable(false);

        btnBuscarMantel.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconBuscar.png")); // NOI18N
        btnBuscarMantel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMantelActionPerformed(evt);
            }
        });

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconBuscar.png")); // NOI18N
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        dtFechaVenta.setLocale(new Locale("es", "ES"));
        dtFechaVenta.setDateFormatString("dd/MM/yyyy");
        dtFechaVenta.setMinimumSize(new java.awt.Dimension(120, 22));
        dtFechaVenta.setPreferredSize(new java.awt.Dimension(120, 22));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("fecha de venta : ");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cantidad : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarCliente)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarMantel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnBuscarMantel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(dtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarMantel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBuscarMantel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAsignar)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 760, 140));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoGrisOscuro.jpg"))); // NOI18N
        fondo.setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiar() {
        txtBuscarCliente.setText("");
        txtBuscarMantel.setText("");
        txtCantidad.setText("0");
        dtFechaVenta.cleanup();
    }

    public void cargarTabla() {
        DefaultTableModel modelTable = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        // Colocar los valores de las filas y columnas
        String titulos[] = {"Cliente", "Mantel", "Fecha de Compra", "Cantidad", "Precio Unitario", "Total"};
        modelTable.setColumnIdentifiers(titulos);

        // Cargar los datos desde la base de datos
        List<Compra> listaCompras = control.traerCompras();

        //  Recorrer la lista y mostrar cada uno de los elementos en la tabla
        if (listaCompras != null) {
            for (Compra compra : listaCompras) {
                Object[] objeto = {
                    compra.getCliente().getNombres() + " " + compra.getCliente().getApellidos(),
                    compra.getMantel().getForma() + " " + compra.getMantel().getColor() + " " + String.valueOf(compra.getMantel().getNumeroSillas() + " sillas"),
                    compra.getFechaCompra(),
                    compra.getCantidad(),
                    compra.getPrecioUnitario(),
                    compra.getTotal()
                };
                modelTable.addRow(objeto);
            }
        }

        tblAsignacion.setModel(modelTable);
    }
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargarTabla();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        if ((mantelCaptado.getCantidad() >= Integer.parseInt(txtCantidad.getText())) && (Integer.parseInt(txtCantidad.getText()) > 0)) {
            Compra compra = new Compra(clienteCaptado, mantelCaptado, Integer.parseInt(txtCantidad.getText()), mantelCaptado.getPrecio(), dtFechaVenta.getDate());
            JOptionPane.showMessageDialog(null, "La asignación de la compra es correcta", "Exito en la compra", JOptionPane.INFORMATION_MESSAGE);
            control.guardarCompra(compra);
            clienteCaptado.setDeuda(clienteCaptado.getDeuda() + compra.getTotal());
            mantelCaptado.setCantidad(mantelCaptado.getCantidad() - compra.getCantidad());
            control.actualizarCliente(clienteCaptado);
            control.actualizarMantelMesa(mantelCaptado);
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "La cantidad tiene que ser mayor a 0 y fijese el stock que quedan", "Advertencia con la compra", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void tblAsignacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAsignacionMouseClicked

    }//GEN-LAST:event_tblAsignacionMouseClicked

    private void tblAsignacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAsignacionMousePressed
        /*String nombres = String.valueOf(tblAsignacion.getValueAt(tblAsignacion.getSelectedRow(), 0));
        String apellidos = String.valueOf(tblAsignacion.getValueAt(tblAsignacion.getSelectedRow(), 1));

        Cliente clienteEncontrado = control.buscarClienteNombresApellidos(nombres, apellidos);

        this.clienteCaptado = clienteEncontrado;*/
    }//GEN-LAST:event_tblAsignacionMousePressed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        BuscarCliente buscarClientePantalla = new BuscarCliente();
        PanelAdministrativo.panelEscritorio.add(buscarClientePantalla);
        buscarClientePantalla.setVisible(true);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void txtBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarClienteActionPerformed

    private void btnBuscarMantelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMantelActionPerformed
        BuscarMantelMesa buscarMantelPantalla = new BuscarMantelMesa();
        PanelAdministrativo.panelEscritorio.add(buscarMantelPantalla);
        buscarMantelPantalla.setVisible(true);
    }//GEN-LAST:event_btnBuscarMantelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarMantel;
    private com.toedter.calendar.JDateChooser dtFechaVenta;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAsignacion;
    public static javax.swing.JTextField txtBuscarCliente;
    public static javax.swing.JTextField txtBuscarMantel;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
