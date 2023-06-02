package Demo;

import java.awt.Color;
import java.awt.event.KeyEvent;

/**
 *
 * @author janip
 */

public class GamePlay extends javax.swing.JFrame implements Runnable{
    int x,y,sy=4,sx=4,spd = 10;
    static int brickSt;
    //Runnable r1 = new timer();
    Thread t1;
    boolean ThreadIsRunning = true;
    boolean desno=false; 
    boolean levo=false;
        
    public GamePlay() {
        initComponents(); 
        racket.setFocusable(true);
        getContentPane().setBackground(Color.GRAY);
        x = 290;
        y = 430;     
        brickSt=24;
        ball.setLocation(x, y);
        t1 = new Thread(this);
        t1.start();
    }
    
    /*public class timer implements Runnable {*/
        public void run () {
            while (ThreadIsRunning) {
                    x = x+sx;
                    y = y-sy;
                    if (x>580 && sx>0) {
                        sx = sx*(-1);
                    }
                    if (y<0) {
                        sy = sy*(-1);                        
                    }
                    if (x<0 && sx<0) {
                        sx = sx*(-1);
                    }
                    
                    if ((x>racket.getX() && x+ball.getWidth()<racket.getX()+racket.getWidth())&&y+ball.getHeight()>=racket.getY()) {
                        if (x<racket.getX()+(racket.getWidth()/2)&&sx>0 || x>racket.getX()+(racket.getWidth()/2)&&sx<0) {
                            sx = -sx;                            
                        }
                        sy = sy*(-1);
                            
                    }
                    if (y>500) {                        
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
                    if (levo == true) {
                        if (0 <= racket.getX()) {
                            racket.setLocation(racket.getX()-spd, 450);
                        }                       

                    }
                    if (desno == true) {
                        if (racket.getX()<600-racket.getWidth()) {
                            racket.setLocation(racket.getX()+spd, 450);
                        }
                        

                    }
                    try {
                        t1.sleep(1000/60);
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
            jLabelx.setLocation(500, 530);
            brickSt--;            
            if (brickSt<1) {
                new KonecIgre().setVisible(true);
                dispose();                      
                t1.stop();                    
            }
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
        jLabel26 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(null);

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
        getContentPane().add(racket);
        racket.setBounds(220, 450, 150, 11);

        ball.setForeground(new java.awt.Color(255, 255, 255));
        ball.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/ball.jpg"))); // NOI18N
        getContentPane().add(ball);
        ball.setBounds(290, 430, 20, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 40, 55, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 40, 55, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 40, 55, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 40, 55, 25);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 40, 55, 25);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 40, 55, 25);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(370, 80, 55, 25);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(300, 80, 55, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(230, 80, 55, 25);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(440, 80, 55, 25);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(160, 80, 55, 25);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(90, 80, 55, 25);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(370, 120, 55, 25);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(300, 120, 55, 25);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(230, 120, 55, 25);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(440, 120, 55, 25);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(160, 120, 55, 25);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(90, 120, 55, 25);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(370, 160, 55, 25);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(300, 160, 55, 25);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(230, 160, 55, 25);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel22);
        jLabel22.setBounds(440, 160, 55, 25);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel23);
        jLabel23.setBounds(160, 160, 55, 25);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/opeka.png"))); // NOI18N
        getContentPane().add(jLabel24);
        jLabel24.setBounds(90, 160, 55, 25);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/backgroundForBrickBreaker.jpg"))); // NOI18N
        getContentPane().add(jLabel26);
        jLabel26.setBounds(0, -30, 600, 500);

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

        jMenu1.setText("Pomoč");
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

        jMenu3.setText("Oujea");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        setSize(new java.awt.Dimension(616, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void racketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_racketKeyPressed
        int keyCode = evt.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            levo = true;
        } else if (keyCode == KeyEvent.VK_RIGHT) {
           desno = true;
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
        int keyCode = evt.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            levo = false;
        } else if (keyCode == KeyEvent.VK_RIGHT) {
           desno = false;
        }
    }//GEN-LAST:event_racketKeyReleased

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        new Oujea().setVisible(true);        
    }//GEN-LAST:event_jMenu3MouseClicked

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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel racket;
    // End of variables declaration//GEN-END:variables
}
