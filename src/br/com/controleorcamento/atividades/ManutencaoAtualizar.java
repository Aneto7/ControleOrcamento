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
public class ManutencaoAtualizar {

    public ManutencaoAtualizar() {
    }

    public void ManutencaoAtualizar(Manutencao manut) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("UPDATE manutencao SET PLACA='"
                    + manut.getPlaca() + "',DATA_INICIO='"
                    + manut.getDatainicio() + "',DATA_FIM='"
                    + manut.getDatafim() + "',GRUPO_MANUTENCAO='"
                    + manut.getGrupomanutencao() + "',VALOR='"
                    + manut.getValor() + "',RESPONSAVEL='"
                    + manut.getResponsavel() + "',ORCAMENTO='"
                    + manut.getOrcamento() + "',DETALHE='"
                    + manut.getDetalhe() + "',CARRO_RESERVA='"
                    + manut.isCarroreserva()
                    + "' WHERE ID='" + manut.getId() + "'");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }

}
