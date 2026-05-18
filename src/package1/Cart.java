/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package package1;

/**
 *
 * @author Asma Saeed
 */
public class Cart extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Cart.class.getName());

    /**
     * Creates new form Cart
     */
    public Cart() {
        initComponents();
        tvCartPanel.setVisible(false);

    toasterCartPanel.setVisible(false);

    juicerCartPanel.setVisible(false);

    airfryerCartPanel.setVisible(false);

    dispenserCartPanel.setVisible(false);
    
    lipstickCartPanel.setVisible(false);

    eyeshadowCartPanel.setVisible(false);

    concealerCartPanel.setVisible(false);

    mascaraCartPanel.setVisible(false);

    perfumeCartPanel.setVisible(false);
    
    milkCartPanel.setVisible(false);

    yogurtCartPanel.setVisible(false);

    butterCartPanel.setVisible(false);

    eggsCartPanel.setVisible(false);

    teaCartPanel.setVisible(false);
    
    breadCartPanel.setVisible(false);

    book1CartPanel.setVisible(false);

    book2CartPanel.setVisible(false);

    book3CartPanel.setVisible(false);

    book4CartPanel.setVisible(false);
    
    book5CartPanel.setVisible(false);

    book6CartPanel.setVisible(false);

    cartMainPanel.revalidate();

    cartMainPanel.repaint();
        
    
        
        
        

    

   

    
    }
    
    
    
    public void updateCartTotal() {

    double subtotal = 0;
     

    

    if(tvCartPanel.isVisible()) {

        int qty =
        (int) tvCartSpinner.getValue();

        subtotal += 214095 * qty;
    }

    if(toasterCartPanel.isVisible()) {

        int qty =
        (int) toasterCartSpinner.getValue();

        subtotal += 8288 * qty;
    }
    if(dispenserCartPanel.isVisible()) {

        int qty =
        (int) dispenserCartSpinner.getValue();

        subtotal += 65000 * qty;
    }
    if(juicerCartPanel.isVisible()) {

        int qty =
        (int) juicerCartSpinner.getValue();

        subtotal += 13983 * qty;
    }
    if(airfryerCartPanel.isVisible()) {

        int qty =
        (int) airfryerCartSpinner.getValue();

        subtotal += 63999 * qty;
    }
    if(lipstickCartPanel.isVisible()) {

        int qty =
        (int) lipstickCartSpinner.getValue();

        subtotal += 1851 * qty;
    }
    if(eyeshadowCartPanel.isVisible()) {

        int qty =
        (int) eyeshadowCartSpinner.getValue();

        subtotal += 3500 * qty;
    }
    if(concealerCartPanel.isVisible()) {

        int qty =
        (int) concealerCartSpinner.getValue();

        subtotal += 3799 * qty;
    }
    if(mascaraCartPanel.isVisible()) {

        int qty =
        (int) mascaraCartSpinner.getValue();

        subtotal += 2700 * qty;
    }
    if(perfumeCartPanel.isVisible()) {

        int qty =
        (int) perfumeCartSpinner.getValue();

        subtotal += 4180 * qty;
    }
    if(milkCartPanel.isVisible()) {

        int qty =
        (int) milkCartSpinner.getValue();

        subtotal += 380 * qty;
    }
    if(yogurtCartPanel.isVisible()) {

        int qty =
        (int) yogurtCartSpinner.getValue();

        subtotal += 270 * qty;
    }
    if(breadCartPanel.isVisible()) {

        int qty =
        (int) breadCartSpinner.getValue();

        subtotal += 130 * qty;
    }
    if(butterCartPanel.isVisible()) {

        int qty =
        (int) butterCartSpinner.getValue();

        subtotal += 747 * qty;
    }
    if(eggsCartPanel.isVisible()) {

        int qty =
        (int) eggsCartSpinner.getValue();

        subtotal += 630 * qty;
    }
    if(teaCartPanel.isVisible()) {

        int qty =
        (int)teaCartSpinner.getValue();

        subtotal += 430 * qty;
    }
    if(book1CartPanel.isVisible()) {

        int qty =
        (int) book1CartSpinner.getValue();

        subtotal += 3195 * qty;
    }
    if(book2CartPanel.isVisible()) {

        int qty =
        (int) book2CartSpinner.getValue();

        subtotal += 1795 * qty;
    }
    if(book3CartPanel.isVisible()) {

        int qty =
        (int) book3CartSpinner.getValue();

        subtotal += 1349 * qty;
    }
    if(book4CartPanel.isVisible()) {

        int qty =
        (int) book4CartSpinner.getValue();

        subtotal += 7015 * qty;
    }
    if(book5CartPanel.isVisible()) {

        int qty =
        (int) book5CartSpinner.getValue();

        subtotal += 1255 * qty;
    }
    if(book6CartPanel.isVisible()) {

        int qty =
        (int) book6CartSpinner.getValue();

        subtotal += 2495 * qty;
    }

    totalLabel.setText(
    "Rs. " + subtotal);
    // paste SAME subtotal code here

    

    
}
    
    
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelordifyLogo = new javax.swing.JLabel();
        jLabelUsericon = new javax.swing.JLabel();
        jLabel2UserName = new javax.swing.JLabel();
        jPanelOrderSummary = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        checkoutBtn = new javax.swing.JButton();
        totalLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cartMainPanel = new javax.swing.JPanel();
        tvCartPanel = new javax.swing.JPanel();
        jLabelTVname3 = new javax.swing.JLabel();
        jLabelTVprice3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tvCartSpinner = new javax.swing.JSpinner();
        tvRemoveBtn = new javax.swing.JButton();
        dispenserCartPanel = new javax.swing.JPanel();
        jLabeldispenserName2 = new javax.swing.JLabel();
        jLabelDispenserprice2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dispenserCartSpinner = new javax.swing.JSpinner();
        dispenserRemoveBtn = new javax.swing.JButton();
        toasterCartPanel = new javax.swing.JPanel();
        jLabeltoasterName2 = new javax.swing.JLabel();
        jLabelToasterprice2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        toasterCartSpinner = new javax.swing.JSpinner();
        toasterRemoveBtn = new javax.swing.JButton();
        juicerCartPanel = new javax.swing.JPanel();
        jLabeljuicerName2 = new javax.swing.JLabel();
        jLabelJuicerprice2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        juicerCartSpinner = new javax.swing.JSpinner();
        juicerRemoveBtn = new javax.swing.JButton();
        airfryerCartPanel = new javax.swing.JPanel();
        jLabelairfryerName2 = new javax.swing.JLabel();
        jLabelAirfryerprice2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        airfryerCartSpinner = new javax.swing.JSpinner();
        airfryerRemoveBtn = new javax.swing.JButton();
        lipstickCartPanel = new javax.swing.JPanel();
        jLabellipstickName2 = new javax.swing.JLabel();
        jLabelLipstickPrice2 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lipstickCartSpinner = new javax.swing.JSpinner();
        lipstickRemoveBtn = new javax.swing.JButton();
        eyeshadowCartPanel = new javax.swing.JPanel();
        jLabelEyeshadowName2 = new javax.swing.JLabel();
        jLabelEyeshadowPrice2 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        eyeshadowCartSpinner = new javax.swing.JSpinner();
        eyeshadowRemoveBtn = new javax.swing.JButton();
        concealerCartPanel = new javax.swing.JPanel();
        jLabelConcealerName2 = new javax.swing.JLabel();
        jLabelConcealerPrice2 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        concealerCartSpinner = new javax.swing.JSpinner();
        concealerRemoveBtn = new javax.swing.JButton();
        mascaraCartPanel = new javax.swing.JPanel();
        jLabelMascaraName2 = new javax.swing.JLabel();
        jLabelMascaraPrice2 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        mascaraCartSpinner = new javax.swing.JSpinner();
        mascaraRemoveBtn = new javax.swing.JButton();
        perfumeCartPanel = new javax.swing.JPanel();
        jLabelPerfumeName2 = new javax.swing.JLabel();
        jLabelPerfumePrice2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        perfumeCartSpinner = new javax.swing.JSpinner();
        perfumeRemoveBtn = new javax.swing.JButton();
        butterCartPanel = new javax.swing.JPanel();
        jLabelButterName1 = new javax.swing.JLabel();
        jLabelButrerPrice1 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        butterCartSpinner = new javax.swing.JSpinner();
        butterRemoveBtn = new javax.swing.JButton();
        eggsCartPanel = new javax.swing.JPanel();
        jLabelEggsName = new javax.swing.JLabel();
        jLabelEggsPrice = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        eggsCartSpinner = new javax.swing.JSpinner();
        eggsRemoveBtn = new javax.swing.JButton();
        teaCartPanel = new javax.swing.JPanel();
        jLabelTeaName = new javax.swing.JLabel();
        jLabelTeaPrice = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        teaCartSpinner = new javax.swing.JSpinner();
        teaRemoveBtn = new javax.swing.JButton();
        breadCartPanel = new javax.swing.JPanel();
        jLabelBreadName = new javax.swing.JLabel();
        jLabelBreadPrice = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        breadCartSpinner = new javax.swing.JSpinner();
        breadRemoveBtn = new javax.swing.JButton();
        book1CartPanel = new javax.swing.JPanel();
        jLabelBook1Name = new javax.swing.JLabel();
        jLabelBook1Price = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        book1CartSpinner = new javax.swing.JSpinner();
        book1RemoveBtn = new javax.swing.JButton();
        book2CartPanel = new javax.swing.JPanel();
        jLabelBook2Name = new javax.swing.JLabel();
        jLabelBook2Price = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        book2CartSpinner = new javax.swing.JSpinner();
        book2RemoveBtn = new javax.swing.JButton();
        book3CartPanel = new javax.swing.JPanel();
        jLabelBook3Name = new javax.swing.JLabel();
        jLabelBook3Price = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        book3CartSpinner = new javax.swing.JSpinner();
        book3RemoveBtn = new javax.swing.JButton();
        book4CartPanel = new javax.swing.JPanel();
        jLabelBook4Name = new javax.swing.JLabel();
        jLabelBook4Price = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        book4CartSpinner = new javax.swing.JSpinner();
        book4RemoveBtn = new javax.swing.JButton();
        book5CartPanel = new javax.swing.JPanel();
        jLabelBook5Name = new javax.swing.JLabel();
        jLabelBook5Price = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        book5CartSpinner = new javax.swing.JSpinner();
        book5RemoveBtn = new javax.swing.JButton();
        book6CartPanel = new javax.swing.JPanel();
        jLabelBook6Name = new javax.swing.JLabel();
        jLabelBook6Price = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        book6CartSpinner = new javax.swing.JSpinner();
        book6RemoveBtn = new javax.swing.JButton();
        milkCartPanel = new javax.swing.JPanel();
        jLabelMilkName1 = new javax.swing.JLabel();
        jLabelMilkPrice1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        milkCartSpinner = new javax.swing.JSpinner();
        milkRemoveBtn = new javax.swing.JButton();
        yogurtCartPanel = new javax.swing.JPanel();
        jLabelYogurtName = new javax.swing.JLabel();
        jLabelYogutPrice = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        yogurtCartSpinner = new javax.swing.JSpinner();
        yogurtRemoveBtn = new javax.swing.JButton();

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

        jPanelOrderSummary.setBackground(new java.awt.Color(255, 255, 255));
        jPanelOrderSummary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Order Summary");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Subtotal:");

        checkoutBtn.setBackground(new java.awt.Color(179, 48, 75)
        );
        checkoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        checkoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkoutBtn.setText("Checkout");
        checkoutBtn.addActionListener(this::checkoutBtnActionPerformed);

        totalLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalLabel.setText("  ");

        jLabel7.setText("*Taxes and Shipping calculated at checkout");

        javax.swing.GroupLayout jPanelOrderSummaryLayout = new javax.swing.GroupLayout(jPanelOrderSummary);
        jPanelOrderSummary.setLayout(jPanelOrderSummaryLayout);
        jPanelOrderSummaryLayout.setHorizontalGroup(
            jPanelOrderSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrderSummaryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelOrderSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrderSummaryLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrderSummaryLayout.createSequentialGroup()
                        .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrderSummaryLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelOrderSummaryLayout.createSequentialGroup()
                .addGroup(jPanelOrderSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOrderSummaryLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(jPanelOrderSummaryLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(checkoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanelOrderSummaryLayout.setVerticalGroup(
            jPanelOrderSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrderSummaryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOrderSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(totalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(checkoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("My Shopping Cart");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setText("  My Cart");

        cartMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        tvCartPanel.setBackground(new java.awt.Color(255, 255, 255));
        tvCartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabelTVname3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTVname3.setForeground(new java.awt.Color(0, 102, 204));
        jLabelTVname3.setText("TCL 65 Inches QLED Google Smart TV With AiPQ Processor");

        jLabelTVprice3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTVprice3.setText("Rs. 214,095");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setText("Quantity");

        tvRemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        tvRemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tvRemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        tvRemoveBtn.setText("Remove");
        tvRemoveBtn.addActionListener(this::tvRemoveBtnActionPerformed);

        javax.swing.GroupLayout tvCartPanelLayout = new javax.swing.GroupLayout(tvCartPanel);
        tvCartPanel.setLayout(tvCartPanelLayout);
        tvCartPanelLayout.setHorizontalGroup(
            tvCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tvCartPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(tvCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tvCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelTVprice3)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tvCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelTVname3))
                .addGap(360, 360, 360)
                .addComponent(tvRemoveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        tvCartPanelLayout.setVerticalGroup(
            tvCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tvCartPanelLayout.createSequentialGroup()
                .addComponent(jLabelTVname3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tvCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTVprice3)
                    .addComponent(jLabel6)
                    .addComponent(tvCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(tvCartPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tvRemoveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        dispenserCartPanel.setBackground(new java.awt.Color(255, 255, 255));
        dispenserCartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        dispenserCartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabeldispenserName2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabeldispenserName2.setForeground(new java.awt.Color(0, 102, 204));
        jLabeldispenserName2.setText("Panasonic Water Dispenser, Stainless Steel ");

        jLabelDispenserprice2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDispenserprice2.setText("Rs. 65,000");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("Quantity");

        dispenserRemoveBtn.setBackground(new java.awt.Color(179, 48, 75)
        );
        dispenserRemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        dispenserRemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        dispenserRemoveBtn.setText("Remove");
        dispenserRemoveBtn.addActionListener(this::dispenserRemoveBtnActionPerformed);

        javax.swing.GroupLayout dispenserCartPanelLayout = new javax.swing.GroupLayout(dispenserCartPanel);
        dispenserCartPanel.setLayout(dispenserCartPanelLayout);
        dispenserCartPanelLayout.setHorizontalGroup(
            dispenserCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dispenserCartPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(dispenserCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeldispenserName2)
                    .addGroup(dispenserCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelDispenserprice2)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dispenserCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dispenserRemoveBtn)
                .addGap(22, 22, 22))
        );
        dispenserCartPanelLayout.setVerticalGroup(
            dispenserCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dispenserCartPanelLayout.createSequentialGroup()
                .addGroup(dispenserCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dispenserCartPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabeldispenserName2)
                        .addGroup(dispenserCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dispenserCartPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(dispenserCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(dispenserCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(dispenserCartPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDispenserprice2))))
                    .addGroup(dispenserCartPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(dispenserRemoveBtn)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        toasterCartPanel.setBackground(new java.awt.Color(255, 255, 255));
        toasterCartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        toasterCartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabeltoasterName2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabeltoasterName2.setForeground(new java.awt.Color(0, 102, 204));
        jLabeltoasterName2.setText("Anex Deluxe 2 Slice Toaster,730-870 W, 220-240V, Black");

        jLabelToasterprice2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelToasterprice2.setText("Rs. 8,288");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel17.setText("Quantity:");

        toasterRemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        toasterRemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        toasterRemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        toasterRemoveBtn.setText("Remove");
        toasterRemoveBtn.addActionListener(this::toasterRemoveBtnActionPerformed);

        javax.swing.GroupLayout toasterCartPanelLayout = new javax.swing.GroupLayout(toasterCartPanel);
        toasterCartPanel.setLayout(toasterCartPanelLayout);
        toasterCartPanelLayout.setHorizontalGroup(
            toasterCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toasterCartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(toasterCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(toasterCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelToasterprice2)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toasterCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(toasterCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabeltoasterName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(toasterRemoveBtn)
                        .addGap(20, 20, 20))))
        );
        toasterCartPanelLayout.setVerticalGroup(
            toasterCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toasterCartPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(toasterCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toasterRemoveBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabeltoasterName2))
                .addGap(1, 1, 1)
                .addGroup(toasterCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelToasterprice2)
                    .addComponent(jLabel17)
                    .addComponent(toasterCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        juicerCartPanel.setBackground(new java.awt.Color(255, 255, 255));
        juicerCartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        juicerCartPanel.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabeljuicerName2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabeljuicerName2.setForeground(new java.awt.Color(0, 102, 204));
        jLabeljuicerName2.setText("Anex Deluxe Juicer, 400W, 220-240V, 800ml, Black");

        jLabelJuicerprice2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelJuicerprice2.setText("Rs. 13,983 ");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel21.setText("Quantity:");

        juicerRemoveBtn.setBackground(new java.awt.Color(179, 48, 75)
        );
        juicerRemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        juicerRemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        juicerRemoveBtn.setText("Remove");
        juicerRemoveBtn.addActionListener(this::juicerRemoveBtnActionPerformed);

        javax.swing.GroupLayout juicerCartPanelLayout = new javax.swing.GroupLayout(juicerCartPanel);
        juicerCartPanel.setLayout(juicerCartPanelLayout);
        juicerCartPanelLayout.setHorizontalGroup(
            juicerCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(juicerCartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(juicerCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeljuicerName2)
                    .addGroup(juicerCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelJuicerprice2)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(juicerCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(juicerRemoveBtn)
                .addGap(20, 20, 20))
        );
        juicerCartPanelLayout.setVerticalGroup(
            juicerCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(juicerCartPanelLayout.createSequentialGroup()
                .addGroup(juicerCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(juicerCartPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabeljuicerName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(juicerCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelJuicerprice2)
                            .addComponent(jLabel21)
                            .addComponent(juicerCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(juicerCartPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(juicerRemoveBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        airfryerCartPanel.setBackground(new java.awt.Color(255, 255, 255));
        airfryerCartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        airfryerCartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabelairfryerName2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelairfryerName2.setForeground(new java.awt.Color(0, 102, 204));
        jLabelairfryerName2.setText("Nutricook Air Fryer Slim, 1500W, 5-Liters");

        jLabelAirfryerprice2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAirfryerprice2.setText("Rs. 63,999");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel25.setText("Quantity:");

        airfryerRemoveBtn.setBackground(new java.awt.Color(179, 48, 75)
        );
        airfryerRemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        airfryerRemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        airfryerRemoveBtn.setText("Remove");
        airfryerRemoveBtn.addActionListener(this::airfryerRemoveBtnActionPerformed);

        javax.swing.GroupLayout airfryerCartPanelLayout = new javax.swing.GroupLayout(airfryerCartPanel);
        airfryerCartPanel.setLayout(airfryerCartPanelLayout);
        airfryerCartPanelLayout.setHorizontalGroup(
            airfryerCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(airfryerCartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(airfryerCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelairfryerName2)
                    .addGroup(airfryerCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelAirfryerprice2)
                        .addGap(97, 97, 97)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(airfryerCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(airfryerRemoveBtn)
                .addGap(22, 22, 22))
        );
        airfryerCartPanelLayout.setVerticalGroup(
            airfryerCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(airfryerCartPanelLayout.createSequentialGroup()
                .addGroup(airfryerCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(airfryerCartPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabelairfryerName2)
                        .addGap(2, 2, 2)
                        .addGroup(airfryerCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAirfryerprice2)
                            .addComponent(jLabel25)
                            .addComponent(airfryerCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(airfryerCartPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(airfryerRemoveBtn)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        lipstickCartPanel.setBackground(new java.awt.Color(255, 255, 255));
        lipstickCartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lipstickCartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabellipstickName2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabellipstickName2.setForeground(new java.awt.Color(0, 102, 204));
        jLabellipstickName2.setText("Flormar Sheer Up Lipstick, 004 Warm Peach, 3g");

        jLabelLipstickPrice2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelLipstickPrice2.setText("Rs. 1,851");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Quantity:");

        lipstickRemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        lipstickRemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lipstickRemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        lipstickRemoveBtn.setText("Remove");
        lipstickRemoveBtn.addActionListener(this::lipstickRemoveBtnActionPerformed);

        javax.swing.GroupLayout lipstickCartPanelLayout = new javax.swing.GroupLayout(lipstickCartPanel);
        lipstickCartPanel.setLayout(lipstickCartPanelLayout);
        lipstickCartPanelLayout.setHorizontalGroup(
            lipstickCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lipstickCartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lipstickCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabellipstickName2)
                    .addGroup(lipstickCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelLipstickPrice2)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lipstickCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lipstickRemoveBtn)
                .addGap(20, 20, 20))
        );
        lipstickCartPanelLayout.setVerticalGroup(
            lipstickCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lipstickCartPanelLayout.createSequentialGroup()
                .addGroup(lipstickCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lipstickCartPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabellipstickName2)
                        .addGap(8, 8, 8)
                        .addGroup(lipstickCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLipstickPrice2)
                            .addComponent(jLabel27)
                            .addComponent(lipstickCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(lipstickCartPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lipstickRemoveBtn)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        eyeshadowCartPanel.setBackground(new java.awt.Color(255, 255, 255));
        eyeshadowCartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        eyeshadowCartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabelEyeshadowName2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEyeshadowName2.setForeground(new java.awt.Color(0, 102, 204));
        jLabelEyeshadowName2.setText("Junaid Jamshed Note Eyeshadow Palette");

        jLabelEyeshadowPrice2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEyeshadowPrice2.setText("Rs. 3,500");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Quantity:");

        eyeshadowRemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        eyeshadowRemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        eyeshadowRemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        eyeshadowRemoveBtn.setText("Remove");
        eyeshadowRemoveBtn.addActionListener(this::eyeshadowRemoveBtnActionPerformed);

        javax.swing.GroupLayout eyeshadowCartPanelLayout = new javax.swing.GroupLayout(eyeshadowCartPanel);
        eyeshadowCartPanel.setLayout(eyeshadowCartPanelLayout);
        eyeshadowCartPanelLayout.setHorizontalGroup(
            eyeshadowCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eyeshadowCartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eyeshadowCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEyeshadowName2)
                    .addGroup(eyeshadowCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelEyeshadowPrice2)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eyeshadowCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eyeshadowRemoveBtn)
                .addGap(23, 23, 23))
        );
        eyeshadowCartPanelLayout.setVerticalGroup(
            eyeshadowCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eyeshadowCartPanelLayout.createSequentialGroup()
                .addGroup(eyeshadowCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eyeshadowCartPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelEyeshadowName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(eyeshadowCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEyeshadowPrice2)
                            .addComponent(jLabel31)
                            .addComponent(eyeshadowCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(eyeshadowCartPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(eyeshadowRemoveBtn)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        concealerCartPanel.setBackground(new java.awt.Color(255, 255, 255));
        concealerCartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        concealerCartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabelConcealerName2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelConcealerName2.setForeground(new java.awt.Color(0, 102, 204));
        jLabelConcealerName2.setText("Maybelline New York Concealer - 122 Sand");

        jLabelConcealerPrice2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelConcealerPrice2.setText("Rs.3,799");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("Quantity:");

        concealerRemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        concealerRemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        concealerRemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        concealerRemoveBtn.setText("Remove");
        concealerRemoveBtn.addActionListener(this::concealerRemoveBtnActionPerformed);

        javax.swing.GroupLayout concealerCartPanelLayout = new javax.swing.GroupLayout(concealerCartPanel);
        concealerCartPanel.setLayout(concealerCartPanelLayout);
        concealerCartPanelLayout.setHorizontalGroup(
            concealerCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(concealerCartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(concealerCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(concealerCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelConcealerPrice2)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(concealerCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(concealerCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelConcealerName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(concealerRemoveBtn)
                        .addGap(22, 22, 22))))
        );
        concealerCartPanelLayout.setVerticalGroup(
            concealerCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(concealerCartPanelLayout.createSequentialGroup()
                .addGroup(concealerCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(concealerCartPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(concealerRemoveBtn))
                    .addGroup(concealerCartPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabelConcealerName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(concealerCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelConcealerPrice2)
                            .addComponent(jLabel37)
                            .addComponent(concealerCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        mascaraCartPanel.setBackground(new java.awt.Color(255, 255, 255));
        mascaraCartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        mascaraCartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabelMascaraName2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMascaraName2.setForeground(new java.awt.Color(0, 102, 204));
        jLabelMascaraName2.setText("Junaid Jamshed Note Extra Volume Mascara, 12ml");

        jLabelMascaraPrice2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMascaraPrice2.setText("Rs. 2,700");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setText("Quantity:");

        mascaraRemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        mascaraRemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        mascaraRemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        mascaraRemoveBtn.setText("Remove");
        mascaraRemoveBtn.addActionListener(this::mascaraRemoveBtnActionPerformed);

        javax.swing.GroupLayout mascaraCartPanelLayout = new javax.swing.GroupLayout(mascaraCartPanel);
        mascaraCartPanel.setLayout(mascaraCartPanelLayout);
        mascaraCartPanelLayout.setHorizontalGroup(
            mascaraCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mascaraCartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mascaraCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mascaraCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelMascaraPrice2)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mascaraCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mascaraCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelMascaraName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mascaraRemoveBtn)
                        .addGap(23, 23, 23))))
        );
        mascaraCartPanelLayout.setVerticalGroup(
            mascaraCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mascaraCartPanelLayout.createSequentialGroup()
                .addGroup(mascaraCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mascaraCartPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(mascaraRemoveBtn))
                    .addGroup(mascaraCartPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelMascaraName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mascaraCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMascaraPrice2)
                            .addComponent(jLabel40)
                            .addComponent(mascaraCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        perfumeCartPanel.setBackground(new java.awt.Color(255, 255, 255));
        perfumeCartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        perfumeCartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabelPerfumeName2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPerfumeName2.setForeground(new java.awt.Color(0, 102, 204));
        jLabelPerfumeName2.setText("Fariis Rosado Secret, Eau De Parfum, For Women, 100ml");

        jLabelPerfumePrice2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPerfumePrice2.setText("Rs. 4,180 ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Quantity:");

        perfumeRemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        perfumeRemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        perfumeRemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        perfumeRemoveBtn.setText("Remove");
        perfumeRemoveBtn.addActionListener(this::perfumeRemoveBtnActionPerformed);

        javax.swing.GroupLayout perfumeCartPanelLayout = new javax.swing.GroupLayout(perfumeCartPanel);
        perfumeCartPanel.setLayout(perfumeCartPanelLayout);
        perfumeCartPanelLayout.setHorizontalGroup(
            perfumeCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perfumeCartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(perfumeCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPerfumeName2)
                    .addGroup(perfumeCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelPerfumePrice2)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(perfumeCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(perfumeRemoveBtn)
                .addGap(22, 22, 22))
        );
        perfumeCartPanelLayout.setVerticalGroup(
            perfumeCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perfumeCartPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelPerfumeName2)
                .addGap(10, 10, 10)
                .addGroup(perfumeCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPerfumePrice2)
                    .addComponent(jLabel11)
                    .addComponent(perfumeCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perfumeCartPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(perfumeRemoveBtn)
                .addGap(27, 27, 27))
        );

        butterCartPanel.setBackground(new java.awt.Color(255, 255, 255));
        butterCartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        butterCartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabelButterName1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelButterName1.setForeground(new java.awt.Color(0, 102, 204));
        jLabelButterName1.setText("Fresh Street Un-Salted Butter, 200g");

        jLabelButrerPrice1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelButrerPrice1.setText("  Rs. 747 ");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setText("Quantity:");

        butterRemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        butterRemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        butterRemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        butterRemoveBtn.setText("Remove");
        butterRemoveBtn.addActionListener(this::butterRemoveBtnActionPerformed);

        javax.swing.GroupLayout butterCartPanelLayout = new javax.swing.GroupLayout(butterCartPanel);
        butterCartPanel.setLayout(butterCartPanelLayout);
        butterCartPanelLayout.setHorizontalGroup(
            butterCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(butterCartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(butterCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelButterName1)
                    .addGroup(butterCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelButrerPrice1)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butterCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butterRemoveBtn)
                .addGap(21, 21, 21))
        );
        butterCartPanelLayout.setVerticalGroup(
            butterCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(butterCartPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelButterName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(butterCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelButrerPrice1)
                    .addComponent(jLabel38)
                    .addComponent(butterCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, butterCartPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butterRemoveBtn)
                .addGap(27, 27, 27))
        );

        eggsCartPanel.setBackground(new java.awt.Color(255, 255, 255));
        eggsCartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        eggsCartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabelEggsName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEggsName.setForeground(new java.awt.Color(0, 102, 204));
        jLabelEggsName.setText("All Fresh Farms Brown Eggs, 12-Pack");

        jLabelEggsPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEggsPrice.setText("Rs. 630");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setText("Quantity:");

        eggsRemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        eggsRemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        eggsRemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        eggsRemoveBtn.setText("Remove");
        eggsRemoveBtn.addActionListener(this::eggsRemoveBtnActionPerformed);

        javax.swing.GroupLayout eggsCartPanelLayout = new javax.swing.GroupLayout(eggsCartPanel);
        eggsCartPanel.setLayout(eggsCartPanelLayout);
        eggsCartPanelLayout.setHorizontalGroup(
            eggsCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eggsCartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eggsCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eggsCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelEggsPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eggsCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelEggsName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eggsRemoveBtn)
                .addGap(25, 25, 25))
        );
        eggsCartPanelLayout.setVerticalGroup(
            eggsCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eggsCartPanelLayout.createSequentialGroup()
                .addGroup(eggsCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eggsCartPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelEggsName)
                        .addGap(10, 10, 10)
                        .addGroup(eggsCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEggsPrice)
                            .addComponent(jLabel41)
                            .addComponent(eggsCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(eggsCartPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(eggsRemoveBtn)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        teaCartPanel.setBackground(new java.awt.Color(255, 255, 255));
        teaCartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        teaCartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabelTeaName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTeaName.setForeground(new java.awt.Color(0, 102, 204));
        jLabelTeaName.setText("Lipton Yellow Label Tea, 170g");

        jLabelTeaPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTeaPrice.setText("Rs. 400 ");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setText("Quantity:");

        teaRemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        teaRemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        teaRemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        teaRemoveBtn.setText("Remove");
        teaRemoveBtn.addActionListener(this::teaRemoveBtnActionPerformed);

        javax.swing.GroupLayout teaCartPanelLayout = new javax.swing.GroupLayout(teaCartPanel);
        teaCartPanel.setLayout(teaCartPanelLayout);
        teaCartPanelLayout.setHorizontalGroup(
            teaCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teaCartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(teaCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTeaName)
                    .addGroup(teaCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelTeaPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teaCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(teaRemoveBtn)
                .addGap(28, 28, 28))
        );
        teaCartPanelLayout.setVerticalGroup(
            teaCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teaCartPanelLayout.createSequentialGroup()
                .addGroup(teaCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teaCartPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabelTeaName)
                        .addGap(9, 9, 9)
                        .addGroup(teaCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTeaPrice)
                            .addComponent(jLabel46)
                            .addComponent(teaCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(teaCartPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(teaRemoveBtn)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        breadCartPanel.setBackground(new java.awt.Color(255, 255, 255));
        breadCartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        breadCartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabelBreadName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBreadName.setForeground(new java.awt.Color(0, 102, 204));
        jLabelBreadName.setText("Dawn Vitamin Enriched Bread Small");

        jLabelBreadPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBreadPrice.setText("Rs. 130");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setText("Quantity:");

        breadRemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        breadRemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        breadRemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        breadRemoveBtn.setText("Remove");
        breadRemoveBtn.addActionListener(this::breadRemoveBtnActionPerformed);

        javax.swing.GroupLayout breadCartPanelLayout = new javax.swing.GroupLayout(breadCartPanel);
        breadCartPanel.setLayout(breadCartPanelLayout);
        breadCartPanelLayout.setHorizontalGroup(
            breadCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(breadCartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(breadCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBreadName)
                    .addGroup(breadCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelBreadPrice)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(breadCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(breadRemoveBtn)
                .addGap(28, 28, 28))
        );
        breadCartPanelLayout.setVerticalGroup(
            breadCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(breadCartPanelLayout.createSequentialGroup()
                .addGroup(breadCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(breadCartPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelBreadName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(breadCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBreadPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49)
                            .addComponent(breadCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(breadCartPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(breadRemoveBtn)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        book1CartPanel.setBackground(new java.awt.Color(255, 255, 255));
        book1CartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        book1CartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabelBook1Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBook1Name.setForeground(new java.awt.Color(0, 102, 204));
        jLabelBook1Name.setText("The Courage to Be Disliked By: Ichiro Kishimi");

        jLabelBook1Price.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBook1Price.setText("Rs 3,195");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setText("Quantity:");

        book1RemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        book1RemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        book1RemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        book1RemoveBtn.setText("Remove");
        book1RemoveBtn.addActionListener(this::book1RemoveBtnActionPerformed);

        javax.swing.GroupLayout book1CartPanelLayout = new javax.swing.GroupLayout(book1CartPanel);
        book1CartPanel.setLayout(book1CartPanelLayout);
        book1CartPanelLayout.setHorizontalGroup(
            book1CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(book1CartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(book1CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBook1Name)
                    .addGroup(book1CartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelBook1Price)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(book1CartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(book1RemoveBtn)
                .addGap(27, 27, 27))
        );
        book1CartPanelLayout.setVerticalGroup(
            book1CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(book1CartPanelLayout.createSequentialGroup()
                .addGroup(book1CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(book1CartPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelBook1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(book1CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBook1Price)
                            .addComponent(jLabel54)
                            .addComponent(book1CartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(book1CartPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(book1RemoveBtn)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        book2CartPanel.setBackground(new java.awt.Color(255, 255, 255));
        book2CartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        book2CartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabelBook2Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBook2Name.setForeground(new java.awt.Color(0, 102, 204));
        jLabelBook2Name.setText("Iran's Grand Strategy: A Political History By: Vali Nasr ");

        jLabelBook2Price.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBook2Price.setText("Rs 1,795");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setText("Quantity:");

        book2RemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        book2RemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        book2RemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        book2RemoveBtn.setText("Remove");
        book2RemoveBtn.addActionListener(this::book2RemoveBtnActionPerformed);

        javax.swing.GroupLayout book2CartPanelLayout = new javax.swing.GroupLayout(book2CartPanel);
        book2CartPanel.setLayout(book2CartPanelLayout);
        book2CartPanelLayout.setHorizontalGroup(
            book2CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(book2CartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(book2CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBook2Name)
                    .addGroup(book2CartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelBook2Price)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(book2CartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(book2RemoveBtn)
                .addGap(26, 26, 26))
        );
        book2CartPanelLayout.setVerticalGroup(
            book2CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(book2CartPanelLayout.createSequentialGroup()
                .addGroup(book2CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(book2CartPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelBook2Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(book2CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBook2Price)
                            .addComponent(jLabel58)
                            .addComponent(book2CartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(book2CartPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(book2RemoveBtn)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        book3CartPanel.setBackground(new java.awt.Color(255, 255, 255));
        book3CartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        book3CartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabelBook3Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBook3Name.setForeground(new java.awt.Color(0, 102, 204));
        jLabelBook3Name.setText(" History Of Western Philosophy By: Bertrand Russell");

        jLabelBook3Price.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBook3Price.setText("Rs 1,349");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel62.setText("Quantity:");

        book3RemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        book3RemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        book3RemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        book3RemoveBtn.setText("Remove");
        book3RemoveBtn.addActionListener(this::book3RemoveBtnActionPerformed);

        javax.swing.GroupLayout book3CartPanelLayout = new javax.swing.GroupLayout(book3CartPanel);
        book3CartPanel.setLayout(book3CartPanelLayout);
        book3CartPanelLayout.setHorizontalGroup(
            book3CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(book3CartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(book3CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBook3Name)
                    .addGroup(book3CartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelBook3Price)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(book3CartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(book3RemoveBtn)
                .addGap(29, 29, 29))
        );
        book3CartPanelLayout.setVerticalGroup(
            book3CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(book3CartPanelLayout.createSequentialGroup()
                .addGroup(book3CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(book3CartPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelBook3Name)
                        .addGap(3, 3, 3)
                        .addGroup(book3CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBook3Price)
                            .addComponent(jLabel62)
                            .addComponent(book3CartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(book3CartPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(book3RemoveBtn)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        book4CartPanel.setBackground(new java.awt.Color(255, 255, 255));
        book4CartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        book4CartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabelBook4Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBook4Name.setForeground(new java.awt.Color(0, 102, 204));
        jLabelBook4Name.setText("The Let Them Theory By: Mel Robbins");

        jLabelBook4Price.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBook4Price.setText("Rs 7,015");

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel66.setText("Quantity:");

        book4RemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        book4RemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        book4RemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        book4RemoveBtn.setText("Remove");
        book4RemoveBtn.addActionListener(this::book4RemoveBtnActionPerformed);

        javax.swing.GroupLayout book4CartPanelLayout = new javax.swing.GroupLayout(book4CartPanel);
        book4CartPanel.setLayout(book4CartPanelLayout);
        book4CartPanelLayout.setHorizontalGroup(
            book4CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(book4CartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(book4CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBook4Name)
                    .addGroup(book4CartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelBook4Price)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(book4CartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(book4RemoveBtn)
                .addGap(29, 29, 29))
        );
        book4CartPanelLayout.setVerticalGroup(
            book4CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(book4CartPanelLayout.createSequentialGroup()
                .addGroup(book4CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(book4CartPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelBook4Name)
                        .addGap(4, 4, 4)
                        .addGroup(book4CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBook4Price)
                            .addComponent(jLabel66)
                            .addComponent(book4CartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(book4CartPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(book4RemoveBtn)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        book5CartPanel.setBackground(new java.awt.Color(255, 255, 255));
        book5CartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        book5CartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabelBook5Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBook5Name.setForeground(new java.awt.Color(0, 102, 204));
        jLabelBook5Name.setText("White Nights: Fjodor Dostoyevsky");

        jLabelBook5Price.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBook5Price.setText("Rs 1,255");

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel70.setText("Quantity:");

        book5RemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        book5RemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        book5RemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        book5RemoveBtn.setText("Remove");
        book5RemoveBtn.addActionListener(this::book5RemoveBtnActionPerformed);

        javax.swing.GroupLayout book5CartPanelLayout = new javax.swing.GroupLayout(book5CartPanel);
        book5CartPanel.setLayout(book5CartPanelLayout);
        book5CartPanelLayout.setHorizontalGroup(
            book5CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(book5CartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(book5CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBook5Name)
                    .addGroup(book5CartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelBook5Price)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(book5CartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(book5RemoveBtn)
                .addGap(26, 26, 26))
        );
        book5CartPanelLayout.setVerticalGroup(
            book5CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(book5CartPanelLayout.createSequentialGroup()
                .addGroup(book5CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(book5CartPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelBook5Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(book5CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBook5Price)
                            .addComponent(jLabel70)
                            .addComponent(book5CartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(book5CartPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(book5RemoveBtn)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        book6CartPanel.setBackground(new java.awt.Color(255, 255, 255));
        book6CartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        book6CartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabelBook6Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBook6Name.setForeground(new java.awt.Color(0, 102, 153));
        jLabelBook6Name.setText("The Art of Being Alone By: Renuka Gavrani ");

        jLabelBook6Price.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBook6Price.setText("Rs 2,495");

        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel74.setText("Quantity:");

        book6RemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        book6RemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        book6RemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        book6RemoveBtn.setText("Remove");
        book6RemoveBtn.addActionListener(this::book6RemoveBtnActionPerformed);

        javax.swing.GroupLayout book6CartPanelLayout = new javax.swing.GroupLayout(book6CartPanel);
        book6CartPanel.setLayout(book6CartPanelLayout);
        book6CartPanelLayout.setHorizontalGroup(
            book6CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(book6CartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(book6CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBook6Name)
                    .addGroup(book6CartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelBook6Price)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(book6CartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(book6RemoveBtn)
                .addGap(29, 29, 29))
        );
        book6CartPanelLayout.setVerticalGroup(
            book6CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(book6CartPanelLayout.createSequentialGroup()
                .addGroup(book6CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(book6CartPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelBook6Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(book6CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(book6CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(book6CartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelBook6Price, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(book6CartPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(book6RemoveBtn)))
                .addContainerGap())
        );

        milkCartPanel.setBackground(new java.awt.Color(255, 255, 255));
        milkCartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        milkCartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabelMilkName1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMilkName1.setForeground(new java.awt.Color(0, 102, 204));
        jLabelMilkName1.setText("Olper's Full Cream Milk, 1000ml");

        jLabelMilkPrice1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMilkPrice1.setText("Rs. 380");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Quantity:");

        milkRemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        milkRemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        milkRemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        milkRemoveBtn.setText("Remove");
        milkRemoveBtn.addActionListener(this::milkRemoveBtnActionPerformed);

        javax.swing.GroupLayout milkCartPanelLayout = new javax.swing.GroupLayout(milkCartPanel);
        milkCartPanel.setLayout(milkCartPanelLayout);
        milkCartPanelLayout.setHorizontalGroup(
            milkCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(milkCartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(milkCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMilkName1)
                    .addGroup(milkCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelMilkPrice1)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(milkCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(milkRemoveBtn)
                .addGap(18, 18, 18))
        );
        milkCartPanelLayout.setVerticalGroup(
            milkCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(milkCartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMilkName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(milkCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMilkPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(milkCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(milkCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, milkCartPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(milkRemoveBtn)
                .addGap(17, 17, 17))
        );

        yogurtCartPanel.setBackground(new java.awt.Color(255, 255, 255));
        yogurtCartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        yogurtCartPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabelYogurtName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelYogurtName.setForeground(new java.awt.Color(0, 102, 204));
        jLabelYogurtName.setText("Nestle Original Yogurt, Sweet, 400g");

        jLabelYogutPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelYogutPrice.setText("Rs. 270");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Quantity:");

        yogurtRemoveBtn.setBackground(new java.awt.Color(179, 48, 75));
        yogurtRemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        yogurtRemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        yogurtRemoveBtn.setText("Remove");
        yogurtRemoveBtn.addActionListener(this::yogurtRemoveBtnActionPerformed);

        javax.swing.GroupLayout yogurtCartPanelLayout = new javax.swing.GroupLayout(yogurtCartPanel);
        yogurtCartPanel.setLayout(yogurtCartPanelLayout);
        yogurtCartPanelLayout.setHorizontalGroup(
            yogurtCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yogurtCartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(yogurtCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelYogurtName)
                    .addGroup(yogurtCartPanelLayout.createSequentialGroup()
                        .addComponent(jLabelYogutPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yogurtCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(yogurtRemoveBtn)
                .addGap(24, 24, 24))
        );
        yogurtCartPanelLayout.setVerticalGroup(
            yogurtCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yogurtCartPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelYogurtName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(yogurtCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelYogutPrice)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yogurtCartPanelLayout.createSequentialGroup()
                        .addGroup(yogurtCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yogurtCartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addContainerGap())))
            .addGroup(yogurtCartPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(yogurtRemoveBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cartMainPanelLayout = new javax.swing.GroupLayout(cartMainPanel);
        cartMainPanel.setLayout(cartMainPanelLayout);
        cartMainPanelLayout.setHorizontalGroup(
            cartMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartMainPanelLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(cartMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(book6CartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(book5CartPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(book4CartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(book2CartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(breadCartPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(perfumeCartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(mascaraCartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(tvCartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dispenserCartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(toasterCartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(juicerCartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(airfryerCartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(lipstickCartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(eyeshadowCartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(concealerCartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(butterCartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(eggsCartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(teaCartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(book1CartPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(book3CartPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(milkCartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(yogurtCartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)))
        );
        cartMainPanelLayout.setVerticalGroup(
            cartMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartMainPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tvCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dispenserCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(toasterCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(juicerCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(airfryerCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lipstickCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eyeshadowCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(concealerCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mascaraCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perfumeCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(milkCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yogurtCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butterCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eggsCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teaCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(breadCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(book1CartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(book2CartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(book3CartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(book4CartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(book5CartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(book6CartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 2191, Short.MAX_VALUE)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(cartMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jPanelOrderSummary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(933, 933, Short.MAX_VALUE))
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelOrderSummary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutBtnActionPerformed
        // TODO add your handling code here:
        Checkout check =
new Checkout();

check.setVisible(true);
    }//GEN-LAST:event_checkoutBtnActionPerformed

    private void tvRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tvRemoveBtnActionPerformed
        // TODO add your handling code here:
        tvCartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_tvRemoveBtnActionPerformed

    private void book6RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book6RemoveBtnActionPerformed
        // TODO add your handling code here:
        book6CartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_book6RemoveBtnActionPerformed

    private void book2RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book2RemoveBtnActionPerformed
        // TODO add your handling code here:
        book2CartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_book2RemoveBtnActionPerformed

    private void book1RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book1RemoveBtnActionPerformed
        // TODO add your handling code here:
        book1CartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_book1RemoveBtnActionPerformed

    private void teaRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teaRemoveBtnActionPerformed
        // TODO add your handling code here:
        teaCartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_teaRemoveBtnActionPerformed

    private void eggsRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eggsRemoveBtnActionPerformed
        // TODO add your handling code here:
        eggsCartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_eggsRemoveBtnActionPerformed

    private void mascaraRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascaraRemoveBtnActionPerformed
        // TODO add your handling code here:
        mascaraCartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_mascaraRemoveBtnActionPerformed

    private void concealerRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concealerRemoveBtnActionPerformed
        // TODO add your handling code here:
        concealerCartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_concealerRemoveBtnActionPerformed

    private void toasterRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toasterRemoveBtnActionPerformed
        // TODO add your handling code here:
        toasterCartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_toasterRemoveBtnActionPerformed

    private void dispenserRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispenserRemoveBtnActionPerformed
        // TODO add your handling code here:
        dispenserCartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_dispenserRemoveBtnActionPerformed

    private void butterRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butterRemoveBtnActionPerformed
        // TODO add your handling code here:
        butterCartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_butterRemoveBtnActionPerformed

    private void milkRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milkRemoveBtnActionPerformed
        // TODO add your handling code here:
        milkCartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_milkRemoveBtnActionPerformed

    private void juicerRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juicerRemoveBtnActionPerformed
        // TODO add your handling code here:
        juicerCartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_juicerRemoveBtnActionPerformed

    private void airfryerRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airfryerRemoveBtnActionPerformed
        // TODO add your handling code here:
        airfryerCartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_airfryerRemoveBtnActionPerformed

    private void lipstickRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lipstickRemoveBtnActionPerformed
        // TODO add your handling code here:
        lipstickCartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_lipstickRemoveBtnActionPerformed

    private void eyeshadowRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eyeshadowRemoveBtnActionPerformed
        // TODO add your handling code here:
        eyeshadowCartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_eyeshadowRemoveBtnActionPerformed

    private void perfumeRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfumeRemoveBtnActionPerformed
        // TODO add your handling code here:
        perfumeCartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_perfumeRemoveBtnActionPerformed

    private void yogurtRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yogurtRemoveBtnActionPerformed
        // TODO add your handling code here:
        yogurtCartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_yogurtRemoveBtnActionPerformed

    private void breadRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breadRemoveBtnActionPerformed
        // TODO add your handling code here:
        breadCartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_breadRemoveBtnActionPerformed

    private void book3RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book3RemoveBtnActionPerformed
        // TODO add your handling code here:
        book3CartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_book3RemoveBtnActionPerformed

    private void book4RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book4RemoveBtnActionPerformed
        // TODO add your handling code here:
        book4CartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_book4RemoveBtnActionPerformed

    private void book5RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book5RemoveBtnActionPerformed
        // TODO add your handling code here:
        book5CartPanel.setVisible(false);
        updateCartTotal();
    }//GEN-LAST:event_book5RemoveBtnActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Cart().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel airfryerCartPanel;
    public javax.swing.JSpinner airfryerCartSpinner;
    private javax.swing.JButton airfryerRemoveBtn;
    public javax.swing.JPanel book1CartPanel;
    public javax.swing.JSpinner book1CartSpinner;
    private javax.swing.JButton book1RemoveBtn;
    public javax.swing.JPanel book2CartPanel;
    public javax.swing.JSpinner book2CartSpinner;
    private javax.swing.JButton book2RemoveBtn;
    public javax.swing.JPanel book3CartPanel;
    public javax.swing.JSpinner book3CartSpinner;
    private javax.swing.JButton book3RemoveBtn;
    public javax.swing.JPanel book4CartPanel;
    public javax.swing.JSpinner book4CartSpinner;
    private javax.swing.JButton book4RemoveBtn;
    public javax.swing.JPanel book5CartPanel;
    public javax.swing.JSpinner book5CartSpinner;
    private javax.swing.JButton book5RemoveBtn;
    public javax.swing.JPanel book6CartPanel;
    public javax.swing.JSpinner book6CartSpinner;
    private javax.swing.JButton book6RemoveBtn;
    public javax.swing.JPanel breadCartPanel;
    public javax.swing.JSpinner breadCartSpinner;
    private javax.swing.JButton breadRemoveBtn;
    public javax.swing.JPanel butterCartPanel;
    public javax.swing.JSpinner butterCartSpinner;
    private javax.swing.JButton butterRemoveBtn;
    public javax.swing.JPanel cartMainPanel;
    private javax.swing.JButton checkoutBtn;
    public javax.swing.JPanel concealerCartPanel;
    public javax.swing.JSpinner concealerCartSpinner;
    private javax.swing.JButton concealerRemoveBtn;
    public javax.swing.JPanel dispenserCartPanel;
    public javax.swing.JSpinner dispenserCartSpinner;
    private javax.swing.JButton dispenserRemoveBtn;
    public javax.swing.JPanel eggsCartPanel;
    public javax.swing.JSpinner eggsCartSpinner;
    private javax.swing.JButton eggsRemoveBtn;
    public javax.swing.JPanel eyeshadowCartPanel;
    public javax.swing.JSpinner eyeshadowCartSpinner;
    private javax.swing.JButton eyeshadowRemoveBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel2UserName;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAirfryerprice2;
    private javax.swing.JLabel jLabelBook1Name;
    private javax.swing.JLabel jLabelBook1Price;
    private javax.swing.JLabel jLabelBook2Name;
    private javax.swing.JLabel jLabelBook2Price;
    private javax.swing.JLabel jLabelBook3Name;
    private javax.swing.JLabel jLabelBook3Price;
    private javax.swing.JLabel jLabelBook4Name;
    private javax.swing.JLabel jLabelBook4Price;
    private javax.swing.JLabel jLabelBook5Name;
    private javax.swing.JLabel jLabelBook5Price;
    private javax.swing.JLabel jLabelBook6Name;
    private javax.swing.JLabel jLabelBook6Price;
    private javax.swing.JLabel jLabelBreadName;
    private javax.swing.JLabel jLabelBreadPrice;
    private javax.swing.JLabel jLabelButrerPrice1;
    private javax.swing.JLabel jLabelButterName1;
    private javax.swing.JLabel jLabelConcealerName2;
    private javax.swing.JLabel jLabelConcealerPrice2;
    private javax.swing.JLabel jLabelDispenserprice2;
    private javax.swing.JLabel jLabelEggsName;
    private javax.swing.JLabel jLabelEggsPrice;
    private javax.swing.JLabel jLabelEyeshadowName2;
    private javax.swing.JLabel jLabelEyeshadowPrice2;
    private javax.swing.JLabel jLabelJuicerprice2;
    private javax.swing.JLabel jLabelLipstickPrice2;
    private javax.swing.JLabel jLabelMascaraName2;
    private javax.swing.JLabel jLabelMascaraPrice2;
    private javax.swing.JLabel jLabelMilkName1;
    private javax.swing.JLabel jLabelMilkPrice1;
    private javax.swing.JLabel jLabelPerfumeName2;
    private javax.swing.JLabel jLabelPerfumePrice2;
    private javax.swing.JLabel jLabelTVname3;
    private javax.swing.JLabel jLabelTVprice3;
    private javax.swing.JLabel jLabelTeaName;
    private javax.swing.JLabel jLabelTeaPrice;
    private javax.swing.JLabel jLabelToasterprice2;
    private javax.swing.JLabel jLabelUsericon;
    private javax.swing.JLabel jLabelYogurtName;
    private javax.swing.JLabel jLabelYogutPrice;
    private javax.swing.JLabel jLabelairfryerName2;
    private javax.swing.JLabel jLabeldispenserName2;
    private javax.swing.JLabel jLabeljuicerName2;
    private javax.swing.JLabel jLabellipstickName2;
    private javax.swing.JLabel jLabelordifyLogo;
    private javax.swing.JLabel jLabeltoasterName2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelOrderSummary;
    public javax.swing.JPanel juicerCartPanel;
    public javax.swing.JSpinner juicerCartSpinner;
    private javax.swing.JButton juicerRemoveBtn;
    public javax.swing.JPanel lipstickCartPanel;
    public javax.swing.JSpinner lipstickCartSpinner;
    private javax.swing.JButton lipstickRemoveBtn;
    public javax.swing.JPanel mascaraCartPanel;
    public javax.swing.JSpinner mascaraCartSpinner;
    private javax.swing.JButton mascaraRemoveBtn;
    public javax.swing.JPanel milkCartPanel;
    public javax.swing.JSpinner milkCartSpinner;
    private javax.swing.JButton milkRemoveBtn;
    public javax.swing.JPanel perfumeCartPanel;
    public javax.swing.JSpinner perfumeCartSpinner;
    private javax.swing.JButton perfumeRemoveBtn;
    public javax.swing.JPanel teaCartPanel;
    public javax.swing.JSpinner teaCartSpinner;
    private javax.swing.JButton teaRemoveBtn;
    public javax.swing.JPanel toasterCartPanel;
    public javax.swing.JSpinner toasterCartSpinner;
    private javax.swing.JButton toasterRemoveBtn;
    private javax.swing.JLabel totalLabel;
    public javax.swing.JPanel tvCartPanel;
    public javax.swing.JSpinner tvCartSpinner;
    private javax.swing.JButton tvRemoveBtn;
    public javax.swing.JPanel yogurtCartPanel;
    public static javax.swing.JSpinner yogurtCartSpinner;
    private javax.swing.JButton yogurtRemoveBtn;
    // End of variables declaration//GEN-END:variables
}
