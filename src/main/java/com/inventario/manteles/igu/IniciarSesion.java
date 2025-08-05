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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Titulo2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSession = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        loginText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(97, 132, 97, 150));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 132, 97), 0, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo2.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        Titulo2.setText("INICIAR SESSION");
        jPanel2.add(Titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 250, 41));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perfil2.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candado3.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        btnSession.setBackground(new java.awt.Color(255, 246, 216));
        btnSession.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        btnSession.setText("Entrar");
        btnSession.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        btnSession.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSession.setOpaque(true);
        btnSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSessionActionPerformed(evt);
            }
        });
        jPanel2.add(btnSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 190, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user2_1.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        passwordText.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        passwordText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 102)));
        passwordText.setCaretColor(new java.awt.Color(0, 102, 102));
        passwordText.setOpaque(true);
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        jPanel2.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 340, 40));

        loginText.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        loginText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 102)));
        loginText.setCaretColor(new java.awt.Color(0, 102, 102));
        loginText.setOpaque(true);
        loginText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextActionPerformed(evt);
            }
        });
        jPanel2.add(loginText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 340, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Usuario");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Contraseña");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSessionActionPerformed
        Controladora control = new Controladora();

        String nombre = loginText.getText();
        String contrasenia = String.valueOf(passwordText.getPassword());

        
        var usuario = new Usuario("Josue", "1234");
        if (usuario.validarIngreso()) {
            JOptionPane.showMessageDialog(null, "Ingreso exitoso", "Iniciar sesion", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            var pantalla = new PanelAdministrativo();
            pantalla.setVisible(true);
            pantalla.setLocationRelativeTo(null);
        } else {
            JOptionPane.showMessageDialog(null, "Te equivocaste con el usuario o contraseña", " Inicio Fallido", JOptionPane.ERROR_MESSAGE);

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField loginText;
    private javax.swing.JPasswordField passwordText;
    // End of variables declaration//GEN-END:variables

}
