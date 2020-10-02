
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mjed
 */
public class Add_Customer extends javax.swing.JFrame {

    /**
     * Creates new form Add_Customer
     */
    public Add_Customer() {
        initComponents();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cus_address = new javax.swing.JTextField();
        cus_mname = new javax.swing.JTextField();
        cus_add = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cus_lname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cus_phone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cus_fname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Middle Name");

        jLabel8.setText("Address");

        cus_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_addressActionPerformed(evt);
            }
        });

        cus_mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_mnameActionPerformed(evt);
            }
        });

        cus_add.setText("Add");
        cus_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_addActionPerformed(evt);
            }
        });

        jLabel6.setText("Last Name");

        cus_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_lnameActionPerformed(evt);
            }
        });

        jLabel2.setText("Adding Customer");

        jLabel3.setText("Phone");

        cus_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_phoneActionPerformed(evt);
            }
        });

        jLabel4.setText("First Name");

        cus_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_fnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cus_address, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(cus_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cus_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(21, 21, 21)))))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cus_mname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cus_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cus_add)
                .addGap(221, 221, 221))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cus_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cus_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cus_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cus_mname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cus_address, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(cus_add)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cus_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cus_addressActionPerformed

    private void cus_mnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_mnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cus_mnameActionPerformed

    private void cus_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_addActionPerformed
        // TODO add your handling code here:
        try {
            if (cus_phone.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Phone is empty.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (cus_fname.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "First name is empty", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (cus_mname.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Middle  name is empty", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (cus_lname.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Last name is empty.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (cus_address.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Customer Address is empty.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                //insert into Dependent values(0532512490,'Saeed', 'Mastour', 'AlHarbi', 7);
                String querue = "insert into Customer values(" + cus_phone.getText() + ",'" + cus_fname.getText() + "','" + cus_mname.getText() + "','" + cus_lname.getText() + "','" + cus_address.getText() + "')";
                Statement st = con.prepareStatement(querue);
                ResultSet rs = st.executeQuery(querue);

                querue = "commit";
                st = con.prepareStatement(querue);
                rs = st.executeQuery(querue);

                JOptionPane.showMessageDialog(this, "Customer Added");
                this.setVisible(false);
                this.dispose();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_cus_addActionPerformed

    private void cus_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cus_lnameActionPerformed

    private void cus_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cus_phoneActionPerformed

    private void cus_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cus_fnameActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Customer().setVisible(true);
            }
        });
    }
    Connection con;

    public void setConnection(Connection con) {
        this.con = con;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cus_add;
    private javax.swing.JTextField cus_address;
    private javax.swing.JTextField cus_fname;
    private javax.swing.JTextField cus_lname;
    private javax.swing.JTextField cus_mname;
    private javax.swing.JTextField cus_phone;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
