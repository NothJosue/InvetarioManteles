package com.inventario.manteles.modelo;

import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class MantelACrochet {
    @Column(name = "color")
    protected String color;
    
    @Column(name = "tamanio")
    protected float tamanio;
    
    @Column(name = "precio")
    protected float precio;
    
    @Column(name = "cantidad")
    protected int cantidad;
    
    public MantelACrochet(){
    }
    
    public MantelACrochet(String color, float tamanio, float precio, int cantidad) {
        this.color = color;
        this.tamanio = tamanio;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public abstract int aumentarCantidad();
    public abstract int disminuirCantidad();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.color);
        hash = 67 * hash + Float.floatToIntBits(this.tamanio);
        hash = 67 * hash + Float.floatToIntBits(this.precio);
        hash = 67 * hash + this.cantidad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MantelACrochet other = (MantelACrochet) obj;
        if (Float.floatToIntBits(this.tamanio) != Float.floatToIntBits(other.tamanio)) {
            return false;
        }
        if (Float.floatToIntBits(this.precio) != Float.floatToIntBits(other.precio)) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
            return false;
        }
        return Objects.equals(this.color, other.color);
    }

    @Override
    public String toString() {
        return "MantelACrochet{" + "color=" + color + ", tamanio=" + tamanio + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
}
