package com.secondhomework.cenkcamkiran.repository;

import java.util.List;

import com.secondhomework.cenkcamkiran.entities.Kullanici;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KullaniciRepository extends CrudRepository<Kullanici, Long> {

    List<Kullanici> findAll();

    Kullanici findByKullaniciadi(String kullaniciadi);

    Kullanici findByTelefon(String telefon);

}
