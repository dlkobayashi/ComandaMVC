/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import model.Cliente;
import model.ClienteDAO;

/**
 *
 * @author Kobayashi
 */
public class AlteraCliente {
    public static void alterarPacienteCodigo(Cliente cliente, String documento) throws SQLException, ClassNotFoundException {
        ClienteDAO.alterarPacienteCodigo(cliente, documento);
    }
}
        
