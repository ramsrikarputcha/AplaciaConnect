/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Anemia_Centre_Coordinator_Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Magic.Design.*;
import Business.People.PatientRequestDirectory;
import Business.People.PatientRequest;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.SwingUtilities.getWindowAncestor;
import javax.swing.filechooser.FileNameExtensionFilter;
import ui.GovernmentCoordinatorRole.NewDonorJPanel;
import static ui.GovernmentCoordinatorRole.NewDonorJPanel.emailValidator;

/**
 *
 * @author deepakreddy
 */
public class NewReceiverJPanel extends javax.swing.JPanel {

   private EcoSystem system;
    private byte[] tempdP;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private boolean emailValid;
    private int yesno;
    private ButtonGroup radioGroup1;
    
    public NewReceiverJPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        this.radioGroup1 = new ButtonGroup();
       // ButtonGroup radioGroup1 = new ButtonGroup();
        radioGroup1.add(buttonYes);
        radioGroup1.add(buttonNo);
        
        populateGenderComboBox();
        populateStateComboBox();        
    }
    private void populateGenderComboBox(){
      genderJComboBox.addItem("Male");
      genderJComboBox.addItem("Female");
      genderJComboBox.addItem("Other");
        }
  
     private void populateStateComboBox(){
      stateJComboBox.addItem("California");
      stateJComboBox.addItem("Massachusetts");
      stateJComboBox.addItem("Georgia");
      stateJComboBox.addItem("Arizona");
      stateJComboBox.addItem("Texas");
      stateJComboBox.addItem("Florida");
      stateJComboBox.addItem("Illinois");
      }
      public static boolean phoneNumberValidator(String contact) {
        Pattern pattern;
        Matcher matcher;
        String PHONE_PATTERN = "^[0-9]{10}$";
        pattern = Pattern.compile(PHONE_PATTERN);
        matcher = pattern.matcher(contact);
        return matcher.matches();
        }
    public static boolean zipCodeValidator(String zip) {
        Pattern pattern;
        Matcher matcher;
        String zip_pattern = "^[0-9]{5}$";
        pattern = Pattern.compile(zip_pattern);
        matcher = pattern.matcher(zip);
        return matcher.matches();
        } 
    public static boolean emailValidator(String email) {
        Pattern pattern;
        Matcher matcher;
        String EMAIL_PATTERN = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
        }
    private void disableAllButton(){
    
        uidText.setEnabled(false);
        nameText.setEnabled(false);
        dobDateField.setEnabled(false);
        ageText.setEnabled(false);
        emailText.setEnabled(false);
        contactText.setEnabled(false);
        genderJComboBox.setEnabled(false);
        hlaTypesText.setEnabled(false);
        diagnosedDateChooser.setEnabled(false);
        streetText.setEnabled(false);
        cityText.setEnabled(false);
        stateJComboBox.setEnabled(false);
        zipText.setEnabled(false);
        buttonYes.setEnabled(false);
        buttonNo.setEnabled(false);
        btnAddPhoto.setEnabled(false);
    }
    
    public boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }
    
    public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lblProfilePicture.getWidth(), lblProfilePicture.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
      
    private ImageIcon setPicture(String carImageLocation, JLabel carImage){

        ImageIcon imageCar;
        imageCar = new ImageIcon(carImageLocation);
        Image picCar = imageCar.getImage();
        Image resizedImage = picCar.getScaledInstance(carImage.getWidth(), carImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);
        
        return selectedCarPicture;  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        zipText = new javax.swing.JTextField();
        uidText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        ageText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        streetText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnAddPhoto = new javax.swing.JButton();
        buttonYes = new javax.swing.JRadioButton();
        buttonNo = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        stateJComboBox = new javax.swing.JComboBox();
        genderJComboBox = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hlaTypesText = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        diagnosedDateChooser = new com.toedter.calendar.JDateChooser();
        dobDateField = new com.toedter.calendar.JDateChooser();
        lblProfilePicture = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel12.setText("Street address");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel13.setText("City");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setText("Submit");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 680, 100, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setText("Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        cityText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 210, -1));

        nameText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 180, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel14.setText("State");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel15.setText("ZipCode");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setText("UID");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, -1, -1));

        zipText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(zipText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 210, -1));

        uidText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(uidText, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 170, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel16.setText("Contact Number");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setText("DOB");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        contactText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        contactText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTextActionPerformed(evt);
            }
        });
        add(contactText, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, 170, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel17.setText("Email ID");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        emailText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        emailText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailTextuEmailKeyTyped(evt);
            }
        });
        add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 176, -1));

        ageText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        ageText.setForeground(new java.awt.Color(255, 255, 255));
        ageText.setEnabled(false);
        ageText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ageTextMouseClicked(evt);
            }
        });
        add(ageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 170, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setText("Gender");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setText("Was your cancer diagnosis confirmed by a medical practitioner?");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setText("HLA Types");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, -1, -1));

        streetText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(streetText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 210, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setText("Cancer diagnosed date");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, -1, -1));

        btnAddPhoto.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnAddPhoto.setText("Add photo");
        btnAddPhoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPhotoActionPerformed(evt);
            }
        });
        add(btnAddPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 270, 120, -1));

        buttonYes.setBackground(new java.awt.Color(0, 0, 0));
        buttonYes.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonYes.setText("Yes");
        add(buttonYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, -1, -1));

        buttonNo.setBackground(new java.awt.Color(0, 0, 0));
        buttonNo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonNo.setText("No");
        add(buttonNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 500, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Patient Registration Form ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1788, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel20.setText("Age");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, -1, -1));

        stateJComboBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        stateJComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stateJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateJComboBoxActionPerformed(evt);
            }
        });
        add(stateJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 210, -1));

        genderJComboBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        genderJComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        genderJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderJComboBoxActionPerformed(evt);
            }
        });
        add(genderJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 180, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setText("New Form");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 680, 120, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 980, 10));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText("Cancer Status");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, 150, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 30, 250));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setText("BIO Details");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 110, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setText("Address Details");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 150, -1));

        hlaTypesText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        hlaTypesText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hlaTypesTextActionPerformed(evt);
            }
        });
        add(hlaTypesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, 170, -1));

        btnBack.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 680, 110, 40));

        diagnosedDateChooser.setBackground(new java.awt.Color(255, 255, 255));
        diagnosedDateChooser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(diagnosedDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 560, 190, -1));

        dobDateField.setBackground(new java.awt.Color(255, 255, 255));
        dobDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(dobDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 180, -1));

        lblProfilePicture.setBackground(new java.awt.Color(0, 0, 0));
        lblProfilePicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        lblProfilePicture.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        add(lblProfilePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 120, 130, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PatientRequest patientrequest = new PatientRequest();//system.getPatientRequestDirectory().addPatientRequest();
        if ( lblProfilePicture == null ){
            lblProfilePicture.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblProfilePicture.setForeground(Color.red);
            btnAddPhoto.setBorder(BorderFactory.createLineBorder(Color.RED));
            btnAddPhoto.setForeground(Color.red);
        }
        if ( stateJComboBox.getSelectedItem().equals("") ){
            stateJComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            stateJComboBox.setForeground(Color.red);
        }
        if ( genderJComboBox.getSelectedItem().equals("") ){
            genderJComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            genderJComboBox.setForeground(Color.red);
        }
        if ( hlaTypesText.getText().equals("") ){
            hlaTypesText.setBorder(BorderFactory.createLineBorder(Color.RED));
            hlaTypesText.setForeground(Color.red);
        }
        if (nameText.getText().isEmpty()) {
            nameText.setBorder(BorderFactory.createLineBorder(Color.RED));
            nameText.setForeground(Color.red);
        }
        if (uidText.getText().isEmpty()) {
            uidText.setBorder(BorderFactory.createLineBorder(Color.RED));
            uidText.setForeground(Color.red);
        }
        if (emailText.getText().isEmpty()) {
            emailText.setBorder(BorderFactory.createLineBorder(Color.RED));
            emailText.setForeground(Color.red);
        }
        if (contactText.getText().isEmpty()) {
            contactText.setBorder(BorderFactory.createLineBorder(Color.RED));
            contactText.setForeground(Color.red);
        }
        if (zipText.getText().isEmpty()) {
            zipText.setBorder(BorderFactory.createLineBorder(Color.RED));
            zipText.setForeground(Color.red);
        }
        if (cityText.getText().isEmpty()) {
            cityText.setBorder(BorderFactory.createLineBorder(Color.RED));
            cityText.setForeground(Color.red);
        }
        if (streetText.getText().isEmpty()) {
            streetText.setBorder(BorderFactory.createLineBorder(Color.RED));
            streetText.setForeground(Color.red);
        }
        if (diagnosedDateChooser.getDate() == null ) {
            diagnosedDateChooser.setBorder(BorderFactory.createLineBorder(Color.RED));
            diagnosedDateChooser.setForeground(Color.red);
        }
        if (dobDateField.getDate() == null ) {
            dobDateField.setBorder(BorderFactory.createLineBorder(Color.RED));
            dobDateField.setForeground(Color.red);
        }
        if (ageText.getText().isEmpty()) {
            ageText.setBorder(BorderFactory.createLineBorder(Color.RED));
            ageText.setForeground(Color.red);
        }

        //
        //
        if (    nameText.getText().isEmpty() || emailText.getText().isEmpty() || cityText.getText().isEmpty() ||contactText.getText().isEmpty() ||
            zipText.getText().isEmpty() || streetText.getText().isEmpty() || uidText.getText().isEmpty() ||
            dobDateField.getDate() == null || diagnosedDateChooser.getDate() == null || ageText.getText().isEmpty() ||
            String.valueOf(genderJComboBox.getSelectedItem()).equals("") ||
            String.valueOf(hlaTypesText.getText()).equals("") ||
            String.valueOf(stateJComboBox.getSelectedItem()).equals("") ||
            lblProfilePicture == null
        )

        {
            JOptionPane.showMessageDialog(null,new JLabel(  "<html><b>All fields are mandatory!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
            return ;
            //    JOptionPane.showMessageDialog(null, "All fields are mandatory!", "Error", JOptionPane.ERROR_MESSAGE);
            //   return ;
        }

        else if(  !buttonNo.isSelected()  &&  !buttonYes.isSelected())
        {
            JOptionPane.showMessageDialog(null,new JLabel(  "<html><b>All fields are mandatory!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
            return ;
            //JOptionPane.showMessageDialog(null, "All fields are mandatory!", "Error", JOptionPane.ERROR_MESSAGE);

        }

        else   if ( !phoneNumberValidator(contactText.getText())   ){
            contactText.setBorder(BorderFactory.createLineBorder(Color.RED));
            contactText.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("<html><b>Contact Number should be 10 digit!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
            // return;
            //JOptionPane.showMessageDialog(null, "Contact number should be 10 digit" , "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        else   if (  !zipCodeValidator(zipText.getText()) ){
            zipText.setBorder(BorderFactory.createLineBorder(Color.RED));
            zipText.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("<html><b>Zip should be 5 digit!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
            return;
            //JOptionPane.showMessageDialog(null, "Zip should be 5 digit" , "Error", JOptionPane.ERROR_MESSAGE);
            // return;
        }

        else if (!isAlpha(nameText.getText()))
        {
            nameText.setBorder(BorderFactory.createLineBorder(Color.RED));
            nameText.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("<html><b>Name must contain only alphabets</b>!</html>") , "Error", JOptionPane.ERROR_MESSAGE);
            return;
            //JOptionPane.showMessageDialog(null, "Name must contain only alphabets." , "Error", JOptionPane.ERROR_MESSAGE);
            //return;
        }
        else if (!isAlpha(cityText.getText()))
        {
            cityText.setBorder(BorderFactory.createLineBorder(Color.RED));
            cityText.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("<html><b>Name of the City must contain only alphabets!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
            return;
            //JOptionPane.showMessageDialog(null, "City name must contain only alphabets." , "Error", JOptionPane.ERROR_MESSAGE);
            //return;
        }

        else   if ( !emailValidator(emailText.getText()) ){
            emailText.setBorder(BorderFactory.createLineBorder(Color.RED));
            emailText.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("<html><b>Email ID must be in correct format!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
            //           JOptionPane.showMessageDialog(null, "Email ID must be in correct format!" , "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //
        //
        //

        else{
            try {
                patientrequest.getHla().updateHLAlist(hlaTypesText.getText());
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Patient's HLA Type can only be one of these HLA_A,HLA_B,HLA_C,HLA_DR,HLA_DBQ1</b></html>"));
                return;
            }

            int n = JOptionPane.showConfirmDialog(null,new JLabel("<html><b>Would you like to submit the form?</b></html>"),
                "CONFIRMATION REQUIRED",JOptionPane.YES_NO_OPTION);

            if(n == 0)
            {

                patientrequest.setReceiverID(uidText.getText()); //UID, receiverID
                patientrequest.setName(nameText.getText()); // Name
                patientrequest.setDob(dobDateField.getDate()); // DOB
                patientrequest.setCancerDiagnosedDate(diagnosedDateChooser.getDate()); // cancerDiagnosedDate
                patientrequest.setAge(Integer.parseInt(ageText.getText())); // Age
                patientrequest.setGender((String)genderJComboBox.getSelectedItem()); // gender

                //        patientrequest.getHla().updateHLAlist((String) hlaTypesText.getText()); // HLAType
                patientrequest.setStreetAddress(streetText.getText()); // streetAddress
                patientrequest.setCity(cityText.getText()); // city
                patientrequest.setState((String) stateJComboBox.getSelectedItem()); // state
                patientrequest.setZipCode(Integer.parseInt(zipText.getText())); // zipCode
                patientrequest.setContact(Long.parseLong(contactText.getText())); // contact
                patientrequest.setEmailID(emailText.getText()); // emailID
                patientrequest.setStatus("New Request"); // status
                patientrequest.setdP(tempdP);

                system.getPatientRequestDirectory().addPatientRequest(patientrequest);

                if(buttonYes.isSelected())
                {patientrequest.setLabConfirmation(true); //  labConfirmation
                }
                else if(buttonNo.isSelected())
                {patientrequest.setLabConfirmation(false); //  labConfirmation
                }

                JOptionPane.showMessageDialog(null, new JLabel("<html><b>Thank you for registering! We will soon get back to you. <br>Take Care!!</b></html>"));

                dB4OUtil.storeSystem(system);
                disableAllButton();
            }}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void contactTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactTextActionPerformed

    private void emailTextuEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextuEmailKeyTyped
        // TODO add your handling code here:

        if (!emailValidator(emailText.getText())) {
            emailValid = false;
        } else {
            emailText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            emailValid = true;
            int delay = 2500; //milliseconds
            ActionListener taskPerformer = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                }
            };
            javax.swing.Timer tick = new javax.swing.Timer(delay, taskPerformer);
            tick.setRepeats(false);
            tick.start();
        }

    }//GEN-LAST:event_emailTextuEmailKeyTyped

    private void ageTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageTextMouseClicked
        // TODO add your handling code here:
        Date dob = dobDateField.getDate();
        System.out.println(dob.getYear());
        ageText.setText((String.valueOf(new Date().getYear()-dob.getYear())));

    }//GEN-LAST:event_ageTextMouseClicked

    private void btnAddPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPhotoActionPerformed
        // TODO add your handling code here:

        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.dir")));
        //filter the files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        //if the user click on save in Jfilechooser
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            tempdP = new byte[(int) selectedFile.length()];
            FileInputStream fis;
            try {
                fis = new FileInputStream(selectedFile);
                fis.read(tempdP);
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(NewDonorJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            lblProfilePicture.setIcon(ResizeImage(selectedFile.getAbsolutePath()));
            lblProfilePicture.setIcon(setPicture(selectedFile.getAbsolutePath(),lblProfilePicture));
        }

        else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No File Select");
        }

    }//GEN-LAST:event_btnAddPhotoActionPerformed

    private void stateJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateJComboBoxActionPerformed

    }//GEN-LAST:event_stateJComboBoxActionPerformed

    private void genderJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderJComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        lblProfilePicture.setIcon(null);
        radioGroup1.clearSelection();
        // buttonYes.setSelected(false);
        // buttonYes.resetKeyboardActions();
        uidText.setEnabled(true);
        nameText.setEnabled(true);
        dobDateField.setEnabled(true);
        ageText.setEnabled(false);
        emailText.setEnabled(true);
        contactText.setEnabled(true);
        genderJComboBox.setEnabled(true);
        hlaTypesText.setEnabled(true);
        diagnosedDateChooser.setEnabled(true);
        streetText.setEnabled(true);
        cityText.setEnabled(true);
        stateJComboBox.setEnabled(true);
        zipText.setEnabled(true);
        buttonYes.setEnabled(true);
        buttonNo.setEnabled(true);
        btnAddPhoto.setEnabled(true);

        uidText.setText("");
        nameText.setText("");
        ageText.setText("");
        emailText.setText("");
        contactText.setText("");
        streetText.setText("");
        cityText.setText("");
        zipText.setText("");
        hlaTypesText.setText("");

        genderJComboBox.setSelectedItem("");
        stateJComboBox.setSelectedItem("");

        dobDateField.setCalendar(null);
        diagnosedDateChooser.setCalendar(null);

        // ButtonGroup radioGroup1 = new ButtonGroup();
        lblProfilePicture.removeAll();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void hlaTypesTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hlaTypesTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hlaTypesTextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        JFrame frame = (JFrame) getWindowAncestor(this);
        frame.dispose();
        NewReceiverJPanel.super.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageText;
    private javax.swing.JButton btnAddPhoto;
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton buttonNo;
    private javax.swing.JRadioButton buttonYes;
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField contactText;
    private com.toedter.calendar.JDateChooser diagnosedDateChooser;
    private com.toedter.calendar.JDateChooser dobDateField;
    private javax.swing.JTextField emailText;
    private javax.swing.JComboBox genderJComboBox;
    private javax.swing.JTextField hlaTypesText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblProfilePicture;
    private javax.swing.JTextField nameText;
    private javax.swing.JComboBox stateJComboBox;
    private javax.swing.JTextField streetText;
    private javax.swing.JTextField uidText;
    private javax.swing.JTextField zipText;
    // End of variables declaration//GEN-END:variables
}
