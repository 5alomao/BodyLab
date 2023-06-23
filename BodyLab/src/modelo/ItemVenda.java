package modelo;

import java.io.Serializable;
import java.util.Objects;

public class ItemVenda implements Serializable{
    
    private Integer codItemVenda, quantidade;
    private Produto objProduto;
    private Venda objVenda;

    public ItemVenda() {
    }

    public Integer getCodItemVenda() {
        return codItemVenda;
    }

    public void setCodItemVenda(Integer codItemVenda) {
        this.codItemVenda = codItemVenda;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getObjProduto() {
        return objProduto;
    }

    public void setObjProduto(Produto objProduto) {
        this.objProduto = objProduto;
    }

    public Venda getObjVenda() {
        return objVenda;
    }

    public void setObjVenda(Venda objVenda) {
        this.objVenda = objVenda;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.codItemVenda);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemVenda other = (ItemVenda) obj;
        if (!Objects.equals(this.codItemVenda, other.codItemVenda)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return objProduto.getNome()+" Valor: "+objProduto.getValor()+" Qtd: "+String.valueOf(quantidade); 
    }
}
