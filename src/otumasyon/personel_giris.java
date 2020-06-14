
package otumasyon;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.Timer;
public class personel_giris extends javax.swing.JFrame {
    Timer time;
    void tarihi(){
        Date now=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
        String simdi=sdf.format(now);
        tarih.setText(" "+simdi);
     }
    
    
    public personel_giris() {
        initComponents();
        setAlwaysOnTop(true);
        setResizable(false);
        tarihi();
    }
    public static String karslastirma()
    {
        String deger="";
        File file=new File("C:\\otomasyon\\personeller.txt");
        try
        {
          Scanner giris=new Scanner(file);
          deger=giris.nextLine();
          giris.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return deger;
    }
            
    
        
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        akademik = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ak_no = new javax.swing.JTextField();
        giris1 = new javax.swing.JButton();
        sifre = new javax.swing.JPasswordField();
        once = new javax.swing.JButton();
        tarih = new javax.swing.JLabel();
        zaman = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("     ANDALUS ÜNİVERSİTESİ");

        akademik.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik.setText("Akademisyn No");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel3.setText("    Sifre");

        giris1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        giris1.setForeground(new java.awt.Color(0, 102, 0));
        giris1.setText("Giris");
        giris1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giris1ActionPerformed(evt);
            }
        });

        sifre.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N

        once.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        once.setForeground(new java.awt.Color(204, 0, 0));
        once.setText("Önceki sayfa");
        once.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onceActionPerformed(evt);
            }
        });

        tarih.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(once, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(giris1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zaman, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(akademik, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ak_no))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(akademik, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ak_no, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(sifre))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(giris1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(once, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     int k=0;
     int aded=45;
    private void giris1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giris1ActionPerformed
    String yazilan_bilgi=sifre.getText()+ak_no.getText();
    String karakter=";";
    boolean kontrol=true;
    String personel_matris[]=karslastirma().split(karakter);
    for(int i=0;i<personel_matris.length;i++)
    {
        if(yazilan_bilgi.equals(personel_matris[i]))
        {
           kontrol=false;
           break;
        }
    }
    if(kontrol)
    {
        JOptionPane.showMessageDialog(rootPane,"Kullanici adi veya sifre yanlis girildi");
        k++;
           if(k==3){
            giris1.setEnabled(false);  
            once.setEnabled(false);
            time=new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  zaman.setText("Hesap blok edildi "+String.valueOf(aded)+" saniye sonra tekrar deneyiniz");
                  aded--;
                  if(aded==-1)
            {
                zaman.setText("");
                k=0;
                aded=45;
                
                time.stop();
                giris1.setEnabled(true);
                 once.setEnabled(true);
            }
                }
            });
            
            time.start();
            
            
           }
    }
    else
    {
      islemler i=new islemler();
      i.setVisible(true);
      this.setVisible(false);
    }
    }//GEN-LAST:event_giris1ActionPerformed

    private void onceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onceActionPerformed
        kullanici k=new kullanici();
        k.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_onceActionPerformed

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
            java.util.logging.Logger.getLogger(personel_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personel_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personel_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personel_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personel_giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ak_no;
    private javax.swing.JLabel akademik;
    private javax.swing.JButton giris1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton once;
    private javax.swing.JPasswordField sifre;
    private javax.swing.JLabel tarih;
    private javax.swing.JLabel zaman;
    // End of variables declaration//GEN-END:variables
}
