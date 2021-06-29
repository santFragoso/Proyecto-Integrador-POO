/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alerta;

import java.awt.Color;

/**
 *
 * @author 4PF42LA_RS6
 */
public class AlertaMenuCobrar extends javax.swing.JDialog {

    /**
     * Creates new form AlertaMenuCobrar
     */
    public AlertaMenuCobrar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        AlertLabel = new javax.swing.JLabel();
        AcceptPanel = new javax.swing.JPanel();
        AcceptLabel = new javax.swing.JLabel();
        AlertLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        AlertLabel.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 24)); // NOI18N

        AcceptPanel.setBackground(new java.awt.Color(204, 102, 0));
        AcceptPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AcceptPanelMouseMoved(evt);
            }
        });
        AcceptPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcceptPanelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AcceptPanelMouseExited(evt);
            }
        });

        AcceptLabel.setBackground(new java.awt.Color(0, 0, 0));
        AcceptLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AcceptLabel.setForeground(new java.awt.Color(255, 255, 255));
        AcceptLabel.setText("Aceptar");

        javax.swing.GroupLayout AcceptPanelLayout = new javax.swing.GroupLayout(AcceptPanel);
        AcceptPanel.setLayout(AcceptPanelLayout);
        AcceptPanelLayout.setHorizontalGroup(
            AcceptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcceptPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(AcceptLabel)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        AcceptPanelLayout.setVerticalGroup(
            AcceptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AcceptPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AcceptLabel)
                .addContainerGap())
        );

        AlertLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alerta/AlertaLogoV2.png"))); // NOI18N

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AlertLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(AlertLogo))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(AcceptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(357, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AlertLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AlertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(AcceptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AcceptPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcceptPanelMouseMoved
        AcceptPanel.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_AcceptPanelMouseMoved

    private void AcceptPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcceptPanelMouseClicked
        this.dispose();
    }//GEN-LAST:event_AcceptPanelMouseClicked

    private void AcceptPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcceptPanelMouseExited
        AcceptPanel.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_AcceptPanelMouseExited

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
            java.util.logging.Logger.getLogger(AlertaMenuCobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlertaMenuCobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlertaMenuCobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlertaMenuCobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AlertaMenuCobrar dialog = new AlertaMenuCobrar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AcceptLabel;
    private javax.swing.JPanel AcceptPanel;
    private javax.swing.JLabel AlertLabel;
    private javax.swing.JLabel AlertLogo;
    private javax.swing.JPanel Background;
    // End of variables declaration//GEN-END:variables
    
    public void mensajeError(String mensaje){
        AlertLabel.setText(mensaje);
        AlertLabel.setHorizontalAlignment(0);
    }
}
