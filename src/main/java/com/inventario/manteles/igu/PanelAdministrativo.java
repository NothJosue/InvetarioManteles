package com.inventario.manteles.igu;

import com.inventario.manteles.modelo.Cliente;
import com.inventario.manteles.modelo.Compra;
import com.inventario.manteles.modelo.Controladora;
import com.inventario.manteles.modelo.MesaACrochet;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.UnitValue;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PanelAdministrativo extends javax.swing.JFrame {

    Controladora control;

    public PanelAdministrativo() {
        control = new Controladora();
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistemad de Manteles");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        subMenuNuevoUsuario = new javax.swing.JMenuItem();
        subMenuGestionarUsuarios = new javax.swing.JMenuItem();
        menuManteles = new javax.swing.JMenu();
        subMenuNuevoMantel = new javax.swing.JMenuItem();
        subMenuGestionarManteles = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenu();
        subMenuNuevoCliente = new javax.swing.JMenuItem();
        subMenuGestionarClientes = new javax.swing.JMenuItem();
        Asignaciones = new javax.swing.JMenu();
        subMenuAsignarProductoUsuario = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        subMenuReportesManteles = new javax.swing.JMenuItem();
        subMenuReportesClientes = new javax.swing.JMenuItem();
        subMenuReportesCompras = new javax.swing.JMenuItem();
        menuHistorial = new javax.swing.JMenu();
        subMenuHistorial = new javax.swing.JMenuItem();
        menuCerrarSesion = new javax.swing.JMenu();
        subMenuCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        panelEscritorio.setMinimumSize(new java.awt.Dimension(1150, 580));
        getContentPane().add(panelEscritorio);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuUsuario.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconUsuario.png")); // NOI18N
        menuUsuario.setText("Usuario");
        menuUsuario.setMinimumSize(new java.awt.Dimension(190, 50));
        menuUsuario.setPreferredSize(new java.awt.Dimension(190, 50));

        subMenuNuevoUsuario.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconAgregarUsuario.png")); // NOI18N
        subMenuNuevoUsuario.setText("Nuevo Usuario");
        subMenuNuevoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subMenuNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuNuevoUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(subMenuNuevoUsuario);

        subMenuGestionarUsuarios.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconConfiguracionGenerales.png")); // NOI18N
        subMenuGestionarUsuarios.setText("Gestionar Usuarios");
        subMenuGestionarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subMenuGestionarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuGestionarUsuariosActionPerformed(evt);
            }
        });
        menuUsuario.add(subMenuGestionarUsuarios);

        jMenuBar1.add(menuUsuario);

        menuManteles.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconProductoMantel.png")); // NOI18N
        menuManteles.setText("Manteles");
        menuManteles.setMinimumSize(new java.awt.Dimension(190, 50));
        menuManteles.setPreferredSize(new java.awt.Dimension(190, 50));

        subMenuNuevoMantel.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconAgregarProducto.png")); // NOI18N
        subMenuNuevoMantel.setText("Nuevo Mantel");
        subMenuNuevoMantel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subMenuNuevoMantel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuNuevoMantelActionPerformed(evt);
            }
        });
        menuManteles.add(subMenuNuevoMantel);

        subMenuGestionarManteles.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconGestionarProductoMantel.png")); // NOI18N
        subMenuGestionarManteles.setText("Gestionar Manteles");
        subMenuGestionarManteles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subMenuGestionarManteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuGestionarMantelesActionPerformed(evt);
            }
        });
        menuManteles.add(subMenuGestionarManteles);

        jMenuBar1.add(menuManteles);

        menuCliente.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconCliente.png")); // NOI18N
        menuCliente.setText("Cliente");
        menuCliente.setMinimumSize(new java.awt.Dimension(190, 50));
        menuCliente.setPreferredSize(new java.awt.Dimension(190, 50));

        subMenuNuevoCliente.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconAgregarCliente.png")); // NOI18N
        subMenuNuevoCliente.setText("Nuevo Cliente");
        subMenuNuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subMenuNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuNuevoClienteActionPerformed(evt);
            }
        });
        menuCliente.add(subMenuNuevoCliente);

        subMenuGestionarClientes.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconConfiguracionGenerales.png")); // NOI18N
        subMenuGestionarClientes.setText("Gestionar Clientes");
        subMenuGestionarClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subMenuGestionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuGestionarClientesActionPerformed(evt);
            }
        });
        menuCliente.add(subMenuGestionarClientes);

        jMenuBar1.add(menuCliente);

        Asignaciones.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconAsignacion.png")); // NOI18N
        Asignaciones.setText("Asignaciones");
        Asignaciones.setMinimumSize(new java.awt.Dimension(190, 50));
        Asignaciones.setPreferredSize(new java.awt.Dimension(190, 50));

        subMenuAsignarProductoUsuario.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconAsignarProductoUsuario.png")); // NOI18N
        subMenuAsignarProductoUsuario.setText("Asignar producto al usuario");
        subMenuAsignarProductoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuAsignarProductoUsuarioActionPerformed(evt);
            }
        });
        Asignaciones.add(subMenuAsignarProductoUsuario);

        jMenuBar1.add(Asignaciones);

        menuReportes.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconReporte.png")); // NOI18N
        menuReportes.setText("Reportes");
        menuReportes.setMinimumSize(new java.awt.Dimension(190, 50));
        menuReportes.setPreferredSize(new java.awt.Dimension(190, 50));

        subMenuReportesManteles.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconRepotesGenerales.png")); // NOI18N
        subMenuReportesManteles.setText("Reportes Manteles");
        subMenuReportesManteles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subMenuReportesManteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuReportesMantelesActionPerformed(evt);
            }
        });
        menuReportes.add(subMenuReportesManteles);

        subMenuReportesClientes.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconRepotesGenerales.png")); // NOI18N
        subMenuReportesClientes.setText("Reportes Clientes");
        subMenuReportesClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subMenuReportesClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuReportesClientesActionPerformed(evt);
            }
        });
        menuReportes.add(subMenuReportesClientes);

        subMenuReportesCompras.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconRepotesGenerales.png")); // NOI18N
        subMenuReportesCompras.setText("Reportes Compras");
        subMenuReportesCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuReportesComprasActionPerformed(evt);
            }
        });
        menuReportes.add(subMenuReportesCompras);

        jMenuBar1.add(menuReportes);

        menuHistorial.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconHistorial.png")); // NOI18N
        menuHistorial.setText("Historial");
        menuHistorial.setMinimumSize(new java.awt.Dimension(190, 50));
        menuHistorial.setPreferredSize(new java.awt.Dimension(190, 50));

        subMenuHistorial.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconHistorialGeneral.png")); // NOI18N
        subMenuHistorial.setText("Ver Historial");
        subMenuHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subMenuHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuHistorialActionPerformed(evt);
            }
        });
        menuHistorial.add(subMenuHistorial);

        jMenuBar1.add(menuHistorial);

        menuCerrarSesion.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconCerrarSesion.png")); // NOI18N
        menuCerrarSesion.setText("Cerrar Sesión");
        menuCerrarSesion.setMinimumSize(new java.awt.Dimension(190, 50));
        menuCerrarSesion.setPreferredSize(new java.awt.Dimension(190, 50));

        subMenuCerrarSesion.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconCerrarSesion.png")); // NOI18N
        subMenuCerrarSesion.setText("Cerrar Sesión");
        subMenuCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subMenuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuCerrarSesionActionPerformed(evt);
            }
        });
        menuCerrarSesion.add(subMenuCerrarSesion);

        jMenuBar1.add(menuCerrarSesion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuReportesClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuReportesClientesActionPerformed
        String ruta = "D:/Reportes_Clientes.pdf";
        try {
            PdfDocument pdf = new PdfDocument(new PdfWriter(ruta));
            Document documento = new Document(pdf);
            Table table = new Table(UnitValue.createPercentArray(7)).useAllAvailableWidth();
            final String[] columnasManteles = {" ", "Nombres y Apellidos", "Telefono", "Distrito", "Dirección", "Referencia", "Fecha de Visita", "Deuda"};
            int numero_de_filas = 1;

            // Agregar nombre de las columnas
            for (int i = 0; i < 7; i++) {
                table.addCell(columnasManteles[i]);
            }
            // Agregar las filas
            List<Cliente> listaClientes = control.traerClientes();
            for (Cliente cliente : listaClientes) {
                table.addCell(String.valueOf(numero_de_filas));
                table.addCell(cliente.getNombres() + " " + cliente.getApellidos());
                table.addCell(cliente.getDistrito());
                table.addCell(cliente.getDireccion());
                table.addCell(cliente.getReferencia());
                table.addCell(String.valueOf(cliente.getFecha_visita()));
                table.addCell(String.valueOf(cliente.getDeuda() + " S/."));
                numero_de_filas++;
            }

            documento.add(table);
            documento.close();
            JOptionPane.showMessageDialog(null, "Generación del reporte de clientes exitoso", "Reporte exitoso", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException ex) {
            Logger.getLogger(PanelAdministrativo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subMenuReportesClientesActionPerformed

    private void subMenuNuevoMantelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuNuevoMantelActionPerformed
        NuevoMantel pantallaNuevoMantel = new NuevoMantel();
        panelEscritorio.add(pantallaNuevoMantel);
        pantallaNuevoMantel.setVisible(true);
    }//GEN-LAST:event_subMenuNuevoMantelActionPerformed

    private void subMenuNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuNuevoUsuarioActionPerformed
        NuevoUsuario pantallaNuevoUsuario = new NuevoUsuario();
        panelEscritorio.add(pantallaNuevoUsuario);
        pantallaNuevoUsuario.setVisible(true);
    }//GEN-LAST:event_subMenuNuevoUsuarioActionPerformed

    private void subMenuNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuNuevoClienteActionPerformed
        NuevoCliente pantallaNuevoCliente = new NuevoCliente();
        panelEscritorio.add(pantallaNuevoCliente);
        pantallaNuevoCliente.setVisible(true);
    }//GEN-LAST:event_subMenuNuevoClienteActionPerformed

    private void subMenuGestionarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuGestionarUsuariosActionPerformed
        GestionarUsuarios pantallaGestionarUsuarios = new GestionarUsuarios();
        panelEscritorio.add(pantallaGestionarUsuarios);
        pantallaGestionarUsuarios.setVisible(true);
    }//GEN-LAST:event_subMenuGestionarUsuariosActionPerformed

    private void subMenuGestionarMantelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuGestionarMantelesActionPerformed
        GestionarManteles pantallaGestionarManteles = new GestionarManteles();
        panelEscritorio.add(pantallaGestionarManteles);
        pantallaGestionarManteles.setVisible(true);
    }//GEN-LAST:event_subMenuGestionarMantelesActionPerformed

    private void subMenuGestionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuGestionarClientesActionPerformed
        GestionarClientes pantallaGestionarClientes = new GestionarClientes();
        panelEscritorio.add(pantallaGestionarClientes);
        pantallaGestionarClientes.setVisible(true);
    }//GEN-LAST:event_subMenuGestionarClientesActionPerformed

    private void subMenuAsignarProductoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuAsignarProductoUsuarioActionPerformed
        AsignarProductoUsuario pantallaAsignar = new AsignarProductoUsuario();
        panelEscritorio.add(pantallaAsignar);
        pantallaAsignar.setVisible(true);
    }//GEN-LAST:event_subMenuAsignarProductoUsuarioActionPerformed

    private void subMenuReportesMantelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuReportesMantelesActionPerformed
        String ruta = "D:/Reportes_Manteles.pdf";
        try {
            PdfDocument pdf = new PdfDocument(new PdfWriter(ruta));
            Document documento = new Document(pdf);
            Table table = new Table(UnitValue.createPercentArray(7)).useAllAvailableWidth();
            final String[] columnasManteles = {" ", "Forma", "Color", "# sillas", "Tamaño", "Precio", "Stock"};
            int numero_de_filas = 1;
            /**
             *
             * COLUMNAS 1 -> Numero de productos 2 -> Forma del mandel 3 ->
             * Color del mantel 4 -> Numero de sillas 5 -> Tamaño 6 -> Precio 7
             * -> Stock
             *
             */
            // Agregar nombre de las columnas
            for (int i = 0; i < 7; i++) {
                table.addCell(columnasManteles[i]);
            }
            // Agregar las filas
            List<MesaACrochet> listaMantelesMesa = control.traerListaMesas();
            for (MesaACrochet mantelMesa : listaMantelesMesa) {
                table.addCell(String.valueOf(numero_de_filas));
                table.addCell(mantelMesa.getForma());
                table.addCell(mantelMesa.getColor());
                table.addCell(String.valueOf(mantelMesa.getNumeroSillas()));
                table.addCell(String.valueOf(mantelMesa.getTamanio()) + "cm");
                table.addCell(String.valueOf(mantelMesa.getPrecio()) + " S/.");
                table.addCell(String.valueOf(mantelMesa.getCantidad()));
                numero_de_filas++;
            }

            documento.add(table);
            documento.close();
            JOptionPane.showMessageDialog(null, "Generación del reporte de manteles exitoso", "Reporte exitoso", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException ex) {
            Logger.getLogger(PanelAdministrativo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subMenuReportesMantelesActionPerformed

    private void subMenuHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subMenuHistorialActionPerformed

    private void subMenuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuCerrarSesionActionPerformed
        IniciarSesion pantallaInicioIniciarSesion = new IniciarSesion();
        JOptionPane.showMessageDialog(null, "Cerro sesión exitosamente :D", "Cerrado Exitoso", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        pantallaInicioIniciarSesion.setVisible(true);
        pantallaInicioIniciarSesion.setLocationRelativeTo(null);
    }//GEN-LAST:event_subMenuCerrarSesionActionPerformed

    private void subMenuReportesComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuReportesComprasActionPerformed
        String ruta = "D:/Reportes_Compras.pdf";
        try {
            PdfDocument pdf = new PdfDocument(new PdfWriter(ruta));
            Document documento = new Document(pdf);
            Table table = new Table(UnitValue.createPercentArray(7)).useAllAvailableWidth();
            final String[] columnasManteles = {" ", "Cliente", "Mantel", "Fecha de Compra", "Cantidad", "Precio Unitario", "Precio Total",};
            int numero_de_filas = 1;

            // Agregar nombre de las columnas
            for (int i = 0; i < 7; i++) {
                table.addCell(columnasManteles[i]);
            }
            // Agregar las filas
            List<Compra> listaCompra = control.traerCompras();
            for (Compra compra : listaCompra) {
                table.addCell(String.valueOf(numero_de_filas));
                table.addCell(compra.getCliente().getNombres() + " " + compra.getCliente().getApellidos());
                table.addCell(compra.getMantel().getForma() + " " + compra.getMantel().getColor() + " " + String.valueOf(compra.getMantel().getNumeroSillas()) + " sillas");
                table.addCell(String.valueOf(compra.getFechaCompra()));
                table.addCell(String.valueOf(compra.getCantidad()));
                table.addCell(String.valueOf(compra.getPrecioUnitario() + " S/."));
                table.addCell(String.valueOf(compra.getTotal() + " S/."));

                numero_de_filas++;
            }

            documento.add(table);
            documento.close();

            JOptionPane.showMessageDialog(null, "Generación del reporte de compras exitoso", "Reporte exitoso", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(PanelAdministrativo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subMenuReportesComprasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Asignaciones;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCerrarSesion;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuHistorial;
    private javax.swing.JMenu menuManteles;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenu menuUsuario;
    public static javax.swing.JDesktopPane panelEscritorio;
    private javax.swing.JMenuItem subMenuAsignarProductoUsuario;
    private javax.swing.JMenuItem subMenuCerrarSesion;
    private javax.swing.JMenuItem subMenuGestionarClientes;
    private javax.swing.JMenuItem subMenuGestionarManteles;
    private javax.swing.JMenuItem subMenuGestionarUsuarios;
    private javax.swing.JMenuItem subMenuHistorial;
    private javax.swing.JMenuItem subMenuNuevoCliente;
    private javax.swing.JMenuItem subMenuNuevoMantel;
    private javax.swing.JMenuItem subMenuNuevoUsuario;
    private javax.swing.JMenuItem subMenuReportesClientes;
    private javax.swing.JMenuItem subMenuReportesCompras;
    private javax.swing.JMenuItem subMenuReportesManteles;
    // End of variables declaration//GEN-END:variables
}
