package Entidades;

import Entidades.Compra;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-22T22:19:21")
@StaticMetamodel(Tipo.class)
public class Tipo_ { 

    public static volatile SingularAttribute<Tipo, String> nome;
    public static volatile SingularAttribute<Tipo, Integer> id;
    public static volatile ListAttribute<Tipo, Compra> compraList;
    public static volatile SingularAttribute<Tipo, String> descricao;

}