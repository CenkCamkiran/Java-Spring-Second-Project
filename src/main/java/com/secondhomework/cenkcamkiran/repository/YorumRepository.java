package com.secondhomework.cenkcamkiran.repository;

import java.util.List;

import com.secondhomework.cenkcamkiran.entities.UrunYorum;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface YorumRepository extends CrudRepository<UrunYorum, Long> {

    @Query(value = "select * from urunyorum where urun_id = :id", nativeQuery = true)
    List<UrunYorum> findYorumlarByUrunId(@Param("id") Long id);

    @Query(value = "select * from urunyorum where kullanici_id = :id", nativeQuery = true)
    List<UrunYorum> findYorumlarByKullaniciAdi(@Param("id") Long kullaniciID);

}
