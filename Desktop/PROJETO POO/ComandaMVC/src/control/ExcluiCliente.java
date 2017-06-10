/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import model.ClienteDAO;

/**
 *
 * @author Kobayashi
 */
public class ExcluiCliente {
    public static void excluirCliente(String documento) throws SQLException, ClassNotFoundException{
        ClienteDAO.excluirClienteDocumento(documento);
    }
}
