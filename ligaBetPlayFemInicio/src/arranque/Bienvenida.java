
package arranque;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vistas.PlantillaStf;
import vistas.americaFrame2021;
import vistas.caliFrame2021;
import vistas.depHuilaFrame2021;
import vistas.goleadorasSantaFe2021;
import vistas.historialEquipos;
import vistas.santafeFrame_2021;


public class Bienvenida extends javax.swing.JFrame {

    public Bienvenida() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("Bienvenida - Liga Bet Play");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        clean_panelGeneral = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmb_1 = new javax.swing.JMenu();
        sta_0 = new javax.swing.JMenuItem();
        cali_0 = new javax.swing.JMenuItem();
        huila_0 = new javax.swing.JMenuItem();
        amer_0 = new javax.swing.JMenuItem();
        jmb_2 = new javax.swing.JMenu();
        sta_1 = new javax.swing.JMenuItem();
        cali_1 = new javax.swing.JMenuItem();
        huila_1 = new javax.swing.JMenuItem();
        amer_1 = new javax.swing.JMenuItem();
        historial = new javax.swing.JMenu();
        historialvar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 181, 230));

        jPanel1.setBackground(new java.awt.Color(51, 181, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Liga Bet Play Femenina – Conmebol Libertadores (2018) Estadísticas Rendimiento Técnico/Táctico");

        jPanel2.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1184, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        clean_panelGeneral.setText("LIMPIAR PANEL");
        clean_panelGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clean_panelGeneralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clean_panelGeneral)
                .addGap(31, 31, 31)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(445, 445, 445))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clean_panelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 204, 255));
        jMenuBar1.setBorder(null);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setName(""); // NOI18N

        jmb_1.setText("2021");
        jmb_1.setPreferredSize(new java.awt.Dimension(100, 30));

        sta_0.setText("Santa Fe");
        sta_0.setPreferredSize(new java.awt.Dimension(180, 30));
        sta_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sta_0ActionPerformed(evt);
            }
        });
        jmb_1.add(sta_0);

        cali_0.setText("Cali");
        cali_0.setPreferredSize(new java.awt.Dimension(180, 30));
        cali_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cali_0ActionPerformed(evt);
            }
        });
        jmb_1.add(cali_0);

        huila_0.setText("Dep. Huila");
        huila_0.setPreferredSize(new java.awt.Dimension(180, 30));
        huila_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huila_0ActionPerformed(evt);
            }
        });
        jmb_1.add(huila_0);

        amer_0.setText("America");
        amer_0.setPreferredSize(new java.awt.Dimension(180, 30));
        amer_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amer_0ActionPerformed(evt);
            }
        });
        jmb_1.add(amer_0);

        jMenuBar1.add(jmb_1);

        jmb_2.setText("2022");
        jmb_2.setPreferredSize(new java.awt.Dimension(100, 30));

        sta_1.setText("Santa Fe");
        sta_1.setPreferredSize(new java.awt.Dimension(180, 30));
        jmb_2.add(sta_1);

        cali_1.setText("Cali");
        cali_1.setPreferredSize(new java.awt.Dimension(180, 30));
        cali_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cali_1ActionPerformed(evt);
            }
        });
        jmb_2.add(cali_1);

        huila_1.setText("Dep. Huila");
        huila_1.setPreferredSize(new java.awt.Dimension(180, 30));
        jmb_2.add(huila_1);

        amer_1.setText("America");
        amer_1.setPreferredSize(new java.awt.Dimension(180, 30));
        amer_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amer_1ActionPerformed(evt);
            }
        });
        jmb_2.add(amer_1);

        jMenuBar1.add(jmb_2);

        historial.setText("Historial Total");
        historial.setPreferredSize(new java.awt.Dimension(100, 30));
        historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialActionPerformed(evt);
            }
        });

        historialvar.setText("Historial");
        historialvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialvarActionPerformed(evt);
            }
        });
        historial.add(historialvar);

        jMenuBar1.add(historial);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botón para salir
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
        System.exit(0);

    }//GEN-LAST:event_btnSalirActionPerformed

    private void cali_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cali_0ActionPerformed
        caliFrame2021 caliFrame2021 = new caliFrame2021();
        jPanel2.add(caliFrame2021);
        caliFrame2021.setVisible(true);
    }//GEN-LAST:event_cali_0ActionPerformed

    private void amer_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amer_0ActionPerformed
        americaFrame2021 americaFrame2021 = new americaFrame2021();
        jPanel2.add(americaFrame2021);
        americaFrame2021.setVisible(true);
    }//GEN-LAST:event_amer_0ActionPerformed

    private void cali_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cali_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cali_1ActionPerformed

    private void amer_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amer_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amer_1ActionPerformed

    //ventana emergente para sAnta fe 2021
    //
    private void sta_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sta_0ActionPerformed
        santafeFrame_2021 santafeFrame_2021 = new santafeFrame_2021();
        jPanel2.add(santafeFrame_2021);
        santafeFrame_2021.setVisible(true);
    }//GEN-LAST:event_sta_0ActionPerformed

    private void clean_panelGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clean_panelGeneralActionPerformed
        this.jPanel2.removeAll();
        this.jPanel2.repaint();
    }//GEN-LAST:event_clean_panelGeneralActionPerformed

    private void historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialActionPerformed
         
//        historialEquipos historialEquipos = new historialEquipos();
//        jPanel2.add(historialEquipos);
//        historialEquipos.setVisible(true);
        
//        historialEquipos historialEquipos = new historialEquipos();
//        jPanel2.add(historialEquipos);
//        try {
//            historialEquipos.setMaximum(true);
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(jPanel2.class.getName()).log(Level.SEVERE , null, ex);
//        }
//        
//        historialEquipos.show();
//        
//        // Agregar el panel al JFrame
//        jPanel2.revalidate();
//        jPanel2.repaint();
//        jPanel2.setVisible(true);
        
    }//GEN-LAST:event_historialActionPerformed

    private void historialvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialvarActionPerformed
        historialEquipos historialEquipos = new historialEquipos();
        jPanel2.add(historialEquipos);
        historialEquipos.setVisible(true);
    }//GEN-LAST:event_historialvarActionPerformed

    private void huila_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huila_0ActionPerformed
        
        depHuilaFrame2021 depHuilaFrame2021 = new depHuilaFrame2021();
        jPanel2.add(depHuilaFrame2021);
        depHuilaFrame2021.setVisible(true);
    }//GEN-LAST:event_huila_0ActionPerformed

    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem amer_0;
    private javax.swing.JMenuItem amer_1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuItem cali_0;
    private javax.swing.JMenuItem cali_1;
    private javax.swing.JButton clean_panelGeneral;
    private javax.swing.JMenu historial;
    private javax.swing.JMenuItem historialvar;
    private javax.swing.JMenuItem huila_0;
    private javax.swing.JMenuItem huila_1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu jmb_1;
    private javax.swing.JMenu jmb_2;
    private javax.swing.JMenuItem sta_0;
    private javax.swing.JMenuItem sta_1;
    // End of variables declaration//GEN-END:variables
}
