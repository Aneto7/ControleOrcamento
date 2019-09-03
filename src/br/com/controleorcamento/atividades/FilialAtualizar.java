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
public class FilialAtualizar {

    public FilialAtualizar() {
    }

    public void FilialAtualizar(Filial filial) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("UPDATE filail SET FILIAL='"
                    + filial.getFilial()+ "',REGIAO='"
                    + filial.getRegiao()+ "',TIPO='"
                    + filial.getTipo()+ "',STATUS='"
                    + filial.getStatus()+ "',GESTOR_SUB='"
                    + filial.getGestorsub()+ "',GESTOR_RG='"
                    + filial.getGestorrg()+ "',GESTOR_DIV='"
                    + filial.getGestordiv()
                    + "' WHERE ID='" + filial.getId() + "'");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
