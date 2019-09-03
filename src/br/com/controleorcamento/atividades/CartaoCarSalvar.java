/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.atividades;

import br.com.controleorcamento.objeto.CartaoCar;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rosaan
 */
public class CartaoCarSalvar {

    public CartaoCarSalvar() {
    }

    public void CartaoCarSalvar(CartaoCar cart) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO `cartoes_ticketcar` (`ID`, `CARTAO`, `VEICULO`, `DESCRICAO`, `RESPONSAVEL`, `STATUS`, `CENTRO_DE_CUSTO`) VALUES (NULL, '" + cart.getCartao() + "', '" + cart.getVeiculo() + "', '" + cart.getDescricao() + "', '" + cart.getResponsavel() + "', '" + cart.getStatus() + "', '" + cart.getCentro_de_custo() + "');");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
