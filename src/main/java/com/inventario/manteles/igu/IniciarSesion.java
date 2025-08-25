package com.inventario.manteles.igu;

import com.inventario.manteles.modelo.Controladora;
import com.inventario.manteles.modelo.Usuario;
import javax.swing.JOptionPane;

public class IniciarSesion extends javax.swing.JFrame {

    public IniciarSesion() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        Titulo2 = new javax.swing.JLabel();
        btnSession = new javax.swing.JButton();
        passwordText = new javax.swing.JPasswordField();
        loginText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(97, 132, 97, 150));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 132, 97), 0, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(0, 102, 102));
        Titulo2.setText("INICIAR SESIÓN");
        jPanel2.add(Titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 280, 41));

        btnSession.setBackground(new java.awt.Color(0, 102, 102));
        btnSession.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSession.setForeground(new java.awt.Color(255, 255, 255));
        btnSession.setText("Entrar");
        btnSession.setBorder(null);
        btnSession.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSession.setOpaque(true);
        btnSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSessionActionPerformed(evt);
            }
        });
        jPanel2.add(btnSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 190, 50));

        passwordText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordText.setForeground(new java.awt.Color(0, 0, 0));
        passwordText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 102)));
        passwordText.setCaretColor(new java.awt.Color(0, 102, 102));
        passwordText.setOpaque(true);
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        jPanel2.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 340, 40));

        loginText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginText.setForeground(new java.awt.Color(0, 0, 0));
        loginText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 102)));
        loginText.setCaretColor(new java.awt.Color(0, 102, 102));
        loginText.setOpaque(true);
        loginText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextActionPerformed(evt);
            }
        });
        jPanel2.add(loginText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 340, 40));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Usuario");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Contraseña");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 410, 560));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Programacion\\Java\\Proyectos Portafolio\\InventarioManteles\\src\\main\\Resources\\iconLogin.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("SISTEMA DE GESTIÓN DE MANTELES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel2)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSessionActionPerformed
        Controladora control = new Controladora();

        String nombre = loginText.getText();
        String contrasenia = String.valueOf(passwordText.getPassword());

        Usuario usuarioBuscar = new Usuario(nombre, contrasenia);
        
        if (control.validarIngresoUsuario(usuarioBuscar)) {
            JOptionPane.showMessageDialog(null, "Ingreso exitoso", "Iniciar sesion", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            var pantalla = new PanelAdministrativo();
            pantalla.setVisible(true);
            pantalla.setLocationRelativeTo(null);
        } else {
            JOptionPane.showMessageDialog(null, "Verificar el nombre o contraseña", " Inicio Fallido", JOptionPane.ERROR_MESSAGE);
        }
        loginText.setText("");
        passwordText.setText("");

    }//GEN-LAST:event_btnSessionActionPerformed

    private void loginTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextActionPerformed

    }//GEN-LAST:event_loginTextActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo2;
    private javax.swing.JButton btnSession;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField loginText;
    private javax.swing.JPasswordField passwordText;
    // End of variables declaration//GEN-END:variables

}
