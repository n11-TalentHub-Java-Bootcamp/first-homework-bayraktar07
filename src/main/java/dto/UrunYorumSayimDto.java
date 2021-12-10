package dto;

import java.math.BigDecimal;

public class UrunYorumSayimDto {

    private Long id;
    private String urunAdi;
    private BigDecimal fiyat;
    private Long yorumSayisi;

    public UrunYorumSayimDto(Long id, String urunAdi, BigDecimal fiyat, Long yorumSayisi) {
        this.id = id;
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
        this.yorumSayisi = yorumSayisi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public Long getYorumSayisi() {
        return yorumSayisi;
    }

    public void setYorumSayisi(Long yorumSayisi) {
        this.yorumSayisi = yorumSayisi;
    }

    public String urunSayimKontrolandToString () {

        if(yorumSayisi == 0) {
            return "UrunYorumSayimDto{" +
                    "id=" + id +
                    ", urunAdi='" + urunAdi + '\'' +
                    ", fiyat=" + fiyat +
                    ", yorumSayisi=" + " " +
                    '}';
        }
        return "UrunYorumSayimDto{" +
                "id=" + id +
                ", urunAdi='" + urunAdi + '\'' +
                ", fiyat=" + fiyat +
                ", yorumSayisi=" + yorumSayisi +
                '}';
    }

    @Override
    public String toString() {
        return "UrunYorumSayimDto{" +
                "id=" + id +
                ", urunAdi='" + urunAdi + '\'' +
                ", fiyat=" + fiyat +
                ", yorumSayisi=" + yorumSayisi +
                '}';
    }
}
