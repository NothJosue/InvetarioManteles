package com.inventario.manteles.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "telefono", length = 20)
    private String telefono;

    @Column(name = "distrito")
    private String distrito;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "referencia")
    private String referencia;

    @Column(name = "deuda")
    private float deuda = 0;

    @Column(name = "fecha_visita")
    @Temporal(TemporalType.DATE)
    private Date fecha_visita;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

    public Cliente() {
    }

    // Constructor Agregar
    public Cliente(String nombres, String apellidos, String telefono, String distrito, String direccion, String referencia, Date fecha_visita) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.distrito = distrito;
        this.direccion = direccion;
        this.referencia = referencia;
        this.fecha_visita = fecha_visita;
    }

    public Cliente(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Cliente(String nombres, String apellidos, String telefono, String distrito, String direccion, String referencia, Date fecha_visita, List<Compra> compras) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.distrito = distrito;
        this.direccion = direccion;
        this.referencia = referencia;
        this.fecha_visita = fecha_visita;
        this.compras = compras;
    }

    // Constructor Modificador
    public Cliente(Integer id, String nombres, String apellidos, String telefono, String distrito, String direccion, float deuda, Date fecha_visita) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.distrito = distrito;
        this.direccion = direccion;
        this.deuda = deuda;
        this.fecha_visita = fecha_visita;
    }

    // Constructor para eliminar
    public Cliente(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }

    public Date getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(Date fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.nombres);
        hash = 89 * hash + Objects.hashCode(this.apellidos);
        hash = 89 * hash + Objects.hashCode(this.telefono);
        hash = 89 * hash + Objects.hashCode(this.distrito);
        hash = 89 * hash + Objects.hashCode(this.direccion);
        hash = 89 * hash + Objects.hashCode(this.referencia);
        hash = 89 * hash + Float.floatToIntBits(this.deuda);
        hash = 89 * hash + Objects.hashCode(this.fecha_visita);
        hash = 89 * hash + Objects.hashCode(this.compras);
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
        final Cliente other = (Cliente) obj;
        if (Float.floatToIntBits(this.deuda) != Float.floatToIntBits(other.deuda)) {
            return false;
        }
        if (!Objects.equals(this.nombres, other.nombres)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.distrito, other.distrito)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.referencia, other.referencia)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.fecha_visita, other.fecha_visita)) {
            return false;
        }
        return Objects.equals(this.compras, other.compras);
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono + ", distrito=" + distrito + ", direccion=" + direccion + ", referencia=" + referencia + ", deuda=" + deuda + ", fecha_visita=" + fecha_visita + ", compras=" + compras + '}';
    }
}
