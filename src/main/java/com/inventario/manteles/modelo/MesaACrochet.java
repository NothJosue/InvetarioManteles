package com.inventario.manteles.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manteles_mesa")
public class MesaACrochet extends MantelACrochet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "forma")
    private String forma;
    
    @Column(name = "numero_sillas")
    private int numeroSillas ;
    
    // Constructor vacio
    public MesaACrochet() {
    }

    // Constructor para agregar
    public MesaACrochet(String color, float tamanio, float precio, int cantidad, String forma, int numeroSillas) {
        super(color, tamanio, precio, cantidad);
        this.forma = forma;
        this.numeroSillas = numeroSillas;
    }

    public MesaACrochet(String forma, String color, int numeroSillas, float tamanio){
        this.forma = forma;
        this.color = color;
        this.numeroSillas = numeroSillas;
        this.tamanio = tamanio;
    }
    
    // Constructor para modificar
    public MesaACrochet(Integer id, String color, float tamanio, float precio, int cantidad, String forma, int numeroSillas) {
        super(color, tamanio, precio, cantidad);
        this.forma = forma;
        this.numeroSillas = numeroSillas;
    }

    // Constructor para eliminar
    public MesaACrochet(Integer id) {
        this.id = id;
    }

    @Override
    public int aumentarCantidad() {
        return ++this.cantidad;
    }

    @Override
    public int disminuirCantidad() {
        if (this.cantidad > 0) {
        this.cantidad--;
    }
    return this.cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public int getNumeroSillas() {
        return numeroSillas;
    }

    public void setNumeroSillas(int numeroSillas) {
        this.numeroSillas = numeroSillas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.forma);
        hash = 23 * hash + this.numeroSillas;
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
        final MesaACrochet other = (MesaACrochet) obj;
        if (this.numeroSillas != other.numeroSillas) {
            return false;
        }
        if (!Objects.equals(this.forma, other.forma)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "MesaACrochet{" + "id=" + id + ", forma=" + forma + ", numeroSillas=" + numeroSillas + '}';
    }

}
