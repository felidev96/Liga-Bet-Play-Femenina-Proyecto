
package vistas;

import javax.swing.JScrollPane;


public class PlantillaStf extends javax.swing.JInternalFrame {


    public PlantillaStf() {
        initComponents();
        JScrollPane scrollPane;
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setText("Plantilla");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"22", "M. Díaz", "15", "Porteras"},
                {"25", "	L. Reyes", "18", "Porteras"},
                {"12", "	Y. Velásquez", "34", "Porteras"},
                {"1", "	V. Gonzalez", "21", "Porteras"},
                {"1", "V. González", "21", "Porteras"},
                {"5", "N. Rangel", "30", "Defensas"},
                {"21", "K. Ibargüen", "20", "Defensas"},
                {"14", "V. Gómez", "21", "Defensas"},
                {"10", "M. Reyes", "21", "Defensas"},
                {"6", "N. Acosta", "24", "Defensas"},
                {"4", "	A. Pérez", "21", "Defensas"},
                {"7", "	D. Lambraño", "20", "Defensas"},
                {"16", "S. García", "22", "Defensas"},
                {"15", "W. Cardenas", "28", "Centrocampistas"},
                {"19", "A. Huertas", "32", "Centrocampistas"},
                {"23", "M. Baldallo", "23", "Centrocampistas"},
                {"26", "	L. Salazar", "31", "Centrocampistas"},
                {"28", "	S. Pineda", "17", "Centrocampistas"},
                {"8", "P. García", "30", "Centrocampistas"},
                {"27", "D. Gaviria", "20", "Centrocampistas"},
                {"13", "	D. Lucero", "26", "Centrocampistas"},
                {"3", "	L. Tovar", "16", "Centrocampistas"},
                {"20", "	K. Viancha", "17", "Centrocampistas"},
                {"7", "D. Garavito", "18", "Centrocampistas"},
                {"30", "N. Rojas", "16", "Delanteros"},
                {"11", "H. Mosquera", "27", "Delanteros"},
                {"17", "G. Florez", "25", "Delanteros"},
                {"29", "	P. Quiroga", "18", "Delanteros"},
                {"9", "E. Higuera", "22", "Delanteros"},
                {"24", "O. Velásquez", "34", "Delanteros"}
            },
            new String [] {
                "Dorsal", "Jugadora", "Edad", "Posición"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(177, 177, 177))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
