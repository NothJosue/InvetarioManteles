package com.inventario.manteles.model.admin;

public class Admin {

    private String username;
    private String password;
    private int numeroIntentos = 3;

    public Admin() {
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void intentosFallidos() {
        if (numeroIntentos > 0) {
            numeroIntentos--;
        }
        if (numeroIntentos == 0) {
            System.out.println("Cuenta bloqueada. Demasiados intentos fallidos.");
        }
    }

    public boolean validarIngreso(String username, String password) {
        return this.username.equals("josue") && this.password.equals("1234");
    }

    public int getNumeroIntentos() {
        return numeroIntentos;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
