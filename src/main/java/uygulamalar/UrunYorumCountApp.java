package uygulamalar;

import dto.UrunYorumSayimDto;
import entityservice.YorumEntityService;

import java.util.List;

public class UrunYorumCountApp {

    public static void main(String[] args) {

        YorumEntityService service = new YorumEntityService();
        List<UrunYorumSayimDto> list = service.UrunListYorumCount();

        for(UrunYorumSayimDto l : list) {
            System.out.println(l.urunSayimKontrolandToString());        // toString ile yorumSayisi 0 geliyor. urunSayimKontrolAndToString ile bos geliyor.
        }
    }
}
