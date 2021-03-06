/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package javaapplication1.chuong3.dohoa.frame;

import java.awt.Graphics2D;
import java.util.Random;

/**
 *
 * @author TRUNG HIEU
 */
public class XuatDuLieuFrame extends javax.swing.JInternalFrame {
    int[] a;

    /**
     * Creates new form XuatDuLieuFrame
     */
    public XuatDuLieuFrame() {
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

        pnhienthi = new javax.swing.JPanel();
        butve = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ve du lieu mang 1 chieu");

        javax.swing.GroupLayout pnhienthiLayout = new javax.swing.GroupLayout(pnhienthi);
        pnhienthi.setLayout(pnhienthiLayout);
        pnhienthiLayout.setHorizontalGroup(
            pnhienthiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );
        pnhienthiLayout.setVerticalGroup(
            pnhienthiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );

        butve.setText("Vẽ mảng 1 chiều ra màn hình");
        butve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butveActionPerformed(evt);
            }
        });

        jButton1.setLabel("Xắp xếp mảng 1 chiều");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(butve))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnhienthi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {butve, jButton1, pnhienthi});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnhienthi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butveActionPerformed
        // TODO add your handling code here:
        Graphics2D gr = (Graphics2D) pnhienthi.getGraphics();
        int maxX = pnhienthi.getWidth();
        int maxY = pnhienthi.getHeight();
        int step = 5;
        int n = maxX/step;
        a = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++){
            a[i] = rnd.nextInt(maxY);           
        }
        int beginX = 0, beginY = 0;
        gr.clearRect(0, 0, maxX, maxY);
        for(int i = 0; i < n; i++){
//            gr.drawRect(beginX, beginY, step, a[i]);
            gr.drawRect(beginX, maxY - a[i], step, a[i]);  
            beginX += step; 
        }
    }//GEN-LAST:event_butveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Graphics2D gr = (Graphics2D) pnhienthi.getGraphics();
        int maxX = pnhienthi.getWidth();
        int maxY = pnhienthi.getHeight();
        int step = 5;
        int n = maxX/step;
        int beginX = 0, beginX2 = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    //xoa hinh a[i] cu
                    gr.clearRect(beginX, maxY - a[i], step, a[i]);
                    // ve hinh a[i] moi
                    a[i] = a[j];
                    gr.drawRect(beginX, maxY - a[i], step, a[i]);
                    //xoa hinh a[j] cu
                    beginX2 = j*step;
                    gr.clearRect(beginX2, maxY - a[j], step, a[j]);
                    // ve hinh a[j] moi
                    a[j] = temp;
                    gr.drawRect(beginX2, maxY - a[j], step, a[j]);
                }
            }
            beginX += step;
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butve;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel pnhienthi;
    // End of variables declaration//GEN-END:variables
}
