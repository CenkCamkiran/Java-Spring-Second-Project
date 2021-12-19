package com.secondhomework.cenkcamkiran.repository;

import java.util.List;

import javax.transaction.Transactional;

import com.secondhomework.cenkcamkiran.entities.Kullanici;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface KullaniciRepository extends CrudRepository<Kullanici, Long> {

    List<Kullanici> findAll();

    Kullanici findByKullaniciadi(String kullaniciadi);

    Kullanici findByTelefon(String telefon);

    @Modifying
    @Transactional
    @Query(value = "update kullanici set adi = :adi, soyadi = :soyadi, email = :email, telefon = :telefon, kullaniciadi = :kullaniciadi where id = :id", nativeQuery = true)
    void updateKullanici(@Param("adi") String adi, @Param("soyadi") String soyadi,
            @Param("email") String email, @Param("telefon") String telefon,
            @Param("kullaniciadi") String kullaniciadi, @Param("id") Long id);

    @Modifying
    @Transactional
    @Query(value = "delete from Kullanici kullanici where kullanici.telefon=:telefon and kullanici.kullaniciadi=:kullaniciadi", nativeQuery = true)
    int deleteByTelefonAndKullaniciAdi(@Param("telefon") String telefon,
            @Param("kullaniciadi") String adi);

}
