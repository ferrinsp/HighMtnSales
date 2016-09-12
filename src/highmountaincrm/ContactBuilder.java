package highmountaincrm;

import javax.swing.JFrame;
import highmountaincrm.Classes.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.awt.Font;

public class ContactBuilder {
    public Contact contact;
    public JFrame parent;
    public JDialog dialog;
    public Contact information;
    
    private Font buttonFont = new Font("Calibri", Font.ITALIC, 12);
    private Font labelFont = new Font("Calibri", 3, 14);
    private Font tabFont = new Font("Calibri", Font.ITALIC, 12);
    
    public ContactBuilder(JFrame c){
        parent = c;
    }
    public Contact getContact(){
        return contact;
    }
    public void createContactBuilder(Contact contact){
        this.parent = parent;
        ContactPanel panel = new ContactPanel();
        if(contact != null){
            panel.nameField.setText(contact.getName());
            panel.companyField.setText(contact.getCompany());
            panel.emailField.setText(contact.getEmail());
            panel.addressField.setText(contact.getAddress());
            panel.cityField.setText(contact.getCity());
            panel.stateField.setText(contact.getState());
            panel.zipField.setText(contact.getZipCode());
            for(Phone phone : contact.getPhoneList()){
                panel.phoneModel.addElement(phone);
                panel.phoneList.add(phone);
            }
            dialog = new JDialog(parent, "Edit Contact", true);
        } else{
            dialog = new JDialog(parent, "New Contact", true);
        }
        dialog.setContentPane(panel);
        dialog.setResizable(false);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.pack();
        dialog.setLocationRelativeTo(parent);
        dialog.setVisible(true);
    }
    public class ContactPanel extends javax.swing.JPanel {
        private AlternatingListCellRenderer cellRenderer = new AlternatingListCellRenderer();
        private DefaultListModel<Phone> phoneModel = new DefaultListModel<>();
        
        private List<Phone> phoneList = new ArrayList<>();
        public ContactPanel() {
            initComponents();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        northTitlePanel = new javax.swing.JPanel();
        highMtnLabel = new javax.swing.JLabel();
        filler24 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        northPanel = new javax.swing.JPanel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        westPanel = new javax.swing.JPanel();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        namePanel = new javax.swing.JPanel();
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        companyPanel = new javax.swing.JPanel();
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        companyLabel = new javax.swing.JLabel();
        companyField = new javax.swing.JTextField();
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        emailPanel = new javax.swing.JPanel();
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        addressPanel = new javax.swing.JPanel();
        filler26 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        filler27 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        filler28 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        cityPanel = new javax.swing.JPanel();
        filler32 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        cityLabel = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        filler33 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        filler34 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        statePanel = new javax.swing.JPanel();
        filler29 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        stateLabel = new javax.swing.JLabel();
        stateField = new javax.swing.JTextField();
        filler30 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        filler31 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        zipPanel = new javax.swing.JPanel();
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        zipLabel = new javax.swing.JLabel();
        zipField = new javax.swing.JTextField();
        filler20 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        phonePanel = new javax.swing.JPanel();
        filler23 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        phoneNorthPanel = new javax.swing.JPanel();
        filler21 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        phoneLabel = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        phoneComboBox = new javax.swing.JComboBox<>();
        addPhone = new javax.swing.JButton();
        filler22 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(32767, 0));
        filler25 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        eastPanel = new javax.swing.JPanel();
        southInnerPanel = new javax.swing.JPanel();
        highMtnImage = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler35 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        southPanel = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        saveButton = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(15, 32767));
        cancelButton = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(15, 32767));

        setMaximumSize(new java.awt.Dimension(920, 540));
        setMinimumSize(new java.awt.Dimension(920, 540));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(920, 540));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        northTitlePanel.setBackground(new java.awt.Color(0, 0, 102));
        northTitlePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        northTitlePanel.setMaximumSize(new java.awt.Dimension(1000, 35));
        northTitlePanel.setMinimumSize(new java.awt.Dimension(1000, 35));
        northTitlePanel.setPreferredSize(new java.awt.Dimension(1000, 35));

        highMtnLabel.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        highMtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        highMtnLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        highMtnLabel.setText("HIGH MOUNTAIN SALES");
        highMtnLabel.setToolTipText("");
        highMtnLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        highMtnLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        highMtnLabel.setMaximumSize(new java.awt.Dimension(1000, 30));
        highMtnLabel.setMinimumSize(new java.awt.Dimension(1000, 30));
        highMtnLabel.setName(""); // NOI18N
        highMtnLabel.setPreferredSize(new java.awt.Dimension(1000, 30));
        highMtnLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout northTitlePanelLayout = new javax.swing.GroupLayout(northTitlePanel);
        northTitlePanel.setLayout(northTitlePanelLayout);
        northTitlePanelLayout.setHorizontalGroup(
            northTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(northTitlePanelLayout.createSequentialGroup()
                .addComponent(highMtnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 77, Short.MAX_VALUE))
        );
        northTitlePanelLayout.setVerticalGroup(
            northTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(highMtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        add(northTitlePanel);

        filler24.setBackground(new java.awt.Color(51, 51, 51));
        filler24.setForeground(new java.awt.Color(51, 51, 51));
        add(filler24);

        northPanel.setBackground(new java.awt.Color(51, 51, 51));
        northPanel.setMinimumSize(new java.awt.Dimension(196, 400));
        northPanel.setName(""); // NOI18N
        northPanel.setPreferredSize(new java.awt.Dimension(196, 400));
        northPanel.setRequestFocusEnabled(false);
        northPanel.setLayout(new javax.swing.BoxLayout(northPanel, javax.swing.BoxLayout.X_AXIS));
        northPanel.add(filler5);

        westPanel.setBackground(new java.awt.Color(51, 51, 51));
        westPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 2, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        westPanel.setToolTipText("Information needed to create a new contact");
        westPanel.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        westPanel.setMinimumSize(new java.awt.Dimension(369, 420));
        westPanel.setPreferredSize(new java.awt.Dimension(369, 420));
        westPanel.setLayout(new javax.swing.BoxLayout(westPanel, javax.swing.BoxLayout.Y_AXIS));
        westPanel.add(filler10);

        namePanel.setBackground(new java.awt.Color(51, 51, 51));
        namePanel.setLayout(new javax.swing.BoxLayout(namePanel, javax.swing.BoxLayout.LINE_AXIS));
        namePanel.add(filler14);

        nameLabel.setFont(labelFont);
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name:");
        nameLabel.setMaximumSize(new java.awt.Dimension(80, 28));
        nameLabel.setPreferredSize(new java.awt.Dimension(80, 28));
        namePanel.add(nameLabel);

        nameField.setBackground(new java.awt.Color(51, 51, 51));
        nameField.setForeground(new java.awt.Color(255, 255, 255));
        nameField.setCaretColor(new java.awt.Color(255, 255, 255));
        nameField.setMaximumSize(new java.awt.Dimension(200, 30));
        nameField.setMinimumSize(new java.awt.Dimension(200, 30));
        nameField.setName(""); // NOI18N
        nameField.setNextFocusableComponent(companyField);
        nameField.setPreferredSize(new java.awt.Dimension(200, 30));
        namePanel.add(nameField);
        namePanel.add(filler13);

        westPanel.add(namePanel);
        westPanel.add(filler12);

        companyPanel.setBackground(new java.awt.Color(51, 51, 51));
        companyPanel.setLayout(new javax.swing.BoxLayout(companyPanel, javax.swing.BoxLayout.LINE_AXIS));
        companyPanel.add(filler16);

        companyLabel.setFont(labelFont);
        companyLabel.setForeground(new java.awt.Color(255, 255, 255));
        companyLabel.setText("Company:");
        companyLabel.setMaximumSize(new java.awt.Dimension(80, 28));
        companyLabel.setMinimumSize(new java.awt.Dimension(75, 17));
        companyLabel.setName(""); // NOI18N
        companyLabel.setPreferredSize(new java.awt.Dimension(80, 28));
        companyPanel.add(companyLabel);

        companyField.setBackground(new java.awt.Color(51, 51, 51));
        companyField.setForeground(new java.awt.Color(255, 255, 255));
        companyField.setCaretColor(new java.awt.Color(255, 255, 255));
        companyField.setMaximumSize(new java.awt.Dimension(200, 30));
        companyField.setMinimumSize(new java.awt.Dimension(200, 30));
        companyField.setName(""); // NOI18N
        companyField.setNextFocusableComponent(emailField);
        companyField.setPreferredSize(new java.awt.Dimension(200, 30));
        companyPanel.add(companyField);
        companyPanel.add(filler15);

        westPanel.add(companyPanel);
        westPanel.add(filler11);

        emailPanel.setBackground(new java.awt.Color(51, 51, 51));
        emailPanel.setLayout(new javax.swing.BoxLayout(emailPanel, javax.swing.BoxLayout.LINE_AXIS));
        emailPanel.add(filler17);

        emailLabel.setFont(labelFont);
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email:");
        emailLabel.setMaximumSize(new java.awt.Dimension(80, 28));
        emailLabel.setPreferredSize(new java.awt.Dimension(80, 28));
        emailPanel.add(emailLabel);

        emailField.setBackground(new java.awt.Color(51, 51, 51));
        emailField.setForeground(new java.awt.Color(255, 255, 255));
        emailField.setCaretColor(new java.awt.Color(255, 255, 255));
        emailField.setMaximumSize(new java.awt.Dimension(200, 30));
        emailField.setMinimumSize(new java.awt.Dimension(200, 30));
        emailField.setName(""); // NOI18N
        emailField.setNextFocusableComponent(addressField);
        emailField.setPreferredSize(new java.awt.Dimension(200, 30));
        emailPanel.add(emailField);
        emailPanel.add(filler18);

        westPanel.add(emailPanel);
        westPanel.add(filler8);

        addressPanel.setBackground(new java.awt.Color(51, 51, 51));
        addressPanel.setLayout(new javax.swing.BoxLayout(addressPanel, javax.swing.BoxLayout.LINE_AXIS));
        addressPanel.add(filler26);

        addressLabel.setFont(labelFont);
        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setText("Address:");
        addressLabel.setMaximumSize(new java.awt.Dimension(80, 28));
        addressLabel.setPreferredSize(new java.awt.Dimension(80, 28));
        addressPanel.add(addressLabel);

        addressField.setBackground(new java.awt.Color(51, 51, 51));
        addressField.setForeground(new java.awt.Color(255, 255, 255));
        addressField.setCaretColor(new java.awt.Color(255, 255, 255));
        addressField.setMaximumSize(new java.awt.Dimension(200, 30));
        addressField.setMinimumSize(new java.awt.Dimension(200, 30));
        addressField.setName(""); // NOI18N
        addressField.setNextFocusableComponent(cityField);
        addressField.setPreferredSize(new java.awt.Dimension(200, 30));
        addressPanel.add(addressField);
        addressPanel.add(filler27);

        westPanel.add(addressPanel);
        westPanel.add(filler28);

        cityPanel.setBackground(new java.awt.Color(51, 51, 51));
        cityPanel.setLayout(new javax.swing.BoxLayout(cityPanel, javax.swing.BoxLayout.LINE_AXIS));
        cityPanel.add(filler32);

        cityLabel.setFont(labelFont);
        cityLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityLabel.setText("City:");
        cityLabel.setMaximumSize(new java.awt.Dimension(80, 28));
        cityLabel.setPreferredSize(new java.awt.Dimension(80, 28));
        cityPanel.add(cityLabel);

        cityField.setBackground(new java.awt.Color(51, 51, 51));
        cityField.setForeground(new java.awt.Color(255, 255, 255));
        cityField.setCaretColor(new java.awt.Color(255, 255, 255));
        cityField.setMaximumSize(new java.awt.Dimension(200, 30));
        cityField.setMinimumSize(new java.awt.Dimension(200, 30));
        cityField.setName(""); // NOI18N
        cityField.setNextFocusableComponent(stateField);
        cityField.setPreferredSize(new java.awt.Dimension(200, 30));
        cityPanel.add(cityField);
        cityPanel.add(filler33);

        westPanel.add(cityPanel);
        westPanel.add(filler34);

        statePanel.setBackground(new java.awt.Color(51, 51, 51));
        statePanel.setLayout(new javax.swing.BoxLayout(statePanel, javax.swing.BoxLayout.LINE_AXIS));
        statePanel.add(filler29);

        stateLabel.setFont(labelFont);
        stateLabel.setForeground(new java.awt.Color(255, 255, 255));
        stateLabel.setText("State:");
        stateLabel.setMaximumSize(new java.awt.Dimension(80, 28));
        stateLabel.setPreferredSize(new java.awt.Dimension(80, 28));
        statePanel.add(stateLabel);

        stateField.setBackground(new java.awt.Color(51, 51, 51));
        stateField.setForeground(new java.awt.Color(255, 255, 255));
        stateField.setCaretColor(new java.awt.Color(255, 255, 255));
        stateField.setMaximumSize(new java.awt.Dimension(200, 30));
        stateField.setMinimumSize(new java.awt.Dimension(200, 30));
        stateField.setName(""); // NOI18N
        stateField.setNextFocusableComponent(zipField);
        stateField.setPreferredSize(new java.awt.Dimension(200, 30));
        statePanel.add(stateField);
        statePanel.add(filler30);

        westPanel.add(statePanel);
        westPanel.add(filler31);

        zipPanel.setBackground(new java.awt.Color(51, 51, 51));
        zipPanel.setLayout(new javax.swing.BoxLayout(zipPanel, javax.swing.BoxLayout.LINE_AXIS));
        zipPanel.add(filler19);

        zipLabel.setFont(labelFont);
        zipLabel.setForeground(new java.awt.Color(255, 255, 255));
        zipLabel.setText("Zip Code:");
        zipLabel.setMaximumSize(new java.awt.Dimension(80, 28));
        zipLabel.setPreferredSize(new java.awt.Dimension(80, 28));
        zipPanel.add(zipLabel);

        zipField.setBackground(new java.awt.Color(51, 51, 51));
        zipField.setForeground(new java.awt.Color(255, 255, 255));
        zipField.setCaretColor(new java.awt.Color(255, 255, 255));
        zipField.setMaximumSize(new java.awt.Dimension(200, 30));
        zipField.setMinimumSize(new java.awt.Dimension(200, 30));
        zipField.setName(""); // NOI18N
        zipField.setNextFocusableComponent(phoneField);
        zipField.setPreferredSize(new java.awt.Dimension(200, 30));
        zipPanel.add(zipField);
        zipPanel.add(filler20);

        westPanel.add(zipPanel);
        westPanel.add(filler9);

        phonePanel.setBackground(new java.awt.Color(51, 51, 51));
        phonePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        phonePanel.setPreferredSize(new java.awt.Dimension(357, 80));
        phonePanel.setLayout(new javax.swing.BoxLayout(phonePanel, javax.swing.BoxLayout.Y_AXIS));
        phonePanel.add(filler23);

        phoneNorthPanel.setBackground(new java.awt.Color(51, 51, 51));
        phoneNorthPanel.setMaximumSize(new java.awt.Dimension(2000, 28));
        phoneNorthPanel.setLayout(new javax.swing.BoxLayout(phoneNorthPanel, javax.swing.BoxLayout.LINE_AXIS));
        phoneNorthPanel.add(filler21);

        phoneLabel.setFont(labelFont);
        phoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneLabel.setText("Phone:");
        phoneLabel.setMaximumSize(new java.awt.Dimension(80, 28));
        phoneLabel.setPreferredSize(new java.awt.Dimension(80, 28));
        phoneNorthPanel.add(phoneLabel);

        phoneField.setBackground(new java.awt.Color(51, 51, 51));
        phoneField.setForeground(new java.awt.Color(255, 255, 255));
        phoneField.setCaretColor(new java.awt.Color(255, 255, 255));
        phoneField.setMaximumSize(new java.awt.Dimension(165, 30));
        phoneField.setMinimumSize(new java.awt.Dimension(165, 30));
        phoneField.setName(""); // NOI18N
        phoneField.setNextFocusableComponent(phoneComboBox);
        phoneField.setPreferredSize(new java.awt.Dimension(165, 30));
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });
        phoneNorthPanel.add(phoneField);

        phoneComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Business", "Personal", "Home", "Cell", "Fax", "Other" }));
        phoneComboBox.setNextFocusableComponent(addPhone);
        phoneNorthPanel.add(phoneComboBox);

        addPhone.setText("+");
        addPhone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addPhone.setMaximumSize(new java.awt.Dimension(28, 28));
        addPhone.setMinimumSize(new java.awt.Dimension(28, 28));
        addPhone.setName(""); // NOI18N
        addPhone.setPreferredSize(new java.awt.Dimension(28, 28));
        addPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPhoneActionPerformed(evt);
            }
        });
        addPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addPhoneKeyTyped(evt);
            }
        });
        phoneNorthPanel.add(addPhone);
        phoneNorthPanel.add(filler22);

        phonePanel.add(phoneNorthPanel);
        phonePanel.add(filler25);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(32767, 60));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(35, 60));

        jList1.setModel(phoneModel);
        jList1.setCellRenderer(cellRenderer);
        jList1.setMaximumSize(new java.awt.Dimension(200, 20));
        jList1.setMinimumSize(new java.awt.Dimension(200, 20));
        jList1.setPreferredSize(new java.awt.Dimension(200, 20));
        jScrollPane1.setViewportView(jList1);

        phonePanel.add(jScrollPane1);

        westPanel.add(phonePanel);
        westPanel.add(filler7);

        northPanel.add(westPanel);
        northPanel.add(filler6);

        eastPanel.setMinimumSize(new java.awt.Dimension(359, 394));
        eastPanel.setName(""); // NOI18N
        eastPanel.setPreferredSize(new java.awt.Dimension(359, 394));
        eastPanel.setRequestFocusEnabled(false);
        eastPanel.setLayout(new javax.swing.BoxLayout(eastPanel, javax.swing.BoxLayout.Y_AXIS));

        southInnerPanel.setBackground(new java.awt.Color(51, 51, 51));

        highMtnImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        highMtnImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/HighMountainProject.png"))); // NOI18N
        highMtnImage.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout southInnerPanelLayout = new javax.swing.GroupLayout(southInnerPanel);
        southInnerPanel.setLayout(southInnerPanelLayout);
        southInnerPanelLayout.setHorizontalGroup(
            southInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, southInnerPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(highMtnImage, javax.swing.GroupLayout.PREFERRED_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        southInnerPanelLayout.setVerticalGroup(
            southInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(southInnerPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(highMtnImage)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        eastPanel.add(southInnerPanel);

        northPanel.add(eastPanel);
        northPanel.add(filler4);

        add(northPanel);

        filler35.setBackground(new java.awt.Color(51, 51, 51));
        add(filler35);

        southPanel.setBackground(new java.awt.Color(51, 51, 51));
        southPanel.setMinimumSize(new java.awt.Dimension(196, 20));
        southPanel.setName(""); // NOI18N
        southPanel.setPreferredSize(new java.awt.Dimension(196, 20));
        southPanel.setLayout(new javax.swing.BoxLayout(southPanel, javax.swing.BoxLayout.LINE_AXIS));
        southPanel.add(filler1);

        saveButton.setBackground(new java.awt.Color(0, 0, 102));
        saveButton.setFont(buttonFont);
        saveButton.setForeground(new java.awt.Color(0, 0, 102));
        saveButton.setText("Save");
        saveButton.setToolTipText("Click to save contact information");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        southPanel.add(saveButton);
        southPanel.add(filler2);

        cancelButton.setBackground(new java.awt.Color(102, 0, 0));
        cancelButton.setFont(buttonFont);
        cancelButton.setForeground(new java.awt.Color(102, 0, 0));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        southPanel.add(cancelButton);
        southPanel.add(filler3);

        add(southPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void addPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPhoneActionPerformed
        Phone phone = new Phone(phoneField.getText(), (String)phoneComboBox.getSelectedItem());
        phoneModel.addElement(phone);
        phoneList.add(phone);
        phoneField.setText("");
    }//GEN-LAST:event_addPhoneActionPerformed
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        //if fields are empty or wrong do other stuff
        String name = nameField.getText();
        if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name field must not be empty","Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        contact = new Contact();
        contact.setName(nameField.getText());
        contact.setCompany(companyField.getText());
        contact.setEmail(emailField.getText());
        contact.setAddress(addressField.getText());
        contact.setCity(cityField.getText());
        contact.setState(stateField.getText());
        contact.setZipCode(zipField.getText());
        contact.setPhoneList(phoneList);
        dialog.dispose();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dialog.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addPhoneKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addPhoneKeyTyped

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        addPhoneActionPerformed(evt);
    }//GEN-LAST:event_phoneFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPhone;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JPanel addressPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JPanel cityPanel;
    private javax.swing.JTextField companyField;
    private javax.swing.JLabel companyLabel;
    private javax.swing.JPanel companyPanel;
    private javax.swing.JPanel eastPanel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel emailPanel;
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
    private javax.swing.Box.Filler filler30;
    private javax.swing.Box.Filler filler31;
    private javax.swing.Box.Filler filler32;
    private javax.swing.Box.Filler filler33;
    private javax.swing.Box.Filler filler34;
    private javax.swing.Box.Filler filler35;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JLabel highMtnImage;
    private javax.swing.JLabel highMtnLabel;
    private javax.swing.JList<Phone> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel namePanel;
    private javax.swing.JPanel northPanel;
    private javax.swing.JPanel northTitlePanel;
    private javax.swing.JComboBox<String> phoneComboBox;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JPanel phoneNorthPanel;
    private javax.swing.JPanel phonePanel;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel southInnerPanel;
    private javax.swing.JPanel southPanel;
    private javax.swing.JTextField stateField;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JPanel statePanel;
    private javax.swing.JPanel westPanel;
    private javax.swing.JTextField zipField;
    private javax.swing.JLabel zipLabel;
    private javax.swing.JPanel zipPanel;
    // End of variables declaration//GEN-END:variables
}
    public static void main(String []args){
        JFrame dave = new JFrame();
        dave.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ContactBuilder bob = new ContactBuilder(dave);
    }
}