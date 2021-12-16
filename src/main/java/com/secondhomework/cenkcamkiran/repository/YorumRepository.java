package com.secondhomework.cenkcamkiran.repository;

import java.util.List;

import com.secondhomework.cenkcamkiran.DTO.KullaniciYorumDTO;
import com.secondhomework.cenkcamkiran.entities.Kullanici;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface YorumRepository extends CrudRepository<Kullanici, Long> {

    @Query(value = "select k.adi, k.soyadi, k.kullaniciadi, k.email, u.adi as urunadi, u.fiyat from public.urunyorum y inner join kullanici k on y.kullanici_id=k.id inner join urun u on u.id=y.urun_id where k.kullaniciadi=:kullaniciadi", nativeQuery = true)
    List<KullaniciYorumDTO> findYorumByKullaniciAdi(@Param("kullaniciadi") String kullaniciadi);

}
