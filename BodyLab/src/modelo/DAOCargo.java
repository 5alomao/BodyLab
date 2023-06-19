package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOCargo {
    
    public List<Cargo> getLista(){
        String sql = "select * from cargo";
        List<Cargo> listaCargo = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery(); //armazena os dados no rs
            while(rs.next()){ //passando dados para o objeto
                Cargo objCargo = new Cargo();
                objCargo.setCodCargo(rs.getInt("codCargo"));
                objCargo.setNome(rs.getString("nomeCargo"));
                objCargo.setSalario(rs.getDouble("salarioCargo"));
                
                listaCargo.add(objCargo); 
            }
        }catch(SQLException exception){
            JOptionPane.showMessageDialog(null, "Erro de SQL no getLista() do DAOCargo: "+exception.getMessage());
        }
        return listaCargo;
    }
    
    public boolean incluir(Cargo obj) {
        String sql = "insert into cargo (nomeCargo, salarioCargo) values(?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setDouble(2, obj.getSalario());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cargo Inserido");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cargo não Inserido");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no incluir do DAOCargo: " + e.getMessage());
        }
        return false;
    }
    
    public boolean alterar(Cargo obj) {
        String sql = "update cargo set nomeCargo=?, salarioCargo=? where codCargo = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setDouble(2, obj.getSalario());
            pst.setInt(3, obj.getCodCargo());
            
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cargo alterado");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cargo não alterado");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no alterar do DAOCargo: " + e.getMessage());
        }
        return false;
    }
    
    public boolean remover(Cargo obj) {
        String sql = "delete from cargo where codCargo = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodCargo());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cargo removido");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cargo não removido");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no remover do DAOCargo: " + e.getMessage());
        }
        return false;
    }
    
    public boolean salvar(Cargo obj) {
        if (obj.getCodCargo()== null) {
            return incluir(obj);
        } else {
            return alterar(obj);
        }
    }
    
    public Cargo localizar(Integer codBusca){ //método para FK
        String sql = "select * from cargo where codCargo = ?";
        Cargo obj = new Cargo();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, codBusca);
            ResultSet rs = pst.executeQuery();
           while(rs.next()){
                obj.setCodCargo(rs.getInt("codCargo"));
                obj.setNome(rs.getString("nomeCargo"));
                obj.setSalario(rs.getDouble("salarioCargo"));
                return obj;
            } 
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Erro de SQL Localizar DAOCargo: "+e.getMessage());
        }
            return null;
    }
    
}
