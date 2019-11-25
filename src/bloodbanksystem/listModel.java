/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodbanksystem;

import java.awt.Component;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;

/**
 *
 * @author ABC
 */
public class listModel extends javax.swing.JPanel implements ListCellRenderer<customListObject> {

    /**
     * Creates new form listModel
     */
    public listModel() {
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

        jPanel1 = new javax.swing.JPanel();
        bloodl1 = new javax.swing.JLabel();
        contactl1 = new javax.swing.JLabel();
        locationl1 = new javax.swing.JLabel();
        namel1 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        urgency1 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        bloodl1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bloodl1.setText("Blood Group : ");

        contactl1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        contactl1.setText("Contact No : ");

        locationl1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        locationl1.setText("Location : ");

        namel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        namel1.setText("Name : ");

        id1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        id1.setText("ID :");

        urgency1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        urgency1.setText("Urgency : ");

        date1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        date1.setText("Date : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloodl1)
                    .addComponent(namel1)
                    .addComponent(id1)
                    .addComponent(urgency1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(locationl1)
                    .addComponent(contactl1)
                    .addComponent(date1))
                .addGap(168, 168, 168))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(id1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namel1)
                    .addComponent(contactl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodl1)
                    .addComponent(locationl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urgency1)
                    .addComponent(date1))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bloodl1;
    private javax.swing.JLabel contactl1;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel id1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel locationl1;
    private javax.swing.JLabel namel1;
    private javax.swing.JLabel urgency1;
    // End of variables declaration//GEN-END:variables

    @Override
    public Component getListCellRendererComponent(JList<? extends customListObject> list, customListObject value, int index, boolean isSelected, boolean cellHasFocus) {
        this.id1.setText(value.id);
        this.namel1.setText(value.name);
        this.bloodl1.setText(value.bloodgroup);
        this.contactl1.setText(value.contactNo);
        this.locationl1.setText(value.location);
        this.urgency1.setText(value.urgency);
        this.date1.setText(value.date);
        return this;
    }
}