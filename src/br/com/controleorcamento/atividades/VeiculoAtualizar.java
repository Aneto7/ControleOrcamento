/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.atividades;

import br.com.controleorcamento.objeto.Veiculo;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rosaan
 */
public class VeiculoAtualizar {

    public VeiculoAtualizar() {
    }

    public void VeiculoAtualizar(Veiculo veic) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("UPDATE veiculos SET PLACA='"
                    + veic.getPlaca() + "',LOCADOR='"
                    + veic.getLocador() + "',VALOR_LOCACAO='"
                    + veic.getValorloc() + "',INICIO_CONTRATO='"
                    + veic.getIniciocont() + "',FIM_CONTRATO='"
                    + veic.getFimcont() + "',UNIDADE='"
                    + veic.getUnidade() + "',MODELO='"
                    + veic.getModelo() + "',TIPO='"
                    + veic.getTipo() + "',CLASSIFICACAO='"
                    + veic.getClassificacao() + "',EMPRESA='"
                    + veic.getEmpresa() + "',CC_SOJA='"
                    + veic.getCcsoja() + "',CARTAO='"
                    + veic.getCartao() + "',CONDUTOR='"
                    + veic.getCondutor() + "',CC_MILHO='"
                    + veic.getCcmilho() + "',DEVOLVIDO='"
                    + veic.getDevolvido()
                    + "' WHERE ID='" + veic.getId() + "'");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
