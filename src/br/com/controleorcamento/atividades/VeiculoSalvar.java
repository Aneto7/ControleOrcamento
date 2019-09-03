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
public class VeiculoSalvar {

    public VeiculoSalvar() {
    }

    public void VeiculoSalvar(Veiculo veic) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO `veiculos` (`ID`, `PLACA`, `LOCADOR`, `VALOR_LOCACAO`, `INICIO_CONTRATO`, `FIM_CONTRATO`, `UNIDADE`, `MODELO`, `TIPO`, `CLASSIFICACAO`, `EMPRESA`, `CC_SOJA`, `CARTAO`, `CONDUTOR`, `CC_MILHO`, `DEVOLVIDO`) VALUES (NULL, '" + veic.getPlaca() + "', '" + veic.getLocador() + "', '" + veic.getValorloc() + "', '" + veic.getIniciocont() + "', '" + veic.getFimcont() + "', '" + veic.getUnidade() + "', '" + veic.getModelo() + "', '" + veic.getTipo() + "', '" + veic.getClassificacao() + "', '" + veic.getEmpresa() + "', '" + veic.getCcsoja() + "', '" + veic.getCartao() + "', '" + veic.getCondutor() + "', '" + veic.getCcmilho() + "', '" + veic.getDevolvido() + "');");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showConfirmDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
