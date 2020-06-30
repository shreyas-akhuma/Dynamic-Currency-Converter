package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Fourth extends javax.swing.JFrame {

    public Fourth() 
    {
        initComponents();
    }
    
    public Fourth(String cus_name) 
    {
        initComponents();
        label_txt.setText(cus_name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_checkbal = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label_txt = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convert to INR");
        setPreferredSize(new java.awt.Dimension(245, 250));
        setResizable(false);
        getContentPane().setLayout(null);

        btn_checkbal.setBackground(new java.awt.Color(51, 51, 51));
        btn_checkbal.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        btn_checkbal.setForeground(new java.awt.Color(51, 51, 51));
        btn_checkbal.setText("Check Balance");
        btn_checkbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkbalActionPerformed(evt);
            }
        });
        getContentPane().add(btn_checkbal);
        btn_checkbal.setBounds(30, 90, 170, 40);

        btn_logout.setBackground(new java.awt.Color(51, 51, 51));
        btn_logout.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(51, 51, 51));
        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logout);
        btn_logout.setBounds(70, 150, 89, 37);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        label_txt.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        label_txt.setForeground(new java.awt.Color(255, 255, 255));
        label_txt.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_txt)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 190, 50);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/Second.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background);
        background.setBounds(-16, 0, 260, 230);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Buttons"> 
    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        MainUI mainui_dialog = new MainUI();
        mainui_dialog.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_checkbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkbalActionPerformed
        // <editor-fold defaultstate="collapsed" desc="SQL Connection & Logic">
         Connection con = null;  
         Statement st = null;
         ResultSet rs = null;
         try 
         {  
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CURRINFO;integratedSecurity=true");  
            st = con.createStatement();  
            rs = st.executeQuery("SELECT * FROM INFO");  
            while (rs.next()) 
            {  
               if(label_txt.getText().equals(rs.getString(1)))
               {
                   JOptionPane.showMessageDialog(Fourth.this,"Balance is " + Float.toString(rs.getFloat(3))+ " INR"); 
                   break;
               }
            }
         }  
         catch (Exception e) 
         {  
             System.out.println(e.getMessage());
         }  
         // </editor-fold>
    }//GEN-LAST:event_btn_checkbalActionPerformed
    // </editor-fold> 
    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fourth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fourth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fourth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fourth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Fourth().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_checkbal;
    private javax.swing.JButton btn_logout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_txt;
    // End of variables declaration//GEN-END:variables
}
