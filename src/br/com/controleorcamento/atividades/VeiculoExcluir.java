/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.atividades;

import br.com.controleorcamento.objeto.Veiculo;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rosaan
 */
public class VeiculoExcluir {

    public VeiculoExcluir() {
    }

    public void VeiculoExcluir(Veiculo veic) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("DELETE FROM veiculos WHERE veiculos.ID ="
                    + veic.getId());
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showConfirmDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
