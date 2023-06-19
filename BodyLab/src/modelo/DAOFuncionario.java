package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOFuncionario { //Data Acess Object (DAO)
    
    DAOCargo objDAOCargo = new DAOCargo();
    
    public List<Funcionario> getLista(){
        String sql = "select * from funcionario";
        List<Funcionario> listaFuncionario = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Funcionario objFuncionario = new Funcionario();
                objFuncionario.setCodFuncionario(rs.getInt("codFuncionario"));
                objFuncionario.setNome(rs.getString("nomeFuncionario"));
                objFuncionario.setCpf(rs.getString("cpfFuncionario"));
                objFuncionario.setTelefone(rs.getString("telefoneFuncionario")); 
                objFuncionario.setEmail(rs.getString("emailFuncionario"));
                
                java.sql.Date dt = rs.getDate("nascimentoFuncionario");
                Calendar c = Calendar.getInstance();
                c.setTime(dt);
                objFuncionario.setDataNascimento(c);
                
                objFuncionario.setObjCargo(objDAOCargo.localizar(rs.getInt("CARGO_codCargo")));
                
                listaFuncionario.add(objFuncionario); 
            }
        }catch(SQLException exception){
            JOptionPane.showMessageDialog(null, "Erro de SQL no getLista() do DAOFuncionario: "+exception.getMessage());
        }
        return listaFuncionario;
    }
    
    public boolean incluir(Funcionario obj) {
        String sql = "insert into funcionario (nomeFuncionario, cpfFuncionario, telefoneFuncionario, emailFuncionario, nascimentoFuncionario, CARGO_codCargo) values(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getCpf());
            pst.setString(3, obj.getTelefone());
            pst.setString(4, obj.getEmail());
            pst.setDate(5, new java.sql.Date(obj.getDataNascimento().getTimeInMillis()));
            pst.setInt(6, obj.getObjCargo().getCodCargo());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario Inserido");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Funcionario não Inserido");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no incluir do DAOFuncionario" + e.getMessage());
        }
        return false;
    }
    
    public boolean alterar(Funcionario obj) {
        String sql = "update funcionario set nomeFuncionario=?, cpfFuncionario=?, telefoneFuncionario=?, emailFuncionario=?, nascimentoFuncionario=?, CARGO_codCargo=? where codFuncionario = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getCpf());
            pst.setString(3, obj.getTelefone());
            pst.setString(4, obj.getEmail());
            pst.setDate(5, new java.sql.Date(obj.getDataNascimento().getTimeInMillis()));
            pst.setInt(6, obj.getObjCargo().getCodCargo());
            pst.setInt(7, obj.getCodFuncionario());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario alterado");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Funcionario não alterado");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no alterar do DAOFuncionario" + e.getMessage());
        }
        return false;
    }
    
    public boolean remover(Funcionario obj) {
        String sql = "delete from funcionario where codFuncionario = ?"; // ? = valores do formulário
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql); // passando comando sql pra conexão
            pst.setInt(1, obj.getCodFuncionario()); // 1 = primeiro ? = codCidade
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario removido");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Funcionario não removido");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no remover do DAOFuncionario" + e.getMessage());
        }
        return false;
    }
    
    public boolean salvar(Funcionario obj) {
        if (obj.getCodFuncionario()== null) {
            return incluir(obj);
        } else {
            return alterar(obj);
        }
    }
    
}
