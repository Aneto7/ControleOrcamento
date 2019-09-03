/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.atividades;

import br.com.controleorcamento.objeto.TipoVeiculo;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rosaan
 */
public class TipoVeiculoAtualizar {

    public TipoVeiculoAtualizar() {
    }

    public void TipoVeiculoAtualizar(TipoVeiculo tipo) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("UPDATE tipoveiculo SET MODELO='"
                    + tipo.getModelo() + "',TIPO='"
                    + tipo.getTipo() 
                    + "' WHERE ID='" + tipo.getId() + "'");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
