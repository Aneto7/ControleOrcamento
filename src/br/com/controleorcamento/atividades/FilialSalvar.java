/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.atividades;

import br.com.controleorcamento.objeto.Filial;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rosaan
 */
public class FilialSalvar {

    public FilialSalvar() {
    }

    public void FilialSalvar(Filial filial) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO `filial` (`ID`, `FILIAL`, `REGIAO`, `TIPO`, `STATUS`, `GESTOR_SUB`, `GESTOR_RG`, `GESTOR_DIV`) VALUES (NULL, '" + filial.getFilial()+ "', '" + filial.getRegiao()+ "', '" + filial.getTipo()+ "', '" + filial.getStatus()+ "', '" + filial.getGestorsub()+ "', '" + filial.getGestorrg()+ "', '" + filial.getGestordiv()+ "');");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showConfirmDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
