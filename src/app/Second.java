package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Second extends javax.swing.JFrame {

    public Second() 
    {
        initComponents();
    }

    public Second(double converted,String cus_name) 
    {
        initComponents();
        String new_converted = String.format("%.4f", converted);
        eq_amt.setText(new_converted+" INR");
        label_txt.setText(cus_name);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_ok = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        equi_label = new javax.swing.JLabel();
        eq_amt = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        option_label = new javax.swing.JLabel();
        rbtn_dep = new javax.swing.JRadioButton();
        rbtn_wit = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        label_txt = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convert To INR");
        setMaximumSize(new java.awt.Dimension(487, 454));
        setPreferredSize(new java.awt.Dimension(490, 425));
        setResizable(false);
        getContentPane().setLayout(null);

        btn_ok.setBackground(new java.awt.Color(51, 51, 51));
        btn_ok.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        btn_ok.setForeground(new java.awt.Color(51, 51, 51));
        btn_ok.setText("Okay");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ok);
        btn_ok.setBounds(199, 337, 80, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 308, 487, 2);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));

        equi_label.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        equi_label.setForeground(new java.awt.Color(255, 255, 255));
        equi_label.setText("Equivalent Amount:");

        eq_amt.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        eq_amt.setForeground(new java.awt.Color(255, 255, 255));
        eq_amt.setText("**setText**");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(equi_label)
                .addGap(18, 18, 18)
                .addComponent(eq_amt)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equi_label)
                    .addComponent(eq_amt))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 80, 440, 80);

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));

        option_label.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        option_label.setForeground(new java.awt.Color(255, 255, 255));
        option_label.setText("Choose:");

        rbtn_dep.setBackground(new java.awt.Color(51, 51, 51));
        rbtn_dep.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        rbtn_dep.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_dep.setText("Deposit");
        rbtn_dep.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rbtn_dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_depActionPerformed(evt);
            }
        });

        rbtn_wit.setBackground(new java.awt.Color(51, 51, 51));
        rbtn_wit.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        rbtn_wit.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_wit.setText("Receive");
        rbtn_wit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rbtn_wit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_witActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(option_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtn_wit)
                    .addComponent(rbtn_dep))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(option_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(rbtn_dep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtn_wit)
                .addGap(5, 5, 5))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(130, 170, 220, 120);

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));

        label_txt.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        label_txt.setForeground(new java.awt.Color(255, 255, 255));
        label_txt.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_txt)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(label_txt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 20, 200, 50);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/Second.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background);
        background.setBounds(0, -20, 490, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Buttons">
    private void rbtn_depActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_depActionPerformed
        if(rbtn_dep.isSelected())
        {
            rbtn_wit.setSelected(false);
        }
    }//GEN-LAST:event_rbtn_depActionPerformed

    private void rbtn_witActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_witActionPerformed
        if(rbtn_wit.isSelected())
        {
            rbtn_dep.setSelected(false);
        }
    }//GEN-LAST:event_rbtn_witActionPerformed

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        if((rbtn_dep.isSelected())==false && (rbtn_wit.isSelected())==false)
         {
            JOptionPane.showMessageDialog(Second.this,"Choice not selected"); 
            return;
         }
       
        // <editor-fold defaultstate="collapsed" desc="SQL Connection & Logic">  
        if(rbtn_dep.isSelected())
        {
            Connection con = null;  
            Statement st = null;
            ResultSet rs = null;
            try 
            {  
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
                con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CURRINFO;integratedSecurity=true");  
                st = con.createStatement();  
                rs = st.executeQuery("SELECT * FROM INFO");  
                String eq_am = eq_amt.getText();
                eq_am = eq_am.substring(0,eq_am.length()-4);
                double bala = Double.parseDouble(eq_am);
                float bal =(float)bala;
                String custname=label_txt.getText();
                String SQL = "UPDATE INFO SET BALANCE = (BALANCE + ?) WHERE CUSTNAME = ?";
                PreparedStatement ps = con.prepareStatement(SQL);
                ps.setFloat(1, bal);
                ps.setString(2,custname);
                rs = ps.executeQuery();
            }  
            catch (Exception e) 
            {  
               System.out.println("error");
               System.out.println(e.getMessage());
            }  
            
        }
        else if(rbtn_wit.isSelected())
        {
            JOptionPane.showMessageDialog(Second.this,"Amount Withdrawn. Thank You!"); 
        }
          // </editor-fold> 
          
        Fourth fourth_dialog = new Fourth(label_txt.getText());
        fourth_dialog.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_okActionPerformed
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
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Second().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel eq_amt;
    private javax.swing.JLabel equi_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_txt;
    private javax.swing.JLabel option_label;
    private javax.swing.JRadioButton rbtn_dep;
    private javax.swing.JRadioButton rbtn_wit;
    // End of variables declaration//GEN-END:variables
}
