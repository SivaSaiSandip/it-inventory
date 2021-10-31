package com.asl.itinventory.mapper;

@Mapper
public interface DesktopMapper {
  DesktopEntity mapDesktopEntityFromModel(DesktopModel desktopModel);
  List<DesktopModel> mapDesktopModelsFromEntities(List<DesktopEntity> desktopEntityList);
}
