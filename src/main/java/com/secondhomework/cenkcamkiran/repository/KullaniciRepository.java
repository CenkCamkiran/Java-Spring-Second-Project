package com.secondhomework.cenkcamkiran.repository;

import java.util.List;

import com.secondhomework.cenkcamkiran.entities.Kullanici;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KullaniciRepository extends CrudRepository<Kullanici, Long> {

    List<Kullanici> findAll();

    Kullanici findByKullaniciadi(String kullaniciadi);

    @Query(value = "INSERT INTO public.kullanici(adi, soyadi, email, telefon, kullaniciadi) VALUES (?, ?, ?, ?, ?);", nativeQuery = true)
    Kullanici saveNewKullanici(String adi, String soyadi, String email, String telefon, String kullaniciadi);

    Kullanici findByTelefon(String telefon);

    @Query(value = "delete kullanici from Kullanici kullanici where kullanici.telefon = :telefon and kullanici.kullaniciadi = :adi", nativeQuery = true)
    void deleteKullaniciByTelefonAndKullaniciAdi(String telefon, String adi);

}
