/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.heladeria1.control;

import ec.edu.itq.heladeria1.modelo.Cliente;
import ec.edu.itq.heladeria1.servicio.ClienteServicio;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author RICHARD
 */
@ManagedBean
@ViewScoped
public class ClienteControl {

    @EJB
    private ClienteServicio clienteServicio;
    
private String nombre;
private String apellido;
private String direccion;
private String correo;
private Integer telefono;
private List<Cliente>listCliente;

@PostConstruct
public void init(){
    buscarCliente();
}

public void buscarCliente(){
   listCliente = clienteServicio.buscarCliente();
}

public void guardar(){
    System.out.println("SI LLEGA AL BOTON");
    Cliente clienteNueva = new Cliente();
    clienteNueva.setNombre(nombre);
    clienteNueva.setApellido(apellido);
    clienteNueva.setDireccion(direccion);
    clienteNueva.setCorreo(correo);
    clienteNueva.setTelefono(telefono);
    clienteNueva.setIdCliente(6);
    clienteServicio.guardar(clienteNueva);
    limpiar();
    
}
   private void limpiar(){
        nombre="";
        apellido="";
        direccion="";
        correo="";
        telefono= null;
    }
    
   public void seleccionarCliente(Cliente cliente){
       this.nombre=cliente.getNombre();
       this.apellido=cliente.getApellido();
       this.direccion=cliente.getDireccion();
       this.correo=cliente.getCorreo();
       this.telefono=cliente.getTelefono();
   }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public List<Cliente> getListCliente() {
        return listCliente;
    }
}