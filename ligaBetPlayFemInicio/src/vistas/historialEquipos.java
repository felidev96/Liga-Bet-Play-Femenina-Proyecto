
package vistas;

/**
 *
 * @author felip
 */
public class historialEquipos extends javax.swing.JInternalFrame {

    
    public historialEquipos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Santa Fe", "7", "3", "1", "106", "Bogotá", "0"},
                {"América de Cali", "7", "2", "2", "102", "Cali", "0"},
                {"Atlético Nacional", "6", "0", "1", "78", "Medellín", "0"},
                {"Independiente Medellín", "5", "0", "1", "68", "Medellín", "0"},
                {"Deportivo Cali", "5", "1", "1", "66", "Cali", "0"},
                {"Atlético Huila", "5", "1", "1", "74", "Huila", null},
                {"Cortuluá", "5", "0", "0", "68", "Yumbo", "0"},
                {"Deportivo Pereira", "5", "0", "0", "66", "Pereira", "0"},
                {"Millonarios", "5", "0", "0", "64", "Bogotá", "0"},
                {"La Equidad", "7", "0", "0", "62", "Bogotá", "0"},
                {"Junior", "5", "0", "0", "58", "Barranquilla", "0"},
                {"Orsomarso", "4", "0", "0", "44", "Palmira", "0"},
                {"Atlético Bucaramanga", "7", "0", "0", "78", "Bucaramanga", "0"},
                {"Real Santander", "6", "0", "0", "76", "San Andres", "0"},
                {"Llaneros", "4", "0", "0", "50", "Villavicencio", "0"},
                {"Fortaleza CEIF", "6", "0", "0", "58", "Envigado", "0"},
                {"Envigado F. C.", "2", "0", "0", "20", "Tolima", "0"}
            },
            new String [] {
                "Equipos", "Temporadas", "Estrellas", "Subtitulos", "Puntos", "Ciudad", "Titulos Internacionales"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Clasificación Historica");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(409, 409, 409)
                .addComponent(jLabel1)
                .addContainerGap(427, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
