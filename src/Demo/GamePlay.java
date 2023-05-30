/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Demo;

import java.awt.Color;
import java.awt.event.KeyEvent;

/**
 *
 * @author janip
 */
public class GamePlay extends javax.swing.JFrame implements Runnable{
    int x,y,sy=5,sx=5;
    //Runnable r1 = new timer();
    Thread t1;
    boolean ThreadIsRunning = true;
    boolean d=false; 
    boolean l=false;
        
    public GamePlay() {
        initComponents(); 
        racket.setFocusable(true);
        getContentPane().setBackground(Color.GRAY);
        x = 290;
        y = 430;     
        boolean w=false; 
        boolean s=false;
        ball.setLocation(x, y);
        t1 = new Thread(this);
        t1.start();
    }
    
    /*public class timer implements Runnable {*/
        public void run () {
            while (ThreadIsRunning) {
                    x = x+sx;
                    y = y-sy;
                    if (x>580) {
                        sx = sx*(-1);
                    }
                    if (y<0) {
                        sy = sy*(-1);                        
                    }
                    if (x<0) {
                        sx = sx*(-1);
                    }
                    
                    if ((x>racket.getX() && x+ball.getWidth()<racket.getX()+racket.getWidth())&&y+ball.getHeight()>=racket.getY()) {
                        sy = sy*(-1);
                    }
                    if (y>480) {                        
                        new KonecIgre().setVisible(true);
                        dispose();                      
                        t1.stop();                    
                    }
                    
                    collisions(jLabel1);
                    collisions(jLabel2);
                    collisions(jLabel3);
                    collisions(jLabel4);
                    collisions(jLabel5);
                    collisions(jLabel6);
                    collisions(jLabel7);
                    collisions(jLabel8);
                    collisions(jLabel9);
                    collisions(jLabel10);
                    collisions(jLabel11);
                    collisions(jLabel12);
                    collisions(jLabel13);
                    collisions(jLabel14);
                    collisions(jLabel15);
                    collisions(jLabel16);
                    collisions(jLabel17);
                    collisions(jLabel18);
                    collisions(jLabel19);
                    collisions(jLabel20);
                    collisions(jLabel21);
                    collisions(jLabel22);
                    collisions(jLabel23);
                    collisions(jLabel24);
                    
                    
                    ball.setLocation(x,y);
                    try {
                        t1.sleep(1000/40);
                    }
                    catch(Exception e) {}
            }
        }
        
        
    
    public void collisions(javax.swing.JLabel jLabelx){
        if(ball.getBounds().intersects(jLabelx.getBounds())){
            int dol = Math.abs(ball.getY()-(jLabelx.getY()+jLabelx.getHeight()));
            int gor = Math.abs((ball.getY()+ball.getHeight())-jLabelx.getY());
            int desno = Math.abs(ball.getX()-(jLabelx.getX()+jLabelx.getWidth()));
            int levo = Math.abs((ball.getX()+ball.getWidth())-jLabelx.getX());
            
            if(dol<gor && dol<levo && dol<desno){
                sy=sy*(-1);                
            }
            if(gor<dol && gor<levo && gor<desno){
                sy=sy*(-1);
            }
            if(levo<gor && levo<dol && levo<desno){
                sx=sx*(-1);                
            }
            if(desno<gor && desno<levo && desno<dol){
                sx=sx*(-1);
            }
            if(dol<gor && desno<levo && dol == desno || dol<gor && desno>levo && dol == levo || dol>gor && desno<levo && gor == desno || dol>gor && desno>levo && gor == levo) {
                sy=sy*(-1);
                sx=sx*(-1);  
            }
            jLabelx.setIcon(null);
        }
    }

    
  
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        racket = new javax.swing.JLabel();
        ball = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        racket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/podlaga.jpg"))); // NOI18N
        racket.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        racket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                racketKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                racketKeyReleased(evt);
            }
        });
        getContentPane().add(racket, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, -1));

        ball.setForeground(new java.awt.Color(255, 255, 255));
        ball.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/ball.jpg"))); // NOI18N
        getContentPane().add(ball, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/istockphoto-992155792-170667a.jpg"))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        jMenu2.setText("Domov");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu2);

        jMenu4.setText("Vizitka");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu4);

        jMenu1.setText("Navodila");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu1);

        jMenu6.setText("Izhod");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        setSize(new java.awt.Dimension(616, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void racketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_racketKeyPressed
        int keyCode = evt.getKeyCode();
        int stepSize = 20;
        if (keyCode == KeyEvent.VK_LEFT) {
            racket.setLocation(racket.getX() - stepSize, racket.getY());
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            racket.setLocation(racket.getX() + stepSize, racket.getY());
        }
    }//GEN-LAST:event_racketKeyPressed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        new Vizitka().setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        new Pomoč().setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        new UvodnoOkno().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void racketKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_racketKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_racketKeyReleased

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
    private javax.swing.JLabel ball;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel racket;
    // End of variables declaration//GEN-END:variables
}
