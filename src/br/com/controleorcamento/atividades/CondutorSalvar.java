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
public class CondutorSalvar {

    public CondutorSalvar() {
    }

    public void CondutorSalvar(Condutor condut) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO `condutor` (`ID`, `MATRICULA`, `NOME`, `CENTRO`, `IBUTTON`, `POLL`, `TRAB`, `DESIG`, `EMPRESA`, `AREA`, `CARGO`, `UNIDADE`, `REGIONAL`, `DATA_ADMISSAO`, `DATA_REALIZACAO_DEFENSIVA`, `N_CNH`, `VENCIMENTO_CNH`, `CATEGORIA_CNH`, `FORM_31`, `FORM_32`, `GESTOR_SUB_REGIONAL`, `GESTOR_REGIONAL`, `GESTOR_DIVISIONAL`, `APROVADA`, `OBSERVACAO`, `ATIVO`) VALUES (NULL, '" + condut.getMatricula() + "', '" + condut.getNome() + "', '" + condut.getCentro() + "', '" + condut.getIbutton() + "', '" + condut.isPoll() + "', '" + condut.isTrab() + "', '" + condut.isDesig() + "', '" + condut.getEmpresa() + "', '" + condut.getArea() + "', '" + condut.getCargo() + "', '" + condut.getUnidade() + "', '" + condut.getRegional() + "', '" + condut.getDataadminissao() + "', '" + condut.getDatadefensiva() + "', '" + condut.getNcnh() + "', '" + condut.getVencimentocnh() + "', '" + condut.getCategoriacnh() + "', '" + condut.isForm31() + "', '" + condut.isForm32() + "', '" + condut.getGestorsubregional() + "', '" + condut.getGestorregional() + "', '" + condut.getGestordivisional() + "', '" + condut.isAprovado() + "', '" + condut.getObservacao() + "', '" + condut.getAtivo() + "');");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
