package com.secondhomework.cenkcamkiran.services;

import java.util.List;

import com.secondhomework.cenkcamkiran.DTO.KullaniciYorumDTO;
import com.secondhomework.cenkcamkiran.entities.UrunYorum;
import com.secondhomework.cenkcamkiran.repository.YorumRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YorumService {

    @Autowired
    private YorumRepository yorumRepository;

    public List<KullaniciYorumDTO> findYorumByKullaniciAdi(String kullaniciAdi) {

        return yorumRepository.findYorumByKullaniciAdi(kullaniciAdi);
    }

    public void deleteYorumByID(Long id) {

        yorumRepository.deleteById(id);
    }

    public UrunYorum saveYorum(UrunYorum urunYorum) {

        return yorumRepository.save(urunYorum);
    }

}
