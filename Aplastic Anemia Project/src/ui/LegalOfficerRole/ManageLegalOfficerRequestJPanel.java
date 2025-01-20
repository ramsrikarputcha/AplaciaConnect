/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.LegalOfficerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LegalOfficerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Magic.design.MyTableFormat;
import javax.mail.Transport;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ramsr
 */
public class ManageLegalOfficerRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageLegalOfficerRequestJPanel
     */
    
    private EcoSystem system;
    private UserAccount userAccount;
    private LegalOfficerOrganization legalofficerorganization;
    private Enterprise enterprise;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public ManageLegalOfficerRequestJPanel(EcoSystem system, UserAccount userAccount, LegalOfficerOrganization legalofficerorganization, Enterprise enterprise) {
        initComponents();
        this.system = system;
        this.userAccount = userAccount;
        this.legalofficerorganization = legalofficerorganization;
        this.enterprise = enterprise;
        
        tblLegalOrganisation.getTableHeader().setDefaultRenderer(new MyTableFormat());
        tblLegalOfficer.getTableHeader().setDefaultRenderer(new MyTableFormat());
        populateOrganisationpatientTable();
        populateLegalPatientTable();
    }

    public void populateOrganisationpatientTable(){
        DefaultTableModel model = (DefaultTableModel)tblLegalOrganisation.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : legalofficerorganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getSummary();
            row[2] = request.getPatient();
            row[3] = request.getPatient().getName();
            row[4] = request.getPatient().getEmailID();
            row[5] = request.getStatus();
            
            model.addRow(row);
        }
    }
    
  
    public void populateLegalPatientTable(){
        DefaultTableModel model = (DefaultTableModel)tblLegalOfficer.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getPatient();
            row[2] = request.getPatient().getName();
            row[3] = request.getPatient().getEmailID();
            row[4] = request.getUserAccount().getUsername();
            row[5] = request.getStatus();
             
            model.addRow(row);
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

        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        toTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        fromTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTextField = new javax.swing.JTextArea();
        btnAssign = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLegalOfficer = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLegalOrganisation = new javax.swing.JTable();
        subjectTextField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setText("Message:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton1.setText("Send Mail");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 600, 110, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setText("Subject:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setText("To:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        toTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        toTextField.setText("saideepakreddykasireddy@gmail.com");
        toTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toTextFieldActionPerformed(evt);
            }
        });
        add(toTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 320, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setText("From:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, -1, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Treatment Approval Request");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1568, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1580, -1));

        fromTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        fromTextField.setText("saideepakreddykasireddy@gmail.com");
        fromTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromTextFieldActionPerformed(evt);
            }
        });
        add(fromTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 320, -1));

        messageTextField.setColumns(20);
        messageTextField.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        messageTextField.setRows(5);
        messageTextField.setText("Hello,\n\nIf you are still in need of Organ Transplant of Bone Marrow, please go through this mail \nand sign the required consent form. So that we can proceed forward with treatment\n\nThanks and Regards,\nLegal Operations Officer");
        jScrollPane1.setViewportView(messageTextField);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 330, 130));

        btnAssign.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnAssign.setText("Assign to me");
        btnAssign.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 140, 40));

        tblLegalOfficer.setBackground(new java.awt.Color(0, 0, 0));
        tblLegalOfficer.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblLegalOfficer.setForeground(new java.awt.Color(255, 255, 255));
        tblLegalOfficer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Patient UID", "Patient Name", "Email", "Assigned to", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLegalOfficer.setGridColor(new java.awt.Color(0, 0, 0));
        tblLegalOfficer.setRowHeight(30);
        jScrollPane4.setViewportView(tblLegalOfficer);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 980, 160));

        tblLegalOrganisation.setBackground(new java.awt.Color(0, 0, 0));
        tblLegalOrganisation.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblLegalOrganisation.setForeground(new java.awt.Color(255, 255, 255));
        tblLegalOrganisation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Summary", "Patient UID", "Patient Name", "Email", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLegalOrganisation.setGridColor(new java.awt.Color(0, 0, 0));
        tblLegalOrganisation.setRowHeight(30);
        jScrollPane2.setViewportView(tblLegalOrganisation);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 990, 190));

        subjectTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        subjectTextField.setText("Approval Form for Organ Donation");
        subjectTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectTextFieldActionPerformed(evt);
            }
        });
        add(subjectTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, 320, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if(toTextField.getText().equals("") || subjectTextField.getText().equals("") ||  messageTextField.getText().equals("")){

            JOptionPane.showMessageDialog(null,new JLabel("<html><b>All fields are mandatory!</b></html>"), "Error", JOptionPane.ERROR_MESSAGE);

            //JOptionPane.showMessageDialog(null, "Please fill all the fields!" );
        }
        else{
            String toEmail = toTextField.getText();
            //       String toEmail = "aedprojspring21@gmail.com";
            //       final String fromEmail = "aedprojspring21@gmail.com";
            final String fromEmail = fromTextField.getText();
            final String fromEmailPassword = "21SpringNEUaed$";
            String subject = subjectTextField.getText();

            Properties properties = new Properties();
            properties.put("mail.smtp.starttls.enable","true");
            properties.put("mail.smtp.EnableSSL.enable","true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.auth","true");
            properties.put("mail.debug", "true");
            properties.put("mail.smtp.host","smtp.gmail.com");
            properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            properties.setProperty("mail.smtp.socketFactory.fallback", "false");
            properties.setProperty("mail.smtp.port", "465");
            properties.setProperty("mail.smtp.socketFactory.port", "465");

            Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {

                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, fromEmailPassword);
                }
            });

            try{
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(fromEmail));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
                message.setSubject(subject);
                message.setText(messageTextField.getText());
                Transport.send(message);
            }
                    catch(MessagingException ex){
                System.out.println(""+ex);
            }

            //
            //
            int selectedRow = tblLegalOfficer.getSelectedRow();

            if(selectedRow <0){
                //JOptionPane.showMessageDialog(null,"Please select a row");
                JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Please select a row from the table</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);

            }
            else{
                WorkRequest request = (WorkRequest)tblLegalOfficer.getValueAt(selectedRow, 0);

                request.setStatus("Consent form sent");
                //request.setUserAccount(userAccount);
                //userAccount.getWorkQueue().getWorkRequestList().add(request);

                dB4OUtil.storeSystem(system);

                populateOrganisationpatientTable();
                populateLegalPatientTable();

                JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Consent Form sent successfully!</b></html>"),"Info", JOptionPane.INFORMATION_MESSAGE);

                //JOptionPane.showMessageDialog(null,"Consent Form Sent Successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void toTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toTextFieldActionPerformed

    private void fromTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromTextFieldActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblLegalOrganisation.getSelectedRow();

        if (selectedRow < 0){
            //JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Please select a row from the table</b></html>"), "Error", JOptionPane.ERROR_MESSAGE);

        }
        else{
            WorkRequest request = (WorkRequest)tblLegalOrganisation.getValueAt(selectedRow, 0);

            if(request.getStatus().equals("Assigned to Legal Department"))
            {
                request.setStatus("Assign to LegalOfficer" + userAccount.getUsername());
                request.setUserAccount(userAccount);
                userAccount.getWorkQueue().getWorkRequestList().add(request);
            }
            else{
                //JOptionPane.showMessageDialog(null, "Work Request is already assigned!" );
                JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Work Request is already in progress!</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);

            }
            dB4OUtil.storeSystem(system);
            populateOrganisationpatientTable();
            populateLegalPatientTable();
        }

    }//GEN-LAST:event_btnAssignActionPerformed

    private void subjectTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JTextField fromTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea messageTextField;
    private javax.swing.JTextField subjectTextField;
    private javax.swing.JTable tblLegalOfficer;
    private javax.swing.JTable tblLegalOrganisation;
    private javax.swing.JTextField toTextField;
    // End of variables declaration//GEN-END:variables
}
