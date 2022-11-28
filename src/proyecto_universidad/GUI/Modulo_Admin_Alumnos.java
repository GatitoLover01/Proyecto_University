/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_universidad.GUI;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyecto_univerisdad.BL.prounivBL;
import proyecto_universidad.DAL.conexion;

/**
 *
 * @author Adry Moisés
 */
public class Modulo_Admin_Alumnos extends javax.swing.JFrame {

    DefaultTableModel modelo;
    conexion conexion = new conexion();
    String matriculaAlum;
    
    public Modulo_Admin_Alumnos() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarDatos();
        FillCBGenero();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenido = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Alumnos = new javax.swing.JTable();
        Datos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_ApP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_ApM = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_Contrasena = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox<>();
        Botones = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Encabezado = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Contenido.setBackground(new java.awt.Color(204, 204, 255));

        tb_Alumnos.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        tb_Alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nombre", "Apellido paterno", "Apellido materno", "Contraseña", "Género"
            }
        ));
        tb_Alumnos.getTableHeader().setReorderingAllowed(false);
        tb_Alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_AlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Alumnos);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        jLabel1.setText("Nombre:");

        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        jLabel7.setText("Apellido paterno:");

        txt_ApP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ApPActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        jLabel9.setText("Apellido materno:");

        txt_ApM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ApMActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        jLabel10.setText("Contraseña:");

        txt_Contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ContrasenaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        jLabel11.setText("Género:");

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione género" }));

        javax.swing.GroupLayout DatosLayout = new javax.swing.GroupLayout(Datos);
        Datos.setLayout(DatosLayout);
        DatosLayout.setHorizontalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(txt_Contrasena)
                    .addComponent(jLabel10)
                    .addComponent(txt_ApM)
                    .addComponent(jLabel9)
                    .addComponent(txt_ApP)
                    .addComponent(jLabel7)
                    .addComponent(txt_Nombre)
                    .addComponent(jLabel1)
                    .addComponent(cbGenero, 0, 185, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        DatosLayout.setVerticalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(4, 4, 4)
                .addComponent(txt_ApP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(4, 4, 4)
                .addComponent(txt_ApM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Botones.setBackground(new java.awt.Color(153, 153, 255));

        btnActualizar.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_universidad/Imagenes/Boton.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setFocusPainted(false);
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_universidad/Imagenes/BotonPressed.png"))); // NOI18N
        btnActualizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_universidad/Imagenes/OnBoton.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_universidad/Imagenes/Boton.png"))); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_universidad/Imagenes/BotonPressed.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_universidad/Imagenes/OnBoton.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BotonesLayout = new javax.swing.GroupLayout(Botones);
        Botones.setLayout(BotonesLayout);
        BotonesLayout.setHorizontalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BotonesLayout.setVerticalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel5.setText("Alumnos");

        jButton1.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_universidad/Imagenes/Boton.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_universidad/Imagenes/BotonPressed.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_universidad/Imagenes/OnBoton.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5))
                    .addComponent(jButton1)
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(Datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addComponent(Datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Encabezado.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 48)); // NOI18N
        jLabel2.setText("UNIVERSIDAD FRANCISCO");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_universidad/Imagenes/barra.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_universidad/Imagenes/Logo_Universidad.png"))); // NOI18N

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EncabezadoLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EncabezadoLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel2))))
                    .addComponent(jLabel6))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void txt_ApPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ApPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ApPActionPerformed

    private void txt_ApMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ApMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ApMActionPerformed

    private void txt_ContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ContrasenaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String nombre = txt_Nombre.getText();
        String apP = txt_ApP.getText();
        String apM = txt_ApM.getText();
        String contraseña = txt_Contrasena.getText();
        int genero = cbGenero.getSelectedIndex();

        try {
            if (nombre.equals("") || apP.equals("") || apM.equals("") || contraseña.equals("")) {
                JOptionPane.showMessageDialog(this, "Faltan ingresar datos");
            } else {
                String sql = String.format("UPDATE `alumnos` SET `Nombre` = '%s',`Apellido_paterno` = '%s',`Apellido_materno` = '%s', `Contrasena` = '%s', `Id_genero` = '%s' WHERE Matricula_alumno = '%s'", nombre, apP, apM, contraseña, genero, matriculaAlum);
                conexion.ejecutarSentenciaSQL(sql);
                JOptionPane.showMessageDialog(this, "Datos modificados correctamente");
                this.limpiarTabla();
                this.mostrarDatos();//actualizamos la tabla
                this.LimpiarGUI();
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int res = JOptionPane.showConfirmDialog(null, "¿Desea salir de administración de 'alumnos'?", "Mensaje de confirmación", JOptionPane.YES_OPTION);
        if (res == 0) {
            Modulo_Administrador Admin = new Modulo_Administrador();
            Admin.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tb_AlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_AlumnosMouseClicked
        if (evt.getClickCount() == 1) {
            JTable receptor = (JTable) evt.getSource();

            matriculaAlum = receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString();
            txt_Nombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            txt_ApP.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            txt_ApM.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            txt_Contrasena.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
            
            String _Genero = GetNameGenero(Integer.parseInt(receptor.getModel().getValueAt(receptor.getSelectedRow(),5).toString()));
            
            cbGenero.setSelectedItem(_Genero);
            
        }
    }//GEN-LAST:event_tb_AlumnosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int fila = tb_Alumnos.getSelectedRow();
        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(this, "Fila no seleccionada");
            } else {
                int res = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este campo?", "Mensaje de confirmación", JOptionPane.YES_OPTION);
                if (res == 0) {
                    BorrarDatosAlumno();
                    String sql = String.format("DELETE FROM `alumnos` WHERE Matricula_alumno = '%s'", matriculaAlum);
                    conexion.ejecutarSentenciaSQL(sql);//hace consulta y agrega a la tabla
                    this.limpiarTabla();
                    this.mostrarDatos();
                    this.LimpiarGUI();
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void BorrarDatosAlumno(){
        String sqlHRA = String.format("DELETE FROM `horario_alumno` WHERE Alumnos_Matricula_alumno = '%s'", matriculaAlum);
        conexion.ejecutarSentenciaSQL(sqlHRA);//hace consulta y agrega a la tabla
        
        String sqlDC = String.format("DELETE FROM `documentosalumnos` WHERE Alumnos_Matricula_alumno = '%s'", matriculaAlum);
        conexion.ejecutarSentenciaSQL(sqlDC);//hace consulta y agrega a la tabla
        
        String sqlCL = String.format("DELETE FROM `calificaciones` WHERE Alumnos_Matricula_alumno = '%s'", matriculaAlum);
        conexion.ejecutarSentenciaSQL(sqlCL);//hace consulta y agrega a la tabla

        String sqlPHRA = String.format("DELETE FROM `pre_horarios` WHERE Alumnos_Matricula_alumno = '%s'", matriculaAlum);
        conexion.ejecutarSentenciaSQL(sqlPHRA);//hace consulta y agrega a la tabla

        String sqlPRIN = String.format("DELETE FROM `pre_reinscripciones` WHERE Alumnos_Matricula_alumno = '%s'", matriculaAlum);
        conexion.ejecutarSentenciaSQL(sqlPRIN);//hace consulta y agrega a la tabla
    }
    
    public void BorrarDocumentosAlumno(){
        
    }
    
    public String GetNameGenero(int Id_Genero){
        
        String a = null;        
        String sql = String.format("Select Nombre from genero where Id_genero = '%s' ", Id_Genero);       
        ResultSet rs = conexion.consultarRegistros(sql);
        try {           
            while(rs.next()){
                a = rs.getString("Nombre");
            }
            //tbGrado.setModel(modelo);
        } catch (Exception e) {
        }
        return a;
    }
    
    public prounivBL obtenerDatos() {
        prounivBL datos = new prounivBL();

        String nombre = txt_Nombre.getText().trim();
        String apeP = txt_ApP.getText().trim();
        String apeM = txt_ApM.getText().trim();
        String contraseña = txt_Contrasena.getText().trim();

        datos.setNombre_asig(nombre);
        

        return datos;
    }
    
    void FillCBGenero(){
        String sql= "Select Nombre from genero";
        ResultSet rs = conexion.consultarRegistros(sql);
        try {
            while(rs.next()){
               // cbGrado[0]=rs.getInt("idGrado");

               cbGenero.addItem(rs.getString("Nombre"));
            }
            //tbGrado.setModel(modelo);
        } catch (Exception e) {
        }
    }
    
    void LimpiarGUI(){
        txt_Nombre.setText("");            
        txt_ApP.setText("");           
        txt_ApM.setText("");          
        txt_Contrasena.setText("");  
        cbGenero.setSelectedIndex(0);        
    }
    
    void limpiarTabla(){
        modelo.setNumRows(0);
    }
    
    void mostrarDatos() {
        String sql = "Select Matricula_Alumno, Nombre, Apellido_paterno, Apellido_materno, "
                + "Contrasena, Id_Genero from alumnos";
        ResultSet rs = conexion.consultarRegistros(sql);
        try {
            Object[] asignatura = new Object[6];
            modelo = (DefaultTableModel) tb_Alumnos.getModel();
            while (rs.next()) {
                asignatura[0] = rs.getString("Matricula_Alumno");
                asignatura[1] = rs.getString("Nombre");
                asignatura[2] = rs.getString("Apellido_paterno");
                asignatura[3] = rs.getString("Apellido_materno");
                asignatura[4] = rs.getString("Contrasena");
                asignatura[5] = rs.getInt("Id_Genero");
               
                
                modelo.addRow(asignatura);
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
            java.util.logging.Logger.getLogger(Modulo_Admin_Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modulo_Admin_Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modulo_Admin_Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modulo_Admin_Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modulo_Admin_Alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botones;
    private javax.swing.JPanel Contenido;
    private javax.swing.JPanel Datos;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_Alumnos;
    private javax.swing.JTextField txt_ApM;
    private javax.swing.JTextField txt_ApP;
    private javax.swing.JTextField txt_Contrasena;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
