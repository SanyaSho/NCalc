package me.sanyasho.ncalc;

import java.awt.Desktop;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static me.sanyasho.ncalc.NCalcPreMain.datadir;

public class NCalcMain extends javax.swing.JFrame {
    
    public static String year = "2021";
    public static String srclink = "https://github.com/SanyaSho/NCalc";
    public static String issueslink = "https://github.com/SanyaSho/NCalc/issues";
    
    public NCalcMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        calculate = new javax.swing.JButton();
        mode = new javax.swing.JComboBox<>();
        modetext = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        xpanel = new javax.swing.JPanel();
        xout = new javax.swing.JTextField();
        xin = new javax.swing.JSpinner();
        zpanel = new javax.swing.JPanel();
        zout = new javax.swing.JTextField();
        zin = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        menumainpanel = new javax.swing.JMenuBar();
        mainmenu = new javax.swing.JMenu();
        menusettings = new javax.swing.JMenuItem();
        menureport = new javax.swing.JMenuItem();
        menumanual = new javax.swing.JMenuItem();
        menuquit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nether Calculator - Main");
        setIconImage(new ImageIcon(getClass().getResource("/icons/icon.png")).getImage());
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                ncalcopened(evt);
            }
        });

        mainpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        mode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nether to Overworld", "Overworld to Nether" }));

        modetext.setText("Mode: ");

        xpanel.setBorder(javax.swing.BorderFactory.createTitledBorder("X"));

        javax.swing.GroupLayout xpanelLayout = new javax.swing.GroupLayout(xpanel);
        xpanel.setLayout(xpanelLayout);
        xpanelLayout.setHorizontalGroup(
            xpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(xpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xin, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(xout))
                .addContainerGap())
        );
        xpanelLayout.setVerticalGroup(
            xpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpanelLayout.createSequentialGroup()
                .addComponent(xin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        zpanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Z"));

        javax.swing.GroupLayout zpanelLayout = new javax.swing.GroupLayout(zpanel);
        zpanel.setLayout(zpanelLayout);
        zpanelLayout.setHorizontalGroup(
            zpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(zpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zout)
                    .addComponent(zin, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addContainerGap())
        );
        zpanelLayout.setVerticalGroup(
            zpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zpanelLayout.createSequentialGroup()
                .addComponent(zin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                        .addComponent(modetext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(mode, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addComponent(xpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(calculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jSeparator3)
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modetext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(xpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculate)
                .addContainerGap())
        );

        mainmenu.setText("Menu");
        mainmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mainmenuMouseReleased(evt);
            }
        });

        menusettings.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menusettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/preferences-desktop.png"))); // NOI18N
        menusettings.setText("Options");
        menusettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusettingsActionPerformed(evt);
            }
        });
        mainmenu.add(menusettings);

        menureport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menureport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mail-send-receive.png"))); // NOI18N
        menureport.setText("Report bugs");
        menureport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menureportActionPerformed(evt);
            }
        });
        mainmenu.add(menureport);

        menumanual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menumanual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/help-browser.png"))); // NOI18N
        menumanual.setText("Manual");
        menumanual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menumanualActionPerformed(evt);
            }
        });
        mainmenu.add(menumanual);

        menuquit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuquit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/system-log-out.png"))); // NOI18N
        menuquit.setText("Quit");
        menuquit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuquitActionPerformed(evt);
            }
        });
        mainmenu.add(menuquit);

        menumainpanel.add(mainmenu);

        setJMenuBar(menumainpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        
        // Shitcode here.
        
        Properties conffile = new Properties();
        try {
            conffile.load(new FileInputStream(datadir + "config.yml"));
        } catch(IOException ex) {
            System.out.println("[Main] -> " + ex);
        }
        
        Properties enus = new Properties();
        try {
            enus.load(NCalcMain.class.getResourceAsStream("/lang/en_US.properties"));
        } catch(IOException ex) {
            System.out.println("[Main] -> [FATAL] -> " + ex);
        }
        
        Properties ruru = new Properties();
        try {
            ruru.load(NCalcMain.class.getResourceAsStream("/lang/ru_RU.properties"));
        } catch(IOException ex) {
            System.out.println("[Main] -> [FATAL] -> " + ex);
        }
        
        int X = (int) xin.getValue();
        int Z = (int) zin.getValue();
        
        if(conffile.getProperty("lang").startsWith("en_US")) {
            if(mode.getSelectedItem() == "Nether to Overworld") {
                
                String XEND = String.valueOf(X*8);
                String ZEND = String.valueOf(Z*8);
                
                xout.setText(XEND);
                zout.setText(ZEND);
                
                // Very good code.
                System.out.println("=-=-=-=-=-=-={CALC}=-=-=-=-=-=-=");
                System.out.println("Mode: " + mode.getSelectedItem());
                System.out.println("X in Overworld: " + XEND + "; X in Nether: " + xin.getValue());
                System.out.println("Z in Overworld: " + ZEND + "; Z in Nether: " + zin.getValue());
                System.out.println("=-=-=-=-=-=-={GOOD}=-=-=-=-=-=-=");
                
            } else {
                
                String XEND = String.valueOf(X/8);
                String ZEND = String.valueOf(Z/8);
                
                xout.setText(XEND);
                zout.setText(ZEND);
                
                // Very good code. (X2)
                System.out.println("=-=-=-=-=-=-={CALC}=-=-=-=-=-=-=");
                System.out.println("Mode: " + mode.getSelectedItem());
                System.out.println("X in Nether: " + XEND + "; X in Overworld: " + xin.getValue());
                System.out.println("Z in Nether: " + ZEND + "; Z in Overworld: " + zin.getValue());
                System.out.println("=-=-=-=-=-=-={GOOD}=-=-=-=-=-=-=");
            }
        }
        
        if(conffile.getProperty("lang").startsWith("ru_RU")) {
            if(mode.getSelectedItem() == "Nether to Overworld") {
                
                String XEND = String.valueOf(X*8);
                String ZEND = String.valueOf(Z*8);
            
                xout.setText(XEND);
                zout.setText(ZEND);
            
                // Very good code. (X3)
                System.out.println("=-=-=-=-=-=-={CALC}=-=-=-=-=-=-=");
                System.out.println("Режим: " + mode.getSelectedItem());
                System.out.println("X в Обычном мире: " + XEND + "; X в Нижнем мире: " + xin.getValue());
                System.out.println("Z в Обычном мире: " + ZEND + "; Z в Нижнем мире: " + zin.getValue());
                System.out.println("=-=-=-=-=-=-={GOOD}=-=-=-=-=-=-=");
            
            } else {
                
                String XEND = String.valueOf(X/8);
                String ZEND = String.valueOf(Z/8);
                
                xout.setText(XEND);
                zout.setText(ZEND);
                
                // Very good code. (X4)
                System.out.println("=-=-=-=-=-=-={CALC}=-=-=-=-=-=-=");
                System.out.println("Режим: " + mode.getSelectedItem());
                System.out.println("X в Нижнем мире: " + XEND + "; X в Обычном мире: " + xin.getValue());
                System.out.println("Z в Нижнем мире: " + ZEND + "; Z в Обычном мире: " + zin.getValue());
                System.out.println("=-=-=-=-=-=-={GOOD}=-=-=-=-=-=-=");
                
            }
            
        } 
        
    }//GEN-LAST:event_calculateActionPerformed

    private void ncalcopened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ncalcopened
        
        Properties conffile = new Properties();
        try {
            conffile.load(new FileInputStream(datadir + "config.yml"));
        } catch(IOException ex) {
            System.out.println("[Main] -> " + ex);
        }
        
        Properties enus = new Properties();
        try {
            enus.load(NCalcMain.class.getResourceAsStream("/lang/en_US.properties"));
        } catch(IOException ex) {
            System.out.println("[Main] -> " + ex);
        }
        
        Properties ruru = new Properties();
        try {
            ruru.load(NCalcMain.class.getResourceAsStream("/lang/ru_RU.properties"));
        } catch(IOException ex) {
            System.out.println("[Main] -> " + ex);
        }
        
        // Get lang
        if(conffile.getProperty("lang").startsWith("en_US")) {
            this.setTitle(enus.getProperty("maintitle"));
            mainmenu.setText(enus.getProperty("mainmenu"));
            menusettings.setText(enus.getProperty("menusettings"));
            menureport.setText(enus.getProperty("menureport"));
            menumanual.setText(enus.getProperty("menumanual"));
            menuquit.setText(enus.getProperty("menuquit"));
            modetext.setText(enus.getProperty("modetext") + ":");
            calculate.setText(enus.getProperty("calculate"));
        }
        
        if(conffile.getProperty("lang").startsWith("ru_RU")) {
            this.setTitle(ruru.getProperty("maintitle"));
            mainmenu.setText(ruru.getProperty("mainmenu"));
            menusettings.setText(ruru.getProperty("menusettings"));
            menureport.setText(ruru.getProperty("menureport"));
            menumanual.setText(ruru.getProperty("menumanual"));
            menuquit.setText(ruru.getProperty("menuquit"));
            modetext.setText(ruru.getProperty("modetext") + ":");
            calculate.setText(ruru.getProperty("calculate"));
        }
        
        if(conffile.getProperty("defmode").startsWith("1")) {
            mode.setSelectedItem(enus.getProperty("mode_nto"));
        }
        
        if(conffile.getProperty("defmode").startsWith("2")) {
            mode.setSelectedItem(enus.getProperty("mode_otn"));
        }
        
    }//GEN-LAST:event_ncalcopened

    private void menuquitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuquitActionPerformed
        // Quit
        System.exit(0);
    }//GEN-LAST:event_menuquitActionPerformed

    private void menureportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menureportActionPerformed
        // Open issues webpage
        try {
            Desktop.getDesktop().browse(new URI(issueslink));
        } catch (IOException | URISyntaxException ex) {
            System.out.println("[Main] -> " + ex);
        }
    }//GEN-LAST:event_menureportActionPerformed

    private void menusettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusettingsActionPerformed
        // Open settings window
        new NCalcSettings().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menusettingsActionPerformed

    private void menumanualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menumanualActionPerformed
        // Open manual window
        new NCalcManual().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menumanualActionPerformed

    private void mainmenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainmenuMouseReleased
        // ???

        Properties conffile = new Properties();
        try {
            conffile.load(new FileInputStream(datadir + "config.yml"));
        } catch(IOException ex) {
            System.out.println("[Main] -> " + ex);
        }

        if(xout.getText().startsWith("30000000") && zout.getText().startsWith("30000000")) {
            this.setTitle("Far Lands are not so far");
        }

        if(xout.getText().startsWith("12550821") && zout.getText().startsWith("12550821")) {
            this.setTitle("Good luck");
        }
        
        if(xout.getText().startsWith("EXIT") && zout.getText().startsWith("PLEASE") || xout.getText().startsWith("QUIT") && zout.getText().startsWith("PLEASE")) {
            System.exit(0);
        }
        
        if(conffile.getProperty("lang").startsWith("20140626")) {
            
            this.setResizable(true);
            
            this.setTitle("1.7.10 is not the best");
            mode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.7.10 is not the best", "1.7.10 is not the best" }));
            mainmenu.setText("1.7.10 is not the best");
            menusettings.setText("1.7.10 is not the best");
            menureport.setText("1.7.10 is not the best");
            menumanual.setText("1.7.10 is not the best");
            menuquit.setText("1.7.10 is not the best");
            modetext.setText("1.7.10 is not the best");
            calculate.setText("1.7.10 is not the best");
            xpanel.setBorder(javax.swing.BorderFactory.createTitledBorder("1.7.10 is not the best"));
            zpanel.setBorder(javax.swing.BorderFactory.createTitledBorder("1.7.10 is not the best"));
            xout.setText("1.7.10 is not the best");
            zout.setText("1.7.10 is not the best");
        }

    }//GEN-LAST:event_mainmenuMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JMenu mainmenu;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JMenuBar menumainpanel;
    private javax.swing.JMenuItem menumanual;
    private javax.swing.JMenuItem menuquit;
    private javax.swing.JMenuItem menureport;
    private javax.swing.JMenuItem menusettings;
    private javax.swing.JComboBox<String> mode;
    private javax.swing.JLabel modetext;
    private javax.swing.JSpinner xin;
    private javax.swing.JTextField xout;
    private javax.swing.JPanel xpanel;
    private javax.swing.JSpinner zin;
    private javax.swing.JTextField zout;
    private javax.swing.JPanel zpanel;
    // End of variables declaration//GEN-END:variables
}
