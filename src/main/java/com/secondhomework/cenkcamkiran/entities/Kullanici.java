package com.secondhomework.cenkcamkiran.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "KULLANICI")
@JsonFilter("KullaniciFilter")
public class Kullanici implements Serializable {

    @SequenceGenerator(name = "generator", sequenceName = "KULLANICI_ID_SEQ")
    @Id
    @JsonIgnore
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ADI", nullable = false)
    private String adi;

    @Column(name = "SOYADI", nullable = false)
    private String soyadi;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "TELEFON", nullable = false)
    private String telefon;

    @Column(name = "KULLANICIADI", nullable = true)
    private String kullaniciadi;

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return id == null ? "" : id.toString();
    }

    public Kullanici(Long id, String adi, String soyadi, String email, String telefon, String kullaniciadi) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.email = email;
        this.telefon = telefon;
        this.kullaniciadi = kullaniciadi;
    }

    public Kullanici() {
    }

}