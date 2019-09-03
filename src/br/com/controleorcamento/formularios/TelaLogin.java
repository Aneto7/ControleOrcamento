/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.formularios;

import br.com.controleorcamento.atividades.ConexaoMySQL;
import br.com.controleorcamento.objeto.UsuarioLogado;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rosaan
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        setIcon();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tBoxLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        senhaLogin = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lVersao = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(36, 64, 98));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(36, 64, 98));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Funcionário homem-40.png"))); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Senha-40.png"))); // NOI18N
        jLabel2.setText("Senha");

        senhaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaLoginActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Ok-16.png"))); // NOI18N
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Versão");

        lVersao.setForeground(new java.awt.Color(255, 255, 255));
        lVersao.setText("1.0.2");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/LDC_logo_V2_WHITE_362 (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 142, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(senhaLogin, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tBoxLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(139, 139, 139))))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tBoxLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addGap(79, 79, 79)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lVersao)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        acessar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void senhaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaLoginActionPerformed
        acessar();
    }//GEN-LAST:event_senhaLoginActionPerformed
    
    public void acessar() {
        if (this.tBoxLogin.getText().equals("") || this.senhaLogin.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campos login e senha são obrigatórios");
            return;
        }
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeQuery("SELECT MAX(VERSAO) AS LASTVERSAO FROM `versao`");
            ResultSet rsv = st.getResultSet();
            while (rsv.next()) {
                if (!this.lVersao.getText().equals(rsv.getString("LASTVERSAO"))) {
                    JOptionPane.showMessageDialog(null, "VERSÃO DESATUALIZADA!\n"
                            + "A versão que esta sendo utilizada por você é a " + this.lVersao.getText() + "\n"
                            + "Entre em contato para atualizar para a versão" + rsv.getString("LASTVERSAO"));
                    return;
                }
            }
            
            st.executeQuery("SELECT * FROM `usuario` WHERE `USUARIO` LIKE '"
                    + this.tBoxLogin.getText() + "' AND `SENHA` LIKE'"
                    + this.senhaLogin.getText() + "';");
            ResultSet rss = st.getResultSet();
            if (rss.first()) {
                JOptionPane.showMessageDialog(this, "Olá " + rss.getString("NOME") + " seja bem vindo(a)");
                TelaLogin fechar = new TelaLogin();
                fechar.setDefaultCloseOperation(TelaLogin.EXIT_ON_CLOSE);
                UsuarioLogado usuario = new UsuarioLogado();
                usuario.setUsuario(this.tBoxLogin.getText());
                usuario.setPerfil(rss.getString("PERFIL"));
                usuario.setArea(rss.getString("AREA"));
                
                TelaInicial tini = new TelaInicial();
                tini.setVisible(true);
                
                if ("123456".equals(rss.getString("SENHA"))) {
                    NovaSenha nsenha = new NovaSenha();
                    nsenha.setVisible(true);
                }
                
                if ("Controle de Estoque e Orcamento".equals(rss.getString("SETOR"))) {
                    tini.jMenuItemCombustivel.setVisible(false);
                    tini.jMenuItemInfracoes.setVisible(false);
                    tini.jMenuItemManutencao.setVisible(false);
                    tini.jMenuItemRevisao.setVisible(false);
                    tini.jMenuItemVeiculo.setVisible(false);
                    tini.jMenuItemTipoVeiculo.setVisible(false);
                    tini.jMenuItemCartao.setVisible(false);
                    tini.jMenuItemCondutor.setVisible(false);
                    tini.jMenuControle.setVisible(false);
                    
                    if ("Operacional".equals(rss.getString("PERFIL"))) {
                        
                        tini.jMenuItemImportarOrcamento.setVisible(false);
                        tini.jMenuItemUsuarios.setVisible(false); 
                        tini.jMenuConfiguracoes.setVisible(false); 
                        tini.jMenuCacastro.setVisible(false);
                        
                    } else if ("Administrador".equals(rss.getString("PERFIL"))) {
                        
                    } else if ("Supervisor".equals(rss.getString("PERFIL"))) {
                        tini.jMenuItemImportarOrcamento.setVisible(false);
                        tini.jMenuItemUsuarios.setVisible(false);
                    } else if ("Observador".equals(rss.getString("PERFIL"))) {
                        tini.jMenuItemImportarOrcamento.setVisible(false);
                        tini.jMenuItemUsuarios.setVisible(false);
                    }
                } else if ("Administrativo".equals(rss.getString("SETOR"))) {
                    tini.jMenuOrcamento.setVisible(false);
                    tini.jMenuItemAnaliseOracamento.setVisible(false);
                    tini.jMenuItemImportarOrcamento.setVisible(false);
                                        
                    if ("Operacional".equals(rss.getString("PERFIL"))) {
                        tini.jMenuItemUsuarios.setVisible(false);
                        tini.jMenuItemVeiculo.setVisible(false);
                        tini.jMenuItemCartao.setVisible(false);
                        tini.jMenuItemCondutor.setVisible(false);
                    } else if ("Administrador".equals(rss.getString("PERFIL"))) {
                        
                    } else if ("Supervisor".equals(rss.getString("PERFIL"))) {
                        tini.jMenuItemUsuarios.setVisible(false);
                    } else if ("Observador".equals(rss.getString("PERFIL"))) {
                        tini.jMenuItemUsuarios.setVisible(false);
                    }
                }
                dispose();
                
            } else {
                JOptionPane.showMessageDialog(null, "Login ou Senha inválidos.", "", JOptionPane.ERROR_MESSAGE);
                senhaLogin.setText("");
                tBoxLogin.requestFocus();
            }
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
            ConexaoMySQL.FecharConexao();
        }
    }
    
    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/controleorcamento/imagens/LDC_logo.png")));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lVersao;
    private javax.swing.JPasswordField senhaLogin;
    private javax.swing.JTextField tBoxLogin;
    // End of variables declaration//GEN-END:variables

}