/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.heladeria1.control;

import ec.edu.itq.heladeria1.modelo.Bodega;
import ec.edu.itq.heladeria1.servicio.BodegaServicio;
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
public class BodegaControl {

    @EJB
    private BodegaServicio bodegaServicio;
    
private String stock;
private String descripcion;
private String id_producto;
private Integer precio;
private String tipo_producto;
private List<Bodega>listBodega;

@PostConstruct
public void init(){
    buscarBodega();
}

public void buscarBodega(){
   listBodega = bodegaServicio.buscarBodega();
}

public void guardar(){
    System.out.println("SI LLEGA AL BOTON");
    Bodega bodegaNueva = new bodega();
    bodegaNueva.setStock(stock);
    bodegaNueva.setDescripcion(descripcion);
    bodegaNueva.setIdProducto(null);
    bodegaNueva.setPrecio(precio);
    bodegaNueva.setTipoProducto(precio);
    bodegaServicio.guardar(bodegaNueva);
    limpiar();
}
   private void limpiar(){
        stock="";
        descripcion="";
        id_producto="";
        precio= null;
        tipo_producto="";
    }

    public BodegaServicio getBodegaServicio() {
        return bodegaServicio;
    }

    public void setBodegaServicio(BodegaServicio bodegaServicio) {
        this.bodegaServicio = bodegaServicio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public List<Bodega> getListBodega() {
        return listBodega;
    }

    public void setListBodega(List<Bodega> listBodega) {
        this.listBodega = listBodega;
    }

    private static class bodega extends Bodega {

        public bodega() {
        }
    }
}

   
   