/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.BoneMarrowBankCoordinatorWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Bone_Marrow_Bank_Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author saiteja
 */
public class BoneMarrowBankCoordinatorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BoneMarrowBankCoordinatorWorkAreaJPanel
     */
    boolean a = true;
    private UserAccount userAccount;
    private Bone_Marrow_Bank_Organization bmBankOrganization;
    private Enterprise enterprise;
    private EcoSystem system;
    private Network network;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public BoneMarrowBankCoordinatorWorkAreaJPanel(UserAccount account, Bone_Marrow_Bank_Organization bmBankOrganization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.userAccount = account;
        this.bmBankOrganization = bmBankOrganization;
        this.enterprise = enterprise;
        this.system = business;
        this.network = network;
    }
    
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);    
    }
    
    public void clickmenu(JPanel h1, JPanel h2, int numberbool){
        
        if(numberbool == 1){
            
            h1.setBackground(new Color(70,55,37));
            h2.setBackground(new Color(216,99,1));        
        }
        else{
            h1.setBackground(new Color(216,99,1));
            h2.setBackground(new Color(70,55,37));   
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

        Header = new javax.swing.JPanel();
        BtnProfile = new javax.swing.JLabel();
        BtnManageRequests = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(15, 29, 52));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new java.awt.GridLayout());

        BtnProfile.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnProfile.setForeground(new java.awt.Color(255, 255, 255));
        BtnProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnProfile.setText("Profile");
        BtnProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnProfileMouseClicked(evt);
            }
        });
        Header.add(BtnProfile);

        BtnManageRequests.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnManageRequests.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageRequests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnManageRequests.setText("Manage Requests");
        BtnManageRequests.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnManageRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnManageRequestsMouseClicked(evt);
            }
        });
        Header.add(BtnManageRequests);

        add(Header, java.awt.BorderLayout.PAGE_START);

        userProcessContainer.setBackground(new java.awt.Color(255, 153, 153));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        add(userProcessContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProfileMouseClicked
        // TODO add your handling code here:
        ManageBoneMarrowBankCoordinatorProfile managebmBankProfile = new ManageBoneMarrowBankCoordinatorProfile(userAccount,bmBankOrganization,enterprise);
        userProcessContainer.add("ManageBoneMarrowBankCoordinatorProfile",managebmBankProfile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnProfileMouseClicked

    private void BtnManageRequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnManageRequestsMouseClicked
        // TODO add your handling code here:
        BoneMarrowRequestJPanel bmBankRequestJPanel = new BoneMarrowRequestJPanel( userAccount,  bmBankOrganization, enterprise, network, system);
        userProcessContainer.add("BoneMarrowRequestJPanel",bmBankRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnManageRequestsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnManageRequests;
    private javax.swing.JLabel BtnProfile;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
