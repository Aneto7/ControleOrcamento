/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.atividades;

import br.com.controleorcamento.objeto.Condutor;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rosaan
 */
public class CondutorAtualizar {

    public CondutorAtualizar() {
    }

    public void CondutorAtualizar(Condutor condut) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("UPDATE condutor SET MATRICULA='"
                    + condut.getMatricula() + "',NOME='"
                    + condut.getNome() + "',CENTRO='"
                    + condut.getCentro() + "',IBUTTON='"
                    + condut.getIbutton() + "',POLL='"
                    + condut.isPoll() + "',TRAB='"
                    + condut.isTrab() + "',DESIG='"
                    + condut.isDesig() + "',EMPRESA='"
                    + condut.getEmpresa() + "',AREA='"
                    + condut.getArea() + "',CARGO='"
                    + condut.getCargo() + "',UNIDADE='"
                    + condut.getUnidade() + "',REGIONAL='"
                    + condut.getRegional() + "',DATA_ADMISSAO='"
                    + condut.getDataadminissao() + "',DATA_REALIZACAO_DEFENSIVA='"
                    + condut.getDatadefensiva() + "',N_CNH='"
                    + condut.getNcnh() + "',VENCIMENTO_CNH='"
                    + condut.getVencimentocnh() + "',CATEGORIA_CNH='"
                    + condut.getCategoriacnh() + "',FORM_31='"
                    + condut.isForm31() + "',FORM_32='"
                    + condut.isForm32() + "',GESTOR_SUB_REGIONAL='"
                    + condut.getGestorsubregional() + "',GESTOR_REGIONAL='"
                    + condut.getGestorregional() + "',GESTOR_DIVISIONAL='"
                    + condut.getGestordivisional() + "',APROVADA='"
                    + condut.isAprovado() + "',OBSERVACAO='"
                    + condut.getObservacao() + "',ATIVO='"
                    + condut.getAtivo()
                    + "' WHERE ID='" + condut.getId() + "'");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
