/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
/**
 *
 * @author Tarcísio
 */
public class JFLogin extends javax.swing.JFrame {

    /**
     * Creates new form JFLogin
     */
    public JFLogin() {
        initComponents();
        setLocationRelativeTo(null);
        login.requestFocus(); //seta o campo login  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        jButtonacessar = new javax.swing.JButton();
        jButtonsair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Digite a sua senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 150, 150, 19);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Digite o seu usuário:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 80, 150, 19);

        login.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(370, 110, 200, 28);

        senha.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(senha);
        senha.setBounds(370, 180, 200, 28);

        jButtonacessar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonacessar.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButtonacessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones botoes/cadeado.png"))); // NOI18N
        jButtonacessar.setText("Acessar");
        jButtonacessar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonacessar.setBorderPainted(false);
        jButtonacessar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonacessar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones botoes/aceitar.png"))); // NOI18N
        jButtonacessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonacessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonacessar);
        jButtonacessar.setBounds(370, 230, 90, 30);

        jButtonsair.setBackground(new java.awt.Color(255, 255, 255));
        jButtonsair.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButtonsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones botoes/sair.png"))); // NOI18N
        jButtonsair.setText("Sair");
        jButtonsair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonsair.setBorderPainted(false);
        jButtonsair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonsair.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones botoes/excluir.png"))); // NOI18N
        jButtonsair.setVerifyInputWhenFocusTarget(false);
        jButtonsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonsair);
        jButtonsair.setBounds(480, 230, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones telas/tela_login.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 320);

        setBounds(0, 0, 618, 320);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void jButtonsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsairActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jButtonsairActionPerformed
private int cont; 
    private void jButtonacessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonacessarActionPerformed
if (login.getText().equals("sindico" ) && (senha.getText().equals("123"))) 

{
JOptionPane.showMessageDialog(null, "Seja Bem-vindo ao sistema!");
new JFMenu().setVisible(true);
this.dispose();

}else{
cont = cont + 1;  //Variavel contador tentativas
if (cont < 3) { //contar tentativas  
JOptionPane.showMessageDialog(null, "Usuário/Senha Incorretos (" + cont + "ª Tentativa)");  
login.setText("");//limpar campo login
senha.setText("");//limpar campo senha
login.requestFocus(); //seta o campo login

} else {  
JOptionPane.showMessageDialog(null, "Você Excedeu o Limite Máximo de Tentativas");  
dispose(); //fecha o formulário 
}

}

    }//GEN-LAST:event_jButtonacessarActionPerformed

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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonacessar;
    private javax.swing.JButton jButtonsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField login;
    private javax.swing.JPasswordField senha;
    // End of variables declaration//GEN-END:variables
}
