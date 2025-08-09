package com.inventario.manteles.modelo;

import com.inventario.manteles.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    // Atributo de tipo ControladoraPesistencia literalmente, inicializado
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    
    // Metodos para Guardar, Actualizar, Buscar, Eliminar --> usando el atributo de ControladoraPesistencia
    public void crearUsuario(Usuario usuario){
        controlPersis.crearUsuario(usuario);
    }
    public void crearRol(Rol rol){
        controlPersis.crearRol(rol);
    }
    
    public void crearCliente(Cliente cliente){
        controlPersis.crearCliente(cliente);
    }
    
    public void eliminarUsuario(int id){
        controlPersis.eliminarUsuario(id);
    }
    public void eliminarRol(int id){
        controlPersis.eliminarRol(id);
    }
    
    public Usuario buscarUsuarioNombre(String usuario){
        var usuarioBuscado = new Usuario(usuario);
        return controlPersis.buscarUsuarioNombre(usuarioBuscado);
    }
    
    public void mostrarUsuarios(){
        controlPersis.mostrarUsuarios();
    }
    
    public void crearMantelMesa(MesaACrochet mantelMesa){
        controlPersis.crearMantelMesa(mantelMesa);
    }

    public List<MesaACrochet> mostrarMesaAcrochet() {
        return controlPersis.mostrarManteles();
    }

    public List<Rol> traerRoles() {
        return controlPersis.traerRoles();
    }

    public List<Usuario> traerUsarios() {
        return controlPersis.traerUsuarios();
    }

    public void actualizarUsuario(Usuario usuarioEditar) {
        controlPersis.actualizarUsuario(usuarioEditar);
    }

    public List<MesaACrochet> traerListaMesas() {
        return controlPersis.traerListaMesas();
    }

    public MesaACrochet buscarMantelMesaFCNT(String forma, String color, int numero_sillas, float tamanio) {
        MesaACrochet mesaBuscar = new MesaACrochet(forma, color, numero_sillas, tamanio);
        
        return controlPersis.buscarMantelMesaFCNT(mesaBuscar);
        
    }

    public void eliminarMantelMesa(Integer id) {
        controlPersis.eliminarMantelMesa(id);
    }

    public void actualizarMantelMesa(MesaACrochet mantelMesaCaptado) {
        controlPersis.actualizarMantelMesa(mantelMesaCaptado);
    }

    public List<Cliente> traerClientes() {
        return controlPersis.traerClientes();
    }

    public Cliente buscarClienteNombresApellidos(String nombres, String apellidos) {
        Cliente clienteBuscado = new Cliente(nombres, apellidos);
        return controlPersis.buscarClienteNombresApellidos(clienteBuscado);
    }

    public void eliminarCliente(Integer id) {
        controlPersis.eliminarCliente(id);
    }

    public void actualizarCliente(Cliente clienteCaptado) {
        controlPersis.actualizarCliente(clienteCaptado);
    }

    public List<Compra> traerCompras() {
        return controlPersis.traerCompras();
    }

    public void guardarCompra(Compra compra) {
        controlPersis.guardarCompra(compra);
    }

}
