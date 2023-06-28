/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.ConverteDataWEB;
import modelo.DAOCliente;
import modelo.DAOItemVenda;
import modelo.DAOProduto;
import modelo.DAOVenda;
import modelo.Produto;
import modelo.ItemVenda;
import modelo.Venda;

/**
 *
 * @author tulio
 */
public class FormVenda extends javax.swing.JDialog {

    DAOProduto objDAOProduto = new DAOProduto();
    DAOCliente objDAOCliente = new DAOCliente();
    DAOVenda objDAOVenda = new DAOVenda();
    Venda objVenda = new Venda();
    ItemVenda objItemVenda = new ItemVenda();
    DAOItemVenda objDAOItemVenda = new DAOItemVenda();
    ConverteDataWEB data = new ConverteDataWEB();
    String dataAtual = data.dataAtual();
    int ultimoCodVenda = 0;

    /**
     * Creates new form FormVenda
     */
    public FormVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtData.setText(dataAtual);
        listProduto.clear();
        listProduto.addAll(objDAOProduto.getLista());

        listCliente.clear();
        listCliente.addAll(objDAOCliente.getLista());

        trataEdicao(false);
    }

    private void trataEdicao(boolean editando) {
        btnFinalizar.setEnabled(editando);
        btnCancelar.setEnabled(editando);
        jListProduto.setEnabled(editando);
        jListProdutoVendido.setEnabled(editando);
        txtQuantidade.setEnabled(editando);
        btnVender.setEnabled(editando);
        btnRemove.setEnabled(editando);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        listCliente = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList <Cliente>());
        listProduto = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList <Produto>());
        listItemVenda = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList <ItemVenda>());
        jPanel1 = new javax.swing.JPanel();
        pnlBackground = new javax.swing.JPanel();
        lblPagamento = new javax.swing.JLabel();
        cbxCliente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProduto = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListProdutoVendido = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnVender = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        pnlCima = new javax.swing.JPanel();
        lblAcademia = new javax.swing.JLabel();
        cbxPagamento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1070, 615));
        setPreferredSize(new java.awt.Dimension(1070, 615));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setMinimumSize(new java.awt.Dimension(1070, 615));
        pnlBackground.setPreferredSize(new java.awt.Dimension(1070, 615));

        lblPagamento.setText("Forma de Pagamento");

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listCliente, cbxCliente);
        bindingGroup.addBinding(jComboBoxBinding);

        jLabel2.setText("Cliente");

        jLabel4.setText("Data");

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JListBinding jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listProduto, jListProduto);
        bindingGroup.addBinding(jListBinding);

        jScrollPane1.setViewportView(jListProduto);

        jLabel5.setText("Lista de Produtos: ");

        jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listItemVenda, jListProdutoVendido);
        bindingGroup.addBinding(jListBinding);

        jScrollPane2.setViewportView(jListProdutoVendido);

        jLabel6.setText("Produtos Vendidos:");

        txtQuantidade.setText("1");

        jLabel3.setText("Quantidade:");

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnRemove.setText("Remover");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        pnlCima.setBackground(new java.awt.Color(31, 31, 31));

        lblAcademia.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblAcademia.setForeground(new java.awt.Color(204, 204, 204));
        lblAcademia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcademia.setText("Controle de Vendas");

        javax.swing.GroupLayout pnlCimaLayout = new javax.swing.GroupLayout(pnlCima);
        pnlCima.setLayout(pnlCimaLayout);
        pnlCimaLayout.setHorizontalGroup(
            pnlCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCimaLayout.createSequentialGroup()
                .addComponent(lblAcademia, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlCimaLayout.setVerticalGroup(
            pnlCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCimaLayout.createSequentialGroup()
                .addComponent(lblAcademia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        cbxPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pix", "Cartão de Crédito", "Cartão de Débito", "Dinheiro" }));

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120)
                        .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(162, 162, 162)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 32, Short.MAX_VALUE))
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addComponent(pnlCima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addComponent(pnlCima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblPagamento))
                .addGap(6, 6, 6)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(9, 9, 9)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrar)
                            .addComponent(btnCancelar))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVender)
                    .addComponent(btnRemove)
                    .addComponent(btnFinalizar)))
        );

        jPanel1.add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1085, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        if (!(jListProdutoVendido.getSelectedIndex() >= 0)) {
            JOptionPane.showMessageDialog(null, "Selecione um item para ser removido");
            jListProdutoVendido.requestFocus();

        } else {
            int linhaSelecionada = jListProdutoVendido.getSelectedIndex();
            objItemVenda = listItemVenda.get(linhaSelecionada);
            objItemVenda.setCodItemVenda(objItemVenda.getCodItemVenda());
            objDAOItemVenda.remover(objItemVenda);
            listItemVenda.clear();
            listItemVenda.addAll(objDAOItemVenda.getListaItensVenda(ultimoCodVenda));
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
        //  if (!(jListProdutoVendido.getVisibleRowCount() >= 0)) {
            //       JOptionPane.showMessageDialog(null, "Não é possível finalizar a venda sem vender um produto");
            //  } else {

            trataEdicao(false);
            listItemVenda.clear();
            listItemVenda.addAll(objDAOItemVenda.getListaItensVenda(0));

            //   }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        // if (validaCampos()) {
            trataEdicao(true);
            int linhaSelecionada = cbxCliente.getSelectedIndex();
            Cliente objCliente = listCliente.get(linhaSelecionada);
            objVenda.setCliente(objCliente);
            objVenda.setDataVenda(data.converteCalendario(dataAtual));
            objVenda.setFormaPagamento(cbxPagamento.getItemAt(cbxPagamento.getSelectedIndex()));
            objDAOVenda.incluir(objVenda);
            ultimoCodVenda = objDAOVenda.getLastId();
            objVenda.setCodVenda(ultimoCodVenda);
            // atualizaTela();
            // trataEdicao(false);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:

        trataEdicao(false);

        listItemVenda.clear();
        listItemVenda.addAll(objDAOItemVenda.getListaItensVenda(0));

        ultimoCodVenda = objDAOVenda.getLastId();
        objVenda.setCodVenda(ultimoCodVenda);
        objDAOVenda.remover(objVenda);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
        if (!(jListProduto.getSelectedIndex() >= 0)) {
            JOptionPane.showMessageDialog(null, "Selecione um produto");
            jListProduto.requestFocus();

        } else {
            int linhaSelecionada = jListProduto.getSelectedIndex();
            Produto objProduto = listProduto.get(linhaSelecionada);
            objItemVenda.setObjProduto(objProduto);
            objItemVenda.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
            // System.out.println("id venda ultimo: "+ultimoIDVenda);
            objVenda.setCodVenda(ultimoCodVenda);
            objItemVenda.setObjVenda(objVenda);
            objDAOItemVenda.incluir(objItemVenda);

            listItemVenda.clear();
            listItemVenda.addAll(objDAOItemVenda.getListaItensVenda(ultimoCodVenda));
        }
    }//GEN-LAST:event_btnVenderActionPerformed

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
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormVenda dialog = new FormVenda(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnVender;
    private javax.swing.JComboBox<String> cbxCliente;
    private javax.swing.JComboBox<String> cbxPagamento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jListProduto;
    private javax.swing.JList<String> jListProdutoVendido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAcademia;
    private javax.swing.JLabel lblPagamento;
    private java.util.List<Cliente> listCliente;
    private java.util.List<ItemVenda> listItemVenda;
    private java.util.List<Produto> listProduto;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlCima;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQuantidade;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
