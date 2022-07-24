/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import java.sql.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class retureBook extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public retureBook() {
        initComponents();
        conn = ConnectionProvider.getConnDB();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtbookId = new javax.swing.JTextField();
        txtstudentId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtissuedate = new javax.swing.JTextField();
        txtduedate = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jLabel1.setText("Book ID :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 69, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jLabel2.setText("Student ID :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 127, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jLabel3.setText("Issue Date :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 186, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jLabel4.setText("Due Date :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 233, -1, -1));

        txtbookId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbookIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtbookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 66, 200, -1));
        getContentPane().add(txtstudentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 124, 200, -1));

        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\LibraryManagementSystem\\src\\librarymanagementsystem\\images\\return (1).png")); // NOI18N
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 284, -1, -1));

        jButton2.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\LibraryManagementSystem\\src\\librarymanagementsystem\\images\\button.png")); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 284, -1, -1));
        getContentPane().add(txtissuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 183, 200, -1));
        getContentPane().add(txtduedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 230, 200, -1));

        jButton3.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\LibraryManagementSystem\\src\\librarymanagementsystem\\images\\transparency.png")); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 119, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel5.setText("Return Book");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 11, 128, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\LibraryManagementSystem\\src\\librarymanagementsystem\\images\\b9deb08c-233f-4438-a28c-bbe79b4f5416.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 580, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbookIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbookIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbookIdActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        try {
            pstmt = conn.prepareStatement(" select bookID, studentId, issueDate, dueDate from issueBook where bookID = ? and studentId = ? ");
            int BookID = Integer.parseInt(txtbookId.getText());
            int StudentID = Integer.parseInt(txtstudentId.getText());
            
            pstmt.setInt(1, BookID);
            pstmt.setInt(2, StudentID);
             rs = pstmt.executeQuery();
            if (rs.next()== false) {
                JOptionPane.showMessageDialog(this, "Book is not Issued to this Student !!!");
                
                txtissuedate.setText("");
                txtduedate.setText("");
                txtbookId.requestFocus();
                txtstudentId.requestFocus();
                setVisible(false);
                new retureBook().setVisible(true);
                
            }
            else{
                
                txtissuedate.setText(rs.getString("issueDate"));
                txtduedate.setText(rs.getString("dueDate"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Error !!!");
        }               
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String BookID = txtbookId.getText();
        String StudentID = txtstudentId.getText();
        
              try {
            String sql = " Update issueBook set returnBook='YES' where bookID='"+BookID+"' and studentId='"+StudentID+"'";
            pstmt=conn.prepareStatement(sql);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Book Returned Successfully....");
            setVisible(false);
            new retureBook().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Somethings want wrong....");
            setVisible(false);
            new retureBook().setVisible(true);
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
          new Home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(retureBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(retureBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(retureBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(retureBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new retureBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtbookId;
    private javax.swing.JTextField txtduedate;
    private javax.swing.JTextField txtissuedate;
    private javax.swing.JTextField txtstudentId;
    // End of variables declaration//GEN-END:variables
}
