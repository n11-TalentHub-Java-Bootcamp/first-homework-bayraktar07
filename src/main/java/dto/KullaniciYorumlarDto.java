package dto;

import java.util.Date;

public class KullaniciYorumlarDto {

    private Long kullaniciId;
    private String kullaniciAdi;
    private String urunAdi;
    private String yorum;
    private Date date;

    public KullaniciYorumlarDto(Long kullaniciId, String kullaniciAdi, String urunAdi, String yorum, Date date) {
        this.kullaniciId = kullaniciId;
        this.kullaniciAdi = kullaniciAdi;
        this.urunAdi = urunAdi;
        this.yorum = yorum;
        this.date = date;
    }

    @Override
    public String toString() {
        return "KullaniciYorumlarDto{" +
                "kullaniciId=" + kullaniciId +
                ", kullaniciAdi='" + kullaniciAdi + '\'' +
                ", urunAdi='" + urunAdi + '\'' +
                ", yorum='" + yorum + '\'' +
                ", date=" + date +
                '}';
    }
}
