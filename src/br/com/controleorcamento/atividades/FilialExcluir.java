/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.atividades;

import br.com.controleorcamento.objeto.Filial;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rosaan
 */
public class FilialExcluir {

    public FilialExcluir() {
    }

    public void FilialExcluir(Filial filial) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("DELETE FROM filial WHERE filial.ID ="
                    + filial.getId());
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showConfirmDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
