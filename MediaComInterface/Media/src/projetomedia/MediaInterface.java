/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomedia;

import java.awt.Color;

/**
 *
 * @author Haruki
 */
public class MediaInterface extends javax.swing.JFrame {

    /**
     * Creates new form MediaInterface
     */
    public MediaInterface() {
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

        lblTitulo = new javax.swing.JLabel();
        fieldTxt1 = new javax.swing.JTextField();
        fieldTxt2 = new javax.swing.JTextField();
        fieldTxt3 = new javax.swing.JTextField();
        fieldTxt4 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblNotaFinal = new javax.swing.JLabel();
        lblSituacao = new javax.swing.JLabel();
        lblNota1 = new javax.swing.JLabel();
        lblNota2 = new javax.swing.JLabel();
        lblNota3 = new javax.swing.JLabel();
        lblNota4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Calculadora de Média");

        fieldTxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldTxt1.setToolTipText("Digite a nota da primeira prova");
        fieldTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTxt1ActionPerformed(evt);
            }
        });

        fieldTxt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldTxt2.setToolTipText("Digite a nota da segunda prova");

        fieldTxt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldTxt3.setToolTipText("Digite a nota da terceira prova");

        fieldTxt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldTxt4.setToolTipText("Digite a nota da quarta prova");

        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblNotaFinal.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        lblNotaFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNotaFinal.setText("Nota final");

        lblSituacao.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        lblSituacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSituacao.setText("Situação");

        lblNota1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNota1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota1.setText("Nota 1");

        lblNota2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNota2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota2.setText("Nota 2");

        lblNota3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNota3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota3.setText("Nota 3");

        lblNota4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNota4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota4.setText("Nota 4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fieldTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fieldTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fieldTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fieldTxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSituacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNotaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnCalcular)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNota1)
                    .addComponent(lblNota2)
                    .addComponent(lblNota3)
                    .addComponent(lblNota4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldTxt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNotaFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSituacao)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTxt1ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        float nota1, nota2, nota3, nota4, notaf;
        
        nota1 = Float.parseFloat(fieldTxt1.getText());
        nota2 = Float.parseFloat(fieldTxt2.getText());
        nota3 = Float.parseFloat(fieldTxt3.getText());
        nota4 = Float.parseFloat(fieldTxt4.getText());
        notaf = (nota1 + nota2 + nota3 + nota4) / 4;
        
        lblNotaFinal.setText("Nota final: " + notaf);
        if(notaf < 5) {
            lblNotaFinal.setForeground(Color.red);
            lblSituacao.setText("REPROVADO!");
            lblSituacao.setForeground(Color.red);
        } else {
            lblNotaFinal.setForeground(Color.blue);
            lblSituacao.setText("APROVADO!");
            lblSituacao.setForeground(Color.blue);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(MediaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MediaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MediaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MediaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MediaInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField fieldTxt1;
    private javax.swing.JTextField fieldTxt2;
    private javax.swing.JTextField fieldTxt3;
    private javax.swing.JTextField fieldTxt4;
    private javax.swing.JLabel lblNota1;
    private javax.swing.JLabel lblNota2;
    private javax.swing.JLabel lblNota3;
    private javax.swing.JLabel lblNota4;
    private javax.swing.JLabel lblNotaFinal;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
