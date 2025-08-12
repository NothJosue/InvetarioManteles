package com.inventario.manteles.persistencia;

import com.inventario.manteles.igu.IniciarSesion;
import com.inventario.manteles.modelo.Cliente;
import com.inventario.manteles.modelo.Compra;
import com.inventario.manteles.modelo.MesaACrochet;
import com.inventario.manteles.modelo.Rol;
import com.inventario.manteles.modelo.Usuario;
import com.inventario.manteles.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    // Los atributos son referente a los JPA que se cree al crear automaticamente y inicializados
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();
    ClienteJpaController clienteJPA = new ClienteJpaController();
    RolJpaController rolJPA = new RolJpaController();
    MesaACrochetJpaController mesaACrochetJpa = new MesaACrochetJpaController();
    CompraJpaController compraJPA = new CompraJpaController();
    IniciarSesion pantallaInicio = new IniciarSesion();

    // Solo son metodos para la base de datos
    public void crearUsuario(Usuario usuario) {
        usuarioJPA.create(usuario);
    }

    public void crearRol(Rol rol) {
        rolJPA.create(rol);
    }

    public void eliminarUsuario(int id) {
        try {
            usuarioJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarRol(int id) {
        try {
            rolJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario buscarUsuarioNombre(Usuario usuarioBuscado) {
        Usuario usuarioRetornado = new Usuario();
        if (usuarioBuscado != null) {
            var usuarios = traerUsuarios();

            for (Usuario usuario : usuarios) {
                if (usuario.getNombre().equals(usuarioBuscado.getNombre())) {
                    usuarioRetornado.setId(usuario.getId());
                    usuarioRetornado.setNombre(usuario.getNombre());
                    usuarioRetornado.setContrasenia(usuario.getContrasenia());
                    usuarioRetornado.setRol(usuario.getRol());
                    break;
                }
            }

        }
        return usuarioRetornado;
    }

    public void mostrarUsuarios() {
        var usuarios = usuarioJPA.findUsuarioEntities();
        for (var usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    public void crearMantelMesa(MesaACrochet mantelMesa) {
        mesaACrochetJpa.create(mantelMesa);
    }

    public List<MesaACrochet> mostrarManteles() {
        return mesaACrochetJpa.findMesaACrochetEntities();
    }

    public List<Rol> traerRoles() {
        return rolJPA.findRolEntities();
    }

    public void crearCliente(Cliente cliente) {
        clienteJPA.create(cliente);
    }

    public List<Usuario> traerUsuarios() {
        return usuarioJPA.findUsuarioEntities();
    }

    public void actualizarUsuario(Usuario usuarioEditar) {
        try {
            usuarioJPA.edit(usuarioEditar);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<MesaACrochet> traerListaMesas() {
        return mesaACrochetJpa.findMesaACrochetEntities();
    }

    public MesaACrochet buscarMantelMesaFCNT(MesaACrochet mesaBuscar) {
        MesaACrochet mesaRetornada = null;
        List<MesaACrochet> mesas = traerListaMesas();

        for (MesaACrochet mesa : mesas) {
            if (mesaBuscar.getForma().equals(mesa.getForma())
                    && mesaBuscar.getColor().equals(mesa.getColor())
                    && mesaBuscar.getNumeroSillas() == mesa.getNumeroSillas()
                    && mesaBuscar.getTamanio() == mesa.getTamanio()) {
                mesaRetornada = mesa;
                break;
            }
        }
        return mesaRetornada;
    }

    public void eliminarMantelMesa(Integer id) {
        try {
            mesaACrochetJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actualizarMantelMesa(MesaACrochet mantelMesaCaptado) {
        try {
            mesaACrochetJpa.edit(mantelMesaCaptado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Cliente> traerClientes() {
        return clienteJPA.findClienteEntities();
    }

    public Cliente buscarClienteNombresApellidos(Cliente clienteBuscado) {
        List<Cliente> clientes = traerClientes();

        for (Cliente cliente : clientes) {
            if (cliente.getNombres().equals(clienteBuscado.getNombres())
                    && cliente.getApellidos().equals(clienteBuscado.getApellidos())) {
                return cliente;
            }
        }
        return null;
    }

    public void eliminarCliente(Integer id) {
        try {
            clienteJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actualizarCliente(Cliente clienteCaptado) {
        try {
            clienteJPA.edit(clienteCaptado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Compra> traerCompras() {
        return compraJPA.findCompraEntities();
    }

    public void guardarCompra(Compra compra) {
        compraJPA.create(compra);
    }

    public boolean validarIngresoUsuario(Usuario usuarioBuscar) {
        boolean ingresoCorrecto = false;
        Usuario comprobarUsuario = buscarUsuarioNombre(usuarioBuscar);
        if (comprobarUsuario.getContrasenia() != null) {
            if (comprobarUsuario.getContrasenia().equals(usuarioBuscar.getContrasenia())) {
                return ingresoCorrecto = true;
            }
            return ingresoCorrecto;
        } else {
            return ingresoCorrecto;
        }
    }
}
