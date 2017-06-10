/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ClienteDAO;

/**
 *
 * @author Kobayashi
 */
public class BuscaCliente {
        public static ResultSet buscarCliente(String documento) throws SQLException, ClassNotFoundException {
        ResultSet rs;
        rs = ClienteDAO.buscarPacienteCodigo(documento);
       
        if(!rs.next())
                JOptionPane.showMessageDialog(null,"Cliente não encontrado!!!");
        
       return rs;
    }

    public static ResultSet buscarTodosClientes() throws SQLException, ClassNotFoundException {
        ResultSet rs;
        rs = ClienteDAO.buscarListagemClientes();
                
        return rs;
    }
}