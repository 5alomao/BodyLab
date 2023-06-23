
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DAOVenda {

    ConverteDataWEB converte = new ConverteDataWEB();
    private int lastId;

    public int getLastId() {
        return lastId;
    }

    public boolean incluir(Venda objVenda) {
        
        String sql = "insert into venda (codCliente,formaPagamento,dataVenda) values (?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, objVenda.getCliente().getCodCliente());
            pst.setString(2, objVenda.getFormaPagamento());
            pst.setDate(3, converte.converteBanco(objVenda.getDataVenda()));

            if (pst.executeUpdate() > 0) {
                 ResultSet rs = pst.getGeneratedKeys();// retorna o último codVenda cadastrado
                if (rs.next()) {
                    lastId = rs.getInt(1); //armazena o último codVenda cadastrado
                }
                JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso!");

            } else {
                 JOptionPane.showMessageDialog(null, "Venda não cadastrada");

            }
            pst.close();
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro de SQL no incluir do DAOVenda: " + e.getMessage());

        }
        return false;
    }

    public boolean remover(Venda objVenda) {
        
        String sql = "delete from venda where codVenda = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, objVenda.getCodVenda());
            if (pst.executeUpdate() > 0) {
                 JOptionPane.showMessageDialog(null, "Venda removida");

            } else {
                 JOptionPane.showMessageDialog(null, "Venda não removida");

            }
            pst.close();
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro de SQL no remover do DAOVenda:" + e.getMessage());
 

        }
        return false;
    }

}
