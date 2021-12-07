package dao;

import base.BaseDao;
import dto.KullaniciYorumlarDto;
import entity.Kullanici;
import org.hibernate.query.Query;

import java.util.List;

public class KullaniciDao extends BaseDao {

    public List<Kullanici> findAll(){

        String sql = "select kullanici from Kullanici kullanici";

        Query query = getCurrentSession().createQuery(sql);

        return query.list();
    }



    /**
     * Kullanici ID'ye gore Yorumlar Liste id == kullanici.id   ODEV MADDE-4
     */
    public List<KullaniciYorumlarDto> findAllYorumByKullaniciId(Long id) {

        String sql = " SELECT " +
                " new dto.KullaniciYorumlarDto ( kullanici.id, kullanici.adi, urun.adi, yorum.yorum, yorum.date) " +
                "FROM Kullanici kullanici " +
                "INNER JOIN Yorum yorum on yorum.kullaniciId = kullanici.id " +
                "INNER JOIN Urun urun on yorum.urunId = urun.id " +
                "WHERE kullanici.id = :id";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id", id);
        return query.list();
    }
}
