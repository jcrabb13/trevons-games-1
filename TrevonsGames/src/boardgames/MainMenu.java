/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgames;
import boardgames.pegSolitaire.*;
import boardgames.Gomoku.*;
import boardgames.BattleShip.*;
import boardgames.checkers.*;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Tom
 */
public class MainMenu extends javax.swing.JPanel {

    /**
     * Creates new form Test_GUI
     */
    
    SolitaireGuiPanel pegGui;
    ClientPanel client;
    ServerPanel server;
    JFrame gameFrame;
    
    public MainMenu() {
        initComponents();
        
        pegGui = new SolitaireGuiPanel();
        
        
        gameFrame = new JFrame("GUI2");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        jButton1.setText("Peg Solitaire");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solitaireClicked(evt);
            }
        });

        jButton2.setText("Connect 4");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectFourClicked(evt);
            }
        });

        jButton3.setText("Checkers");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckersClicked(evt);
            }
        });

        jButton4.setText("Gomoku");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GomokuClicked(evt);
            }
        });

        jButton5.setText("Mancala");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MancalaClicked(evt);
            }
        });

        jButton6.setText("Battleship");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BattleshipClicked(evt);
            }
        });

        jButton7.setText("server");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverClicked(evt);
            }
        });

        jButton8.setText("client");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void solitaireClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solitaireClicked
        // TODO add your handling code here:
        
        /*SolitaireGui gui = new SolitaireGui();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel textLabel= new JLabel("Label56",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300,100));
        gui.getContentPane().add(textLabel,BorderLayout.CENTER);

        gui.setLocationRelativeTo(null);
        gui.pack();
        gui.setVisible(true);
        */
        
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel textLabel= new JLabel("Label56",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300,100));
        gameFrame.getContentPane().add(textLabel,BorderLayout.CENTER);
        
        gameFrame.add((pegGui));
        
        gameFrame.setLocationRelativeTo(null);
        gameFrame.pack();
        gameFrame.setVisible(true);
        
        SolitaireGame g = new SolitaireGame();
        g.initGame();
        
    }//GEN-LAST:event_solitaireClicked

    private void ConnectFourClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectFourClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ConnectFourClicked

    private void CheckersClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckersClicked
        // TODO add your handling code here:
        CheckersGame g = new CheckersGame();
        g.initCheckers();
    }//GEN-LAST:event_CheckersClicked

    private void GomokuClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GomokuClicked
        Gomoku g = new Gomoku();
        
        g.initGomoku();
    }//GEN-LAST:event_GomokuClicked

    private void MancalaClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MancalaClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MancalaClicked

    private void BattleshipClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BattleshipClicked
        // TODO add your handling code here:
        BattleShipGUI b = new BattleShipGUI();
        b.playGame();
    }//GEN-LAST:event_BattleshipClicked

    private void clientClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientClicked
        // TODO add your handling code here:
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel textLabel= new JLabel("Label56",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300,100));
        gameFrame.getContentPane().add(textLabel,BorderLayout.CENTER);
        
        client = new ClientPanel();
        gameFrame.add((client));
        
        gameFrame.setLocationRelativeTo(null);
        gameFrame.pack();
        gameFrame.setVisible(true);
        
        SolitaireGame g = new SolitaireGame();
        g.initGame();
    }//GEN-LAST:event_clientClicked

    private void serverClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverClicked
        // TODO add your handling code here:
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel textLabel= new JLabel("Label56",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300,100));
        gameFrame.getContentPane().add(textLabel,BorderLayout.CENTER);
        
        server = new ServerPanel();
        gameFrame.add((server));
        
        gameFrame.setLocationRelativeTo(null);
        gameFrame.pack();
        gameFrame.setVisible(true);
        
        SolitaireGame g = new SolitaireGame();
        g.initGame();
    }//GEN-LAST:event_serverClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    // End of variables declaration//GEN-END:variables
}