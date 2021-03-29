package ec.edu.itq.heladeria1.modelo;

import ec.edu.itq.heladeria1.modelo.Cliente;
import ec.edu.itq.heladeria1.modelo.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-29T16:33:46")
@StaticMetamodel(Facturacion.class)
public class Facturacion_ { 

    public static volatile SingularAttribute<Facturacion, Integer> precio;
    public static volatile SingularAttribute<Facturacion, Integer> total;
    public static volatile SingularAttribute<Facturacion, Cliente> idCliente;
    public static volatile SingularAttribute<Facturacion, Integer> iva;
    public static volatile SingularAttribute<Facturacion, Integer> subtotal;
    public static volatile ListAttribute<Facturacion, Venta> ventaList;
    public static volatile SingularAttribute<Facturacion, Integer> idFacturacion;
    public static volatile SingularAttribute<Facturacion, Integer> idProducto;
    public static volatile SingularAttribute<Facturacion, String> formaPago;

}