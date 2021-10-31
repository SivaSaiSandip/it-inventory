package com.asl.itinventory.repository.impl;

@Service
@Slf4j
public class InventoryDaoImpl implements InventoryDao{
  
  @Autowired
  DesktopRepository desktopRepository;
  
  void saveDesktopEntity(DesktopEntity desktopEntity){
    desktopRepository.save(desktopEntity);
  }
  
  List<DesktopEntity> getAllDesktopEntities(){
    return desktopRepository.fetchAll();
  }
}
