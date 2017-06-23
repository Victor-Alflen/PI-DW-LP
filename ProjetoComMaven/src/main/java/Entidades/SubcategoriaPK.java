/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Victor
 */
@Embeddable
public class SubcategoriaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "categoria_id")
    private int categoriaId;

    public SubcategoriaPK() {
    }

    public SubcategoriaPK(int id, int categoriaId) {
        this.id = id;
        this.categoriaId = categoriaId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) categoriaId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubcategoriaPK)) {
            return false;
        }
        SubcategoriaPK other = (SubcategoriaPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.categoriaId != other.categoriaId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.SubcategoriaPK[ id=" + id + ", categoriaId=" + categoriaId + " ]";
    }
    
}
