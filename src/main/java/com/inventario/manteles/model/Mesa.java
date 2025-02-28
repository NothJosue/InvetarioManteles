
package com.inventario.manteles.model;

import java.util.List;

public class Mesa extends Mantel {
    private String forma;
    private boolean isCredito;
    private int numeroSillas;        

    public Mesa(List<String> color, float tamanio, float precio, int cantidad, String forma, boolean isCredito, int numeroSillas) {
        super(color, tamanio, precio, cantidad);
        this.forma = forma;
        this.isCredito = isCredito;
        this.numeroSillas = numeroSillas;
    }

    @Override
    public int aumentarCantidad() {
        return ++this.cantidad;
    }

    @Override
    public int disminuirCantidad() {      
        return --this.cantidad;
        
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public boolean isCredito() {
        return isCredito;
    }

    public void setCredito(boolean isCredito) {
        this.isCredito = isCredito;
    }

    public int getNumeroSillas() {
        return numeroSillas;
    }

    public void setNumeroSillas(int numeroSillas) {
        this.numeroSillas = numeroSillas;
    }
    
    
    
}
