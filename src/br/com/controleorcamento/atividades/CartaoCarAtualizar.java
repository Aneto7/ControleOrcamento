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
public class CartaoCarAtualizar {

    public CartaoCarAtualizar() {
    }

    public void CartaoCarAtualizar(CartaoCar cart) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("UPDATE cartoes_ticketcar SET CARTAO='"
                    + cart.getCartao() + "',VEICULO='"
                    + cart.getVeiculo() + "',DESCRICAO='"
                    + cart.getDescricao() + "',RESPONSAVEL='"
                    + cart.getResponsavel() + "',STATUS='"
                    + cart.getStatus() + "',CENTRO_DE_CUSTO='"
                    + cart.getCentro_de_custo()
                    + "' WHERE ID='" + cart.getId() + "'");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
