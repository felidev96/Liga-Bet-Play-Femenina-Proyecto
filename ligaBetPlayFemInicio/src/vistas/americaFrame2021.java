
package vistas;

import java.awt.Dimension;
import java.beans.PropertyVetoException;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felip
 */
public class americaFrame2021 extends javax.swing.JInternalFrame {

    
    public americaFrame2021() {
        
        initComponents();
        this.setLocation(5, 5);
        //this.setSize(new Dimension (300, 400));
        this.setTitle("America de Cali - Liga Bet Play 2021"); 
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campeonStaf1 = new javax.swing.JButton();
        gol_staf1 = new javax.swing.JButton();
        clean = new javax.swing.JButton();
        jLabel_santaInf = new javax.swing.JLabel();
        plantilla_stfa1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 0, 0));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Santa Fe 2021");
        setFrameIcon(null);
        setName(""); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("America - 2021");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 140, 30));

        campeonStaf1.setText("Estado Campeonato");
        campeonStaf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campeonStaf1ActionPerformed(evt);
            }
        });
        getContentPane().add(campeonStaf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        gol_staf1.setText("Goleadoras");
        gol_staf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gol_staf1ActionPerformed(evt);
            }
        });
        getContentPane().add(gol_staf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        clean.setText("Limpiar Tablero");
        clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanActionPerformed(evt);
            }
        });
        getContentPane().add(clean, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));
        getContentPane().add(jLabel_santaInf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 460, 280));

        plantilla_stfa1.setText("Plantilla");
        plantilla_stfa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plantilla_stfa1ActionPerformed(evt);
            }
        });
        getContentPane().add(plantilla_stfa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 60, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campeonStaf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campeonStaf1ActionPerformed
        CampeonTem2021 CampeonTem2021= new CampeonTem2021();
        jLabel_santaInf.add(CampeonTem2021);
        try {
            CampeonTem2021.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(americaFrame2021.class.getName()).log(Level.SEVERE , null, ex);
        }
        CampeonTem2021.setVisible(true);

    }//GEN-LAST:event_campeonStaf1ActionPerformed

    private void cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanActionPerformed
        this.jLabel_santaInf.removeAll();
        this.jLabel_santaInf.repaint();
        
    }//GEN-LAST:event_cleanActionPerformed

    private void gol_staf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gol_staf1ActionPerformed
        goleadorasSantaFe2021 goleadorasSantaFe2021 = new goleadorasSantaFe2021();
        jLabel_santaInf.add(goleadorasSantaFe2021);
        try {
            goleadorasSantaFe2021.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(americaFrame2021.class.getName()).log(Level.SEVERE , null, ex);
        }
        
        goleadorasSantaFe2021.show();
        
        // Agregar el panel al JFrame
        jLabel_santaInf.revalidate();
        jLabel_santaInf.repaint();
        jLabel_santaInf.setVisible(true);
    }//GEN-LAST:event_gol_staf1ActionPerformed

    private void plantilla_stfa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plantilla_stfa1ActionPerformed
        PlantillaStf PlantillaStf = new PlantillaStf();
        jLabel_santaInf.add(PlantillaStf);
        try {
            PlantillaStf.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(americaFrame2021.class.getName()).log(Level.SEVERE , null, ex);
        }
        
        PlantillaStf.show();
        
        // Agregar el panel al JFrame
        jLabel_santaInf.setVisible(true);
    }//GEN-LAST:event_plantilla_stfa1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton campeonStaf1;
    private javax.swing.JButton clean;
    private javax.swing.JButton gol_staf1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_santaInf;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton plantilla_stfa1;
    // End of variables declaration//GEN-END:variables

}
