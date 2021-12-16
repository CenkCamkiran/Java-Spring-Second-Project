package com.secondhomework.cenkcamkiran.DTO;

import java.util.Date;

public class KullaniciYorumDTO {

    private String kullaniciadi;
    private String yorum;
    private String adi;
    private String soyadi;
    private String email;
    private String urunadi;
    private Long fiyat;
    private Date yorumTarihi;
    private Long urunId;

    public KullaniciYorumDTO(String kullaniciadi, String yorum, String adi, String soyadi, String email, String urunadi,
            Long fiyat, Date yorumTarihi, Long urunId) {
        this.kullaniciadi = kullaniciadi;
        this.yorum = yorum;
        this.adi = adi;
        this.soyadi = soyadi;
        this.email = email;
        this.urunadi = urunadi;
        this.fiyat = fiyat;
        this.yorumTarihi = yorumTarihi;
        this.urunId = urunId;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrunadi() {
        return urunadi;
    }

    public void setUrunadi(String urunadi) {
        this.urunadi = urunadi;
    }

    public Long getFiyat() {
        return fiyat;
    }

    public void setFiyat(Long fiyat) {
        this.fiyat = fiyat;
    }

    public Date getYorumTarihi() {
        return yorumTarihi;
    }

    public void setYorumTarihi(Date yorumTarihi) {
        this.yorumTarihi = yorumTarihi;
    }

    public Long getUrunId() {
        return urunId;
    }

    public void setUrunId(Long urunId) {
        this.urunId = urunId;
    }

}
