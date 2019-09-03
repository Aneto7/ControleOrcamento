/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.atividades;

import br.com.controleorcamento.objeto.Analise;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rosaan
 */
public class AnaliseSalvar {

    public AnaliseSalvar() {
    }

    public void AnaliseSalvar(Analise analise) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO `analiseorcamento` (`ID`, `MAGNITUDE_CONTA`, `REGIAO`, `DESCRICAO_FILIAL`, `CONTA`, `DESCRICAO_CONTA`, `CENTRO_DE_CUSTO`, `DESCRICAO_CC`, `PLATAFORMA`, `MES`, `BORR`, `REALIZADO`, `BDG`, `REAL_ACUM`, `BDG_ACUM`, `ANALISE`, `USUARIO`, `DATA`, `RESPONSAVEL`, `SITUACAO`, `TIPOJUS`, `AREA`) VALUES (NULL, '" + analise.getMagnitude() + "', '" + analise.getRegiao() + "', '" + analise.getFilial() + "', '" + analise.getConta() + "', '" + analise.getDescconta() + "', '" + analise.getCentrocusto() + "', '" + analise.getDesccentrocusto() + "', '" + analise.getPlataforma() + "', '" + analise.getMes() + "', '" + analise.getBorr() + "', '" + analise.getRealmes() + "', '" + analise.getBdgmes() + "', '" + analise.getRealacum() + "', '" + analise.getBdgacum() + "', '" + analise.getAnalise() + "', '" + analise.getUser() + "', '" + analise.getDatareg() + "', '" + analise.getResponsavel() + "', '" + analise.getSituacao() + "', '" + analise.getTipoanalise() + "', '" + analise.getArea() + "');");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
