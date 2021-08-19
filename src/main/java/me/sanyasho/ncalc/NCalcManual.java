package me.sanyasho.ncalc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.ImageIcon;
import static me.sanyasho.ncalc.NCalcPreMain.datadir;

public class NCalcManual extends javax.swing.JFrame {

    public NCalcManual() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manualtext0 = new javax.swing.JLabel();
        manualtext1 = new javax.swing.JLabel();
        manualtext2 = new javax.swing.JLabel();
        manualtext3 = new javax.swing.JLabel();
        manualtext4 = new javax.swing.JLabel();
        manualtext5 = new javax.swing.JLabel();
        manualtext6 = new javax.swing.JLabel();
        manualtext7 = new javax.swing.JLabel();
        manualtext8 = new javax.swing.JLabel();
        manualtext9 = new javax.swing.JLabel();
        manualtext10 = new javax.swing.JLabel();
        manualtext11 = new javax.swing.JLabel();
        quit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setTitle("Nether Calulator - Manual");
        setIconImage(new ImageIcon(getClass().getResource("/icons/help-browser.png")).getImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                ncalcmanualclosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                ncalcmanualopened(evt);
            }
        });

        manualtext0.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        manualtext0.setText("How it works?");

        manualtext1.setText("When you select \"Nether to Overworld\"");

        manualtext2.setText("mode, the value you set in the XIN and");

        manualtext3.setText("ZIN fields is multiplied by 8. And when");

        manualtext4.setText("you select \"Overworld to Nether\", the");

        manualtext5.setText("value is divied by 8.");

        manualtext6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        manualtext6.setText("How to use?");

        manualtext7.setText("Select the mode that suits you and");

        manualtext8.setText("write the coordinates you need in the");

        manualtext9.setText("XIN and ZIN fields, then click");

        manualtext10.setText("\"Calculate\" and get the necessary");

        manualtext11.setText("coordinates in the XOUT and ZOUT fields.");

        quit.setText("Close");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manualtext0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manualtext1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manualtext2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manualtext3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manualtext4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manualtext5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manualtext6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manualtext7)
                            .addComponent(manualtext8)
                            .addComponent(manualtext9)
                            .addComponent(manualtext10)
                            .addComponent(manualtext11))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addComponent(quit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manualtext0, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manualtext1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manualtext2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manualtext3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manualtext4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manualtext5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manualtext6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manualtext7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manualtext8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manualtext9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manualtext10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manualtext11)
                .addGap(18, 18, 18)
                .addComponent(quit)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ncalcmanualclosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ncalcmanualclosing
        this.setVisible(false);
        new NCalcMain().setVisible(true);
    }//GEN-LAST:event_ncalcmanualclosing

    private void ncalcmanualopened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ncalcmanualopened
        Properties conffile = new Properties();
        try {
            conffile.load(new FileInputStream(datadir + "config.yml"));
        } catch(IOException ex) {
            System.out.println("[Manual] -> " + ex);
        }
        
        Properties enus = new Properties();
        try {
            enus.load(NCalcMain.class.getResourceAsStream("/lang/en_US.properties"));
        } catch(IOException ex) {
            System.out.println("[Manual] -> [FATAL] -> " + ex);
        }
        
        Properties ruru = new Properties();
        try {
            ruru.load(NCalcMain.class.getResourceAsStream("/lang/ru_RU.properties"));
        } catch(IOException ex) {
            System.out.println("[Manual] -> [FATAL] -> " + ex);
        }
        
        if(conffile.getProperty("lang").startsWith("en_US")) {
            this.setTitle(enus.getProperty("manualtitle"));
            manualtext0.setText(enus.getProperty("manualtext0"));
            manualtext1.setText(enus.getProperty("manualtext1"));
            manualtext2.setText(enus.getProperty("manualtext2"));
            manualtext3.setText(enus.getProperty("manualtext3"));
            manualtext4.setText(enus.getProperty("manualtext4"));
            manualtext5.setText(enus.getProperty("manualtext5"));
            manualtext6.setText(enus.getProperty("manualtext6"));
            manualtext7.setText(enus.getProperty("manualtext7"));
            manualtext8.setText(enus.getProperty("manualtext8"));
            manualtext9.setText(enus.getProperty("manualtext9"));
            manualtext10.setText(enus.getProperty("manualtext10"));
            manualtext11.setText(enus.getProperty("manualtext11"));
            quit.setText(enus.getProperty("close"));
        }
        
        if(conffile.getProperty("lang").startsWith("ru_RU")) {
            this.setTitle(ruru.getProperty("manualtitle"));
            manualtext0.setText(ruru.getProperty("manualtext0"));
            manualtext1.setText(ruru.getProperty("manualtext1"));
            manualtext2.setText(ruru.getProperty("manualtext2"));
            manualtext3.setText(ruru.getProperty("manualtext3"));
            manualtext4.setText(ruru.getProperty("manualtext4"));
            manualtext5.setText(ruru.getProperty("manualtext5"));
            manualtext6.setText(ruru.getProperty("manualtext6"));
            manualtext7.setText(ruru.getProperty("manualtext7"));
            manualtext8.setText(ruru.getProperty("manualtext8"));
            manualtext9.setText(ruru.getProperty("manualtext9"));
            manualtext10.setText(ruru.getProperty("manualtext10"));
            manualtext11.setText(ruru.getProperty("manualtext11"));
            quit.setText(ruru.getProperty("close"));
        }
        
    }//GEN-LAST:event_ncalcmanualopened

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        this.setVisible(false);
        new NCalcMain().setVisible(true);
    }//GEN-LAST:event_quitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel manualtext0;
    private javax.swing.JLabel manualtext1;
    private javax.swing.JLabel manualtext10;
    private javax.swing.JLabel manualtext11;
    private javax.swing.JLabel manualtext2;
    private javax.swing.JLabel manualtext3;
    private javax.swing.JLabel manualtext4;
    private javax.swing.JLabel manualtext5;
    private javax.swing.JLabel manualtext6;
    private javax.swing.JLabel manualtext7;
    private javax.swing.JLabel manualtext8;
    private javax.swing.JLabel manualtext9;
    private javax.swing.JButton quit;
    // End of variables declaration//GEN-END:variables
}
