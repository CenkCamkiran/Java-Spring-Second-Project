package com.secondhomework.cenkcamkiran.Converters;

import com.secondhomework.cenkcamkiran.DTO.YorumDTO;
import com.secondhomework.cenkcamkiran.entities.UrunYorum;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YorumConverter {

    YorumConverter INSTANCE = Mappers.getMapper(YorumConverter.class);

    UrunYorum convertYorumDtoToYorum(YorumDTO dto);

}
