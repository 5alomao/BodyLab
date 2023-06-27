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
        jLabel2 = new javax.swing.JLabel();
        cbxCliente = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProduto = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListProdutoVendido = new javax.swing.JList<>();
        btnVender = new javax.swing.JButton();
        txtQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPagamento = new javax.swing.JTextField();
        lblPagamento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("CLIENTE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 85, -1, -1));

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listCliente, cbxCliente);
        bindingGroup.addBinding(jComboBoxBinding);

        jPanel1.add(cbxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 79, 208, -1));

        org.jdesktop.swingbinding.JListBinding jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listProduto, jListProduto);
        bindingGroup.addBinding(jListBinding);

        jScrollPane1.setViewportView(jListProduto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 232, 407, 303));

        jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listItemVenda, jListProdutoVendido);
        bindingGroup.addBinding(jListBinding);

        jScrollPane2.setViewportView(jListProdutoVendido);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 237, 457, 312));

        btnVender.setText("VENDER");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });
        jPanel1.add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 290, -1, -1));

        txtQuantidade.setText("1");
        jPanel1.add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 252, 60, -1));

        jLabel3.setText("Quantidade:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 232, -1, -1));

        jLabel4.setText("DATA:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 110, -1, -1));

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        jPanel1.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 110, 125, -1));

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 160, -1, -1));

        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        btnFinalizar.setText("FINALIZAR");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 160, -1, -1));

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 555, -1, -1));

        jLabel5.setText("Produtos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 212, -1, -1));

        jLabel6.setText("Produtos Vendidos:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 212, -1, -1));
        jPanel1.add(txtPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 79, 102, -1));

        lblPagamento.setText("Forma de Pagamento");
        jPanel1.add(lblPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 59, -1, -1));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            objVenda.setFormaPagamento(txtPagamento.getText());
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
    private javax.swing.JLabel lblPagamento;
    private java.util.List<Cliente> listCliente;
    private java.util.List<ItemVenda> listItemVenda;
    private java.util.List<Produto> listProduto;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtPagamento;
    private javax.swing.JTextField txtQuantidade;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}