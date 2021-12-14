package com.secondhomework.cenkcamkiran.services;

import java.util.List;

import com.secondhomework.cenkcamkiran.entities.Kullanici;
import com.secondhomework.cenkcamkiran.repository.KullaniciRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KullaniciService {

    @Autowired
    private KullaniciRepository kullaniciRepository;

    public List<Kullanici> GetAllKullanici() {

        return kullaniciRepository.findAll();
    }

    public Kullanici GetKullaniciByKullaniciAdi(String kullaniciadi) {

        return kullaniciRepository.findByKullaniciadi(kullaniciadi);
    }

    public Kullanici GetKullaniciByKullaniciTelefon(String kullaniciTelefon) {

        return kullaniciRepository.findByTelefon(kullaniciTelefon);
    }
}
