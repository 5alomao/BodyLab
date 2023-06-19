/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlBackgroud = new javax.swing.JPanel();
        pnlEsquerda = new javax.swing.JPanel();
        lblVersao = new javax.swing.JLabel();
        btnVendas = new javax.swing.JPanel();
        lblVendas = new javax.swing.JLabel();
        btnFuncionarios = new javax.swing.JPanel();
        lblFuncionarios = new javax.swing.JLabel();
        btnProdutos = new javax.swing.JPanel();
        lblProdutos = new javax.swing.JLabel();
        btnPlanos = new javax.swing.JPanel();
        lblPlanos = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        lblClientes = new javax.swing.JLabel();
        btnCargos = new javax.swing.JPanel();
        lblCargos = new javax.swing.JLabel();
        btnCategorias = new javax.swing.JPanel();
        lblCategorias = new javax.swing.JLabel();
        btnMarcas = new javax.swing.JPanel();
        lblMarcas = new javax.swing.JLabel();
        btnSobre = new javax.swing.JPanel();
        lblSobre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlCima = new javax.swing.JPanel();
        lblAcademia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gym System");
        setMinimumSize(new java.awt.Dimension(720, 640));
        setPreferredSize(new java.awt.Dimension(650, 523));
        setResizable(false);

        jPanel1.setLayout(new java.awt.BorderLayout());

        pnlBackgroud.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackgroud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlEsquerda.setBackground(new java.awt.Color(48, 48, 48));
        pnlEsquerda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVersao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblVersao.setForeground(new java.awt.Color(255, 255, 255));
        lblVersao.setText("Versão 1.0");
        pnlEsquerda.add(lblVersao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        btnVendas.setBackground(new java.awt.Color(48, 48, 48));
        btnVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVendasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVendasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVendasMousePressed(evt);
            }
        });

        lblVendas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVendas.setForeground(new java.awt.Color(255, 255, 255));
        lblVendas.setText("Vendas");

        javax.swing.GroupLayout btnVendasLayout = new javax.swing.GroupLayout(btnVendas);
        btnVendas.setLayout(btnVendasLayout);
        btnVendasLayout.setHorizontalGroup(
            btnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnVendasLayout.setVerticalGroup(
            btnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlEsquerda.add(btnVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 150, 50));

        btnFuncionarios.setBackground(new java.awt.Color(48, 48, 48));
        btnFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFuncionariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFuncionariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFuncionariosMousePressed(evt);
            }
        });

        lblFuncionarios.setBackground(new java.awt.Color(51, 51, 51));
        lblFuncionarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        lblFuncionarios.setText("Funcionários");

        javax.swing.GroupLayout btnFuncionariosLayout = new javax.swing.GroupLayout(btnFuncionarios);
        btnFuncionarios.setLayout(btnFuncionariosLayout);
        btnFuncionariosLayout.setHorizontalGroup(
            btnFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnFuncionariosLayout.setVerticalGroup(
            btnFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlEsquerda.add(btnFuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 150, 50));

        btnProdutos.setBackground(new java.awt.Color(48, 48, 48));
        btnProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProdutosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProdutosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProdutosMousePressed(evt);
            }
        });

        lblProdutos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutos.setText("Produtos");

        javax.swing.GroupLayout btnProdutosLayout = new javax.swing.GroupLayout(btnProdutos);
        btnProdutos.setLayout(btnProdutosLayout);
        btnProdutosLayout.setHorizontalGroup(
            btnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnProdutosLayout.setVerticalGroup(
            btnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlEsquerda.add(btnProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 150, 50));

        btnPlanos.setBackground(new java.awt.Color(48, 48, 48));
        btnPlanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPlanosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPlanosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPlanosMousePressed(evt);
            }
        });

        lblPlanos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPlanos.setForeground(new java.awt.Color(255, 255, 255));
        lblPlanos.setText("Planos");

        javax.swing.GroupLayout btnPlanosLayout = new javax.swing.GroupLayout(btnPlanos);
        btnPlanos.setLayout(btnPlanosLayout);
        btnPlanosLayout.setHorizontalGroup(
            btnPlanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPlanosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPlanos, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnPlanosLayout.setVerticalGroup(
            btnPlanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPlanosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPlanos, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlEsquerda.add(btnPlanos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 150, 50));

        btnClientes.setBackground(new java.awt.Color(48, 48, 48));
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClientesMousePressed(evt);
            }
        });

        lblClientes.setBackground(new java.awt.Color(51, 51, 51));
        lblClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes.setText("Clientes");

        javax.swing.GroupLayout btnClientesLayout = new javax.swing.GroupLayout(btnClientes);
        btnClientes.setLayout(btnClientesLayout);
        btnClientesLayout.setHorizontalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnClientesLayout.setVerticalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlEsquerda.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 50));

        btnCargos.setBackground(new java.awt.Color(48, 48, 48));
        btnCargos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCargosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCargosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCargosMousePressed(evt);
            }
        });

        lblCargos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCargos.setForeground(new java.awt.Color(255, 255, 255));
        lblCargos.setText("Cargos");

        javax.swing.GroupLayout btnCargosLayout = new javax.swing.GroupLayout(btnCargos);
        btnCargos.setLayout(btnCargosLayout);
        btnCargosLayout.setHorizontalGroup(
            btnCargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCargosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargos, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnCargosLayout.setVerticalGroup(
            btnCargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCargosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargos, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlEsquerda.add(btnCargos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 150, 50));

        btnCategorias.setBackground(new java.awt.Color(48, 48, 48));
        btnCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCategoriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCategoriasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCategoriasMousePressed(evt);
            }
        });

        lblCategorias.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCategorias.setForeground(new java.awt.Color(255, 255, 255));
        lblCategorias.setText("Categorias");

        javax.swing.GroupLayout btnCategoriasLayout = new javax.swing.GroupLayout(btnCategorias);
        btnCategorias.setLayout(btnCategoriasLayout);
        btnCategoriasLayout.setHorizontalGroup(
            btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnCategoriasLayout.setVerticalGroup(
            btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlEsquerda.add(btnCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 150, 50));

        btnMarcas.setBackground(new java.awt.Color(48, 48, 48));
        btnMarcas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMarcasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMarcasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMarcasMousePressed(evt);
            }
        });

        lblMarcas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMarcas.setForeground(new java.awt.Color(255, 255, 255));
        lblMarcas.setText("Marcas");

        javax.swing.GroupLayout btnMarcasLayout = new javax.swing.GroupLayout(btnMarcas);
        btnMarcas.setLayout(btnMarcasLayout);
        btnMarcasLayout.setHorizontalGroup(
            btnMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMarcasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMarcas, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnMarcasLayout.setVerticalGroup(
            btnMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMarcasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMarcas, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlEsquerda.add(btnMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 150, 50));

        btnSobre.setBackground(new java.awt.Color(31, 31, 31));
        btnSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSobreMousePressed(evt);
            }
        });

        lblSobre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSobre.setForeground(new java.awt.Color(255, 255, 255));
        lblSobre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSobre.setText("Sobre");

        javax.swing.GroupLayout btnSobreLayout = new javax.swing.GroupLayout(btnSobre);
        btnSobre.setLayout(btnSobreLayout);
        btnSobreLayout.setHorizontalGroup(
            btnSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSobreLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblSobre)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        btnSobreLayout.setVerticalGroup(
            btnSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlEsquerda.add(btnSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 150, 30));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTROLE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlEsquerda.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, -1));

        pnlBackgroud.add(pnlEsquerda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 580));

        pnlCima.setBackground(new java.awt.Color(31, 31, 31));
        pnlCima.setLayout(null);

        lblAcademia.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblAcademia.setForeground(new java.awt.Color(255, 153, 0));
        lblAcademia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcademia.setText("BodyLab System");
        pnlCima.add(lblAcademia);
        lblAcademia.setBounds(150, 0, 600, 60);

        pnlBackgroud.add(pnlCima, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 60));

        jPanel1.add(pnlBackgroud, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSobreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSobreMousePressed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "GYM SYSTEM\nDireitos Reservados\nVersão 1.0");
    }//GEN-LAST:event_btnSobreMousePressed

    private void btnMarcasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMarcasMousePressed
        // TODO add your handling code here:
        resetAllBackgroundBtn();
        setBackgroundColor(btnMarcas);
        FormMarca form = new FormMarca(this,true);
        //true: Define como janela modal: Sobrepõe o FormPrincipal e não deixa acessa-lo
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_btnMarcasMousePressed

    private void btnCategoriasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMousePressed
        // TODO add your handling code here:
        resetAllBackgroundBtn();
        setBackgroundColor(btnCategorias);
        FormCategoria form = new FormCategoria(this,true);
        //true: Define como janela modal: Sobrepõe o FormPrincipal e não deixa acessa-lo
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_btnCategoriasMousePressed

    private void btnCargosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargosMousePressed
        // TODO add your handling code here:
        resetAllBackgroundBtn();
        setBackgroundColor(btnCargos);
        FormCargo form = new FormCargo(this,true);
        //true: Define como janela modal: Sobrepõe o FormPrincipal e não deixa acessa-lo
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_btnCargosMousePressed

    private void btnClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMousePressed
        // TODO add your handling code here:
        resetAllBackgroundBtn();
        setBackgroundColor(btnClientes);
        FormCliente form = new FormCliente(this,true);
        //true: Define como janela modal: Sobrepõe o FormPrincipal e não deixa acessa-lo
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_btnClientesMousePressed

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
        // TODO add your handling code here:
        resetBackgroundColor(btnClientes);
    }//GEN-LAST:event_btnClientesMouseExited

    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        // TODO add your handling code here:
        setBackgroundColor(btnClientes);
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnPlanosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlanosMousePressed
        // TODO add your handling code here:
        resetAllBackgroundBtn();
        setBackgroundColor(btnPlanos);
    }//GEN-LAST:event_btnPlanosMousePressed

    private void btnProdutosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutosMousePressed
        // TODO add your handling code here:
        resetAllBackgroundBtn();
        setBackgroundColor(btnProdutos);
        FormProduto form = new FormProduto(this,true);
        //true: Define como janela modal: Sobrepõe o FormPrincipal e não deixa acessa-lo
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_btnProdutosMousePressed

    private void btnFuncionariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFuncionariosMousePressed
        // TODO add your handling code here:
        resetAllBackgroundBtn();
        setBackgroundColor(btnFuncionarios);
        FormFuncionario form = new FormFuncionario(this,true);
        //true: Define como janela modal: Sobrepõe o FormPrincipalh e não deixa acessa-lo
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_btnFuncionariosMousePressed

    private void btnVendasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendasMousePressed
        // TODO add your handling code here:
        resetAllBackgroundBtn();
        setBackgroundColor(btnVendas);
    }//GEN-LAST:event_btnVendasMousePressed

    private void btnFuncionariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFuncionariosMouseEntered
        // TODO add your handling code here:
        setBackgroundColor(btnFuncionarios);
    }//GEN-LAST:event_btnFuncionariosMouseEntered

    private void btnFuncionariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFuncionariosMouseExited
        // TODO add your handling code here:
        resetBackgroundColor(btnFuncionarios);
    }//GEN-LAST:event_btnFuncionariosMouseExited

    private void btnProdutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutosMouseEntered
        // TODO add your handling code here:
        setBackgroundColor(btnProdutos);
    }//GEN-LAST:event_btnProdutosMouseEntered

    private void btnProdutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutosMouseExited
        // TODO add your handling code here:
        resetBackgroundColor(btnProdutos);
    }//GEN-LAST:event_btnProdutosMouseExited

    private void btnPlanosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlanosMouseEntered
        // TODO add your handling code here:
        setBackgroundColor(btnPlanos);
    }//GEN-LAST:event_btnPlanosMouseEntered

    private void btnPlanosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlanosMouseExited
        // TODO add your handling code here:
        resetBackgroundColor(btnPlanos);
    }//GEN-LAST:event_btnPlanosMouseExited

    private void btnVendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendasMouseEntered
        // TODO add your handling code here:
        setBackgroundColor(btnVendas);
    }//GEN-LAST:event_btnVendasMouseEntered

    private void btnVendasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendasMouseExited
        // TODO add your handling code here:
        resetBackgroundColor(btnVendas);
    }//GEN-LAST:event_btnVendasMouseExited

    private void btnCargosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargosMouseEntered
        // TODO add your handling code here:
        setBackgroundColor(btnCargos);
    }//GEN-LAST:event_btnCargosMouseEntered

    private void btnCargosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargosMouseExited
        // TODO add your handling code here:
        resetBackgroundColor(btnCargos);
    }//GEN-LAST:event_btnCargosMouseExited

    private void btnCategoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMouseEntered
        // TODO add your handling code here:
        setBackgroundColor(btnCategorias);
    }//GEN-LAST:event_btnCategoriasMouseEntered

    private void btnCategoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMouseExited
        // TODO add your handling code here:
        resetBackgroundColor(btnCategorias);
    }//GEN-LAST:event_btnCategoriasMouseExited

    private void btnMarcasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMarcasMouseEntered
        // TODO add your handling code here:
        setBackgroundColor(btnMarcas);
    }//GEN-LAST:event_btnMarcasMouseEntered

    private void btnMarcasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMarcasMouseExited
        // TODO add your handling code here:
        resetBackgroundColor(btnMarcas);
    }//GEN-LAST:event_btnMarcasMouseExited
    
    void setBackgroundColor(JPanel pnl){
        pnl.setBackground(new Color(153,153,153));
    }
    
    void resetBackgroundColor(JPanel pnl){
        pnl.setBackground(new Color(48,48,48));
    }
    
    void resetAllBackgroundBtn(){
        resetBackgroundColor(btnClientes);
        resetBackgroundColor(btnFuncionarios);
        resetBackgroundColor(btnPlanos);
        resetBackgroundColor(btnProdutos);
        resetBackgroundColor(btnVendas);
        resetBackgroundColor(btnCargos);
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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCargos;
    private javax.swing.JPanel btnCategorias;
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnFuncionarios;
    private javax.swing.JPanel btnMarcas;
    private javax.swing.JPanel btnPlanos;
    private javax.swing.JPanel btnProdutos;
    private javax.swing.JPanel btnSobre;
    private javax.swing.JPanel btnVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAcademia;
    private javax.swing.JLabel lblCargos;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblFuncionarios;
    private javax.swing.JLabel lblMarcas;
    private javax.swing.JLabel lblPlanos;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblSobre;
    private javax.swing.JLabel lblVendas;
    private javax.swing.JLabel lblVersao;
    private javax.swing.JPanel pnlBackgroud;
    private javax.swing.JPanel pnlCima;
    private javax.swing.JPanel pnlEsquerda;
    // End of variables declaration//GEN-END:variables
}
