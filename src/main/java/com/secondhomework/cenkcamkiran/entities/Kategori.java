package com.secondhomework.cenkcamkiran.entities;

import javax.persistence.*;

@Entity
@Table(name = "KATEGORI") // tablonun adı
public class Kategori {

    @SequenceGenerator(name = "generator", sequenceName = "KATEGORI_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ADI", nullable = false, length = 50)
    private String adi;

    @Column(name = "KIRILIM")
    private Long kirilim;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UST_KATEGORI_ID")
    private Kategori ustKategori;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Kategori getUstKategori() {
        return ustKategori;
    }

    public void setUstKategori(Kategori ustKategori) {
        this.ustKategori = ustKategori;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Long getKirilim() {
        return kirilim;
    }

    public void setKirilim(Long kirilim) {
        this.kirilim = kirilim;
    }

    @Override
    public String toString() {
        return "Kategori{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                ", kirilim=" + kirilim +
                ", ustKategori=" + ustKategori +
                '}';
    }
}