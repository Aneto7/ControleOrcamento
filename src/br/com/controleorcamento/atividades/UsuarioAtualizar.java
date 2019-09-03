/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.atividades;

import br.com.controleorcamento.objeto.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rosaan
 */
public class UsuarioAtualizar {

    public UsuarioAtualizar() {
    }

    public void UsuarioAtualizar(Usuario user) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("UPDATE usuario SET USUARIO='"
                    + user.getUsuario() + "',FILIAL='"
                    + user.getFilial() + "',REGIAO='"
                    + user.getRegiao() + "',PERFIL='"
                    + user.getPerfil() + "',EMAIL='"
                    + user.getEmail() + "',NOME='"
                    + user.getNome() + "',SETOR='"
                    + user.getSetor() + "',AREA='"
                    + user.getArea()
                    + "' WHERE ID='" + user.getIdusuario() + "'");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }

    public void UsuarioAtualizarSenha(Usuario user) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("UPDATE usuario SET SENHA='"
                    + user.getSenha() + "' WHERE ID='" + user.getIdusuario() + "'");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showConfirmDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
