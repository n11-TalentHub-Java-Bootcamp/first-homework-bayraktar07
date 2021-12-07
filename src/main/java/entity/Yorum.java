package entity;

import javax.persistence.*;
import java.util.Date;


/**
 *  URUN_YORUM ENTITY ODEV MADDE - 1
 * */

@Entity
@Table (name = "Urun_Yorum")
public class Yorum {

    @SequenceGenerator(name = "generator", sequenceName = "YORUM_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "YORUM",length = 500, nullable = false)
    private String yorum;

    @Column(name = "YORUM_TARIHI", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "URUN_ID", nullable = false)
    private Long urunId;


    @Column(name = "KULLANICI_ID", nullable = false)
    private Long kullaniciId;
}
