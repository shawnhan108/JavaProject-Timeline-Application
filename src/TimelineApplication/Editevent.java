package TimelineApplication;
import static TimelineApplication.EditEventNum.editPosNum;
import static TimelineApplication.Maintimeline.editBtnClicked;
import static TimelineApplication.Maintimeline.eventInformationList;
import static TimelineApplication.Maintimeline.numOfEvents;
import static TimelineApplication.Maintimeline.updateScreen;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Editevent extends javax.swing.JFrame {

    public static String oldColorR;
    public static String oldColorG;
    public static String oldColorB;
    public static int oldPosition;
    
    public Editevent() {
        initComponents();
        
        //Getting all the info of chosen event and displaying it in text fields
        String edit_pos = Integer.toString(editPosNum);;
        posTextField.setText(edit_pos);
        EditEventNameTextField.setText(eventInformationList.get(editPosNum).get(0).toString());
        EditTimeTextField.setText(eventInformationList.get(editPosNum).get(1).toString());
        EditDescriptionTextArea.setText(eventInformationList.get(editPosNum).get(2).toString());
        EditImageUrlTextField.setText(eventInformationList.get(editPosNum).get(3).toString());
        oldColorR = eventInformationList.get(editPosNum).get(4);
        oldColorG = eventInformationList.get(editPosNum).get(5);
        oldColorB = eventInformationList.get(editPosNum).get(6);
        
        setOldPosition();
     
    }

    public static void setOldPosition(){
        oldPosition = parseInt(posTextField.getText());  
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        middlePanel = new javax.swing.JPanel();
        editImage = new javax.swing.JLabel();
        positionPanel = new javax.swing.JPanel();
        positionLabel = new javax.swing.JLabel();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        datePanel = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        descriptionPanel = new javax.swing.JPanel();
        descriptionLabel = new javax.swing.JLabel();
        imgUrlPanel = new javax.swing.JPanel();
        imageUrlLabel = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        EditDescriptionTextArea = new javax.swing.JTextArea();
        posTextField = new javax.swing.JTextField();
        EditTimeTextField = new javax.swing.JTextField();
        EditEventNameTextField = new javax.swing.JTextField();
        EditImageUrlTextField = new javax.swing.JTextField();
        EditBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        positionLabel1 = new javax.swing.JLabel();
        sidePanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));
        setMaximumSize(new java.awt.Dimension(500, 535));
        setMinimumSize(new java.awt.Dimension(430, 535));
        setPreferredSize(new java.awt.Dimension(430, 535));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        middlePanel.setBackground(new java.awt.Color(0, 91, 229));
        middlePanel.setMaximumSize(new java.awt.Dimension(500, 535));
        middlePanel.setMinimumSize(new java.awt.Dimension(500, 535));
        middlePanel.setPreferredSize(new java.awt.Dimension(147, 535));

        editImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/EditIconHover.png"))); // NOI18N

        positionPanel.setBackground(new java.awt.Color(0, 51, 153));
        positionPanel.setForeground(new java.awt.Color(255, 255, 255));
        positionPanel.setToolTipText("");
        positionPanel.setMaximumSize(new java.awt.Dimension(147, 47));
        positionPanel.setMinimumSize(new java.awt.Dimension(147, 47));
        positionPanel.setLayout(new java.awt.GridBagLayout());

        positionLabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        positionLabel.setForeground(new java.awt.Color(255, 255, 255));
        positionLabel.setText("Position");
        positionPanel.add(positionLabel, new java.awt.GridBagConstraints());

        titlePanel.setBackground(new java.awt.Color(0, 51, 153));
        titlePanel.setForeground(new java.awt.Color(255, 255, 255));
        titlePanel.setToolTipText("");
        titlePanel.setLayout(new java.awt.GridBagLayout());

        titleLabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Title");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 52, 13, 62);
        titlePanel.add(titleLabel, gridBagConstraints);

        datePanel.setBackground(new java.awt.Color(0, 51, 153));
        datePanel.setForeground(new java.awt.Color(255, 255, 255));
        datePanel.setToolTipText("");
        datePanel.setLayout(new java.awt.GridBagLayout());

        dateLabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setText("Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 52, 13, 60);
        datePanel.add(dateLabel, gridBagConstraints);

        descriptionPanel.setBackground(new java.awt.Color(0, 51, 153));
        descriptionPanel.setForeground(new java.awt.Color(255, 255, 255));
        descriptionPanel.setToolTipText("");
        descriptionPanel.setMaximumSize(new java.awt.Dimension(128, 98));
        descriptionPanel.setMinimumSize(new java.awt.Dimension(128, 98));
        descriptionPanel.setLayout(new java.awt.GridBagLayout());

        descriptionLabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        descriptionLabel.setText("Description");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 30, 39, 31);
        descriptionPanel.add(descriptionLabel, gridBagConstraints);

        imgUrlPanel.setBackground(new java.awt.Color(0, 51, 153));
        imgUrlPanel.setForeground(new java.awt.Color(255, 255, 255));
        imgUrlPanel.setToolTipText("");
        imgUrlPanel.setLayout(new java.awt.GridBagLayout());

        imageUrlLabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        imageUrlLabel.setForeground(new java.awt.Color(255, 255, 255));
        imageUrlLabel.setText("Image URL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 35, 13, 32);
        imgUrlPanel.add(imageUrlLabel, gridBagConstraints);

        javax.swing.GroupLayout middlePanelLayout = new javax.swing.GroupLayout(middlePanel);
        middlePanel.setLayout(middlePanelLayout);
        middlePanelLayout.setHorizontalGroup(
            middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middlePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(editImage))
            .addComponent(positionPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(datePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(descriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(imgUrlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        middlePanelLayout.setVerticalGroup(
            middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middlePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(editImage)
                .addGap(29, 29, 29)
                .addComponent(positionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(datePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(descriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(imgUrlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(middlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 0, -1, 510));

        rightPanel.setBackground(new java.awt.Color(244, 249, 255));
        rightPanel.setMaximumSize(new java.awt.Dimension(500, 535));
        rightPanel.setMinimumSize(new java.awt.Dimension(500, 535));
        rightPanel.setPreferredSize(new java.awt.Dimension(1185, 535));
        rightPanel.setLayout(null);

        EditDescriptionTextArea.setColumns(20);
        EditDescriptionTextArea.setLineWrap(true);
        EditDescriptionTextArea.setRows(5);
        EditDescriptionTextArea.setToolTipText("");
        EditDescriptionTextArea.setWrapStyleWord(true);
        EditDescriptionTextArea.setBorder(null);
        jScrollPane2.setViewportView(EditDescriptionTextArea);

        rightPanel.add(jScrollPane2);
        jScrollPane2.setBounds(10, 288, 200, 110);

        posTextField.setMinimumSize(new java.awt.Dimension(200, 47));
        posTextField.setPreferredSize(new java.awt.Dimension(200, 47));
        posTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posTextFieldActionPerformed(evt);
            }
        });
        rightPanel.add(posTextField);
        posTextField.setBounds(10, 132, 200, 47);

        EditTimeTextField.setMinimumSize(new java.awt.Dimension(200, 47));
        EditTimeTextField.setPreferredSize(new java.awt.Dimension(200, 47));
        EditTimeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTimeTextFieldActionPerformed(evt);
            }
        });
        rightPanel.add(EditTimeTextField);
        EditTimeTextField.setBounds(10, 240, 200, 47);

        EditEventNameTextField.setMinimumSize(new java.awt.Dimension(200, 47));
        EditEventNameTextField.setPreferredSize(new java.awt.Dimension(200, 47));
        EditEventNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEventNameTextFieldActionPerformed(evt);
            }
        });
        rightPanel.add(EditEventNameTextField);
        EditEventNameTextField.setBounds(10, 186, 200, 47);

        EditImageUrlTextField.setMinimumSize(new java.awt.Dimension(6, 47));
        EditImageUrlTextField.setPreferredSize(new java.awt.Dimension(6, 47));
        EditImageUrlTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditImageUrlTextFieldActionPerformed(evt);
            }
        });
        rightPanel.add(EditImageUrlTextField);
        EditImageUrlTextField.setBounds(10, 400, 200, 47);

        EditBtn.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        EditBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/nextBtnNonHover.png"))); // NOI18N
        EditBtn.setContentAreaFilled(false);
        EditBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/nextBtnHover.png"))); // NOI18N
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        rightPanel.add(EditBtn);
        EditBtn.setBounds(10, 450, 50, 49);

        CancelBtn.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        CancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/cancelBtnNonHover.png"))); // NOI18N
        CancelBtn.setBorderPainted(false);
        CancelBtn.setContentAreaFilled(false);
        CancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/cancelBtnHover.png"))); // NOI18N
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        rightPanel.add(CancelBtn);
        CancelBtn.setBounds(160, 450, 50, 49);

        positionLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 80)); // NOI18N
        positionLabel1.setText("EDIT");
        rightPanel.add(positionLabel1);
        positionLabel1.setBounds(30, 20, 165, 92);

        getContentPane().add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 240, 510));

        sidePanel1.setBackground(new java.awt.Color(244, 249, 255));
        sidePanel1.setMaximumSize(new java.awt.Dimension(500, 535));
        sidePanel1.setMinimumSize(new java.awt.Dimension(500, 535));

        javax.swing.GroupLayout sidePanel1Layout = new javax.swing.GroupLayout(sidePanel1);
        sidePanel1.setLayout(sidePanel1Layout);
        sidePanel1Layout.setHorizontalGroup(
            sidePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        sidePanel1Layout.setVerticalGroup(
            sidePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        getContentPane().add(sidePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void posTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posTextFieldActionPerformed

    }//GEN-LAST:event_posTextFieldActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        editBtnClicked = false;
        this.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed

        //Getting text from text fields
        String name = EditEventNameTextField.getText();
        String time = EditTimeTextField.getText();
        String desc = EditDescriptionTextArea.getText();
        String URL = EditImageUrlTextField.getText();

        int positionNew = parseInt(posTextField.getText());

        //Verifying that the inputted position number is within the possible range
        //and then removing sublsit at that pos, adding new sublist and inserting all relevant info into main event info list
        if(positionNew <= numOfEvents && positionNew > 0){
            eventInformationList.remove(oldPosition);
            eventInformationList.add(positionNew, new ArrayList<String>());
            eventInformationList.get(positionNew).add(name);
            eventInformationList.get(positionNew).add(time);
            eventInformationList.get(positionNew).add(desc);
            eventInformationList.get(positionNew).add(URL);
            eventInformationList.get(positionNew).add(oldColorR);
            eventInformationList.get(positionNew).add(oldColorG);
            eventInformationList.get(positionNew).add(oldColorB);
            updateScreen(numOfEvents);
            editBtnClicked = false;
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "That position is invalid.");
        }

    }//GEN-LAST:event_EditBtnActionPerformed

    private void EditImageUrlTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditImageUrlTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditImageUrlTextFieldActionPerformed

    private void EditEventNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditEventNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditEventNameTextFieldActionPerformed

    private void EditTimeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTimeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditTimeTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Editevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editevent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    public static javax.swing.JButton EditBtn;
    private javax.swing.JTextArea EditDescriptionTextArea;
    private javax.swing.JTextField EditEventNameTextField;
    private javax.swing.JTextField EditImageUrlTextField;
    private javax.swing.JTextField EditTimeTextField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JPanel datePanel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JPanel descriptionPanel;
    private javax.swing.JLabel editImage;
    private javax.swing.JLabel imageUrlLabel;
    private javax.swing.JPanel imgUrlPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel middlePanel;
    public static javax.swing.JTextField posTextField;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JLabel positionLabel1;
    private javax.swing.JPanel positionPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel sidePanel1;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
