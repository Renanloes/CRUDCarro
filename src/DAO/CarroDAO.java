package DAO;
import Telas.Carro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CarroDAO {
    private Connection con;
    ResultSet rs;
    PreparedStatement pstm;
    public CarroDAO(){
        this.con = new ConexaoBanco().getConexao();
    }
    
    public void cadastrarCarro(Carro carro){
        String sql = "insert into login(user_login,nom_login,pas_login) values(?,?,?)";
        try(PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(2, carro.getDesc());
            ps.setString(1, carro.getPoten());
            ps.setString(3, carro.getCor());
            
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Carro "+carro.getDesc()+" Cadastrado!");
        }catch(Exception e){
               JOptionPane.showMessageDialog(null, "Erro ao cadastrar carro! "+e);
        }
    }
    
    
    public void excluirCarro(int idLogin)throws SQLException{
        String sql = "Delete from login where cod_login=?";
        
        try(Connection connection = new ConexaoBanco().getConexao();
            PreparedStatement ps = connection.prepareStatement(sql)){
            
            ps.setInt(1, idLogin);
            ps.executeUpdate();
            
        } catch (java.sql.SQLIntegrityConstraintViolationException e) {
            throw new SQLException("Erro: Não foi possível excluir o Carro!");
        }
    }
    
    
    public ArrayList<Carro> getCarro(){
        String SQL = "Select * from login";
        ArrayList<Carro> carro = null;
        
        try (Connection connection = new ConexaoBanco().getConexao();
            PreparedStatement ps = connection.prepareStatement(SQL)) {
            
            try (ResultSet rs = ps.executeQuery()) {
                while(rs.next()){ 
                    if (carro == null) {
                        carro = new ArrayList<>();
                    }
                    
                    Carro carro2 = new Carro();
                    carro2.setCod(rs.getInt("cod_login"));
                    carro2.setDesc(rs.getString("nom_login"));
                    carro2.setPoten(rs.getString("user_login"));
                    carro2.setCor(rs.getString("pas_login"));

                    carro.add(carro2);
                }
            }
            return carro;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public void alterarCarro(int codigo, String password){

        String sql2 = "Select * from login where cod_login = ?";
        try (PreparedStatement ps = con.prepareStatement(sql2)){
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if(!rs.next()){
                JOptionPane.showConfirmDialog(null, "ID não encontrado!");
                return;
            }
        } catch (Exception e) {
        }
    }

    public void alterarCarro(Carro carroAtualizado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
