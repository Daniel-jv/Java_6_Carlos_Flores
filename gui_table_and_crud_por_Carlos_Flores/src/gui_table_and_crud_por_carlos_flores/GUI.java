package gui_table_and_crud_por_carlos_flores;

import java.awt.BorderLayout;
import java.awt.event.ContainerListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame {

    static int actual = 0;
    static int position = 0;
    static int rows = 0;
    static DefaultTableModel model;
    
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        DatosC = new javax.swing.JButton();
        FilaM = new javax.swing.JButton();
        FilaC = new javax.swing.JButton();
        FilaE = new javax.swing.JButton();
        Acerca = new javax.swing.JButton();
        nameP = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        nuevoAlumno = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        contF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        if(tabla.getSelectedRow() == -1){
            nameP.setVisible(false);
        }else{
            nameP.setVisible(true);
        }

        tabla.setAutoCreateRowSorter(true);
        tabla.setBackground(java.awt.Color.white);
        tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Cuenta", "Presente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setDragEnabled(true);
        tabla.setGridColor(new java.awt.Color(51, 102, 255));
        tabla.setMinimumSize(new java.awt.Dimension(60, 60));
        tabla.setRequestFocusEnabled(false);
        tabla.setRowSorter(null);
        tabla.setSelectionBackground(new java.awt.Color(0, 102, 255));
        tabla.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.setShowGrid(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
        }

        DatosC.setText("Cargar Datos");
        DatosC.setMinimumSize(new java.awt.Dimension(70, 27));
        DatosC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatosCActionPerformed(evt);
            }
        });

        FilaM.setText("Modificar Fila");
        FilaM.setMinimumSize(new java.awt.Dimension(70, 27));
        FilaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilaMActionPerformed(evt);
            }
        });

        FilaC.setText("Crear Nueva Fila");
        FilaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilaCActionPerformed(evt);
            }
        });

        FilaE.setText("Eliminar Fila");
        FilaE.setMinimumSize(new java.awt.Dimension(70, 27));
        FilaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilaEActionPerformed(evt);
            }
        });

        Acerca.setText("Acerca");
        Acerca.setMinimumSize(new java.awt.Dimension(70, 27));
        Acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercaActionPerformed(evt);
            }
        });

        nameP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nameP.setMinimumSize(new java.awt.Dimension(380, 72));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre:");

        nombre.setMinimumSize(new java.awt.Dimension(10, 26));
        nombre.setPreferredSize(new java.awt.Dimension(20, 26));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Apellido:");

        apellido.setMinimumSize(new java.awt.Dimension(10, 26));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        nuevoAlumno.setText("Aceptar");
        nuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoAlumnoActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout namePLayout = new javax.swing.GroupLayout(nameP);
        nameP.setLayout(namePLayout);
        namePLayout.setHorizontalGroup(
            namePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nuevoAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(23, 23, 23))
        );
        namePLayout.setVerticalGroup(
            namePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(namePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(namePLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(namePLayout.createSequentialGroup()
                        .addGroup(namePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(namePLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(namePLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(namePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nuevoAlumno)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(19, Short.MAX_VALUE))))
        );

        contF.setBackground(java.awt.Color.white);
        contF.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        contF.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FilaE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FilaM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FilaC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(DatosC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addComponent(Acerca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(DatosC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilaC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Acerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contF, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FilaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilaEActionPerformed
        model = (DefaultTableModel) tabla.getModel();
        if(tabla.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "No hay ninguna fila seleccionada.");
        }else{
            int remove = tabla.getSelectedRow();
            model.removeRow(remove);
            rows = tabla.getRowCount();
            if(rows == 0){
                DatosC.setEnabled(true);
                FilaM.setEnabled(false);
                FilaE.setEnabled(false);
            }else{
                tabla.setRowSelectionInterval(0, 0);
            }
        }
        rows = tabla.getRowCount();
        contF.setText(rows + " filas");
        if(tabla.getSelectedRow() == -1){
            nameP.setVisible(false);
        }else{
            nameP.setVisible(true);
            Vector name = model.getDataVector().elementAt(tabla.getSelectedRow());
            nombre.setText((String) name.get(0));
            apellido.setText((String) name.get(1));
        }
    }//GEN-LAST:event_FilaEActionPerformed

    private void AcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaActionPerformed
        model = (DefaultTableModel) tabla.getModel();
        JOptionPane.showMessageDialog(null, "Gui_Table_and_Crud_por_Carlos_Flores el 26-05-2024");
        if(tabla.getSelectedRow() == -1){
            nameP.setVisible(false);
        }else{
            nameP.setVisible(true);
        }
    }//GEN-LAST:event_AcercaActionPerformed

    private void DatosCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatosCActionPerformed
        model = (DefaultTableModel) tabla.getModel();
        ArrayList<String> estudiantes = new ArrayList();
        estudiantes.add("GABRIEL ERNESTO MEJIA BARCENAS");
        estudiantes.add("JOSE FERNANDO ALVAREZ BECERRA");
        estudiantes.add("HALMAR ANDRES ORDOÑEZ BULNES");
        estudiantes.add("MAXIMINO JOSE RODRIGUEZ CALIX");
        estudiantes.add("ANDRE IBRAHIM NAVAS CASCO");
        estudiantes.add("NAHUN FRANCISCO VASQUEZ CASTAÑEDA");
        estudiantes.add("AYLEEN DANIEL ESCOBAR CRUZ");
        estudiantes.add("JAFET ANTONIO XIRUI HOU DIAZ");
        estudiantes.add("SALVADOR IGNACIO MACIAS ESTRADA");
        estudiantes.add("ERICK DANIEL HERNANDEZ GARCIA");
        estudiantes.add("DAVID EMANUEL GARCIA GOMEZ");
        estudiantes.add("ANDRE HECHENBICHLER");
        estudiantes.add("JOSE ROBERTO SERON HERNANDEZ");
        estudiantes.add("BRYAN JOSE ARITA LOPEZ");
        estudiantes.add("JULIO ARIEL CARCAMO MERLO");
        estudiantes.add("LIA DARIELLA ERAZO MILLA");
        estudiantes.add("HANNE MICHELLE MENDOZA NUÑEZ");
        estudiantes.add("MIGUEL ANGEL MORAN NUÑEZ");
        estudiantes.add("EDUARDO JOSE VALDEZ ORTEZ");
        estudiantes.add("JONATAN JAZIEL VALLECILLO PEÑA");
        estudiantes.add("AARON ANTONIO CASTILLO PINEDA");
        estudiantes.add("JOEL EDGARDO FUENTES PINEDA");
        estudiantes.add("EXDI ABIMELEKH MATAMOROS RAMOS");
        estudiantes.add("Gabriel ALEXIS MEJIA SERVELLON");
        estudiantes.add("CARLOS ADRIAN DOMINGUEZ TORRES");
        estudiantes.add("JOSE DAVID RODRIGUEZ VELASQUEZ");
        for (int i = 0; i < estudiantes.size(); i++) {
            Vector row = new Vector();
            String cadena = estudiantes.get(i);
            String [] cadenas = cadena.split(" ");
            
            if(cadenas.length == 2){
                row.add(cadenas[0]);
                row.add(cadenas[1]);
            }else{
                row.add(cadenas[0]+" "+cadenas[1]);
                row.add(cadenas[2]+" "+cadenas[3]);
            }
            row.add("-");
            model.addRow(row);
        }
        rows = 26;
        DatosC.setEnabled(false);
        FilaM.setEnabled(true);
        FilaE.setEnabled(true);
        contF.setText(rows + " filas");
        rows = tabla.getRowCount();
    }//GEN-LAST:event_DatosCActionPerformed

    private void FilaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilaCActionPerformed
        nameP.setVisible(true);
        nuevoAlumno.setVisible(true);
        jButton2.setVisible(true);
        position = tabla.getRowCount();
        model = (DefaultTableModel) tabla.getModel();
        FilaM.setEnabled(false);
        FilaE.setEnabled(false);
        FilaC.setEnabled(false);
        nameP.setVisible(true);
        Vector filan = new Vector();
        model.addRow(filan);
        rows = tabla.getRowCount();
        contF.setText(rows + " filas");
    }//GEN-LAST:event_FilaCActionPerformed

    private void nuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoAlumnoActionPerformed
        nameP.setVisible(true);
        model.setValueAt(nombre.getText(), position,0);
        model.setValueAt(apellido.getText(), position,1);
        nombre.setText("");
        apellido.setText("");
        FilaM.setEnabled(true);
        FilaE.setEnabled(true);
        FilaC.setEnabled(true);
        rows = tabla.getRowCount();
        contF.setText(rows + " filas");
    }//GEN-LAST:event_nuevoAlumnoActionPerformed

    private void FilaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilaMActionPerformed
        nameP.setVisible(true);
        nuevoAlumno.setVisible(true);
        jButton2.setVisible(true);
        FilaM.setEnabled(false);
        FilaE.setEnabled(false);
        FilaC.setEnabled(false);
        position = tabla.getSelectedRow();
        actual = tabla.getSelectedRow();
        nombre.setText((String) model.getValueAt(position, 0));
        apellido.setText((String) model.getValueAt(position, 1));
        model.setValueAt(nombre.getText(), position,0);
        model.setValueAt(apellido.getText(), position,1);
        rows = tabla.getRowCount();
        contF.setText(rows + " filas");
    }//GEN-LAST:event_FilaMActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FilaM.setEnabled(true);
        FilaE.setEnabled(true);
        FilaC.setEnabled(true);
        model.removeRow(model.getRowCount()-1);
        rows = tabla.getRowCount();
        contF.setText(rows + " filas");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        if(tabla.getSelectedRow() != 1){
            nuevoAlumno.setVisible(false);
            jButton2.setVisible(false);
            nameP.setVisible(true);
            nombre.setText((String) model.getValueAt(tabla.getSelectedRow(), 0));
            apellido.setText((String) model.getValueAt(tabla.getSelectedRow(), 1));
        }
        if(actual != tabla.getSelectedRow()){
            FilaM.setEnabled(true);
            FilaE.setEnabled(true);
            FilaC.setEnabled(true);
        }
        rows = tabla.getRowCount();
        contF.setText(rows + " filas");
    }//GEN-LAST:event_tablaMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUI tarea = new GUI();
                //new GUI().setVisible(true);
                tarea.setTitle("Gui_Table_and_Crud_por_Carlos_Flores el 26-05-2024");
                tarea.setVisible(true);
                tarea.FilaM.setEnabled(false);
                tarea.FilaE.setEnabled(false);
                tarea.contF.setText(rows + " filas");
                tarea.nameP.setVisible(false);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acerca;
    private javax.swing.JButton DatosC;
    private javax.swing.JButton FilaC;
    private javax.swing.JButton FilaE;
    private javax.swing.JButton FilaM;
    private javax.swing.JTextField apellido;
    private javax.swing.JLabel contF;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel nameP;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevoAlumno;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
