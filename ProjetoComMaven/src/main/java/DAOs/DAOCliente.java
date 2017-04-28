package DAOs;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

public class DAOCliente extends DAOGenerico<Cliente> {

    public DAOCliente() {
        super(Cliente.class);
    }

    public int autoIdCliente() {
        Integer a = (Integer) em.createQuery("SELECT MAX(e.id) FROM Cliente e ").getSingleResult();
        if (a != null) {
            return a + 1;
        } else {
            return 1;
        }
    }


    public List<Cliente> listById(int id) {
        return em.createQuery("SELECT e FROM Cliente e WHERE e.id LIKE :id").setParameter("id", id).getResultList();
    }


    public List<Cliente> listInOrderId() {
        return em.createQuery("SELECT e FROM Cliente e ORDER BY e.id").getResultList();
    }


    public List<Cliente> listByNome(String nome) {
        return em.createQuery("SELECT e FROM Cliente e WHERE e.nome LIKE :nome").setParameter("nome", "%" + nome + "%").getResultList();
    }


    public List<Cliente> listInOrderNome() {
        return em.createQuery("SELECT e FROM Cliente e ORDER BY e.nome").getResultList();
    }


    public List<String> listInOrderFormatada(String qualOrdem) {
        List<Cliente> lf;
        switch (qualOrdem) {
            case "id":
                lf = listInOrderId();
                break;

            case "nome":
                lf = listInOrderNome();
                break;

            default:
                //Não deve ocorrer
                lf = new ArrayList<>();
        }
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < lf.size(); i++) {

            ls.add(lf.get(i).getId()+ "-" + lf.get(i).getNome());

        }
        return ls;
    }}
