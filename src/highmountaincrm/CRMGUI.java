package highmountaincrm;

import java.awt.*;
import java.awt.Component;
import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.ListModel;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.NumberFormatter;

public class CRMGUI extends javax.swing.JFrame {
    //public static List<Contact> contacts = new ArrayList<>();
    //public static DefaultListModel<Contact> contactModel = new DefaultListModel<>();
    public Color genericColor = new Color(209, 220, 204);    
    private AlternatingListCellRenderer cellRenderer = new AlternatingListCellRenderer();

    public CRMGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleBar = new javax.swing.JPanel();
        lblTitlebar = new javax.swing.JTextField();
        mainFramePanel = new javax.swing.JPanel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        leftPanel = new javax.swing.JPanel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15));
        strSearchBar = new javax.swing.JTextField();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15));
        contactList = new javax.swing.JScrollPane();
        contactListDetails = new javax.swing.JList();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 30), new java.awt.Dimension(0, 30));
        buttonPanel = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        deleteButton = new javax.swing.JButton();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        newContactButton = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 30), new java.awt.Dimension(0, 30));
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        rightPanel = new javax.swing.JPanel();
        clientDisplay = new javax.swing.JTabbedPane();
        clientInfoTab = new javax.swing.JPanel();
        clientInfoLabelPanel = new javax.swing.JPanel();
        lblClientName = new javax.swing.JLabel();
        lblCompany = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        clientInfoPanel = new javax.swing.JPanel();
        strClientName = new javax.swing.JLabel();
        strCompany = new javax.swing.JLabel();
        strAddress = new javax.swing.JLabel();
        strCity = new javax.swing.JLabel();
        strState = new javax.swing.JLabel();
        strZipCode = new javax.swing.JLabel();
        strEmail = new javax.swing.JLabel();
        phoneListPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        orderTab = new javax.swing.JPanel();
        orderInfoDetailPanel = new javax.swing.JPanel();
        orderList = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        notesTab = new javax.swing.JPanel();
        clientInfoFields2 = new javax.swing.JPanel();
        addressTextLabel2 = new javax.swing.JLabel();
        nameLabel3 = new javax.swing.JLabel();
        nameLabel6 = new javax.swing.JLabel();
        nameLabel9 = new javax.swing.JLabel();
        strNotes2 = new javax.swing.JLabel();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        printList = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        menuNewClient = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(950, 500));
        setPreferredSize(new java.awt.Dimension(950, 500));

        titleBar.setMaximumSize(new java.awt.Dimension(800, 30));
        titleBar.setMinimumSize(new java.awt.Dimension(800, 30));
        titleBar.setName(""); // NOI18N
        titleBar.setLayout(new javax.swing.BoxLayout(titleBar, javax.swing.BoxLayout.LINE_AXIS));

        lblTitlebar.setBackground(new java.awt.Color(0, 0, 102));
        lblTitlebar.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        lblTitlebar.setForeground(new java.awt.Color(240, 240, 240));
        lblTitlebar.setText("HIGH MOUNTAIN SALES");
        lblTitlebar.setToolTipText("");
        lblTitlebar.setPreferredSize(new java.awt.Dimension(275, 50));
        lblTitlebar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblTitlebarActionPerformed(evt);
            }
        });
        titleBar.add(lblTitlebar);

        getContentPane().add(titleBar, java.awt.BorderLayout.PAGE_START);

        mainFramePanel.setBackground(new java.awt.Color(51, 51, 51));
        mainFramePanel.setLayout(new javax.swing.BoxLayout(mainFramePanel, javax.swing.BoxLayout.X_AXIS));
        mainFramePanel.add(filler9);

        leftPanel.setBackground(new java.awt.Color(51, 51, 51));
        leftPanel.setMinimumSize(new java.awt.Dimension(200, 200));
        leftPanel.setPreferredSize(new java.awt.Dimension(200, 200));
        leftPanel.setLayout(new javax.swing.BoxLayout(leftPanel, javax.swing.BoxLayout.Y_AXIS));
        leftPanel.add(filler7);

        strSearchBar.setText("Search");
        strSearchBar.setAlignmentX(1.0F);
        strSearchBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        strSearchBar.setMaximumSize(new java.awt.Dimension(2147483647, 30));
        strSearchBar.setMinimumSize(new java.awt.Dimension(2, 20));
        strSearchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strSearchBarMouseClicked(evt);
            }
        });
        strSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strSearchBarActionPerformed(evt);
            }
        });
        leftPanel.add(strSearchBar);
        leftPanel.add(filler6);

        contactListDetails.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "a", "b", "c", "d", "e" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        contactListDetails.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        contactListDetails.setToolTipText("");
        contactListDetails.setCellRenderer(cellRenderer);
        contactListDetails.setMaximumSize(new java.awt.Dimension(300, 360));
        contactListDetails.setPreferredSize(new java.awt.Dimension(300, 360));
        contactList.setViewportView(contactListDetails);

        leftPanel.add(contactList);
        leftPanel.add(filler4);

        buttonPanel.setBackground(new java.awt.Color(51, 51, 51));
        buttonPanel.setLayout(new javax.swing.BoxLayout(buttonPanel, javax.swing.BoxLayout.X_AXIS));
        buttonPanel.add(filler2);

        deleteButton.setBackground(new java.awt.Color(102, 0, 0));
        deleteButton.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Remove");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(deleteButton);
        buttonPanel.add(filler10);

        newContactButton.setBackground(new java.awt.Color(0, 0, 102));
        newContactButton.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        newContactButton.setForeground(new java.awt.Color(255, 255, 255));
        newContactButton.setText("New");
        newContactButton.setPreferredSize(new java.awt.Dimension(83, 23));
        newContactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newContactButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(newContactButton);
        buttonPanel.add(filler3);

        leftPanel.add(buttonPanel);
        leftPanel.add(filler5);

        mainFramePanel.add(leftPanel);
        mainFramePanel.add(filler13);

        rightPanel.setLayout(new javax.swing.BoxLayout(rightPanel, javax.swing.BoxLayout.Y_AXIS));

        clientDisplay.setBackground(new java.awt.Color(0, 0, 102));
        clientDisplay.setMinimumSize(new java.awt.Dimension(300, 60));
        clientDisplay.setPreferredSize(new java.awt.Dimension(300, 60));

        clientInfoTab.setToolTipText("");
        clientInfoTab.setLayout(new java.awt.BorderLayout());

        clientInfoLabelPanel.setBackground(new java.awt.Color(204, 204, 255));
        clientInfoLabelPanel.setLayout(new javax.swing.BoxLayout(clientInfoLabelPanel, javax.swing.BoxLayout.Y_AXIS));

        lblClientName.setText("Client Name:");
        clientInfoLabelPanel.add(lblClientName);

        lblCompany.setText("Company:");
        clientInfoLabelPanel.add(lblCompany);

        lblAddress.setText("Address:");
        clientInfoLabelPanel.add(lblAddress);

        lblCity.setText("City:");
        clientInfoLabelPanel.add(lblCity);

        lblState.setText("State:");
        clientInfoLabelPanel.add(lblState);

        lblZipCode.setText("Zip Code:");
        clientInfoLabelPanel.add(lblZipCode);

        lblEmail.setText("Email:");
        clientInfoLabelPanel.add(lblEmail);

        clientInfoTab.add(clientInfoLabelPanel, java.awt.BorderLayout.WEST);

        clientInfoPanel.setMaximumSize(new java.awt.Dimension(100, 56));
        clientInfoPanel.setMinimumSize(new java.awt.Dimension(100, 56));
        clientInfoPanel.setLayout(new javax.swing.BoxLayout(clientInfoPanel, javax.swing.BoxLayout.Y_AXIS));

        strClientName.setMaximumSize(new java.awt.Dimension(175, 14));
        strClientName.setMinimumSize(new java.awt.Dimension(175, 14));
        clientInfoPanel.add(strClientName);

        strCompany.setMaximumSize(new java.awt.Dimension(175, 14));
        strCompany.setMinimumSize(new java.awt.Dimension(175, 14));
        clientInfoPanel.add(strCompany);

        strAddress.setMaximumSize(new java.awt.Dimension(175, 14));
        strAddress.setMinimumSize(new java.awt.Dimension(175, 14));
        clientInfoPanel.add(strAddress);

        strCity.setMaximumSize(new java.awt.Dimension(175, 14));
        strCity.setMinimumSize(new java.awt.Dimension(175, 14));
        clientInfoPanel.add(strCity);

        strState.setMaximumSize(new java.awt.Dimension(175, 14));
        strState.setMinimumSize(new java.awt.Dimension(175, 14));
        clientInfoPanel.add(strState);

        strZipCode.setMaximumSize(new java.awt.Dimension(175, 14));
        strZipCode.setMinimumSize(new java.awt.Dimension(175, 14));
        clientInfoPanel.add(strZipCode);

        strEmail.setMaximumSize(new java.awt.Dimension(175, 14));
        strEmail.setMinimumSize(new java.awt.Dimension(175, 14));
        clientInfoPanel.add(strEmail);

        clientInfoTab.add(clientInfoPanel, java.awt.BorderLayout.CENTER);

        phoneListPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Phone List:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        phoneListPanel.setLayout(new javax.swing.BoxLayout(phoneListPanel, javax.swing.BoxLayout.LINE_AXIS));

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setMaximumSize(new java.awt.Dimension(33, 50));
        jList1.setMinimumSize(new java.awt.Dimension(33, 50));
        jList1.setPreferredSize(new java.awt.Dimension(33, 50));
        jScrollPane1.setViewportView(jList1);

        phoneListPanel.add(jScrollPane1);

        clientInfoTab.add(phoneListPanel, java.awt.BorderLayout.SOUTH);

        clientDisplay.addTab("Client Info", new javax.swing.ImageIcon(getClass().getResource("/Resource/clientIcon.png")), clientInfoTab); // NOI18N

        orderTab.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Order Detail:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        orderTab.setPreferredSize(new java.awt.Dimension(240, 360));
        orderTab.setLayout(new java.awt.BorderLayout());

        orderInfoDetailPanel.setMinimumSize(new java.awt.Dimension(283, 410));
        orderInfoDetailPanel.setPreferredSize(new java.awt.Dimension(283, 410));

        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        orderList.setViewportView(jList2);

        javax.swing.GroupLayout orderInfoDetailPanelLayout = new javax.swing.GroupLayout(orderInfoDetailPanel);
        orderInfoDetailPanel.setLayout(orderInfoDetailPanelLayout);
        orderInfoDetailPanelLayout.setHorizontalGroup(
            orderInfoDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderList, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        );
        orderInfoDetailPanelLayout.setVerticalGroup(
            orderInfoDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderInfoDetailPanelLayout.createSequentialGroup()
                .addComponent(orderList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 280, Short.MAX_VALUE))
        );

        orderTab.add(orderInfoDetailPanel, java.awt.BorderLayout.NORTH);

        clientDisplay.addTab("Order Info", new javax.swing.ImageIcon(getClass().getResource("/Resource/order.png")), orderTab); // NOI18N

        clientInfoFields2.setMaximumSize(new java.awt.Dimension(100, 56));
        clientInfoFields2.setMinimumSize(new java.awt.Dimension(100, 56));
        clientInfoFields2.setLayout(new javax.swing.BoxLayout(clientInfoFields2, javax.swing.BoxLayout.Y_AXIS));
        clientInfoFields2.add(addressTextLabel2);
        clientInfoFields2.add(nameLabel3);
        clientInfoFields2.add(nameLabel6);
        clientInfoFields2.add(nameLabel9);

        strNotes2.setMaximumSize(new java.awt.Dimension(295, 400));
        strNotes2.setMinimumSize(new java.awt.Dimension(295, 400));
        clientInfoFields2.add(strNotes2);

        javax.swing.GroupLayout notesTabLayout = new javax.swing.GroupLayout(notesTab);
        notesTab.setLayout(notesTabLayout);
        notesTabLayout.setHorizontalGroup(
            notesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clientInfoFields2, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
        );
        notesTabLayout.setVerticalGroup(
            notesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notesTabLayout.createSequentialGroup()
                .addComponent(clientInfoFields2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        clientDisplay.addTab("Notes", new javax.swing.ImageIcon(getClass().getResource("/Resource/note.png")), notesTab); // NOI18N

        rightPanel.add(clientDisplay);
        clientDisplay.getAccessibleContext().setAccessibleName("");

        mainFramePanel.add(rightPanel);
        mainFramePanel.add(filler12);

        getContentPane().add(mainFramePanel, java.awt.BorderLayout.CENTER);

        filler14.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(filler14, java.awt.BorderLayout.PAGE_END);

        menuBar.setBackground(new java.awt.Color(51, 51, 51));

        menuFile.setText("File");

        printList.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        printList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/print-icon.png"))); // NOI18N
        printList.setText("Print");
        printList.setMinimumSize(new java.awt.Dimension(125, 30));
        printList.setName(""); // NOI18N
        printList.setPreferredSize(new java.awt.Dimension(125, 30));
        menuFile.add(printList);

        menuBar.add(menuFile);

        menuEdit.setText("Edit");

        menuNewClient.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuNewClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/user_add.png"))); // NOI18N
        menuNewClient.setText("New Customer");
        menuEdit.add(menuNewClient);

        menuBar.add(menuEdit);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void lblTitlebarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblTitlebarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTitlebarActionPerformed

    private void strSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strSearchBarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_strSearchBarActionPerformed

    private void strSearchBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strSearchBarMouseClicked
        if (strSearchBar.getText().equals("Search")) {
            strSearchBar.setText("");
        }
    }//GEN-LAST:event_strSearchBarMouseClicked

    private void newContactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newContactButtonActionPerformed
        ContactBuilder contact = new ContactBuilder(this);
        contact.createContactBuilder(null);
//        Contact newContact = contact.getInformation();
//        if(newContact != null){
//            updateCurrent(newContact);
//            //commonEnemies.add(newContact);
//            updateModel(newContact.getType());
//        }
    }//GEN-LAST:event_newContactButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CRMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRMGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressTextLabel2;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JTabbedPane clientDisplay;
    private javax.swing.JPanel clientInfoFields2;
    private javax.swing.JPanel clientInfoLabelPanel;
    private javax.swing.JPanel clientInfoPanel;
    private javax.swing.JPanel clientInfoTab;
    private javax.swing.JScrollPane contactList;
    private javax.swing.JList contactListDetails;
    private javax.swing.JButton deleteButton;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblClientName;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblState;
    private javax.swing.JTextField lblTitlebar;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel mainFramePanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuNewClient;
    private javax.swing.JLabel nameLabel3;
    private javax.swing.JLabel nameLabel6;
    private javax.swing.JLabel nameLabel9;
    private javax.swing.JButton newContactButton;
    private javax.swing.JPanel notesTab;
    private javax.swing.JPanel orderInfoDetailPanel;
    private javax.swing.JScrollPane orderList;
    private javax.swing.JPanel orderTab;
    private javax.swing.JPanel phoneListPanel;
    private javax.swing.JMenuItem printList;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel strAddress;
    private javax.swing.JLabel strCity;
    private javax.swing.JLabel strClientName;
    private javax.swing.JLabel strCompany;
    private javax.swing.JLabel strEmail;
    private javax.swing.JLabel strNotes2;
    private javax.swing.JTextField strSearchBar;
    private javax.swing.JLabel strState;
    private javax.swing.JLabel strZipCode;
    private javax.swing.JPanel titleBar;
    // End of variables declaration//GEN-END:variables
}
