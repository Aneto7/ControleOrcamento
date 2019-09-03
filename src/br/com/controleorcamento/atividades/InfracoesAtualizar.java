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
public class InfracoesAtualizar {

    public InfracoesAtualizar() {
    }

    public void InfracoesAtualizar(Infracoes infra) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("UPDATE infracoes SET DATA='"
                    + infra.getData() + "',PLACA='"
                    + infra.getPlaca() + "',LOCADORA='"
                    + infra.getLocadora() + "',PONTOS='"
                    + infra.getPonto() + "',GRAVIDADE='"
                    + infra.getGravidade() + "',CODIGO='"
                    + infra.getCodigo() + "',DESCRICAO='"
                    + infra.getDescricao() + "',VALOR='"
                    + infra.getValor() + "',AUTO_DE_INFRACAO='"
                    + infra.getAutoinfra() + "',PRAZO_RECURSO='"
                    + infra.getPrazorecurso() + "',CONDUTOR='"
                    + infra.getCondutor() + "',N_CHAMADO='"
                    + infra.getNchamado() + "',CONDUTOR_IDENTIFICADO='"
                    + infra.getCondutoridentificado() + "',REEMBOLSO='"
                    + infra.isReembolso() + "',OBSERVACAO='"
                    + infra.getObs()
                    + "' WHERE ID='" + infra.getId() + "'");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
