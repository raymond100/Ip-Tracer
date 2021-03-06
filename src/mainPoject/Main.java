package mainPoject;

import com.ray100.Location.IpTracer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author edmae
 */
public final class Main extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        Splash();
    }

    public void Splash() {
        new Thread() {
            public void run() {
                setVisible(true);
                for (int i = 0; i <= 100; i = i + 10) {
                    jProgressBar1.setValue(i);
                    percentBarLabel.setText(i + "%");
                     infoLabel.setText("<html>IP Tracer are based on sofware from Ray Corp."
                        + "For more information,please visit www.raycorp.org </html>");
                    if (i == 100) {
                        setVisible(false);
                        new IpTracer().setVisible(true);
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                }
               
            }
        }.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        percentBarLabel = new javax.swing.JLabel();
        imgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("IP Tracer 1.0");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 370, 10));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Copyright © 2017 Ray Corp. ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 160, -1));

        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(infoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 164, 360, 50));
        getContentPane().add(percentBarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 50, 10));

        imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainPoject/imgLabel.jpg"))); // NOI18N
        imgLabel.setText("jLabel5");
        getContentPane().add(imgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(IpTracer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IpTracer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IpTracer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IpTracer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel percentBarLabel;
    // End of variables declaration//GEN-END:variables
}
