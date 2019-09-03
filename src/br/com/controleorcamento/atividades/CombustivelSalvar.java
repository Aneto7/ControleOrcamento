/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.atividades;

import br.com.controleorcamento.objeto.Combustivel;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rosaan
 */
public class CombustivelSalvar {

    public CombustivelSalvar() {
    }

    public void CombustivelSalvar(Combustivel combus) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO `combustivel` (`ID`, `PLACA`, `CARTAO`, `DATA`, `VALOR`, `LITROS`, `KM`, `CENTRO_CUSTO`, `CONDUTOR`) VALUES (NULL, '" + combus.getPlaca() + "', '" + combus.getCartao() + "', '" + combus.getDataab() + "', '" + combus.getValor() + "', '" + combus.getLitros() + "', '" + combus.getKm() + "', '" + combus.getCentro() + "', '" + combus.getCondutor() + "');");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
