package com.inventario.manteles.controller;

import com.inventario.manteles.model.admin.Admin;
import com.inventario.manteles.view.login.LoginAdminView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class AdminController implements ActionListener{
    private LoginAdminView loginView;
    private Admin user;
    
    public AdminController(LoginAdminView loginView, Admin user){
        this.loginView = loginView;
        this.user = user;
        
        this.loginView.addLoginListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = loginView.getUsername();
        String password = loginView.getPassword();
        
        if(user.validarIngreso(username, password)){
            JOptionPane.showMessageDialog(null, "¡Bienvenido!");
            loginView.dispose();
        } else {
            user.intentosFallidos();
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Intentos restantes: " + user.getNumeroIntentos());
        }
    }
    
    
}
