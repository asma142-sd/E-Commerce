/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package package1;



import database.DBConnection;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Asma Saeed
 */
public class Checkout extends javax.swing.JFrame {
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Checkout.class.getName());

    /**
     * Creates new form Checkout
     */
    public Checkout() {
        
        initComponents();
         nameLabel.setText(UserSession.name);

    emailLabel.setText(UserSession.email);

    countryLabel.setText(UserSession.country);

    System.out.println(UserSession.name);
        
        
        

    

    double subtotal = 0;

    if(Home.cartFrame.tvCartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.tvCartSpinner.getValue();

        subtotal += 214095 * qty;
    }

    if(Home.cartFrame.toasterCartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.toasterCartSpinner.getValue();

        subtotal += 8288 * qty;
    }
    if(Home.cartFrame.dispenserCartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.dispenserCartSpinner.getValue();

        subtotal += 65000 * qty;
    }
    if(Home.cartFrame.juicerCartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.juicerCartSpinner.getValue();

        subtotal += 13983 * qty;
    }
    if(Home.cartFrame.airfryerCartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.airfryerCartSpinner.getValue();

        subtotal += 63999 * qty;
    }
    if(Home.cartFrame.lipstickCartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.lipstickCartSpinner.getValue();

        subtotal += 1851 * qty;
    }
    if(Home.cartFrame.eyeshadowCartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.eyeshadowCartSpinner.getValue();

        subtotal += 3500 * qty;
    }
    if(Home.cartFrame.concealerCartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.concealerCartSpinner.getValue();

        subtotal += 3799 * qty;
    }
    if(Home.cartFrame.mascaraCartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.mascaraCartSpinner.getValue();

        subtotal += 2700 * qty;
    }
    if(Home.cartFrame.perfumeCartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.perfumeCartSpinner.getValue();

        subtotal += 4180 * qty;
    }
    if(Home.cartFrame.milkCartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.milkCartSpinner.getValue();

        subtotal += 380 * qty;
    }
    if(Home.cartFrame.yogurtCartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.yogurtCartSpinner.getValue();

        subtotal += 270 * qty;
    }
    if(Home.cartFrame.breadCartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.breadCartSpinner.getValue();

        subtotal += 130 * qty;
    }
    if(Home.cartFrame.butterCartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.butterCartSpinner.getValue();

        subtotal += 747 * qty;
    }
    if(Home.cartFrame.eggsCartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.eggsCartSpinner.getValue();

        subtotal += 630 * qty;
    }
    if(Home.cartFrame.teaCartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.teaCartSpinner.getValue();

        subtotal += 430 * qty;
    }
    if(Home.cartFrame.book1CartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.book1CartSpinner.getValue();

        subtotal += 3195 * qty;
    }
    if(Home.cartFrame.book2CartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.book2CartSpinner.getValue();

        subtotal += 1795 * qty;
    }
    if(Home.cartFrame.book3CartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.book3CartSpinner.getValue();

        subtotal += 1349 * qty;
    }
    if(Home.cartFrame.book4CartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.book4CartSpinner.getValue();

        subtotal += 7015 * qty;
    }
    if(Home.cartFrame.book5CartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.book5CartSpinner.getValue();

        subtotal += 1255 * qty;
    }
    if(Home.cartFrame.book6CartPanel.isVisible()) {

        int qty =
        (int) Home.cartFrame.book6CartSpinner.getValue();

        subtotal += 2495 * qty;
    }

    subtotalLabel.setText(
    "Rs. " + subtotal);

    double total =
    subtotal + 200;

    totalLabel.setText(
    "Rs. " + total);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanelMain = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelordifyLogo = new javax.swing.JLabel();
        jLabelUsericon = new javax.swing.JLabel();
        jLabel2UserName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelOrderSummary = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        subtotalLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabelShippingCharges = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        continueBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        postalField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        jCheckBoxSaveInfo = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabelshipping = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabelCOD = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButtonConfirmOrder = new javax.swing.JButton();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordify");

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(179, 48, 75));
        jPanel2.setForeground(new java.awt.Color(255, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 56));

        jLabelordifyLogo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelordifyLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package1/32 logo.png"))); // NOI18N
        jLabelordifyLogo.setText("Ordify");

        jLabelUsericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package1/user.png"))); // NOI18N

        jLabel2UserName.setPreferredSize(new java.awt.Dimension(66, 16));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelordifyLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelUsericon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelUsericon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelordifyLogo))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Checkout");

        jPanelOrderSummary.setBackground(new java.awt.Color(255, 255, 255));
        jPanelOrderSummary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setText("Total Bill");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Subtotal:");

        subtotalLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subtotalLabel.setText("  ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Shipping:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel20.setText("Total:");

        jLabelShippingCharges.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelShippingCharges.setText("Rs.200");

        totalLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalLabel.setText(" ");

        continueBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        continueBtn.setText("Continue shopping");
        continueBtn.addActionListener(this::continueBtnActionPerformed);

        javax.swing.GroupLayout jPanelOrderSummaryLayout = new javax.swing.GroupLayout(jPanelOrderSummary);
        jPanelOrderSummary.setLayout(jPanelOrderSummaryLayout);
        jPanelOrderSummaryLayout.setHorizontalGroup(
            jPanelOrderSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrderSummaryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subtotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanelOrderSummaryLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelOrderSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelShippingCharges)
                    .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelOrderSummaryLayout.createSequentialGroup()
                .addGroup(jPanelOrderSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOrderSummaryLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanelOrderSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(continueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelOrderSummaryLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel3)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanelOrderSummaryLayout.setVerticalGroup(
            jPanelOrderSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrderSummaryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOrderSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(subtotalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOrderSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabelShippingCharges))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOrderSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(totalLabel))
                .addGap(18, 18, 18)
                .addComponent(continueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Contact");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Delivery");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("Country");

        countryLabel.setText(" ");
        countryLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setText("Name");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        nameLabel.setText(" ");
        nameLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel10.setText("Address");

        addressField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        addressField.setText(" ");
        addressField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        addressField.addActionListener(this::addressFieldActionPerformed);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setText("City");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setText("Postal Code");

        cityField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cityField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        postalField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        postalField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        postalField.addActionListener(this::postalFieldActionPerformed);

        emailLabel.setBackground(new java.awt.Color(255, 255, 255));
        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        emailLabel.setText(" ");
        emailLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jCheckBoxSaveInfo.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxSaveInfo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jCheckBoxSaveInfo.setText("Save this Information for next time");
        jCheckBoxSaveInfo.addActionListener(this::jCheckBoxSaveInfoActionPerformed);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setText("Shippping Method");

        jLabelshipping.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabelshipping.setText(" Standard                                                                Rs 200.00");
        jLabelshipping.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Payment");

        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("All transactions are secure and encrypted");

        jLabelCOD.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabelCOD.setText(" Cash on Delivery (COD)");
        jLabelCOD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Billing Address");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel19.setText(" Same as Shipping Address");
        jLabel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButtonConfirmOrder.setBackground(new java.awt.Color(179, 48, 75));
        jButtonConfirmOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonConfirmOrder.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConfirmOrder.setText("Confirm Order");
        jButtonConfirmOrder.addActionListener(this::jButtonConfirmOrderActionPerformed);

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxSaveInfo)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelCOD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelshipping, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                .addComponent(addressField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(countryLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelMainLayout.createSequentialGroup()
                                    .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(postalField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(jPanelOrderSummary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jLabel1))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jButtonConfirmOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanelOrderSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(emailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countryLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxSaveInfo)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelshipping, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCOD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonConfirmOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void postalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postalFieldActionPerformed

    private void jCheckBoxSaveInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSaveInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxSaveInfoActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void continueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueBtnActionPerformed
        // TODO add your handling code here:
        

Home home =
new Home();

home.setVisible(true);

dispose();
    }//GEN-LAST:event_continueBtnActionPerformed

    private void jButtonConfirmOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmOrderActionPerformed
        // TODO add your handling code here:
        try {

    Connection con =
    DBConnection.getConnection();

    String sql =
    "INSERT INTO orders(customername,email,country,totalcost,address,city,postalcode,paymentmethod) VALUES(?,?,?,?,?,?,?,?)";

    PreparedStatement pst =
    con.prepareStatement(sql);

    pst.setString(1,
    UserSession.name);

    pst.setString(2,
    UserSession.email);

    pst.setString(3,
    UserSession.country);

    String totalText =
    totalLabel.getText();

    totalText =
    totalText.replace("Rs. ","");

    double total =
    Double.parseDouble(totalText);

    pst.setDouble(4,
    total);

    pst.setString(5,
    addressField.getText());

    pst.setString(6,
    cityField.getText());

    pst.setString(7,
    postalField.getText());

    pst.setString(8,
    "Cash On Delivery");

    pst.executeUpdate();

    JOptionPane.showMessageDialog(
    this,
    "Order Placed Successfully");

} catch(HeadlessException | NumberFormatException | SQLException e) {

    JOptionPane.showMessageDialog(
    this,
    e);
}
        
        
    }//GEN-LAST:event_jButtonConfirmOrderActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Checkout().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField cityField;
    private javax.swing.JButton continueBtn;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton jButtonConfirmOrder;
    private javax.swing.JCheckBox jCheckBoxSaveInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel2UserName;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCOD;
    private javax.swing.JLabel jLabelShippingCharges;
    private javax.swing.JLabel jLabelUsericon;
    private javax.swing.JLabel jLabelordifyLogo;
    private javax.swing.JLabel jLabelshipping;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelOrderSummary;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField postalField;
    private javax.swing.JLabel subtotalLabel;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
