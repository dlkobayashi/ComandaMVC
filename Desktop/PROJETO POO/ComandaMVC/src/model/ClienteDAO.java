
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Kobayashi
 */
public class ClienteDAO {
    static Connection conexao;
    static Statement stmt;
    static ResultSet rs;
    
    //Método para realizar a conexão com a base de dados(BD)
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        Connection con;
        //Teste de conexão com o MySQL
        //Class.forName("com.mysql.jdbc:Driver.class");
        //Teste do driver de conexão PostgreSQL
        //Class.forName("org.postgresql:Driver.class");

        con = DriverManager.getConnection("jdbc:derby://localhost:1527/ComandaDB","usuario", "1234");
        return con;
    }

    public static void gravarNovoCliente(Cliente cliente) throws SQLException, ClassNotFoundException {
        String sql;
        conexao = getConnection();
        stmt = conexao.createStatement();
 
        sql = "INSERT INTO cliente (documento,nome,dtnascimento,telefone,email,sexo,idade) VALUES (" 
                + "'" + cliente.getDocumento()+ "'"
                + ",'"+ cliente.getNome() + "'"
                + ",'"+ cliente.getDtNascimento()+ "'"
                + ",'"+ cliente.getTelefone()+ "'"
                + ",'"+ cliente.getEmail()+ "'"
                + ",'"+ cliente.getSexo()+ "'"
                + "," + cliente.getIdade() + ")";
        
        if(stmt.executeUpdate(sql)>0)
            JOptionPane.showMessageDialog(null,"Dados do cliente foram gravados com sucesso!");
        else
            JOptionPane.showMessageDialog(null,"ERRO ao gravar no BD...");
        
    }

    public static void alterarPacienteCodigo(Cliente cliente, String documento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static ResultSet buscarListagemClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static ResultSet buscarPacienteCodigo(String documento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void excluirPacienteCodigo(String documento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void excluirClienteDocumento(String documento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
