package com.inventario.manteles.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "compras")
public class Compra implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    
    @ManyToOne
    @JoinColumn(name = "mantel_id")
    private MesaACrochet mantel;
    
    
    @Column(name = "cantidad")
    private int cantidad;
    
    @Column(name = "precio_unitario")
    private float precioUnitario;
    
    @Column(name = "fecha_compra")
    @Temporal(TemporalType.DATE)
    private Date fecha_compra;
    
    @Column(name = "total")
    private float total;

    public Compra() {
    }
    
    public Compra(Cliente cliente, MesaACrochet mantel, int cantidad, float precioUnitario, Date fecha_compra) {
        this.cliente = cliente;
        this.mantel = mantel;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.fecha_compra = fecha_compra;
        this.total = calcularTotal();
    }
    
    
    public final float calcularTotal(){
        return this.precioUnitario*this.cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public MesaACrochet getMantel() {
        return mantel;
    }

    public void setMantel(MesaACrochet mantel) {
        this.mantel = mantel;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Date getFechaCompra() {
        return fecha_compra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fecha_compra = fechaCompra;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.cliente);
        hash = 97 * hash + Objects.hashCode(this.mantel);
        hash = 97 * hash + this.cantidad;
        hash = 97 * hash + Float.floatToIntBits(this.precioUnitario);
        hash = 97 * hash + Objects.hashCode(this.fecha_compra);
        hash = 97 * hash + Float.floatToIntBits(this.total);
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
        final Compra other = (Compra) obj;
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (Float.floatToIntBits(this.precioUnitario) != Float.floatToIntBits(other.precioUnitario)) {
            return false;
        }
        if (Float.floatToIntBits(this.total) != Float.floatToIntBits(other.total)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.mantel, other.mantel)) {
            return false;
        }
        return Objects.equals(this.fecha_compra, other.fecha_compra);
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", cliente=" + cliente + ", mantel=" + mantel + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", fechaCompra=" + fecha_compra + ", total=" + total + '}';
    }
    
    
}
