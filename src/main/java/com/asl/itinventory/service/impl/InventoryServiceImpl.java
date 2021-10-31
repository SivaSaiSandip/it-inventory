package com.asl.itinventory.service.impl;

@Service
@Slf4j
public class InventoryServiceImpl implements InventoryService{
  
  @Autowired
  DesktopMapper desktopMapper;
  @Autowired
  InventoryDao inventoryDao;
        
  @Override        
  void saveDesktopEntry(DesktopModel desktopModel){
      DesktopEntity desktopEntity = desktopMapper.mapDesktopEntityFromModel(desktopModel);
      inventoryDao.saveDesktopEntity(desktopEntity);
  }
  @Override        
  List<DesktopModel> getAllDesktopEntries(){
      List<DesktopEntity> desktopEntityList = inventoryDao.getAllDesktopEntities();
      return desktopMapper.mapDesktopModelsFromEntities(desktopEntityList);
  }
}
