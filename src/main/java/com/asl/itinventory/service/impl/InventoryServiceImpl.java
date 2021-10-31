package com.asl.itinventory.service.impl;

import com.asl.itinventory.entity.DesktopEntity;
import com.asl.itinventory.mapper.DesktopMapper;
import com.asl.itinventory.model.DesktopModel;
import com.asl.itinventory.repository.InventoryDao;
import com.asl.itinventory.service.InventoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class InventoryServiceImpl implements InventoryService {
  
  @Autowired
  DesktopMapper desktopMapper;
  @Autowired
  InventoryDao inventoryDao;
        
  @Override        
  public void saveDesktopEntry(DesktopModel desktopModel){
      DesktopEntity desktopEntity = desktopMapper.mapDesktopEntityFromModel(desktopModel);
      inventoryDao.saveDesktopEntity(desktopEntity);
  }
  @Override
  public List<DesktopModel> getAllDesktopEntries(){
      List<DesktopEntity> desktopEntityList = inventoryDao.getAllDesktopEntities();
      return desktopMapper.mapDesktopModelsFromEntities(desktopEntityList);
  }
}
