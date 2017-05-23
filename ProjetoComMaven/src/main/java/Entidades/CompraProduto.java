/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Victor
 */
@Entity
@Table(name = "compra_produto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompraProduto.findAll", query = "SELECT c FROM CompraProduto c")
    , @NamedQuery(name = "CompraProduto.findByIdCompra", query = "SELECT c FROM CompraProduto c WHERE c.compraProdutoPK.idCompra = :idCompra")
    , @NamedQuery(name = "CompraProduto.findByIdProduto", query = "SELECT c FROM CompraProduto c WHERE c.compraProdutoPK.idProduto = :idProduto")
    , @NamedQuery(name = "CompraProduto.findByQuantidade", query = "SELECT c FROM CompraProduto c WHERE c.quantidade = :quantidade")
    , @NamedQuery(name = "CompraProduto.findByValorUnitario", query = "SELECT c FROM CompraProduto c WHERE c.valorUnitario = :valorUnitario")})
public class CompraProduto implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CompraProdutoPK compraProdutoPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantidade")
    private int quantidade;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "valor_unitario")
    private String valorUnitario;
    @JoinColumn(name = "id_compra", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Compra compra;
    @JoinColumn(name = "id_produto", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Produto produto;

    public CompraProduto() {
    }

    public CompraProduto(CompraProdutoPK compraProdutoPK) {
        this.compraProdutoPK = compraProdutoPK;
    }

    public CompraProduto(CompraProdutoPK compraProdutoPK, int quantidade, String valorUnitario) {
        this.compraProdutoPK = compraProdutoPK;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public CompraProduto(int idCompra, int idProduto) {
        this.compraProdutoPK = new CompraProdutoPK(idCompra, idProduto);
    }

    public CompraProdutoPK getCompraProdutoPK() {
        return compraProdutoPK;
    }

    public void setCompraProdutoPK(CompraProdutoPK compraProdutoPK) {
        this.compraProdutoPK = compraProdutoPK;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compraProdutoPK != null ? compraProdutoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompraProduto)) {
            return false;
        }
        CompraProduto other = (CompraProduto) object;
        if ((this.compraProdutoPK == null && other.compraProdutoPK != null) || (this.compraProdutoPK != null && !this.compraProdutoPK.equals(other.compraProdutoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.CompraProduto[ compraProdutoPK=" + compraProdutoPK + " ]";
    }
    
}
