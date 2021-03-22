package ec.edu.itq.heladeria1.modelo;

import ec.edu.itq.heladeria1.modelo.Facturacion;
import ec.edu.itq.heladeria1.modelo.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-21T23:24:31")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile ListAttribute<Cliente, Venta> ventaList;
    public static volatile SingularAttribute<Cliente, String> apellido;
    public static volatile SingularAttribute<Cliente, String> correo;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile SingularAttribute<Cliente, Integer> telefono;
    public static volatile ListAttribute<Cliente, Facturacion> facturacionList;
    public static volatile SingularAttribute<Cliente, String> nombre;

}