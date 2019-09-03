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
public class CombustivelAtualizar {

    public CombustivelAtualizar() {
    }

    public void CombustivelAtualizar(Combustivel combus) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("UPDATE combustivel SET PLACA='"
                    + combus.getPlaca() + "',CARTAO='"
                    + combus.getCartao() + "',DATA='"
                    + combus.getDataab() + "',VALOR='"
                    + combus.getValor() + "',LITROS='"
                    + combus.getLitros() + "',KM='"
                    + combus.getKm() + "',CENTRO_CUSTO='"
                    + combus.getCentro() + "',CONDUTOR='"
                    + combus.getCondutor()
                    + "' WHERE ID='" + combus.getId() + "'");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
