/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexadon;

/**
 *
 * @author S_340
 */
public class Bon extends javax.swing.JFrame {

    /**
     * Creates new form Bon
     */
    public Bon() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("SAN DONUTS AND CAKES");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 20, 160, 20);

        jLabel3.setText("Jl. Glee Iniem - Aceh Besar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 40, 160, 20);

        jLabel4.setText("Telp. 081234567890");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 540, 150, 20);

        jLabel5.setText("Tue, 05/01/2021 | 09:22:54 PM");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 110, 190, 20);

        jLabel6.setText("@San_donutsandcakes");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(440, 540, 160, 20);

        jLabel7.setText("Kode Transaksi");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 170, 110, 20);

        jLabel8.setText("Don8163");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 170, 170, 20);

        jLabel9.setText("Nama Pelanggan");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 220, 130, 20);

        jLabel10.setText("Saiful");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(380, 220, 180, 20);

        jLabel11.setText("Total");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(70, 270, 36, 20);

        jLabel12.setText("Tunai");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(70, 310, 48, 20);

        jLabel13.setText("Kembalian");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(70, 360, 90, 20);

        jLabel14.setText("Rp. 40.000");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(380, 270, 160, 20);

        jLabel15.setText("Rp. 35.000");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(380, 310, 150, 20);

        jLabel16.setText("Rp. 5.000");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(380, 360, 150, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/BG_Bon.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Bon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
