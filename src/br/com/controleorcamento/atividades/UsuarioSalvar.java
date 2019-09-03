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
public class UsuarioSalvar {

    public UsuarioSalvar() {
    }

    public void UsuarioSalvar(Usuario user) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO `usuario` (`ID`, `USUARIO`, `FILIAL`, `REGIAO`, `SENHA`,`PERFIL`, `EMAIL`, `NOME`, `SETOR`, `AREA`) VALUES (NULL, '" + user.getUsuario() + "', '" + user.getFilial() + "', '" + user.getRegiao() + "', '" + user.getSenha() + "', '" + user.getPerfil() + "', '" + user.getEmail() + "', '" + user.getNome() + "', '" + user.getSetor() + "', '" + user.getArea() + "');");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showConfirmDialog(null, e);
            ConexaoMySQL.FecharConexao();
        }
    }
}
