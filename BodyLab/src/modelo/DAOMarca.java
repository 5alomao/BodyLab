
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOMarca {
    
    public List<Marca> getLista(){
        
        String sql = "select * from marca";
        List<Marca> listaMarca = new ArrayList<>();
        
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Marca objMarca = new Marca();
                objMarca.setCodMarca(rs.getInt("codMarca"));
                objMarca.setNomeMarca(rs.getString("nomeMarca"));
                listaMarca.add(objMarca);
            }
        } catch(SQLException exception){
            JOptionPane.showMessageDialog(null, "Erro SQL no getLista do DAOMarca: "+exception.getMessage());
        }
        return listaMarca;
    }
    
    public boolean incluir(Marca obj) {
        String sql = "insert into marca (nomeMarca) values(?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeMarca());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Marca Inserida");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Marca não Inserida");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no incluir do DAOMarca: " + e.getMessage());
        }
        return false;
    }
    
    public boolean alterar(Marca obj) {
        String sql = "update marca set nomeMarca=? where codMarca = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeMarca());
            pst.setInt(2, obj.getCodMarca());
            
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Marca alterada");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Marca não alterada");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no alterar do DAOMarca: " + e.getMessage());
        }
        return false;
    }
    
    public boolean remover(Marca obj) {
        String sql = "delete from marca where codMarca = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodMarca());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Marca removida");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Marca não removida");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no remover do DAOMarca: " + e.getMessage());
        }
        return false;
    }
    
    public boolean salvar(Marca obj) {
        if (obj.getCodMarca()== null) {
            return incluir(obj);
        } else {
            return alterar(obj);
        }
    }
    
    public Marca localizar(Integer codBusca){ //método para FK
        String sql = "select * from marca where codMarca = ?";
        Marca obj = new Marca();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, codBusca);
            ResultSet rs = pst.executeQuery();
           while(rs.next()){
                obj.setCodMarca(rs.getInt("codMarca"));
                obj.setNomeMarca(rs.getString("nomeMarca"));
                return obj;
            } 
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Erro de SQL Localizar DAOMarca: "+e.getMessage());
        }
        return null;
    }
}
