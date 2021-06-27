package me.sanyasho.ncalc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class NCalcMain extends javax.swing.JFrame {

    public String year = "2021";
    public String srclink = "https://github.com/SanyaSho/NCalc";
    public String appversion = "1.0";
    
    public NCalcMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        save = new javax.swing.JButton();
        lang = new javax.swing.JComboBox<>();
        langtext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nether Calculator");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                ncalcopened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
                .addGap(0, 12, Short.MAX_VALUE))
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

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        lang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Russian" }));

        langtext.setText("Language:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(xpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(calculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modetext)
                            .addComponent(langtext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lang, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(mode, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modetext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lang)
                        .addComponent(langtext)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(xpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculate)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        
        // Shitcode here.
        
        // Mount config
        Properties conffile = new Properties();
        try {
            conffile.load(new FileInputStream("config.yml"));
        } catch(IOException ex) {}
        
        int X = (int) xin.getValue();
        int Z = (int) zin.getValue();
        
        if(mode.getSelectedItem() == "Nether to Overworld") {
            
            String XEND = String.valueOf(X*8);
            String ZEND = String.valueOf(Z*8);
            
            xout.setText(XEND);
            zout.setText(ZEND);
            
            System.out.println("=-=-=-=-=-=-={CALC}=-=-=-=-=-=-=");
            // Very good code.
            System.out.println("Mode: " + mode.getSelectedItem());
            System.out.println("X in Overworld: " + XEND + "; X in Nether: " + xin.getValue());
            System.out.println("Z in Overworld: " + ZEND + "; Z in Nether: " + zin.getValue());
            System.out.println("=-=-=-=-=-=-={GOOD}=-=-=-=-=-=-=");
            
        } else {
            
            String XEND = String.valueOf(X/8);
            String ZEND = String.valueOf(Z/8);
            
            xout.setText(XEND);
            zout.setText(ZEND);
            
            System.out.println("=-=-=-=-=-=-={CALC}=-=-=-=-=-=-=");
            // Very good code. (X2)
            System.out.println("Mode: " + mode.getSelectedItem());
            System.out.println("X in Nether: " + XEND + "; X in Overworld: " + xin.getValue());
            System.out.println("Z in Nether: " + ZEND + "; Z in Overworld: " + zin.getValue());
            System.out.println("=-=-=-=-=-=-={GOOD}=-=-=-=-=-=-=");
            
        }
        
    }//GEN-LAST:event_calculateActionPerformed

    private void ncalcopened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ncalcopened
        
        // Mount config
        Properties conffile = new Properties();
        try {
            conffile.load(new FileInputStream("config.yml"));
        } catch(IOException ex) {}
        
        // Copyright
        System.out.println("Copyright SanyaSho " + year + ". All right reserved.");
        System.out.println("The source code can be found here: " + srclink);
        System.out.println("Version: " + appversion);
        
        // Config
        File configfile = new File("config.yml");
        if (!configfile.exists()) {
            boolean result = false;
            try {
                configfile.createNewFile();
                result = true;
            } catch(SecurityException | IOException se) {} if(result) {}
        }
        
    }//GEN-LAST:event_ncalcopened

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        
        // Mount config
        Properties conffile = new Properties();
        try {
            conffile.load(new FileInputStream("config.yml"));
        } catch(IOException ex) {}
        
        // Write config
        Properties writeconfigfile = new Properties();
        try {
            // Properties
            writeconfigfile.setProperty("lang", lang.getSelectedItem().toString());
            
            // Write
            writeconfigfile.store(new FileOutputStream("config.yml"), null);
            
        } catch (FileNotFoundException ex) {} catch (IOException ex) {}
        
    }//GEN-LAST:event_saveActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NCalcMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> lang;
    private javax.swing.JLabel langtext;
    private javax.swing.JComboBox<String> mode;
    private javax.swing.JLabel modetext;
    private javax.swing.JButton save;
    private javax.swing.JSpinner xin;
    private javax.swing.JTextField xout;
    private javax.swing.JPanel xpanel;
    private javax.swing.JSpinner zin;
    private javax.swing.JTextField zout;
    private javax.swing.JPanel zpanel;
    // End of variables declaration//GEN-END:variables
}
