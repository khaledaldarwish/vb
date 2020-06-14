
package otumasyon;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static otumasyon.guncelleme1.bilgi_karslastirma;
public class ogrenci_bilgileri extends javax.swing.JFrame {
    ogrenci_giris  bilgi_getir;  
    
     void tarihi(){
        Date now=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
        String simdi=sdf.format(now);
        tarih.setText(" "+simdi);
     }
    
    public ogrenci_bilgileri() {
        initComponents();
        setAlwaysOnTop(true);
        setResizable(false);
        tarihi();
    }

        public ogrenci_bilgileri(ogrenci_giris gelen_bilgi)
        {
           this();
           this.bilgi_getir=gelen_bilgi;
           
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
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        akademik3 = new javax.swing.JLabel();
        telefon_no = new javax.swing.JLabel();
        akademik4 = new javax.swing.JLabel();
        akademik5 = new javax.swing.JLabel();
        soyad = new javax.swing.JLabel();
        akademik6 = new javax.swing.JLabel();
        akademik1 = new javax.swing.JLabel();
        kimlik_no = new javax.swing.JLabel();
        soyad_bos = new javax.swing.JLabel();
        ad = new javax.swing.JLabel();
        ulke = new javax.swing.JLabel();
        kimlik = new javax.swing.JLabel();
        baba = new javax.swing.JLabel();
        dogum = new javax.swing.JLabel();
        telefon = new javax.swing.JLabel();
        anne = new javax.swing.JLabel();
        akademik16 = new javax.swing.JLabel();
        akademik17 = new javax.swing.JLabel();
        akademik18 = new javax.swing.JLabel();
        not_ortalama = new javax.swing.JLabel();
        boluma = new javax.swing.JLabel();
        kayit_tarih = new javax.swing.JLabel();
        ogrenci = new javax.swing.JLabel();
        akademik23 = new javax.swing.JLabel();
        lise = new javax.swing.JLabel();
        bitirme_tarih = new javax.swing.JLabel();
        alan = new javax.swing.JLabel();
        bolum = new javax.swing.JLabel();
        kayit_yili = new javax.swing.JLabel();
        ogrenci_no = new javax.swing.JLabel();
        not_ortalamasi = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        sifre = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        tarih = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("   ANDALUS ÜNİVERSİTESİ");

        akademik3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik3.setText(" Ülke:");

        telefon_no.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        telefon_no.setText("Telefon_No:");

        akademik4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik4.setText(" Baba adı :");

        akademik5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik5.setText("Dogum_tarihi:");

        soyad.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        soyad.setText(" Soyadi:");

        akademik6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik6.setText(" Anne adı:");

        akademik1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik1.setText(" AD:");

        kimlik_no.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        kimlik_no.setText("kimlik no/pasaport no:");

        soyad_bos.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        soyad_bos.setForeground(new java.awt.Color(204, 0, 0));

        ad.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        ad.setForeground(new java.awt.Color(204, 0, 0));

        ulke.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        ulke.setForeground(new java.awt.Color(204, 0, 0));

        kimlik.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        kimlik.setForeground(new java.awt.Color(204, 0, 0));

        baba.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        baba.setForeground(new java.awt.Color(204, 0, 0));

        dogum.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        dogum.setForeground(new java.awt.Color(204, 0, 0));

        telefon.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        telefon.setForeground(new java.awt.Color(204, 0, 0));

        anne.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        anne.setForeground(new java.awt.Color(204, 0, 0));

        akademik16.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik16.setText("Lise adi:");

        akademik17.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik17.setText("lisedeki alan:");

        akademik18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik18.setText("Lise bitirme tarihi:");

        not_ortalama.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        not_ortalama.setText("Not Ortalamasi:");

        boluma.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        boluma.setText("Bölüm:");

        kayit_tarih.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        kayit_tarih.setText("kayıt yılı:");

        ogrenci.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        ogrenci.setText("Ogrenci No:");

        akademik23.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik23.setText("Sifre:");

        lise.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lise.setForeground(new java.awt.Color(204, 0, 0));

        bitirme_tarih.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        bitirme_tarih.setForeground(new java.awt.Color(204, 0, 0));

        alan.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        alan.setForeground(new java.awt.Color(204, 0, 0));

        bolum.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        bolum.setForeground(new java.awt.Color(204, 0, 0));

        kayit_yili.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        kayit_yili.setForeground(new java.awt.Color(204, 0, 0));

        ogrenci_no.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        ogrenci_no.setForeground(new java.awt.Color(204, 0, 0));

        not_ortalamasi.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        not_ortalamasi.setForeground(new java.awt.Color(204, 0, 0));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 255));
        jButton1.setText("    Bilgilerimi göster");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        sifre.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        sifre.setForeground(new java.awt.Color(204, 0, 0));

        jButton2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 0));
        jButton2.setText("Güncelle");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kimlik_no)
                    .addComponent(akademik3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(akademik6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(akademik4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(akademik5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(akademik1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)))
                    .addComponent(telefon_no, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kimlik, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(soyad_bos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ulke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(baba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(anne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dogum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(akademik17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boluma, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(akademik18, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kayit_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ogrenci, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(akademik16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(not_ortalama, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(akademik23, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 108, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bitirme_tarih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bolum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(not_ortalamasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kayit_yili, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ogrenci_no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sifre, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(akademik16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(akademik1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lise, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(akademik17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(soyad_bos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(akademik18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bitirme_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kimlik_no, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kimlik, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(boluma, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bolum, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(akademik3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ulke, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(not_ortalama, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(not_ortalamasi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(akademik4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(baba, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(kayit_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kayit_yili, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(akademik6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(anne, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ogrenci, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ogrenci_no, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(akademik5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dogum, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(akademik23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(telefon_no, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(alan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String karakter=";";
        String kayedilen_matris[]=bilgi_karslastirma().split(karakter);
        int pozisyon=0;
        for(int i=0;i<kayedilen_matris.length;i++)
        {
            if(kayedilen_matris[i].equals(bilgi_getir.ogrenci_no_bos1.getText()))
            {
               ogrenci_no.setText(kayedilen_matris[i]);
               sifre.setText(kayedilen_matris[i+1]);
               kimlik.setText(kayedilen_matris[i+2]);
               ad.setText(kayedilen_matris[i+3]);
               soyad_bos.setText(kayedilen_matris[i+4]);
               anne.setText(kayedilen_matris[i+5]);
               baba.setText(kayedilen_matris[i+6]);
               telefon.setText(kayedilen_matris[i+7]);
               ulke.setText(kayedilen_matris[i+8]);
               dogum.setText(kayedilen_matris[i+9]);
               lise.setText(kayedilen_matris[i+10]);
               alan.setText(kayedilen_matris[i+11]);
               bitirme_tarih.setText(kayedilen_matris[i+12]);
               not_ortalamasi.setText(kayedilen_matris[i+13]);
               bolum.setText(kayedilen_matris[i+14]);
               kayit_yili.setText(kayedilen_matris[i+15]);
               
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(sifre.getText().length()<6 || kimlik.getText().length()==0)
        {
            JOptionPane.showMessageDialog(rootPane," Lütfen bilgilerimi goster botuna basiniz," +"\nŞifrenizi en az 6 karakterden oluşturunuz");
        }
        else
        {
            String ozel_karakter=";";             
             String guncelleme_matris1[]=bilgi_karslastirma().split(ozel_karakter);
             for(int i=0;i<guncelleme_matris1.length;i++)
              {
                if(guncelleme_matris1[i].equals(ogrenci_no.getText()))
                {
                    guncelleme_matris1[i]=ogrenci_no.getText();
                    guncelleme_matris1[i+1]=sifre.getText();
                    guncelleme_matris1[i+2]=kimlik.getText();
                    guncelleme_matris1[i+3]=ad.getText();
                    guncelleme_matris1[i+4]=soyad_bos.getText();
                    guncelleme_matris1[i+5]=anne.getText();
                    guncelleme_matris1[i+6]=baba.getText();
                    guncelleme_matris1[i+7]=telefon.getText();
                    guncelleme_matris1[i+8]=ulke.getText();
                    guncelleme_matris1[i+9]=dogum.getText();
                    guncelleme_matris1[i+10]=lise.getText();
                    guncelleme_matris1[i+11]=alan.getText();
                    guncelleme_matris1[i+12]=bitirme_tarih.getText();
                    guncelleme_matris1[i+13]=not_ortalamasi.getText();
                    guncelleme_matris1[i+14]=bolum.getText();
                    guncelleme_matris1[i+15]= kayit_yili.getText();
                    break;        
                }
              }
             String son_bilgi1="";
             for(int i=0;i<guncelleme_matris1.length;i++)
             {
               son_bilgi1=son_bilgi1+guncelleme_matris1[i]+";";  
             }
             Guncellene_BilgiYaz(son_bilgi1);
             JOptionPane.showMessageDialog(rootPane,"Bilgileri güncellenmiştir");
             ogrenci_giris s=new ogrenci_giris();
             s.setVisible(true);
             this.setVisible(false);
        }
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ogrenci_bilgileri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ogrenci_bilgileri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ogrenci_bilgileri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ogrenci_bilgileri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ogrenci_bilgileri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ad;
    private javax.swing.JLabel akademik1;
    private javax.swing.JLabel akademik16;
    private javax.swing.JLabel akademik17;
    private javax.swing.JLabel akademik18;
    private javax.swing.JLabel akademik23;
    private javax.swing.JLabel akademik3;
    private javax.swing.JLabel akademik4;
    private javax.swing.JLabel akademik5;
    private javax.swing.JLabel akademik6;
    private javax.swing.JLabel alan;
    private javax.swing.JLabel anne;
    private javax.swing.JLabel baba;
    private javax.swing.JLabel bitirme_tarih;
    private javax.swing.JLabel bolum;
    private javax.swing.JLabel boluma;
    private javax.swing.JLabel dogum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kayit_tarih;
    private javax.swing.JLabel kayit_yili;
    private javax.swing.JLabel kimlik;
    private javax.swing.JLabel kimlik_no;
    private javax.swing.JLabel lise;
    private javax.swing.JLabel not_ortalama;
    private javax.swing.JLabel not_ortalamasi;
    private javax.swing.JLabel ogrenci;
    private javax.swing.JLabel ogrenci_no;
    private javax.swing.JTextField sifre;
    private javax.swing.JLabel soyad;
    private javax.swing.JLabel soyad_bos;
    private javax.swing.JLabel tarih;
    private javax.swing.JLabel telefon;
    private javax.swing.JLabel telefon_no;
    private javax.swing.JLabel ulke;
    // End of variables declaration//GEN-END:variables
}
