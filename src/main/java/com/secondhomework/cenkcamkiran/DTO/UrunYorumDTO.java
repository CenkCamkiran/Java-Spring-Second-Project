package com.secondhomework.cenkcamkiran.DTO;

import java.util.Date;

public class UrunYorumDTO {
    private Long urunId;
    private String kullaniciAdi;
    private String urunAdi;
    private String yorum;
    private Date yorumTarihi;

    public UrunYorumDTO(Long urunId, String kullaniciAdi, String urunAdi, String yorum, Date yorumTarihi) {
        this.urunId = urunId;
        this.kullaniciAdi = kullaniciAdi;
        this.urunAdi = urunAdi;
        this.yorum = yorum;
        this.yorumTarihi = yorumTarihi;
    }

    public Long getUrunId() {
        return urunId;
    }

    public void setUrunId(Long urunId) {
        this.urunId = urunId;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
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

}
