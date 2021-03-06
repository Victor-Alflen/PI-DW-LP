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
public class CompraProdutoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_compra")
    private int idCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_produto")
    private int idProduto;

    public CompraProdutoPK() {
    }

    public CompraProdutoPK(int idCompra, int idProduto) {
        this.idCompra = idCompra;
        this.idProduto = idProduto;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCompra;
        hash += (int) idProduto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompraProdutoPK)) {
            return false;
        }
        CompraProdutoPK other = (CompraProdutoPK) object;
        if (this.idCompra != other.idCompra) {
            return false;
        }
        if (this.idProduto != other.idProduto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.CompraProdutoPK[ idCompra=" + idCompra + ", idProduto=" + idProduto + " ]";
    }
    
}
