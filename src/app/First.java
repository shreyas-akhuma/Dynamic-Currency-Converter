package app;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import org.json.JSONObject;

public class First extends javax.swing.JFrame {

    public First() 
    {
        initComponents();
    }
    
    public First(String cus_name) 
    {
        initComponents();
        Choice_currency();
        label_txt.setText(cus_name);
    }
    
    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        txt_amt = new javax.swing.JTextField();
        btn_proc = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        L1 = new javax.swing.JLabel();
        rbtn_to = new javax.swing.JRadioButton();
        rbtn_from = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        ch_curr = new java.awt.Choice();
        L3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        label_txt = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        L2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stage I");
        setBackground(new java.awt.Color(153, 255, 255));
        setMaximumSize(new java.awt.Dimension(412, 571));
        setPreferredSize(new java.awt.Dimension(412, 571));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 229, 412, 10);

        txt_amt.setBackground(new java.awt.Color(51, 51, 51));
        txt_amt.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        txt_amt.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_amt);
        txt_amt.setBounds(110, 460, 170, 34);

        btn_proc.setBackground(new java.awt.Color(51, 51, 51));
        btn_proc.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        btn_proc.setForeground(new java.awt.Color(51, 51, 51));
        btn_proc.setText("Proceed");
        btn_proc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procActionPerformed(evt);
            }
        });
        getContentPane().add(btn_proc);
        btn_proc.setBounds(150, 500, 97, 37);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 391, 412, 2);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));

        L1.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        L1.setForeground(new java.awt.Color(255, 255, 255));
        L1.setText("Convert:");

        rbtn_to.setBackground(new java.awt.Color(51, 51, 51));
        rbtn_to.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        rbtn_to.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_to.setText("to Indian Rupee");
        rbtn_to.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rbtn_to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_toActionPerformed(evt);
            }
        });

        rbtn_from.setBackground(new java.awt.Color(51, 51, 51));
        rbtn_from.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        rbtn_from.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_from.setText("from Indian Rupee");
        rbtn_from.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rbtn_from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_fromActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtn_from)
                    .addComponent(rbtn_to))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(rbtn_to)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtn_from))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(L1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 90, 309, 132);

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));

        ch_curr.setBackground(new java.awt.Color(51, 51, 51));
        ch_curr.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        ch_curr.setForeground(new java.awt.Color(255, 255, 255));

        L3.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        L3.setForeground(new java.awt.Color(255, 255, 255));
        L3.setText("Select Currency:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(ch_curr, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ch_curr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 250, 324, 120);

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        label_txt.setBackground(new java.awt.Color(255, 255, 255));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_txt)
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(40, 10, 240, 56);

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));

        L2.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        L2.setForeground(new java.awt.Color(255, 255, 255));
        L2.setText("Amount:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(L2))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(40, 410, 115, 42);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/First.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background);
        background.setBounds(0, 0, 410, 550);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void Choice_currency()
    {
        ch_curr.add("AED");
        ch_curr.add("AFN");
        ch_curr.add("ALL");
        ch_curr.add("AMD");
        ch_curr.add("ANG");
        ch_curr.add("AOA");
        ch_curr.add("ARS");
        ch_curr.add("AUD");
        ch_curr.add("AWG");
        ch_curr.add("AZN");
        ch_curr.add("BAM");
        ch_curr.add("BBD");
        ch_curr.add("BDT");
        ch_curr.add("BGN");
        ch_curr.add("BHD");
        ch_curr.add("BIF");
        ch_curr.add("BMD");
        ch_curr.add("BND");
        ch_curr.add("BOB");
        ch_curr.add("BRL");
        ch_curr.add("BSD");
        ch_curr.add("BTC");
        ch_curr.add("BTN");
        ch_curr.add("BWP");
        ch_curr.add("BYN");
        ch_curr.add("BYR");
        ch_curr.add("BZD");
        ch_curr.add("CAD");
        ch_curr.add("CDF");
        ch_curr.add("CHF");
        ch_curr.add("CLF");
        ch_curr.add("CLP");
        ch_curr.add("CNY");
        ch_curr.add("COP");
        ch_curr.add("CRC");
        ch_curr.add("CUC");
        ch_curr.add("CUP");
        ch_curr.add("CVE");
        ch_curr.add("CZK");
        ch_curr.add("DJF");
        ch_curr.add("DKK");
        ch_curr.add("DOP");
        ch_curr.add("DZD");
        ch_curr.add("EGP");
        ch_curr.add("ERN");
        ch_curr.add("ETB");
        ch_curr.add("EUR");
        ch_curr.add("FJD");
        ch_curr.add("FKP");
        ch_curr.add("GBP");
        ch_curr.add("GEL");
        ch_curr.add("GGP");
        ch_curr.add("GHS");
        ch_curr.add("GIP");
        ch_curr.add("GMD");
        ch_curr.add("GNF");
        ch_curr.add("GTQ");
        ch_curr.add("GYD");
        ch_curr.add("HKD");
        ch_curr.add("HNL");
        ch_curr.add("HRK");
        ch_curr.add("HTG");
        ch_curr.add("HUF");
        ch_curr.add("IDR");
        ch_curr.add("ILS");
        ch_curr.add("IMP");
        ch_curr.add("INR");
        ch_curr.add("IQD");
        ch_curr.add("IRR");
        ch_curr.add("ISK");
        ch_curr.add("JEP");
        ch_curr.add("JMD");
        ch_curr.add("JOD");
        ch_curr.add("JPY");
        ch_curr.add("KES");
        ch_curr.add("KGS");
        ch_curr.add("KHR");
        ch_curr.add("KMF");
        ch_curr.add("KPW");
        ch_curr.add("KRW");
        ch_curr.add("KWD");
        ch_curr.add("KYD");
        ch_curr.add("KZT");
        ch_curr.add("LAK");
        ch_curr.add("LBP");
        ch_curr.add("LKR");
        ch_curr.add("LRD");
        ch_curr.add("LSL");
        ch_curr.add("LTL");
        ch_curr.add("LVL");
        ch_curr.add("LYD");
        ch_curr.add("MAD");
        ch_curr.add("MDL");
        ch_curr.add("MGA");
        ch_curr.add("MKD");
        ch_curr.add("MMK");
        ch_curr.add("MNT");
        ch_curr.add("MOP");
        ch_curr.add("MRO");
        ch_curr.add("MUR");
        ch_curr.add("MVR");
        ch_curr.add("MWK");
        ch_curr.add("MXN");
        ch_curr.add("MYR");
        ch_curr.add("MZN");
        ch_curr.add("NAD");
        ch_curr.add("NGN");
        ch_curr.add("NIO");
        ch_curr.add("NOK");
        ch_curr.add("NPR");
        ch_curr.add("NZD");
        ch_curr.add("OMR");
        ch_curr.add("PAB");
        ch_curr.add("PEN");
        ch_curr.add("PGK");
        ch_curr.add("PHP");
        ch_curr.add("PKR");
        ch_curr.add("PLN");
        ch_curr.add("PYG");
        ch_curr.add("QAR");
        ch_curr.add("RON");
        ch_curr.add("RSD");
        ch_curr.add("RUB");
        ch_curr.add("RWF");
        ch_curr.add("SAR");
        ch_curr.add("SBD");
        ch_curr.add("SCR");
        ch_curr.add("SDG");
        ch_curr.add("SEK");
        ch_curr.add("SGD");
        ch_curr.add("SHP");
        ch_curr.add("SLL");
        ch_curr.add("SOS");
        ch_curr.add("SRD");
        ch_curr.add("STD");
        ch_curr.add("SVC");
        ch_curr.add("SYP");
        ch_curr.add("SZL");
        ch_curr.add("THB");
        ch_curr.add("TJS");
        ch_curr.add("TMT");
        ch_curr.add("TND");
        ch_curr.add("TOP");
        ch_curr.add("TRY");
        ch_curr.add("TTD");
        ch_curr.add("TWD");
        ch_curr.add("TZS");
        ch_curr.add("UAH");
        ch_curr.add("UGX");
        ch_curr.add("USD");
        ch_curr.add("UYU");
        ch_curr.add("UZS");
        ch_curr.add("VEF");
        ch_curr.add("VND");
        ch_curr.add("VUV");
        ch_curr.add("WST");
        ch_curr.add("XAF");
        ch_curr.add("XAG");
        ch_curr.add("XAU");
        ch_curr.add("XCD");
        ch_curr.add("XDR");
        ch_curr.add("XOF");
        ch_curr.add("XPF");
        ch_curr.add("YER");
        ch_curr.add("ZAR");
        ch_curr.add("ZMK");
        ch_curr.add("ZMW");
        ch_curr.add("ZWL");
    }
    
    private static HttpURLConnection connection;
    
    // <editor-fold defaultstate="collapsed" desc="Buttons">
    private void rbtn_toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_toActionPerformed
        if(rbtn_to.isSelected())
        {
            rbtn_from.setSelected(false);
        }
    }//GEN-LAST:event_rbtn_toActionPerformed

    private void rbtn_fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_fromActionPerformed
        if(rbtn_from.isSelected())
        {
            rbtn_to.setSelected(false);
        }
    }//GEN-LAST:event_rbtn_fromActionPerformed

    public static double parse(String responseBody,String data)
    {
        JSONObject curr = new JSONObject(responseBody);
        JSONObject currency = curr.getJSONObject("rates");
        float value = currency.getFloat(data);
        double multiplier = value / (currency.getFloat("INR"));
        return multiplier;
    }
    
    private void btn_procActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procActionPerformed
        if((rbtn_to.isSelected())==false && (rbtn_from.isSelected())==false)
         {
            JOptionPane.showMessageDialog(First.this,"Conversion not selected"); 
            return;
         }
        if(txt_amt.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(First.this,"Amount Field is empty!");
            txt_amt.grabFocus();
            return;
        }
        String sub = txt_amt.getText().trim();
        if(sub.substring(sub.length()-1, sub.length()).equals("f") || sub.substring(sub.length()-1, sub.length()).equals("d"))
        {
           JOptionPane.showMessageDialog(First.this,"Amount can only be a number"); 
           txt_amt.setText("");
            return;
        }
        try
        {
          Double amt = Double.parseDouble(txt_amt.getText().trim());  
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(First.this,"Amount can only be a number"); 
           txt_amt.setText("");
            return; 
        }
                
        String data = ch_curr.getItem(ch_curr.getSelectedIndex());
        Double amt = Double.parseDouble(txt_amt.getText().trim());
        double multiplier, converted;
        
        // <editor-fold defaultstate="collapsed" desc="API Handling">    
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();        
        try 
        {
            URL url = new URL("http://data.fixer.io/api/latest?access_key=552650886d5d0cdb20f8b550804cee89");
            connection = (HttpURLConnection) url.openConnection();
            
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            
            int status = connection.getResponseCode();
            //System.out.println(status);
            if(status > 299)
            {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while((line = reader.readLine()) != null)
                {
                    responseContent.append(line);
                }                
                reader.close();
            }
            else
            {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while((line = reader.readLine()) != null)
                {
                    responseContent.append(line);
                }                
                reader.close();
            }
            multiplier = parse(responseContent.toString(),data);
            if(rbtn_to.isSelected())
            {
                converted = amt / multiplier;
                Second second_dialog = new Second(converted,label_txt.getText());
                second_dialog.setVisible(true);
            }
            else if(rbtn_from.isSelected())
            {
                converted = amt * multiplier;
                String msg = data;
                Third third_dialog = new Third(converted,msg,label_txt.getText());
                third_dialog.setVisible(true);
            }     
            this.dispose();
        } 
        catch (MalformedURLException ex) 
        {
            Logger.getLogger(First.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(First.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            connection.disconnect();
        }
        // </editor-fold>       
    }//GEN-LAST:event_btn_procActionPerformed
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
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new First().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_proc;
    private java.awt.Choice ch_curr;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_txt;
    private javax.swing.JRadioButton rbtn_from;
    private javax.swing.JRadioButton rbtn_to;
    private javax.swing.JTextField txt_amt;
    // End of variables declaration//GEN-END:variables
}
