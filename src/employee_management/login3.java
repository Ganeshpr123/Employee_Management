/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_management;

import java.awt.Color;

/**
 *
 * @author ganesh_pradhan
 */
public class login3 extends javax.swing.JFrame {

    /**
     * Creates new form login3
     */
    public login3() {
        initComponents();
        err.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        Close_bb = new javax.swing.JPanel();
        Close_b = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        hide = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        err = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close_bb.setBackground(new java.awt.Color(255, 255, 255));
        Close_bb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Close_b.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        Close_b.setForeground(new java.awt.Color(255, 51, 0));
        Close_b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close_b.setText("×");
        Close_b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close_b.setPreferredSize(new java.awt.Dimension(40, 40));
        Close_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Close_bMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Close_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Close_bMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Close_bbLayout = new javax.swing.GroupLayout(Close_bb);
        Close_bb.setLayout(Close_bbLayout);
        Close_bbLayout.setHorizontalGroup(
            Close_bbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Close_bbLayout.createSequentialGroup()
                .addComponent(Close_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Close_bbLayout.setVerticalGroup(
            Close_bbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Close_b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.add(Close_bb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tablet login-rafiki.png"))); // NOI18N
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 740, 740));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 125, 254));
        jLabel2.setText("Welcome Back!");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 125, 254));
        jLabel3.setText("Login to Continue your Dashboard");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 300, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 125, 254));
        jLabel4.setText("Password:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 330, 110, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 125, 254));
        jLabel5.setText("Username:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 230, 110, 20));

        jLabel12.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 102));
        jLabel12.setText("Forgot Password?");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 110, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 125, 254)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/man-user.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 40, 50));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 125, 254));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 10, 290, 30));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 350, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 125, 254)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/padlock (4).png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 40, 50));

        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(0, 125, 254));
        pass.setBorder(null);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 250, 30));

        hide.setForeground(new java.awt.Color(102, 102, 102));
        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/h.png"))); // NOI18N
        hide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideMouseClicked(evt);
            }
        });
        jPanel2.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 40, 30));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 40, 30));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 350, 50));

        jPanel3.setBackground(new java.awt.Color(0, 125, 254));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Login");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 350, -1));

        err.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        err.setForeground(new java.awt.Color(255, 51, 102));
        err.setText("Error,.....");
        jPanel5.add(err, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 160, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1210, 741));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void hideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseClicked
        // TODO add your handling code here:
         hide.setVisible(false);
       show.setVisible(true);
       pass.setEchoChar((char)0);
    }//GEN-LAST:event_hideMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        // TODO add your handling code here:
     show.setVisible(false);
         hide.setVisible(true);
         pass.setEchoChar('*');
    }//GEN-LAST:event_showMouseClicked

    private void Close_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_bMouseExited
        // TODO add your handling code here:
        Close_bb.setBackground(new Color(255, 255, 255));
        Close_b.setForeground(new Color(14,73,181));
    }//GEN-LAST:event_Close_bMouseExited

    private void Close_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_bMouseEntered
        // TODO add your handling code here:
        Close_bb.setBackground(new Color(228, 0, 23));
        Close_b.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Close_bMouseEntered

    private void Close_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_bMouseClicked
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_Close_bMouseClicked

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
            java.util.logging.Logger.getLogger(login3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close_b;
    private javax.swing.JPanel Close_bb;
    private javax.swing.JLabel err;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
