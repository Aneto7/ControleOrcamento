/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.atividades;

import br.com.controleorcamento.objeto.Infracoes;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rosaan
 */
public class InfracoesSalvar {

    public InfracoesSalvar() {
    }

    public void InfracoesSalvar(Infracoes infra) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO `infracoes` (`ID`, `DATA`, `PLACA`, `LOCADORA`, `PONTOS`, `GRAVIDADE`, `CODIGO`, `DESCRICAO`, `VALOR`, `AUTO_DE_INFRACAO`, `PRAZO_RECURSO`, `CONDUTOR`, `N_CHAMADO`, `CONDUTOR_IDENTIFICADO`, `REEMBOLSO`, `OBSERVACAO`) VALUES (NULL, '" + infra.getData() + "', '" + infra.getPlaca() + "', '" + infra.getLocadora() + "', '" + infra.getPonto() + "', '" + infra.getGravidade() + "', '" + infra.getCodigo() + "', '" + infra.getDescricao() + "', '" + infra.getValor() + "', '" + infra.getAutoinfra() + "', '" + infra.getPrazorecurso() + "', '" + infra.getCondutor() + "', '" + infra.getNchamado() + "', '" + infra.getCondutoridentificado() + "', '" + infra.isReembolso() + "', '" + infra.getObs() + "');");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
