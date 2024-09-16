/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fula_constructor_s.a.s;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author Windows
 */
public class UsersView extends javax.swing.JFrame {
    
    private ImageIcon image;
    private Icon icon;
    private String userName;
    
    /**
     *
     */
    public UsersView() {
        initComponents();
        this.setResizable(false);
    }

    /**
     *
     * @param UserName
     */
    public UsersView(String UserName) {
        this.userName = UserName;
        initComponents();
        this.setResizable(false);
        this.setLogo(imgLogo, "src\\main\\java\\com\\mycompany\\fula_constructor_s\\a\\s\\img/Recurso 2.png");
        lblUserName.setText(UserName);
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
        paneControl = new javax.swing.JPanel();
        btnNewInforme = new javax.swing.JButton();
        btnSearchInforme = new javax.swing.JButton();
        btnStateInforme = new javax.swing.JButton();
        btnCreateClient = new javax.swing.JButton();
        btnSupport = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuLogOut = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 228, 228));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("FULA CONSTRUCTOR SAS");

        jLabel3.setText("901224360-7");

        paneControl.setLayout(new java.awt.GridLayout(0, 3, 12, 12));

        btnNewInforme.setBackground(new java.awt.Color(153, 0, 63));
        btnNewInforme.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnNewInforme.setForeground(new java.awt.Color(255, 255, 255));
        btnNewInforme.setText("Crear nuevo informe");
        btnNewInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewInformeActionPerformed(evt);
            }
        });
        paneControl.add(btnNewInforme);

        btnSearchInforme.setBackground(new java.awt.Color(153, 0, 63));
        btnSearchInforme.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSearchInforme.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchInforme.setText("Buscar informe");
        btnSearchInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchInformeActionPerformed(evt);
            }
        });
        paneControl.add(btnSearchInforme);

        btnStateInforme.setBackground(new java.awt.Color(153, 0, 63));
        btnStateInforme.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnStateInforme.setForeground(new java.awt.Color(255, 255, 255));
        btnStateInforme.setText("Estado de informes");
        btnStateInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStateInformeActionPerformed(evt);
            }
        });
        paneControl.add(btnStateInforme);

        btnCreateClient.setBackground(new java.awt.Color(153, 0, 63));
        btnCreateClient.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCreateClient.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateClient.setText("Crear cliente");
        btnCreateClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateClientActionPerformed(evt);
            }
        });
        paneControl.add(btnCreateClient);

        btnSupport.setBackground(new java.awt.Color(153, 0, 63));
        btnSupport.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSupport.setForeground(new java.awt.Color(255, 255, 255));
        btnSupport.setText("Soporte");
        btnSupport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupport1ActionPerformed(evt);
            }
        });
        paneControl.add(btnSupport);

        lblUserName.setText("userName");

        menuLogOut.setText("Cerrar sesión");
        menuLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLogOutMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuLogOut);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(paneControl, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblUserName)
                                    .addGap(773, 773, 773))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUserName))
                    .addComponent(imgLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addComponent(paneControl, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStateInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStateInformeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnStateInformeActionPerformed

    private void btnSearchInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchInformeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchInformeActionPerformed

    private void btnClientCreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientCreationActionPerformed
        // TODO add your handling code here:
        ClientCreation viewClienteCreation = new ClientCreation();
        viewClienteCreation.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnClientCreationActionPerformed

    private void btnNewInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewInformeActionPerformed
        // TODO add your handling code here:
        frontInformes viewInformes = new frontInformes(this.userName);
        viewInformes.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnNewInformeActionPerformed

    private void menuLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLogOutMouseClicked
        // TODO add your handling code here:
        front view = new front();
        view.setVisible(true);
        this.hide();
    }//GEN-LAST:event_menuLogOutMouseClicked

    private void btnCreateClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateClientActionPerformed

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
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsersView().setVisible(true);
            }
        });
    }
    
    private void setLogo(JLabel img,String root){
        this.image = new ImageIcon(root);
        this.icon = new ImageIcon(this.image.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH));
        img.setIcon(this.icon);
        //this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateClient;
    private javax.swing.JButton btnNewInforme;
    private javax.swing.JButton btnSearchInforme;
    private javax.swing.JButton btnStateInforme;
    private javax.swing.JButton btnSupport;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JMenu menuLogOut;
    private javax.swing.JPanel paneControl;
    // End of variables declaration//GEN-END:variables
}
