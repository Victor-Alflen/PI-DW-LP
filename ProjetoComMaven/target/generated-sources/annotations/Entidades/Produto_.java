package Entidades;

import Entidades.CompraProduto;
import Entidades.Subcategoria;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-22T22:19:21")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Double> preco;
    public static volatile SingularAttribute<Produto, Date> dataRegistro;
    public static volatile SingularAttribute<Produto, Subcategoria> subcategoria;
    public static volatile SingularAttribute<Produto, String> nome;
    public static volatile SingularAttribute<Produto, Integer> id;
    public static volatile SingularAttribute<Produto, Integer> quantidade;
    public static volatile SingularAttribute<Produto, String> descricao;
    public static volatile ListAttribute<Produto, CompraProduto> compraProdutoList;

}