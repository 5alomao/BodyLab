
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOItemVenda { // data acess object

    DAOProduto objDAOProduto = new DAOProduto();

    public List<ItemVenda> getListaItensVenda(Integer codBusca) {
        String sql = "select * from item_venda where VENDA_codVenda = ?";
        List<ItemVenda> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, codBusca);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ItemVenda obj = new ItemVenda();
                System.out.println("CodVenda=:"+rs.getInt("VENDA_codVenda"));
                //obj.getObjVenda().setCodVenda(rs.getInt("VENDA_codVenda"));
                obj.setCodItemVenda(rs.getInt("codItemVenda"));
                obj.setObjProduto(objDAOProduto.Localizar(rs.getInt("PRODUTO_codProduto")));
                obj.setQuantidade(rs.getInt("quantidade"));
                lista.add(obj);
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no getLista() do DAOItemVenda: " + e.getMessage());

        }
        return lista;
    }

    public boolean incluir(ItemVenda objItemVenda) {

        String sql = "insert into item_venda (VENDA_codVenda,PRODUTO_codProduto,quantidade) values (?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, objItemVenda.getObjVenda().getCodVenda());
            pst.setInt(2, objItemVenda.getObjProduto().getCodProduto());
            pst.setInt(3, objItemVenda.getQuantidade());
            System.out.println("cod venda="+objItemVenda.getObjVenda().getCodVenda());
            System.out.println("cod produto="+objItemVenda.getObjProduto().getCodProduto());
            System.out.println("quantidade="+objItemVenda.getQuantidade());
            if (pst.executeUpdate() > 0) {

               JOptionPane.showMessageDialog(null, "Item de venda cadastrado com sucesso!");

            } else {
                JOptionPane.showMessageDialog(null, "Item de venda não cadastrado!");

            }
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no incluir do DAOItemVenda: " + e.getMessage());

        }
        return false;
    }

    public boolean remover(ItemVenda objItemVenda) {
        String sql = "delete from item_venda where codItemVenda = ?";
        
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, objItemVenda.getCodItemVenda());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Item de venda removido com sucesso!");

            } else {
                 JOptionPane.showMessageDialog(null, "Item de venda não removido!");

            }
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no remover do DAOItemVenda: " + e.getMessage());

        }
        return false;
    }

}
