package entityservice;

import dao.YorumDao;
import dto.UrunYorumSayimDto;
import dto.YorumDetayDto;

import java.util.List;

public class YorumEntityService {

    private YorumDao yorumDao;

    public YorumEntityService() {
        yorumDao = new YorumDao();
    }

    public List<YorumDetayDto> findAllYorumByUrunId (Long Id) {
        try {
            return yorumDao.findAllYorumByUrunId(Id);
        } catch (NullPointerException e) {
            e.printStackTrace();
            throw new NullPointerException(Id + " numarali urune henuz yorum yapilmamis.");
        }
    }

    public List<UrunYorumSayimDto> UrunListYorumCount () {
        return yorumDao.UrunListYorumCount();
    }
}
