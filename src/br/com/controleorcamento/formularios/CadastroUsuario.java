/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.formularios;

import br.com.controleorcamento.atividades.ConexaoMySQL;
import br.com.controleorcamento.atividades.UsuarioAtualizar;
import br.com.controleorcamento.atividades.UsuarioExcluir;
import br.com.controleorcamento.atividades.UsuarioSalvar;
import br.com.controleorcamento.objeto.Usuario;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author rosaan
 */
public class CadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroUsuario
     */
    public CadastroUsuario() {
        initComponents();
        carregarRegiao();
        carregarFilial();
        carregarArea();
        filtrar();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tBoxNome = new javax.swing.JTextField();
        tBoxEmail = new javax.swing.JTextField();
        cBoxFilial = new javax.swing.JComboBox<>();
        tBoxUsuario = new javax.swing.JTextField();
        cBoxPerfil = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cBoxRegiao = new javax.swing.JComboBox<>();
        senhaLogin = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        bSalvar = new javax.swing.JButton();
        bAtualizar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        bFiltrar = new javax.swing.JButton();
        lID = new javax.swing.JLabel();
        bAtualizarSenha = new javax.swing.JButton();
        cBoxSetor = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        bLimpar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cBoxArea = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Funcionário homem-16.png"))); // NOI18N
        jLabel1.setText("Cadastro de Usuário");

        jLabel2.setText("Nome");

        jLabel3.setText("E-mail");

        jLabel4.setText("Filial");

        jLabel5.setText("Usuario");

        jLabel6.setText("Perfil");

        jLabel7.setText("Senha");

        cBoxFilial.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cBoxFilialPopupMenuWillBecomeVisible(evt);
            }
        });

        cBoxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Operacional", "Administrador", "Supervisor", "Observador" }));

        jLabel8.setText("Região");

        cBoxRegiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxRegiaoActionPerformed(evt);
            }
        });

        senhaLogin.setText("123456");

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "E-mail", "Região", "Filial", "Usuário", "Perfil", "Setor", "Áea"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsuario);
        if (tabelaUsuario.getColumnModel().getColumnCount() > 0) {
            tabelaUsuario.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        bSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Salvar-16.png"))); // NOI18N
        bSalvar.setText("Salvar");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });

        bAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Atualizações disponíveis-16.png"))); // NOI18N
        bAtualizar.setText("Atualizar");
        bAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarActionPerformed(evt);
            }
        });

        bExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Excluir-16.png"))); // NOI18N
        bExcluir.setText("Excluir");
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        bFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Filtro-16.png"))); // NOI18N
        bFiltrar.setText("Filtrar");
        bFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFiltrarActionPerformed(evt);
            }
        });

        bAtualizarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Senha-16.png"))); // NOI18N
        bAtualizarSenha.setText("Atualizar Senha");
        bAtualizarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarSenhaActionPerformed(evt);
            }
        });

        cBoxSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Controle de Estoque e Orcamento", "Administrativo" }));

        jLabel9.setText("Setor");

        bLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Vassoura-16.png"))); // NOI18N
        bLimpar.setText("Limpar");
        bLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparActionPerformed(evt);
            }
        });

        jLabel10.setText("Área");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cBoxArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tBoxUsuario)
                            .addComponent(cBoxSetor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cBoxRegiao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tBoxNome))
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cBoxFilial, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tBoxEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cBoxPerfil, javax.swing.GroupLayout.Alignment.TRAILING, 0, 230, Short.MAX_VALUE)
                                    .addComponent(senhaLogin)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAtualizarSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(552, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(lID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tBoxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tBoxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cBoxRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBoxFilial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cBoxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(cBoxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tBoxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bFiltrar)
                    .addComponent(bAtualizar)
                    .addComponent(bAtualizarSenha)
                    .addComponent(bExcluir)
                    .addComponent(bSalvar)
                    .addComponent(bLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cBoxFilialPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cBoxFilialPopupMenuWillBecomeVisible
        carregarFilial();
    }//GEN-LAST:event_cBoxFilialPopupMenuWillBecomeVisible

    private void tabelaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuarioMouseClicked
        if (tabelaUsuario.getSelectedRow() != -1) {
            lID.setText(tabelaUsuario.getValueAt(tabelaUsuario.getSelectedRow(), 0).toString());
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = ConexaoMySQL.getConexaoMySQL();
                java.sql.Statement st = conn.createStatement();
                st.executeQuery("SELECT * FROM `usuario` WHERE `ID` = " + this.lID.getText());
                ResultSet rs = st.getResultSet();
                
                while (rs.next()) {
                    this.tBoxNome.setText(rs.getString("NOME"));
                    this.tBoxEmail.setText(rs.getString("EMAIL"));
                    this.cBoxRegiao.setSelectedItem(rs.getString("REGIAO"));
                    this.cBoxFilial.setSelectedItem(rs.getString("FILIAL"));
                    this.tBoxUsuario.setText(rs.getString("USUARIO"));
                    this.cBoxPerfil.setSelectedItem(rs.getString("PERFIL"));
                    this.cBoxSetor.setSelectedItem(rs.getString("SETOR"));
                    this.cBoxArea.setSelectedItem(rs.getString("AREA"));
                }
                ConexaoMySQL.FecharConexao();
                
            } catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e);
                ConexaoMySQL.FecharConexao();
            }
        }
    }//GEN-LAST:event_tabelaUsuarioMouseClicked

    private void bFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFiltrarActionPerformed
        filtrar();
    }//GEN-LAST:event_bFiltrarActionPerformed

    private void bAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarActionPerformed
        
        Usuario user = new Usuario();
        UsuarioAtualizar uat = new UsuarioAtualizar();
        
        user.setIdusuario(Integer.parseInt(lID.getText()));
        user.setUsuario(tBoxUsuario.getText());
        user.setFilial((String) cBoxFilial.getSelectedItem());
        user.setRegiao((String) cBoxRegiao.getSelectedItem());
        user.setPerfil((String) cBoxPerfil.getSelectedItem());
        user.setEmail((String) tBoxEmail.getText());
        user.setNome((String) tBoxNome.getText());
        user.setSetor((String) cBoxSetor.getSelectedItem());
        user.setArea((String) cBoxArea.getSelectedItem());
        
        uat.UsuarioAtualizar(user);
        limpar();
        filtrar();
        JOptionPane.showMessageDialog(this, "Usuário atualizado com sucesso");
    }//GEN-LAST:event_bAtualizarActionPerformed

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeQuery("SELECT USUARIO FROM `usuario` WHERE `USUARIO` LIKE '"
                    + this.tBoxUsuario.getText() + "' AND `SETOR` LIKE '"
                    + this.cBoxSetor.getSelectedItem() + "'");
            ResultSet rs = st.getResultSet();
            if (rs.first()) {
                JOptionPane.showMessageDialog(this, "Usuário já cadastrado");
                return;
            }
            Usuario user = new Usuario();
            UsuarioSalvar usalv = new UsuarioSalvar();
            
            user.setNome(tBoxNome.getText());
            user.setEmail(tBoxEmail.getText());
            user.setRegiao((String) cBoxRegiao.getSelectedItem());
            user.setFilial((String) cBoxFilial.getSelectedItem());
            user.setUsuario(tBoxUsuario.getText());
            user.setPerfil((String) cBoxPerfil.getSelectedItem());
            user.setSenha("123456");
            user.setSetor((String) cBoxSetor.getSelectedItem());
            user.setArea((String) cBoxArea.getSelectedItem());
            
            usalv.UsuarioSalvar(user);
            limpar();
            filtrar();
            JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso");
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
            ConexaoMySQL.FecharConexao();
        }
        

    }//GEN-LAST:event_bSalvarActionPerformed

    private void cBoxRegiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxRegiaoActionPerformed
        this.cBoxFilial.addItem("");
        this.cBoxFilial.setSelectedItem("");
    }//GEN-LAST:event_cBoxRegiaoActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        if (lID.getText() == "") {
            JOptionPane.showMessageDialog(this, "Selecione um usuário clicando na tabela");
            return;
        }
        Usuario user = new Usuario();
        UsuarioExcluir uexc = new UsuarioExcluir();
        
        user.setIdusuario(Integer.parseInt(lID.getText()));
        
        uexc.UsuarioExcluir(user);
        limpar();
        filtrar();
        JOptionPane.showMessageDialog(this, "Usuário excluído com sucesso");
    }//GEN-LAST:event_bExcluirActionPerformed

    private void bAtualizarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarSenhaActionPerformed
        Usuario user = new Usuario();
        UsuarioAtualizar uat = new UsuarioAtualizar();
        
        user.setIdusuario(Integer.parseInt(lID.getText()));
        user.setUsuario(tBoxUsuario.getText());
        user.setFilial((String) cBoxFilial.getSelectedItem());
        user.setRegiao((String) cBoxRegiao.getSelectedItem());
        user.setPerfil((String) cBoxPerfil.getSelectedItem());
        user.setEmail((String) tBoxEmail.getText());
        user.setNome((String) tBoxNome.getText());
        user.setSenha((String) senhaLogin.getText());
        user.setSetor((String) cBoxSetor.getSelectedItem());
        user.setArea((String) cBoxArea.getSelectedItem());
        
        uat.UsuarioAtualizarSenha(user);
        limpar();
        filtrar();
        JOptionPane.showMessageDialog(this, "Usuário atualizado com sucesso");
    }//GEN-LAST:event_bAtualizarSenhaActionPerformed

    private void bLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparActionPerformed
        limpar();
        filtrar();
    }//GEN-LAST:event_bLimparActionPerformed

    /**
     * @param args the command line arguments
     */
    public void filtrar() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaUsuario.getModel();
        tabelaUsuario.setRowSorter(new TableRowSorter(modelo));
        modelo.setNumRows(0);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeQuery("SELECT * FROM `usuario` WHERE `USUARIO` LIKE '%"
                    + this.tBoxUsuario.getText() + "%' AND `FILIAL` LIKE '%"
                    + this.cBoxFilial.getSelectedItem() + "%' AND `REGIAO` LIKE '%"
                    + this.cBoxRegiao.getSelectedItem() + "%' AND `PERFIL` LIKE '%"
                    + this.cBoxPerfil.getSelectedItem() + "%' AND `EMAIL` LIKE '%"
                    + this.tBoxEmail.getText() + "%' AND `NOME` LIKE '%"
                    + this.tBoxNome.getText() + "%' AND `SETOR` LIKE '%"
                    + this.cBoxSetor.getSelectedItem() + "%' AND `AREA`LIKE '%"
                    + this.cBoxArea.getSelectedItem() + "%' ORDER BY `REGIAO`, `FILIAL`, `ID`, `USUARIO`");
            ResultSet rs = st.getResultSet();
            
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString("ID"),
                    rs.getString("NOME"),
                    rs.getString("EMAIL"),
                    rs.getString("REGIAO"),
                    rs.getString("FILIAL"),
                    rs.getString("USUARIO"),
                    rs.getString("PERFIL"),
                    rs.getString("SETOR"),
                    rs.getString("AREA")});
            }
            ConexaoMySQL.FecharConexao();
            
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
            ConexaoMySQL.FecharConexao();
        }
    }
    
       
    public void carregarRegiao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeQuery("SELECT DISTINCT REGIAO FROM `orcamentocontrole` ORDER BY REGIAO");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                cBoxRegiao.addItem(rs.getString("REGIAO"));
            }
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
            ConexaoMySQL.FecharConexao();
        }
    }
    
    public void carregarFilial() {
        this.cBoxFilial.removeAllItems();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeQuery("SELECT DISTINCT DESCRICAO_FILIAL FROM `orcamentocontrole` WHERE `REGIAO` LIKE '%"
                    + this.cBoxRegiao.getSelectedItem() + "' ORDER BY DESCRICAO_FILIAL");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                cBoxFilial.addItem(rs.getString("DESCRICAO_FILIAL"));
            }
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
            ConexaoMySQL.FecharConexao();
        }
    }
    
    public void carregarArea() {
        this.cBoxArea.removeAllItems();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            java.sql.Statement st = conn.createStatement();
            st.executeQuery("SELECT DISTINCT RESPONSAVEL FROM `orcamentocontrole` ORDER BY RESPONSAVEL");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                cBoxArea.addItem(rs.getString("RESPONSAVEL"));
            }
            ConexaoMySQL.FecharConexao();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
            ConexaoMySQL.FecharConexao();
        }
    }
    
    public void limpar() {
        this.tBoxNome.setText("");
        this.tBoxEmail.setText("");
        this.cBoxRegiao.setSelectedItem("");
        this.cBoxFilial.setSelectedItem("");
        this.tBoxUsuario.setText("");
        this.cBoxPerfil.setSelectedItem("");
        this.senhaLogin.setText("");
        this.cBoxSetor.setSelectedItem("");
        this.cBoxSetor.setSelectedItem("");
        this.cBoxArea.setSelectedItem("");
        
    }
    
    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/controleorcamento/imagens/LDC_logo.png")));
    }
    
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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizar;
    private javax.swing.JButton bAtualizarSenha;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bFiltrar;
    private javax.swing.JButton bLimpar;
    private javax.swing.JButton bSalvar;
    private javax.swing.JComboBox<Object> cBoxArea;
    private javax.swing.JComboBox<Object> cBoxFilial;
    private javax.swing.JComboBox<Object> cBoxPerfil;
    private javax.swing.JComboBox<String> cBoxRegiao;
    private javax.swing.JComboBox<String> cBoxSetor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lID;
    private javax.swing.JPasswordField senhaLogin;
    private javax.swing.JTextField tBoxEmail;
    private javax.swing.JTextField tBoxNome;
    private javax.swing.JTextField tBoxUsuario;
    private javax.swing.JTable tabelaUsuario;
    // End of variables declaration//GEN-END:variables
}
