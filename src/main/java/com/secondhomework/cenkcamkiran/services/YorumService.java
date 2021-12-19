package com.secondhomework.cenkcamkiran.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.secondhomework.cenkcamkiran.entities.UrunYorum;
import com.secondhomework.cenkcamkiran.repository.YorumRepository;

@Service
public class YorumService {

    @Autowired
    private YorumRepository yorumRepository;

    public List<UrunYorum> findYorumlarByUrunId(Long id) {

        return yorumRepository.findYorumlarByUrunId(id);
    }

    public List<UrunYorum> findYorumlarByKullaniciAdi(Long kullaniciID) {

        return yorumRepository.findYorumlarByKullaniciAdi(kullaniciID);
    }

    public void deleteYorumByID(Long id) {

        yorumRepository.deleteById(id);
    }

    public UrunYorum saveYorum(UrunYorum urunYorum) {

        return yorumRepository.save(urunYorum);
    }

}
