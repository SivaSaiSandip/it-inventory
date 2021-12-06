package com.asl.itinventory.service;

import com.asl.itinventory.model.DesktopModel;
import com.asl.itinventory.model.PrinterModel;
import com.asl.itinventory.model.LaptopModel;
import com.asl.itinventory.model.TransferModel;

import java.util.List;

public interface InventoryService {
  
  void saveDesktopEntry(DesktopModel desktopModel);
  
  List<DesktopModel> getAllDesktopEntries();
  
  void savePrinterEntry(PrinterModel printerModel);
  
  List<PrinterModel> getAllPrinterEntries();
  
  void saveLaptopEntry(LaptopModel laptopModel);
  
  List<LaptopModel> getAllLaptopEntries();

  void saveTransferDetails(String sfid);

  List<TransferModel> getAllTransferEntries();
}
