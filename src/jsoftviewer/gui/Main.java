/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsoftviewer.gui;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import jsoftviewer.FileProcessor;
import jsoftviewer.LayoutReader;
import jsoftviewer.ModuleNamePosition;
import jsoftviewer.TableFiller;

/**
 *
 * @author roger
 */
public class Main extends javax.swing.JFrame {

    private LayoutReader reader;
    private String fileExtension;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        reader = new LayoutReader();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPanelFileLines = new javax.swing.JScrollPane();
        tableFileLines = new javax.swing.JTable();
        scrollPanelTableInformations = new javax.swing.JScrollPane();
        tableInformations = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        spinnerLineNumber = new javax.swing.JSpinner();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemOpen = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        editItemSettings = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuItemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JSoftViewer - BETA");
        setMinimumSize(new java.awt.Dimension(640, 480));

        tableFileLines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableFileLines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFileLinesMouseClicked(evt);
            }
        });
        scrollPanelFileLines.setViewportView(tableFileLines);

        tableInformations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        scrollPanelTableInformations.setViewportView(tableInformations);

        jButton1.setText(">>");

        jButton2.setText("<<");

        spinnerLineNumber.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spinnerLineNumber.setMinimumSize(new java.awt.Dimension(35, 26));
        spinnerLineNumber.setName(""); // NOI18N

        menuFile.setText("File");

        menuItemOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuItemOpen.setText("Open");
        menuItemOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemOpenActionPerformed(evt);
            }
        });
        menuFile.add(menuItemOpen);

        menuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuItemExit.setText("Exit");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        menuFile.add(menuItemExit);

        menuBar.add(menuFile);

        menuEdit.setText("Edit");

        editItemSettings.setText("Settings");
        editItemSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editItemSettingsActionPerformed(evt);
            }
        });
        menuEdit.add(editItemSettings);

        menuBar.add(menuEdit);

        menuHelp.setText("Help");

        menuItemAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuItemAbout.setText("About");
        menuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAboutActionPerformed(evt);
            }
        });
        menuHelp.add(menuItemAbout);

        menuBar.add(menuHelp);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanelFileLines, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerLineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPanelTableInformations, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(scrollPanelFileLines, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(spinnerLineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPanelTableInformations, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addGap(196, 196, 196)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemOpenActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser("C:\\");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Output files", "txt", "fop", "rem");

        jfc.setFileFilter(filter);
        int returnValue = jfc.showOpenDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                FileProcessor fp = new FileProcessor(jfc.getSelectedFile());

                //armazena a extensão do arquivo
                String fileName = jfc.getSelectedFile().getName();
                this.fileExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());

                //determina o modelo da tabela
                tableFileLines.setModel(TableFiller.fill(fp.process(), new String[]{"Line","Line Values"}));
                tableFileLines.repaint();

                this.spinnerLineNumber.setModel(new SpinnerNumberModel(0, 0, this.tableFileLines.getModel().getRowCount(), 1));
                System.out.println(this.tableFileLines.getModel().getRowCount());

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }


    }//GEN-LAST:event_menuItemOpenActionPerformed

    private void tableFileLinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFileLinesMouseClicked
        // TODO add your handling code here:

        System.out.println(tableFileLines.getSelectedRow());
        String lineValue = (String) tableFileLines.getModel().getValueAt(tableFileLines.getSelectedRow(), 1);
        DefaultTableModel model;

        //atualiza o spinner com o número da linha
        this.spinnerLineNumber.setValue(tableFileLines.getSelectedRow() + 1);

        try {

            //busca a posição do nome do módulo
            int[] modNamePosition = getModNamePosition(fileExtension);

            System.out.println(modNamePosition[0] + " " + modNamePosition[1]);

            model = TableFiller.fillWithModule(lineValue, reader, modNamePosition[0], modNamePosition[1]);
            if (model != null) {
                tableInformations.setModel(model);
                tableInformations.repaint();
            } else {
                JOptionPane.showMessageDialog(null, "There aren't any registered layout for this selection.", "JSoftViewer", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (ParseException ex) {
            ex.printStackTrace();
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_tableFileLinesMouseClicked

    /* retorna o início e o fim do nome do módulo conforme a extensão do arquivo*/
    private int[] getModNamePosition(String fileExtension) {
        int beginEnd[] = new int[2];

        System.out.println(fileExtension);

        if (this.fileExtension != null) {
            switch (fileExtension.toLowerCase()) {
                // arquivo geral
                case ".fop":
                    beginEnd[0] = ModuleNamePosition.FOP_BEGIN.value;
                    beginEnd[1] = ModuleNamePosition.FOP_END.value;
                    break;
                // arquivo remessa
                case ".rem":
                    beginEnd[0] = ModuleNamePosition.REM_BEGIN.value;
                    beginEnd[1] = ModuleNamePosition.REM_END.value;
                    break;

                default:
                    beginEnd[0] = ModuleNamePosition.FOP_BEGIN.value;
                    beginEnd[1] = ModuleNamePosition.FOP_END.value;
                    break;
            }
        }

        return beginEnd;
    }

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void menuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAboutActionPerformed
        // TODO add your handling code here:
        About about = new About();
        about.setVisible(true);
    }//GEN-LAST:event_menuItemAboutActionPerformed

    private void editItemSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editItemSettingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editItemSettingsActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem editItemSettings;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuItemAbout;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemOpen;
    private javax.swing.JScrollPane scrollPanelFileLines;
    private javax.swing.JScrollPane scrollPanelTableInformations;
    private javax.swing.JSpinner spinnerLineNumber;
    private javax.swing.JTable tableFileLines;
    private javax.swing.JTable tableInformations;
    // End of variables declaration//GEN-END:variables
}
