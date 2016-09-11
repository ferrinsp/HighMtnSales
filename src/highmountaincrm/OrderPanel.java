/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highmountaincrm;

/**
 *
 * @author Samson
 */
public class OrderPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderPanel
     */
    public OrderPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newOrderPanel = new javax.swing.JPanel();
        filler36 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        newOrderInputPanel = new javax.swing.JPanel();
        newOrderNorthPanel = new javax.swing.JPanel();
        orderIdLabel1 = new javax.swing.JLabel();
        filler30 = new javax.swing.Box.Filler(new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 32767));
        newOrderIdField = new javax.swing.JTextField();
        newOrderSouthPanel = new javax.swing.JPanel();
        orderAmountLabel1 = new javax.swing.JLabel();
        filler32 = new javax.swing.Box.Filler(new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 32767));
        newOrderIdField1 = new javax.swing.JTextField();
        filler33 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 5), new java.awt.Dimension(5, 5), new java.awt.Dimension(5, 5));
        filler35 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        addOrderButton = new javax.swing.JButton();
        filler34 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setPreferredSize(new java.awt.Dimension(209, 69));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        newOrderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "New Order", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 12))); // NOI18N
        newOrderPanel.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        newOrderPanel.setLayout(new javax.swing.BoxLayout(newOrderPanel, javax.swing.BoxLayout.LINE_AXIS));
        newOrderPanel.add(filler36);

        newOrderInputPanel.setMaximumSize(new java.awt.Dimension(66, 2147483647));
        newOrderInputPanel.setLayout(new java.awt.BorderLayout());

        newOrderNorthPanel.setLayout(new javax.swing.BoxLayout(newOrderNorthPanel, javax.swing.BoxLayout.LINE_AXIS));

        orderIdLabel1.setFont(labelFont);
        orderIdLabel1.setText("Order Number:");
        newOrderNorthPanel.add(orderIdLabel1);
        newOrderNorthPanel.add(filler30);

        newOrderIdField.setMaximumSize(new java.awt.Dimension(72, 20));
        newOrderIdField.setPreferredSize(new java.awt.Dimension(72, 20));
        newOrderNorthPanel.add(newOrderIdField);

        newOrderInputPanel.add(newOrderNorthPanel, java.awt.BorderLayout.NORTH);

        newOrderSouthPanel.setLayout(new javax.swing.BoxLayout(newOrderSouthPanel, javax.swing.BoxLayout.LINE_AXIS));

        orderAmountLabel1.setFont(labelFont);
        orderAmountLabel1.setText("Order Amount:");
        newOrderSouthPanel.add(orderAmountLabel1);
        newOrderSouthPanel.add(filler32);

        newOrderIdField1.setMaximumSize(new java.awt.Dimension(72, 20));
        newOrderIdField1.setMinimumSize(new java.awt.Dimension(72, 20));
        newOrderIdField1.setName(""); // NOI18N
        newOrderIdField1.setPreferredSize(new java.awt.Dimension(72, 20));
        newOrderSouthPanel.add(newOrderIdField1);

        newOrderInputPanel.add(newOrderSouthPanel, java.awt.BorderLayout.SOUTH);
        newOrderInputPanel.add(filler33, java.awt.BorderLayout.CENTER);

        newOrderPanel.add(newOrderInputPanel);
        newOrderPanel.add(filler35);

        addOrderButton.setText("+");
        addOrderButton.setMaximumSize(new java.awt.Dimension(45, 45));
        addOrderButton.setMinimumSize(new java.awt.Dimension(45, 45));
        addOrderButton.setPreferredSize(new java.awt.Dimension(45, 45));
        addOrderButton.setRequestFocusEnabled(false);
        addOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderButtonActionPerformed(evt);
            }
        });
        newOrderPanel.add(addOrderButton);
        newOrderPanel.add(filler34);

        add(newOrderPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void addOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addOrderButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrderButton;
    private javax.swing.Box.Filler filler30;
    private javax.swing.Box.Filler filler32;
    private javax.swing.Box.Filler filler33;
    private javax.swing.Box.Filler filler34;
    private javax.swing.Box.Filler filler35;
    private javax.swing.Box.Filler filler36;
    private javax.swing.JTextField newOrderIdField;
    private javax.swing.JTextField newOrderIdField1;
    private javax.swing.JPanel newOrderInputPanel;
    private javax.swing.JPanel newOrderNorthPanel;
    private javax.swing.JPanel newOrderPanel;
    private javax.swing.JPanel newOrderSouthPanel;
    private javax.swing.JLabel orderAmountLabel1;
    private javax.swing.JLabel orderIdLabel1;
    // End of variables declaration//GEN-END:variables
}
