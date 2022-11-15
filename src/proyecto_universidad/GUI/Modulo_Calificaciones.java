/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_universidad.GUI;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import proyecto_universidad.DAL.conexion;

/**
 *
 * @author Adry
 */
public class Modulo_Calificaciones extends javax.swing.JFrame {
DefaultTableModel modelo;
    conexion conexion = new conexion();
    /**
     * Creates new form Modulo_Calificaciones
     */
    public Modulo_Calificaciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        /*Añadir valores al combo box*/
        mostrarDatosCBOBOX();
        
        mostrarDatos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Horario = new javax.swing.JPanel();
        Calificaciones = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Botones = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        cboGrupos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCalificacion = new javax.swing.JTable();
        Encabezado3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(229, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Horario.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jButton3.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jButton3.setText("Calificaciones");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jButton4.setText("Horarios");

        javax.swing.GroupLayout BotonesLayout = new javax.swing.GroupLayout(Botones);
        Botones.setLayout(BotonesLayout);
        BotonesLayout.setHorizontalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
            .addGroup(BotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BotonesLayout.setVerticalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(75, 75, 75))
        );

        jLabel15.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout CalificacionesLayout = new javax.swing.GroupLayout(Calificaciones);
        Calificaciones.setLayout(CalificacionesLayout);
        CalificacionesLayout.setHorizontalGroup(
            CalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalificacionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(34, 34, 34))
        );
        CalificacionesLayout.setVerticalGroup(
            CalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalificacionesLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jButton2.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        jButton2.setText("Regresar");

        cboGrupos.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        cboGrupos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboGruposItemStateChanged(evt);
            }
        });
        cboGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGruposActionPerformed(evt);
            }
        });

        tbCalificacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nombre", "Carrera", "Asignatura", "Parcial 1", "Parcial 2", "Parcial 3", "Ordinario", "Extraordinario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbCalificacion);

        javax.swing.GroupLayout HorarioLayout = new javax.swing.GroupLayout(Horario);
        Horario.setLayout(HorarioLayout);
        HorarioLayout.setHorizontalGroup(
            HorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HorarioLayout.createSequentialGroup()
                .addGroup(HorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HorarioLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(cboGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HorarioLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Calificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        HorarioLayout.setVerticalGroup(
            HorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HorarioLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(Calificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(HorarioLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(cboGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Encabezado3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel16.setFont(new java.awt.Font("Corbel", 0, 48)); // NOI18N
        jLabel16.setText("UNIVERSIDAD FRANCISCO");

        javax.swing.GroupLayout Encabezado3Layout = new javax.swing.GroupLayout(Encabezado3);
        Encabezado3.setLayout(Encabezado3Layout);
        Encabezado3Layout.setHorizontalGroup(
            Encabezado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Encabezado3Layout.createSequentialGroup()
                .addGroup(Encabezado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Encabezado3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(0, 220, Short.MAX_VALUE))
        );
        Encabezado3Layout.setVerticalGroup(
            Encabezado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Encabezado3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(Encabezado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Encabezado3Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Encabezado3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(35, 35, 35)))
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Encabezado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Horario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Horario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cboGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGruposActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cboGruposActionPerformed

    private void cboGruposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboGruposItemStateChanged
        // TODO add your handling code here:
        String asignatura = (String)cboGrupos.getSelectedItem();
        System.out.println(asignatura);
        //filtrar(asignatura);
        /*se hace nuevamente la consulta*/
        /* String sql = "SELECT Nombre FROM asignaturas";
        ResultSet rs = conexion.consultarRegistros(sql);
        String aux="";
        try{
            while (rs.next()) {
               aux = rs.getString("Nombre");    
            }
        }catch(Exception e){}
        
        System.out.println(aux);
        if(asignatura.equals("")){
            
        }*/
    }//GEN-LAST:event_cboGruposItemStateChanged

    private void filtrar(String seleccion){
        String sql = "SELECT calificaciones.Alumnos_Matricula_alumno, alumnos.Nombre, carreras.Nombre, asignaturas.Nombre, calificaciones.Parcial_1, calificaciones.Parcial_2, calificaciones.Parcial_3, calificaciones.Ordinario, calificaciones.Extraordinario FROM calificaciones, alumnos, asignaturas, carreras WHERE calificaciones.Alumnos_Matricula_alumno=alumnos.Matricula_alumno and calificaciones.Asignaturas_Id_Asignatura= asignaturas.Id_Asignatura and alumnos.Carreras_Id_Carrera=carreras.Id_Carrera and asignaturas.Nombre='"+seleccion+"' ";
        ResultSet rs = conexion.consultarRegistros(sql);
        try {
            Object[] horario = new Object[9];
            modelo = (DefaultTableModel) tbCalificacion.getModel();
            while (rs.next()) {
                horario[0] = rs.getString("calificaciones.Alumnos_Matricula_alumno");
                horario[1] = rs.getString("alumnos.Nombre");
                horario[2] = rs.getString("carreras.Nombre");
                horario[3] = rs.getString("asignaturas.Nombre");
                horario[4] = rs.getFloat("calificaciones.Parcial_1");
                horario[5] = rs.getFloat("calificaciones.Parcial_2");
                horario[6] = rs.getFloat("calificaciones.Parcial_3");
                horario[7] = rs.getFloat("calificaciones.Ordinario");
                horario[8] = rs.getFloat("calificaciones.Extraordinario");
                modelo.addRow(horario);
            }
            //tbGrado.setModel(modelo);
        } catch (Exception e) {
        }
    }
    private void mostrarDatosCBOBOX(){
        cboGrupos.addItem("Todas las asignaturas");
        String sql = "SELECT Nombre FROM asignaturas";
        ResultSet rs = conexion.consultarRegistros(sql);
        try {
            
            while (rs.next()) {
               cboGrupos.addItem(rs.getString("Nombre"));     
            }
            //tbGrado.setModel(modelo);
        } catch (Exception e) {
        }
    }
     void mostrarDatos() {
        String sql = "SELECT calificaciones.Alumnos_Matricula_alumno, alumnos.Nombre, carreras.Nombre, asignaturas.Nombre, calificaciones.Parcial_1, calificaciones.Parcial_2, calificaciones.Parcial_3, calificaciones.Ordinario, calificaciones.Extraordinario FROM calificaciones, alumnos, asignaturas, carreras WHERE calificaciones.Alumnos_Matricula_alumno=alumnos.Matricula_alumno and calificaciones.Asignaturas_Id_Asignatura= asignaturas.Id_Asignatura and alumnos.Carreras_Id_Carrera=carreras.Id_Carrera";
        ResultSet rs = conexion.consultarRegistros(sql);
        try {
            Object[] horario = new Object[9];
            modelo = (DefaultTableModel) tbCalificacion.getModel();
            while (rs.next()) {
                horario[0] = rs.getString("calificaciones.Alumnos_Matricula_alumno");
                horario[1] = rs.getString("alumnos.Nombre");
                horario[2] = rs.getString("carreras.Nombre");
                horario[3] = rs.getString("asignaturas.Nombre");
                horario[4] = rs.getFloat("calificaciones.Parcial_1");
                horario[5] = rs.getFloat("calificaciones.Parcial_2");
                horario[6] = rs.getFloat("calificaciones.Parcial_3");
                horario[7] = rs.getFloat("calificaciones.Ordinario");
                horario[8] = rs.getFloat("calificaciones.Extraordinario");
                modelo.addRow(horario);
            }
            //tbGrado.setModel(modelo);
        } catch (Exception e) {
        }
    }
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
            java.util.logging.Logger.getLogger(Modulo_Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modulo_Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modulo_Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modulo_Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modulo_Calificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botones;
    private javax.swing.JPanel Calificaciones;
    private javax.swing.JPanel Encabezado3;
    private javax.swing.JPanel Horario;
    private javax.swing.JComboBox<String> cboGrupos;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCalificacion;
    // End of variables declaration//GEN-END:variables
}
