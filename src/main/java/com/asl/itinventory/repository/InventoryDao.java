package com.asl.itinventory.repository;

import com.asl.itinventory.entity.DesktopEntity;
import com.asl.itinventory.entity.PrinterEntity;
import com.asl.itinventory.entity.LaptopEntity;

import java.util.List;

public interface InventoryDao {
  
  void saveDesktopEntity(DesktopEntity desktopEntity);
  
  List<DesktopEntity> getAllDesktopEntities();
  
  void savePrinterEntity(PrinterEntity printerEntity);
  
  List<PrinterEntity> getAllPrinterEntities();
  
  void saveLaptopEntity(LaptopEntity laptopEntity);
  
  List<LaptopEntity> getAllLaptopEntities();
  
}
