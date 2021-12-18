package com.secondhomework.cenkcamkiran.DTO;

import java.util.Date;

public class YorumDTO {

    private Long id;
    private String yorum;
    private Date yorumTarihi;
    private Long urunID;
    private Date kullaniciId;

    public YorumDTO(Long id, String yorum, Date yorumTarihi, Long urunID, Date kullaniciId) {
        this.id = id;
        this.yorum = yorum;
        this.yorumTarihi = yorumTarihi;
        this.urunID = urunID;
        this.kullaniciId = kullaniciId;
    }

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

    public Date getYorumTarihi() {
        return yorumTarihi;
    }

    public void setYorumTarihi(Date yorumTarihi) {
        this.yorumTarihi = yorumTarihi;
    }

    public Long getUrunID() {
        return urunID;
    }

    public void setUrunID(Long urunID) {
        this.urunID = urunID;
    }

    public Date getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(Date kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

}
