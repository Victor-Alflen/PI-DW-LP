/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Victor
 */
@Entity
@Table(name = "subcategoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subcategoria.findAll", query = "SELECT s FROM Subcategoria s")
    , @NamedQuery(name = "Subcategoria.findById", query = "SELECT s FROM Subcategoria s WHERE s.subcategoriaPK.id = :id")
    , @NamedQuery(name = "Subcategoria.findByCategoriaId", query = "SELECT s FROM Subcategoria s WHERE s.subcategoriaPK.categoriaId = :categoriaId")
    , @NamedQuery(name = "Subcategoria.findByNome", query = "SELECT s FROM Subcategoria s WHERE s.nome = :nome")})
public class Subcategoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SubcategoriaPK subcategoriaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nome")
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subcategoria")
    private List<Produto> produtoList;
    @JoinColumn(name = "categoria_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Categoria categoria;

    public Subcategoria() {
    }

    public Subcategoria(SubcategoriaPK subcategoriaPK) {
        this.subcategoriaPK = subcategoriaPK;
    }

    public Subcategoria(SubcategoriaPK subcategoriaPK, String nome) {
        this.subcategoriaPK = subcategoriaPK;
        this.nome = nome;
    }

    public Subcategoria(int id, int categoriaId) {
        this.subcategoriaPK = new SubcategoriaPK(id, categoriaId);
    }

    public SubcategoriaPK getSubcategoriaPK() {
        return subcategoriaPK;
    }

    public void setSubcategoriaPK(SubcategoriaPK subcategoriaPK) {
        this.subcategoriaPK = subcategoriaPK;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlTransient
    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subcategoriaPK != null ? subcategoriaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subcategoria)) {
            return false;
        }
        Subcategoria other = (Subcategoria) object;
        if ((this.subcategoriaPK == null && other.subcategoriaPK != null) || (this.subcategoriaPK != null && !this.subcategoriaPK.equals(other.subcategoriaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Subcategoria[ subcategoriaPK=" + subcategoriaPK + " ]";
    }
    
}
