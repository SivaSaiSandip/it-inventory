package com.asl.itinventory.mapper;

import com.asl.itinventory.entity.DesktopEntity;
import com.asl.itinventory.model.DesktopModel;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper
public interface DesktopMapper {
  DesktopEntity mapDesktopEntityFromModel(DesktopModel desktopModel);
  List<DesktopModel> mapDesktopModelsFromEntities(List<DesktopEntity> desktopEntityList);
}
