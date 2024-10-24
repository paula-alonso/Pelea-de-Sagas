/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Clases.AI;
import Clases.Admin;
import Clases.Saga;
import Clases.Character;
import Clases.Global;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author alons
 */
public class Home extends javax.swing.JFrame {
    
    public static int id;
    Global g = new Global();
    private Saga starWars = new Saga("star wars");
    private Saga starTrek = new Saga("star trek");
    AI ai = new AI(starWars, starTrek);
    Admin admin = new Admin(ai);
   
   
    
    

    /**
     * Creates new form Home
     */
    public Home() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        starWars.setCharacter_list(g.star_wars_characters_names);
        starTrek.setCharacter_list(g.star_trek_characters_names);
        
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
        jButton1 = new javax.swing.JButton();
        character1 = new javax.swing.JLabel();
        character2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        ColaR_s22 = new javax.swing.JScrollPane();
        ColaR_s2 = new javax.swing.JTextArea();
        ColaR_s11 = new javax.swing.JScrollPane();
        ColaR_s1 = new javax.swing.JTextArea();
        ColaH_s22 = new javax.swing.JScrollPane();
        ColaH_s2 = new javax.swing.JTextArea();
        ColaM_s22 = new javax.swing.JScrollPane();
        ColaM_s2 = new javax.swing.JTextArea();
        ColaM_s11 = new javax.swing.JScrollPane();
        ColaM_s1 = new javax.swing.JTextArea();
        ColaL_s22 = new javax.swing.JScrollPane();
        ColaL_s2 = new javax.swing.JTextArea();
        ColaL_s11 = new javax.swing.JScrollPane();
        ColaL_s1 = new javax.swing.JTextArea();
        ColaH_s11 = new javax.swing.JScrollPane();
        ColaH_s1 = new javax.swing.JTextArea();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(147, 118, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 670, 200, 60));

        character1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        character1.setForeground(new java.awt.Color(255, 255, 255));
        character1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        character1.setText("Id: Nombre");
        jPanel1.add(character1, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 520, 240, -1));

        character2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        character2.setForeground(new java.awt.Color(255, 255, 255));
        character2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        character2.setText("Id: Nombre");
        jPanel1.add(character2, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 520, 250, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cards - Copy.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 240, 340));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cards.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 250, 340));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(241, 193, 0));
        jLabel12.setText("Cola 1");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(241, 193, 0));
        jLabel13.setText("Cola 2");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, -1, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(241, 193, 0));
        jLabel14.setText("Cola 3");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, -1, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(241, 193, 0));
        jLabel15.setText("Cola de refuerzo");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 510, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(241, 193, 0));
        jLabel11.setText("Cola de refuerzo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(241, 193, 0));
        jLabel10.setText("Cola 3");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(241, 193, 0));
        jLabel9.setText("Cola 2");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(241, 193, 0));
        jLabel8.setText("Cola 1");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(241, 193, 0));
        jLabel4.setText("VS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lista de ganadores:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, -1, -1));

        jScrollPane1.setViewportView(jEditorPane1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 420, 60));

        ColaR_s2.setColumns(20);
        ColaR_s2.setRows(5);
        ColaR_s22.setViewportView(ColaR_s2);

        jPanel1.add(ColaR_s22, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, 190, 80));

        ColaR_s1.setColumns(20);
        ColaR_s1.setRows(5);
        ColaR_s11.setViewportView(ColaR_s1);

        jPanel1.add(ColaR_s11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 190, 80));

        ColaH_s2.setColumns(20);
        ColaH_s2.setRows(5);
        ColaH_s22.setViewportView(ColaH_s2);

        jPanel1.add(ColaH_s22, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 170, 190, 80));

        ColaM_s2.setColumns(20);
        ColaM_s2.setRows(5);
        ColaM_s22.setViewportView(ColaM_s2);

        jPanel1.add(ColaM_s22, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, 190, 80));

        ColaM_s1.setColumns(20);
        ColaM_s1.setRows(5);
        ColaM_s11.setViewportView(ColaM_s1);

        jPanel1.add(ColaM_s11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 190, 80));

        ColaL_s2.setColumns(20);
        ColaL_s2.setRows(5);
        ColaL_s22.setViewportView(ColaL_s2);

        jPanel1.add(ColaL_s22, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 190, 80));

        ColaL_s1.setColumns(20);
        ColaL_s1.setRows(5);
        ColaL_s11.setViewportView(ColaL_s1);

        jPanel1.add(ColaL_s11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 190, 80));

        ColaH_s1.setColumns(20);
        ColaH_s1.setRows(5);
        ColaH_s11.setViewportView(ColaH_s1);

        jPanel1.add(ColaH_s11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 80));

        Fondo.setForeground(new java.awt.Color(60, 63, 65));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/background.png"))); // NOI18N
        Fondo.setText("jLabel1");
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        JTextArea[] labels1 = new JTextArea[]{ColaH_s1, ColaM_s1, ColaL_s1, ColaR_s1};
        JTextArea[] labels2 = new JTextArea[]{ColaH_s2, ColaM_s2, ColaL_s2, ColaR_s2};
        
        starWars.setTextAreas(labels1);
        starTrek.setTextAreas(labels2);
        
        starWars.setTitle_lable(character1);
        starTrek.setTitle_lable(character2);
        
        for (int i = 0; i<20; i++){
            
            starWars.addCharacter(i);
            starTrek.addCharacter(i);
               
        }
        
        
        admin.start();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ColaH_s1;
    private javax.swing.JScrollPane ColaH_s11;
    private javax.swing.JTextArea ColaH_s2;
    private javax.swing.JScrollPane ColaH_s22;
    private javax.swing.JTextArea ColaL_s1;
    private javax.swing.JScrollPane ColaL_s11;
    private javax.swing.JTextArea ColaL_s2;
    private javax.swing.JScrollPane ColaL_s22;
    private javax.swing.JTextArea ColaM_s1;
    private javax.swing.JScrollPane ColaM_s11;
    private javax.swing.JTextArea ColaM_s2;
    private javax.swing.JScrollPane ColaM_s22;
    private javax.swing.JTextArea ColaR_s1;
    private javax.swing.JScrollPane ColaR_s11;
    private javax.swing.JTextArea ColaR_s2;
    private javax.swing.JScrollPane ColaR_s22;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel character1;
    private javax.swing.JLabel character2;
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
