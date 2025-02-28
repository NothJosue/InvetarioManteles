
package com.inventario.manteles.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Mantel {
    protected List<String> color;
    protected float tamanio;
    protected float precio;
    protected int cantidad;

    public Mantel(List<String> color, float tamanio, float precio, int cantidad) {
        this.color = color;
        this.tamanio = tamanio;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public abstract int aumentarCantidad();
    public abstract int disminuirCantidad();

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
