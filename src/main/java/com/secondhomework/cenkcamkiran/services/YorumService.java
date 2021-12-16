package com.secondhomework.cenkcamkiran.services;

import java.util.List;

import com.secondhomework.cenkcamkiran.DTO.KullaniciYorumDTO;
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

}
