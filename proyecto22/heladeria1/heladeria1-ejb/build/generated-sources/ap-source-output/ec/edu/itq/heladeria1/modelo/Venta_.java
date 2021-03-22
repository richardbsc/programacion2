package ec.edu.itq.heladeria1.modelo;

import ec.edu.itq.heladeria1.modelo.Cliente;
import ec.edu.itq.heladeria1.modelo.Facturacion;
import ec.edu.itq.heladeria1.modelo.Producto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-22T16:37:12")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Date> fecha;
    public static volatile SingularAttribute<Venta, Cliente> idCliente;
    public static volatile SingularAttribute<Venta, Facturacion> idFacturacion;
    public static volatile SingularAttribute<Venta, Producto> idProducto;
    public static volatile SingularAttribute<Venta, Integer> idVenta;

}