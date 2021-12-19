package com.secondhomework.cenkcamkiran.Converters;

import java.util.List;

import com.secondhomework.cenkcamkiran.DTO.UrunYorumDTO;
import com.secondhomework.cenkcamkiran.DTO.YorumDTO;
import com.secondhomework.cenkcamkiran.entities.UrunYorum;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YorumConverter {

    YorumConverter INSTANCE = Mappers.getMapper(YorumConverter.class);

    UrunYorum convertYorumDtoToYorum(YorumDTO dto);

    @Mapping(source = "urun.id", target = "urunId")
    @Mapping(source = "yorum", target = "yorum")
    @Mapping(source = "yorum_tarihi", target = "yorumTarihi")
    @Mapping(source = "urun.adi", target = "urunAdi")
    @Mapping(source = "kullanici.kullaniciadi", target = "kullaniciAdi")
    List<UrunYorumDTO> convertUrunYorumToUrunYorumDto(List<UrunYorum> urunYorum);

}
