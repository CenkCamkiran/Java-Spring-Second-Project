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

    public int DeleteKullaniciByTelefonAndKullaniciAdi(Kullanici kullanici) {

        return kullaniciRepository.deleteByTelefonAndKullaniciAdi(kullanici.getTelefon().toString(),
                kullanici.getKullaniciadi().toString());
    }

    public Kullanici SaveNewKullanici(Kullanici kullanici) {

        // return kullaniciRepository.saveNewKullanici(kullanici.getAdi(),
        // kullanici.getSoyadi(), kullanici.getEmail(),
        // kullanici.getTelefon(), kullanici.getKullaniciadi());
        return kullaniciRepository.save(kullanici);
    }

    public void UpdateKullanici(Kullanici kullanici) {

        // return kullaniciRepository.saveNewKullanici(kullanici.getAdi(),
        // kullanici.getSoyadi(), kullanici.getEmail(),
        // kullanici.getTelefon(), kullanici.getKullaniciadi());
        kullaniciRepository.updateKullanici(kullanici.getAdi().toString(),
                kullanici.getSoyadi().toString(), kullanici.getEmail().toString(),
                kullanici.getTelefon().toString(), kullanici.getKullaniciadi().toString(), kullanici.getId());
    }

    public Kullanici GetKullaniciByKullaniciAdi(String kullaniciadi) {

        return kullaniciRepository.findByKullaniciadi(kullaniciadi);
    }

    public Kullanici GetKullaniciByKullaniciTelefon(String kullaniciTelefon) {

        return kullaniciRepository.findByTelefon(kullaniciTelefon);
    }
}
