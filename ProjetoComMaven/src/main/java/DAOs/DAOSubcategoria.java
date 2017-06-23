package DAOs;

import Entidades.Subcategoria;
import java.util.ArrayList;
import java.util.List;

public class DAOSubcategoria extends DAOGenerico<Subcategoria> {

    public DAOSubcategoria() {
        super(Subcategoria.class);
    }

    public int autoIdSubcategoria() {
        Integer a = (Integer) em.createQuery("SELECT MAX(e.id) FROM Subcategoria e ").getSingleResult();
        if (a != null) {
            return a + 1;
        } else {
            return 1;
        }
    }


    public List<Subcategoria> listById(int id) {
        return em.createQuery("SELECT e FROM Subcategoria e WHERE e.id LIKE :id").setParameter("id", id).getResultList();
    }


    public List<Subcategoria> listInOrderId() {
        return em.createQuery("SELECT e FROM Subcategoria e ORDER BY e.id").getResultList();
    }


    public List<Subcategoria> listById_categoria(int id_categoria) {
        return em.createQuery("SELECT e FROM Subcategoria e WHERE e.id_categoria LIKE :id_categoria").setParameter("id_categoria", id_categoria).getResultList();
    }


    public List<Subcategoria> listInOrderId_categoria() {
        return em.createQuery("SELECT e FROM Subcategoria e ORDER BY e.id_categoria").getResultList();
    }


}
