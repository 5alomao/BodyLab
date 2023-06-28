/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelo.Marca;
import modelo.DAOMarca;

public class FormMarca extends javax.swing.JDialog {
    DAOMarca objDAOMarca = new DAOMarca();

    /**
     * Creates new form FormCliente
     */
    public FormMarca(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        atualizaTabela();
        trataEdicao(false);  
    }
    public void atualizaTabela(){
        listMarca.clear();
        listMarca.addAll(objDAOMarca.getLista());
        int linha = listMarca.size()-1;
        if(linha >= 0){
            tblMarca.setRowSelectionInterval(linha, linha);
            tblMarca.scrollRectToVisible(tblMarca.getCellRect(linha, linha, true));
        }
    }
    
    public boolean validaCampos(){
        
        if(!(txtNomeMarca.getText().length() > 0)){
            JOptionPane.showMessageDialog(null, "Informe o Nome da Marca");
            txtNomeMarca.requestFocus();
            return false;
        }
        
        return true;
    }
    
    private void trataEdicao(boolean editando){
        btnCancelar.setEnabled(editando);
        btnSalvar.setEnabled(editando);
        btnEditar.setEnabled(!editando);
        int linha = listMarca.size() -1;
        if(linha<0){
            btnEditar.setEnabled(false);
            btnExcluir.setEnabled(false);
            txtCodigo.setText("");
            txtNomeMarca.setText("");
        } else {
          btnExcluir.setEnabled(!editando);
        }
        btnNovo.setEnabled(!editando);
        btnFechar.setEnabled(!editando);
        btnPrimeiro.setEnabled(!editando);
        btnAnterior.setEnabled(!editando);
        btnProximo.setEnabled(!editando);
        btnUltimo.setEnabled(!editando);
      
        txtNomeMarca.setEnabled(editando);    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        listMarca = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Marca>())
        ;
        pnlBackground = new javax.swing.JPanel();
        pnlAbas = new javax.swing.JTabbedPane();
        abaListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMarca = new javax.swing.JTable();
        abaDados = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        lblNomeMarca = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNomeMarca = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtCodigo = new javax.swing.JTextPane();
        pnlCima = new javax.swing.JPanel();
        lblAcademia = new javax.swing.JLabel();
        pnlNavegacao = new javax.swing.JPanel();
        btnPrimeiro = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 615));
        setPreferredSize(new java.awt.Dimension(650, 630));

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setMinimumSize(new java.awt.Dimension(650, 615));
        pnlBackground.setPreferredSize(new java.awt.Dimension(650, 615));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        abaListagem.setLayout(new java.awt.BorderLayout());

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listMarca, tblMarca);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codMarca}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomeMarca}"));
        columnBinding.setColumnName("Marca");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tblMarca);

        abaListagem.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnlAbas.addTab("Listagem", abaListagem);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovo);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir);

        lblCodigo.setText("Código");

        lblNomeMarca.setText("Nome da Marca");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblMarca, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nomeMarca}"), txtNomeMarca, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane3.setViewportView(txtNomeMarca);

        txtCodigo.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblMarca, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.codMarca}"), txtCodigo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane6.setViewportView(txtCodigo);

        javax.swing.GroupLayout abaDadosLayout = new javax.swing.GroupLayout(abaDados);
        abaDados.setLayout(abaDadosLayout);
        abaDadosLayout.setHorizontalGroup(
            abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(abaDadosLayout.createSequentialGroup()
                .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(abaDadosLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeMarca)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        abaDadosLayout.setVerticalGroup(
            abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaDadosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblNomeMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        pnlAbas.addTab("Dados", abaDados);

        pnlBackground.add(pnlAbas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 620, 420));

        pnlCima.setBackground(new java.awt.Color(31, 31, 31));

        lblAcademia.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblAcademia.setForeground(new java.awt.Color(204, 204, 204));
        lblAcademia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcademia.setText("Controle de Marcas");

        javax.swing.GroupLayout pnlCimaLayout = new javax.swing.GroupLayout(pnlCima);
        pnlCima.setLayout(pnlCimaLayout);
        pnlCimaLayout.setHorizontalGroup(
            pnlCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCimaLayout.createSequentialGroup()
                .addComponent(lblAcademia, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );
        pnlCimaLayout.setVerticalGroup(
            pnlCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCimaLayout.createSequentialGroup()
                .addComponent(lblAcademia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlBackground.add(pnlCima, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        pnlNavegacao.setBackground(new java.awt.Color(102, 102, 102));
        pnlNavegacao.setLayout(new java.awt.GridLayout(1, 0));

        btnPrimeiro.setBackground(new java.awt.Color(102, 102, 102));
        btnPrimeiro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPrimeiro.setForeground(new java.awt.Color(255, 255, 255));
        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.setBorder(null);
        btnPrimeiro.setContentAreaFilled(false);
        btnPrimeiro.setOpaque(true);
        btnPrimeiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrimeiroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrimeiroMouseExited(evt);
            }
        });
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });
        pnlNavegacao.add(btnPrimeiro);

        btnProximo.setBackground(new java.awt.Color(102, 102, 102));
        btnProximo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnProximo.setForeground(new java.awt.Color(255, 255, 255));
        btnProximo.setText("Próximo");
        btnProximo.setBorder(null);
        btnProximo.setContentAreaFilled(false);
        btnProximo.setOpaque(true);
        btnProximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProximoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProximoMouseExited(evt);
            }
        });
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });
        pnlNavegacao.add(btnProximo);

        btnAnterior.setBackground(new java.awt.Color(102, 102, 102));
        btnAnterior.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAnterior.setForeground(new java.awt.Color(255, 255, 255));
        btnAnterior.setText("Anterior");
        btnAnterior.setBorder(null);
        btnAnterior.setContentAreaFilled(false);
        btnAnterior.setOpaque(true);
        btnAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAnteriorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnteriorMouseExited(evt);
            }
        });
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        pnlNavegacao.add(btnAnterior);

        btnUltimo.setBackground(new java.awt.Color(102, 102, 102));
        btnUltimo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUltimo.setForeground(new java.awt.Color(255, 255, 255));
        btnUltimo.setText("Último");
        btnUltimo.setBorder(null);
        btnUltimo.setContentAreaFilled(false);
        btnUltimo.setOpaque(true);
        btnUltimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUltimoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUltimoMouseExited(evt);
            }
        });
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        pnlNavegacao.add(btnUltimo);

        btnFechar.setBackground(new java.awt.Color(102, 102, 102));
        btnFechar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(255, 255, 255));
        btnFechar.setText("Fechar");
        btnFechar.setContentAreaFilled(false);
        btnFechar.setOpaque(true);
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFecharMouseExited(evt);
            }
        });
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        pnlNavegacao.add(btnFechar);

        pnlBackground.add(pnlNavegacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 650, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        int opcao = JOptionPane.showOptionDialog(null, "Confirmar Exclusão", "Pergunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Sim","Não"}, "Sim");
        if(opcao == 0){
            int linhaSelecionada = tblMarca.getSelectedRow();
            Marca objMarca = listMarca.get(linhaSelecionada);
            objDAOMarca.remover(objMarca);
            atualizaTabela();
            trataEdicao(false);
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if(validaCampos()) {
            trataEdicao(false);
            int linhaSelecionada = tblMarca.getSelectedRow(); // pegar linha selecionada
            Marca objMarca  = listMarca.get(linhaSelecionada); // criar referencia para pegar o objeto que foi criado em novo
            objDAOMarca.salvar(objMarca);
            atualizaTabela();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        trataEdicao(false);
        atualizaTabela();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        trataEdicao(true);
        txtNomeMarca.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        trataEdicao(true);
        listMarca.add((Marca) new Marca()); // cria um objeto e uma linha na tabela
        int linha = listMarca.size()-1;
        tblMarca.setRowSelectionInterval(linha, linha); // seleciona a linha
        txtNomeMarca.requestFocus(); // caixa de texto nome recebe o foco
    }//GEN-LAST:event_btnNovoActionPerformed
    void setBackgroundColor(JButton btn){
        btn.setBackground(new Color(153,153,153));
    }
    
    void resetBackgroundColor(JButton btn){
        btn.setBackground(new Color(102,102,102));
    }
    private void btnPrimeiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrimeiroMouseEntered
        // TODO add your handling code here:
        setBackgroundColor(btnPrimeiro);
    }//GEN-LAST:event_btnPrimeiroMouseEntered

    private void btnPrimeiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrimeiroMouseExited
        // TODO add your handling code here:
        resetBackgroundColor(btnPrimeiro);
    }//GEN-LAST:event_btnPrimeiroMouseExited

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        // TODO add your handling code here:
        tblMarca.setRowSelectionInterval(0, 0);
        tblMarca.scrollRectToVisible(tblMarca.getCellRect(0, 0, true));
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnProximoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProximoMouseEntered
        // TODO add your handling code here:
        setBackgroundColor(btnProximo);
    }//GEN-LAST:event_btnProximoMouseEntered

    private void btnProximoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProximoMouseExited
        // TODO add your handling code here:
        resetBackgroundColor(btnProximo);
    }//GEN-LAST:event_btnProximoMouseExited

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        // TODO add your handling code here:
        int linha = tblMarca.getSelectedRow();
        if((linha+1)<=(tblMarca.getRowCount())-1){
            linha++;
        }
        tblMarca.setRowSelectionInterval(linha, linha);
        tblMarca.scrollRectToVisible(tblMarca.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnteriorMouseEntered
        // TODO add your handling code here:
        setBackgroundColor(btnAnterior);
    }//GEN-LAST:event_btnAnteriorMouseEntered

    private void btnAnteriorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnteriorMouseExited
        // TODO add your handling code here:
        resetBackgroundColor(btnAnterior);
    }//GEN-LAST:event_btnAnteriorMouseExited

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        int linha = tblMarca.getSelectedRow();
        if((linha-1) >= 0){
            linha--;
        }
        tblMarca.setRowSelectionInterval(linha, linha);
        tblMarca.scrollRectToVisible(tblMarca.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnUltimoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUltimoMouseEntered
        // TODO add your handling code here:
        setBackgroundColor(btnUltimo);
    }//GEN-LAST:event_btnUltimoMouseEntered

    private void btnUltimoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUltimoMouseExited
        // TODO add your handling code here:
        resetBackgroundColor(btnUltimo);
    }//GEN-LAST:event_btnUltimoMouseExited

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        // TODO add your handling code here:
        int linha = tblMarca.getRowCount()-1;
        tblMarca.setRowSelectionInterval(linha, linha);
        tblMarca.scrollRectToVisible(tblMarca.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseEntered
        // TODO add your handling code here:
        setBackgroundColor(btnFechar);
    }//GEN-LAST:event_btnFecharMouseEntered

    private void btnFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseExited
        // TODO add your handling code here:
        resetBackgroundColor(btnFechar);
    }//GEN-LAST:event_btnFecharMouseExited

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

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
            java.util.logging.Logger.getLogger(FormMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormMarca dialog = new FormMarca(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaDados;
    private javax.swing.JPanel abaListagem;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblAcademia;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNomeMarca;
    private java.util.List<Marca> listMarca;
    private javax.swing.JTabbedPane pnlAbas;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlCima;
    private javax.swing.JPanel pnlNavegacao;
    private javax.swing.JTable tblMarca;
    private javax.swing.JTextPane txtCodigo;
    private javax.swing.JTextPane txtNomeMarca;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
