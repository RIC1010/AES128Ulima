/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import AES.*;
import javax.swing.JOptionPane;
/**
 *
 * @author rseba
 */
public class UlimaTI extends javax.swing.JFrame {

    /**
     * Creates new form UlimaTI
     */
    int x, y;
    public UlimaTI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        lbMover = new javax.swing.JLabel();
        lbLogo = new javax.swing.JLabel();
        lbTP = new javax.swing.JLabel();
        lbK = new javax.swing.JLabel();
        txtTP = new javax.swing.JTextField();
        txtLlave = new javax.swing.JTextField();
        btnEncrip = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbRes = new javax.swing.JLabel();
        lbPres = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(237, 66, 69));
        btnSalir.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 110, 40));

        lbMover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mover2.png"))); // NOI18N
        lbMover.setText("    ");
        lbMover.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        lbMover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lbMoverMouseDragged(evt);
            }
        });
        lbMover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbMoverMousePressed(evt);
            }
        });
        getContentPane().add(lbMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 0, 80, 20));

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo3.png"))); // NOI18N
        getContentPane().add(lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 70));

        lbTP.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbTP.setForeground(new java.awt.Color(255, 255, 255));
        lbTP.setText("Texto plano de 16 caracteres: ");
        getContentPane().add(lbTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        lbK.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbK.setForeground(new java.awt.Color(255, 255, 255));
        lbK.setText("Llave de 128 bits: ");
        getContentPane().add(lbK, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        txtTP.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtTP.setToolTipText("");
        txtTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTPActionPerformed(evt);
            }
        });
        getContentPane().add(txtTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 350, 50));
        txtTP.getAccessibleContext().setAccessibleName("");

        txtLlave.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtLlave.setText("000102030405060708090a0b0c0d0e0f");
        getContentPane().add(txtLlave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 350, 50));

        btnEncrip.setBackground(new java.awt.Color(54, 57, 63));
        btnEncrip.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btnEncrip.setForeground(new java.awt.Color(255, 255, 255));
        btnEncrip.setText("Encriptar");
        btnEncrip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncripActionPerformed(evt);
            }
        });
        getContentPane().add(btnEncrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 112, 108));

        lbRes.setBackground(new java.awt.Color(255, 255, 255));
        lbRes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(lbRes, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbRes, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 500, 100));

        lbPres.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbPres.setForeground(new java.awt.Color(255, 255, 255));
        lbPres.setText("TEXTO ENCRIPTADO:");
        getContentPane().add(lbPres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnLimpiar.setText("Limpiar datos");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 112, -1));

        lbFondo.setBackground(new java.awt.Color(102, 83, 69));
        lbFondo.setForeground(new java.awt.Color(102, 83, 69));
        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo2.png"))); // NOI18N
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTPActionPerformed

    private void btnEncripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncripActionPerformed
        // TODO add your handling code here:
        String tp=this.txtTP.getText();
        String key=this.txtLlave.getText();
        if(tp.length()!=16){
            JOptionPane.showMessageDialog(null, "Cantidad de caracteres en el texto no v??lidas. Ingrese nuevamente los datos");
        }else if(key.length()!=32){
            JOptionPane.showMessageDialog(null, "Cantidad de caracteres en la llave no v??lidas. Ingrese nuevamente los datos");
        }else if(key.length()==32 && tp.length()==16){
            boolean res=true;
            for (int i = 0; i < 32; i++) {
                if(key.charAt(i)>=48 && key.charAt(i)<=57 || key.charAt(i)>=65 && key.charAt(i)<=70 || key.charAt(i)>=97 && key.charAt(i)<=102 ){
                    continue;
                }else{
                    res=false;
                    break;
                }
            }
            if(!res){
                JOptionPane.showMessageDialog(null, "Solo se aceptan valores hexadecimales en la llave. Ingrese nuevamente los datos");
            }else{
                this.lbRes.setText(AES.resol(tp, key));
            }
        }
    }//GEN-LAST:event_btnEncripActionPerformed

    private void lbMoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMoverMousePressed
        // TODO add your handling code here:
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_lbMoverMousePressed

    private void lbMoverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMoverMouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x+evt.getX()-x,this.getLocation().y+evt.getY()-y);
    }//GEN-LAST:event_lbMoverMouseDragged

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.lbRes.setText("");
        this.txtTP.setText("");
        this.txtLlave.setText("000102030405060708090a0b0c0d0e0f");
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(UlimaTI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UlimaTI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UlimaTI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UlimaTI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UlimaTI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncrip;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbK;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbMover;
    private javax.swing.JLabel lbPres;
    private javax.swing.JLabel lbRes;
    private javax.swing.JLabel lbTP;
    private javax.swing.JTextField txtLlave;
    private javax.swing.JTextField txtTP;
    // End of variables declaration//GEN-END:variables
}
