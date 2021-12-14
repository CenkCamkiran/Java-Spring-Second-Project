package com.secondhomework.cenkcamkiran.filters;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

public interface KullaniciFilter {

    SimpleFilterProvider GetKullaniciFilterProvider(String filterName);

    SimpleBeanPropertyFilter GetKullaniciFilter();
}
