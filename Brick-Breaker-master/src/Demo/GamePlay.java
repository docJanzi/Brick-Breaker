/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

/**
 *
 * @author b35
 */
public class GamePlay extends javax.swing.JFrame {

    /**
     * Creates new form GamePlay
     */
    public GamePlay() {
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

        racket = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        racket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/racket.png"))); // NOI18N
        getContentPane().add(racket);
        racket.setBounds(233, 479, 119, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 70, 55, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 70, 55, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 70, 55, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(300, 70, 55, 25);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zogica.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 460, 20, 18);

        setSize(new java.awt.Dimension(616, 539));
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePlay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel racket;
    // End of variables declaration//GEN-END:variables
}
