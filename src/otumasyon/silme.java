/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otumasyon;
import java.util.regex.Pattern;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static otumasyon.guncelleme1.bilgi_karslastirma;
public class silme extends javax.swing.JFrame {

    /**
     * Creates new form silme
     */
    
     void tarihi(){
        Date now=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
        String simdi=sdf.format(now);
        tarih.setText(" "+simdi);
     }
    
    
    
    public silme() {
        initComponents();
        setAlwaysOnTop(true);
        setResizable(false);
        tarihi();
    }
     public static String ogrenci_karslastirma()
    {
        String deger1="";
        File file=new File("C:\\otomasyon\\depo.txt");
        try
        {
          Scanner giris=new Scanner(file);
          deger1=giris.nextLine();
          giris.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return deger1;
    }
      public static String bilgi_karslastirma()
    {
        String deger="";
        File file=new File("C:\\otomasyon\\depo.txt");
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
       public static void Guncellene_BilgiYaz(String bilgi)
       {
          File file=new File("C:\\otomasyon\\depo.txt");
          try
          {
            FileOutputStream dosya=new FileOutputStream(file);
            dosya.write(bilgi.getBytes());
            dosya.flush();
            dosya.close();
          }
           catch(Exception ex)
          {
             ex.printStackTrace();
          }
       }
        public static String kimlik()
    {
        String deger2="";
        File file=new File("C:\\otomasyon\\depo.txt");
        try
        {
          Scanner giris=new Scanner(file);
          deger2=giris.nextLine();
          giris.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return deger2;
    }
       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        akademik6 = new javax.swing.JLabel();
        ogrenci_no = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        uyari = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        tarih = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("      ANDALUS ÜNİVERSİTESİ");

        akademik6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik6.setText("Ogrenci no");

        ogrenci_no.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ogrenci_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenci_noActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Devam");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        uyari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Önceki sayfa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tarih.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(akademik6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ogrenci_no, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(26, 26, 26)
                .addComponent(uyari, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(akademik6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ogrenci_no, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(uyari, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ogrenci_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrenci_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ogrenci_noActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean b=Pattern.matches("\\d{9}",ogrenci_no.getText());
        if(b)
        {
            uyari.setForeground(new Color(0,150,0));
            uyari.setText("Dogru");
            String karakter=";";
            boolean kontrol=true;
            String ogrenci_matris[]=ogrenci_karslastirma().split(karakter);
            String yazilan_ogrenci_no=ogrenci_no.getText();
            for(int i=0;i<ogrenci_matris.length;i++)
            {
                if(ogrenci_matris[i].equals(yazilan_ogrenci_no))
                {
                    kontrol=false;
                    break;
                }
            }
            if(kontrol)
            {
                JOptionPane.showMessageDialog(rootPane,"Girilen Öğrenci no kayitli değildir");
            }
            else
            {
             int yanit=  JOptionPane.showConfirmDialog(this, "kayit silmekten emin misiniz ","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
               if(yanit==JOptionPane.YES_OPTION){
               String ozel_karakter=";";
               int pozisyon=0;
               String guncelleme_matris[]=bilgi_karslastirma().split(ozel_karakter);
               for(int i=0;i<guncelleme_matris.length;i++)
               {
                 if(guncelleme_matris[i].equals(ogrenci_no.getText()))
                 {
                   pozisyon=i;
                   break;
                 }
               }
               String son_bilgi="";
               for(int i=0;i<guncelleme_matris.length;i++)
               {
                   if(i<pozisyon || i>pozisyon+15)
                   {
                     son_bilgi=son_bilgi+guncelleme_matris[i]+";";  
                   }
               }
               int pozisyon2=0;
               String kimlik_matris[]=kimlik().split(ozel_karakter);
               for(int j=0;j<kimlik_matris.length;j++)
               {
                   if(kimlik_matris[j].equals(guncelleme_matris[pozisyon+2]))
                   {
                      pozisyon2=j;
                      break;
                   }
               }
             
               Guncellene_BilgiYaz(son_bilgi);
               
               JOptionPane.showMessageDialog(rootPane,ogrenci_no.getText()+" öğrenci numarasıyıla bilgiler silindi");
               islemler i=new islemler();
               i.setVisible(true);
               this.setVisible(false);
               
            }
            }

        }
        else
        {
            uyari.setForeground(new Color(150,0,0));
            uyari.setText("Yanlis");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        islemler i=new islemler();
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(silme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(silme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(silme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(silme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new silme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel akademik6;
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JTextField ogrenci_no;
    private javax.swing.JLabel tarih;
    private javax.swing.JLabel uyari;
    // End of variables declaration//GEN-END:variables
}
