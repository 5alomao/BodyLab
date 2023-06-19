package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOCategoria {
    
    public List<Categoria> getLista(){
        
        String sql = "select * from categoria";
        List<Categoria> listaCategoria = new ArrayList<>();
        
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Categoria objCategoria = new Categoria();
                objCategoria.setCodCategoria(rs.getInt("codCategoria"));
                objCategoria.setNomeCategoria(rs.getString("nomeCategoria"));
                listaCategoria.add(objCategoria);
            }
        }catch(SQLException exception){
            JOptionPane.showMessageDialog(null, "Erro de SQL no getLista() do DAOCategoria: "+exception.getMessage());
        }
        return listaCategoria;
    }
    
    public boolean incluir(Categoria obj){
        
        String sql = "insert into categoria (nomeCategoria) values (?)";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeCategoria());
            if(pst.executeUpdate() > 0 ){
                JOptionPane.showMessageDialog(null, "Categoria Inserida");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Categoria nao Inserida");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no incluir do DAOCategoria: "+ e.getMessage());
        }
        return false;
    }
    
    public boolean alterar(Categoria obj){
        String sql = "update categoria set nomeCategoria = ? where codCategoria = ?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeCategoria());
            pst.setInt(2, obj.getCodCategoria());
            
            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Categoria alterada");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Categoria não alterada");
                return false;
            }
        } catch (SQLException exception){
            JOptionPane.showMessageDialog(null, "Erro de SQL no alterar do DAOCategoria: "+exception.getMessage());
        }
        return false;
    }
    
    public boolean remover(Categoria obj){
        String sql = "delete from categoria where codCategoria = ?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodCategoria());
            
            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Categoria removida");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Categoria não removida");
                return false;
            }
        } catch (SQLException exception){
            JOptionPane.showMessageDialog(null, "Erro de SQL no remover do DAOCategoria: " +exception.getMessage());
        }
        return false;
    }
    
    public boolean salvar(Categoria obj){
        if(obj.getCodCategoria() == null){
            return incluir(obj);
        } else {
            return alterar(obj);
        }
    }
    
    public Categoria localizar(Integer codBusca){
        String sql = "select * from categoria where codCategoria = ?";
        Categoria obj = new Categoria();
        
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, codBusca);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                obj.setCodCategoria(rs.getInt("codCategoria"));
                obj.setNomeCategoria(rs.getString("nomeCategoria"));
                return obj;
            }
        } catch(SQLException exception){
            JOptionPane.showMessageDialog(null, "Erro de SQL no Localizar do DAOCategoria: "+ exception.getMessage());
        }
        return null;
    }
}
