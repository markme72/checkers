/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers.frames;

import checkers.controls.GameMenuControl;
import checkers.models.Game;
import javax.swing.JPanel;

/**
 *
 * @author
 * markearl
 */

public class GameFrame extends javax.swing.JFrame {
    private String currentMarker = null;
    private Game game = null;
    private GameMenuControl gameCommands = null;

    /**
     * Creates
     * new
     * form
     * GameFrame
     */
    public GameFrame(Game game) {
        this();
        this.game = game;
        this.gameCommands = new GameMenuControl(game);
    }
    
    public GameFrame(){
        this.initComponents();
        this.initializeFrame();
        setLocationRelativeTo(null);
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
        j00 = new javax.swing.JPanel();
        j03 = new javax.swing.JPanel();
        j02 = new javax.swing.JPanel();
        j01 = new javax.swing.JPanel();
        j04 = new javax.swing.JPanel();
        j05 = new javax.swing.JPanel();
        j06 = new javax.swing.JPanel();
        j07 = new javax.swing.JPanel();
        j12 = new javax.swing.JPanel();
        j11 = new javax.swing.JPanel();
        j10 = new javax.swing.JPanel();
        j13 = new javax.swing.JPanel();
        j17 = new javax.swing.JPanel();
        j16 = new javax.swing.JPanel();
        j14 = new javax.swing.JPanel();
        j15 = new javax.swing.JPanel();
        j30 = new javax.swing.JPanel();
        j23 = new javax.swing.JPanel();
        j33 = new javax.swing.JPanel();
        j22 = new javax.swing.JPanel();
        j32 = new javax.swing.JPanel();
        j21 = new javax.swing.JPanel();
        j31 = new javax.swing.JPanel();
        j24 = new javax.swing.JPanel();
        j34 = new javax.swing.JPanel();
        j35 = new javax.swing.JPanel();
        j37 = new javax.swing.JPanel();
        j36 = new javax.swing.JPanel();
        j20 = new javax.swing.JPanel();
        j25 = new javax.swing.JPanel();
        j27 = new javax.swing.JPanel();
        j26 = new javax.swing.JPanel();
        j50 = new javax.swing.JPanel();
        j53 = new javax.swing.JPanel();
        j52 = new javax.swing.JPanel();
        j51 = new javax.swing.JPanel();
        j54 = new javax.swing.JPanel();
        j55 = new javax.swing.JPanel();
        j57 = new javax.swing.JPanel();
        j56 = new javax.swing.JPanel();
        j66 = new javax.swing.JPanel();
        j67 = new javax.swing.JPanel();
        j60 = new javax.swing.JPanel();
        j65 = new javax.swing.JPanel();
        j77 = new javax.swing.JPanel();
        j76 = new javax.swing.JPanel();
        j47 = new javax.swing.JPanel();
        j46 = new javax.swing.JPanel();
        j62 = new javax.swing.JPanel();
        j43 = new javax.swing.JPanel();
        j72 = new javax.swing.JPanel();
        j42 = new javax.swing.JPanel();
        j61 = new javax.swing.JPanel();
        j41 = new javax.swing.JPanel();
        j71 = new javax.swing.JPanel();
        j44 = new javax.swing.JPanel();
        j64 = new javax.swing.JPanel();
        j74 = new javax.swing.JPanel();
        j75 = new javax.swing.JPanel();
        j40 = new javax.swing.JPanel();
        j45 = new javax.swing.JPanel();
        j70 = new javax.swing.JPanel();
        j73 = new javax.swing.JPanel();
        j63 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        j00.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j00Layout = new org.jdesktop.layout.GroupLayout(j00);
        j00.setLayout(j00Layout);
        j00Layout.setHorizontalGroup(
            j00Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j00Layout.setVerticalGroup(
            j00Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j03.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j03Layout = new org.jdesktop.layout.GroupLayout(j03);
        j03.setLayout(j03Layout);
        j03Layout.setHorizontalGroup(
            j03Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j03Layout.setVerticalGroup(
            j03Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j02.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j02Layout = new org.jdesktop.layout.GroupLayout(j02);
        j02.setLayout(j02Layout);
        j02Layout.setHorizontalGroup(
            j02Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j02Layout.setVerticalGroup(
            j02Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j01.setBackground(new java.awt.Color(175, 0, 0));
        j01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j01MouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout j01Layout = new org.jdesktop.layout.GroupLayout(j01);
        j01.setLayout(j01Layout);
        j01Layout.setHorizontalGroup(
            j01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j01Layout.setVerticalGroup(
            j01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j04.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j04Layout = new org.jdesktop.layout.GroupLayout(j04);
        j04.setLayout(j04Layout);
        j04Layout.setHorizontalGroup(
            j04Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j04Layout.setVerticalGroup(
            j04Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j05.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j05Layout = new org.jdesktop.layout.GroupLayout(j05);
        j05.setLayout(j05Layout);
        j05Layout.setHorizontalGroup(
            j05Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j05Layout.setVerticalGroup(
            j05Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j06.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j06Layout = new org.jdesktop.layout.GroupLayout(j06);
        j06.setLayout(j06Layout);
        j06Layout.setHorizontalGroup(
            j06Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j06Layout.setVerticalGroup(
            j06Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j07.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j07Layout = new org.jdesktop.layout.GroupLayout(j07);
        j07.setLayout(j07Layout);
        j07Layout.setHorizontalGroup(
            j07Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j07Layout.setVerticalGroup(
            j07Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j12.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j12Layout = new org.jdesktop.layout.GroupLayout(j12);
        j12.setLayout(j12Layout);
        j12Layout.setHorizontalGroup(
            j12Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j12Layout.setVerticalGroup(
            j12Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j11.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j11Layout = new org.jdesktop.layout.GroupLayout(j11);
        j11.setLayout(j11Layout);
        j11Layout.setHorizontalGroup(
            j11Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j11Layout.setVerticalGroup(
            j11Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j10.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j10Layout = new org.jdesktop.layout.GroupLayout(j10);
        j10.setLayout(j10Layout);
        j10Layout.setHorizontalGroup(
            j10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j10Layout.setVerticalGroup(
            j10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j13.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j13Layout = new org.jdesktop.layout.GroupLayout(j13);
        j13.setLayout(j13Layout);
        j13Layout.setHorizontalGroup(
            j13Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j13Layout.setVerticalGroup(
            j13Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j17.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j17Layout = new org.jdesktop.layout.GroupLayout(j17);
        j17.setLayout(j17Layout);
        j17Layout.setHorizontalGroup(
            j17Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j17Layout.setVerticalGroup(
            j17Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j16.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j16Layout = new org.jdesktop.layout.GroupLayout(j16);
        j16.setLayout(j16Layout);
        j16Layout.setHorizontalGroup(
            j16Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j16Layout.setVerticalGroup(
            j16Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j14.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j14Layout = new org.jdesktop.layout.GroupLayout(j14);
        j14.setLayout(j14Layout);
        j14Layout.setHorizontalGroup(
            j14Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j14Layout.setVerticalGroup(
            j14Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j15.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j15Layout = new org.jdesktop.layout.GroupLayout(j15);
        j15.setLayout(j15Layout);
        j15Layout.setHorizontalGroup(
            j15Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j15Layout.setVerticalGroup(
            j15Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j30.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j30Layout = new org.jdesktop.layout.GroupLayout(j30);
        j30.setLayout(j30Layout);
        j30Layout.setHorizontalGroup(
            j30Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j30Layout.setVerticalGroup(
            j30Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j23.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j23Layout = new org.jdesktop.layout.GroupLayout(j23);
        j23.setLayout(j23Layout);
        j23Layout.setHorizontalGroup(
            j23Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j23Layout.setVerticalGroup(
            j23Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j33.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j33Layout = new org.jdesktop.layout.GroupLayout(j33);
        j33.setLayout(j33Layout);
        j33Layout.setHorizontalGroup(
            j33Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j33Layout.setVerticalGroup(
            j33Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j22.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j22Layout = new org.jdesktop.layout.GroupLayout(j22);
        j22.setLayout(j22Layout);
        j22Layout.setHorizontalGroup(
            j22Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j22Layout.setVerticalGroup(
            j22Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j32.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j32Layout = new org.jdesktop.layout.GroupLayout(j32);
        j32.setLayout(j32Layout);
        j32Layout.setHorizontalGroup(
            j32Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j32Layout.setVerticalGroup(
            j32Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j21.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j21Layout = new org.jdesktop.layout.GroupLayout(j21);
        j21.setLayout(j21Layout);
        j21Layout.setHorizontalGroup(
            j21Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j21Layout.setVerticalGroup(
            j21Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j31.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j31Layout = new org.jdesktop.layout.GroupLayout(j31);
        j31.setLayout(j31Layout);
        j31Layout.setHorizontalGroup(
            j31Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j31Layout.setVerticalGroup(
            j31Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j24.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j24Layout = new org.jdesktop.layout.GroupLayout(j24);
        j24.setLayout(j24Layout);
        j24Layout.setHorizontalGroup(
            j24Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j24Layout.setVerticalGroup(
            j24Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j34.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j34Layout = new org.jdesktop.layout.GroupLayout(j34);
        j34.setLayout(j34Layout);
        j34Layout.setHorizontalGroup(
            j34Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j34Layout.setVerticalGroup(
            j34Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j35.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j35Layout = new org.jdesktop.layout.GroupLayout(j35);
        j35.setLayout(j35Layout);
        j35Layout.setHorizontalGroup(
            j35Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j35Layout.setVerticalGroup(
            j35Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j37.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j37Layout = new org.jdesktop.layout.GroupLayout(j37);
        j37.setLayout(j37Layout);
        j37Layout.setHorizontalGroup(
            j37Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j37Layout.setVerticalGroup(
            j37Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j36.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j36Layout = new org.jdesktop.layout.GroupLayout(j36);
        j36.setLayout(j36Layout);
        j36Layout.setHorizontalGroup(
            j36Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j36Layout.setVerticalGroup(
            j36Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j20.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j20Layout = new org.jdesktop.layout.GroupLayout(j20);
        j20.setLayout(j20Layout);
        j20Layout.setHorizontalGroup(
            j20Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j20Layout.setVerticalGroup(
            j20Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j25.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j25Layout = new org.jdesktop.layout.GroupLayout(j25);
        j25.setLayout(j25Layout);
        j25Layout.setHorizontalGroup(
            j25Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j25Layout.setVerticalGroup(
            j25Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j27.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j27Layout = new org.jdesktop.layout.GroupLayout(j27);
        j27.setLayout(j27Layout);
        j27Layout.setHorizontalGroup(
            j27Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j27Layout.setVerticalGroup(
            j27Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j26.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j26Layout = new org.jdesktop.layout.GroupLayout(j26);
        j26.setLayout(j26Layout);
        j26Layout.setHorizontalGroup(
            j26Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j26Layout.setVerticalGroup(
            j26Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j50.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j50Layout = new org.jdesktop.layout.GroupLayout(j50);
        j50.setLayout(j50Layout);
        j50Layout.setHorizontalGroup(
            j50Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j50Layout.setVerticalGroup(
            j50Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j53.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j53Layout = new org.jdesktop.layout.GroupLayout(j53);
        j53.setLayout(j53Layout);
        j53Layout.setHorizontalGroup(
            j53Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j53Layout.setVerticalGroup(
            j53Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j52.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j52Layout = new org.jdesktop.layout.GroupLayout(j52);
        j52.setLayout(j52Layout);
        j52Layout.setHorizontalGroup(
            j52Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j52Layout.setVerticalGroup(
            j52Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j51.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j51Layout = new org.jdesktop.layout.GroupLayout(j51);
        j51.setLayout(j51Layout);
        j51Layout.setHorizontalGroup(
            j51Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j51Layout.setVerticalGroup(
            j51Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j54.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j54Layout = new org.jdesktop.layout.GroupLayout(j54);
        j54.setLayout(j54Layout);
        j54Layout.setHorizontalGroup(
            j54Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j54Layout.setVerticalGroup(
            j54Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j55.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j55Layout = new org.jdesktop.layout.GroupLayout(j55);
        j55.setLayout(j55Layout);
        j55Layout.setHorizontalGroup(
            j55Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j55Layout.setVerticalGroup(
            j55Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j57.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j57Layout = new org.jdesktop.layout.GroupLayout(j57);
        j57.setLayout(j57Layout);
        j57Layout.setHorizontalGroup(
            j57Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j57Layout.setVerticalGroup(
            j57Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j56.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j56Layout = new org.jdesktop.layout.GroupLayout(j56);
        j56.setLayout(j56Layout);
        j56Layout.setHorizontalGroup(
            j56Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j56Layout.setVerticalGroup(
            j56Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j66.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j66Layout = new org.jdesktop.layout.GroupLayout(j66);
        j66.setLayout(j66Layout);
        j66Layout.setHorizontalGroup(
            j66Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j66Layout.setVerticalGroup(
            j66Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j67.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j67Layout = new org.jdesktop.layout.GroupLayout(j67);
        j67.setLayout(j67Layout);
        j67Layout.setHorizontalGroup(
            j67Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j67Layout.setVerticalGroup(
            j67Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j60.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j60Layout = new org.jdesktop.layout.GroupLayout(j60);
        j60.setLayout(j60Layout);
        j60Layout.setHorizontalGroup(
            j60Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j60Layout.setVerticalGroup(
            j60Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j65.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j65Layout = new org.jdesktop.layout.GroupLayout(j65);
        j65.setLayout(j65Layout);
        j65Layout.setHorizontalGroup(
            j65Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j65Layout.setVerticalGroup(
            j65Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j77.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j77Layout = new org.jdesktop.layout.GroupLayout(j77);
        j77.setLayout(j77Layout);
        j77Layout.setHorizontalGroup(
            j77Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j77Layout.setVerticalGroup(
            j77Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j76.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j76Layout = new org.jdesktop.layout.GroupLayout(j76);
        j76.setLayout(j76Layout);
        j76Layout.setHorizontalGroup(
            j76Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j76Layout.setVerticalGroup(
            j76Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j47.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j47Layout = new org.jdesktop.layout.GroupLayout(j47);
        j47.setLayout(j47Layout);
        j47Layout.setHorizontalGroup(
            j47Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j47Layout.setVerticalGroup(
            j47Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j46.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j46Layout = new org.jdesktop.layout.GroupLayout(j46);
        j46.setLayout(j46Layout);
        j46Layout.setHorizontalGroup(
            j46Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j46Layout.setVerticalGroup(
            j46Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j62.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j62Layout = new org.jdesktop.layout.GroupLayout(j62);
        j62.setLayout(j62Layout);
        j62Layout.setHorizontalGroup(
            j62Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j62Layout.setVerticalGroup(
            j62Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j43.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j43Layout = new org.jdesktop.layout.GroupLayout(j43);
        j43.setLayout(j43Layout);
        j43Layout.setHorizontalGroup(
            j43Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j43Layout.setVerticalGroup(
            j43Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j72.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j72Layout = new org.jdesktop.layout.GroupLayout(j72);
        j72.setLayout(j72Layout);
        j72Layout.setHorizontalGroup(
            j72Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j72Layout.setVerticalGroup(
            j72Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j42.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j42Layout = new org.jdesktop.layout.GroupLayout(j42);
        j42.setLayout(j42Layout);
        j42Layout.setHorizontalGroup(
            j42Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j42Layout.setVerticalGroup(
            j42Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j61.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j61Layout = new org.jdesktop.layout.GroupLayout(j61);
        j61.setLayout(j61Layout);
        j61Layout.setHorizontalGroup(
            j61Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j61Layout.setVerticalGroup(
            j61Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j41.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j41Layout = new org.jdesktop.layout.GroupLayout(j41);
        j41.setLayout(j41Layout);
        j41Layout.setHorizontalGroup(
            j41Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j41Layout.setVerticalGroup(
            j41Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j71.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j71Layout = new org.jdesktop.layout.GroupLayout(j71);
        j71.setLayout(j71Layout);
        j71Layout.setHorizontalGroup(
            j71Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j71Layout.setVerticalGroup(
            j71Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j44.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j44Layout = new org.jdesktop.layout.GroupLayout(j44);
        j44.setLayout(j44Layout);
        j44Layout.setHorizontalGroup(
            j44Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j44Layout.setVerticalGroup(
            j44Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j64.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j64Layout = new org.jdesktop.layout.GroupLayout(j64);
        j64.setLayout(j64Layout);
        j64Layout.setHorizontalGroup(
            j64Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j64Layout.setVerticalGroup(
            j64Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j74.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j74Layout = new org.jdesktop.layout.GroupLayout(j74);
        j74.setLayout(j74Layout);
        j74Layout.setHorizontalGroup(
            j74Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j74Layout.setVerticalGroup(
            j74Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j75.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j75Layout = new org.jdesktop.layout.GroupLayout(j75);
        j75.setLayout(j75Layout);
        j75Layout.setHorizontalGroup(
            j75Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j75Layout.setVerticalGroup(
            j75Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j40.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j40Layout = new org.jdesktop.layout.GroupLayout(j40);
        j40.setLayout(j40Layout);
        j40Layout.setHorizontalGroup(
            j40Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j40Layout.setVerticalGroup(
            j40Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j45.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j45Layout = new org.jdesktop.layout.GroupLayout(j45);
        j45.setLayout(j45Layout);
        j45Layout.setHorizontalGroup(
            j45Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j45Layout.setVerticalGroup(
            j45Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j70.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j70Layout = new org.jdesktop.layout.GroupLayout(j70);
        j70.setLayout(j70Layout);
        j70Layout.setHorizontalGroup(
            j70Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j70Layout.setVerticalGroup(
            j70Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j73.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout j73Layout = new org.jdesktop.layout.GroupLayout(j73);
        j73.setLayout(j73Layout);
        j73Layout.setHorizontalGroup(
            j73Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j73Layout.setVerticalGroup(
            j73Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        j63.setBackground(new java.awt.Color(175, 0, 0));

        org.jdesktop.layout.GroupLayout j63Layout = new org.jdesktop.layout.GroupLayout(j63);
        j63.setLayout(j63Layout);
        j63Layout.setHorizontalGroup(
            j63Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );
        j63Layout.setVerticalGroup(
            j63Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Checkers Game");

        jButton1.setText("Start New Game");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Help");

        jButton3.setText("Quit");

        jTextArea1.setColumns(10);
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("");
        jScrollPane1.setViewportView(jTextArea1);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(j50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(6, 6, 6)
                        .add(j57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(j10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(6, 6, 6)
                        .add(j17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(j00, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j01, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j02, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j03, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j04, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j05, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j06, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(6, 6, 6)
                        .add(j07, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jLabel1)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(j60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(6, 6, 6)
                        .add(j67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(j40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(6, 6, 6)
                        .add(j47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(j70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(6, 6, 6)
                        .add(j77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(j30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(6, 6, 6)
                        .add(j37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(j20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(j26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(6, 6, 6)
                        .add(j27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                        .add(jButton1)
                        .add(jButton2)
                        .add(jButton3))
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 141, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(j05, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j06, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j07, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j04, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j01, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j02, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j03, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j00, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(j14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(j25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(j34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(j45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(j54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(j65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(j74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jButton1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jScrollPane1)))
                .add(0, 12, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.gameCommands.startNewGame(this.boardLocationsView);
    }//GEN-LAST:event_jButton1MouseClicked

    private void j01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j01MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_j01MouseClicked

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
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel j00;
    private javax.swing.JPanel j01;
    private javax.swing.JPanel j02;
    private javax.swing.JPanel j03;
    private javax.swing.JPanel j04;
    private javax.swing.JPanel j05;
    private javax.swing.JPanel j06;
    private javax.swing.JPanel j07;
    private javax.swing.JPanel j10;
    private javax.swing.JPanel j11;
    private javax.swing.JPanel j12;
    private javax.swing.JPanel j13;
    private javax.swing.JPanel j14;
    private javax.swing.JPanel j15;
    private javax.swing.JPanel j16;
    private javax.swing.JPanel j17;
    private javax.swing.JPanel j20;
    private javax.swing.JPanel j21;
    private javax.swing.JPanel j22;
    private javax.swing.JPanel j23;
    private javax.swing.JPanel j24;
    private javax.swing.JPanel j25;
    private javax.swing.JPanel j26;
    private javax.swing.JPanel j27;
    private javax.swing.JPanel j30;
    private javax.swing.JPanel j31;
    private javax.swing.JPanel j32;
    private javax.swing.JPanel j33;
    private javax.swing.JPanel j34;
    private javax.swing.JPanel j35;
    private javax.swing.JPanel j36;
    private javax.swing.JPanel j37;
    private javax.swing.JPanel j40;
    private javax.swing.JPanel j41;
    private javax.swing.JPanel j42;
    private javax.swing.JPanel j43;
    private javax.swing.JPanel j44;
    private javax.swing.JPanel j45;
    private javax.swing.JPanel j46;
    private javax.swing.JPanel j47;
    private javax.swing.JPanel j50;
    private javax.swing.JPanel j51;
    private javax.swing.JPanel j52;
    private javax.swing.JPanel j53;
    private javax.swing.JPanel j54;
    private javax.swing.JPanel j55;
    private javax.swing.JPanel j56;
    private javax.swing.JPanel j57;
    private javax.swing.JPanel j60;
    private javax.swing.JPanel j61;
    private javax.swing.JPanel j62;
    private javax.swing.JPanel j63;
    private javax.swing.JPanel j64;
    private javax.swing.JPanel j65;
    private javax.swing.JPanel j66;
    private javax.swing.JPanel j67;
    private javax.swing.JPanel j70;
    private javax.swing.JPanel j71;
    private javax.swing.JPanel j72;
    private javax.swing.JPanel j73;
    private javax.swing.JPanel j74;
    private javax.swing.JPanel j75;
    private javax.swing.JPanel j76;
    private javax.swing.JPanel j77;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private javax.swing.JPanel[][] boardLocationsView = {{j00, j01, j02, j03, j04, j05, j06, j07},
                                                        {j10, j11, j12, j13, j14, j15, j16, j17},
                                                        {j20, j21, j22, j23, j24, j25, j26, j27,},
                                                        {j30, j31, j32, j33, j34, j35, j36, j37,},
                                                        {j40, j41, j42, j43, j44, j45, j46, j47,},
                                                        {j50, j51, j52, j53, j54, j55, j56, j57,},
                                                        {j60, j61, j62, j63, j64, j65, j66, j67,},
                                                        {j70, j71, j72, j73, j74, j75, j76, j77,}};

    public JPanel[][] getBoardLocationsView() {
        return boardLocationsView;
    }

    public void setBoardLocationsView(JPanel[][] boardLocationsView) {
        this.boardLocationsView = boardLocationsView;
    }
    
    private void initializeFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
