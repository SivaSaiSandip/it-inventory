package com.asl.itinventory.service;

import java.util.List;

public interface InventoryService {
  
  void saveDesktopEntry(DesktopModel desktopModel);
  
  List<DesktopModel> getAllDesktopEntries();
}
