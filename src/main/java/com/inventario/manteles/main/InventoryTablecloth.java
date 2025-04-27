package com.inventario.manteles.main;

import com.inventario.manteles.controller.AdminController;
import com.inventario.manteles.model.admin.Admin;
import com.inventario.manteles.view.login.LoginAdminView;

/**
 * @author Josue Albarracin Rivera
 * @author Lincoln Bonilla Nieves
 */
public class InventoryTablecloth {

    public static void main(String[] args) {
        Admin user = new Admin();
        LoginAdminView loginView = new LoginAdminView();
        AdminController controller = new AdminController(loginView, user);
   
        
        loginView.setVisible(true);
        loginView.setLocationRelativeTo(null);
    }
}
