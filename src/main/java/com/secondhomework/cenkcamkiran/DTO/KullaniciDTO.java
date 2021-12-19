package com.secondhomework.cenkcamkiran.DTO;

public class KullaniciDTO {

    private String adi;
    private String soyadi;
    private String email;
    private String telefon;
    private String kullaniciadi;

    public KullaniciDTO(String adi, String soyadi, String email, String telefon, String kullaniciadi) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.email = email;
        this.telefon = telefon;
        this.kullaniciadi = kullaniciadi;
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

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

}
