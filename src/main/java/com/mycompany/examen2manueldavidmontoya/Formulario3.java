/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.examen2manueldavidmontoya;

/**
 *
 * @author monto
 */
public class Formulario3 extends javax.swing.JFrame {

    /**
     * Creates new form Formulario3
     */
    public Formulario3() {
        initComponents();
        cencuestas.setText(String.valueOf(Encuesta.cantidadEncuestas()));
    ccarro.setText(String.valueOf(Encuesta.cantidadConCarroPropio()));
    cnocarro.setText(String.valueOf(Encuesta.cantidadEncuestas() - Encuesta.cantidadConCarroPropio()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cencuestas = new javax.swing.JTextField();
        ccarro = new javax.swing.JTextField();
        cnocarro = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Cantidad de encuestas realizadas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(34, 39, 230, 24);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Personas con carro propio");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 130, 210, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Personas sin carro propio");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 220, 190, 20);

        cencuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cencuestasActionPerformed(evt);
            }
        });
        getContentPane().add(cencuestas);
        cencuestas.setBounds(300, 40, 60, 22);
        getContentPane().add(ccarro);
        ccarro.setBounds(300, 140, 60, 22);
        getContentPane().add(cnocarro);
        cnocarro.setBounds(300, 230, 60, 22);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 480, 450);

        jLabel4.setBackground(new java.awt.Color(153, 255, 204));
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 470, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cencuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cencuestasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cencuestasActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ccarro;
    private javax.swing.JTextField cencuestas;
    private javax.swing.JTextField cnocarro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
