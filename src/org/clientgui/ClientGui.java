package org.clientgui;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.xml.datatype.XMLGregorianCalendar;
import org.netbeans.xml.schema.shares.Shareinfo;



public class ClientGui extends javax.swing.JFrame {
   
    
    public ClientGui() {
        initComponents();   
    }
    
    public static java.util.List<org.netbeans.xml.schema.shares.Shareinfo> getAllShares() {
        org.sharesws.SharesWebService_Service service = new org.sharesws.SharesWebService_Service();
        org.sharesws.SharesWebService port = service.getSharesWebServicePort();
        return port.getAllShares();
    }
    public double GetConversionRate(java.lang.String arg0, java.lang.String arg1) {
        docwebservices.CurrencyConversionWSService service = new docwebservices.CurrencyConversionWSService();
        docwebservices.CurrencyConversionWS port = service.getCurrencyConversionWSPort();
        return port.getConversionRate(arg0, arg1);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Shares Brokering Web Service");

        jLabel2.setText("View All Stocks");

        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Search Stock ");

        jButton2.setText("Enter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("View Stock By:");

        jButton3.setText("Enter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Company Name", "Company  Symbol", "Available Shares", "Date of Update", "Value", "Currency"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Company Name", "Company Symbol" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Currency Converter");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel6.setText("Company Name:");

        jLabel7.setText("Currency:");

        jLabel8.setText("New Value:");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton5.setText("Convert");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maximum", "Minimum" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Exchange Rates API Currency Converter");

        jLabel10.setText("Company Name:");

        jLabel11.setText("Currency:");

        jLabel12.setText("New Value:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton6.setText("Convert");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(jTextField3))))
                        .addComponent(jButton1)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2))
                        .addComponent(jLabel5)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton6)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        List<org.netbeans.xml.schema.shares.Shareinfo> myShares = getAllShares();
            
           Iterator itr = myShares.iterator();     
           Shareinfo nextShare;       
           while(itr.hasNext()){
            
            nextShare = (Shareinfo) itr.next();
            Integer availableSharesFromXML = nextShare.getSharesAvailable();
            String availableShares = "" + availableSharesFromXML;
            Float valueFromXML = nextShare.getValue();
            String value = "" + valueFromXML;
            XMLGregorianCalendar getLastUpdateFromXML = nextShare.getLastUpdate();
            String getLastUpdate = "" + getLastUpdateFromXML;
            String addShareToTable[] = {nextShare.getCompany(), nextShare.getSymbol(), availableShares, getLastUpdate, value, nextShare.getCurrency()};
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            tblModel.addRow(addShareToTable);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Integer selectedIndex = jComboBox1.getSelectedIndex();
        String searchParam = String.valueOf(jTextField1.getText());
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        tblModel.setRowCount(0);
        List<org.netbeans.xml.schema.shares.Shareinfo> myShares = getAllShares();
        Iterator itr = myShares.iterator();
        Shareinfo nextShare;
        if (selectedIndex == 0){

        while(itr.hasNext()){
        nextShare = (Shareinfo) itr.next();
        if (searchParam.equals(nextShare.getCompany())){
        Integer availableSharesFromXML = nextShare.getSharesAvailable();
        String availableShares = "" + availableSharesFromXML;
        Float valueFromXML = nextShare.getValue();
        String value = "" + valueFromXML;
        XMLGregorianCalendar getLastUpdateFromXML = nextShare.getLastUpdate();
        String getLastUpdate = "" + getLastUpdateFromXML;
        String addShareToTable[] = {nextShare.getCompany(), nextShare.getSymbol(), availableShares, getLastUpdate, value, nextShare.getCurrency()};
        tblModel.addRow(addShareToTable);
        }
        }
        } else {
            while(itr.hasNext()){
                nextShare = (Shareinfo) itr.next();
                if (searchParam.equals(nextShare.getSymbol())){
                    Integer availableSharesFromXML = nextShare.getSharesAvailable();
                    String availableShares = "" + availableSharesFromXML;
                    Float valueFromXML = nextShare.getValue();
                    String value = "" + valueFromXML;
                    XMLGregorianCalendar getLastUpdateFromXML = nextShare.getLastUpdate();
                    String getLastUpdate = "" + getLastUpdateFromXML;
                    String addShareToTable[] = {nextShare.getCompany(), nextShare.getSymbol(), availableShares, getLastUpdate, value, nextShare.getCurrency()};
                    tblModel.addRow(addShareToTable);
                }
            }
        }
   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < jTable1.getRowCount(); i++){
            list.add(Integer.parseInt(jTable1.getValueAt(i,2).toString()));            
        }
        int max = Collections.max(list);
        String maxavailableShares = "" + max;      
        int min = Collections.min(list);
        String minavailableShares = "" + min; 
        
        Integer selectedIndex1 = jComboBox2.getSelectedIndex();
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
     
        List<org.netbeans.xml.schema.shares.Shareinfo> myShares = getAllShares();
        Iterator itr = myShares.iterator();
        Shareinfo nextShare;        
        
        
        if (selectedIndex1 == 0){
        while(itr.hasNext()){
            nextShare = (Shareinfo) itr.next();
            Integer x = nextShare.getSharesAvailable();
            String y = "" + x;
            if (maxavailableShares.equals(y)){
                tblModel.setRowCount(0);
                Integer availableSharesFromXML = nextShare.getSharesAvailable();
                String availableShares = "" + availableSharesFromXML;
                Float valueFromXML = nextShare.getValue();
                String value = "" + valueFromXML;
                XMLGregorianCalendar getLastUpdateFromXML = nextShare.getLastUpdate();
                String getLastUpdate = "" + getLastUpdateFromXML; 
                String addShareToTable[] = {nextShare.getCompany(), nextShare.getSymbol(), availableShares, getLastUpdate, value, nextShare.getCurrency()};
                tblModel.addRow(addShareToTable);
            }
        }
        }
        else{
            while(itr.hasNext()){
            nextShare = (Shareinfo) itr.next();
            Integer x = nextShare.getSharesAvailable();
            String y = "" + x;
            if (minavailableShares.equals(y)){
                tblModel.setRowCount(0);
                Integer availableSharesFromXML = nextShare.getSharesAvailable();
                String availableShares = "" + availableSharesFromXML;
                Float valueFromXML = nextShare.getValue();
                String value = "" + valueFromXML;
                XMLGregorianCalendar getLastUpdateFromXML = nextShare.getLastUpdate();
                String getLastUpdate = "" + getLastUpdateFromXML; 
                String addShareToTable[] = {nextShare.getCompany(), nextShare.getSymbol(), availableShares, getLastUpdate, value, nextShare.getCurrency()};
                tblModel.addRow(addShareToTable);
            }
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
          tblModel.setRowCount(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String searchParam2 = String.valueOf(jTextField3.getText());
        String searchParam3 = String.valueOf(jTextField4.getText());
    
        List<org.netbeans.xml.schema.shares.Shareinfo> myShares = getAllShares();
        Iterator itr = myShares.iterator();
        Shareinfo nextShare;
         while(itr.hasNext()){
            nextShare = (Shareinfo) itr.next();
            if (searchParam2.equals(nextShare.getCompany())){
                Double OldCurrency = GetConversionRate(nextShare.getCurrency(), searchParam3);
                String OldCurrencyStr = "" + OldCurrency;
                Float OldCurrencyFlt = Float.parseFloat(OldCurrencyStr);
                Float OldValue = nextShare.getValue();
                Float newValueFlt = OldValue * OldCurrencyFlt;
                String newValueStr = "" + newValueFlt;
                
                 jTextField5.setText(searchParam3 + " " + newValueStr);
            }
         }
         
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String searchParam4 = String.valueOf(jTextField6.getText());
        String searchParam5 = String.valueOf(jTextField7.getText());
        
        List<org.netbeans.xml.schema.shares.Shareinfo> myShares = getAllShares();
        Iterator itr = myShares.iterator();
        Shareinfo nextShare;
         while(itr.hasNext()){
            nextShare = (Shareinfo) itr.next();
            if (searchParam4.equals(nextShare.getCompany())){
                String baseSymbol = nextShare.getCurrency();
                String newSymbol = searchParam5; 
             
                
                String wsURL = "https://api.exchangeratesapi.io/latest?";
                    try{
                        String urlString = wsURL + "base=" + baseSymbol + "&symbols=" + newSymbol; 
                        URL url = new URL(urlString);
                        HttpURLConnection connURL = (HttpURLConnection) url.openConnection();
                        connURL.setRequestMethod("GET");
                        System.out.println("/nREST API call: " + connURL.getRequestProperties().toString() + "/n");
                        connURL.connect();
            
                        BufferedReader ins = new BufferedReader(new InputStreamReader(connURL.getInputStream()));
                        String inString;
                        StringBuilder JSONresultStr = new StringBuilder();
            
                        while ((inString = ins.readLine()) != null) {
                            JSONresultStr.append(inString);
                        }
                        ins.close();
                        connURL.disconnect();
                        String longString = JSONresultStr.toString();
                        String x[] = longString.split(":");
                        String y = x[2];
                        String z[] = y.split("}");
                        
                        
                        String exchangeRate = z[0];
                        Float exchangeRateFlt = Float.parseFloat(exchangeRate);
                        Float OldcurValue = nextShare.getValue();
                     
                        Float newValueFlt = OldcurValue * exchangeRateFlt;
                        String newValueStr = "" + newValueFlt;
                        jTextField2.setText(newSymbol + " " + newValueStr);
                       
                    }
                    catch(MalformedURLException me){
                        System.out.println("MalformedURLException " + me);
                    }
                    catch (IOException ioe){
                        System.out.println("IOException: " + ioe);
                    }
            }
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed


    public static void main(String args[]) {
        
        
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientGui().setVisible(true);
                
            }
            
        });
         
    }    
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

}
