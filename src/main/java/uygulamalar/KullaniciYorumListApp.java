package uygulamalar;

import dto.KullaniciYorumlarDto;
import entityservice.KullaniciEntityService;

import java.util.List;

public class KullaniciYorumListApp {

    /**
     * Kullanici ID'sine gore kullanicinin yorumlarini donduren uygulama
     */
    public static void main(String[] args) {

        KullaniciEntityService service = new KullaniciEntityService();
        List<KullaniciYorumlarDto> list = service.findAllYorumByKullaniciId(3L);

        for (KullaniciYorumlarDto l : list) {
            System.out.println(l.toString());
        }
    }
}
