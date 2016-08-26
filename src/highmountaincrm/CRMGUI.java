package highmountaincrm;

import highmountaincrm.Classes.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class CRMGUI extends javax.swing.JFrame {
    public Color genericColor = new Color(209, 220, 204);    
    private AlternatingListCellRenderer cellRenderer = new AlternatingListCellRenderer();
    
    private Contact currentContact;
    
    // Declare and initialize list models for JLists
    private DefaultListModel<Contact> contactModel = new DefaultListModel<>();
    private DefaultListModel<Phone> phoneModel = new DefaultListModel<>();
    private DefaultListModel<Order> orderModel = new DefaultListModel<>();
    private DefaultListModel<String> noteModel = new DefaultListModel<>();
    // Declare and initialize lists 
    private List<Contact> contactList = new ArrayList<>();
    private List<Phone> phoneList = new ArrayList<>();
    private List<Order> orderList = new ArrayList<>();
    private List<String> noteList = new ArrayList<>();

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
        contactScrollPane = new javax.swing.JScrollPane();
        contactJList = new javax.swing.JList<>();
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
        phoneScrollPane = new javax.swing.JScrollPane();
        phoneJList = new javax.swing.JList<>();
        orderTab = new javax.swing.JPanel();
        orderInfoDetailPanel = new javax.swing.JPanel();
        orderScrollPane = new javax.swing.JScrollPane();
        orderJList = new javax.swing.JList<>();
        orderButtonPanel = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        newOrderButton = new javax.swing.JButton();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        editOrderButton = new javax.swing.JButton();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        clearOrderButton = new javax.swing.JButton();
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        orderNotesPanel = new javax.swing.JPanel();
        orderInfoPanel = new javax.swing.JPanel();
        orderIdLabel = new javax.swing.JLabel();
        orderIdDisplay = new javax.swing.JLabel();
        orderAmountLabel = new javax.swing.JLabel();
        orderAmountDisplay = new javax.swing.JLabel();
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jScrollPane1 = new javax.swing.JScrollPane();
        orderNotesTextArea = new javax.swing.JTextArea();
        orderNotesButtonPanel = new javax.swing.JPanel();
        clearOrderNotesButton = new javax.swing.JButton();
        notesTab = new javax.swing.JPanel();
        notesDetailPanel = new javax.swing.JPanel();
        noteScrollPane = new javax.swing.JScrollPane();
        noteTextArea = new javax.swing.JTextArea();
        noteButtonPanel = new javax.swing.JPanel();
        clearNoteButton = new javax.swing.JButton();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        printList = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        menuNewClient = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(950, 600));
        setMinimumSize(new java.awt.Dimension(950, 600));
        setPreferredSize(new java.awt.Dimension(950, 600));

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

        contactJList.setModel(contactModel);
        contactJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        contactJList.setToolTipText("");
        contactJList.setCellRenderer(cellRenderer);
        contactJList.setMaximumSize(new java.awt.Dimension(300, 360));
        contactJList.setPreferredSize(new java.awt.Dimension(300, 360));
        contactJList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                contactJListValueChanged(evt);
            }
        });
        contactScrollPane.setViewportView(contactJList);

        leftPanel.add(contactScrollPane);
        leftPanel.add(filler4);

        buttonPanel.setBackground(new java.awt.Color(51, 51, 51));
        buttonPanel.setLayout(new javax.swing.BoxLayout(buttonPanel, javax.swing.BoxLayout.X_AXIS));
        buttonPanel.add(filler2);

        deleteButton.setBackground(new java.awt.Color(102, 0, 0));
        deleteButton.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(102, 0, 0));
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
        newContactButton.setForeground(new java.awt.Color(0, 0, 102));
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
        clientDisplay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clientDisplay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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

        phoneJList.setModel(phoneModel);
        phoneJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        phoneJList.setMaximumSize(new java.awt.Dimension(33, 50));
        phoneJList.setMinimumSize(new java.awt.Dimension(33, 50));
        phoneJList.setPreferredSize(new java.awt.Dimension(33, 50));
        phoneScrollPane.setViewportView(phoneJList);

        phoneListPanel.add(phoneScrollPane);

        clientInfoTab.add(phoneListPanel, java.awt.BorderLayout.SOUTH);

        clientDisplay.addTab("Client Info", new javax.swing.ImageIcon(getClass().getResource("/Resource/clientIcon.png")), clientInfoTab); // NOI18N

        orderTab.setPreferredSize(new java.awt.Dimension(240, 360));
        orderTab.setLayout(new javax.swing.BoxLayout(orderTab, javax.swing.BoxLayout.Y_AXIS));

        orderInfoDetailPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "List of Orders"));
        orderInfoDetailPanel.setAutoscrolls(true);
        orderInfoDetailPanel.setMinimumSize(new java.awt.Dimension(283, 40));
        orderInfoDetailPanel.setName(""); // NOI18N
        orderInfoDetailPanel.setPreferredSize(new java.awt.Dimension(283, 245));
        orderInfoDetailPanel.setLayout(new javax.swing.BoxLayout(orderInfoDetailPanel, javax.swing.BoxLayout.Y_AXIS));

        orderScrollPane.setMaximumSize(new java.awt.Dimension(32767, 200));
        orderScrollPane.setPreferredSize(new java.awt.Dimension(275, 200));

        orderJList.setModel(orderModel);
        orderJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        orderJList.setMaximumSize(new java.awt.Dimension(20, 250));
        orderJList.setMinimumSize(new java.awt.Dimension(20, 80));
        orderJList.setPreferredSize(new java.awt.Dimension(20, 80));
        orderScrollPane.setViewportView(orderJList);

        orderInfoDetailPanel.add(orderScrollPane);

        orderButtonPanel.setLayout(new javax.swing.BoxLayout(orderButtonPanel, javax.swing.BoxLayout.LINE_AXIS));
        orderButtonPanel.add(filler1);

        newOrderButton.setText("New");
        newOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderButtonActionPerformed(evt);
            }
        });
        orderButtonPanel.add(newOrderButton);
        orderButtonPanel.add(filler8);

        editOrderButton.setText("Edit");
        orderButtonPanel.add(editOrderButton);
        orderButtonPanel.add(filler11);

        clearOrderButton.setText("Remove");
        orderButtonPanel.add(clearOrderButton);
        orderButtonPanel.add(filler15);

        orderInfoDetailPanel.add(orderButtonPanel);

        orderTab.add(orderInfoDetailPanel);

        orderNotesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Order Notes"));
        orderNotesPanel.setLayout(new javax.swing.BoxLayout(orderNotesPanel, javax.swing.BoxLayout.Y_AXIS));

        orderInfoPanel.setLayout(new javax.swing.BoxLayout(orderInfoPanel, javax.swing.BoxLayout.LINE_AXIS));

        orderIdLabel.setText("Order Number:");
        orderInfoPanel.add(orderIdLabel);

        orderIdDisplay.setMaximumSize(new java.awt.Dimension(72, 14));
        orderIdDisplay.setMinimumSize(new java.awt.Dimension(72, 14));
        orderIdDisplay.setPreferredSize(new java.awt.Dimension(72, 14));
        orderInfoPanel.add(orderIdDisplay);

        orderAmountLabel.setText("Order Amount:");
        orderInfoPanel.add(orderAmountLabel);
        orderInfoPanel.add(orderAmountDisplay);
        orderInfoPanel.add(filler16);

        orderNotesPanel.add(orderInfoPanel);

        orderNotesTextArea.setColumns(20);
        orderNotesTextArea.setRows(5);
        jScrollPane1.setViewportView(orderNotesTextArea);

        orderNotesPanel.add(jScrollPane1);

        orderNotesButtonPanel.setLayout(new javax.swing.BoxLayout(orderNotesButtonPanel, javax.swing.BoxLayout.LINE_AXIS));

        clearOrderNotesButton.setText("Clear");
        clearOrderNotesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearOrderNotesButtonActionPerformed(evt);
            }
        });
        orderNotesButtonPanel.add(clearOrderNotesButton);

        orderNotesPanel.add(orderNotesButtonPanel);

        orderTab.add(orderNotesPanel);

        clientDisplay.addTab("Order Info", new javax.swing.ImageIcon(getClass().getResource("/Resource/order.png")), orderTab); // NOI18N

        notesDetailPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Notes"));
        notesDetailPanel.setMaximumSize(new java.awt.Dimension(270, 250));
        notesDetailPanel.setMinimumSize(new java.awt.Dimension(270, 250));
        notesDetailPanel.setPreferredSize(new java.awt.Dimension(270, 250));
        notesDetailPanel.setLayout(new javax.swing.BoxLayout(notesDetailPanel, javax.swing.BoxLayout.Y_AXIS));

        noteTextArea.setColumns(20);
        noteTextArea.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        noteTextArea.setLineWrap(true);
        noteTextArea.setRows(5);
        noteTextArea.setMaximumSize(new java.awt.Dimension(20, 250));
        noteTextArea.setMinimumSize(new java.awt.Dimension(20, 18));
        noteTextArea.setPreferredSize(new java.awt.Dimension(20, 200));
        noteScrollPane.setViewportView(noteTextArea);

        notesDetailPanel.add(noteScrollPane);

        noteButtonPanel.setLayout(new javax.swing.BoxLayout(noteButtonPanel, javax.swing.BoxLayout.LINE_AXIS));

        clearNoteButton.setText("Clear");
        noteButtonPanel.add(clearNoteButton);

        notesDetailPanel.add(noteButtonPanel);

        javax.swing.GroupLayout notesTabLayout = new javax.swing.GroupLayout(notesTab);
        notesTab.setLayout(notesTabLayout);
        notesTabLayout.setHorizontalGroup(
            notesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notesDetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
        );
        notesTabLayout.setVerticalGroup(
            notesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notesTabLayout.createSequentialGroup()
                .addComponent(notesDetailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
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
        // update column length on contact 
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
        // TODO add your handling code here:
        ContactBuilder contact = new ContactBuilder(this);
        contact.createContactBuilder(null);
        currentContact = contact.getContact();
        if(currentContact == null) return;
        contactModel.addElement(currentContact);
        contactList.add(currentContact);
        displayCurrent();
    }//GEN-LAST:event_newContactButtonActionPerformed

    private void contactJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_contactJListValueChanged
        currentContact = contactJList.getSelectedValue();
        displayCurrent();
    }//GEN-LAST:event_contactJListValueChanged

    private void clearOrderNotesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearOrderNotesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearOrderNotesButtonActionPerformed

    private void newOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newOrderButtonActionPerformed
    
    public void updateCurrent(Contact c){
        currentContact = c;
        displayCurrent();
    }
    
    public void displayCurrent(){
        if(currentContact == null) return;
        
        strClientName.setText(currentContact.getName());
        strCompany.setText(currentContact.getCompany());
        strAddress.setText(currentContact.getAddress());
        strCity.setText(currentContact.getCity());
        strState.setText(currentContact.getState());
        strZipCode.setText(currentContact.getZipCode());
        strEmail.setText(currentContact.getEmail());
        noteTextArea.setText(currentContact.getNote());
        
        if(!phoneModel.isEmpty()) phoneModel.clear();
        if(!phoneList.isEmpty()) phoneList.clear();
        for(Phone p: currentContact.getPhoneList()){
            phoneModel.addElement(p);
            phoneList.add(p);
        }
        
        if(!orderModel.isEmpty()) orderModel.clear();
        if(!orderList.isEmpty()) orderList.clear();
        for(Order o: currentContact.getOrderList()){
            orderModel.addElement(o);
            orderList.add(o);
        }
            
    }
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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton clearNoteButton;
    private javax.swing.JButton clearOrderButton;
    private javax.swing.JButton clearOrderNotesButton;
    private javax.swing.JTabbedPane clientDisplay;
    private javax.swing.JPanel clientInfoLabelPanel;
    private javax.swing.JPanel clientInfoPanel;
    private javax.swing.JPanel clientInfoTab;
    private javax.swing.JList<Contact> contactJList;
    private javax.swing.JScrollPane contactScrollPane;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editOrderButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
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
    private javax.swing.JButton newContactButton;
    private javax.swing.JButton newOrderButton;
    private javax.swing.JPanel noteButtonPanel;
    private javax.swing.JScrollPane noteScrollPane;
    private javax.swing.JTextArea noteTextArea;
    private javax.swing.JPanel notesDetailPanel;
    private javax.swing.JPanel notesTab;
    private javax.swing.JLabel orderAmountDisplay;
    private javax.swing.JLabel orderAmountLabel;
    private javax.swing.JPanel orderButtonPanel;
    private javax.swing.JLabel orderIdDisplay;
    private javax.swing.JLabel orderIdLabel;
    private javax.swing.JPanel orderInfoDetailPanel;
    private javax.swing.JPanel orderInfoPanel;
    private javax.swing.JList<Order> orderJList;
    private javax.swing.JPanel orderNotesButtonPanel;
    private javax.swing.JPanel orderNotesPanel;
    private javax.swing.JTextArea orderNotesTextArea;
    private javax.swing.JScrollPane orderScrollPane;
    private javax.swing.JPanel orderTab;
    private javax.swing.JList<Phone> phoneJList;
    private javax.swing.JPanel phoneListPanel;
    private javax.swing.JScrollPane phoneScrollPane;
    private javax.swing.JMenuItem printList;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel strAddress;
    private javax.swing.JLabel strCity;
    private javax.swing.JLabel strClientName;
    private javax.swing.JLabel strCompany;
    private javax.swing.JLabel strEmail;
    private javax.swing.JTextField strSearchBar;
    private javax.swing.JLabel strState;
    private javax.swing.JLabel strZipCode;
    private javax.swing.JPanel titleBar;
    // End of variables declaration//GEN-END:variables
}
