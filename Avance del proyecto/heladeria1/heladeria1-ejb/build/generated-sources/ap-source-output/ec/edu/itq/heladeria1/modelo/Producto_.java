package ec.edu.itq.heladeria1.modelo;

import ec.edu.itq.heladeria1.modelo.Bodega;
import ec.edu.itq.heladeria1.modelo.Venta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-21T23:24:31")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile SingularAttribute<Producto, Integer> precio;
    public static volatile SingularAttribute<Producto, String> tipoProducto;
    public static volatile ListAttribute<Producto, Bodega> bodegaList;
    public static volatile SingularAttribute<Producto, Date> fechaVencimiento;
    public static volatile ListAttribute<Producto, Venta> ventaList;
    public static volatile SingularAttribute<Producto, Integer> idProducto;
    public static volatile SingularAttribute<Producto, String> nombreProducto;

}