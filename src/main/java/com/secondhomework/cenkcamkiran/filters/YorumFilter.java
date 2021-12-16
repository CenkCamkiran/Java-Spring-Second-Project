package com.secondhomework.cenkcamkiran.filters;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

public interface YorumFilter {

    SimpleFilterProvider GetYorumFilterProvider(String filterName);

    SimpleBeanPropertyFilter GetYorumFilter();
}
