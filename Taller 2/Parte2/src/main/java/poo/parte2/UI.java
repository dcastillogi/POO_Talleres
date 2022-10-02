/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.parte2;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Rectangulo;
import figuras.Triangulo;

/**
 *
 * @author danie
 */
public class UI extends javax.swing.JFrame {

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        circuloRadio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rectanguloBase = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cuadradoLado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        trianguloBase = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rectanguloAltura = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        trianguloAltura = new javax.swing.JTextField();
        rectanguloBtn = new javax.swing.JButton();
        circuloBtn = new javax.swing.JButton();
        cuadradoBtn = new javax.swing.JButton();
        trianguloBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        circuloPerimetro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        circuloArea = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        rectanguloPerimetro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        rectanguloArea = new javax.swing.JTextField();
        cuadradoArea = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cuadradoPerimetro = new javax.swing.JTextField();
        trianguloArea = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        trianguloPerimetro = new javax.swing.JTextField();
        trianguloHipotenusa = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        trianguloTipo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        circuloBtn1 = new javax.swing.JButton();
        rectanguloBtn1 = new javax.swing.JButton();
        cuadradoBtn1 = new javax.swing.JButton();
        trianguloBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Inter Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(134, 134, 139));
        jLabel1.setText("Rectángulo");

        jLabel2.setFont(new java.awt.Font("Inter Black", 0, 36)); // NOI18N
        jLabel2.setText("Círculo");

        jLabel3.setFont(new java.awt.Font("Inter Black", 0, 36)); // NOI18N
        jLabel3.setText("Rectángulo");

        jLabel4.setFont(new java.awt.Font("Inter Black", 0, 36)); // NOI18N
        jLabel4.setText("Cuadrado");

        jLabel5.setFont(new java.awt.Font("Inter Black", 0, 36)); // NOI18N
        jLabel5.setText("Tríangulo");

        circuloRadio.setForeground(new java.awt.Color(134, 134, 139));

        jLabel6.setForeground(new java.awt.Color(134, 134, 139));
        jLabel6.setText("Radio");

        jLabel7.setForeground(new java.awt.Color(134, 134, 139));
        jLabel7.setText("Base");

        rectanguloBase.setForeground(new java.awt.Color(134, 134, 139));

        jLabel8.setForeground(new java.awt.Color(134, 134, 139));
        jLabel8.setText("Lado");

        cuadradoLado.setForeground(new java.awt.Color(134, 134, 139));

        jLabel9.setForeground(new java.awt.Color(134, 134, 139));
        jLabel9.setText("Base");

        trianguloBase.setForeground(new java.awt.Color(134, 134, 139));

        jLabel10.setForeground(new java.awt.Color(134, 134, 139));
        jLabel10.setText("Altura");

        rectanguloAltura.setForeground(new java.awt.Color(134, 134, 139));

        jLabel11.setForeground(new java.awt.Color(134, 134, 139));
        jLabel11.setText("Altura");

        trianguloAltura.setForeground(new java.awt.Color(134, 134, 139));

        rectanguloBtn.setBackground(new java.awt.Color(0, 113, 227));
        rectanguloBtn.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        rectanguloBtn.setForeground(new java.awt.Color(255, 255, 255));
        rectanguloBtn.setText("Continuar");
        rectanguloBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectanguloBtnActionPerformed(evt);
            }
        });

        circuloBtn.setBackground(new java.awt.Color(0, 113, 227));
        circuloBtn.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        circuloBtn.setForeground(new java.awt.Color(255, 255, 255));
        circuloBtn.setText("Continuar");
        circuloBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circuloBtnActionPerformed(evt);
            }
        });

        cuadradoBtn.setBackground(new java.awt.Color(0, 113, 227));
        cuadradoBtn.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        cuadradoBtn.setForeground(new java.awt.Color(255, 255, 255));
        cuadradoBtn.setText("Continuar");
        cuadradoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadradoBtnActionPerformed(evt);
            }
        });

        trianguloBtn.setBackground(new java.awt.Color(0, 113, 227));
        trianguloBtn.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        trianguloBtn.setForeground(new java.awt.Color(255, 255, 255));
        trianguloBtn.setText("Continuar");
        trianguloBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trianguloBtnActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(134, 134, 139));
        jLabel12.setText("Perímetro");

        circuloPerimetro.setForeground(new java.awt.Color(134, 134, 139));
        circuloPerimetro.setEnabled(false);

        jLabel13.setForeground(new java.awt.Color(134, 134, 139));
        jLabel13.setText("Área");

        circuloArea.setForeground(new java.awt.Color(134, 134, 139));
        circuloArea.setEnabled(false);

        jLabel14.setForeground(new java.awt.Color(134, 134, 139));
        jLabel14.setText("Perímetro");

        rectanguloPerimetro.setForeground(new java.awt.Color(134, 134, 139));
        rectanguloPerimetro.setEnabled(false);

        jLabel15.setForeground(new java.awt.Color(134, 134, 139));
        jLabel15.setText("Área");

        rectanguloArea.setForeground(new java.awt.Color(134, 134, 139));
        rectanguloArea.setEnabled(false);

        cuadradoArea.setForeground(new java.awt.Color(134, 134, 139));
        cuadradoArea.setEnabled(false);

        jLabel16.setForeground(new java.awt.Color(134, 134, 139));
        jLabel16.setText("Área");

        jLabel17.setForeground(new java.awt.Color(134, 134, 139));
        jLabel17.setText("Perímetro");

        cuadradoPerimetro.setForeground(new java.awt.Color(134, 134, 139));
        cuadradoPerimetro.setEnabled(false);

        trianguloArea.setForeground(new java.awt.Color(134, 134, 139));
        trianguloArea.setEnabled(false);

        jLabel18.setForeground(new java.awt.Color(134, 134, 139));
        jLabel18.setText("Área");

        jLabel19.setForeground(new java.awt.Color(134, 134, 139));
        jLabel19.setText("Perímetro");

        trianguloPerimetro.setForeground(new java.awt.Color(134, 134, 139));
        trianguloPerimetro.setEnabled(false);

        trianguloHipotenusa.setForeground(new java.awt.Color(134, 134, 139));
        trianguloHipotenusa.setEnabled(false);

        jLabel20.setForeground(new java.awt.Color(134, 134, 139));
        jLabel20.setText("Hipotenusa");

        trianguloTipo.setForeground(new java.awt.Color(134, 134, 139));
        trianguloTipo.setEnabled(false);

        jLabel21.setForeground(new java.awt.Color(134, 134, 139));
        jLabel21.setText("Tipo Triángulo");

        circuloBtn1.setBackground(new java.awt.Color(0, 113, 227));
        circuloBtn1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        circuloBtn1.setForeground(new java.awt.Color(255, 255, 255));
        circuloBtn1.setText("Limpiar");
        circuloBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circuloBtn1ActionPerformed(evt);
            }
        });

        rectanguloBtn1.setBackground(new java.awt.Color(0, 113, 227));
        rectanguloBtn1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        rectanguloBtn1.setForeground(new java.awt.Color(255, 255, 255));
        rectanguloBtn1.setText("Limpiar");
        rectanguloBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectanguloBtn1ActionPerformed(evt);
            }
        });

        cuadradoBtn1.setBackground(new java.awt.Color(0, 113, 227));
        cuadradoBtn1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        cuadradoBtn1.setForeground(new java.awt.Color(255, 255, 255));
        cuadradoBtn1.setText("Limpiar");
        cuadradoBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadradoBtn1ActionPerformed(evt);
            }
        });

        trianguloBtn1.setBackground(new java.awt.Color(0, 113, 227));
        trianguloBtn1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        trianguloBtn1.setForeground(new java.awt.Color(255, 255, 255));
        trianguloBtn1.setText("Limpiar");
        trianguloBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trianguloBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(circuloRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(circuloBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(circuloArea, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(circuloPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(circuloBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rectanguloBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(rectanguloBase, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)
                            .addComponent(rectanguloAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rectanguloBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(rectanguloArea, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(rectanguloPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cuadradoBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(cuadradoLado, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuadradoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(cuadradoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(cuadradoPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trianguloBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(trianguloTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(trianguloHipotenusa, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trianguloBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(trianguloBase, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11)
                    .addComponent(trianguloAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(trianguloArea, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(trianguloPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(1, 1, 1)
                        .addComponent(rectanguloBase, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(1, 1, 1)
                        .addComponent(rectanguloAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rectanguloBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(trianguloBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addGap(1, 1, 1)
                                .addComponent(trianguloArea, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19)
                                .addGap(1, 1, 1)
                                .addComponent(trianguloPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(1, 1, 1)
                                .addComponent(rectanguloArea, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(1, 1, 1)
                                .addComponent(rectanguloPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(rectanguloBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addGap(1, 1, 1)
                                        .addComponent(trianguloBase, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(circuloRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(circuloBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(1, 1, 1)
                                .addComponent(trianguloAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(1, 1, 1)
                                .addComponent(circuloArea, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(1, 1, 1)
                                .addComponent(circuloPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(circuloBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(1, 1, 1)
                        .addComponent(cuadradoLado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cuadradoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addGap(1, 1, 1)
                        .addComponent(cuadradoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addGap(1, 1, 1)
                        .addComponent(cuadradoPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cuadradoBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(1, 1, 1)
                .addComponent(trianguloHipotenusa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(1, 1, 1)
                .addComponent(trianguloTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(trianguloBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void circuloBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circuloBtnActionPerformed

        Circulo micirculo = new Circulo();
        micirculo.radio = Double.parseDouble(circuloRadio.getText());
        circuloArea.setText(String.valueOf(micirculo.area()));
        circuloPerimetro.setText(String.valueOf(micirculo.perimetro()));
        
    }//GEN-LAST:event_circuloBtnActionPerformed

    private void circuloBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circuloBtn1ActionPerformed
        circuloArea.setText("");
        circuloPerimetro.setText("");
        circuloRadio.setText("");
    }//GEN-LAST:event_circuloBtn1ActionPerformed

    private void rectanguloBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectanguloBtnActionPerformed
        Rectangulo mirectangulo = new Rectangulo();
        mirectangulo.altura = Double.parseDouble(rectanguloAltura.getText());
        mirectangulo.base = Double.parseDouble(rectanguloBase.getText());
        
        rectanguloArea.setText(String.valueOf(mirectangulo.area()));
        rectanguloPerimetro.setText(String.valueOf(mirectangulo.perimetro()));
    }//GEN-LAST:event_rectanguloBtnActionPerformed

    private void rectanguloBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectanguloBtn1ActionPerformed
        rectanguloPerimetro.setText("");
        rectanguloArea.setText("");
        rectanguloAltura.setText("");
        rectanguloBase.setText("");
    }//GEN-LAST:event_rectanguloBtn1ActionPerformed

    private void cuadradoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadradoBtnActionPerformed
        Cuadrado micuadrado = new Cuadrado();
        micuadrado.lado = Double.parseDouble(cuadradoLado.getText());
        cuadradoArea.setText(String.valueOf(micuadrado.area()));
        cuadradoPerimetro.setText(String.valueOf(micuadrado.perimetro()));
    }//GEN-LAST:event_cuadradoBtnActionPerformed

    private void cuadradoBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadradoBtn1ActionPerformed
        cuadradoArea.setText("");
        cuadradoPerimetro.setText("");
        cuadradoLado.setText("");
    }//GEN-LAST:event_cuadradoBtn1ActionPerformed

    private void trianguloBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trianguloBtnActionPerformed
        Triangulo mitriangulo = new Triangulo();
        mitriangulo.altura = Double.parseDouble(trianguloAltura.getText());
        mitriangulo.base = Double.parseDouble(trianguloBase.getText());
        trianguloHipotenusa.setText(String.valueOf(mitriangulo.hipotenusa()));
        trianguloPerimetro.setText(String.valueOf(mitriangulo.perimetro()));
        trianguloArea.setText(String.valueOf(mitriangulo.area()));
        trianguloTipo.setText(mitriangulo.tipoTriangulo());
    }//GEN-LAST:event_trianguloBtnActionPerformed

    private void trianguloBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trianguloBtn1ActionPerformed
        trianguloHipotenusa.setText("");
        trianguloPerimetro.setText("");
        trianguloArea.setText("");
        trianguloTipo.setText("");
        trianguloAltura.setText("");
        trianguloBase.setText("");
    }//GEN-LAST:event_trianguloBtn1ActionPerformed

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
    private javax.swing.JTextField circuloArea;
    private javax.swing.JButton circuloBtn;
    private javax.swing.JButton circuloBtn1;
    private javax.swing.JTextField circuloPerimetro;
    private javax.swing.JTextField circuloRadio;
    private javax.swing.JTextField cuadradoArea;
    private javax.swing.JButton cuadradoBtn;
    private javax.swing.JButton cuadradoBtn1;
    private javax.swing.JTextField cuadradoLado;
    private javax.swing.JTextField cuadradoPerimetro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField rectanguloAltura;
    private javax.swing.JTextField rectanguloArea;
    private javax.swing.JTextField rectanguloBase;
    private javax.swing.JButton rectanguloBtn;
    private javax.swing.JButton rectanguloBtn1;
    private javax.swing.JTextField rectanguloPerimetro;
    private javax.swing.JTextField trianguloAltura;
    private javax.swing.JTextField trianguloArea;
    private javax.swing.JTextField trianguloBase;
    private javax.swing.JButton trianguloBtn;
    private javax.swing.JButton trianguloBtn1;
    private javax.swing.JTextField trianguloHipotenusa;
    private javax.swing.JTextField trianguloPerimetro;
    private javax.swing.JTextField trianguloTipo;
    // End of variables declaration//GEN-END:variables
}
