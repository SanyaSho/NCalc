package me.sanyasho.ncalc;

import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class NCalcSettings extends javax.swing.JFrame {

    public NCalcSettings() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        langtext = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        lang = new javax.swing.JComboBox<>();
        defmodetext = new javax.swing.JLabel();
        defmode = new javax.swing.JComboBox<>();
        close = new javax.swing.JButton();

        setTitle("Nether Calculator - Settings");
        setIconImage(new ImageIcon(getClass().getResource("/assets/textures/gui/dynmap/markers/gear.png")).getImage());
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                ncalcoptionsclosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                ncalcoptionsopened(evt);
            }
        });

        langtext.setText("Language:");

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/textures/gui/apply.png"))); // NOI18N
        save.setText("Save");
        save.setIconTextGap(2);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        lang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Russian" }));

        defmodetext.setText("Default mode:");

        defmode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nether to Overworld", "Overworld to Nether" }));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/textures/gui/cancel.png"))); // NOI18N
        close.setText("Close");
        close.setIconTextGap(2);
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(langtext)
                            .addComponent(defmodetext))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(defmode, 0, 170, Short.MAX_VALUE)
                            .addComponent(lang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(langtext)
                    .addComponent(lang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defmodetext)
                    .addComponent(defmode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(close))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ncalcoptionsclosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ncalcoptionsclosing
        new NCalcMain().setVisible(true);
    }//GEN-LAST:event_ncalcoptionsclosing

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        // Mount config
        Properties conffile = new Properties();
        try {
            conffile.load(new FileInputStream("config.yml"));
        } catch(IOException ex) {
            System.out.println("[Options] -> " + ex);
        }
        
        // Default Mode
        if(defmode.getSelectedItem() == "Nether to Overworld") {
            System.setProperty("defmode", "1");
        } else {
            System.setProperty("defmode", "2");
        }
        
        // Language
        if(lang.getSelectedItem() == "English") {
            System.setProperty("applang", "en_US");
        }
        if(lang.getSelectedItem() == "Russian") {
            System.setProperty("applang", "ru_RU");
        }
        
        // Write config
        Properties writeconfigfile = new Properties();
        try {
            // Properties
            writeconfigfile.setProperty("lang", System.getProperty("applang"));
            writeconfigfile.setProperty("defmode", System.getProperty("defmode"));
            
            // Write
            writeconfigfile.store(new FileOutputStream("config.yml"), null);

        } catch (FileNotFoundException ex) {
            System.out.println("[Options] -> " + ex);
        } catch (IOException ex) {
            System.out.println("[Options] -> [FATAL] -> " + ex);
        }

    }//GEN-LAST:event_saveActionPerformed

    private void ncalcoptionsopened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ncalcoptionsopened
        
        System.setProperty("devmode", "0");
        if(System.getProperty("devmode").startsWith("1")) {
            System.out.println("[CLASS] -> " + '"'+NCalcSettings.class.getName()+'"');
        } else {}
        
        Properties conffile = new Properties();
        try {
            conffile.load(new FileInputStream("config.yml"));
        } catch(IOException ex) {
            System.out.println("[Options] -> " + ex);
        }
        
        Properties enus = new Properties();
        try {
            enus.load(NCalcSettings.class.getResourceAsStream("/assets/lang/en_US.properties"));
        } catch(IOException ex) {
            System.out.println("[Options] -> [FATAL] -> " + ex);
        }
        
        Properties ruru = new Properties();
        try {
            ruru.load(NCalcSettings.class.getResourceAsStream("/assets/lang/ru_RU.properties"));
        } catch(IOException ex) {
            System.out.println("[Options] -> [FATAL] -> " + ex);
        }
        
        if(conffile.getProperty("lang").startsWith("en_US")) {
            
            this.setTitle(enus.getProperty("optionstitle"));
            langtext.setText(enus.getProperty("langtext") + ":");
            save.setText(enus.getProperty("save"));
            close.setText(enus.getProperty("close"));
            defmodetext.setText(enus.getProperty("defmodetext") + ":");
            
            lang.setSelectedItem("English");
        }
        
        if(conffile.getProperty("lang").startsWith("ru_RU")) {
            
            this.setTitle(ruru.getProperty("optionstitle"));
            langtext.setText(ruru.getProperty("langtext") + ":");
            save.setText(ruru.getProperty("save"));
            close.setText(ruru.getProperty("close"));
            defmodetext.setText(ruru.getProperty("defmodetext") + ":");
            
            lang.setSelectedItem("Russian");
        }
        
        if(conffile.getProperty("defmode").startsWith("1")) {
            defmode.setSelectedItem("Nether to Overworld");
        }
        
        if(conffile.getProperty("defmode").startsWith("2")) {
            defmode.setSelectedItem("Overworld to Nether");
        }
    }//GEN-LAST:event_ncalcoptionsopened

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false);
        new NCalcMain().setVisible(true);
    }//GEN-LAST:event_closeActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new NCalcSettings().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JComboBox<String> defmode;
    private javax.swing.JLabel defmodetext;
    private javax.swing.JComboBox<String> lang;
    private javax.swing.JLabel langtext;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
