package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOProduto {
 
    DAOCategoria objDAOCategoria = new DAOCategoria();
    DAOMarca objDAOMarca = new DAOMarca();
    
    public List<Produto> getLista(){
        
        String sql = "select * from produto";
        List<Produto> listaProduto= new ArrayList<>();
        
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Produto objProduto = new Produto();
                objProduto.setCodProduto(rs.getInt("codProduto"));
                objProduto.setNome(rs.getString("nomeProduto"));
                objProduto.setValor(rs.getDouble("valorProduto"));
                objProduto.setEstoque(rs.getInt("estoque"));
                objProduto.setObjCategoria(objDAOCategoria.localizar(rs.getInt("CATEGORIA_codCategoria")));
                objProduto.setObjMarca(objDAOMarca.localizar(rs.getInt("MARCA_codMarca")));
                listaProduto.add(objProduto);
            }
        }catch(SQLException exception){
            JOptionPane.showMessageDialog(null, "Erro SQL no getLista() do DAOProduto: "+exception.getMessage());
        }
        return listaProduto;
    }
    
    public boolean incluir(Produto obj) {
        String sql = "insert into produto (nomeProduto, valorProduto, estoque, CATEGORIA_codCategoria, MARCA_codMarca) values(?,?,?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setDouble(2, obj.getValor());
            pst.setInt(3, obj.getEstoque());
            pst.setInt(4, obj.getObjCategoria().getCodCategoria());
            pst.setInt(5, obj.getObjMarca().getCodMarca());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Produto Inserido");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Produto não Inserido");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no incluir do DAOProduto: " + e.getMessage());
        }
        return false;
    }
    
    public boolean alterar(Produto obj){
        String sql = "update produto set nomeProduto=?, valorProduto=?, estoque=?, CATEGORIA_codCategoria=?, MARCA_codMarca=? where codProduto = ?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setDouble(2, obj.getValor());
            pst.setInt(3, obj.getEstoque());
            pst.setInt(4, obj.getObjCategoria().getCodCategoria());
            pst.setInt(5, obj.getObjMarca().getCodMarca());
            pst.setInt(6, obj.getCodProduto());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Produto Alterado");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Produto não Alterado");
                return false;
            }
        } catch(SQLException exception){
            JOptionPane.showMessageDialog(null, "Erro SQL no alterar do DAOProduto: "+exception.getMessage());
        }
        return false;
    }
    
    public boolean salvar(Produto obj){
        if(obj.getCodProduto()==null){
            return incluir(obj);    
        }else{
            return alterar(obj); 
        } 
    }
    
    public boolean remover(Produto obj){
        
        String sql = "delete from produto where codProduto = ?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodProduto());
            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Produto Removido");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Produto não removido");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de SQL no remover do DAOProduto: "+e.getMessage());
        }
        
        return false;
    }
    
    public Produto Localizar(Integer codBusca){
        
        String sql = "select * from produto where codProduto = ?";
        Produto objProduto = new Produto();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, codBusca);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                objProduto.setCodProduto(rs.getInt("codProduto"));
                objProduto.setNome(rs.getString("nomeProduto"));
                objProduto.setValor(rs.getDouble("valorProduto"));
                objProduto.setEstoque(rs.getInt("estoque"));
                objProduto.setObjCategoria(objDAOCategoria.localizar(rs.getInt("CATEGORIA_codCategoria")));
                objProduto.setObjMarca(objDAOMarca.localizar(rs.getInt("MARCA_codMarca")));
                return objProduto;   
            }
        } catch(SQLException exception){
            JOptionPane.showMessageDialog(null, "Erro SQL no Localizar do DAOProduto: "+exception.getMessage());
        }
        return null;
    }
}
