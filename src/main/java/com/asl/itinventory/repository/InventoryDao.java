package com.asl.itinventory.repository;

import com.asl.itinventory.entity.DesktopEntity;

import java.util.List;

public interface InventoryDao {
  
  void saveDesktopEntity(DesktopEntity desktopEntity);
  
  List<DesktopEntity> getAllDesktopEntities();
  
}
