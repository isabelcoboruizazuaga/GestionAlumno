/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import javax.swing.table.TableModel;
import Vistas.VentanaPrincipal.*;
import javax.swing.JTextField;

/**
 *
 * @author isabe
 */
public class AltaAlumno extends javax.swing.JDialog {

    private int nMatricula;
    private String nombre;
    private float not1Ev, nota2Ev, notaFinal, notaExtra;

    public int getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }

    public float getNot1Ev() {
        return not1Ev;
    }

    public void setNot1Ev(float not1Ev) {
        this.not1Ev = not1Ev;
    }

    public float getNota2Ev() {
        return nota2Ev;
    }

    public void setNota2Ev(float nota2Ev) {
        this.nota2Ev = nota2Ev;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    public float getNotaExtra() {
        return notaExtra;
    }

    public void setNotaExtra(float notaExtra) {
        this.notaExtra = notaExtra;
    }

    public JTextField getTfAltaNombre() {
        return tfAltaNombre;
    }

    public void setTfAltaNombre(JTextField tfAltaNombre) {
        this.tfAltaNombre = tfAltaNombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Creates new form AltaAlumno */
    public AltaAlumno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfAltaNombre = new javax.swing.JTextField();
        tfNotaExtra = new javax.swing.JTextField();
        tfnot1Ev = new javax.swing.JTextField();
        tfNotaFinal = new javax.swing.JTextField();
        tfnot2Ev = new javax.swing.JTextField();
        btDarAlta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tfAltaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAltaNombreActionPerformed(evt);
            }
        });

        tfNotaExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNotaExtraActionPerformed(evt);
            }
        });

        btDarAlta.setText("Dar de Alta");
        btDarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDarAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addComponent(btDarAlta)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNotaExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfAltaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addComponent(tfnot1Ev)
                        .addComponent(tfnot2Ev)
                        .addComponent(tfNotaFinal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfAltaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfnot1Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfnot2Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNotaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNotaExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btDarAlta)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDarAltaActionPerformed
        setnMatricula(nMatricula);
        //Compruebo si los campos tienen contenido y si no lo tienen les asigno por defecto
        setNombre(tfAltaNombre.getText());
        if (!tfnot1Ev.getText().isEmpty()) {
            setNot1Ev(Float.parseFloat(tfnot1Ev.getText()));
        } else {
            setNot1Ev(0);
        }
        if (!tfnot2Ev.getText().isEmpty()) {
            setNota2Ev(Float.parseFloat(tfnot2Ev.getText()));

        } else {
            setNota2Ev(0);
        }

        if (!tfNotaFinal.getText().isEmpty()) {
            setNotaFinal(Float.parseFloat(tfNotaFinal.getText()));
        } else {
            setNotaFinal(0);
        }

        if (!tfNotaExtra.getText().isEmpty()) {
            setNotaExtra(Float.parseFloat(tfNotaExtra.getText()));
        } else {
            setNotaExtra(0);
        }

        VentanaPrincipal principal = new VentanaPrincipal();
        principal.aniadiralumno(this);

    }//GEN-LAST:event_btDarAltaActionPerformed

    private void tfNotaExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNotaExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNotaExtraActionPerformed

    private void tfAltaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAltaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAltaNombreActionPerformed

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
            java.util.logging.Logger.getLogger(AltaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AltaAlumno dialog = new AltaAlumno(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDarAlta;
    private javax.swing.JTextField tfAltaNombre;
    private javax.swing.JTextField tfNotaExtra;
    private javax.swing.JTextField tfNotaFinal;
    private javax.swing.JTextField tfnot1Ev;
    private javax.swing.JTextField tfnot2Ev;
    // End of variables declaration//GEN-END:variables

}
