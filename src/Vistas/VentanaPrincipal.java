/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelos.AlumnoAD;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author isabe
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    ArrayList<AlumnoAD> alumn = Controladores.Main.alumnos;
    /**
     * Creates new form Interfaz
     */
    public VentanaPrincipal() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        miTabla = new javax.swing.JTable();
        aniadir = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        miTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Matrícula", "Nombre", "Nota 1ª Ev", "Nota 2ª Ev", "Nota Final", "Nota Extra"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(miTabla);
        if (miTabla.getColumnModel().getColumnCount() > 0) {
            miTabla.getColumnModel().getColumn(0).setResizable(false);
            miTabla.getColumnModel().getColumn(1).setResizable(false);
            miTabla.getColumnModel().getColumn(2).setResizable(false);
            miTabla.getColumnModel().getColumn(3).setResizable(false);
            miTabla.getColumnModel().getColumn(4).setResizable(false);
            miTabla.getColumnModel().getColumn(5).setResizable(false);
        }

        aniadir.setText("Dar de Alta");
        aniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirActionPerformed(evt);
            }
        });

        borrar.setText("jButton2");

        modificar.setText("jButton3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aniadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aniadir)
                    .addComponent(borrar)
                    .addComponent(modificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirActionPerformed
        String nombre = null;
        //Muestro la ventana para dar de alta a un alumno
        AltaAlumno al = new AltaAlumno(this, rootPaneCheckingEnabled);
        al.setVisible(rootPaneCheckingEnabled);

        //Obtengo los datos que escribe el usuario
        nombre = al.getNombre();
        
        //Lo paso al método para actualizar el array de alumnos
        darAlumno(0, nombre, 0, 0, 0, 0);
        
        //Lo añado a la tabla
       DefaultTableModel modelo = (DefaultTableModel) miTabla.getModel();
        modelo.addRow(new Object[]{1, nombre, null, null, null, null});
       

    }//GEN-LAST:event_aniadirActionPerformed

    public void darAlumno(int nMatricula, String nombre, float not1Ev, float nota2Ev,float notaFinal,float notaExtra){
       AlumnoAD alumno= new AlumnoAD(nMatricula, nombre, not1Ev, nota2Ev, notaFinal, notaExtra);
       alumn.add(alumno);
       Controladores.Main.alumnos= alumn;
       for(int i=0;i<Controladores.Main.alumnos.size();i++){
           System.out.println(Controladores.Main.alumnos.get(i));
    }
    }

    public void cargarTabla(AlumnoAD alumno){
        DefaultTableModel modelo = (DefaultTableModel) miTabla.getModel();
        modelo.addRow(new Object[]{alumno.getNMatricula(),alumno.getNombre(), alumno.getNot1Ev(),  alumno.getNota2Ev(),  alumno.getNotaFinal(),alumno.getNotaExtra()});
    }
    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aniadir;
    private javax.swing.JButton borrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable miTabla;
    private javax.swing.JButton modificar;
    // End of variables declaration//GEN-END:variables
}
