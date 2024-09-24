/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fula_constructor_s.a.s;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author RyZen 5 Pro
 */
public class SendInformeView extends javax.swing.JFrame {

    private ImageIcon image;
    private Icon icon;

    public SendInformeView() {
        initComponents();
        this.setResizable(false);
        setImage(imgPDF, "src\\main\\java\\com\\mycompany\\fula_constructor_s\\a\\s\\img/pdf.png");
    }

    private void setImage(JLabel img, String root) {
        this.image = new ImageIcon(root);
        this.icon = new ImageIcon(this.image.getImage().getScaledInstance(img.getWidth(), img.getHeight(), java.awt.Image.SCALE_SMOOTH));
        img.setIcon(this.icon);
        this.repaint();
    }

    public void sendMessage(String email, String asunto, String body) {
        transfer_to_email(email, asunto, body);
        UsersView view = new UsersView();
        view.setVisible(true);
        this.hide();

    }

    public void transfer_to_email(String correo, String asunto, String body) {
        String sendEmail = "dfula@unal.edu.co";
        String password = "smvl nffc ugwt jsuc";
        String message = body;

        Properties objectPEC = new Properties();

        objectPEC.put("mail.smtp.host", "smtp.gmail.com");
        objectPEC.setProperty("mail.smtp.starttls.enable", "true");
        objectPEC.put("mail.smtp.port", "587");
        objectPEC.setProperty("mail.smtp.port", "587");
        objectPEC.put("mail.smtp.user", sendEmail);
        objectPEC.setProperty("mail.smtp.auth", "true");

        Session sesion = Session.getDefaultInstance(objectPEC);
        MimeMessage mail = new MimeMessage(sesion);

        try {
            MimeMultipart mElementos = new MimeMultipart();
            MimeBodyPart mContenido = new MimeBodyPart();
            mContenido.setContent(body, "text/html; charset=utf-8");
            mElementos.addBodyPart(mContenido);

            MimeBodyPart mInforme = new MimeBodyPart();
            mInforme.setDataHandler(new DataHandler(new FileDataSource("temp/informe.pdf")));
            mInforme.setFileName("informe.pdf");
            mElementos.addBodyPart(mInforme);

            mail.setFrom(new InternetAddress(sendEmail));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
            mail.setSubject(asunto);
            mail.setContent(mElementos);

            Transport transport = sesion.getTransport("smtp");
            transport.connect(sendEmail, password);
            transport.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transport.close();

            JOptionPane.showMessageDialog(null, "El correo se envió correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al enviar el correo");
        }
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
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBody = new javax.swing.JTextArea();
        imgPDF = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mBack = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(0, 1, 0, 10));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(150, 17, 52));
        jLabel1.setText("Enviar a:");
        jPanel1.add(jLabel1);
        jPanel1.add(txtEmail);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(150, 17, 52));
        jLabel2.setText("Asunto:");
        jPanel1.add(jLabel2);
        jPanel1.add(txtAsunto);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(150, 17, 52));
        jLabel3.setText("Contenido:");
        jPanel1.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(150, 17, 52));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Enviar correo");

        txtBody.setColumns(20);
        txtBody.setForeground(new java.awt.Color(150, 17, 52));
        txtBody.setRows(5);
        jScrollPane1.setViewportView(txtBody);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(150, 17, 52));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Informe.pdf");

        btnSend.setBackground(new java.awt.Color(255, 254, 255));
        btnSend.setForeground(new java.awt.Color(150, 17, 52));
        btnSend.setText("Enviar");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        mBack.setText("Salir");
        mBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mBackMouseClicked(evt);
            }
        });
        jMenuBar1.add(mBack);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(imgPDF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSend)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        String email = this.txtEmail.getText().trim();
        String asunto = this.txtAsunto.getText();
        String body = this.txtBody.getText();
        sendMessage(email, asunto, body);
    }//GEN-LAST:event_btnSendActionPerformed

    private void mBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mBackMouseClicked
        // TODO add your handling code here:
        UsersView view = new UsersView();
        view.setVisible(true);
        this.hide();
    }//GEN-LAST:event_mBackMouseClicked

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
            java.util.logging.Logger.getLogger(SendInformeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendInformeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendInformeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendInformeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SendInformeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel imgPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mBack;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextArea txtBody;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
