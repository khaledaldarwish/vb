
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
public class guncelleme1 extends javax.swing.JFrame {
    
    guncelleme bilgi_getir;
    
     void tarihi(){
        Date now=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
        String simdi=sdf.format(now);
        tarih.setText(" "+simdi);
     }
    
    public guncelleme1() {
        initComponents();
        setAlwaysOnTop(true);
        setResizable(false);
        tarihi();
    }
    
    void buyuk_harf(){
        if(ad_bos1.getText().length()!=0){
            String deger=ad_bos1.getText().substring(0,1).toUpperCase()+ad_bos1.getText().substring(1);
          ad_bos1.setText(deger);
        }
         if(soyad_bos1.getText().length()!=0)
        {
             String deger=soyad_bos1.getText().substring(0,1).toUpperCase()+soyad_bos1.getText().substring(1);
          soyad_bos1.setText(deger);
        }
        if(baba1.getText().length()!=0)
        {
            String deger=baba1.getText().substring(0,1).toUpperCase()+baba1.getText().substring(1);
          baba1.setText(deger); 
        }
        if(anne1.getText().length()!=0){
             String deger=anne1.getText().substring(0,1).toUpperCase()+anne1.getText().substring(1);
          anne1.setText(deger);
        }
        if(lise1.getText().length()!=0){
            String deger=lise1.getText().substring(0,1).toUpperCase()+lise1.getText().substring(1);
          lise1.setText(deger);
        }
         if(alan1.getText().length()!=0)
        {
             String deger=alan1.getText().substring(0,1).toUpperCase()+alan1.getText().substring(1);
          alan1.setText(deger);
        }
        if(bolum1.getText().length()!=0)
        {
            String deger=bolum1.getText().substring(0,1).toUpperCase()+bolum1.getText().substring(1);
          bolum1.setText(deger); 
        }
        
        
    }
    
    public guncelleme1(guncelleme gelen_bilgi)
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

        gun = new javax.swing.JComboBox<>();
        yil = new javax.swing.JComboBox<>();
        ay = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        akademik3 = new javax.swing.JLabel();
        akademik7 = new javax.swing.JLabel();
        akademik4 = new javax.swing.JLabel();
        akademik5 = new javax.swing.JLabel();
        soyad = new javax.swing.JLabel();
        akademik6 = new javax.swing.JLabel();
        akademik1 = new javax.swing.JLabel();
        akademik2 = new javax.swing.JLabel();
        soyad_bos1 = new javax.swing.JTextField();
        ad_bos1 = new javax.swing.JTextField();
        ulke1 = new javax.swing.JComboBox<>();
        baba1 = new javax.swing.JTextField();
        anne1 = new javax.swing.JTextField();
        telefon_bos1 = new javax.swing.JTextField();
        gun1 = new javax.swing.JComboBox<>();
        yil1 = new javax.swing.JComboBox<>();
        ay1 = new javax.swing.JComboBox<>();
        akademik8 = new javax.swing.JLabel();
        akademik9 = new javax.swing.JLabel();
        akademik10 = new javax.swing.JLabel();
        akademik11 = new javax.swing.JLabel();
        akademik12 = new javax.swing.JLabel();
        akademik13 = new javax.swing.JLabel();
        lise1 = new javax.swing.JTextField();
        bitirme1 = new javax.swing.JTextField();
        not_ortalama1 = new javax.swing.JTextField();
        bolum1 = new javax.swing.JTextField();
        alan1 = new javax.swing.JTextField();
        yil2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        kimlikno = new javax.swing.JLabel();
        tarih = new javax.swing.JLabel();

        gun.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        gun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        yil.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        yil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" }));

        ay.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        ay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("      ANDALUS ÜNİVERSİTESİ");

        akademik3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik3.setText(" Ülke");

        akademik7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik7.setText("Telefon_No");

        akademik4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik4.setText(" Baba adı ");

        akademik5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik5.setText("Dogum_tarihi");

        soyad.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        soyad.setText("  Soyadi");

        akademik6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik6.setText("  Anne adı");

        akademik1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik1.setText("     AD");

        akademik2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik2.setText("kimlik no/pasaport no");

        soyad_bos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soyad_bos1MouseClicked(evt);
            }
        });

        ad_bos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ad_bos1MouseClicked(evt);
            }
        });

        ulke1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        ulke1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABD", "Afghanistan", "Albania", "Cezayir", "Arjantin", "Avustralya", "Azerbeycan", "Belçika", "Brezilya", "Çin", "Fransa", "Isapniya", "Almanya", "Portekez", "Yunanistan", "Iran", "Irak", "Japonya", "Meksika", "Romanya", "Suriye", "Tunus", "Türkiye", "Veitnam" }));
        ulke1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ulke1MouseClicked(evt);
            }
        });
        ulke1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulke1ActionPerformed(evt);
            }
        });

        baba1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                baba1MouseClicked(evt);
            }
        });

        anne1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anne1MouseClicked(evt);
            }
        });

        telefon_bos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefon_bos1MouseClicked(evt);
            }
        });

        gun1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        gun1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        gun1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gun1MouseClicked(evt);
            }
        });

        yil1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        yil1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" }));
        yil1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yil1MouseClicked(evt);
            }
        });

        ay1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        ay1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        ay1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ay1MouseClicked(evt);
            }
        });

        akademik8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik8.setText("Lise adi");

        akademik9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik9.setText("lisedeki alan");

        akademik10.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik10.setText("Lise bitirme tarihi");

        akademik11.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik11.setText("Not Ortalamasi");

        akademik12.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik12.setText("Bölüm");

        akademik13.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        akademik13.setText("kayıt yılı");

        lise1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lise1MouseClicked(evt);
            }
        });

        bitirme1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bitirme1MouseClicked(evt);
            }
        });

        not_ortalama1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                not_ortalama1MouseClicked(evt);
            }
        });

        bolum1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bolum1MouseClicked(evt);
            }
        });

        alan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alan1MouseClicked(evt);
            }
        });

        yil2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        yil2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" }));
        yil2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yil2MouseClicked(evt);
            }
        });
        yil2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yil2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("bilgileri göster");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("kayid et");
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(akademik5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(akademik6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(akademik4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(akademik2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(akademik1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(akademik3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(akademik7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(10, 10, 10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(soyad_bos1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addComponent(ad_bos1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addComponent(kimlikno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(akademik8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(akademik9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gun1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ay1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yil1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(baba1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(anne1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ulke1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefon_bos1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(akademik11)
                                                    .addComponent(akademik12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 43, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(akademik10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(11, 11, 11))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(akademik13, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lise1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(not_ortalama1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(bitirme1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(alan1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(yil2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bolum1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(akademik1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(akademik2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ad_bos1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(soyad_bos1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kimlikno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lise1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(akademik8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alan1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(akademik9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 125, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(akademik11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bolum1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(akademik10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bitirme1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(akademik12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(not_ortalama1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(144, 144, 144))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(akademik3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ulke1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(akademik4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(baba1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(akademik6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anne1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(akademik5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gun1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ay1)
                            .addComponent(yil1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(akademik7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefon_bos1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(akademik13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yil2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ulke1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulke1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ulke1ActionPerformed

    private void yil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yil2ActionPerformed
       
    }//GEN-LAST:event_yil2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String ozel_karakter=";";
        String guncelleme_matris[]=bilgi_karslastirma().split(ozel_karakter);
        for(int i=0;i<guncelleme_matris.length;i++)
        {
            
            if(guncelleme_matris[i].equals(bilgi_getir.ogrenci_nog.getText()))
            {
                ad_bos1.setText(guncelleme_matris[i+3]);
                soyad_bos1.setText(guncelleme_matris[i+4]);
                kimlikno.setText((guncelleme_matris[i+2]));
                anne1.setText(guncelleme_matris[i+5]);
                baba1.setText(guncelleme_matris[i+6]);
                telefon_bos1.setText(guncelleme_matris[i+7]);
                lise1.setText(guncelleme_matris[i+10]);
                alan1.setText(guncelleme_matris[i+11]);
                bitirme1.setText(guncelleme_matris[i+12]);
                not_ortalama1.setText(guncelleme_matris[i+13]);
                bolum1.setText(guncelleme_matris[i+14]);
                break;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       boolean kontrol=true;
       if(ad_bos1.getText().length()==0 || soyad_bos1.getText().length()==0)
       {
           JOptionPane.showMessageDialog(rootPane,"Lütfen adı soyadı giriniz");
           kontrol=false;
       }
       if(baba1.getText().length()==0 || anne1.getText().length()==0)
       {
           JOptionPane.showMessageDialog(rootPane,"Lütfen baba adı/ anne adı  giriniz");
           kontrol=false; 
       }
       if(lise1.getText().length()==0 || alan1.getText().length()==0)
       {
         JOptionPane.showMessageDialog(rootPane,"Lütfen lise adı/ lisedeki alan giriniz");
           kontrol=false;   
       }
       if(bolum1.getText().length()==0 || bitirme1.getText().length()==0)
       {
        JOptionPane.showMessageDialog(rootPane,"Lütfen bölüm/ lise bitirme tarihini giriniz");
           kontrol=false;   
       }
       boolean c=Pattern.matches("\\d{1,2}",not_ortalama1.getText());
      if(!c)        
      {
       JOptionPane.showMessageDialog(rootPane,"Lütfen not ortalamasini  giriniz");
           kontrol=false;    
      }
       if(kontrol)
       {
          boolean b=Pattern.matches("\\d{11}", telefon_bos1.getText());
          if(b)
          {
             String ozel_karakter=";";             
             String guncelleme_matris1[]=bilgi_karslastirma().split(ozel_karakter);           
             for(int i=0;i<guncelleme_matris1.length;i++)
              {
                if(guncelleme_matris1[i].equals(bilgi_getir.ogrenci_nog.getText()))
                {
                 guncelleme_matris1[i+3]=ad_bos1.getText();
                 guncelleme_matris1[i+4]=soyad_bos1.getText();
                 guncelleme_matris1[i+5]=anne1.getText();
                 guncelleme_matris1[i+6]=baba1.getText();
                 guncelleme_matris1[i+7]=telefon_bos1.getText();
                 guncelleme_matris1[i+8]=ulke1.getSelectedItem().toString();
                 String tarih=gun1.getSelectedItem().toString()+"/"+ay1.getSelectedItem().toString()+"/"+yil1.getSelectedItem().toString();
                 guncelleme_matris1[i+9]=tarih;
                 guncelleme_matris1[i+10]=lise1.getText();
                 guncelleme_matris1[i+11]=alan1.getText();
                 guncelleme_matris1[i+12]=bitirme1.getText();
                 guncelleme_matris1[i+13]=not_ortalama1.getText();
                 guncelleme_matris1[i+14]=bolum1.getText();
                 break;
                }
              }
             String son_bilgi="";
             for(int i=0;i<guncelleme_matris1.length;i++)
             {
               son_bilgi=son_bilgi+guncelleme_matris1[i]+";";  
             }
             Guncellene_BilgiYaz(son_bilgi);
             JOptionPane.showMessageDialog(rootPane,"Bilgileri güncellenmiştir");
             islemler i=new islemler();
             i.setVisible(true);
             this.setVisible(false);
          }
          else
          {
              JOptionPane.showMessageDialog(rootPane,"Lütfen  telefon numarasını giriniz");
          }
       }
       else
       {
           
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ad_bos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ad_bos1MouseClicked
         buyuk_harf();
    }//GEN-LAST:event_ad_bos1MouseClicked

    private void soyad_bos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soyad_bos1MouseClicked
        buyuk_harf();
    }//GEN-LAST:event_soyad_bos1MouseClicked

    private void ulke1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ulke1MouseClicked
       buyuk_harf();
    }//GEN-LAST:event_ulke1MouseClicked

    private void baba1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baba1MouseClicked
       buyuk_harf();
    }//GEN-LAST:event_baba1MouseClicked

    private void anne1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anne1MouseClicked
       buyuk_harf();
    }//GEN-LAST:event_anne1MouseClicked

    private void gun1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gun1MouseClicked
        buyuk_harf();
    }//GEN-LAST:event_gun1MouseClicked

    private void ay1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ay1MouseClicked
       buyuk_harf();
    }//GEN-LAST:event_ay1MouseClicked

    private void yil1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yil1MouseClicked
        buyuk_harf();
    }//GEN-LAST:event_yil1MouseClicked

    private void telefon_bos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefon_bos1MouseClicked
        buyuk_harf();
    }//GEN-LAST:event_telefon_bos1MouseClicked

    private void lise1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lise1MouseClicked
        buyuk_harf();
    }//GEN-LAST:event_lise1MouseClicked

    private void alan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alan1MouseClicked
        buyuk_harf();
    }//GEN-LAST:event_alan1MouseClicked

    private void bitirme1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bitirme1MouseClicked
       buyuk_harf();
    }//GEN-LAST:event_bitirme1MouseClicked

    private void not_ortalama1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_not_ortalama1MouseClicked
        buyuk_harf();
    }//GEN-LAST:event_not_ortalama1MouseClicked

    private void bolum1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bolum1MouseClicked
        buyuk_harf();
    }//GEN-LAST:event_bolum1MouseClicked

    private void yil2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yil2MouseClicked
        buyuk_harf();
    }//GEN-LAST:event_yil2MouseClicked

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
            java.util.logging.Logger.getLogger(guncelleme1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guncelleme1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guncelleme1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guncelleme1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guncelleme1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField ad_bos1;
    private javax.swing.JLabel akademik1;
    private javax.swing.JLabel akademik10;
    private javax.swing.JLabel akademik11;
    private javax.swing.JLabel akademik12;
    private javax.swing.JLabel akademik13;
    private javax.swing.JLabel akademik2;
    private javax.swing.JLabel akademik3;
    private javax.swing.JLabel akademik4;
    private javax.swing.JLabel akademik5;
    private javax.swing.JLabel akademik6;
    private javax.swing.JLabel akademik7;
    private javax.swing.JLabel akademik8;
    private javax.swing.JLabel akademik9;
    public javax.swing.JTextField alan1;
    public javax.swing.JTextField anne1;
    public javax.swing.JComboBox<String> ay;
    public javax.swing.JComboBox<String> ay1;
    public javax.swing.JTextField baba1;
    public javax.swing.JTextField bitirme1;
    public javax.swing.JTextField bolum1;
    public javax.swing.JComboBox<String> gun;
    public javax.swing.JComboBox<String> gun1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kimlikno;
    public javax.swing.JTextField lise1;
    public javax.swing.JTextField not_ortalama1;
    private javax.swing.JLabel soyad;
    public javax.swing.JTextField soyad_bos1;
    private javax.swing.JLabel tarih;
    public javax.swing.JTextField telefon_bos1;
    public javax.swing.JComboBox<String> ulke1;
    public javax.swing.JComboBox<String> yil;
    public javax.swing.JComboBox<String> yil1;
    public javax.swing.JComboBox<String> yil2;
    // End of variables declaration//GEN-END:variables
}
