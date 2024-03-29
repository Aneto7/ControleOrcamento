/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.formularios;

import br.com.controleorcamento.atividades.ConexaoMySQL;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rosaan
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {

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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuOrcamento = new javax.swing.JMenu();
        jMenuItemLancarExecucao = new javax.swing.JMenuItem();
        jMenuItemAnaliseOracamento = new javax.swing.JMenuItem();
        jMenuItemConsultarJustificativas = new javax.swing.JMenuItem();
        jMenuControle = new javax.swing.JMenu();
        jMenuItemCombustivel = new javax.swing.JMenuItem();
        jMenuItemInfracoes = new javax.swing.JMenuItem();
        jMenuItemManutencao = new javax.swing.JMenuItem();
        jMenuItemRevisao = new javax.swing.JMenuItem();
        jMenuCacastro = new javax.swing.JMenu();
        jMenuItemCartao = new javax.swing.JMenuItem();
        jMenuItemCondutor = new javax.swing.JMenuItem();
        jMenuItemTipoVeiculo = new javax.swing.JMenuItem();
        jMenuItemVeiculo = new javax.swing.JMenuItem();
        jMenuItemFilial = new javax.swing.JMenuItem();
        jMenuConfiguracoes = new javax.swing.JMenu();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuItemImportarOrcamento = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuLogOff = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(36, 64, 98));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/LDC_logo_V2_WHITE_362 (2).png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        jMenuOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Caro 2-16.png"))); // NOI18N
        jMenuOrcamento.setText("Análise de Orçamento");

        jMenuItemLancarExecucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Formato-16.png"))); // NOI18N
        jMenuItemLancarExecucao.setText("Lançar Justificativas");
        jMenuItemLancarExecucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLancarExecucaoActionPerformed(evt);
            }
        });
        jMenuOrcamento.add(jMenuItemLancarExecucao);

        jMenuItemAnaliseOracamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Pesquisa-16.png"))); // NOI18N
        jMenuItemAnaliseOracamento.setText("Controle de Justificativas");
        jMenuItemAnaliseOracamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAnaliseOracamentoActionPerformed(evt);
            }
        });
        jMenuOrcamento.add(jMenuItemAnaliseOracamento);

        jMenuItemConsultarJustificativas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Pesquisar-16.png"))); // NOI18N
        jMenuItemConsultarJustificativas.setText("Consultar Justificativas");
        jMenuItemConsultarJustificativas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarJustificativasActionPerformed(evt);
            }
        });
        jMenuOrcamento.add(jMenuItemConsultarJustificativas);

        jMenuBar1.add(jMenuOrcamento);

        jMenuControle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Visão da página 3-16.png"))); // NOI18N
        jMenuControle.setText("Controle");

        jMenuItemCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Posto de gasolina-16.png"))); // NOI18N
        jMenuItemCombustivel.setText("Combustível");
        jMenuItemCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCombustivelActionPerformed(evt);
            }
        });
        jMenuControle.add(jMenuItemCombustivel);

        jMenuItemInfracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Carro acidentado-16.png"))); // NOI18N
        jMenuItemInfracoes.setText("Infrações");
        jMenuItemInfracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInfracoesActionPerformed(evt);
            }
        });
        jMenuControle.add(jMenuItemInfracoes);

        jMenuItemManutencao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Manutenção-16.png"))); // NOI18N
        jMenuItemManutencao.setText("Manutenção");
        jMenuItemManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManutencaoActionPerformed(evt);
            }
        });
        jMenuControle.add(jMenuItemManutencao);

        jMenuItemRevisao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Inspeção-16.png"))); // NOI18N
        jMenuItemRevisao.setText("Revisao");
        jMenuItemRevisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRevisaoActionPerformed(evt);
            }
        });
        jMenuControle.add(jMenuItemRevisao);

        jMenuBar1.add(jMenuControle);

        jMenuCacastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Pilha-16.png"))); // NOI18N
        jMenuCacastro.setText("Cadastro");

        jMenuItemCartao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Cartão de identificação-16.png"))); // NOI18N
        jMenuItemCartao.setText("Cartão");
        jMenuItemCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCartaoActionPerformed(evt);
            }
        });
        jMenuCacastro.add(jMenuItemCartao);

        jMenuItemCondutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Motorista-16.png"))); // NOI18N
        jMenuItemCondutor.setText("Condutor");
        jMenuItemCondutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCondutorActionPerformed(evt);
            }
        });
        jMenuCacastro.add(jMenuItemCondutor);

        jMenuItemTipoVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Aluguel de carro-16.png"))); // NOI18N
        jMenuItemTipoVeiculo.setText("Tipo de Veículo");
        jMenuItemTipoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTipoVeiculoActionPerformed(evt);
            }
        });
        jMenuCacastro.add(jMenuItemTipoVeiculo);

        jMenuItemVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Sedan-16.png"))); // NOI18N
        jMenuItemVeiculo.setText("Veículo");
        jMenuItemVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVeiculoActionPerformed(evt);
            }
        });
        jMenuCacastro.add(jMenuItemVeiculo);

        jMenuItemFilial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Fábrica-16.png"))); // NOI18N
        jMenuItemFilial.setText("Filial");
        jMenuItemFilial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFilialActionPerformed(evt);
            }
        });
        jMenuCacastro.add(jMenuItemFilial);

        jMenuBar1.add(jMenuCacastro);

        jMenuConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Configurações-16.png"))); // NOI18N
        jMenuConfiguracoes.setText("Configurações");

        jMenuItemUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Grupo de usuário homem mulher-16.png"))); // NOI18N
        jMenuItemUsuarios.setText("Usuários");
        jMenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosActionPerformed(evt);
            }
        });
        jMenuConfiguracoes.add(jMenuItemUsuarios);

        jMenuItemImportarOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Adicionar banco de dados-16.png"))); // NOI18N
        jMenuItemImportarOrcamento.setText("Importar Orçamento");
        jMenuItemImportarOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemImportarOrcamentoActionPerformed(evt);
            }
        });
        jMenuConfiguracoes.add(jMenuItemImportarOrcamento);

        jMenuBar1.add(jMenuConfiguracoes);

        jMenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Informações-16.png"))); // NOI18N
        jMenuSobre.setText("Sobre");
        jMenuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSobre);

        jMenuLogOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleorcamento/imagens/icons8-Desligar-16.png"))); // NOI18N
        jMenuLogOff.setText("LogOut");
        jMenuLogOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLogOffMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuLogOff);

        setJMenuBar(jMenuBar1);

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
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemLancarExecucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLancarExecucaoActionPerformed
        AnaliseOrcamento anorc = new AnaliseOrcamento();
        anorc.setVisible(true);

    }//GEN-LAST:event_jMenuItemLancarExecucaoActionPerformed

    private void jMenuItemImportarOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemImportarOrcamentoActionPerformed
        try {
            //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //Abrindo a conexão
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            //Executa a query de seleção
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("TRUNCATE TABLE orcamentocontrole;");

            st.executeQuery("LOAD DATA LOCAL INFILE 'C:/Users/rosaan/Desktop/Base Sist/Orc1.csv' INTO TABLE orcamentocontrole FIELDS TERMINATED BY ';' LINES TERMINATED BY '\\n'");
            st.executeQuery("LOAD DATA LOCAL INFILE 'C:/Users/rosaan/Desktop/Base Sist/Orc2.csv' INTO TABLE orcamentocontrole FIELDS TERMINATED BY ';' LINES TERMINATED BY '\\n'");
            st.executeQuery("LOAD DATA LOCAL INFILE 'C:/Users/rosaan/Desktop/Base Sist/Orc3.csv' INTO TABLE orcamentocontrole FIELDS TERMINATED BY ';' LINES TERMINATED BY '\\n'");

            st.executeUpdate("INSERT INTO `orcamentocontrole` (`ID`, `ORDEM_PAC`, `ORDEM_MAG`, `ORDEM_F`, `MAGNITUDE_CONTA`, `REGIAO`, `RESPONSAVEL`, `DESCRICAO_FILIAL`, `TIPO_CONTA_`, `CONTA`, `DESCRICAO_CONTA`, `CENTRO_DE_CUSTO`, `DESCRICAO_CC`, `N_FILIAL`, `FILIAL`, `PLATAFORMA`, `SEGMENTO`, `ANAAGRI`, `CC_MAGNITUDE`, `FIMMO`, `DESCRICAO_FIMMO`, `ANA_MAG_PROD`, `MOEDA`, `REAL_JAN`, `REAL_FEV`, `REAL_MAR`, `REAL_ABR`, `REAL_MAI`, `REAL_JUN`, `REAL_JUL`, `REAL_AGO`, `REAL_SET`, `REAL_OUT`, `REAL_NOV`, `REAL_DEZ`, `REAL_ACUM`, `BDG_JAN`, `BDG_FEV`, `BDG_MAR`, `BDG_ABR`, `BDG_MAI`, `BDG_JUN`, `BDG_JUL`, `BDG_AGO`, `BDG_SET`, `BDG_OUT`, `BDG_NOV`, `BDG_DEZ`, `BDG_ACUM`, `RFC_JAN`, `RFC_FEV`, `RFC_MAR`, `RFC_ABR`, `RFC_MAI`, `RFC_JUN`, `RFC_JUL`, `RFC_AGO`, `RFC_SET`, `RFC_OUT`, `RFC_NOV`, `RFC_DEZ`, `RFC_ACUM`, `BDG_ANUAL`, `RFC_ANUAL`) VALUES (NULL, '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);");

            ConexaoMySQL.FecharConexao();
            JOptionPane.showMessageDialog(this, "Orçamento importado com sucesso");
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane i = new JOptionPane();
            i.showMessageDialog(rootPane, e);
            i.setFocusable(true);
            ConexaoMySQL.FecharConexao();
        }//Fim try
    }//GEN-LAST:event_jMenuItemImportarOrcamentoActionPerformed

    private void jMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosActionPerformed
        CadastroUsuario cadu = new CadastroUsuario();
        cadu.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuariosActionPerformed

    private void jMenuItemAnaliseOracamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAnaliseOracamentoActionPerformed
        AnaliseRegistros anreg = new AnaliseRegistros();
        anreg.setVisible(true);
    }//GEN-LAST:event_jMenuItemAnaliseOracamentoActionPerformed

    private void jMenuItemConsultarJustificativasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarJustificativasActionPerformed
        AnaliseConsulta ancon = new AnaliseConsulta();
        ancon.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultarJustificativasActionPerformed

    private void jMenuItemCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCartaoActionPerformed
        CadastroCartaoCar cadcartcar = new CadastroCartaoCar();
        cadcartcar.setVisible(true);
    }//GEN-LAST:event_jMenuItemCartaoActionPerformed

    private void jMenuItemCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCombustivelActionPerformed
        CadastroCombustivel cadcomb = new CadastroCombustivel();
        cadcomb.setVisible(true);
    }//GEN-LAST:event_jMenuItemCombustivelActionPerformed

    private void jMenuItemInfracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInfracoesActionPerformed
        CadastroInfracoes cadinfra = new CadastroInfracoes();
        cadinfra.setVisible(true);
    }//GEN-LAST:event_jMenuItemInfracoesActionPerformed

    private void jMenuItemManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManutencaoActionPerformed
        CadastroManutencao cadmanut = new CadastroManutencao();
        cadmanut.setVisible(true);
    }//GEN-LAST:event_jMenuItemManutencaoActionPerformed

    private void jMenuItemVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVeiculoActionPerformed
        CadastroVeiculo cadveic = new CadastroVeiculo();
        cadveic.setVisible(true);
    }//GEN-LAST:event_jMenuItemVeiculoActionPerformed

    private void jMenuItemCondutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCondutorActionPerformed
        CadastroCondutor cadcondu = new CadastroCondutor();
        cadcondu.setVisible(true);
    }//GEN-LAST:event_jMenuItemCondutorActionPerformed

    private void jMenuItemRevisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRevisaoActionPerformed
        CadastroRevisao cadrev = new CadastroRevisao();
        cadrev.setVisible(true);
    }//GEN-LAST:event_jMenuItemRevisaoActionPerformed

    private void jMenuItemTipoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTipoVeiculoActionPerformed
        CadastroTipoVeiculo tipo = new CadastroTipoVeiculo();
        tipo.setVisible(true);
    }//GEN-LAST:event_jMenuItemTipoVeiculoActionPerformed

    private void jMenuItemFilialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFilialActionPerformed
        CadastroFilial filial = new CadastroFilial();
        filial.setVisible(true);
    }//GEN-LAST:event_jMenuItemFilialActionPerformed

    private void jMenuLogOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLogOffMouseClicked
        dispose();
        TelaLogin log = new TelaLogin();
        log.setVisible(true);
    }//GEN-LAST:event_jMenuLogOffMouseClicked

    private void jMenuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSobreMouseClicked
        Sobre sobre = new Sobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_jMenuSobreMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaInicial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenu jMenuCacastro;
    public javax.swing.JMenu jMenuConfiguracoes;
    public javax.swing.JMenu jMenuControle;
    public javax.swing.JMenuItem jMenuItemAnaliseOracamento;
    public javax.swing.JMenuItem jMenuItemCartao;
    public javax.swing.JMenuItem jMenuItemCombustivel;
    public javax.swing.JMenuItem jMenuItemCondutor;
    public javax.swing.JMenuItem jMenuItemConsultarJustificativas;
    public javax.swing.JMenuItem jMenuItemFilial;
    public javax.swing.JMenuItem jMenuItemImportarOrcamento;
    public javax.swing.JMenuItem jMenuItemInfracoes;
    public javax.swing.JMenuItem jMenuItemLancarExecucao;
    public javax.swing.JMenuItem jMenuItemManutencao;
    public javax.swing.JMenuItem jMenuItemRevisao;
    public javax.swing.JMenuItem jMenuItemTipoVeiculo;
    public javax.swing.JMenuItem jMenuItemUsuarios;
    public javax.swing.JMenuItem jMenuItemVeiculo;
    private javax.swing.JMenu jMenuLogOff;
    public javax.swing.JMenu jMenuOrcamento;
    public javax.swing.JMenu jMenuSobre;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
