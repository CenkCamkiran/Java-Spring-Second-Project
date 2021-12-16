package com.secondhomework.cenkcamkiran.controllers;

import java.util.List;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.secondhomework.cenkcamkiran.DTO.KullaniciDTO;
import com.secondhomework.cenkcamkiran.DTO.KullaniciYorumDTO;
import com.secondhomework.cenkcamkiran.exception.YorumException;
import com.secondhomework.cenkcamkiran.filters.YorumFilter;
import com.secondhomework.cenkcamkiran.services.YorumService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/yorum")
public class YorumController implements YorumFilter {

    @Autowired
    private YorumService yorumService;

    @GetMapping("/kullaniciAdi/{kullaniciadi}")
    public List<KullaniciYorumDTO> GetYorumlarByKullaniciAdi(@PathVariable String kullaniciadi) {

        List<KullaniciYorumDTO> kullaniciYorumDTO = yorumService
                .findYorumByKullaniciAdi(kullaniciadi);

        if (kullaniciYorumDTO == null) {
            throw new YorumException(kullaniciadi + " kullanıcı henüz bir yorum yazmamıştır.");
        }

        return kullaniciYorumDTO;

    }

    @Override
    public SimpleFilterProvider GetYorumFilterProvider(String filterName) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SimpleBeanPropertyFilter GetYorumFilter() {
        // TODO Auto-generated method stub
        return null;
    }
}
