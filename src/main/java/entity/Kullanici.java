package entity;

import javax.persistence.*;

/**
 *  KULLANICI ENTITY ODEV MADDE - 1
 * */


@Entity
@Table(name = "KULLANICI")
public class Kullanici {

    @SequenceGenerator(name = "generator", sequenceName = "KULLANICI_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ADI", nullable = false, length = 50)
    private String adi;

    @Column(name = "SOYADI", nullable = false, length = 50)
    private String soyadi;

    @Column(name = "EMAIL", nullable = false, length = 50)
    private String email;

    @Column(name = "TELEFON", nullable = false, length = 15)
    private String telefon;

    @Override
    public String toString() {
        return "Kullanici{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
