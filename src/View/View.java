/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import GameCtr.GameCtr;
import GameCtr.KeyListenerFrogMovement;
import Map.Map;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author menko
 */
public class View extends javax.swing.JFrame implements ViewInterface{
  
    
    
    private final int UPS = 60;
    public String frogPicturePath;

    /**
     * funny array
     */
    public String carPicturePath;
    private Map map;
    private GameCtr game;
    private KeyListenerFrogMovement frogMovement;

    /**
     *map is nice
     * @param map
     */
    public View() {
        initComponents();
    }
    
    public void setGameCtr(GameCtr game){
        this.game = game;
    }
    
    
        public String getPictureOfCars(int index)
    {
        return this.map.carPicturePaths[index].substring(3);
    }
    
    
    private int[][] getNewCarPosition() {
        return this.map.carPositions;
    }

    private int[] getNewFrogPosition() {
        return this.map.frogPosition;
    }
    
    private int[] getWindowDimension() {
        return this.map.dimension;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        car1 = new javax.swing.JLabel();
        car2 = new javax.swing.JLabel();
        car3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/frog.png"))); // NOI18N

        car2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/car.png"))); // NOI18N

        car3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/car.png"))); // NOI18N

        jLabel2.setText("Level: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(car3)
                                .addGap(35, 35, 35)
                                .addComponent(car1)))
                        .addGap(32, 32, 32)
                        .addComponent(car2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(car1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(car2)
                                .addGap(160, 160, 160))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(car3)
                                .addGap(181, 181, 181))))))
        );

        pack();
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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new View().setVisible(true);
            }
        });
    }
    
    
    private String returnToGUI()
    {
        
        while(this.map == null)
        {
            return "car_right.png";
            
        }
        
        return "car_left.png";
    }
    
    @Override
    public void start() {        
        this.setVisible(true);
        int delay = 20;
        KeyListenerFrogMovement frogMovement = new KeyListenerFrogMovement();//Neues Keylistwn
        this.addKeyListener(frogMovement);
        this.frogMovement = frogMovement;
        this.frogMovement.setGameCtr(this.game);
        car1.setIcon(new javax.swing.ImageIcon(getClass().getResource((View.this.getPictureOfCars(0)))));
        car2.setIcon(new javax.swing.ImageIcon(getClass().getResource((View.this.getPictureOfCars(1)))));
        car3.setIcon(new javax.swing.ImageIcon(getClass().getResource((View.this.getPictureOfCars(2)))));
        
        
        ActionListener taskPerformer = new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
                jLabel2.setText("Level: " + Integer.toString(game.getLevel()));
                int x = map.carPositions[0][0];
                int y = map.carPositions[0][1];
                car1.setLocation(x, y);
                x = map.carPositions[1][0];
                y = map.carPositions[1][1];
                car2.setLocation(x, y);
                x = map.carPositions[2][0];
                y = map.carPositions[2][1];
                car3.setLocation(x, y);
                x = map.frogPosition[0];
                y = map.frogPosition[1];
                jLabel1.setLocation(x, y);
           }
        };
        Timer timer = new Timer(delay, taskPerformer);//ein timer wird erstellt mit dem defenierten delay, objekt taskperformer, dann wird action performed ausgeführt
        timer.setRepeats(true);//wiederholt fortlaufend
        timer.start();
        
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel car1;
    private javax.swing.JLabel car2;
    private javax.swing.JLabel car3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables


    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFrogPicturePath(String frogPicturePath) {
        this.frogPicturePath = frogPicturePath;
    }

    @Override
    public void setCarPicturePath(String carPicturePath) {
        this.carPicturePath = carPicturePath;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public void setMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
