package Entidades;

import Entidades.Compra;
import Entidades.Endereco;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-22T22:19:21")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> senha;
    public static volatile SingularAttribute<Clientes, Boolean> ativo;
    public static volatile SingularAttribute<Clientes, Endereco> endereco;
    public static volatile SingularAttribute<Clientes, String> cpf;
    public static volatile SingularAttribute<Clientes, Integer> admin;
    public static volatile SingularAttribute<Clientes, String> nome;
    public static volatile SingularAttribute<Clientes, Integer> id;
    public static volatile SingularAttribute<Clientes, String> login;
    public static volatile SingularAttribute<Clientes, Date> dataNascimento;
    public static volatile ListAttribute<Clientes, Compra> compraList;
    public static volatile SingularAttribute<Clientes, String> email;

}