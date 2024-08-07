/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author ishaa
 */
public class PatientLogin extends javax.swing.JFrame {

    /**
     * Creates new form PatientLogin
     */
    public PatientLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        patient_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dob_year = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dob_month = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dob_day = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        login_btn = new javax.swing.JButton();
        reg_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(420, 250));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Login Page");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 30, 110, 25);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Enter Patient ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 97, 20);

        patient_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        patient_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patient_idActionPerformed(evt);
            }
        });
        getContentPane().add(patient_id);
        patient_id.setBounds(130, 90, 142, 26);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Enter DOB");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 170, 65, 20);

        dob_year.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dob_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dob_yearActionPerformed(evt);
            }
        });
        getContentPane().add(dob_year);
        dob_year.setBounds(100, 170, 72, 26);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("YYYY");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 140, 32, 20);

        dob_month.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dob_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dob_monthActionPerformed(evt);
            }
        });
        getContentPane().add(dob_month);
        dob_month.setBounds(190, 170, 55, 26);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("MM");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 140, 26, 20);

        dob_day.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dob_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dob_dayActionPerformed(evt);
            }
        });
        getContentPane().add(dob_day);
        dob_day.setBounds(260, 170, 54, 26);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("DD");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 140, 20, 20);

        error.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        error.setForeground(new java.awt.Color(255, 51, 51));
        error.setText("    ");
        getContentPane().add(error);
        error.setBounds(20, 190, 346, 20);

        login_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_btn.setText("Log In");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        getContentPane().add(login_btn);
        login_btn.setBounds(50, 230, 105, 27);

        reg_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reg_btn.setText("Register as Patient");
        reg_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_btnActionPerformed(evt);
            }
        });
        getContentPane().add(reg_btn);
        reg_btn.setBounds(190, 230, 160, 27);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/istockphoto-1318860269-612x612.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setMaximumSize(new java.awt.Dimension(450, 250));
        jLabel7.setMinimumSize(new java.awt.Dimension(450, 250));
        jLabel7.setPreferredSize(new java.awt.Dimension(450, 250));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 610, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patient_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patient_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patient_idActionPerformed

    private void dob_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dob_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dob_yearActionPerformed

    private void dob_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dob_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dob_monthActionPerformed

    private void dob_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dob_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dob_dayActionPerformed

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        // TODO add your handling code here:
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_Management", "root", "!shuB0410");
            Statement s = con.createStatement();
            String pid = patient_id.getText();
            String yyyy = dob_year.getText();
            String mm = dob_month.getText();
            String dd = dob_day.getText();

            if (!pid.isEmpty() && !yyyy.isEmpty() && !mm.isEmpty() && !dd.isEmpty()) {
                String dob = yyyy + "-" + mm + "-" + dd;
                String query = "SELECT * FROM Patients WHERE Patient_ID = " + pid + " AND DOB = '" + dob + "'";
                ResultSet rs = s.executeQuery(query);

                if (rs.next()) {
                    // Patient details are correct
                    System.out.println("Patient details are correct.");
                    PatientMenu pm = new PatientMenu(Integer.parseInt(pid));
                    pm.setVisible(true);
                    this.setVisible(false);
                } else {
                    // Patient details are incorrect or not found
                    error.setText("Patient details are incorrect or not found.");
                    System.out.println("Patient details are incorrect or not found.");
                }
            } else {
                System.out.println("Please enter all fields.");
                error.setText("Please enter all fields");
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
            error.setText(e.toString());
        }
    }//GEN-LAST:event_login_btnActionPerformed

    private void reg_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_btnActionPerformed
        // TODO add your handling code here:
        PatientRegistration pg = new PatientRegistration();
        pg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_reg_btnActionPerformed

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
            java.util.logging.Logger.getLogger(PatientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dob_day;
    private javax.swing.JTextField dob_month;
    private javax.swing.JTextField dob_year;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton login_btn;
    private javax.swing.JTextField patient_id;
    private javax.swing.JButton reg_btn;
    // End of variables declaration//GEN-END:variables
}
