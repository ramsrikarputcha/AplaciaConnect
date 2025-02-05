/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Anemia_Centre_Coordinator_Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Anemia_Centre_Organization;
import Business.Organization.GovernmentOrganization;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author deepakreddy
 */
public class ManageCancerCentreCoordinatorProfile extends javax.swing.JPanel {
     private UserAccount userAccount;
     private Enterprise enterprise ;
     private GovernmentOrganization govtOrganization;
     private Anemia_Centre_Organization cancerCentreOrganization;

    /**
     * Creates new form ManageCancerCentreCoordinatorProfile
     */
    public ManageCancerCentreCoordinatorProfile(UserAccount userAccount, Anemia_Centre_Organization cancerCentreOrganization, Enterprise enterprise) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         initComponents();
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.cancerCentreOrganization = cancerCentreOrganization;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboGender = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtSpecialization = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 49, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Contact:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 78, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Address:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 107, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("City:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 136, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("State:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 165, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Gender:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 195, -1, -1));

        comboGender.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        comboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel1.add(comboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 192, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("DOB:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Specialization:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 270, -1, -1));

        txtName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 44, 146, -1));

        txtContact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 73, 146, -1));

        txtAddress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 102, 146, -1));

        txtCity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 131, 146, -1));

        txtState.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 146, -1));

        txtSpecialization.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtSpecialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 146, -1));

        txtDOB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });
        jPanel1.add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 227, 146, -1));

        btnSave.setText("Save");
        btnSave.setBorder(null);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 310, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        userAccount.getEmployee().setCity(txtCity.getText());
        userAccount.getEmployee().setContactNumber(Integer.parseInt(txtContact.getText()));
        userAccount.getEmployee().setDateOfBirth(new Date(txtDOB.getText()));
        userAccount.getEmployee().setGender((String) comboGender.getSelectedItem());
        userAccount.getEmployee().setAddress(txtAddress.getText());
        userAccount.getEmployee().setState(txtCity.getText());
        userAccount.getEmployee().setSpecialization(txtSpecialization.getText());
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox comboGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSpecialization;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables
}
