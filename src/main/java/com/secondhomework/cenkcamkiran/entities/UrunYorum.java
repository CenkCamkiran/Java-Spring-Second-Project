package com.secondhomework.cenkcamkiran.entities;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "URUNYORUM")
public class UrunYorum {

    @SequenceGenerator(name = "generator", sequenceName = "YORUM_ID_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "generator")
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "YORUM", nullable = false)
    private String yorum;

    @Column(name = "YORUMTARIHI", nullable = true)
    private Date yorum_tarihi;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "URUN_ID", foreignKey = @ForeignKey(name = "FK_URUN_YORUM_ID"))
    private Urun urun;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KULLANICI_ID", foreignKey = @ForeignKey(name = "FK_URUN_YORUM_KULLANICI_ID"))
    private Kullanici kullanici;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public Date getYorum_tarihi() {
        return yorum_tarihi;
    }

    public void setYorum_tarihi(Date yorum_tarihi) {
        this.yorum_tarihi = yorum_tarihi;
    }

    public Urun geturunid() {
        return urun;
    }

    public void seturunid(Urun urun_id) {
        this.urun = urun_id;
    }

    public Kullanici getkullanici() {
        return kullanici;
    }

    public void setkullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    @Override
    public String toString() {
        return "UrunYorum [id=" + id + ", kullanici_id=" + kullanici + ", urunid=" + urun + ", yorum=" + yorum
                + ", yorum_tarihi=" + yorum_tarihi + "]";
    }

}
