/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimelineApplication;

/**
 *
 * @author S199841769
 */
public class Maintimeline extends javax.swing.JFrame {

    /**
     * Creates new form Maintimeline
     */
    public Maintimeline() {
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

        jSeparator1 = new javax.swing.JSeparator();
        TimelineTitleLabel = new javax.swing.JLabel();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ScrollableAreaPane = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        EventPane = new javax.swing.JPanel();
        EventTitlePanel = new javax.swing.JPanel();
        EventTitleLabel = new javax.swing.JLabel();
        DateTextLabel = new javax.swing.JLabel();
        ImageFrame = new javax.swing.JPanel();
        SeperatorPane = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DescriptionTextPanel = new javax.swing.JTextPane();
        EventPane3 = new javax.swing.JPanel();
        EventTitlePanel3 = new javax.swing.JPanel();
        EventTitleLabel3 = new javax.swing.JLabel();
        DateTextLabel3 = new javax.swing.JLabel();
        ImageFrame1 = new javax.swing.JPanel();
        SeperatorPane1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        DescriptionTextPanel1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        TimelineTitleLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        TimelineTitleLabel.setText("TIMELINE TITLE HERE");
        getContentPane().add(TimelineTitleLabel);
        TimelineTitleLabel.setBounds(457, 13, 311, 28);

        EditBtn.setText("EDIT");
        getContentPane().add(EditBtn);
        EditBtn.setBounds(1168, 798, 59, 25);

        DeleteBtn.setText("DELETE");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteBtn);
        DeleteBtn.setBounds(1075, 798, 75, 25);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        EventPane.setBackground(new java.awt.Color(153, 153, 153));
        EventPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        EventTitlePanel.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabel.setText("jLabel1");

        DateTextLabel.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabel.setText("jLabel1");

        javax.swing.GroupLayout EventTitlePanelLayout = new javax.swing.GroupLayout(EventTitlePanel);
        EventTitlePanel.setLayout(EventTitlePanelLayout);
        EventTitlePanelLayout.setHorizontalGroup(
            EventTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanelLayout.createSequentialGroup()
                        .addComponent(DateTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EventTitlePanelLayout.setVerticalGroup(
            EventTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ImageFrame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageFrame.setOpaque(false);

        javax.swing.GroupLayout ImageFrameLayout = new javax.swing.GroupLayout(ImageFrame);
        ImageFrame.setLayout(ImageFrameLayout);
        ImageFrameLayout.setHorizontalGroup(
            ImageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImageFrameLayout.setVerticalGroup(
            ImageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        SeperatorPane.setLayout(null);

        jScrollPane3.setViewportView(DescriptionTextPanel);

        javax.swing.GroupLayout EventPaneLayout = new javax.swing.GroupLayout(EventPane);
        EventPane.setLayout(EventPaneLayout);
        EventPaneLayout.setHorizontalGroup(
            EventPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPaneLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(EventTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EventPaneLayout.createSequentialGroup()
                .addComponent(SeperatorPane, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EventPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        EventPaneLayout.setVerticalGroup(
            EventPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPaneLayout.createSequentialGroup()
                .addComponent(EventTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeperatorPane, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );

        EventPane3.setBackground(new java.awt.Color(153, 153, 153));
        EventPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        EventTitlePanel3.setBackground(new java.awt.Color(0, 0, 0));

        EventTitleLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EventTitleLabel3.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabel3.setText("jLabel1");

        DateTextLabel3.setForeground(new java.awt.Color(255, 255, 255));
        DateTextLabel3.setText("jLabel1");

        javax.swing.GroupLayout EventTitlePanel3Layout = new javax.swing.GroupLayout(EventTitlePanel3);
        EventTitlePanel3.setLayout(EventTitlePanel3Layout);
        EventTitlePanel3Layout.setHorizontalGroup(
            EventTitlePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventTitlePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventTitleLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EventTitlePanel3Layout.createSequentialGroup()
                        .addComponent(DateTextLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EventTitlePanel3Layout.setVerticalGroup(
            EventTitlePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventTitlePanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EventTitleLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ImageFrame1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageFrame1.setOpaque(false);

        javax.swing.GroupLayout ImageFrame1Layout = new javax.swing.GroupLayout(ImageFrame1);
        ImageFrame1.setLayout(ImageFrame1Layout);
        ImageFrame1Layout.setHorizontalGroup(
            ImageFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImageFrame1Layout.setVerticalGroup(
            ImageFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        SeperatorPane1.setLayout(null);

        jScrollPane4.setViewportView(DescriptionTextPanel1);

        javax.swing.GroupLayout EventPane3Layout = new javax.swing.GroupLayout(EventPane3);
        EventPane3.setLayout(EventPane3Layout);
        EventPane3Layout.setHorizontalGroup(
            EventPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(EventTitlePanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EventPane3Layout.createSequentialGroup()
                .addComponent(SeperatorPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EventPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        EventPane3Layout.setVerticalGroup(
            EventPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPane3Layout.createSequentialGroup()
                .addComponent(EventTitlePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeperatorPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1015, Short.MAX_VALUE)
                .addComponent(EventPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(1016, Short.MAX_VALUE)
                    .addComponent(EventPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(51, 51, 51)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(491, Short.MAX_VALUE)
                .addComponent(EventPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(EventPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(445, Short.MAX_VALUE)))
        );

        ScrollableAreaPane.setViewportView(jPanel1);

        getContentPane().add(ScrollableAreaPane);
        ScrollableAreaPane.setBounds(12, 94, 1228, 676);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        DeleteEvent delete = new DeleteEvent();
        delete.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_DeleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Maintimeline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maintimeline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maintimeline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maintimeline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maintimeline().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateTextLabel;
    private javax.swing.JLabel DateTextLabel1;
    private javax.swing.JLabel DateTextLabel2;
    private javax.swing.JLabel DateTextLabel3;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextPane DescriptionTextPanel;
    private javax.swing.JTextPane DescriptionTextPanel1;
    private javax.swing.JButton EditBtn;
    private javax.swing.JPanel EventPane;
    private javax.swing.JPanel EventPane1;
    private javax.swing.JPanel EventPane2;
    private javax.swing.JPanel EventPane3;
    private javax.swing.JLabel EventTitleLabel;
    private javax.swing.JLabel EventTitleLabel1;
    private javax.swing.JLabel EventTitleLabel2;
    private javax.swing.JLabel EventTitleLabel3;
    private javax.swing.JPanel EventTitlePanel;
    private javax.swing.JPanel EventTitlePanel1;
    private javax.swing.JPanel EventTitlePanel2;
    private javax.swing.JPanel EventTitlePanel3;
    private javax.swing.JPanel ImageFrame;
    private javax.swing.JPanel ImageFrame1;
    private javax.swing.JScrollPane ScrollableAreaPane;
    private javax.swing.JPanel SeperatorPane;
    private javax.swing.JPanel SeperatorPane1;
    private javax.swing.JLabel TimelineTitleLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
