package com.asl.itinventory.service;

import com.asl.itinventory.model.DesktopModel;

import java.util.List;

public interface InventoryService {
  
  void saveDesktopEntry(DesktopModel desktopModel);
  
  List<DesktopModel> getAllDesktopEntries();
}
