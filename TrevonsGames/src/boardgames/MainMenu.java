/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgames;
import boardgames.pegSolitaire.*;
import boardgames.Gomoku.*;
import boardgames.BattleShip.*;
import boardgames.checkers.*;
import boardgames.Mancala.*;
import boardgames.connectfour.*;
import boardgames.tictactoe.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author Tom
 */
public class MainMenu extends javax.swing.JPanel {

    /**
     * Creates new form Test_GUI
     */
    public MainMenu() {

        initComponents();
    }
    
    byte[] get_ip_array(String ip_box_str)
    {
        //return new byte[] {127,0,0,1};
        try
        {
            ArrayList<Integer> ip = new ArrayList<>();
            String temp_s = "";
            for(int i = 0; i<ip_box_str.length(); i++)
            {
                if(ip_box_str.charAt(i) == '.')
                {
                    ip.add(Integer.parseInt(temp_s));
                    temp_s = "";
                }
                else
                {
                    temp_s += ip_box_str.charAt(i);
                }
            }
            ip.add(Integer.parseInt(temp_s));
            if(ip.size() != 3)
            {
                throw new NumberFormatException();
            }
            return new byte[] {(byte)ip.get(0).intValue(),(byte)ip.get(1).intValue(),(byte)ip.get(2).intValue(),(byte)ip.get(3).intValue()}; 
    
        }
        catch(NumberFormatException n)
        {
            System.err.println("Invalid IPv4 Address");
            final JFrame quit_window = new JFrame("Invalid IPv4 Address");
            JButton accept = new JButton("OK");
            accept.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    quit_window.dispose();
                }
            });
            quit_window.add(accept);
            quit_window.setLocation(300, 300);
            quit_window.setSize(400, 200);
            quit_window.setVisible(true);
            return null;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        server_button = new javax.swing.JButton();
        ip_input_box = new javax.swing.JTextField();
        locally_radiob = new javax.swing.JRadioButton();
        online_radiob = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Peg Solitaire");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solitaireClicked(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 80));

        jButton2.setText("Connect 4");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectFourClicked(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 150, 80));

        jButton3.setText("Checkers");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckersClicked(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, 80));

        jButton4.setText("Gomoku");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GomokuClicked(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, 80));

        jButton5.setText("Mancala");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MancalaClicked(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, 80));

        jButton6.setText("Battleship");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BattleshipClicked(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 150, 80));

        server_button.setText("Server");
        server_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverClicked(evt);
            }
        });
        add(server_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        ip_input_box.setText("Server IP here");
        ip_input_box.setEnabled(false);
        ip_input_box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serverIpBoxClicked(evt);
            }
        });
        add(ip_input_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 81, -1));

        buttonGroup1.add(locally_radiob);
        locally_radiob.setSelected(true);
        locally_radiob.setText("Play Locally");
        locally_radiob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                local_radioClicked(evt);
            }
        });
        add(locally_radiob, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        buttonGroup1.add(online_radiob);
        online_radiob.setText("Play Online");
        online_radiob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                online_radioClicked(evt);
            }
        });
        add(online_radiob, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        jButton7.setText("TicTacToe");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tictactoe_clicked(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 80, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void solitaireClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solitaireClicked
        // TODO add your handling code here:
        if(locally_radiob.isSelected())  //local play
        {
            java.awt.EventQueue.invokeLater(new Runnable() 
            {
                @Override
                public void run() 
                {
                    SolitaireGui game = new SolitaireGui(false, new byte[] {}); //2 params, whether or not it's online and the ip addr
                    game.setVisible(true);
                    game.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
            });
        }
        else //online play
        {
            java.awt.EventQueue.invokeLater(new Runnable() 
            {
                @Override
                public void run() 
                {
                    final SolitaireGui game = new SolitaireGui(true, get_ip_array(ip_input_box.getText()));
                    game.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    
                    class Waiting_handler implements Runnable
                    {
                        @Override
                        public void run()
                        {
                            
                            if(game.myTurn)
                            {
                                game.waitForOpponent_host();// put in thread
                                game.wait_window.dispose();
                                if(game.iquit)
                                {
                                    return;
                                }
                                game.setVisible(true);//put in thread
                            }
                            else
                            {
                                game.waitForOpponent_nothost();// put in thread
                                game.wait_window.dispose();
                                game.paintAll(game.getGraphics()); //makes sure to draw the board before triggering the block
                                game.setVisible(true);//put in thread
                                System.out.println("waiting for opponents first move");
                                game.waitForMove();
                            }
                        }
                    }
                    Thread t = new Thread(new Waiting_handler());
                    t.start();
                }
            });
        }
    }//GEN-LAST:event_solitaireClicked

    
    private void ConnectFourClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectFourClicked
        // TODO add your handling code here:
        ConnectFourGUIPanel g = new ConnectFourGUIPanel();
        g.playConnect();
    }//GEN-LAST:event_ConnectFourClicked

    private void CheckersClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckersClicked
        // TODO add your handling code here:
        make_pretty();
        CheckersGUI g = new CheckersGUI();
        g.setVisible(true);
    }//GEN-LAST:event_CheckersClicked

    private void GomokuClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GomokuClicked
        GomokuGUI g = new GomokuGUI();
        g.playGame(); //if statement "unclicks" gomoku when game is over
    }//GEN-LAST:event_GomokuClicked

    private void MancalaClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MancalaClicked

        if(locally_radiob.isSelected()) {
            MancalaDialog d = new MancalaDialog();
        }
    }//GEN-LAST:event_MancalaClicked

    private void BattleshipClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BattleshipClicked
        // TODO add your handling code here:
        BattleShipGUI b = new BattleShipGUI();
        b.playGame();
    }//GEN-LAST:event_BattleshipClicked

    private void serverClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverClicked
        // TODO add your handling code here:
        server_button.setEnabled(false);
        
        Server s = new Server();
        s.start(this);
    }//GEN-LAST:event_serverClicked

    private void serverIpBoxClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serverIpBoxClicked
        // TODO add your handling code here:
        JTextField t = (JTextField)evt.getComponent();
        t.setText("");
    }//GEN-LAST:event_serverIpBoxClicked

    private void online_radioClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_online_radioClicked
        // TODO add your handling code here:
        ip_input_box.setEnabled(true);
        ip_input_box.requestFocusInWindow();
        ip_input_box.setText("");
    }//GEN-LAST:event_online_radioClicked

    private void local_radioClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_local_radioClicked
        // TODO add your handling code here:
        ip_input_box.setEnabled(false);
        ip_input_box.setText("Server IP here");
    }//GEN-LAST:event_local_radioClicked

    private void tictactoe_clicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tictactoe_clicked
        // TODO add your handling code here:
        if(locally_radiob.isSelected())  //local play
        {
            java.awt.EventQueue.invokeLater(new Runnable() 
            {
                @Override
                public void run() 
                {
                    TicTacToeGui game = new TicTacToeGui(false, new byte[] {}); //2 params, whether or not it's online and the ip addr
                    game.setVisible(true);
                    game.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
            });
        }
        else //online play
        {
            java.awt.EventQueue.invokeLater(new Runnable() 
            {
                @Override
                public void run() 
                {
                    final TicTacToeGui game = new TicTacToeGui(true, get_ip_array(ip_input_box.getText()));
                    game.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    
                    class Waiting_handler implements Runnable
                    {
                        @Override
                        public void run()
                        {
                            
                            if(game.myTurn)
                            {
                                game.waitForOpponent_host();// put in thread
                                game.wait_window.dispose();
                                if(game.iquit)
                                {
                                    return;
                                }
                                game.setVisible(true);//put in thread
                            }
                            else
                            {
                                game.waitForOpponent_nothost();// put in thread
                                game.wait_window.dispose();
                                game.paintAll(game.getGraphics()); //makes sure to draw the board before triggering the block
                                game.setVisible(true);//put in thread
                                System.out.println("waiting for opponents first move");
                                game.waitForMove();
                            }
                        }
                    }
                    Thread t = new Thread(new Waiting_handler());
                    t.start();
                }
            });
        }
    }//GEN-LAST:event_tictactoe_clicked

    private void make_pretty()
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CheckersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField ip_input_box;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JRadioButton locally_radiob;
    private javax.swing.JRadioButton online_radiob;
    private javax.swing.JButton server_button;
    // End of variables declaration//GEN-END:variables
}
