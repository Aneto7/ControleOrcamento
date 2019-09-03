/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.atividades;

import br.com.controleorcamento.objeto.Revisao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rosaan
 */
public class RevisaoSalvar {

    public RevisaoSalvar() {
    }

    public void RevisaoSalvar(Revisao rev) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO `revisoes` (`ID`, `PLACA`, `LOCADORA`, `BASE`, `KM`, `DATA`, `OBSERVACAO`) VALUES (NULL, '" + rev.getPlaca() + "', '" + rev.getLocadora() + "', '" + rev.getBase() + "', '" + rev.getKm() + "', '" + rev.getData() + "', '" + rev.getObs() + "');");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
