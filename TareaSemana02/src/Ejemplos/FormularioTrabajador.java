/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author steampunkyi
 */
public class FormularioTrabajador extends javax.swing.JFrame {

    /**
     * Creates new form FormularioTrabajador
     */
    public FormularioTrabajador() {
        initComponents();
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
        jtxtNombres = new javax.swing.JTextField();
        jcbxCategoria = new javax.swing.JComboBox<>();
        jcbxContrato = new javax.swing.JComboBox<>();
        jspnUnidades = new javax.swing.JSpinner();
        jcbxAfiliacion = new javax.swing.JComboBox<>();
        jbtnMostrarCalculos = new javax.swing.JButton();
        jbtnNuevosCalculos = new javax.swing.JButton();
        jspnHijo = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxaResumenPagos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tarea - Semana02");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACION DEL TRABAJADOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRES COMPLETOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14))); // NOI18N
        jPanel1.add(jtxtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 44, 360, 70));

        jcbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CATEGORIA A", "CATEGORIA B" }));
        jcbxCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CATEGORIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14))); // NOI18N
        jPanel1.add(jcbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, 80));

        jcbxContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONTRATADO", "ESTABLE" }));
        jcbxContrato.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO DE CONTRATO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14))); // NOI18N
        jcbxContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxContratoActionPerformed(evt);
            }
        });
        jPanel1.add(jcbxContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 120, 170, 80));

        jspnUnidades.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UNIDADES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14))); // NOI18N
        jPanel1.add(jspnUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, 90));

        jcbxAfiliacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AFP", "SNP" }));
        jcbxAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AFILIACION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14))); // NOI18N
        jPanel1.add(jcbxAfiliacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, 70));

        jbtnMostrarCalculos.setBackground(new java.awt.Color(204, 204, 204));
        jbtnMostrarCalculos.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtnMostrarCalculos.setForeground(new java.awt.Color(0, 0, 0));
        jbtnMostrarCalculos.setText("MOSTRAR CALCULO");
        jbtnMostrarCalculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrarCalculosActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnMostrarCalculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 300, 60));

        jbtnNuevosCalculos.setBackground(new java.awt.Color(204, 204, 204));
        jbtnNuevosCalculos.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtnNuevosCalculos.setForeground(new java.awt.Color(0, 0, 0));
        jbtnNuevosCalculos.setText("NUEVOS CALCULOS");
        jbtnNuevosCalculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevosCalculosActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnNuevosCalculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 300, 60));

        jspnHijo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HIJOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14))); // NOI18N
        jPanel1.add(jspnHijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 160, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 690));

        jtxaResumenPagos.setColumns(20);
        jtxaResumenPagos.setRows(5);
        jtxaResumenPagos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESUMEN DE PAGOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 24), new java.awt.Color(102, 102, 255))); // NOI18N
        jScrollPane1.setViewportView(jtxaResumenPagos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 480, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnMostrarCalculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarCalculosActionPerformed
        // Creamos el objeto
        Trabajador doc = new Trabajador();
        // Actualizamos los atributos del objeto
        doc.setNombres(this.jtxtNombres.getText());
        doc.setCategoria(this.jcbxCategoria.getSelectedItem().toString());
        doc.setContrato(this.jcbxContrato.getSelectedItem().toString());
        doc.setAfiliacion(this.jcbxAfiliacion.getSelectedItem().toString());
        doc.setUnidades(Integer.parseInt(this.jspnUnidades.getValue().toString()));
        doc.setHijo(Integer.parseInt(this.jspnHijo.getValue().toString()));
        // Mostramos los datos en el textarea
        this.jtxaResumenPagos.append(doc.MostrarDatos());
    }//GEN-LAST:event_jbtnMostrarCalculosActionPerformed

    private void jcbxContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxContratoActionPerformed
       
    }//GEN-LAST:event_jcbxContratoActionPerformed

    private void jbtnNuevosCalculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevosCalculosActionPerformed
        // Limpia las entradas
        this.jtxtNombres.setText("");
        this.jcbxCategoria.setSelectedIndex(0);
        this.jcbxContrato.setSelectedIndex(0);
        this.jcbxAfiliacion.setSelectedIndex(0);
        this.jspnUnidades.setValue(0);
        this.jspnHijo.setValue(0);
        this.jtxtNombres.requestFocus();
    }//GEN-LAST:event_jbtnNuevosCalculosActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnMostrarCalculos;
    private javax.swing.JButton jbtnNuevosCalculos;
    private javax.swing.JComboBox<String> jcbxAfiliacion;
    private javax.swing.JComboBox<String> jcbxCategoria;
    private javax.swing.JComboBox<String> jcbxContrato;
    private javax.swing.JSpinner jspnHijo;
    private javax.swing.JSpinner jspnUnidades;
    private javax.swing.JTextArea jtxaResumenPagos;
    private javax.swing.JTextField jtxtNombres;
    // End of variables declaration//GEN-END:variables
}
