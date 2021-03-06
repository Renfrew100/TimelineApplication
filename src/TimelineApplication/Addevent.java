package TimelineApplication;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static TimelineApplication.Maintimeline.addBtnClicked;
import static TimelineApplication.Maintimeline.eventInformationList;
import static TimelineApplication.Maintimeline.numOfEvents;
import static TimelineApplication.Maintimeline.updateScreen;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Addevent extends javax.swing.JFrame {

    /**
     * Creates new form Addevent
     */
    public Addevent() {
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
        EventPositionLabel = new javax.swing.JLabel();
        EventPositionTextField = new javax.swing.JTextField();
        EventNameLabel = new javax.swing.JLabel();
        EventNameTextField = new javax.swing.JTextField();
        TimeLabel = new javax.swing.JLabel();
        TimeTextField = new javax.swing.JTextField();
        DescriptionLabel = new javax.swing.JLabel();
        DescriptionTextField = new javax.swing.JTextField();
        ImageUrlLabel = new javax.swing.JLabel();
        ImageUrlTextField = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        EventPositionLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        EventPositionLabel.setText("Event Positon (Specify the Position, a Numerical Value):");

        EventPositionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventPositionTextFieldActionPerformed(evt);
            }
        });

        EventNameLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        EventNameLabel.setText("Event Name:");

        EventNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventNameTextFieldActionPerformed(evt);
            }
        });

        TimeLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TimeLabel.setText("Time:");

        TimeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeTextFieldActionPerformed(evt);
            }
        });

        DescriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        DescriptionLabel.setText("Description:");

        DescriptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescriptionTextFieldActionPerformed(evt);
            }
        });

        ImageUrlLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ImageUrlLabel.setText("Image URL:");

        ImageUrlTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImageUrlTextFieldActionPerformed(evt);
            }
        });

        AddBtn.setText("ADD");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        CancelBtn.setText("CANCEL");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EventPositionLabel)
                            .addComponent(EventPositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EventNameLabel)
                            .addComponent(EventNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TimeLabel)
                            .addComponent(DescriptionLabel)
                            .addComponent(DescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImageUrlLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TimeTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImageUrlTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddBtn)
                .addGap(90, 90, 90)
                .addComponent(CancelBtn)
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventPositionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EventPositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EventNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EventNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TimeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DescriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ImageUrlLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImageUrlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(CancelBtn))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EventNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EventNameTextFieldActionPerformed

    private void DescriptionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionTextFieldActionPerformed

    private void ImageUrlTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImageUrlTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImageUrlTextFieldActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        addBtnClicked = false;
        this.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
           int eventPos = Integer.parseInt(EventPositionTextField.getText());
           String eventName = EventNameTextField.getText();
           String eventDate = TimeTextField.getText();
           String eventDesc = DescriptionTextField.getText();
           String eventImg = ImageUrlTextField.getText();
           
           
           
           if(numOfEvents <= 16){
               if(eventPos > 0 && eventPos <= (numOfEvents + 1)){
                   eventInformationList.add(eventPos, new ArrayList<String>()); //inserting a new sublist to then add the new event info into
                   eventInformationList.remove(eventInformationList.size()-1); //remove the 17th sublist that is now present
                   eventInformationList.get(eventPos).add(eventName);
                   eventInformationList.get(eventPos).add(eventDate); 
                   eventInformationList.get(eventPos).add(eventDesc);
                   eventInformationList.get(eventPos).add(eventImg);
                   numOfEvents +=1;
                   updateScreen(numOfEvents);
               }
               else{
                   JOptionPane.showMessageDialog(null, "That is an invalid event position!");
               }
           }
           else{
               JOptionPane.showMessageDialog(null, "You have reached the maximum number of events!");
           }
           
           addBtnClicked = false;
           this.dispose();
           
           
    }//GEN-LAST:event_AddBtnActionPerformed

    private void EventPositionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventPositionTextFieldActionPerformed
        addBtnClicked = false;
    }//GEN-LAST:event_EventPositionTextFieldActionPerformed

    private void TimeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeTextFieldActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Addevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addevent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JTextField DescriptionTextField;
    private javax.swing.JLabel EventNameLabel;
    private javax.swing.JTextField EventNameTextField;
    private javax.swing.JLabel EventPositionLabel;
    private javax.swing.JTextField EventPositionTextField;
    private javax.swing.JLabel ImageUrlLabel;
    private javax.swing.JTextField ImageUrlTextField;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JTextField TimeTextField;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
