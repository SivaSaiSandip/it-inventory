package com.asl.itinventory.mapper;

import com.asl.itinventory.entity.LaptopEntity;
import com.asl.itinventory.model.LaptopModel;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper
public interface LaptopMapper {
  LaptopEntity mapLaptopEntityFromModel(LaptopModel laptopModel);
  List<LaptopModel> mapLaptopModelsFromEntities(List<LaptopEntity> laptopEntityList);
}
