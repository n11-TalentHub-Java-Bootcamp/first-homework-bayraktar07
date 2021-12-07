package dao;

import base.BaseDao;
import dto.UrunYorumSayimDto;
import dto.YorumDetayDto;
import org.hibernate.query.Query;

import java.util.List;

//
//private String urunAdi;
//private String kategoriAdi;
//private BigDecimal fiyat;
//private String kullaniciAdi;
//private String kullaniciSoyadi;
//private String kullaniciEmail;
//private String kullaniciTelefon;
//private String yorum;
//private Date yorumTarihi;

public class YorumDao extends BaseDao {


    /**
     * Bir Urune Yapilan Butun Yorumlar Detay Liste id == urun.id   ODEV MADDE - 2
     * */
    public List<YorumDetayDto> findAllYorumByUrunId (Long id) {

        String sql = " SELECT " +
                " new dto.YorumDetayDto( urun.adi, kategori.adi, urun.fiyat, kullanici.adi, kullanici.soyadi, kullanici.email, kullanici.telefon, " +
                "yorum.yorum, yorum.date) " +
                " FROM Yorum yorum " +
                " INNER JOIN Kullanici kullanici on yorum.kullaniciId = kullanici.id " +
                " INNER JOIN Urun urun on yorum.urunId = urun.id " +
                " INNER JOIN Kategori kategori  on urun.kategori.id = kategori.id " +
                " WHERE yorum.urunId = :id";


        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id",id);

        return query.list();
    }


/**
 *  Urun Adi + Urun ID + Urun Fiyat + Urune Yorum Sayimi Liste    ODEV MADDE - 3
 * */
        public List<UrunYorumSayimDto> UrunListYorumCount () {

        String sql = "SELECT " +
                "new dto.UrunYorumSayimDto (urun.id, urun.adi, urun.fiyat, count(yorum.urunId)) " +
                "FROM Urun urun " +
                "LEFT JOIN Yorum yorum on yorum.urunId = urun.id " +
                " GROUP BY urun.id " +
                " ORDER BY urun.id ";

        Query query = getCurrentSession().createQuery(sql);
        return query.list();
    }
}
