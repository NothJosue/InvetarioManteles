package com.inventario.manteles.igu;

import com.inventario.manteles.modelo.Controladora;
import com.inventario.manteles.modelo.Rol;
import com.inventario.manteles.modelo.Usuario;
import java.util.List;
import javax.swing.JOptionPane;

public class NuevoUsuario extends javax.swing.JInternalFrame {

    Controladora control = null;

    public NuevoUsuario() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbRol = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JPasswordField();
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Nuevo Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Nombre               :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 100, 20));

        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Contraseña         :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 100, -1));

        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Rol                       : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 100, -1));
        getContentPane().add(cmbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 180, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconGuardar.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 180, -1));
        getContentPane().add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 180, -1));

        fondo.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\fondo_gris.jpg")); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarRolesCmb() {
        var roles = control.traerRoles();
        for (Rol llenarRol : roles) {
            cmbRol.addItem(llenarRol.getNombre());
        }
    }

    public void limpiar() {
        txtNombre.setText("");
        txtContrasenia.setText("");
        cmbRol.setSelectedIndex(0);
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String rolSeleccionado = (String) cmbRol.getSelectedItem();
        String nombre = txtNombre.getText();
        String contrasenia = new String(txtContrasenia.getPassword());
        ;

        if (nombre.isEmpty() || contrasenia.isEmpty()) {
            JOptionPane.showMessageDialog(fondo, "Tiene que llenar todos los campos", "Llenado Incompleto", JOptionPane.WARNING_MESSAGE);
        } else if (validarExisteUsuario(nombre)) {
            JOptionPane.showMessageDialog(null, "El usuario ya esta registrado", "Usuario Existente", JOptionPane.WARNING_MESSAGE);
        } else {
            var usuarioRegistrar = new Usuario(nombre, contrasenia, traerRol(rolSeleccionado));
            control.crearUsuario(usuarioRegistrar);
            JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    public Rol traerRol(String rolRecibido) {
        List<Rol> roles = control.traerRoles();

        for (Rol rol : roles) {
            if (rol.getNombre().equals(rolRecibido)) {
                return rol;
            }
        }
        return null;
    }

    public boolean validarExisteUsuario(String nombreUsuario) {
        boolean existeUsuario = false;
        List<Usuario> usuarios = control.traerUsarios();

        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombreUsuario)) {
                existeUsuario = false;
                break;
            }
        }
        return existeUsuario;
    }

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        llenarRolesCmb();
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
