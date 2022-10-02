/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.cap4propuesto22;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class UI extends javax.swing.JFrame {

    boolean empleadoExists = false;

    /**
     * Creates new form UI
     */
    public UI() {
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

        lblDescription = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        txtNumHoras = new javax.swing.JTextField();
        lblNumHoras = new javax.swing.JLabel();
        btn = new javax.swing.JButton();
        titleName = new javax.swing.JLabel();
        titleSalario = new javax.swing.JLabel();
        spaceSalario = new javax.swing.JLabel();
        spaceName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lblDescription.setFont(new java.awt.Font("Inter SemiBold", 0, 36)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(134, 134, 139));
        lblDescription.setText("Por favor llena los siguientes datos:");

        jLabel2.setFont(new java.awt.Font("Inter SemiBold", 0, 36)); // NOI18N
        jLabel2.setText("Bienvenido.");

        txtName.setBackground(new java.awt.Color(251, 251, 253));
        txtName.setCaretColor(new java.awt.Color(210, 210, 215));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(134, 134, 139));
        lblName.setText("Nombre empleado");

        lblSalario.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblSalario.setForeground(new java.awt.Color(134, 134, 139));
        lblSalario.setText("Salario básico");

        txtSalario.setBackground(new java.awt.Color(251, 251, 253));
        txtSalario.setCaretColor(new java.awt.Color(210, 210, 215));
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        txtNumHoras.setBackground(new java.awt.Color(251, 251, 253));
        txtNumHoras.setCaretColor(new java.awt.Color(210, 210, 215));
        txtNumHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumHorasActionPerformed(evt);
            }
        });

        lblNumHoras.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblNumHoras.setForeground(new java.awt.Color(134, 134, 139));
        lblNumHoras.setText("Número de horas");

        btn.setBackground(new java.awt.Color(0, 113, 227));
        btn.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btn.setForeground(new java.awt.Color(255, 255, 255));
        btn.setText("Continuar");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        titleName.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N

        titleSalario.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N

        spaceSalario.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N

        spaceName.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumHoras)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNumHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titleName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spaceName, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titleSalario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spaceSalario))))
                    .addComponent(lblDescription)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSalario)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(jLabel2)
                    .addContainerGap(541, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(lblDescription)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblNumHoras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleName)
                            .addComponent(spaceName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleSalario)
                            .addComponent(spaceSalario))))
                .addGap(18, 18, 18)
                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jLabel2)
                    .addContainerGap(332, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void txtNumHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumHorasActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        if (empleadoExists) {
            // Set visible again

            txtName.setEditable(true);
            txtNumHoras.setEditable(true);
            txtSalario.setEditable(true);
            txtName.setText("");
            txtNumHoras.setText("");
            txtSalario.setText("");
            spaceName.setText("");
            titleName.setText("");
            spaceSalario.setText("");
            titleSalario.setText("");
            lblDescription.setText("Por favor llena los siguientes datos:");

            // reset button
            btn.setText("Continuar");
            empleadoExists = false;
        } else {
            // GET ALL THE INFO

            Empleado empleado = new Empleado();
            empleado.nombre = txtName.getText();
            try {
                empleado.salario = Double.parseDouble(txtSalario.getText());
                empleado.num_horas = Double.parseDouble(txtNumHoras.getText());
                // SET ALL THE INFO

                txtName.setEditable(false);
                txtNumHoras.setEditable(false);
                txtSalario.setEditable(false);
                spaceName.setText(empleado.nombre);
                titleName.setText("Nombre:");

                if (empleado.salario_mensual() > 450000) {
                    titleSalario.setText("Salario Mensual:");
                    spaceSalario.setText(String.valueOf(empleado.salario_mensual()));
                }
                
                lblDescription.setText("Información Empleado.");

                // BUTTON CHANGE
                btn.setText("Limpiar");
                empleadoExists = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Ten cuidado con los datos ingresados. Algun(os) no tienen el tipo de dato correcto.",
                        "Datos Incorrectos",
                        JOptionPane.ERROR_MESSAGE);
            }

        }


    }//GEN-LAST:event_btnActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumHoras;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel spaceName;
    private javax.swing.JLabel spaceSalario;
    private javax.swing.JLabel titleName;
    private javax.swing.JLabel titleSalario;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumHoras;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}