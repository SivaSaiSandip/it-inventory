package com.asl.itinventory.mapper;

import com.asl.itinventory.entity.LaptopEntity;
import com.asl.itinventory.entity.TransferEntity;
import com.asl.itinventory.model.LaptopModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LaptopMapper {
  LaptopEntity mapLaptopEntityFromModel(LaptopModel laptopModel);
  List<LaptopModel> mapLaptopModelsFromEntities(List<LaptopEntity> laptopEntityList);
   LaptopModel mapLaptopModelsFromEntities(LaptopEntity laptopEntity);

    @Mappings({
            @Mapping(target="sno", source="laptopEntity.laptopSno")
    })
    TransferEntity laptopToTransferEntity(LaptopEntity laptopEntity);

    List<TransferEntity> laptopToTransferEntity(List<LaptopEntity> laptopEntities);

}
