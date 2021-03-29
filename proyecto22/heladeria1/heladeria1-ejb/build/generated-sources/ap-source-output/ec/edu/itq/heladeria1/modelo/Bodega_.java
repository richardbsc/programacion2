package ec.edu.itq.heladeria1.modelo;

import ec.edu.itq.heladeria1.modelo.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-29T16:33:46")
@StaticMetamodel(Bodega.class)
public class Bodega_ { 

    public static volatile SingularAttribute<Bodega, String> descripcion;
    public static volatile SingularAttribute<Bodega, Integer> precio;
    public static volatile SingularAttribute<Bodega, Integer> tipoProducto;
    public static volatile SingularAttribute<Bodega, Integer> idBodega;
    public static volatile SingularAttribute<Bodega, Producto> idProducto;
    public static volatile SingularAttribute<Bodega, String> stock;

}