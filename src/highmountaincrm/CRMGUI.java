package highmountaincrm;

import highmountaincrm.Classes.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class CRMGUI extends javax.swing.JFrame {
    private int max = 30; 
    public Color genericColor = new Color(209, 220, 204);    
    private AlternatingListCellRenderer cellRenderer = new AlternatingListCellRenderer();
    
    private Contact currentContact;
    private Order currentOrder;
    // Declare and initialize list models for JLists
    private DefaultListModel<Contact> contactModel = new DefaultListModel<>(); // Blessed be the diamond operator
    private DefaultListModel<Phone> phoneModel = new DefaultListModel<>();
    private DefaultListModel<Order> orderModel = new DefaultListModel<>();
    private DefaultListModel<String> noteModel = new DefaultListModel<>();
    // Declare and initialize lists 
    private List<Contact> contactList = new ArrayList<>(); 
    private List<Contact> searchList = new ArrayList<>();
    private List<Phone> phoneList = new ArrayList<>();
    private List<Order> orderList = new ArrayList<>();
    private List<String> noteList = new ArrayList<>();
    
    private Font buttonFont = new Font("Calibri", Font.ITALIC, 12);
    private Font labelFont = new Font("Calibri", 3, 14);
    private Font tabFont = new Font("Calibri", Font.ITALIC, 12);


    public CRMGUI() {
        try{
            FileInputStream fin = new FileInputStream("Contacts.ser");
            ObjectInputStream ois = new ObjectInputStream(fin);
            contactList = (ArrayList<Contact>)ois.readObject();
            if(!contactList.isEmpty())
                populateContactList(contactList);
            ois.close();
        }catch(Exception e){
            //e.printStackTrace();
        }
        initComponents();
        if(!contactList.isEmpty()){
            contactJList.setSelectedIndex(0);
            updateCurrent(contactJList.getSelectedValue());
        }
        displayCurrent();
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
        searchField = new javax.swing.JTextField();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15));
        contactScrollPane = new javax.swing.JScrollPane();
        contactJList = new javax.swing.JList<Contact>();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 30), new java.awt.Dimension(0, 30));
        buttonPanel = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        deleteButton = new javax.swing.JButton();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        editContactButton = new javax.swing.JButton();
        filler38 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        newContactButton = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 30), new java.awt.Dimension(0, 30));
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        rightPanel = new javax.swing.JPanel();
        clientDisplay = new javax.swing.JTabbedPane();
        clientInfoTab = new javax.swing.JPanel();
        clientInfoLabelPanel = new javax.swing.JPanel();
        lblClientName = new javax.swing.JLabel();
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        lblCompany = new javax.swing.JLabel();
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        lblAddress = new javax.swing.JLabel();
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        lblCity = new javax.swing.JLabel();
        filler20 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        lblState = new javax.swing.JLabel();
        filler21 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        lblZipCode = new javax.swing.JLabel();
        filler22 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        lblEmail = new javax.swing.JLabel();
        filler23 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        clientInfoPanel = new javax.swing.JPanel();
        strClientName = new javax.swing.JLabel();
        filler24 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        strCompany = new javax.swing.JLabel();
        filler25 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        strAddress = new javax.swing.JLabel();
        filler26 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        strCity = new javax.swing.JLabel();
        filler27 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        strState = new javax.swing.JLabel();
        filler28 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        strZipCode = new javax.swing.JLabel();
        filler29 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        strEmail = new javax.swing.JLabel();
        filler31 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        phoneListPanel = new javax.swing.JPanel();
        phoneScrollPane = new javax.swing.JScrollPane();
        phoneJList = new javax.swing.JList<Phone>();
        orderTab = new javax.swing.JPanel();
        orderInfoDetailPanel = new javax.swing.JPanel();
        orderScrollPane = new javax.swing.JScrollPane();
        orderJList = new javax.swing.JList<Order>();
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        titleBar.setMaximumSize(new java.awt.Dimension(800, 30));
        titleBar.setMinimumSize(new java.awt.Dimension(800, 30));
        titleBar.setName(""); // NOI18N
        titleBar.setLayout(new javax.swing.BoxLayout(titleBar, javax.swing.BoxLayout.LINE_AXIS));

        lblTitlebar.setBackground(new java.awt.Color(0, 0, 102));
        lblTitlebar.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
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
        mainFramePanel.setMaximumSize(new java.awt.Dimension(545, 200));
        mainFramePanel.setName(""); // NOI18N
        mainFramePanel.setLayout(new javax.swing.BoxLayout(mainFramePanel, javax.swing.BoxLayout.X_AXIS));
        mainFramePanel.add(filler9);

        leftPanel.setBackground(new java.awt.Color(51, 51, 51));
        leftPanel.setMinimumSize(new java.awt.Dimension(200, 200));
        leftPanel.setPreferredSize(new java.awt.Dimension(200, 200));
        leftPanel.setLayout(new javax.swing.BoxLayout(leftPanel, javax.swing.BoxLayout.Y_AXIS));
        leftPanel.add(filler7);

        searchField.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        searchField.setText("Search");
        searchField.setAlignmentX(1.0F);
        searchField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        searchField.setMaximumSize(new java.awt.Dimension(2147483647, 30));
        searchField.setMinimumSize(new java.awt.Dimension(2, 20));
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        leftPanel.add(searchField);
        leftPanel.add(filler6);

        contactJList.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
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
        deleteButton.setFont(buttonFont);
        deleteButton.setForeground(new java.awt.Color(102, 0, 0));
        deleteButton.setText("Remove");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(deleteButton);
        buttonPanel.add(filler10);

        editContactButton.setBackground(new java.awt.Color(0, 153, 0));
        editContactButton.setFont(buttonFont);
        editContactButton.setForeground(new java.awt.Color(0, 153, 0));
        editContactButton.setText("Edit");
        editContactButton.setToolTipText("");
        editContactButton.setPreferredSize(new java.awt.Dimension(83, 23));
        editContactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editContactButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(editContactButton);
        buttonPanel.add(filler38);

        newContactButton.setBackground(new java.awt.Color(0, 0, 102));
        newContactButton.setFont(buttonFont);
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
        clientDisplay.setFont(tabFont);
        clientDisplay.setMinimumSize(new java.awt.Dimension(300, 60));
        clientDisplay.setPreferredSize(new java.awt.Dimension(300, 60));

        clientInfoTab.setToolTipText("");
        clientInfoTab.setLayout(new java.awt.BorderLayout());

        clientInfoLabelPanel.setBackground(new java.awt.Color(204, 204, 255));
        clientInfoLabelPanel.setLayout(new javax.swing.BoxLayout(clientInfoLabelPanel, javax.swing.BoxLayout.Y_AXIS));

        lblClientName.setFont(labelFont);
        lblClientName.setText("Client Name:");
        lblClientName.setMaximumSize(new java.awt.Dimension(81, 25));
        lblClientName.setMinimumSize(new java.awt.Dimension(81, 25));
        lblClientName.setPreferredSize(new java.awt.Dimension(81, 25));
        clientInfoLabelPanel.add(lblClientName);
        clientInfoLabelPanel.add(filler17);

        lblCompany.setFont(labelFont);
        lblCompany.setText("Company:");
        lblCompany.setMaximumSize(new java.awt.Dimension(81, 25));
        lblCompany.setMinimumSize(new java.awt.Dimension(81, 25));
        lblCompany.setPreferredSize(new java.awt.Dimension(81, 25));
        clientInfoLabelPanel.add(lblCompany);
        clientInfoLabelPanel.add(filler18);

        lblAddress.setFont(labelFont);
        lblAddress.setText("Address:");
        lblAddress.setMaximumSize(new java.awt.Dimension(81, 25));
        lblAddress.setMinimumSize(new java.awt.Dimension(81, 25));
        lblAddress.setPreferredSize(new java.awt.Dimension(81, 25));
        clientInfoLabelPanel.add(lblAddress);
        clientInfoLabelPanel.add(filler19);

        lblCity.setFont(labelFont);
        lblCity.setText("City:");
        lblCity.setMaximumSize(new java.awt.Dimension(81, 25));
        lblCity.setMinimumSize(new java.awt.Dimension(81, 25));
        lblCity.setPreferredSize(new java.awt.Dimension(81, 25));
        clientInfoLabelPanel.add(lblCity);
        clientInfoLabelPanel.add(filler20);

        lblState.setFont(labelFont);
        lblState.setText("State:");
        lblState.setMaximumSize(new java.awt.Dimension(81, 25));
        lblState.setMinimumSize(new java.awt.Dimension(81, 25));
        lblState.setPreferredSize(new java.awt.Dimension(81, 25));
        clientInfoLabelPanel.add(lblState);
        clientInfoLabelPanel.add(filler21);

        lblZipCode.setFont(labelFont);
        lblZipCode.setText("Zip Code:");
        lblZipCode.setMaximumSize(new java.awt.Dimension(81, 25));
        lblZipCode.setMinimumSize(new java.awt.Dimension(81, 25));
        lblZipCode.setPreferredSize(new java.awt.Dimension(81, 25));
        clientInfoLabelPanel.add(lblZipCode);
        clientInfoLabelPanel.add(filler22);

        lblEmail.setFont(labelFont);
        lblEmail.setText("Email:");
        lblEmail.setMaximumSize(new java.awt.Dimension(81, 25));
        lblEmail.setMinimumSize(new java.awt.Dimension(81, 25));
        lblEmail.setPreferredSize(new java.awt.Dimension(81, 25));
        clientInfoLabelPanel.add(lblEmail);
        clientInfoLabelPanel.add(filler23);

        clientInfoTab.add(clientInfoLabelPanel, java.awt.BorderLayout.WEST);

        clientInfoPanel.setMaximumSize(new java.awt.Dimension(100, 56));
        clientInfoPanel.setMinimumSize(new java.awt.Dimension(100, 56));
        clientInfoPanel.setLayout(new javax.swing.BoxLayout(clientInfoPanel, javax.swing.BoxLayout.Y_AXIS));

        strClientName.setMaximumSize(new java.awt.Dimension(205, 25));
        strClientName.setMinimumSize(new java.awt.Dimension(205, 25));
        strClientName.setName(""); // NOI18N
        strClientName.setPreferredSize(new java.awt.Dimension(205, 25));
        strClientName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strClientNameMouseClicked(evt);
            }
        });
        clientInfoPanel.add(strClientName);
        clientInfoPanel.add(filler24);

        strCompany.setMaximumSize(new java.awt.Dimension(205, 25));
        strCompany.setMinimumSize(new java.awt.Dimension(205, 25));
        strCompany.setName(""); // NOI18N
        strCompany.setPreferredSize(new java.awt.Dimension(205, 25));
        strCompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strCompanyMouseClicked(evt);
            }
        });
        clientInfoPanel.add(strCompany);
        clientInfoPanel.add(filler25);

        strAddress.setMaximumSize(new java.awt.Dimension(205, 25));
        strAddress.setMinimumSize(new java.awt.Dimension(205, 25));
        strAddress.setName(""); // NOI18N
        strAddress.setPreferredSize(new java.awt.Dimension(205, 25));
        strAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strAddressMouseClicked(evt);
            }
        });
        clientInfoPanel.add(strAddress);
        clientInfoPanel.add(filler26);

        strCity.setMaximumSize(new java.awt.Dimension(205, 25));
        strCity.setMinimumSize(new java.awt.Dimension(205, 25));
        strCity.setName(""); // NOI18N
        strCity.setPreferredSize(new java.awt.Dimension(205, 25));
        strCity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strCityMouseClicked(evt);
            }
        });
        clientInfoPanel.add(strCity);
        clientInfoPanel.add(filler27);

        strState.setMaximumSize(new java.awt.Dimension(205, 25));
        strState.setMinimumSize(new java.awt.Dimension(205, 25));
        strState.setName(""); // NOI18N
        strState.setPreferredSize(new java.awt.Dimension(205, 25));
        strState.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strStateMouseClicked(evt);
            }
        });
        clientInfoPanel.add(strState);
        clientInfoPanel.add(filler28);

        strZipCode.setMaximumSize(new java.awt.Dimension(205, 25));
        strZipCode.setMinimumSize(new java.awt.Dimension(205, 25));
        strZipCode.setName(""); // NOI18N
        strZipCode.setPreferredSize(new java.awt.Dimension(205, 25));
        strZipCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strZipCodeMouseClicked(evt);
            }
        });
        clientInfoPanel.add(strZipCode);
        clientInfoPanel.add(filler29);

        strEmail.setMaximumSize(new java.awt.Dimension(205, 25));
        strEmail.setMinimumSize(new java.awt.Dimension(205, 25));
        strEmail.setName(""); // NOI18N
        strEmail.setPreferredSize(new java.awt.Dimension(205, 25));
        strEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strEmailMouseClicked(evt);
            }
        });
        clientInfoPanel.add(strEmail);
        clientInfoPanel.add(filler31);

        clientInfoTab.add(clientInfoPanel, java.awt.BorderLayout.CENTER);

        phoneListPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Phone List:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 2, 12))); // NOI18N
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

        orderInfoDetailPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "List of Orders", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 12))); // NOI18N
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
        orderJList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                orderJListValueChanged(evt);
            }
        });
        orderScrollPane.setViewportView(orderJList);

        orderInfoDetailPanel.add(orderScrollPane);

        orderButtonPanel.setLayout(new javax.swing.BoxLayout(orderButtonPanel, javax.swing.BoxLayout.LINE_AXIS));
        orderButtonPanel.add(filler1);

        newOrderButton.setFont(buttonFont);
        newOrderButton.setText("New");
        newOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderButtonActionPerformed(evt);
            }
        });
        orderButtonPanel.add(newOrderButton);
        orderButtonPanel.add(filler8);

        editOrderButton.setFont(buttonFont);
        editOrderButton.setText("Edit");
        editOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editOrderButtonActionPerformed(evt);
            }
        });
        orderButtonPanel.add(editOrderButton);
        orderButtonPanel.add(filler11);

        clearOrderButton.setFont(buttonFont);
        clearOrderButton.setText("Remove");
        orderButtonPanel.add(clearOrderButton);
        orderButtonPanel.add(filler15);

        orderInfoDetailPanel.add(orderButtonPanel);

        orderTab.add(orderInfoDetailPanel);

        orderNotesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "List of Orders", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 12))); // NOI18N
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

        clearOrderNotesButton.setFont(buttonFont);
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

        notesDetailPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Notes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 12))); // NOI18N
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

        clearNoteButton.setFont(buttonFont);
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
        menuNewClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewClientActionPerformed(evt);
            }
        });
        menuEdit.add(menuNewClient);

        menuBar.add(menuEdit);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        ContactBuilder contact = new ContactBuilder(this);
        Contact temp = contact.getContact();
        if(temp == null) return;
        contactList.remove(temp);
        updateMargin();
        contactModel.removeElement(temp);
        JOptionPane.showMessageDialog(null, 1 + "Record has been deleted.");
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void lblTitlebarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblTitlebarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTitlebarActionPerformed

    private void newContactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newContactButtonActionPerformed
        // TODO add your handling code here:
        ContactBuilder contact = new ContactBuilder(this);
        contact.createContactBuilder(null);
        Contact temp = contact.getContact();
        if(temp == null) return;
        contactList.add(temp);
        updateMargin();
        contactModel.addElement(temp);
        JOptionPane.showMessageDialog(null, "Record has been added.");
    }//GEN-LAST:event_newContactButtonActionPerformed

    public void updateMargin(){
        for(Contact c: contactList){
            if(c.getName().length() > max){
                max = c.getName().length();
            }
        }
        Contact.updateLength(max);
    }
    private void contactJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_contactJListValueChanged
        currentContact = contactJList.getSelectedValue();
        displayCurrent();
    }//GEN-LAST:event_contactJListValueChanged

    private void clearOrderNotesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearOrderNotesButtonActionPerformed
        if(currentOrder == null) return;
        orderNotesTextArea.setText("");
        currentOrder.setOrderNote("");
    }//GEN-LAST:event_clearOrderNotesButtonActionPerformed

    private void newOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderButtonActionPerformed
        if(currentContact == null) return;
        OrderPanel order = new OrderPanel(this);
        order.createOrderBuilder(null);
        Order temp = order.getOrder();
        if(temp == null) return;
        currentContact.addOrder(temp);
        displayCurrent();
    }//GEN-LAST:event_newOrderButtonActionPerformed

    private void strClientNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strClientNameMouseClicked
        if(currentContact == null) return;
        if(evt.getClickCount() == 2){
            String name = JOptionPane.showInputDialog(this, "Enter name: ","Change Name", JOptionPane.PLAIN_MESSAGE);
            if (name != null && !name.trim().isEmpty()) {
                currentContact.setName(name);
                displayCurrent();
            }
        }
    }//GEN-LAST:event_strClientNameMouseClicked

    private void strCompanyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strCompanyMouseClicked
        if(currentContact == null) return;
        if(evt.getClickCount() == 2){
            String company = JOptionPane.showInputDialog(this, "Enter company: ","Change Company", JOptionPane.PLAIN_MESSAGE);
            if (company != null && !company.trim().isEmpty()) {
                currentContact.setCompany(company);
                displayCurrent();
            }
        }
    }//GEN-LAST:event_strCompanyMouseClicked

    private void strAddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strAddressMouseClicked
        if(currentContact == null) return;
        if(evt.getClickCount() == 2){
            String address = JOptionPane.showInputDialog(this, "Enter address: ","Change Address", JOptionPane.PLAIN_MESSAGE);
            if (address != null && !address.trim().isEmpty()) {
                currentContact.setAddress(address);
                displayCurrent();
            }
        }
    }//GEN-LAST:event_strAddressMouseClicked

    private void strCityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strCityMouseClicked
        if(currentContact == null) return;
        if(evt.getClickCount() == 2){
            String city = JOptionPane.showInputDialog(this, "Enter city: ","Change City", JOptionPane.PLAIN_MESSAGE);
            if (city != null && !city.trim().isEmpty()) {
                currentContact.setCity(city);
                displayCurrent();
            }
        }
    }//GEN-LAST:event_strCityMouseClicked

    private void strStateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strStateMouseClicked
        if(currentContact == null) return;
        if(evt.getClickCount() == 2){
            String state = JOptionPane.showInputDialog(this, "Enter state: ","Change State", JOptionPane.PLAIN_MESSAGE);
            if (state != null && !state.trim().isEmpty()) {
                currentContact.setState(state);
                displayCurrent();
            }
        }
    }//GEN-LAST:event_strStateMouseClicked

    private void strZipCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strZipCodeMouseClicked
        if(currentContact == null) return;
        if(evt.getClickCount() == 2){
            String zipCode = JOptionPane.showInputDialog(this, "Enter zipCode: ","Change Zipcode", JOptionPane.PLAIN_MESSAGE);
            if (zipCode != null && !zipCode.trim().isEmpty()) {
                currentContact.setZipCode(zipCode);
                displayCurrent();
            }
        }
    }//GEN-LAST:event_strZipCodeMouseClicked

    private void strEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strEmailMouseClicked
        if(currentContact == null) return;
        if(evt.getClickCount() == 2){
            String email = JOptionPane.showInputDialog(this, "Enter email: ","Change Email", JOptionPane.PLAIN_MESSAGE);
            if (email != null && !email.trim().isEmpty()) {
                currentContact.setEmail(email);
                displayCurrent();
            }
        }
    }//GEN-LAST:event_strEmailMouseClicked

    private void menuNewClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNewClientActionPerformed
        newContactButtonActionPerformed(evt);
    }//GEN-LAST:event_menuNewClientActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        String searchText = searchField.getText();
        search(searchText);
    }//GEN-LAST:event_searchFieldKeyReleased

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        if (searchField.getText().equals("Search")) {
            searchField.setText("");
        }
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        if (searchField.getText().isEmpty()) {
            searchField.setText("Search");
        }
    }//GEN-LAST:event_searchFieldFocusLost

    private void editContactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editContactButtonActionPerformed
        if(currentContact == null){
            JOptionPane.showMessageDialog(null, "No contact selected", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ContactBuilder contactBuilder = new ContactBuilder(this);
        contactBuilder.createContactBuilder(currentContact);
        Contact temp = contactBuilder.getContact();
        if(temp == null) return;
        currentContact = temp;
        updateMargin();
        displayCurrent();
        JOptionPane.showMessageDialog(null, "Record has been changed.");
    }//GEN-LAST:event_editContactButtonActionPerformed

    private void editOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editOrderButtonActionPerformed
        if(currentOrder == null) 
            JOptionPane.showMessageDialog(null, "No order selected", "Error!", JOptionPane.ERROR_MESSAGE);
        OrderPanel order = new OrderPanel(this);
        order.createOrderBuilder(currentOrder);
        Order temp = order.getOrder();
        if(temp == null) return;
        currentOrder = temp;
        displayCurrent();
        JOptionPane.showMessageDialog(null, "Record has been changed.");
    }//GEN-LAST:event_editOrderButtonActionPerformed

    private void orderJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_orderJListValueChanged
        currentOrder = orderJList.getSelectedValue();
        if(currentOrder != null){
            orderIdLabel.setText(currentOrder.getOrderId());
            orderAmountLabel.setText(currentOrder.getOrderAmount());
            orderNotesTextArea.setText(currentOrder.getOrderNote());
        }
    }//GEN-LAST:event_orderJListValueChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try{
            FileOutputStream fos = new FileOutputStream("Contacts.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(contactList);
            oos.close();
        }catch(Exception e){
            //e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing
    private void search(String searchText){
        if(searchText == null || searchText.isEmpty()){
            searchField.setText("Search");
            searchList.clear();
            populateContactList(contactList);
        } else {
            searchList.clear();
            for(Contact c: contactList){
                if(c.searchable.contains(searchText))
                    searchList.add(c);
            }
            populateContactList(searchList);
        }
            
    }
    private void populateContactList(List<Contact> list){
        contactModel.clear();
        for(Contact c: list){
            contactModel.addElement(c);
        }
    }
    
    public void updateCurrent(Contact c){
        currentContact = c;
        displayCurrent();
    }
    
    public void displayTabs(){
        if (currentContact != null){ // There is a contact
            if (clientDisplay.getTabCount() == 1) // Tabs were hidden
                showTabs();
        } else //There is no contact
            if (clientDisplay.getTabCount() != 1) // Tabs were shown
                hideTabs();
    }
    
    private void showTabs(){
        clientDisplay.addTab("Order Info", new javax.swing.ImageIcon(getClass().getResource("/Resource/order.png")), orderTab);
        clientDisplay.addTab("Notes", new javax.swing.ImageIcon(getClass().getResource("/Resource/note.png")), notesTab);
    }
    private void hideTabs(){
        clientDisplay.removeTabAt(2);
        clientDisplay.removeTabAt(1);
    }
    public void displayCurrent(){
        displayTabs();
        if(currentContact == null) {
            clearDisplay();
            return;
        }
        
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
        if(!orderModel.isEmpty()){
            orderJList.setSelectedIndex(0);
            currentOrder = (Order)orderModel.get(0);
            orderIdDisplay.setText(" " + currentOrder.getOrderId());
            orderAmountDisplay.setText(" " + currentOrder.getOrderAmount());
        }
            
    }
    private void clearDisplay() {
        strClientName.setText("");
        strCompany.setText("");
        strAddress.setText("");
        strCity.setText("");
        strState.setText("");
        strZipCode.setText("");
        strEmail.setText("");
        noteTextArea.setText("");
        
        phoneModel.clear();
        phoneList.clear();
        orderModel.clear();
        orderList.clear();
        currentOrder = null;
        orderIdDisplay.setText("");
        orderAmountDisplay.setText("");
        
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
    private javax.swing.JButton editContactButton;
    private javax.swing.JButton editOrderButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler19;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler20;
    private javax.swing.Box.Filler filler21;
    private javax.swing.Box.Filler filler22;
    private javax.swing.Box.Filler filler23;
    private javax.swing.Box.Filler filler24;
    private javax.swing.Box.Filler filler25;
    private javax.swing.Box.Filler filler26;
    private javax.swing.Box.Filler filler27;
    private javax.swing.Box.Filler filler28;
    private javax.swing.Box.Filler filler29;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler31;
    private javax.swing.Box.Filler filler38;
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
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel strAddress;
    private javax.swing.JLabel strCity;
    private javax.swing.JLabel strClientName;
    private javax.swing.JLabel strCompany;
    private javax.swing.JLabel strEmail;
    private javax.swing.JLabel strState;
    private javax.swing.JLabel strZipCode;
    private javax.swing.JPanel titleBar;
    // End of variables declaration//GEN-END:variables

    
}
