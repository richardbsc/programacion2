/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.heladeria1.control;
import ec.edu.itq.heladeria1.modelo.Producto;
import ec.edu.itq.heladeria1.servicio.ProductoServicio;
import java.util.Date;
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
public class ProductoControl {

    @EJB
    private ProductoServicio productoServicio;
    
private String nombre_producto;
private String tipo_producto;
private String descripcion;
private Integer precio;
private Date fecha_vencimiento;
private List<Producto>listProducto;

@PostConstruct
public void init(){
    buscarProducto();
}

public void buscarProducto(){
   listProducto = productoServicio.buscarProducto();
}

public void guardar(){
    System.out.println("SI LLEGA AL BOTON");
    Producto productoNueva = new Producto();
    productoNueva.setNombreProducto(nombre_producto);
    productoNueva.setTipoProducto(tipo_producto);
    productoNueva.setDescripcion(descripcion);
    productoNueva.setPrecio(precio);
    productoNueva.setFechaVencimiento(fecha_vencimiento);
    productoServicio.guardar(productoNueva);
    productoNueva.setIdProducto(1);
    limpiar();
    
}

   private void limpiar(){
        nombre_producto="";
        tipo_producto="";
        descripcion="";
        fecha_vencimiento= null;
    }

    public ProductoServicio getProductoServicio() {
        return productoServicio;
    }

    public void setProductoServicio(ProductoServicio productoServicio) {
        this.productoServicio = productoServicio;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public List<Producto> getListProducto() {
        return listProducto;
    }

    public void setListProducto(List<Producto> listProducto) {
        this.listProducto = listProducto;
    }

     
} 