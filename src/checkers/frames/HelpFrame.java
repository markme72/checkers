/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers.frames;

import checkers.controls.HelpMenuControl;

/**
 *
 * @author
 * markearl
 */
public class HelpFrame extends javax.swing.JFrame {
    private HelpMenuControl helpCommands = null;

    /**
     * Creates
     * new
     * form
     * HelpFrame
     */
    public HelpFrame() {
        this.helpCommands = new HelpMenuControl();
        initComponents();
    }

    /**
     * This
     * method
     * is
     * called
     * from
     * within
     * the
     * constructor
     * to
     * initialize
     * the
     * form.
     * WARNING:
     * Do
     * NOT
     * modify
     * this
     * code.
     * The
     * content
     * of
     * this
     * method
     * is
     * always
     * regenerated
     * by
     * the
     * Form
     * Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jBoard = new javax.swing.JButton();
        jGame = new javax.swing.JButton();
        jLocation = new javax.swing.JButton();
        jMarker = new javax.swing.JButton();
        jMovement = new javax.swing.JButton();
        jOvertaking = new javax.swing.JButton();
        jRealPlayer = new javax.swing.JButton();
        jExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jBoard.setText("Board");
        jBoard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBoardMouseClicked(evt);
            }
        });

        jGame.setText("Game");
        jGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jGameMouseClicked(evt);
            }
        });

        jLocation.setText("Location");
        jLocation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLocationMouseClicked(evt);
            }
        });

        jMarker.setText("Marker");
        jMarker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMarkerMouseClicked(evt);
            }
        });

        jMovement.setText("Movement");
        jMovement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMovementMouseClicked(evt);
            }
        });

        jOvertaking.setText("Overtaking");
        jOvertaking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jOvertakingMouseClicked(evt);
            }
        });

        jRealPlayer.setText("Real Player");
        jRealPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRealPlayerMouseClicked(evt);
            }
        });

        jExit.setText("Exit");
        jExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jExitMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLocation)
                    .add(jMarker)
                    .add(jGame)
                    .add(jBoard))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jMovement)
                    .add(jOvertaking)
                    .add(jRealPlayer)
                    .add(jExit))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jBoard)
                            .add(jMovement))
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jGame)
                            .add(jOvertaking))
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jRealPlayer)
                            .add(jLocation))
                        .add(18, 18, Short.MAX_VALUE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jMarker)
                            .add(jExit))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBoardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBoardMouseClicked
        this.helpCommands.displayBoardHelp(jTextArea1);
    }//GEN-LAST:event_jBoardMouseClicked

    private void jGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGameMouseClicked
        this.helpCommands.displayGameHelp(jTextArea1);
    }//GEN-LAST:event_jGameMouseClicked

    private void jLocationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLocationMouseClicked
        this.helpCommands.displayLocationHelp(jTextArea1);
    }//GEN-LAST:event_jLocationMouseClicked

    private void jMarkerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMarkerMouseClicked
        this.helpCommands.displayMarkerHelp(jTextArea1);
    }//GEN-LAST:event_jMarkerMouseClicked

    private void jMovementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMovementMouseClicked
        this.helpCommands.displayMovementHelp(jTextArea1);
    }//GEN-LAST:event_jMovementMouseClicked

    private void jOvertakingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOvertakingMouseClicked
        this.helpCommands.displayOvertakingHelp(jTextArea1);
    }//GEN-LAST:event_jOvertakingMouseClicked

    private void jRealPlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRealPlayerMouseClicked
        this.helpCommands.displayRealPlayerHelp(jTextArea1);
    }//GEN-LAST:event_jRealPlayerMouseClicked

    private void jExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_jExitMouseClicked

    /**
     * @param
     * args
     * the
     * command
     * line
     * arguments
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
            java.util.logging.Logger.getLogger(HelpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBoard;
    private javax.swing.JButton jExit;
    private javax.swing.JButton jGame;
    private javax.swing.JButton jLocation;
    private javax.swing.JButton jMarker;
    private javax.swing.JButton jMovement;
    private javax.swing.JButton jOvertaking;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jRealPlayer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
