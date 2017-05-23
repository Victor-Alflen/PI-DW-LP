package DAOs;

import Entidades.Categoria;
import java.util.ArrayList;
import java.util.List;

public class DAOCategoria extends DAOGenerico<Categoria> {

    public DAOCategoria() {
        super(Categoria.class);
    }

    public int autoIdCategoria() {
        Integer a = (Integer) em.createQuery("SELECT MAX(e.id) FROM Categoria e ").getSingleResult();
        if (a != null) {
            return a + 1;
        } else {
            return 1;
        }
    }


    public List<Categoria> listById(int id) {
        return em.createQuery("SELECT e FROM Categoria e WHERE e.id LIKE :id").setParameter("id", id).getResultList();
    }


    public List<Categoria> listInOrderId() {
        return em.createQuery("SELECT e FROM Categoria e ORDER BY e.id").getResultList();
    }


    public List<Categoria> listByNome(String nome) {
        return em.createQuery("SELECT e FROM Categoria e WHERE e.nome LIKE :nome").setParameter("nome", "%" + nome + "%").getResultList();
    }


    public List<Categoria> listInOrderNome() {
        return em.createQuery("SELECT e FROM Categoria e ORDER BY e.nome").getResultList();
    }


    public List<String> listInOrderFormatada(String qualOrdem) {
        List<Categoria> lf;
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
