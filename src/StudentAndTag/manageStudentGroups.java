/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentAndTag;
import forConnection.connect;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Sajee
 */
public class manageStudentGroups extends javax.swing.JFrame {
    connect cObj = new connect(); 
    PreparedStatement pst;
    ResultSet rs;
    
    public manageStudentGroups() {
             
        initComponents(); 
        getDataFromDatabase();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtGroupNumber = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        txtSubGroupNumber = new javax.swing.JSpinner();
        txtGroupId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableOfStudentsGroups = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtAcademicYear = new javax.swing.JTextField();
        txtProgramme = new javax.swing.JTextField();
        txtSemester = new javax.swing.JTextField();
        cboxAcademicYear = new javax.swing.JComboBox<>();
        cboxProgramme = new javax.swing.JComboBox<>();
        cboxSemi = new javax.swing.JComboBox<>();
        btnOK = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        sId = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(130, 130, 242));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Academic Year :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Semester :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Programme :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Group Number :");

        txtGroupNumber.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        txtGroupNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Sub Group Number :");

        txtSubGroupNumber.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        txtSubGroupNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtGroupId.setEditable(false);
        txtGroupId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtGroupId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(196, 196, 232), 3));
        txtGroupId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGroupIdActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Group Id :");

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(192, 30, 30));
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(234, 29, 29), 4, true));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 116, 70));
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 4, true));
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(25, 25, 232));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(38, 38, 225), 4, true));
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        TableOfStudentsGroups.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        TableOfStudentsGroups.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TableOfStudentsGroups.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "AcademicYear", "Semester", "Programme", "GroupNumber", "SubGroupNumber", "GroupId"
            }
        ));
        TableOfStudentsGroups.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TableOfStudentsGroups.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                TableOfStudentsGroupsComponentAdded(evt);
            }
        });
        TableOfStudentsGroups.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableOfStudentsGroupsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableOfStudentsGroups);
        if (TableOfStudentsGroups.getColumnModel().getColumnCount() > 0) {
            TableOfStudentsGroups.getColumnModel().getColumn(0).setHeaderValue("ID");
            TableOfStudentsGroups.getColumnModel().getColumn(5).setHeaderValue("SubGroupNumber");
            TableOfStudentsGroups.getColumnModel().getColumn(6).setHeaderValue("GroupId");
        }

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Students Groups");

        txtAcademicYear.setEditable(false);
        txtAcademicYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAcademicYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(196, 196, 232), 3));
        txtAcademicYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcademicYearActionPerformed(evt);
            }
        });

        txtProgramme.setEditable(false);
        txtProgramme.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtProgramme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(196, 196, 232), 3));
        txtProgramme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProgrammeActionPerformed(evt);
            }
        });

        txtSemester.setEditable(false);
        txtSemester.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSemester.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(196, 196, 232), 3));
        txtSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemesterActionPerformed(evt);
            }
        });

        cboxAcademicYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Y1", "Y2", "Y3", "Y4" }));
        cboxAcademicYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxAcademicYearActionPerformed(evt);
            }
        });

        cboxProgramme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "IT", "SE", "CN", "DS", "Cyber" }));
        cboxProgramme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxProgrammeActionPerformed(evt);
            }
        });

        cboxSemi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "S1", "S2" }));
        cboxSemi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxSemiActionPerformed(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 191, 245), 3, true));
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("ID :");

        sId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        btnRefresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sajee\\Documents\\NetBeansProjects\\TimeTableManagement\\Refresh-icon_1.png")); // NOI18N
        btnRefresh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(16, 16, 148), 4, true));
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sId, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(1, 1, 1)
                                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtGroupNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtSubGroupNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cboxProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtGroupId, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cboxSemi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtAcademicYear, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cboxAcademicYear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 41, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(sId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboxAcademicYear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAcademicYear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboxSemi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboxProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGroupNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSubGroupNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtGroupId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addComponent(btnOK, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGroupIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGroupIdActionPerformed
        
    }//GEN-LAST:event_txtGroupIdActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
       DefaultTableModel table = (DefaultTableModel) TableOfStudentsGroups.getModel(); 
       Connection conn = cObj.getConnection();
        
        if(TableOfStudentsGroups.getSelectedRowCount() == 1)
        {
            try{                  
                    String deleteQuery = "delete from student where ID='"+ sId.getText() +"' ";
                    pst = conn.prepareStatement(deleteQuery);

                    int response = JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "DELETE", JOptionPane.YES_NO_OPTION);
                    if(response == JOptionPane.YES_OPTION)
                    {
                        pst.execute();
                        JOptionPane.showMessageDialog(null,"Latest Deleted ID: "+sId.getText());
                        
                        conn.close(); 
                    }
                }catch(Exception ex){

                } 
            //---for refresh / update Table---
            updateTable();
        }  
        else
        {   //---if table empty---
            if(TableOfStudentsGroups.getRowCount() == 0)
            {
                JOptionPane.showMessageDialog(this, "Now, Table is Empty.");
            }
            //---if not select any row---
            else
            {
                   JOptionPane.showMessageDialog(this,"Please Select row.");
            }    
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        addStudents addPage = new addStudents();
        addPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String stuId = txtAcademicYear.getText().toString()+"_"+txtSemester.getText().toString()+"_"
                          +txtProgramme.getText().toString()+"_"+(Integer) txtGroupNumber.getValue()+"."+(Integer) txtSubGroupNumber.getValue();
       
        DefaultTableModel table = (DefaultTableModel) TableOfStudentsGroups.getModel(); 
        if(TableOfStudentsGroups.getSelectedRowCount() == 1)
        {
            if(txtAcademicYear.getText().isEmpty())
                JOptionPane.showMessageDialog(null,"Please Enter the Academic Year.");
            else if(txtSemester.getText().isEmpty())
                JOptionPane.showMessageDialog(null,"Please Enter the Semester.");
            else if(txtProgramme.getText().isEmpty())
                JOptionPane.showMessageDialog(null,"Please Enter the Programme.");
            else if(txtGroupNumber.getValue().equals(0))
                JOptionPane.showMessageDialog(null,"Please Enter the Group Number.");
            else if(txtSubGroupNumber.getValue().equals(0))
                JOptionPane.showMessageDialog(null,"Please Enter the Sub Group Number.");
            else
            {
                try{
                        Connection conn = cObj.getConnection();
                        String updateQuery = " Update student Set AcademicYear='"+txtAcademicYear.getText()+"', Semester='"+txtSemester.getText()+"', Programme='"+txtProgramme.getText()+
                                "',GroupNumber='"+(Integer) txtGroupNumber.getValue()+"', SubGroupNumber='"+(Integer) txtSubGroupNumber.getValue()+"',GroupId='"+stuId+
                                "'  where ID='"+sId.getText()+"' ";
                        pst = conn.prepareStatement(updateQuery);
                        
                        int response = JOptionPane.showConfirmDialog(null, "Are you sure to Update?", "UPDATE", JOptionPane.YES_NO_OPTION);
                        if(response == JOptionPane.YES_OPTION)
                        {
                            pst.executeUpdate();
                            JOptionPane.showMessageDialog(null,"ID: "+ sId.getText() + " Updated successfully!!!");
                        }
                        conn.close();

                    } catch (SQLException ex) {
                        System.err.println("Go to an exception!!!");                              
                        JOptionPane.showConfirmDialog(null, ex.getMessage());
                    }
                updateTable();
            }
        }
        else
        {
            if(TableOfStudentsGroups.getSelectedRow() == 0)
                JOptionPane.showMessageDialog(null,"Please Select row.");
            else
                 JOptionPane.showMessageDialog(null,"Now, Table is Empty.");
        }
           
            
       
    }//GEN-LAST:event_btnUpdateActionPerformed
    
    private void TableOfStudentsGroupsComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_TableOfStudentsGroupsComponentAdded
        
    }//GEN-LAST:event_TableOfStudentsGroupsComponentAdded
     // When user click/select on data from the table data willshow required phases...
    private void TableOfStudentsGroupsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableOfStudentsGroupsMouseClicked
        
        DefaultTableModel table = (DefaultTableModel) TableOfStudentsGroups.getModel();
        int selectedRow = TableOfStudentsGroups.getSelectedRow();
        
        sId.setText(table.getValueAt(selectedRow, 0).toString());
        txtAcademicYear.setText(table.getValueAt(selectedRow, 1).toString());
        txtSemester.setText(table.getValueAt(selectedRow, 2).toString());
        txtProgramme.setText(table.getValueAt(selectedRow, 3).toString());
        txtGroupNumber.setValue(table.getValueAt(selectedRow, 4));
        txtSubGroupNumber.setValue(table.getValueAt(selectedRow, 5));
        txtGroupId.setText(table.getValueAt(selectedRow, 6).toString());
        
    }//GEN-LAST:event_TableOfStudentsGroupsMouseClicked
    
    //data get from database....
    public void getDataFromDatabase()
    {
        try {
                Connection conn = cObj.getConnection();

                String q = " select * from student ";
                pst = conn.prepareStatement(q);
                rs = pst.executeQuery();

                TableOfStudentsGroups.setModel(DbUtils.resultSetToTableModel(rs));
          
        } catch (SQLException ex) {
                System.err.println("Go to an exception!!!");                              
                JOptionPane.showConfirmDialog(null, ex.getMessage());
        }
    }
    
    private void updateTable()
    {
        try{
            Connection conn = cObj.getConnection();
            String sql = "select * From student";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            TableOfStudentsGroups.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception ex){
            
        }
    }
        
    private void txtAcademicYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcademicYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcademicYearActionPerformed

    private void txtProgrammeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProgrammeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProgrammeActionPerformed

    private void txtSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemesterActionPerformed

    private void cboxAcademicYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxAcademicYearActionPerformed
        txtAcademicYear.setText(cboxAcademicYear.getSelectedItem().toString());
    }//GEN-LAST:event_cboxAcademicYearActionPerformed

    private void cboxSemiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxSemiActionPerformed
         txtSemester.setText(cboxSemi.getSelectedItem().toString());
    }//GEN-LAST:event_cboxSemiActionPerformed

    private void cboxProgrammeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxProgrammeActionPerformed
         txtProgramme.setText(cboxProgramme.getSelectedItem().toString());
    }//GEN-LAST:event_cboxProgrammeActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        txtGroupId.setText( txtAcademicYear.getText().toString()+"_"+txtSemester.getText().toString()+"_"
                          +txtProgramme.getText().toString()+"_"+(Integer) txtGroupNumber.getValue()+"."+(Integer) txtSubGroupNumber.getValue() );
              
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        manageStudentGroups thisPage = new manageStudentGroups();
        thisPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(manageStudentGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageStudentGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageStudentGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageStudentGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageStudentGroups().setVisible(true);
            }
            
        });
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable TableOfStudentsGroups;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboxAcademicYear;
    private javax.swing.JComboBox<String> cboxProgramme;
    private javax.swing.JComboBox<String> cboxSemi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel sId;
    private javax.swing.JTextField txtAcademicYear;
    private javax.swing.JTextField txtGroupId;
    private javax.swing.JSpinner txtGroupNumber;
    private javax.swing.JTextField txtProgramme;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JSpinner txtSubGroupNumber;
    // End of variables declaration//GEN-END:variables
}
