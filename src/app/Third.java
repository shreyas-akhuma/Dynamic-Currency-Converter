package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Third extends javax.swing.JFrame {

    public Third() 
    {
        initComponents();
    }

    public Third(double converted, String msg, String cus_name) 
    {
        initComponents();
        String new_converted = String.format("%.4f", converted);
        eq_amt.setText(new_converted+" "+msg);
        label_txt.setText(cus_name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_logout = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btn_checkbal = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        eq_amt = new javax.swing.JLabel();
        equi_label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label_txt = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convert From INR");
        setPreferredSize(new java.awt.Dimension(430, 315));
        setResizable(false);
        getContentPane().setLayout(null);

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
        btn_logout.setBounds(259, 220, 90, 37);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 202, 430, 10);

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
        btn_checkbal.setBounds(70, 220, 160, 37);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));

        eq_amt.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        eq_amt.setForeground(new java.awt.Color(51, 51, 51));
        eq_amt.setText("**setText**");

        equi_label.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        equi_label.setForeground(new java.awt.Color(51, 51, 51));
        equi_label.setText("Equivalent Amount:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(equi_label)
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eq_amt)
                .addGap(128, 128, 128))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(equi_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eq_amt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 70, 360, 110);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));

        label_txt.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        label_txt.setForeground(new java.awt.Color(255, 255, 255));
        label_txt.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_txt)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(label_txt)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 10, 200, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/Third.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background);
        background.setBounds(0, 0, 430, 290);

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
                   JOptionPane.showMessageDialog(Third.this,"Balance is " + Float.toString(rs.getFloat(3))+ " INR"); 
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
            java.util.logging.Logger.getLogger(Third.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Third.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Third.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Third.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Third().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_checkbal;
    private javax.swing.JButton btn_logout;
    private javax.swing.JLabel eq_amt;
    private javax.swing.JLabel equi_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_txt;
    // End of variables declaration//GEN-END:variables
}
