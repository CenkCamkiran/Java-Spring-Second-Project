package com.secondhomework.Converters;

import com.secondhomework.DTO.KullaniciDTO;
import com.secondhomework.cenkcamkiran.entities.Urun;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface KullaniciConverter {

    KullaniciConverter INSTANCE = Mappers.getMapper(KullaniciConverter.class);

    @Mapping(source = "kategoriId", target = "kategori.id")
    Urun convertUrunDtoToUrun(KullaniciDTO urunDto);

}
