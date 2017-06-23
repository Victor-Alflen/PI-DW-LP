package Entidades;

import Entidades.Categoria;
import Entidades.Produto;
import Entidades.SubcategoriaPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-22T22:19:21")
@StaticMetamodel(Subcategoria.class)
public class Subcategoria_ { 

    public static volatile SingularAttribute<Subcategoria, Categoria> categoria;
    public static volatile SingularAttribute<Subcategoria, SubcategoriaPK> subcategoriaPK;
    public static volatile ListAttribute<Subcategoria, Produto> produtoList;
    public static volatile SingularAttribute<Subcategoria, String> nome;

}