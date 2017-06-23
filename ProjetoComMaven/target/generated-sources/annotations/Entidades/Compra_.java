package Entidades;

import Entidades.Clientes;
import Entidades.CompraProduto;
import Entidades.Tipo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-22T22:19:21")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Tipo> tipoId;
    public static volatile SingularAttribute<Compra, Integer> id;
    public static volatile SingularAttribute<Compra, Double> precoTotal;
    public static volatile SingularAttribute<Compra, Clientes> idClientes;
    public static volatile SingularAttribute<Compra, Date> dataCompra;
    public static volatile ListAttribute<Compra, CompraProduto> compraProdutoList;

}