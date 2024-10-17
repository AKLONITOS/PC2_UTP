/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrame;

import PaqueteDeTrabajo.CursosYProfesores;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EQUIPO
 */
public class FCursos extends javax.swing.JFrame {

    /**
     * Creates new form FCursos
     */
    DefaultTableModel modelo;
    public FCursos() {
        initComponents();
         modelo=(DefaultTableModel)CursosR.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_curso = new javax.swing.JTextField();
        txt_codprofesor = new javax.swing.JTextField();
        btn_Registrar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        txt_codNombre = new javax.swing.JTextField();
        txt_codcur = new javax.swing.JTextField();
        btn_cerrar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CursosR = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del curso"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Curso");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 47, -1, -1));

        jLabel2.setText("Cod Profesor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 95, -1, -1));

        txt_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cursoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 44, 175, -1));
        jPanel1.add(txt_codprofesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 80, -1));

        btn_Registrar.setText("Registrar");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 85, 32));

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 88, 32));
        jPanel1.add(txt_codNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 92, 175, -1));
        jPanel1.add(txt_codcur, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 80, -1));

        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 88, 32));

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 90, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cursos Registrados"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CursosR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Curso", "Curso", "Cod Profesor", "Nombre Profesor"
            }
        ));
        jScrollPane1.setViewportView(CursosR);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        // TODO add your handling code here:
        CursosYProfesores cur = new CursosYProfesores ();
        cur.setCodigoCurso(txt_codcur.getText());
        cur.setCurso(txt_curso.getText());
        cur.setNombres(txt_codNombre.getText());
        cur.setCodigo(txt_codprofesor.getText());
        
        modelo.addRow(new Object[]{cur.getCodigoCurso(),cur.getCurso(),cur.getCodigo(),cur.getNombres()});
        
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        // TODO add your handling code here:
        int fila;
        fila=CursosR.getSelectedRow();
        if(fila>=0){
            modelo.removeRow(fila);
            JOptionPane.showMessageDialog(null, "Resgitro Eliminado");
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla para eliminar");  
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        int selectedRow = CursosR.getSelectedRow();
        
        if (selectedRow != -1) {
            CursosR.setValueAt(txt_codcur.getText(), selectedRow, 0);
            CursosR.setValueAt(txt_curso.getText(), selectedRow, 1);
            CursosR.setValueAt(txt_codprofesor.getText(), selectedRow, 2);
            CursosR.setValueAt(txt_codNombre.getText(), selectedRow, 3);

            LimpiarCampos();
        }
        else{JOptionPane.showMessageDialog(this, "Selecciona una fila.", "Advertencia", JOptionPane.WARNING_MESSAGE);}
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void txt_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cursoActionPerformed

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
            java.util.logging.Logger.getLogger(FCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CursosR;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_codNombre;
    private javax.swing.JTextField txt_codcur;
    private javax.swing.JTextField txt_codprofesor;
    private javax.swing.JTextField txt_curso;
    // End of variables declaration//GEN-END:variables

    private void LimpiarCampos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}