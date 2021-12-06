package com.asl.itinventory.repository;

import com.asl.itinventory.entity.DesktopEntity;
import com.asl.itinventory.entity.PrinterEntity;
import com.asl.itinventory.entity.LaptopEntity;
import com.asl.itinventory.entity.TransferEntity;

import java.util.List;

public interface InventoryDao {
  
  void saveDesktopEntity(DesktopEntity desktopEntity);
  
  List<DesktopEntity> getAllDesktopEntities();
  
  void savePrinterEntity(PrinterEntity printerEntity);
  
  List<PrinterEntity> getAllPrinterEntities();
  
  void saveLaptopEntity(LaptopEntity laptopEntity);
  
  List<LaptopEntity> getAllLaptopEntities();

  List<DesktopEntity> getDesktopBySfid(String sfid);

  List<LaptopEntity> getLaptopBySfid(String sfid);

  List<PrinterEntity> getPrinterBySfid(String sfid);

  void deleteDesktopBySfid(String sfid);

  void deleteLaptopBySfid(String sfid);

  void deletePrinterBySfid(String sfid);

  void saveAllTransfers(List<TransferEntity> transferEntityList);

  List<TransferEntity> getAllTransferEntities();
  
}
