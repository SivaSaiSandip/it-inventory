package com.asl.itinventory.repository;

import java.util.List;

public interface InventoryDao {
  
  void saveDesktopEntity(DesktopEntity desktopEntity);
  
  List<DesktopEntity> getAllDesktopEntities();
  
}
