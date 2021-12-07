package uygulamalar;

import dto.YorumDetayDto;
import entityservice.YorumEntityService;

import java.util.List;

public class UrunYorumListApp {

    public static void main(String[] args) {

        YorumEntityService service = new YorumEntityService();
        List<YorumDetayDto> list = service.findAllYorumByUrunId(4L);
        for(YorumDetayDto y : list) {
            System.out.println(y.toString());
        }
    }
}
