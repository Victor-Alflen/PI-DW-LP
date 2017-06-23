package Entidades;

import Entidades.Compra;
import Entidades.CompraProdutoPK;
import Entidades.Produto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-22T22:19:21")
@StaticMetamodel(CompraProduto.class)
public class CompraProduto_ { 

    public static volatile SingularAttribute<CompraProduto, Compra> compra;
    public static volatile SingularAttribute<CompraProduto, Produto> produto;
    public static volatile SingularAttribute<CompraProduto, CompraProdutoPK> compraProdutoPK;
    public static volatile SingularAttribute<CompraProduto, Integer> quantidade;
    public static volatile SingularAttribute<CompraProduto, Double> valorUnitario;

}