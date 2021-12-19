package com.secondhomework.cenkcamkiran.Converters;

import com.secondhomework.cenkcamkiran.DTO.KullaniciDTO;
import com.secondhomework.cenkcamkiran.entities.Kullanici;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface KullaniciConverter {

    KullaniciConverter INSTANCE = Mappers.getMapper(KullaniciConverter.class);

    Kullanici convertKullaniciDtoToKullanici(KullaniciDTO dto);

}
