package com.secondhomework.cenkcamkiran.controllers;

import java.util.List;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.secondhomework.cenkcamkiran.entities.Kullanici;
import com.secondhomework.cenkcamkiran.exception.KullaniciException;
import com.secondhomework.cenkcamkiran.filters.KullaniciFilter;
import com.secondhomework.cenkcamkiran.services.KullaniciService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kullanici")
public class KullaniciController implements KullaniciFilter {

    @Autowired
    private KullaniciService kullaniciService;

    @GetMapping("")
    public MappingJacksonValue GetAllKullanici() {

        List<Kullanici> kullanici = kullaniciService.GetAllKullanici();

        String filterName = "KullaniciFilter";

        SimpleFilterProvider filter = GetKullaniciFilterProvider(filterName);
        MappingJacksonValue jacksonValue = new MappingJacksonValue(kullanici);

        jacksonValue.setFilters(filter);

        return jacksonValue;
    }

    @GetMapping("/kullaniciAdi/{kullaniciadi}")
    public MappingJacksonValue GetKullaniciByKullaniciAdi(@PathVariable String kullaniciadi) {
        Kullanici kullanici = kullaniciService.GetKullaniciByKullaniciAdi(kullaniciadi);

        if (kullanici == null) {
            throw new KullaniciException("Kullanici not found with given kullanici adi : " + kullaniciadi);
        }

        String filterName = "KullaniciFilter";

        SimpleFilterProvider filter = GetKullaniciFilterProvider(filterName);
        MappingJacksonValue jacksonValue = new MappingJacksonValue(kullanici);

        jacksonValue.setFilters(filter);

        return jacksonValue;
    }

    @GetMapping("/telefon/{telefon}")
    public MappingJacksonValue GetKullaniciByKullaniciTelefon(@PathVariable String telefon) {
        Kullanici kullanici = kullaniciService.GetKullaniciByKullaniciTelefon(telefon);

        if (kullanici == null) {
            throw new KullaniciException("Kullanici not found with given telefon : " + telefon);
        }

        String filterName = "KullaniciFilter";

        SimpleFilterProvider filter = GetKullaniciFilterProvider(filterName);
        MappingJacksonValue jacksonValue = new MappingJacksonValue(kullanici);

        jacksonValue.setFilters(filter);

        return jacksonValue;
    }

    // @GetMapping("/kullanici/{telefon}")
    // public MappingJacksonValue GetKullaniciByKullaniciTelefon(@RequestBody
    // KullaniciDTO kullaniciDTO) {
    // List<Kullanici> kullanici = kullaniciService.SaveNewKullanici(kullaniciDTO);

    // String filterName = "KullaniciFilter";

    // SimpleFilterProvider filter = GetKullaniciFilterProvider(filterName);
    // MappingJacksonValue jacksonValue = new MappingJacksonValue(kullanici);

    // jacksonValue.setFilters(filter);

    // return jacksonValue;
    // }

    @Override
    public SimpleFilterProvider GetKullaniciFilterProvider(String filterName) {
        SimpleBeanPropertyFilter filter = GetKullaniciFilter();

        return new SimpleFilterProvider().addFilter(filterName, filter);
    }

    @Override
    public SimpleBeanPropertyFilter GetKullaniciFilter() {
        return SimpleBeanPropertyFilter.filterOutAllExcept("adi", "soyadi",
                "email", "telefon", "kullaniciadi");
    }

}
