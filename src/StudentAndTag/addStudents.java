/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentAndTag;

import java.sql.*;
import javax.swing.JOptionPane;

import forConnection.connect;

/**
 *
 * @author Sajee
 */
public class addStudents extends javax.swing.JFrame {
    connect cObj = new connect(); 
    
    public addStudents() {             
        initComponents();                
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAcademicYear = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtSemester = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtProgramme = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtGroupNumber = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        txtSubGroupNumber = new javax.swing.JSpinner();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtGroupId = new javax.swing.JTextField();
        btnGenerateID = new javax.swing.JButton();
        btnmanageStudents = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(112, 241, 112));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Students Groups");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Academic Year :");

        txtAcademicYear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAcademicYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Y1", "Y2", "Y3", "Y4" }));
        txtAcademicYear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAcademicYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcademicYearActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Semester :");

        txtSemester.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "S1", "S2" }));
        txtSemester.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemesterActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Programme :");

        txtProgramme.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtProgramme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "IT", "SE", "CN", "DS", "Cyber" }));
        txtProgramme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtProgramme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProgrammeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Group Number :");

        txtGroupNumber.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        txtGroupNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Sub Group Number :");

        txtSubGroupNumber.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        txtSubGroupNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(192, 30, 30));
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(234, 29, 29), 3, true));
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(29, 103, 10));
        btnSave.setText("Save");
        btnSave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(19, 142, 42), 3, true));
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtGroupId.setEditable(false);
        txtGroupId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtGroupId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(196, 196, 232), 3));

        btnGenerateID.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnGenerateID.setForeground(new java.awt.Color(103, 103, 234));
        btnGenerateID.setText("Generate Id");
        btnGenerateID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(103, 103, 234), 2, true));
        btnGenerateID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerateID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateIDActionPerformed(evt);
            }
        });

        btnmanageStudents.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnmanageStudents.setForeground(new java.awt.Color(17, 17, 181));
        btnmanageStudents.setText("Go To Modify   >>>");
        btnmanageStudents.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 232), 3, true));
        btnmanageStudents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmanageStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageStudentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGroupNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSubGroupNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAcademicYear, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtGroupId, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGenerateID, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnmanageStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtAcademicYear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGroupId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtGroupNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(txtSubGroupNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(btnGenerateID)))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(btnmanageStudents)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAcademicYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcademicYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcademicYearActionPerformed

    private void txtSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemesterActionPerformed

    private void txtProgrammeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProgrammeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProgrammeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        homeForStudentAndTag homePage = new homeForStudentAndTag();
        homePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String aYear = txtAcademicYear.getSelectedItem().toString();
        String semi = txtSemester.getSelectedItem().toString();
        String pro = txtProgramme.getSelectedItem().toString();
        int gNum = (Integer) txtGroupNumber.getValue();
        int sgNum =  (Integer) txtSubGroupNumber.getValue();
        
        if(aYear.isEmpty())
            JOptionPane.showMessageDialog(null, "Please Enter Academic Year.");
        else if(semi.isEmpty())
            JOptionPane.showMessageDialog(null, "Please Enter Semester.");
        else if(pro.isEmpty())
            JOptionPane.showMessageDialog(null, "Please Enter Programme.");
        else if(gNum == 0)
            JOptionPane.showMessageDialog(null, "Please Enter Group Number.");
        else if( sgNum == 0)
            JOptionPane.showMessageDialog(null, "Please Enter the Sub Group Number.");
        else
        {
            try{
                    Connection conn = cObj.getConnection();
                    String insertQuery = " insert into student (AcademicYear, Semester, Programme, GroupNumber,SubGroupNumber, GroupId)" +" values(?,?,?,?,?,?)";

                        PreparedStatement pState = conn.prepareStatement(insertQuery);
                        pState.setString(1, aYear);
                        pState.setString(2, semi);
                        pState.setString(3, pro);
                        pState.setInt(4,gNum);
                        pState.setInt(5, sgNum);
                        pState.setString(6, aYear + "_"+semi+"_" + pro + "_"+ gNum +"."+ sgNum );
                        
                        int response = JOptionPane.showConfirmDialog(null, "Do you want to Save?", "INSERT", JOptionPane.YES_NO_OPTION);
                        if(response == JOptionPane.YES_OPTION)
                        {
                            pState.execute(); 
                            JOptionPane.showMessageDialog(null,"data successfully added!!!");
                        }
                        conn.close();
                }catch (SQLException ex) {

                        System.err.println("Go to an exception!!!");                              
                        JOptionPane.showConfirmDialog(null, ex.getMessage());
                }
        }
               
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnGenerateIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateIDActionPerformed
        txtGroupId.setText(txtAcademicYear.getSelectedItem().toString()+"_"+txtSemester.getSelectedItem().toString()+"_"
                          +txtProgramme.getSelectedItem().toString()+"_"+(Integer) txtGroupNumber.getValue()+"."+(Integer) txtSubGroupNumber.getValue());
        
    }//GEN-LAST:event_btnGenerateIDActionPerformed
    
    private void btnmanageStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageStudentsActionPerformed
        manageStudentGroups modify = new manageStudentGroups();
        modify.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnmanageStudentsActionPerformed

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
            java.util.logging.Logger.getLogger(addStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerateID;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnmanageStudents;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> txtAcademicYear;
    private javax.swing.JTextField txtGroupId;
    private javax.swing.JSpinner txtGroupNumber;
    private javax.swing.JComboBox<String> txtProgramme;
    private javax.swing.JComboBox<String> txtSemester;
    private javax.swing.JSpinner txtSubGroupNumber;
    // End of variables declaration//GEN-END:variables
}
