package com.asl.itinventory.service;

import com.asl.itinventory.model.DesktopModel;
import com.asl.itinventory.model.PrinterModel;
import com.asl.itinventory.model.LaptopModel;

import java.util.List;

public interface InventoryService {
  
  void saveDesktopEntry(DesktopModel desktopModel);
  
  List<DesktopModel> getAllDesktopEntries();
  
  void savePrinterEntry(PrinterModel printerModel);
  
  List<PrinterModel> getAllPrinterEntries();
  
  void saveLaptopEntry(LaptopModel laptopModel);
  
  List<LaptopModel> getAllLaptopEntries();
}
