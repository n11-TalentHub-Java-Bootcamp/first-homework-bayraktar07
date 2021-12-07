package dto;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Date;

public class YorumDetayDto {

    private String urunAdi;
    private String kategoriAdi;
    private BigDecimal fiyat;
    private String kullaniciAdi;
    private String kullaniciSoyadi;
    private String kullaniciEmail;
    private String kullaniciTelefon;
    private String yorum;

    @Temporal(TemporalType.TIMESTAMP)
    private Date yorumTarihi;

    public YorumDetayDto(String urunAdi, String kategoriAdi, BigDecimal fiyat, String kullaniciAdi, String kullaniciSoyadi,
                         String kullaniciEmail, String kullaniciTelefon, String yorum, Date yorumTarihi) {
        this.urunAdi = urunAdi;
        this.kategoriAdi = kategoriAdi;
        this.fiyat = fiyat;
        this.kullaniciAdi = kullaniciAdi;
        this.kullaniciSoyadi = kullaniciSoyadi;
        this.kullaniciEmail = kullaniciEmail;
        this.kullaniciTelefon = kullaniciTelefon;
        this.yorum = yorum;
        this.yorumTarihi = yorumTarihi;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getKategoriAdi() {
        return kategoriAdi;
    }

    public void setKategoriAdi(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getKullaniciSoyadi() {
        return kullaniciSoyadi;
    }

    public void setKullaniciSoyadi(String kullaniciSoyadi) {
        this.kullaniciSoyadi = kullaniciSoyadi;
    }

    public String getKullaniciEmail() {
        return kullaniciEmail;
    }

    public void setKullaniciEmail(String kullaniciEmail) {
        this.kullaniciEmail = kullaniciEmail;
    }

    public String getKullaniciTelefon() {
        return kullaniciTelefon;
    }

    public void setKullaniciTelefon(String kullaniciTelefon) {
        this.kullaniciTelefon = kullaniciTelefon;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public Date getYorumTarihi() {
        return yorumTarihi;
    }

    public void setYorumTarihi(Date yorumTarihi) {
        this.yorumTarihi = yorumTarihi;
    }

    @Override
    public String toString() {
        return "YorumDetayDto{" +
                "urunAdi='" + urunAdi + '\'' +
                ", kategoriAdi='" + kategoriAdi + '\'' +
                ", fiyat=" + fiyat +
                ", kullaniciAdi='" + kullaniciAdi + '\'' +
                ", kullaniciSoyadi='" + kullaniciSoyadi + '\'' +
                ", kullaniciEmail='" + kullaniciEmail + '\'' +
                ", kullaniciTelefon='" + kullaniciTelefon + '\'' +
                ", yorum='" + yorum + '\'' +
                ", yorumTarihi=" + yorumTarihi +
                '}';
    }
}
