/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import model.ClienteDAO;

/**
 *
 * @author Kobayashi
 */
public class ValidaCliente {
    public static void inserirNovoCliente(Cliente cliente) throws SQLException, ClassNotFoundException {
        if(cliente.getIdade() < 18)
            JOptionPane.showMessageDialog(null, "PACIENTE MENOR DE IDADE");
        else
            ClienteDAO.gravarNovoCliente(cliente);
    }
}