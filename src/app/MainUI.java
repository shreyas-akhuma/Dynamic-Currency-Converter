package app;

import javax.swing.JOptionPane;
import java.sql.*;

public class MainUI extends javax.swing.JFrame {

    public MainUI() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpass = new javax.swing.JPanel();
        label_name = new javax.swing.JLabel();
        label_accno = new javax.swing.JLabel();
        label_password = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();
        txt_name = new javax.swing.JTextField();
        txt_accno = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        label_title = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIIN WINDOW");
        setMaximumSize(new java.awt.Dimension(1089, 690));
        setPreferredSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jpass.setBackground(new java.awt.Color(51, 51, 51));
        jpass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 19, true));

        label_name.setFont(new java.awt.Font("Andalus", 1, 36)); // NOI18N
        label_name.setForeground(new java.awt.Color(255, 255, 0));
        label_name.setText("Customer Name");

        label_accno.setFont(new java.awt.Font("Andalus", 1, 36)); // NOI18N
        label_accno.setForeground(new java.awt.Color(255, 255, 0));
        label_accno.setText("Account No");

        label_password.setFont(new java.awt.Font("Andalus", 1, 36)); // NOI18N
        label_password.setForeground(new java.awt.Color(255, 255, 0));
        label_password.setText("Password");

        btn_submit.setBackground(new java.awt.Color(255, 255, 0));
        btn_submit.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        btn_submit.setForeground(new java.awt.Color(51, 51, 51));
        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        txt_name.setBackground(new java.awt.Color(255, 255, 0));
        txt_name.setFont(new java.awt.Font("Andalus", 1, 36)); // NOI18N
        txt_name.setForeground(new java.awt.Color(51, 51, 51));

        txt_accno.setBackground(new java.awt.Color(255, 255, 0));
        txt_accno.setFont(new java.awt.Font("Andalus", 1, 36)); // NOI18N
        txt_accno.setForeground(new java.awt.Color(51, 51, 51));

        txt_password.setBackground(new java.awt.Color(255, 255, 0));
        txt_password.setFont(new java.awt.Font("Andalus", 1, 36)); // NOI18N
        txt_password.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jpassLayout = new javax.swing.GroupLayout(jpass);
        jpass.setLayout(jpassLayout);
        jpassLayout.setHorizontalGroup(
            jpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpassLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_name)
                    .addComponent(label_accno)
                    .addComponent(label_password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_name)
                    .addComponent(txt_accno)
                    .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpassLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_submit)
                .addGap(400, 400, 400))
        );
        jpassLayout.setVerticalGroup(
            jpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpassLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_name)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_accno)
                    .addComponent(txt_accno, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_password))
                .addGap(44, 44, 44)
                .addComponent(btn_submit)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jpass);
        jpass.setBounds(40, 100, 1003, 550);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 0)));

        label_title.setBackground(new java.awt.Color(51, 51, 51));
        label_title.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label_title.setForeground(new java.awt.Color(255, 255, 204));
        label_title.setText("CURRENCY CONVERTER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_title))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(249, 26, 603, 62);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/MainUI.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background);
        background.setBounds(0, -10, 1110, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Submit Button">
    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        if(txt_name.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(MainUI.this,"Name Field is empty!");
            txt_name.grabFocus();
           return;
        }
        if(txt_accno.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(MainUI.this,"Account number absent!");
            txt_accno.grabFocus();
            return;
        }
        if(txt_password.getPassword().length == 0)
        {
            JOptionPane.showMessageDialog(MainUI.this,"Password Field is empty!");
            txt_password.grabFocus();  
            return;
        }
        
        // <editor-fold defaultstate="collapsed" desc="SQL Connection & Logic">
        String cus_name = txt_name.getText().trim();
        String acc_num = txt_accno.getText().trim();
        String password = new String(txt_password.getPassword());
        
         Connection con = null;  
         Statement st = null;
         ResultSet rs = null;
         try 
         {  
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CURRINFO;integratedSecurity=true");  
  
            st = con.createStatement();  
            rs = st.executeQuery("SELECT * FROM INFO");  
            int count = 0;
            while (rs.next()) 
            {  
               if(cus_name.equals(rs.getString(1)) && acc_num.equals(rs.getString(2)) && password.equals(rs.getString(4)))
               {
                   First first_dialog = new First(cus_name);
                   first_dialog.setVisible(true);
                   count++;
                   break;
               }
            }
            if(count==0)
            {
                JOptionPane.showMessageDialog(MainUI.this,"Invalid Combination");
                txt_name.setText("");
                txt_accno.setText("");
                txt_password.setText("");
                return;
            }
         }  
         catch (Exception e) 
         {  
             System.out.println(e.getMessage());
         }  
         // </editor-fold>
         
        this.dispose();
    }//GEN-LAST:event_btn_submitActionPerformed
    // </editor-fold>
    
    public static void main(String args[]) 
    {
          
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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_submit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpass;
    private javax.swing.JLabel label_accno;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_title;
    private javax.swing.JTextField txt_accno;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}
