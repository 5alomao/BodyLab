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
import modelo.Cargo;
import modelo.DAOCargo;

public class FormCargo extends javax.swing.JDialog {
    DAOCargo objDAOCargo = new DAOCargo();

    /**
     * Creates new form FormCliente
     */
    public FormCargo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        atualizaTabela();
        trataEdicao(false);  
    }
    public void atualizaTabela(){
        listCargo.clear();
        listCargo.addAll(objDAOCargo.getLista());
        int linha = listCargo.size()-1;
        if(linha >= 0){
            tblCargo.setRowSelectionInterval(linha, linha);
            tblCargo.scrollRectToVisible(tblCargo.getCellRect(linha, linha, true));
        }
    }
    
    public boolean validaCampos(){
        
        if(!(txtNomeCargo.getText().length() > 0)){
            JOptionPane.showMessageDialog(null, "Informe o Nome da Categoria");
            txtNomeCargo.requestFocus();
            return false;
        }
        
        if(!(txtSalario.getText().length() > 0)){
            JOptionPane.showMessageDialog(null, "Informe o valor do salário");
            txtSalario.requestFocus();
            return false;
        }
        
        if(txtSalario.getText().length() > 0){
            try{
                Double.parseDouble(txtSalario.getText());
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Informe somente números !");
                txtSalario.requestFocus();
                return false;
            }
        }
        
        if(!(Double.parseDouble(txtSalario.getText()) > 0)){
            JOptionPane.showMessageDialog(null, "Informe um valor válido !");
            txtSalario.requestFocus();
            return false;
        }
        
        return true;
    }
    
    private void trataEdicao(boolean editando){
        btnCancelar.setEnabled(editando);
        btnSalvar.setEnabled(editando);
        btnEditar.setEnabled(!editando);
        int linha = listCargo.size() -1;
        if(linha<0){
            btnEditar.setEnabled(false);
            btnExcluir.setEnabled(false);
            txtCodigo.setText("");
            txtNomeCargo.setText("");
            txtSalario.setText("");
        } else {
          btnExcluir.setEnabled(!editando);
        }
        btnNovo.setEnabled(!editando);
        btnFechar.setEnabled(!editando);
        btnPrimeiro.setEnabled(!editando);
        btnAnterior.setEnabled(!editando);
        btnProximo.setEnabled(!editando);
        btnUltimo.setEnabled(!editando);
        
        txtNomeCargo.setEnabled(editando);   
        txtSalario.setEnabled(editando);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        listCargo = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Cargo>())
        ;
        jPanel2 = new javax.swing.JPanel();
        pnlAbas = new javax.swing.JTabbedPane();
        abaListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCargo = new javax.swing.JTable();
        abaDados = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        lblNomeCargo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNomeCargo = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtCodigo = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtSalario = new javax.swing.JTextPane();
        lblSalarioCargo = new javax.swing.JLabel();
        pnlCima = new javax.swing.JPanel();
        lblAcademia = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnPrimeiro = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Cliente");
        setMinimumSize(new java.awt.Dimension(650, 615));
        setPreferredSize(new java.awt.Dimension(630, 605));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(650, 605));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        abaListagem.setLayout(new java.awt.BorderLayout());

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listCargo, tblCargo);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codCargo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Cargo");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${salario}"));
        columnBinding.setColumnName("Salario");
        columnBinding.setColumnClass(Double.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tblCargo);

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

        lblNomeCargo.setText("Nome da Cargo");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCargo, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), txtNomeCargo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane3.setViewportView(txtNomeCargo);

        txtCodigo.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCargo, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.codCargo}"), txtCodigo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane6.setViewportView(txtCodigo);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCargo, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.salario}"), txtSalario, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane4.setViewportView(txtSalario);

        lblSalarioCargo.setText("Salario");

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
                            .addComponent(lblSalarioCargo)
                            .addComponent(lblNomeCargo)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addComponent(lblNomeCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSalarioCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pnlAbas.addTab("Dados", abaDados);

        jPanel2.add(pnlAbas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 620, 410));

        pnlCima.setBackground(new java.awt.Color(31, 31, 31));

        lblAcademia.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblAcademia.setForeground(new java.awt.Color(204, 204, 204));
        lblAcademia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcademia.setText("Controle de Cargos");

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

        jPanel2.add(pnlCima, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new java.awt.GridLayout());

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
        jPanel3.add(btnPrimeiro);

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
        jPanel3.add(btnProximo);

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
        jPanel3.add(btnAnterior);

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
        jPanel3.add(btnUltimo);

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
        jPanel3.add(btnFechar);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 650, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        // TODO add your handling code here:
        tblCargo.setRowSelectionInterval(0, 0);
        tblCargo.scrollRectToVisible(tblCargo.getCellRect(0, 0, true));
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        // TODO add your handling code here:
        int linha = tblCargo.getSelectedRow();
        if((linha+1)<=(tblCargo.getRowCount())-1){
            linha++;
        }
        tblCargo.setRowSelectionInterval(linha, linha);
        tblCargo.scrollRectToVisible(tblCargo.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        int linha = tblCargo.getSelectedRow();
        if((linha-1) >= 0){
            linha--;
        }
        tblCargo.setRowSelectionInterval(linha, linha);
        tblCargo.scrollRectToVisible(tblCargo.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        // TODO add your handling code here:
        int linha = tblCargo.getRowCount()-1;
        tblCargo.setRowSelectionInterval(linha, linha);
        tblCargo.scrollRectToVisible(tblCargo.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        int opcao = JOptionPane.showOptionDialog(null, "Confirmar Exclusão", "Pergunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Sim","Não"}, "Sim");
        if(opcao == 0){
            int linhaSelecionada = tblCargo.getSelectedRow();
            Cargo objCargo = listCargo.get(linhaSelecionada);
            objDAOCargo.remover(objCargo);
            atualizaTabela();
            trataEdicao(false);
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if(validaCampos()) {
            trataEdicao(false);
            int linhaSelecionada = tblCargo.getSelectedRow(); // pegar linha selecionada
            Cargo objCargo  = listCargo.get(linhaSelecionada); // criar referencia para pegar o objeto que foi criado em novo
            objDAOCargo.salvar(objCargo);
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
        txtNomeCargo.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        trataEdicao(true);
        listCargo.add((Cargo) new Cargo()); // cria um objeto e uma linha na tabela
        int linha = listCargo.size()-1;
        tblCargo.setRowSelectionInterval(linha, linha); // seleciona a linha
        txtNomeCargo.requestFocus(); // caixa de texto nome recebe o foco
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

    private void btnProximoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProximoMouseEntered
        // TODO add your handling code here:
        setBackgroundColor(btnProximo);
    }//GEN-LAST:event_btnProximoMouseEntered

    private void btnProximoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProximoMouseExited
        // TODO add your handling code here:
        resetBackgroundColor(btnProximo);
    }//GEN-LAST:event_btnProximoMouseExited

    private void btnAnteriorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnteriorMouseEntered
        // TODO add your handling code here:
        setBackgroundColor(btnAnterior);
    }//GEN-LAST:event_btnAnteriorMouseEntered

    private void btnAnteriorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnteriorMouseExited
        // TODO add your handling code here:
        resetBackgroundColor(btnAnterior);
    }//GEN-LAST:event_btnAnteriorMouseExited

    private void btnUltimoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUltimoMouseEntered
        // TODO add your handling code here:
        setBackgroundColor(btnUltimo);
    }//GEN-LAST:event_btnUltimoMouseEntered

    private void btnUltimoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUltimoMouseExited
        // TODO add your handling code here:
        resetBackgroundColor(btnUltimo);
    }//GEN-LAST:event_btnUltimoMouseExited

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseEntered
        // TODO add your handling code here:
        setBackgroundColor(btnFechar);
    }//GEN-LAST:event_btnFecharMouseEntered

    private void btnFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseExited
        // TODO add your handling code here:
        resetBackgroundColor(btnFechar);
    }//GEN-LAST:event_btnFecharMouseExited

    
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
            java.util.logging.Logger.getLogger(FormCargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormCargo dialog = new FormCargo(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblAcademia;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNomeCargo;
    private javax.swing.JLabel lblSalarioCargo;
    private java.util.List<Cargo> listCargo;
    private javax.swing.JTabbedPane pnlAbas;
    private javax.swing.JPanel pnlCima;
    private javax.swing.JTable tblCargo;
    private javax.swing.JTextPane txtCodigo;
    private javax.swing.JTextPane txtNomeCargo;
    private javax.swing.JTextPane txtSalario;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
