/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;


import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author Tarcísio
 */
public class JFCONCondomino extends javax.swing.JInternalFrame {

    /**
     * Creates new form JFCONCondomino
     */
    public JFCONCondomino() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonadd = new javax.swing.JButton();
        jButtonalterar = new javax.swing.JButton();
        jButtondeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Condomínio Express  |  Consulta Codomínos");
        setPreferredSize(new java.awt.Dimension(553, 530));

        jButtonadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones botoes/adicionar.png"))); // NOI18N
        jButtonadd.setToolTipText("Novo");
        jButtonadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddActionPerformed(evt);
            }
        });

        jButtonalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones botoes/Editar.png"))); // NOI18N
        jButtonalterar.setToolTipText("Alterar");
        jButtonalterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonalterarActionPerformed(evt);
            }
        });

        jButtondeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones botoes/Delete.png"))); // NOI18N
        jButtondeletar.setToolTipText("Excluir");
        jButtondeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtondeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeletarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jnome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Pesquise por nome:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones botoes/lupa.png"))); // NOI18N
        jButton1.setActionCommand("...");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jnome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonadd)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonalterar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtondeletar))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonadd)
                    .addComponent(jButtonalterar)
                    .addComponent(jButtondeletar))
                .addGap(22, 22, 22))
        );

        setBounds(0, 0, 553, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed
 JFCADCondominio JFCADCondo = new  JFCADCondominio ();
 JFMenu.jDesktop.add(JFCADCondo);
JFCADCondo .setVisible(true);
JFCADCondo .setPosicao(); 
    }//GEN-LAST:event_jButtonaddActionPerformed

    private void jButtonalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonalterarActionPerformed
        JFEDITCondominio JFEDITCondo = new   JFEDITCondominio ();
 JFMenu.jDesktop.add(JFEDITCondo);
JFEDITCondo .setVisible(true);
JFEDITCondo .setPosicao(); 
    }//GEN-LAST:event_jButtonalterarActionPerformed

    private void jButtondeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeletarActionPerformed
int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir condomíno selecionado?", "Confirmação",  
      JOptionPane.YES_NO_OPTION);  
      if (resposta == JOptionPane.YES_OPTION){  
    
 
JOptionPane.showMessageDialog(this, "condomíno excluido com sucesso!"); 
}else{  
          JOptionPane.showMessageDialog(this, "Selecione um condomíno para exclusão");  
   
        
    }//GEN-LAST:event_jButtondeletarActionPerformed

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonadd;
    private javax.swing.JButton jButtonalterar;
    private javax.swing.JButton jButtondeletar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jnome;
    // End of variables declaration//GEN-END:variables
public void setPosicao() {  
    Dimension d = this.getDesktopPane().getSize();  
    this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); }  
}


