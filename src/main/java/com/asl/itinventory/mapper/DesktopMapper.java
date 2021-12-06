package com.asl.itinventory.mapper;

import com.asl.itinventory.entity.DesktopEntity;
import com.asl.itinventory.entity.TransferEntity;
import com.asl.itinventory.model.DesktopModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DesktopMapper {
  DesktopEntity mapDesktopEntityFromModel(DesktopModel desktopModel);
  List<DesktopModel> mapDesktopModelsFromEntities(List<DesktopEntity> desktopEntityList);
  DesktopModel mapDesktopModelsFromEntities(DesktopEntity desktopEntity);
  @Mappings({
          @Mapping(target="sno", source="desktopEntity.desktopSno")
  })
  TransferEntity desktopToTransferEntity(DesktopEntity desktopEntity);

  List<TransferEntity> desktopToTransferEntity(List<DesktopEntity> desktopEntity);

}
