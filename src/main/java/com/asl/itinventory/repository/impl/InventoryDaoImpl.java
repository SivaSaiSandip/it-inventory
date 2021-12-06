package com.asl.itinventory.repository.impl;

import com.asl.itinventory.entity.DesktopEntity;
import com.asl.itinventory.entity.PrinterEntity;
import com.asl.itinventory.entity.LaptopEntity;
import com.asl.itinventory.entity.TransferEntity;
import com.asl.itinventory.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class InventoryDaoImpl implements InventoryDao {
  
  @Autowired
  DesktopRepository desktopRepository;
   @Autowired
  PrinterRepository printerRepository;
   @Autowired
  LaptopRepository laptopRepository;
   @Autowired
    TransferRepository transferRepository;
  
  @Override
 public void saveDesktopEntity(DesktopEntity desktopEntity){desktopRepository.save(desktopEntity);}
 @Override
  public List<DesktopEntity> getAllDesktopEntities(){
    return desktopRepository.findAll();
  }
  
 @Override
 public void savePrinterEntity(PrinterEntity printerEntity){printerRepository.save(printerEntity);}
 @Override
  public List<PrinterEntity> getAllPrinterEntities(){
    return printerRepository.findAll();
  }
  
 @Override
 public void saveLaptopEntity(LaptopEntity laptopEntity){laptopRepository.save(laptopEntity);}
 @Override
  public List<LaptopEntity> getAllLaptopEntities(){
    return laptopRepository.findAll();
  }

    @Override
    public List<DesktopEntity> getDesktopBySfid(String sfid) {
        return desktopRepository.findBySfid(sfid);
    }

    @Override
    public List<LaptopEntity> getLaptopBySfid(String sfid) {
        return laptopRepository.findBySfid(sfid);
    }

    @Override
    public List<PrinterEntity> getPrinterBySfid(String sfid) {
        return printerRepository.findBySfid(sfid);
    }

    @Override
    public void deleteDesktopBySfid(String sfid) {
        desktopRepository.deleteDesktopBySfid(sfid);
    }

    @Override
    public void deleteLaptopBySfid(String sfid) {
      laptopRepository.deleteLaptopBySfid(sfid);
    }

    @Override
    public void deletePrinterBySfid(String sfid) {
      printerRepository.deletePrinterBySfid(sfid);
    }

    @Override
    public void saveAllTransfers(List<TransferEntity> transferEntityList) {
        transferRepository.saveAll(transferEntityList);
    }

    @Override
    public List<TransferEntity> getAllTransferEntities() {
        return transferRepository.findAll();
    }
}
