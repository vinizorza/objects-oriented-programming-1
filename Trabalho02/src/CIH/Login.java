/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIH;

import CGD.ValidaUsuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author artur
 */
public class Login extends javax.swing.JFrame {
    /**
     * Creates new form Login
     */
    private String nomeEntrada;
    private String senhaEntrada;

    public Login(String nomeEntrada, String senhaEntrada) {
        this.nomeEntrada = nomeEntrada;
        this.senhaEntrada = senhaEntrada;
    }
   
    public Login() {
        this.initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        //this.setVisible(true);
    }
    
    private final JLabel errologinLabel = new JLabel(" ");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoLabel = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        usuarioTextField = new javax.swing.JTextField();
        senhaLabel = new javax.swing.JLabel();
        senhaPasswordField = new javax.swing.JPasswordField();
        entrarButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(500, 330));

        logoLabel.setFont(new java.awt.Font("Cantarell", 1, 26)); // NOI18N
        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/muda.png"))); // NOI18N
        logoLabel.setText("Mudas Schaefer");
        logoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        usuarioLabel.setFont(new java.awt.Font("Cantarell", 3, 18)); // NOI18N
        usuarioLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-image-with-black-background.png"))); // NOI18N
        usuarioLabel.setText("Usuário");
        usuarioLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        usuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTextFieldActionPerformed(evt);
            }
        });

        senhaLabel.setFont(new java.awt.Font("Cantarell", 3, 18)); // NOI18N
        senhaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/password.png"))); // NOI18N
        senhaLabel.setText("Senha");
        senhaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        senhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaPasswordFieldActionPerformed(evt);
            }
        });

        entrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/check-mark (1).png"))); // NOI18N
        entrarButton.setText("Entrar");
        entrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });

        sairButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel-icon.png"))); // NOI18N
        sairButton.setText("Sair");
        sairButton.setAutoscrolls(true);
        sairButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senhaPasswordField)
                    .addComponent(usuarioTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(entrarButton)
                        .addGap(31, 31, 31)
                        .addComponent(sairButton)
                        .addGap(0, 286, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioLabel)
                    .addComponent(usuarioTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLabel)
                    .addComponent(senhaPasswordField))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrarButton)
                    .addComponent(sairButton))
                .addGap(37, 37, 37))
        );

        logoLabel.getAccessibleContext().setAccessibleName("Logo");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaPasswordFieldActionPerformed
        //this.setSenhaEntrada(toString(senhaPasswordField.getPassword()));
    }//GEN-LAST:event_senhaPasswordFieldActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void usuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTextFieldActionPerformed
        //setNomeEntrada(usuarioTextField.getText());
    }//GEN-LAST:event_usuarioTextFieldActionPerformed

    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
        this.setNomeEntrada(usuarioTextField.getText());
        this.setSenhaEntrada(toString(senhaPasswordField.getPassword()));
        if( ValidaUsuario.ValidaUsuario(nomeEntrada, senhaEntrada) ){
            JOptionPane.showMessageDialog(null, "Encontrado");
        }else{
            JOptionPane.showMessageDialog(null, "Não Encontrado");
        }
    }//GEN-LAST:event_entrarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> { //java.awt.EventQueue.invokeLater(new Runnable() {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrarButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton sairButton;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JTextField usuarioTextField;
    // End of variables declaration//GEN-END:variables

    public String getNomeEntrada() {
        return nomeEntrada;
    }

    public void setNomeEntrada(String nomeEntrada) {
        this.nomeEntrada = nomeEntrada;
    }

    public String getSenhaEntrada() {
        return senhaEntrada;
    }

    public void setSenhaEntrada(String senhaEntrada) {
        this.senhaEntrada = senhaEntrada;
    }

    private String toString(char[] password) {
        String senha = String.valueOf(password);  
        return senha;
    }
}