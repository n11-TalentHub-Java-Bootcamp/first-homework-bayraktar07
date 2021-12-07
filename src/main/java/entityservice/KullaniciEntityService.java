package entityservice;

import dao.KullaniciDao;
import dto.KullaniciYorumlarDto;
import entity.Kullanici;

import java.util.List;

public class KullaniciEntityService {

    private KullaniciDao kullaniciDao;

    public KullaniciEntityService() {
        kullaniciDao = new KullaniciDao();
    }

    public List<Kullanici> findAll () {
        return kullaniciDao.findAll();
    }

    public List<KullaniciYorumlarDto> findAllYorumByKullaniciId (Long id) {
        return kullaniciDao.findAllYorumByKullaniciId(id);
    }
}
