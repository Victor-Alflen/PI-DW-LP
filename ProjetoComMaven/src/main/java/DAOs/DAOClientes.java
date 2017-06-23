package DAOs;

import Entidades.Clientes;
import java.util.ArrayList;
import java.util.List;

public class DAOClientes extends DAOGenerico<Clientes> {

    public DAOClientes() {
        super(Clientes.class);
    }

    public int autoIdClientes() {
        Integer a = (Integer) em.createQuery("SELECT MAX(e.id) FROM Clientes e ").getSingleResult();
        if (a != null) {
            return a + 1;
        } else {
            return 1;
        }
    }


    public List<Clientes> listById(int id) {
        return em.createQuery("SELECT e FROM Clientes e WHERE e.id LIKE :id").setParameter("id", id).getResultList();
    }


    public List<Clientes> listInOrderId() {
        return em.createQuery("SELECT e FROM Clientes e ORDER BY e.id").getResultList();
    }


    public List<Clientes> listByCpf(String cpf) {
        return em.createQuery("SELECT e FROM Clientes e WHERE e.cpf LIKE :cpf").setParameter("cpf", "%" + cpf + "%").getResultList();
    }


    public List<Clientes> listInOrderCpf() {
        return em.createQuery("SELECT e FROM Clientes e ORDER BY e.cpf").getResultList();
    }


    public List<Clientes> listByNome(String nome) {
        return em.createQuery("SELECT e FROM Clientes e WHERE e.nome LIKE :nome").setParameter("nome", "%" + nome + "%").getResultList();
    }


    public List<Clientes> listInOrderNome() {
        return em.createQuery("SELECT e FROM Clientes e ORDER BY e.nome").getResultList();
    }


    public Clientes getByLogin(String login) {
        return (Clientes) em.createQuery("SELECT e FROM Clientes e WHERE e.login LIKE :login").setParameter("login", login).getSingleResult();
    }


    public List<Clientes> listInOrderLogin() {
        return em.createQuery("SELECT e FROM Clientes e ORDER BY e.login").getResultList();
    }
}
