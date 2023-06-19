package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOCliente { //Data Acess Object (DAO)
    public List<Cliente> getLista(){
        String sql = "select * from cliente";
        List<Cliente> listaCliente = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery(); //armazena os dados no rs
            while(rs.next()){ //passando dados para o objeto
                Cliente objCliente = new Cliente();
                objCliente.setCodCliente(rs.getInt("codCliente"));
                objCliente.setNome(rs.getString("nomeCliente"));
                objCliente.setCpf(rs.getString("cpfCliente"));
                objCliente.setTelefone(rs.getString("telefoneCliente")); 
                objCliente.setEmail(rs.getString("emailCliente"));
                java.sql.Date dt = rs.getDate("nascimentoCliente");
                Calendar c = Calendar.getInstance();
                c.setTime(dt);
                objCliente.setDataNascimento(c);
                
                listaCliente.add(objCliente); 
            }
        }catch(SQLException exception){
            JOptionPane.showMessageDialog(null, "Erro de SQL no getLista() do DAOCidade: "+exception.getMessage());
        }
        return listaCliente;
    }
    public boolean incluir(Cliente obj) {
        String sql = "insert into cliente (nomeCliente, cpfCliente, telefoneCliente, emailCliente, nascimentoCliente) values(?,?,?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql); //passando comando sql pra conexão
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getCpf());
            pst.setString(3, obj.getTelefone());
            pst.setString(4, obj.getEmail());
            pst.setDate(5, new java.sql.Date(obj.getDataNascimento().getTimeInMillis()));
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente Inserido");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não Inserido");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no incluir do DAOCliente" + e.getMessage());
        }
        return false;
    }
    
    public boolean alterar(Cliente obj) {
        String sql = "update cliente set nomeCliente = ?, cpfCliente = ?, telefoneCliente = ?, emailCliente = ?, nascimentoCliente = ? where codCliente = ?"; // ? = valores do formulário
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql); // passando comando sql pra conexão
            pst.setString(1, obj.getNome());  
            pst.setString(2, obj.getCpf());  
            pst.setString(3, obj.getTelefone());
            pst.setString(4, obj.getEmail());
            pst.setDate(5, new java.sql.Date(obj.getDataNascimento().getTimeInMillis()));
            pst.setInt(6, obj.getCodCliente());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente alterado");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não alterado");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no alterar do DAOCliente" + e.getMessage());
        }
        return false;
    }
    public boolean remover(Cliente obj) {
        String sql = "delete from cliente where codCliente = ?"; // ? = valores do formulário
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql); // passando comando sql pra conexão
            pst.setInt(1, obj.getCodCliente()); // 1 = primeiro ? = codCidade
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente removido");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não removido");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no remover do DAOCliente" + e.getMessage());
        }
        return false;
    }
    
    public boolean salvar(Cliente obj) {
        if (obj.getCodCliente()== null) {
            return incluir(obj);
        } else {
            return alterar(obj);
        }
    }
    
    public Cliente localizar(Integer codBusca){ //método para FK
        String sql = "select * from cliente where codCliente = ?";
        Cliente obj = new Cliente();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, codBusca); //1 = primeiro ? = codCidade
            ResultSet rs = pst.executeQuery();
           while(rs.next()){
                obj.setCodCliente(rs.getInt("codCliente"));
                obj.setNome(rs.getString("nomeCliente"));
                obj.setCpf(rs.getString("cpfCliente"));
                obj.setTelefone(rs.getString("telefoneCliente"));
                obj.setEmail(rs.getString("emailCliente"));
                java.sql.Date dt = rs.getDate("nascimentoCliente");
                Calendar c = Calendar.getInstance();
                c.setTime(dt);
                obj.setDataNascimento(c);
                return obj;
            } 
        }catch(SQLException e){
                JOptionPane.showMessageDialog
            (null,"Erro de SQL Localizar DAOCliente"+e.getMessage());
        }
            return null;
        }
    
}
