/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author userpc
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        setSize(650,400);
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
        jMenuBar1 = new javax.swing.JMenuBar();
        menuTrans = new javax.swing.JMenu();
        menuKaryawan = new javax.swing.JMenuItem();
        menuJabatan = new javax.swing.JMenuItem();
        menuTransaksi = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuLapKar = new javax.swing.JMenuItem();
        menuLapTrans = new javax.swing.JMenuItem();
        menuKeluar = new javax.swing.JMenu();
        menuitemKeluar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("APLIKASI KEPEGAWAIAN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 90, 337, 36);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel2.setText("By :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 150, 25, 18);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel3.setText("Auliya Hamdanah (19630419)");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 180, 257, 21);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program/2.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 640, 360);

        menuTrans.setText("Form");

        menuKaryawan.setText("Form Karyawan");
        menuKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKaryawanActionPerformed(evt);
            }
        });
        menuTrans.add(menuKaryawan);

        menuJabatan.setText("Form Jabatan");
        menuJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuJabatanActionPerformed(evt);
            }
        });
        menuTrans.add(menuJabatan);

        menuTransaksi.setText("Form Transaksi");
        menuTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTransaksiActionPerformed(evt);
            }
        });
        menuTrans.add(menuTransaksi);

        jMenuBar1.add(menuTrans);

        jMenu2.setText("Laporan");

        menuLapKar.setText("Laporan Karyawan");
        menuLapKar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLapKarActionPerformed(evt);
            }
        });
        jMenu2.add(menuLapKar);

        menuLapTrans.setText("Laporan Transaksi");
        menuLapTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLapTransActionPerformed(evt);
            }
        });
        jMenu2.add(menuLapTrans);

        jMenuBar1.add(jMenu2);

        menuKeluar.setText("Tutup");

        menuitemKeluar.setText("Keluar");
        menuitemKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemKeluarActionPerformed(evt);
            }
        });
        menuKeluar.add(menuitemKeluar);

        jMenuBar1.add(menuKeluar);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKaryawanActionPerformed
       Karyawan kyw = new Karyawan ();
       kyw.setSize(870, 475);
       kyw.show();
    }//GEN-LAST:event_menuKaryawanActionPerformed

    private void menuJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJabatanActionPerformed
        Jabatan jbt = new Jabatan ();
        jbt.setSize(570, 475);
        jbt.show();
    }//GEN-LAST:event_menuJabatanActionPerformed

    private void menuitemKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemKeluarActionPerformed
       System.exit(0);
    }//GEN-LAST:event_menuitemKeluarActionPerformed

    private void menuTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTransaksiActionPerformed
        Gaji gaji = null;
        try {
            gaji = new Gaji();
        } catch (SQLException ex) {
            Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
        gaji.setSize(870,770);
        gaji.show();
        
    }//GEN-LAST:event_menuTransaksiActionPerformed

    private void menuLapKarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLapKarActionPerformed
        // TODO add your handling code here:
        new Karyawan().show();
        this.dispose();
    }//GEN-LAST:event_menuLapKarActionPerformed

    private void menuLapTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLapTransActionPerformed
        try {
            // TODO add your handling code here:
            new Gaji().show();
        } catch (SQLException ex) {
            Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_menuLapTransActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuJabatan;
    private javax.swing.JMenuItem menuKaryawan;
    private javax.swing.JMenu menuKeluar;
    private javax.swing.JMenuItem menuLapKar;
    private javax.swing.JMenuItem menuLapTrans;
    private javax.swing.JMenu menuTrans;
    private javax.swing.JMenuItem menuTransaksi;
    private javax.swing.JMenuItem menuitemKeluar;
    // End of variables declaration//GEN-END:variables
}
