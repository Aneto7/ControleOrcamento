/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.atividades;

import br.com.controleorcamento.objeto.Manutencao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rosaan
 */
public class ManutencaoSalvar {

    public ManutencaoSalvar() {
    }

    public void ManutencaoSalvar(Manutencao manut) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO `manutencao` (`ID`, `PLACA`, `DATA_INICIO`, `DATA_FIM`, `GRUPO_MANUTENCAO`, `VALOR`, `RESPONSAVEL`, `ORCAMENTO`, `DETALHE`, `CARRO_RESERVA`) VALUES (NULL, '" + manut.getPlaca() + "', '" + manut.getDatainicio() + "', '" + manut.getDatafim() + "', '" + manut.getGrupomanutencao() + "', '" + manut.getValor() + "', '" + manut.getResponsavel() + "', '" + manut.getOrcamento() + "', '" + manut.getDetalhe() + "', '" + manut.isCarroreserva() + "');");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
