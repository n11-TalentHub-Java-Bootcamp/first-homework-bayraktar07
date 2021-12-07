package uygulamalar;

import entity.Kullanici;
import entityservice.KullaniciEntityService;

import java.util.List;

public class FindAllApp {

    public static void main(String[] args) {

        KullaniciEntityService service = new KullaniciEntityService();
        List<Kullanici> kullaniciList = service.findAll();

        for (Kullanici kullanici : kullaniciList) {
            System.out.println(kullanici);
        }
    }
}
