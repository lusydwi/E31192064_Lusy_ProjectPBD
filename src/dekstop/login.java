/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dekstop;

import java.sql.Connection;
import java.awt.Color;
import java.awt.Container;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lusy
 */
public class login extends javax.swing.JFrame {
    Connection con;
    Statement state;
    ResultSet rs;
    String sql;
   
   
    /**
     * Creates new form login
     */

    public login() {
        Container c = getContentPane(); 
        c.setBackground(new Color(255,204,255));
        initComponents();
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        state = DB.st;
        
    }
    
    public boolean validation()
    {
        String username, password;
        username = txtusernm.getText();
        password = txtpasswd.getText();
        if (username.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Mohon masukkan username Anda");
            return false;
        }
        if (password.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Mohon masukkan password Anda");
            return false;
        }
        return true;
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
        txtusernm = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtpasswd = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        baru = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, null, java.awt.Color.white));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 70));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Username : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 130, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Password :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 90, 30));
        jPanel1.add(txtusernm, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 170, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lusy\\Documents\\NetBeansProjects\\icon\\user-male-circle (1).png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));
        jPanel1.add(txtpasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 170, 30));

        login.setBackground(new java.awt.Color(204, 153, 255));
        login.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        login.setForeground(new java.awt.Color(102, 0, 0));
        login.setText("Login");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 70, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("belum punya akun? ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        baru.setBackground(new java.awt.Color(255, 204, 204));
        baru.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        baru.setForeground(new java.awt.Color(102, 0, 51));
        baru.setText("klik disini");
        baru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baruActionPerformed(evt);
            }
        });
        jPanel1.add(baru, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 80, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 520, 360));

        setSize(new java.awt.Dimension(699, 493));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
    validation();
    }//GEN-LAST:event_loginMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
    try{
        sql = "SELECT * FROM data WHERE username = '"+txtusernm.getText()+"'AND password='"+txtpasswd.getText()+"'";
        rs = state.executeQuery(sql);
        if (rs.next()){
            if (txtusernm.getText().equals(rs.getString("username"))&&txtpasswd.getText().equals(rs.getString("password"))){
                JOptionPane.showMessageDialog(null, "Login Berhasil");
                dashboard dsb= new dashboard();
                dsb.setVisible(true);
                this.dispose();
            }
        }else{
                JOptionPane.showMessageDialog(null, "username atau password Anda salah");
        }
    }catch (Exception e){
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
  
    }//GEN-LAST:event_loginActionPerformed

    private void baruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baruActionPerformed
    akun a= new akun();
                a.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_baruActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField txtpasswd;
    private javax.swing.JTextField txtusernm;
    // End of variables declaration//GEN-END:variables
}
