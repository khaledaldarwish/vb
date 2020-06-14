
package otumasyon;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class yeni_kayit extends javax.swing.JFrame {

   
    void tarihi(){
        Date now=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
        String simdi=sdf.format(now);
        tarih.setText(" "+simdi);
     }
    
    
    public yeni_kayit() {
        initComponents();
        setAlwaysOnTop(true);
        setResizable(false);
        tarihi();
    }
    public static String Kimlik_karslastirma()
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
    
    
   
    void buyuk_harf(){
        if(ad_bos.getText().length()!=0){
            String deger=ad_bos.getText().substring(0,1).toUpperCase()+ad_bos.getText().substring(1);
          ad_bos.setText(deger);
        }
         if(soyad_bos.getText().length()!=0)
        {
             String deger=soyad_bos.getText().substring(0,1).toUpperCase()+soyad_bos.getText().substring(1);
          soyad_bos.setText(deger);
        }
        if(baba.getText().length()!=0)
        {
            String deger=baba.getText().substring(0,1).toUpperCase()+baba.getText().substring(1);
          baba.setText(deger); 
        }
        if(anne.getText().length()!=0){
             String deger=anne.getText().substring(0,1).toUpperCase()+anne.getText().substring(1);
          anne.setText(deger);
        }
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        akademik = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        akademik1 = new javax.swing.JLabel();
        akademik2 = new javax.swing.JLabel();
        ad_bos = new javax.swing.JTextField();
        kimlikNo = new javax.swing.JTextField();
        akademik3 = new javax.swing.JLabel();
        ulke = new javax.swing.JComboBox<>();
        akademik4 = new javax.swing.JLabel();
        akademik5 = new javax.swing.JLabel();
        akademik6 = new javax.swing.JLabel();
        baba = new javax.swing.JTextField();
        anne = new javax.swing.JTextField();
        telefon_bos = new javax.swing.JTextField();
        gun = new javax.swing.JComboBox<>();
        yil = new javax.swing.JComboBox<>();
        ay = new javax.swing.JComboBox<>();
        akademik7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        onceki = new javax.swing.JButton();
        soyad = new javax.swing.JLabel();
        soyad_bos = new javax.swing.JTextField();
        tarih = new javax.swing.JLabel();

        akademik.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik.setText("Akademisyn No");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("      ANDALUS ÜNİVERSİTESİ");

        akademik1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik1.setText("     AD");

        akademik2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik2.setText("kimlik no/pasaport no");

        ad_bos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        kimlikNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kimlikNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kimlikNoMouseClicked(evt);
            }
        });

        akademik3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik3.setText(" Ülke");

        ulke.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        ulke.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABD", "Afghanistan", "Albania", "Cezayir", "Arjantin", "Avustralya", "Azerbeycan", "Belçika", "Brezilya", "Çin", "Fransa", "Isapniya", "Almanya", "Portekez", "Yunanistan", "Iran", "Irak", "Japonya", "Meksika", "Romanya", "Suriye", "Tunus", "Türkiye", "Veitnam" }));

        akademik4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik4.setText(" Baba adı ");

        akademik5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik5.setText("Dogum_tarihi");

        akademik6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik6.setText("  Anne adı");

        baba.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        baba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                babaMouseClicked(evt);
            }
        });

        anne.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        anne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anneMouseClicked(evt);
            }
        });

        telefon_bos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        telefon_bos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefon_bosMouseClicked(evt);
            }
        });

        gun.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        gun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        gun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gunMouseClicked(evt);
            }
        });

        yil.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        yil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" }));
        yil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yilMouseClicked(evt);
            }
        });

        ay.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        ay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        ay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ayMouseClicked(evt);
            }
        });

        akademik7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik7.setText("Telefon_No");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Devam");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        onceki.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        onceki.setForeground(new java.awt.Color(204, 0, 0));
        onceki.setText("Önceki sayfa");
        onceki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oncekiActionPerformed(evt);
            }
        });

        soyad.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        soyad.setText("  Soyadi");

        soyad_bos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        soyad_bos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soyad_bosMouseClicked(evt);
            }
        });

        tarih.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(akademik1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(onceki)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gun, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ay, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yil, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tarih, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ad_bos, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                        .addComponent(telefon_bos))
                    .addComponent(soyad_bos, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kimlikNo, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ulke, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baba, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anne, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(akademik3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(akademik4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(akademik7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(akademik2)
                            .addComponent(akademik5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(akademik6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(akademik1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ad_bos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(akademik2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(akademik3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(akademik4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(akademik6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(akademik5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(akademik7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(soyad_bos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(kimlikNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ulke, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(baba, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anne, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yil)
                            .addComponent(ay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefon_bos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onceki, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        boolean kimlik_kontrol=true;
       boolean kontrol=true;
        String mesaj,mesaj2,mesaj3,mesaj4;
        if(ad_bos.getText().length()==0 || soyad_bos.getText().length()==0)
        {
          mesaj="Ad Soyad giriniz";
          kontrol=false;
          JOptionPane.showMessageDialog(rootPane, mesaj);
        }
       if(kimlikNo.getText().length()!=11)
        {
            mesaj2="Kimlik/Pasaport no 11 hane giriniz";
           kontrol=false;
           JOptionPane.showMessageDialog(rootPane, mesaj2);
        }
        if(baba.getText().length()==0 || anne.getText().length()==0)
        {
             mesaj3="Baba anne adi giriniz";
           kontrol=false;
           JOptionPane.showMessageDialog(rootPane, mesaj3);
        }
        if(telefon_bos.getText().length()!=11 )
        {
             mesaj4="Lütfen geçerli telefon numarası giriniz  Örenk:09999999999";
           kontrol=false;
           JOptionPane.showMessageDialog(rootPane, mesaj4);
        }
        
        
        if(kontrol){
       
        String ozel_karakter=";";
        String kayidedilecek_kimlik="";
        kayidedilecek_kimlik=kimlikNo.getText();
        String kimlik_matris[]=Kimlik_karslastirma().split(ozel_karakter);
         for(int i=0;i<kimlik_matris.length;i++)
        {
            if(kimlik_matris[i].equals(kayidedilecek_kimlik))
                    {
                      kimlik_kontrol=false;
                      JOptionPane.showMessageDialog(rootPane,"Girdiğiniz kimlik numarası daha önce kayidedilmiştir");  
                      break;
                    }
        }
        
         if(kimlik_kontrol){    
          yeni_kayit1 y1=new yeni_kayit1(this);
          y1.setVisible(true);
          this.setVisible(false);
         }
         else
         {
             
         }
        }
        else
        { 
            
        }
        
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void oncekiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oncekiActionPerformed
        islemler pg=new islemler();
        pg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_oncekiActionPerformed

    private void soyad_bosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soyad_bosMouseClicked
        buyuk_harf();
    }//GEN-LAST:event_soyad_bosMouseClicked

    private void kimlikNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kimlikNoMouseClicked
       buyuk_harf();
    }//GEN-LAST:event_kimlikNoMouseClicked

    private void babaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_babaMouseClicked
        buyuk_harf();
    }//GEN-LAST:event_babaMouseClicked

    private void anneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anneMouseClicked
        buyuk_harf();
    }//GEN-LAST:event_anneMouseClicked

    private void gunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gunMouseClicked
        buyuk_harf();
    }//GEN-LAST:event_gunMouseClicked

    private void ayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayMouseClicked
        buyuk_harf();
    }//GEN-LAST:event_ayMouseClicked

    private void yilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yilMouseClicked
        buyuk_harf();
    }//GEN-LAST:event_yilMouseClicked

    private void telefon_bosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefon_bosMouseClicked
        buyuk_harf();
    }//GEN-LAST:event_telefon_bosMouseClicked

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
            java.util.logging.Logger.getLogger(yeni_kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yeni_kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yeni_kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yeni_kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yeni_kayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField ad_bos;
    private javax.swing.JLabel akademik;
    private javax.swing.JLabel akademik1;
    private javax.swing.JLabel akademik2;
    private javax.swing.JLabel akademik3;
    private javax.swing.JLabel akademik4;
    private javax.swing.JLabel akademik5;
    private javax.swing.JLabel akademik6;
    private javax.swing.JLabel akademik7;
    public javax.swing.JTextField anne;
    public javax.swing.JComboBox<String> ay;
    public javax.swing.JTextField baba;
    public javax.swing.JComboBox<String> gun;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JTextField kimlikNo;
    private javax.swing.JButton onceki;
    private javax.swing.JLabel soyad;
    public javax.swing.JTextField soyad_bos;
    private javax.swing.JLabel tarih;
    public javax.swing.JTextField telefon_bos;
    public javax.swing.JComboBox<String> ulke;
    public javax.swing.JComboBox<String> yil;
    // End of variables declaration//GEN-END:variables
}
