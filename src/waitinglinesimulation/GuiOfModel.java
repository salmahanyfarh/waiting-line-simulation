/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waitinglinesimulation;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class GuiOfModel extends javax.swing.JFrame {

    /**
     * Creates new form GuiOfModel
     */
    public GuiOfModel() {
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
        arrivals = new javax.swing.JLabel();
        people = new javax.swing.JLabel();
        jTextField_NOArrivals = new javax.swing.JTextField();
        jTextField_NOPeople = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Calculate = new javax.swing.JButton();
        warnning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        arrivals.setText("Number of arrivals");

        people.setText("Number of people ");

        jTextField_NOArrivals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NOArrivalsActionPerformed(evt);
            }
        });

        jTextField_NOPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NOPeopleActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 204, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Waiting Line Model ");
        jLabel1.setAutoscrolls(true);

        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(people)
                            .addComponent(arrivals))
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_NOPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_NOArrivals, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(warnning, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrivals)
                    .addComponent(jTextField_NOArrivals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(people)
                    .addComponent(jTextField_NOPeople, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(Calculate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warnning)
                .addGap(96, 96, 96))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_NOArrivalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NOArrivalsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NOArrivalsActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        Rules x = new Rules ();
        Case1 y =new Case1();
        
        if(!jTextField_NOArrivals.getText().equals("") && !jTextField_NOPeople.getText().equals("")){
            float L = x.avr_customers_of_system(Float.parseFloat(jTextField_NOArrivals.getText()), Float.parseFloat(jTextField_NOPeople.getText()));
                String L2 = Float. toString(L);
                y.jLabel_L.setText(L2);
               
            float W = x.spending_avr_time(Float.parseFloat(jTextField_NOArrivals.getText()), Float.parseFloat(jTextField_NOPeople.getText()));
                String W2 = Float. toString(W);
                y.jLabel_W.setText(W2);
                
            float Lq = x.avr_customers_in_queue(Float.parseFloat(jTextField_NOArrivals.getText()), Float.parseFloat(jTextField_NOPeople.getText()));
                String Lq2 = Float. toString(Lq);
                y.jLabel_Lq.setText(Lq2);
                
            float Wq = x.spending_avr_time_queue(Float.parseFloat(jTextField_NOArrivals.getText()), Float.parseFloat(jTextField_NOPeople.getText()));
                String Wq2 = Float. toString(Wq);
                y.jLabelWQ.setText(Wq2);
                
            float P = x.utilization_factor(Float.parseFloat(jTextField_NOArrivals.getText()), Float.parseFloat(jTextField_NOPeople.getText()));
                String P2 = Float. toString(P);
                y.jLabelP.setText(P2);
                
            float P0 = x.idle_time(Float.parseFloat(jTextField_NOArrivals.getText()), Float.parseFloat(jTextField_NOPeople.getText()));
                String P02 = Float. toString(P0);
                y.jLabelP0.setText(P02);
            
                
          /*  int K;
            float Pn = 0;
            for (K=0;K<L;K++)
                {
                    K = Integer.parseInt(jTextField_K.getText());    
                    int [][]Customers = new int[K][2];
                    Pn = x.Customers_greaterthan_N( L,Float.parseFloat(jTextField_NOArrivals.getText()), Float.parseFloat(jTextField_NOPeople.getText()),Customers );
                }
                String Pn2 = Float. toString(Pn);
                y.jLabel_PNK.setText(Pn2);*/
                
                this.setVisible(false);
                y.setVisible(true);                                                      
        }
        else{
            warnning.setText("Data is not completed...");
        }
    }//GEN-LAST:event_CalculateActionPerformed

    private void jTextField_NOPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NOPeopleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NOPeopleActionPerformed

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
            java.util.logging.Logger.getLogger(GuiOfModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiOfModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiOfModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiOfModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiOfModel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JLabel arrivals;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_NOArrivals;
    private javax.swing.JTextField jTextField_NOPeople;
    private javax.swing.JLabel people;
    private javax.swing.JLabel warnning;
    // End of variables declaration//GEN-END:variables
}
