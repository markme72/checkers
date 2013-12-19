/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers.frames;

import checkers.controls.GameMenuControl;
import checkers.exceptions.GameException;
import checkers.menus.Location;
import checkers.models.Game;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author
 * Mark Earl & Ryan Plumb
 */

public class GameFrame extends javax.swing.JFrame {
    private String currentMarker = null;
    private Game game = null;
    private GameMenuControl gameCommands = null;
    private JPanel[][] boardLocationsView = null;
    private JLabel[][] markerLocationsView = null;
    private Point coordinate = new Point();
    private String gameStatus = "";
    private Location location = new Location();
    private boolean move = false;
    private Point markerLocation = new Point();
    
    /**
     * Creates
     * new
     * form
     * GameFrame
     */
    public GameFrame(Game game) {
        this.initComponents();
        setLocationRelativeTo(null);
        this.game = game;
        this.gameCommands = new GameMenuControl(this.game);
        JPanel[][] boardLocationsView = {{j00, j01, j02, j03, j04, j05, j06, j07},
                                                        {j10, j11, j12, j13, j14, j15, j16, j17},
                                                        {j20, j21, j22, j23, j24, j25, j26, j27,},
                                                        {j30, j31, j32, j33, j34, j35, j36, j37,},
                                                        {j40, j41, j42, j43, j44, j45, j46, j47,},
                                                        {j50, j51, j52, j53, j54, j55, j56, j57,},
                                                        {j60, j61, j62, j63, j64, j65, j66, j67,},
                                                        {j70, j71, j72, j73, j74, j75, j76, j77,}};
    
        JLabel[][] markerLocationsView= {{null,jLabel01,null,jLabel03,null,jLabel05,null,jLabel07},
                                         {jLabel10,null,jLabel12,null,jLabel14,null,jLabel16,null},
                                         {null,jLabel21,null,jLabel23,null,jLabel25,null,jLabel27},
                                         {jLabel30,null,jLabel32,null,jLabel34,null,jLabel36,null},
                                         {null,jLabel41,null,jLabel43,null,jLabel45,null,jLabel47},
                                         {jLabel50,null,jLabel52,null,jLabel54,null,jLabel56,null},
                                         {null,jLabel61,null,jLabel63,null,jLabel65,null,jLabel67},
                                         {jLabel71,null,jLabel72,null,jLabel74,null,jLabel76,null}};
        
        this.boardLocationsView = boardLocationsView;
        this.markerLocationsView = markerLocationsView;
    }

    public GameFrame() {
        this.initComponents();
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        j00 = new javax.swing.JPanel();
        j03 = new javax.swing.JPanel();
        jLabel03 = new javax.swing.JLabel();
        j02 = new javax.swing.JPanel();
        j01 = new javax.swing.JPanel();
        jLabel01 = new javax.swing.JLabel();
        j04 = new javax.swing.JPanel();
        j05 = new javax.swing.JPanel();
        jLabel05 = new javax.swing.JLabel();
        j06 = new javax.swing.JPanel();
        j07 = new javax.swing.JPanel();
        jLabel07 = new javax.swing.JLabel();
        j12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        j11 = new javax.swing.JPanel();
        j10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        j13 = new javax.swing.JPanel();
        j17 = new javax.swing.JPanel();
        j16 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        j14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        j15 = new javax.swing.JPanel();
        j30 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        j23 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        j33 = new javax.swing.JPanel();
        j22 = new javax.swing.JPanel();
        j32 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        j21 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        j31 = new javax.swing.JPanel();
        j24 = new javax.swing.JPanel();
        j34 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        j35 = new javax.swing.JPanel();
        j37 = new javax.swing.JPanel();
        j36 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        j20 = new javax.swing.JPanel();
        j25 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        j27 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        j26 = new javax.swing.JPanel();
        j50 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        j53 = new javax.swing.JPanel();
        j52 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        j51 = new javax.swing.JPanel();
        j54 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        j55 = new javax.swing.JPanel();
        j57 = new javax.swing.JPanel();
        j56 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        j66 = new javax.swing.JPanel();
        j67 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        j60 = new javax.swing.JPanel();
        j65 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        j77 = new javax.swing.JPanel();
        j76 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        j47 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        j46 = new javax.swing.JPanel();
        j62 = new javax.swing.JPanel();
        j43 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        j72 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        j42 = new javax.swing.JPanel();
        j61 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        j41 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        j71 = new javax.swing.JPanel();
        j44 = new javax.swing.JPanel();
        j64 = new javax.swing.JPanel();
        j74 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        j75 = new javax.swing.JPanel();
        j40 = new javax.swing.JPanel();
        j45 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        j70 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        j73 = new javax.swing.JPanel();
        j63 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jStartNewGame = new javax.swing.JButton();
        jHelp = new javax.swing.JButton();
        jQuit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        j00.setBackground(new java.awt.Color(102, 102, 102));
        j00.setMaximumSize(new java.awt.Dimension(75, 75));
        j00.setMinimumSize(new java.awt.Dimension(75, 75));
        j00.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j03.setMaximumSize(new java.awt.Dimension(75, 75));
        j03.setMinimumSize(new java.awt.Dimension(75, 75));
        j03.setPreferredSize(new java.awt.Dimension(75, 75));
        j03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j03MouseClicked(evt);
            }
        });

        jLabel03.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel03.setText("  ");
        jLabel03.setIconTextGap(0);
        jLabel03.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel03.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel03.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j03Layout = new org.jdesktop.layout.GroupLayout(j03);
        j03.setLayout(j03Layout);
        j03Layout.setHorizontalGroup(
            j03Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j03Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel03, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j03Layout.setVerticalGroup(
            j03Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j03Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel03, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j02.setBackground(new java.awt.Color(102, 102, 102));
        j02.setMaximumSize(new java.awt.Dimension(75, 75));
        j02.setMinimumSize(new java.awt.Dimension(75, 75));
        j02.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j01.setMaximumSize(new java.awt.Dimension(75, 75));
        j01.setMinimumSize(new java.awt.Dimension(75, 75));
        j01.setPreferredSize(new java.awt.Dimension(75, 75));
        j01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j01MouseClicked(evt);
            }
        });

        jLabel01.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel01.setText("  ");
        jLabel01.setIconTextGap(0);
        jLabel01.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel01.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel01.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j01Layout = new org.jdesktop.layout.GroupLayout(j01);
        j01.setLayout(j01Layout);
        j01Layout.setHorizontalGroup(
            j01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j01Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel01, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j01Layout.setVerticalGroup(
            j01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j01Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel01, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j04.setBackground(new java.awt.Color(102, 102, 102));
        j04.setMaximumSize(new java.awt.Dimension(75, 75));
        j04.setMinimumSize(new java.awt.Dimension(75, 75));
        j04.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j05.setMaximumSize(new java.awt.Dimension(75, 75));
        j05.setMinimumSize(new java.awt.Dimension(75, 75));
        j05.setPreferredSize(new java.awt.Dimension(75, 75));
        j05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j05MouseClicked(evt);
            }
        });

        jLabel05.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel05.setText("  ");
        jLabel05.setIconTextGap(0);
        jLabel05.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel05.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel05.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j05Layout = new org.jdesktop.layout.GroupLayout(j05);
        j05.setLayout(j05Layout);
        j05Layout.setHorizontalGroup(
            j05Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j05Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel05, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j05Layout.setVerticalGroup(
            j05Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j05Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel05, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j06.setBackground(new java.awt.Color(102, 102, 102));
        j06.setMaximumSize(new java.awt.Dimension(75, 75));
        j06.setMinimumSize(new java.awt.Dimension(75, 75));
        j06.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j07.setMaximumSize(new java.awt.Dimension(75, 75));
        j07.setMinimumSize(new java.awt.Dimension(75, 75));
        j07.setPreferredSize(new java.awt.Dimension(75, 75));
        j07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j07MouseClicked(evt);
            }
        });

        jLabel07.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel07.setText("  ");
        jLabel07.setIconTextGap(0);
        jLabel07.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel07.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel07.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j07Layout = new org.jdesktop.layout.GroupLayout(j07);
        j07.setLayout(j07Layout);
        j07Layout.setHorizontalGroup(
            j07Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j07Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel07, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j07Layout.setVerticalGroup(
            j07Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j07Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .add(jLabel07, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j12.setBackground(new java.awt.Color(175, 0, 0));
        j12.setMaximumSize(new java.awt.Dimension(75, 75));
        j12.setMinimumSize(new java.awt.Dimension(75, 75));
        j12.setPreferredSize(new java.awt.Dimension(75, 75));
        j12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j12MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("  ");
        jLabel12.setIconTextGap(0);
        jLabel12.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel12.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel12.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j12Layout = new org.jdesktop.layout.GroupLayout(j12);
        j12.setLayout(j12Layout);
        j12Layout.setHorizontalGroup(
            j12Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j12Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j12Layout.setVerticalGroup(
            j12Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j12Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j11.setBackground(new java.awt.Color(102, 102, 102));
        j11.setMaximumSize(new java.awt.Dimension(75, 75));
        j11.setMinimumSize(new java.awt.Dimension(75, 75));
        j11.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j10.setMaximumSize(new java.awt.Dimension(75, 75));
        j10.setMinimumSize(new java.awt.Dimension(75, 75));
        j10.setPreferredSize(new java.awt.Dimension(75, 75));
        j10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j10MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("  ");
        jLabel10.setIconTextGap(0);
        jLabel10.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel10.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel10.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j10Layout = new org.jdesktop.layout.GroupLayout(j10);
        j10.setLayout(j10Layout);
        j10Layout.setHorizontalGroup(
            j10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j10Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j10Layout.setVerticalGroup(
            j10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j10Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j13.setBackground(new java.awt.Color(102, 102, 102));
        j13.setMaximumSize(new java.awt.Dimension(75, 75));
        j13.setMinimumSize(new java.awt.Dimension(75, 75));
        j13.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j17.setMaximumSize(new java.awt.Dimension(75, 75));
        j17.setMinimumSize(new java.awt.Dimension(75, 75));
        j17.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j16.setMaximumSize(new java.awt.Dimension(75, 75));
        j16.setMinimumSize(new java.awt.Dimension(75, 75));
        j16.setPreferredSize(new java.awt.Dimension(75, 75));
        j16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j16MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("  ");
        jLabel16.setIconTextGap(0);
        jLabel16.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel16.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel16.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j16Layout = new org.jdesktop.layout.GroupLayout(j16);
        j16.setLayout(j16Layout);
        j16Layout.setHorizontalGroup(
            j16Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j16Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j16Layout.setVerticalGroup(
            j16Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j16Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j14.setBackground(new java.awt.Color(175, 0, 0));
        j14.setMaximumSize(new java.awt.Dimension(75, 75));
        j14.setMinimumSize(new java.awt.Dimension(75, 75));
        j14.setPreferredSize(new java.awt.Dimension(75, 75));
        j14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j14MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("  ");
        jLabel14.setIconTextGap(0);
        jLabel14.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel14.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel14.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j14Layout = new org.jdesktop.layout.GroupLayout(j14);
        j14.setLayout(j14Layout);
        j14Layout.setHorizontalGroup(
            j14Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j14Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j14Layout.setVerticalGroup(
            j14Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j14Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j15.setBackground(new java.awt.Color(102, 102, 102));
        j15.setMaximumSize(new java.awt.Dimension(75, 75));
        j15.setMinimumSize(new java.awt.Dimension(75, 75));
        j15.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j30.setMaximumSize(new java.awt.Dimension(75, 75));
        j30.setMinimumSize(new java.awt.Dimension(75, 75));
        j30.setPreferredSize(new java.awt.Dimension(75, 75));
        j30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j30MouseClicked(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("  ");
        jLabel30.setIconTextGap(0);
        jLabel30.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel30.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel30.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j30Layout = new org.jdesktop.layout.GroupLayout(j30);
        j30.setLayout(j30Layout);
        j30Layout.setHorizontalGroup(
            j30Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j30Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j30Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jLabel30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        j30Layout.setVerticalGroup(
            j30Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j30Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j30Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jLabel30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        j23.setBackground(new java.awt.Color(175, 0, 0));
        j23.setMaximumSize(new java.awt.Dimension(75, 75));
        j23.setMinimumSize(new java.awt.Dimension(75, 75));
        j23.setPreferredSize(new java.awt.Dimension(75, 75));
        j23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j23MouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("  ");
        jLabel23.setIconTextGap(0);
        jLabel23.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel23.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel23.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j23Layout = new org.jdesktop.layout.GroupLayout(j23);
        j23.setLayout(j23Layout);
        j23Layout.setHorizontalGroup(
            j23Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j23Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j23Layout.setVerticalGroup(
            j23Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j23Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j33.setBackground(new java.awt.Color(102, 102, 102));
        j33.setMaximumSize(new java.awt.Dimension(75, 75));
        j33.setMinimumSize(new java.awt.Dimension(75, 75));
        j33.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j22.setMaximumSize(new java.awt.Dimension(75, 75));
        j22.setMinimumSize(new java.awt.Dimension(75, 75));
        j22.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j32.setMaximumSize(new java.awt.Dimension(75, 75));
        j32.setMinimumSize(new java.awt.Dimension(75, 75));
        j32.setPreferredSize(new java.awt.Dimension(75, 75));
        j32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j32MouseClicked(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("  ");
        jLabel32.setIconTextGap(0);
        jLabel32.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel32.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel32.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j32Layout = new org.jdesktop.layout.GroupLayout(j32);
        j32.setLayout(j32Layout);
        j32Layout.setHorizontalGroup(
            j32Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j32Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j32Layout.createSequentialGroup()
                    .add(0, 25, Short.MAX_VALUE)
                    .add(jLabel32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 26, Short.MAX_VALUE)))
        );
        j32Layout.setVerticalGroup(
            j32Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j32Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j32Layout.createSequentialGroup()
                    .add(0, 16, Short.MAX_VALUE)
                    .add(jLabel32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 16, Short.MAX_VALUE)))
        );

        j21.setBackground(new java.awt.Color(175, 0, 0));
        j21.setMaximumSize(new java.awt.Dimension(75, 75));
        j21.setMinimumSize(new java.awt.Dimension(75, 75));
        j21.setPreferredSize(new java.awt.Dimension(75, 75));
        j21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j21MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("  ");
        jLabel21.setIconTextGap(0);
        jLabel21.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel21.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel21.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j21Layout = new org.jdesktop.layout.GroupLayout(j21);
        j21.setLayout(j21Layout);
        j21Layout.setHorizontalGroup(
            j21Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j21Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j21Layout.setVerticalGroup(
            j21Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j21Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j31.setBackground(new java.awt.Color(102, 102, 102));
        j31.setMaximumSize(new java.awt.Dimension(75, 75));
        j31.setMinimumSize(new java.awt.Dimension(75, 75));
        j31.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j24.setMaximumSize(new java.awt.Dimension(75, 75));
        j24.setMinimumSize(new java.awt.Dimension(75, 75));
        j24.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j34.setMaximumSize(new java.awt.Dimension(75, 75));
        j34.setMinimumSize(new java.awt.Dimension(75, 75));
        j34.setPreferredSize(new java.awt.Dimension(75, 75));
        j34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j34MouseClicked(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("  ");
        jLabel34.setIconTextGap(0);
        jLabel34.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel34.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel34.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j34Layout = new org.jdesktop.layout.GroupLayout(j34);
        j34.setLayout(j34Layout);
        j34Layout.setHorizontalGroup(
            j34Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j34Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j34Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jLabel34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        j34Layout.setVerticalGroup(
            j34Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j34Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j34Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jLabel34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        j35.setBackground(new java.awt.Color(102, 102, 102));
        j35.setMaximumSize(new java.awt.Dimension(75, 75));
        j35.setMinimumSize(new java.awt.Dimension(75, 75));
        j35.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j37.setMaximumSize(new java.awt.Dimension(75, 75));
        j37.setMinimumSize(new java.awt.Dimension(75, 75));
        j37.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j36.setMaximumSize(new java.awt.Dimension(75, 75));
        j36.setMinimumSize(new java.awt.Dimension(75, 75));
        j36.setPreferredSize(new java.awt.Dimension(75, 75));
        j36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j36MouseClicked(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("  ");
        jLabel36.setIconTextGap(0);
        jLabel36.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel36.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel36.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j36Layout = new org.jdesktop.layout.GroupLayout(j36);
        j36.setLayout(j36Layout);
        j36Layout.setHorizontalGroup(
            j36Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j36Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j36Layout.createSequentialGroup()
                    .add(0, 25, Short.MAX_VALUE)
                    .add(jLabel36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 26, Short.MAX_VALUE)))
        );
        j36Layout.setVerticalGroup(
            j36Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j36Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j36Layout.createSequentialGroup()
                    .add(0, 16, Short.MAX_VALUE)
                    .add(jLabel36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 16, Short.MAX_VALUE)))
        );

        j20.setBackground(new java.awt.Color(102, 102, 102));
        j20.setMaximumSize(new java.awt.Dimension(75, 75));
        j20.setMinimumSize(new java.awt.Dimension(75, 75));
        j20.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j25.setMaximumSize(new java.awt.Dimension(75, 75));
        j25.setMinimumSize(new java.awt.Dimension(75, 75));
        j25.setPreferredSize(new java.awt.Dimension(75, 75));
        j25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j25MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("  ");
        jLabel25.setIconTextGap(0);
        jLabel25.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel25.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel25.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j25Layout = new org.jdesktop.layout.GroupLayout(j25);
        j25.setLayout(j25Layout);
        j25Layout.setHorizontalGroup(
            j25Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j25Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j25Layout.setVerticalGroup(
            j25Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j25Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j27.setBackground(new java.awt.Color(175, 0, 0));
        j27.setMaximumSize(new java.awt.Dimension(75, 75));
        j27.setMinimumSize(new java.awt.Dimension(75, 75));
        j27.setPreferredSize(new java.awt.Dimension(75, 75));
        j27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j27MouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("  ");
        jLabel27.setIconTextGap(0);
        jLabel27.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel27.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel27.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j27Layout = new org.jdesktop.layout.GroupLayout(j27);
        j27.setLayout(j27Layout);
        j27Layout.setHorizontalGroup(
            j27Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j27Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j27Layout.setVerticalGroup(
            j27Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j27Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j26.setBackground(new java.awt.Color(102, 102, 102));
        j26.setMaximumSize(new java.awt.Dimension(75, 75));
        j26.setMinimumSize(new java.awt.Dimension(75, 75));
        j26.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j50.setMaximumSize(new java.awt.Dimension(75, 75));
        j50.setMinimumSize(new java.awt.Dimension(75, 75));
        j50.setPreferredSize(new java.awt.Dimension(75, 75));
        j50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j50MouseClicked(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("  ");
        jLabel50.setIconTextGap(0);
        jLabel50.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel50.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel50.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j50Layout = new org.jdesktop.layout.GroupLayout(j50);
        j50.setLayout(j50Layout);
        j50Layout.setHorizontalGroup(
            j50Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j50Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j50Layout.setVerticalGroup(
            j50Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j50Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j53.setBackground(new java.awt.Color(102, 102, 102));
        j53.setMaximumSize(new java.awt.Dimension(75, 75));
        j53.setMinimumSize(new java.awt.Dimension(75, 75));
        j53.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j52.setMaximumSize(new java.awt.Dimension(75, 75));
        j52.setMinimumSize(new java.awt.Dimension(75, 75));
        j52.setPreferredSize(new java.awt.Dimension(75, 75));
        j52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j52MouseClicked(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("  ");
        jLabel52.setIconTextGap(0);
        jLabel52.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel52.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel52.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j52Layout = new org.jdesktop.layout.GroupLayout(j52);
        j52.setLayout(j52Layout);
        j52Layout.setHorizontalGroup(
            j52Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j52Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j52Layout.setVerticalGroup(
            j52Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j52Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j51.setBackground(new java.awt.Color(102, 102, 102));
        j51.setMaximumSize(new java.awt.Dimension(75, 75));
        j51.setMinimumSize(new java.awt.Dimension(75, 75));
        j51.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j54.setMaximumSize(new java.awt.Dimension(75, 75));
        j54.setMinimumSize(new java.awt.Dimension(75, 75));
        j54.setPreferredSize(new java.awt.Dimension(75, 75));
        j54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j54MouseClicked(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("  ");
        jLabel54.setIconTextGap(0);
        jLabel54.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel54.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel54.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j54Layout = new org.jdesktop.layout.GroupLayout(j54);
        j54.setLayout(j54Layout);
        j54Layout.setHorizontalGroup(
            j54Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j54Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j54Layout.setVerticalGroup(
            j54Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j54Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j55.setBackground(new java.awt.Color(102, 102, 102));
        j55.setMaximumSize(new java.awt.Dimension(75, 75));
        j55.setMinimumSize(new java.awt.Dimension(75, 75));
        j55.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j57.setMaximumSize(new java.awt.Dimension(75, 75));
        j57.setMinimumSize(new java.awt.Dimension(75, 75));
        j57.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j56.setMaximumSize(new java.awt.Dimension(75, 75));
        j56.setMinimumSize(new java.awt.Dimension(75, 75));
        j56.setPreferredSize(new java.awt.Dimension(75, 75));
        j56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j56MouseClicked(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("  ");
        jLabel56.setIconTextGap(0);
        jLabel56.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel56.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel56.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j56Layout = new org.jdesktop.layout.GroupLayout(j56);
        j56.setLayout(j56Layout);
        j56Layout.setHorizontalGroup(
            j56Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j56Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j56Layout.setVerticalGroup(
            j56Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j56Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j66.setBackground(new java.awt.Color(102, 102, 102));
        j66.setMaximumSize(new java.awt.Dimension(75, 75));
        j66.setMinimumSize(new java.awt.Dimension(75, 75));
        j66.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j67.setMaximumSize(new java.awt.Dimension(75, 75));
        j67.setMinimumSize(new java.awt.Dimension(75, 75));
        j67.setPreferredSize(new java.awt.Dimension(75, 75));
        j67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j67MouseClicked(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("  ");
        jLabel67.setIconTextGap(0);
        jLabel67.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel67.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel67.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j67Layout = new org.jdesktop.layout.GroupLayout(j67);
        j67.setLayout(j67Layout);
        j67Layout.setHorizontalGroup(
            j67Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j67Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j67Layout.setVerticalGroup(
            j67Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j67Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j60.setBackground(new java.awt.Color(102, 102, 102));
        j60.setMaximumSize(new java.awt.Dimension(75, 75));
        j60.setMinimumSize(new java.awt.Dimension(75, 75));
        j60.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j65.setMaximumSize(new java.awt.Dimension(75, 75));
        j65.setMinimumSize(new java.awt.Dimension(75, 75));
        j65.setPreferredSize(new java.awt.Dimension(75, 75));
        j65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j65MouseClicked(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("  ");
        jLabel65.setIconTextGap(0);
        jLabel65.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel65.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel65.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j65Layout = new org.jdesktop.layout.GroupLayout(j65);
        j65.setLayout(j65Layout);
        j65Layout.setHorizontalGroup(
            j65Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j65Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j65Layout.setVerticalGroup(
            j65Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j65Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j77.setBackground(new java.awt.Color(102, 102, 102));
        j77.setMaximumSize(new java.awt.Dimension(75, 75));
        j77.setMinimumSize(new java.awt.Dimension(75, 75));
        j77.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j76.setMaximumSize(new java.awt.Dimension(75, 75));
        j76.setMinimumSize(new java.awt.Dimension(75, 75));
        j76.setPreferredSize(new java.awt.Dimension(75, 75));
        j76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j76MouseClicked(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("  ");
        jLabel76.setIconTextGap(0);
        jLabel76.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel76.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel76.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j76Layout = new org.jdesktop.layout.GroupLayout(j76);
        j76.setLayout(j76Layout);
        j76Layout.setHorizontalGroup(
            j76Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j76Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j76Layout.setVerticalGroup(
            j76Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j76Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j47.setBackground(new java.awt.Color(175, 0, 0));
        j47.setMaximumSize(new java.awt.Dimension(75, 75));
        j47.setMinimumSize(new java.awt.Dimension(75, 75));
        j47.setPreferredSize(new java.awt.Dimension(75, 75));
        j47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j47MouseClicked(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("  ");
        jLabel47.setIconTextGap(0);
        jLabel47.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel47.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel47.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j47Layout = new org.jdesktop.layout.GroupLayout(j47);
        j47.setLayout(j47Layout);
        j47Layout.setHorizontalGroup(
            j47Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j47Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j47Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jLabel47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        j47Layout.setVerticalGroup(
            j47Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j47Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j47Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jLabel47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        j46.setBackground(new java.awt.Color(102, 102, 102));
        j46.setMaximumSize(new java.awt.Dimension(75, 75));
        j46.setMinimumSize(new java.awt.Dimension(75, 75));
        j46.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j62.setMaximumSize(new java.awt.Dimension(75, 75));
        j62.setMinimumSize(new java.awt.Dimension(75, 75));
        j62.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j43.setMaximumSize(new java.awt.Dimension(75, 75));
        j43.setMinimumSize(new java.awt.Dimension(75, 75));
        j43.setPreferredSize(new java.awt.Dimension(75, 75));
        j43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j43MouseClicked(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("  ");
        jLabel43.setIconTextGap(0);
        jLabel43.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel43.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel43.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j43Layout = new org.jdesktop.layout.GroupLayout(j43);
        j43.setLayout(j43Layout);
        j43Layout.setHorizontalGroup(
            j43Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j43Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j43Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jLabel43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        j43Layout.setVerticalGroup(
            j43Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j43Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j43Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jLabel43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        j72.setBackground(new java.awt.Color(175, 0, 0));
        j72.setMaximumSize(new java.awt.Dimension(75, 75));
        j72.setMinimumSize(new java.awt.Dimension(75, 75));
        j72.setPreferredSize(new java.awt.Dimension(75, 75));
        j72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j72MouseClicked(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("  ");
        jLabel72.setIconTextGap(0);
        jLabel72.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel72.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel72.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j72Layout = new org.jdesktop.layout.GroupLayout(j72);
        j72.setLayout(j72Layout);
        j72Layout.setHorizontalGroup(
            j72Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j72Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j72Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jLabel72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        j72Layout.setVerticalGroup(
            j72Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j72Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j72Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jLabel72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        j42.setBackground(new java.awt.Color(102, 102, 102));
        j42.setMaximumSize(new java.awt.Dimension(75, 75));
        j42.setMinimumSize(new java.awt.Dimension(75, 75));
        j42.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j61.setMaximumSize(new java.awt.Dimension(75, 75));
        j61.setMinimumSize(new java.awt.Dimension(75, 75));
        j61.setPreferredSize(new java.awt.Dimension(75, 75));
        j61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j61MouseClicked(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("  ");
        jLabel61.setIconTextGap(0);
        jLabel61.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel61.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel61.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j61Layout = new org.jdesktop.layout.GroupLayout(j61);
        j61.setLayout(j61Layout);
        j61Layout.setHorizontalGroup(
            j61Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j61Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j61Layout.setVerticalGroup(
            j61Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j61Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        j41.setBackground(new java.awt.Color(175, 0, 0));
        j41.setMaximumSize(new java.awt.Dimension(75, 75));
        j41.setMinimumSize(new java.awt.Dimension(75, 75));
        j41.setPreferredSize(new java.awt.Dimension(75, 75));
        j41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j41MouseClicked(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("  ");
        jLabel41.setIconTextGap(0);
        jLabel41.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel41.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel41.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j41Layout = new org.jdesktop.layout.GroupLayout(j41);
        j41.setLayout(j41Layout);
        j41Layout.setHorizontalGroup(
            j41Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j41Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j41Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jLabel41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        j41Layout.setVerticalGroup(
            j41Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j41Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j41Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jLabel41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        j71.setBackground(new java.awt.Color(102, 102, 102));
        j71.setMaximumSize(new java.awt.Dimension(75, 75));
        j71.setMinimumSize(new java.awt.Dimension(75, 75));
        j71.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j44.setMaximumSize(new java.awt.Dimension(75, 75));
        j44.setMinimumSize(new java.awt.Dimension(75, 75));
        j44.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j64.setMaximumSize(new java.awt.Dimension(75, 75));
        j64.setMinimumSize(new java.awt.Dimension(75, 75));
        j64.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j74.setMaximumSize(new java.awt.Dimension(75, 75));
        j74.setMinimumSize(new java.awt.Dimension(75, 75));
        j74.setPreferredSize(new java.awt.Dimension(75, 75));
        j74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j74MouseClicked(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("  ");
        jLabel74.setIconTextGap(0);
        jLabel74.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel74.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel74.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j74Layout = new org.jdesktop.layout.GroupLayout(j74);
        j74.setLayout(j74Layout);
        j74Layout.setHorizontalGroup(
            j74Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j74Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j74Layout.createSequentialGroup()
                    .add(0, 25, Short.MAX_VALUE)
                    .add(jLabel74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 26, Short.MAX_VALUE)))
        );
        j74Layout.setVerticalGroup(
            j74Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j74Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j74Layout.createSequentialGroup()
                    .add(0, 16, Short.MAX_VALUE)
                    .add(jLabel74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 16, Short.MAX_VALUE)))
        );

        j75.setBackground(new java.awt.Color(102, 102, 102));
        j75.setMaximumSize(new java.awt.Dimension(75, 75));
        j75.setMinimumSize(new java.awt.Dimension(75, 75));
        j75.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j40.setMaximumSize(new java.awt.Dimension(75, 75));
        j40.setMinimumSize(new java.awt.Dimension(75, 75));
        j40.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j45.setMaximumSize(new java.awt.Dimension(75, 75));
        j45.setMinimumSize(new java.awt.Dimension(75, 75));
        j45.setPreferredSize(new java.awt.Dimension(75, 75));
        j45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j45MouseClicked(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("  ");
        jLabel45.setIconTextGap(0);
        jLabel45.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel45.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel45.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j45Layout = new org.jdesktop.layout.GroupLayout(j45);
        j45.setLayout(j45Layout);
        j45Layout.setHorizontalGroup(
            j45Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j45Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j45Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jLabel45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        j45Layout.setVerticalGroup(
            j45Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j45Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j45Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jLabel45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        j70.setBackground(new java.awt.Color(175, 0, 0));
        j70.setMaximumSize(new java.awt.Dimension(75, 75));
        j70.setMinimumSize(new java.awt.Dimension(75, 75));
        j70.setPreferredSize(new java.awt.Dimension(75, 75));
        j70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j70MouseClicked(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("  ");
        jLabel71.setIconTextGap(0);
        jLabel71.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel71.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel71.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j70Layout = new org.jdesktop.layout.GroupLayout(j70);
        j70.setLayout(j70Layout);
        j70Layout.setHorizontalGroup(
            j70Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j70Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j70Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jLabel71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        j70Layout.setVerticalGroup(
            j70Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 75, Short.MAX_VALUE)
            .add(j70Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(j70Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jLabel71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        j73.setBackground(new java.awt.Color(102, 102, 102));
        j73.setMaximumSize(new java.awt.Dimension(75, 75));
        j73.setMinimumSize(new java.awt.Dimension(75, 75));
        j73.setPreferredSize(new java.awt.Dimension(75, 75));

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
        j63.setMaximumSize(new java.awt.Dimension(75, 75));
        j63.setMinimumSize(new java.awt.Dimension(75, 75));
        j63.setPreferredSize(new java.awt.Dimension(75, 75));
        j63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j63MouseClicked(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("  ");
        jLabel63.setIconTextGap(0);
        jLabel63.setMaximumSize(new java.awt.Dimension(25, 43));
        jLabel63.setMinimumSize(new java.awt.Dimension(25, 43));
        jLabel63.setPreferredSize(new java.awt.Dimension(25, 43));

        org.jdesktop.layout.GroupLayout j63Layout = new org.jdesktop.layout.GroupLayout(j63);
        j63.setLayout(j63Layout);
        j63Layout.setHorizontalGroup(
            j63Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(j63Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        j63Layout.setVerticalGroup(
            j63Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, j63Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jLabel63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Checkers Game");

        jStartNewGame.setText("Start New Game");
        jStartNewGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jStartNewGameMouseClicked(evt);
            }
        });

        jHelp.setText("Help");
        jHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jHelpMouseClicked(evt);
            }
        });

        jQuit.setText("Quit");
        jQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jQuitMouseClicked(evt);
            }
        });

        jTextArea.setColumns(10);
        jTextArea.setRows(5);
        jTextArea.setToolTipText("");
        jScrollPane1.setViewportView(jTextArea);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(j20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(j30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(j33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 6)
                                .add(j37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(j23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 6)
                                .add(j27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(org.jdesktop.layout.GroupLayout.CENTER, jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(j40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(j50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(j44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(j54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(j45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 6)
                                .add(j47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(j55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(j56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 6)
                                        .add(j57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(j66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(j76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(j77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(j67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(0, 0, Short.MAX_VALUE))))))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(j70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(j71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(j60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(j61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(j62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(j72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(j63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(j73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(j64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(j65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(j74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(j75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
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
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
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
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j07, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(0, 0, Short.MAX_VALUE)))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 400, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                                    .add(jStartNewGame)
                                    .add(jHelp))
                                .add(135, 135, 135))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(jQuit)
                                .add(167, 167, 167))))))
            .add(jPanel1Layout.createSequentialGroup()
                .add(195, 195, 195)
                .add(jLabel1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(new java.awt.Component[] {j00, j01, j02, j03, j04, j05, j06, j07, j10, j11, j12, j13, j14, j15, j16, j17, j20, j21, j22, j23, j24, j25, j26, j27, j30, j31, j32, j33, j34, j35, j36, j37, j40, j41, j42, j43, j44, j45, j46, j47, j50, j51, j52, j53, j54, j55, j56, j57, j60, j61, j62, j63, j64, j65, j66, j67, j70, j71, j72, j73, j74, j75, j76, j77}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
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
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(j34, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(j35, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(j36, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(j33, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(j30, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(j31, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(j37, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(j32, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(j45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(j46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(j47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(j41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(j42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(j43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(j40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(j55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(j56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(j53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(j50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(j51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(j52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(j57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(j44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(j54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
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
                            .add(j74, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(j75, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(j76, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(j73, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(j70, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(j71, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(j72, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(j77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jStartNewGame)
                        .add(29, 29, 29)
                        .add(jHelp)
                        .add(18, 18, 18)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jQuit)))
                .add(0, 10, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(new java.awt.Component[] {j00, j01, j02, j03, j04, j05, j06, j07, j10, j11, j12, j13, j14, j15, j16, j17, j20, j21, j22, j23, j24, j25, j26, j27, j30, j31, j32, j33, j34, j35, j36, j37, j40, j41, j42, j43, j44, j45, j46, j47, j50, j51, j52, j53, j54, j55, j56, j57, j60, j61, j62, j63, j64, j65, j66, j67, j70, j71, j72, j73, j74, j75, j76, j77}, org.jdesktop.layout.GroupLayout.VERTICAL);

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
                .add(0, 41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jStartNewGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jStartNewGameMouseClicked
        this.gameCommands.startNewGame(this.markerLocationsView);
    }//GEN-LAST:event_jStartNewGameMouseClicked

    private void j01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j01MouseClicked
        this.coordinate.setLocation(0,1);
        this.move();
        markerLocation.setLocation(0,1);
    }//GEN-LAST:event_j01MouseClicked

    private void j03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j03MouseClicked
        this.coordinate.setLocation(0,3);
         this.move();
         markerLocation.setLocation(0,3);
    }//GEN-LAST:event_j03MouseClicked

    private void j05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j05MouseClicked
                this.coordinate.setLocation(0,5);
                this.move();
                markerLocation.setLocation(0,5);
    }//GEN-LAST:event_j05MouseClicked

    private void j07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j07MouseClicked
                this.coordinate.setLocation(0,7);
                this.move();
                markerLocation.setLocation(0,7);
    }//GEN-LAST:event_j07MouseClicked

    private void j10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j10MouseClicked
                this.coordinate.setLocation(1,0);
                this.move();
                markerLocation.setLocation(1,0);
    }//GEN-LAST:event_j10MouseClicked

    private void j12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j12MouseClicked
                this.coordinate.setLocation(1,2);
                this.move();
                markerLocation.setLocation(1,2);
    }//GEN-LAST:event_j12MouseClicked

    private void j14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j14MouseClicked
                this.coordinate.setLocation(1,4);
                this.move();
                markerLocation.setLocation(1,4);
    }//GEN-LAST:event_j14MouseClicked

    private void j16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j16MouseClicked
                this.coordinate.setLocation(1,6);
                this.move();
                markerLocation.setLocation(1,6);
    }//GEN-LAST:event_j16MouseClicked

    private void j21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j21MouseClicked
                this.coordinate.setLocation(2,1);
                this.move();
                markerLocation.setLocation(2,1);
    }//GEN-LAST:event_j21MouseClicked

    private void j23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j23MouseClicked
                this.coordinate.setLocation(2,3);
                this.move();
                markerLocation.setLocation(2,3);
    }//GEN-LAST:event_j23MouseClicked

    private void j25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j25MouseClicked
                this.coordinate.setLocation(2,5);
                this.move();
                markerLocation.setLocation(2,5);
    }//GEN-LAST:event_j25MouseClicked

    private void j27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j27MouseClicked
                this.coordinate.setLocation(2,7);
                this.move();
                markerLocation.setLocation(2,7);
    }//GEN-LAST:event_j27MouseClicked

    private void j30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j30MouseClicked
                this.coordinate.setLocation(3,0);
                this.move();
                markerLocation.setLocation(3,0);
    }//GEN-LAST:event_j30MouseClicked

    private void j32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j32MouseClicked
                this.coordinate.setLocation(3,2);
                this.move();
                markerLocation.setLocation(3,2);
    }//GEN-LAST:event_j32MouseClicked

    private void j34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j34MouseClicked
                this.coordinate.setLocation(3,4);
                 this.move();
                 markerLocation.setLocation(3,4);
    }//GEN-LAST:event_j34MouseClicked

    private void j36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j36MouseClicked
                this.coordinate.setLocation(3,6);
                 this.move();
                 markerLocation.setLocation(3,6);
    }//GEN-LAST:event_j36MouseClicked

    private void j41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j41MouseClicked
                this.coordinate.setLocation(4,1);
                 this.move();
                 markerLocation.setLocation(4,1);
    }//GEN-LAST:event_j41MouseClicked

    private void j43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j43MouseClicked
                this.coordinate.setLocation(4,3);
                this.move();
                markerLocation.setLocation(4,3);
    }//GEN-LAST:event_j43MouseClicked

    private void j45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j45MouseClicked
                this.coordinate.setLocation(4,5);
                this.move();
                markerLocation.setLocation(4,5);
    }//GEN-LAST:event_j45MouseClicked

    private void j47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j47MouseClicked
                this.coordinate.setLocation(4,7);
                this.move();
                markerLocation.setLocation(4,7);
    }//GEN-LAST:event_j47MouseClicked

    private void j50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j50MouseClicked
                this.coordinate.setLocation(5,0);
                this.move();
                markerLocation.setLocation(5,0);
    }//GEN-LAST:event_j50MouseClicked

    private void j52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j52MouseClicked
                this.coordinate.setLocation(5,2);
                this.move();
                markerLocation.setLocation(5,2);
    }//GEN-LAST:event_j52MouseClicked

    private void j54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j54MouseClicked
                this.coordinate.setLocation(5,4);
                this.move();
                markerLocation.setLocation(5,4);
    }//GEN-LAST:event_j54MouseClicked

    private void j56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j56MouseClicked
                this.coordinate.setLocation(5,6);
                this.move();
                markerLocation.setLocation(5,6);
    }//GEN-LAST:event_j56MouseClicked

    private void j61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j61MouseClicked
                this.coordinate.setLocation(6,1);
                this.move();
                markerLocation.setLocation(6,1);
    }//GEN-LAST:event_j61MouseClicked

    private void j63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j63MouseClicked
                this.coordinate.setLocation(6,3);
                this.move();
                markerLocation.setLocation(6,3);
    }//GEN-LAST:event_j63MouseClicked

    private void j65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j65MouseClicked
                this.coordinate.setLocation(6,5);
                this.move();
                markerLocation.setLocation(6,5);
    }//GEN-LAST:event_j65MouseClicked

    private void j67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j67MouseClicked
                this.coordinate.setLocation(6,7);
                this.move();
                markerLocation.setLocation(6,7);
    }//GEN-LAST:event_j67MouseClicked

    private void j70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j70MouseClicked
                this.coordinate.setLocation(7,0);
                this.move();
                markerLocation.setLocation(7,0);
    }//GEN-LAST:event_j70MouseClicked

    private void j72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j72MouseClicked
                this.coordinate.setLocation(7,2);
                this.move();
                markerLocation.setLocation(7,2);
    }//GEN-LAST:event_j72MouseClicked

    private void j74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j74MouseClicked
                this.coordinate.setLocation(7,4);
                this.move();
                markerLocation.setLocation(7,4);
    }//GEN-LAST:event_j74MouseClicked

    private void j76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j76MouseClicked
                this.coordinate.setLocation(7,6);
                this.move();
                markerLocation.setLocation(7,6);
    }//GEN-LAST:event_j76MouseClicked

    private void jHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHelpMouseClicked
        HelpFrame helpFrame = new HelpFrame();
        helpFrame.setVisible(true);
    }//GEN-LAST:event_jHelpMouseClicked

    private void jQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuitMouseClicked
        MainFrame mainFrame = new MainFrame();
        this.dispose();
        mainFrame.setVisible(true);
    }//GEN-LAST:event_jQuitMouseClicked

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
    private javax.swing.JButton jHelp;
    private javax.swing.JLabel jLabel01;
    private javax.swing.JLabel jLabel03;
    private javax.swing.JLabel jLabel05;
    private javax.swing.JLabel jLabel07;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jQuit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jStartNewGame;
    private javax.swing.JTextArea jTextArea;
    // End of variables declaration//GEN-END:variables

    private void move() {
        jTextArea.setText("");
         int jumpAgain = 2;
         try {
                this.gameCommands.takeTurn();
            } catch (GameException ex) {
                Logger.getLogger(GameFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        if (!move) {
            try {
                move = this.gameCommands.regularPlayerSelection(this.game.getCurrentPlayer(), markerLocationsView, coordinate);
            } catch (GameException ex) {
                this.jTextArea.setText(ex.getMessage());
            }
        }
        else {
            try {
                jumpAgain = this.gameCommands.regularPlayerMove(this.game.getCurrentPlayer(), markerLocationsView, markerLocation, coordinate);
            } catch (GameException ex) {
                this.jTextArea.setText(ex.getMessage());
            }
        if (jumpAgain == 0)
            this.game.getBoard().kingMe(game);
            this.gameCommands.displayBoard(markerLocationsView);
            this.gameCommands.alternatePlayers();
            this.move = false;
        }
    }
    

    public JLabel[][] getMarkerLocationsView() {
        return markerLocationsView;
    }

    public void setMarkerLocationsView(JLabel[][] markerLocationsView) {
        this.markerLocationsView = markerLocationsView;
    }

    public JPanel[][] getBoardLocationsView() {
        return boardLocationsView;
    }

    public void setBoardLocationsView(JPanel[][] boardLocationsView) {
        this.boardLocationsView = boardLocationsView;
    }

    public Point getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Point coordinate) {
        this.coordinate = coordinate;
    }
    
    
}
