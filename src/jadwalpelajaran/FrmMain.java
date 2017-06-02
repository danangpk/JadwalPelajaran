/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jadwalpelajaran;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmMain extends javax.swing.JFrame {
    private String hari = "senin";

    /** Creates new form FrmMain */
    public FrmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pnlSenin = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSenin = new javax.swing.JTable();
        lblHari = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        inpSenin = new javax.swing.JTextField();
        smpnSenin = new javax.swing.JButton();
        hpsSenin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Jadwal Pelajaran");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 280, 50);

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 10, 470, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 550, 70);

        pnlSenin.setBackground(new java.awt.Color(255, 51, 51));
        pnlSenin.setLayout(null);

        tblSenin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "No", "Mapel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSenin);

        pnlSenin.add(jScrollPane1);
        jScrollPane1.setBounds(260, 10, 170, 180);

        lblHari.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblHari.setForeground(new java.awt.Color(255, 255, 255));
        lblHari.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHari.setText("Senin");
        pnlSenin.add(lblHari);
        lblHari.setBounds(30, 20, 210, 20);

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        pnlSenin.add(jPanel4);
        jPanel4.setBounds(0, 10, 430, 40);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tambah Mata Pelajaran");
        pnlSenin.add(jLabel3);
        jLabel3.setBounds(10, 60, 230, 16);
        pnlSenin.add(inpSenin);
        inpSenin.setBounds(10, 80, 240, 24);

        smpnSenin.setText("Simpan");
        smpnSenin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smpnSeninActionPerformed(evt);
            }
        });
        pnlSenin.add(smpnSenin);
        smpnSenin.setBounds(170, 110, 73, 32);

        hpsSenin.setText("Hapus");
        hpsSenin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpsSeninActionPerformed(evt);
            }
        });
        pnlSenin.add(hpsSenin);
        hpsSenin.setBounds(360, 200, 77, 32);

        getContentPane().add(pnlSenin);
        pnlSenin.setBounds(0, 120, 460, 250);

        jButton1.setText("Senin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 80, 90, 32);

        jButton2.setText("Selasa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(100, 80, 90, 32);

        jButton3.setText("Rabu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(190, 80, 90, 32);

        jButton4.setText("Kamis");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(280, 80, 90, 32);

        jButton5.setText("Jum'at");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(370, 80, 80, 32);

        setSize(new java.awt.Dimension(472, 406));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        hari = "senin";
        lblHari.setText(hari);
        loadSenin();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void loadSenin(){
       String kolom[] = {"No","Mapel"};
       DefaultTableModel dtm = new DefaultTableModel(null, kolom);
       String SQL = "SELECT * FROM mapel WHERE hari ='"+hari+"'";
       ResultSet rs = DBConn.executeQuery(SQL);
       try{
           while(rs.next()){
               String id = rs.getString(1);
               String mapel = rs.getString(2);
               String data [] = {id,mapel};
               dtm.addRow(data);
           }   
        }catch(SQLException ex){
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
       tblSenin.setModel(dtm);
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        loadSenin();
    }//GEN-LAST:event_formWindowOpened

    private void smpnSeninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smpnSeninActionPerformed
        // TODO add your handling code here:
        String SQL = "INSERT INTO mapel (id,mapel,hari) "
                + "VALUES(NULL,'"+inpSenin.getText()+"','"+hari+"')";
        System.out.println(SQL);
        int status = DBConn.execute(SQL);
        if(status == 1){
            inpSenin.setText("");
            loadSenin();
        }else{
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_smpnSeninActionPerformed

    private void hpsSeninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpsSeninActionPerformed
        // TODO add your handling code here:
        int baris = tblSenin.getSelectedRow();
        String id = tblSenin.getValueAt(baris, 0).toString();
        String SQL = "DELETE FROM mapel WHERE id="+id;
        int status = DBConn.execute(SQL);
        if (status == 1) {
            loadSenin();
        }else{
            JOptionPane.showMessageDialog(this, "Data gagal disimpan", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_hpsSeninActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        hari = "selasa";
        lblHari.setText(hari);
        loadSenin();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        hari = "rabu";
        lblHari.setText(hari);
        loadSenin();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        hari = "kamis";
        lblHari.setText(hari);
        loadSenin();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        hari = "jumat";
        lblHari.setText(hari);
        loadSenin();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hpsSenin;
    private javax.swing.JTextField inpSenin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHari;
    private javax.swing.JPanel pnlSenin;
    private javax.swing.JButton smpnSenin;
    private javax.swing.JTable tblSenin;
    // End of variables declaration//GEN-END:variables

}
