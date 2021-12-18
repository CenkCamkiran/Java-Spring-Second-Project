package com.secondhomework.cenkcamkiran.controllers;

import java.net.URI;
import java.util.List;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.secondhomework.cenkcamkiran.Converters.KullaniciConverter;
import com.secondhomework.cenkcamkiran.Converters.YorumConverter;
import com.secondhomework.cenkcamkiran.DTO.KullaniciYorumDTO;
import com.secondhomework.cenkcamkiran.DTO.YorumDTO;
import com.secondhomework.cenkcamkiran.entities.Kullanici;
import com.secondhomework.cenkcamkiran.entities.UrunYorum;
import com.secondhomework.cenkcamkiran.exception.YorumException;
import com.secondhomework.cenkcamkiran.filters.YorumFilter;
import com.secondhomework.cenkcamkiran.services.YorumService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

    @DeleteMapping("/{id}")
    public void DeleteYorumByID(@PathVariable Long id) {

        yorumService
                .deleteYorumByID(id);

    }

    @PostMapping("")
    public ResponseEntity<Object> SaveNewYorum(@RequestBody YorumDTO yorumDTO) {

        UrunYorum urunYorum = YorumConverter.INSTANCE.convertYorumDtoToYorum(yorumDTO);

        urunYorum = yorumService.saveYorum(urunYorum);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/yorum/{id}")
                .buildAndExpand(urunYorum.getId())
                .toUri();

        return ResponseEntity.created(uri).build();

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
