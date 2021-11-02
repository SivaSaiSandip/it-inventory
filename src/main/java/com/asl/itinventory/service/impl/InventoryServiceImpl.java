package com.asl.itinventory.service.impl;

import com.asl.itinventory.entity.DesktopEntity;
import com.asl.itinventory.entity.PrinterEntity;
import com.asl.itinventory.entity.LaptopEntity;
import com.asl.itinventory.mapper.DesktopMapper;
import com.asl.itinventory.mapper.PrinterMapper;
import com.asl.itinventory.mapper.LaptopMapper;
import com.asl.itinventory.model.DesktopModel;
import com.asl.itinventory.model.LaptopModel;
import com.asl.itinventory.model.PrinterModel;
import com.asl.itinventory.repository.InventoryDao;
import com.asl.itinventory.service.InventoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class InventoryServiceImpl implements InventoryService {
  
  @Autowired
  DesktopMapper desktopMapper;
  @Autowired
  PrinterMapper printerMapper;
  @Autowired
  LaptopMapper laptopMapper;
  @Autowired
  InventoryDao inventoryDao;
        
  @Override        
  public void saveDesktopEntry(DesktopModel desktopModel){
     DesktopEntity desktopEntity = desktopMapper.mapDesktopEntityFromModel(desktopModel);
      inventoryDao.saveDesktopEntity(desktopEntity);
  }
  @Override
  public List<DesktopModel> getAllDesktopEntries(){
      List<DesktopEntity> desktopEntityList = inventoryDao.getAllDesktopEntities();
      return desktopMapper.mapDesktopModelsFromEntities(desktopEntityList);
  }
  
   @Override        
  public void savePrinterEntry(PrinterModel printerModel){
     PrinterEntity printerEntity = printerMapper.mapLaptopEntityFromModel(printerModel);
      inventoryDao.savePrinterEntity(printerEntity);
  }
  @Override
  public List<PrinterModel> getAllPrinterEntries(){
      List<PrinterEntity> printerEntityList = inventoryDao.getAllPrinterEntities();
      return printerMapper.mapLaptopModelsFromEntities(printerEntityList);
  }
  
  @Override        
  public void saveLaptopEntry(LaptopModel laptopModel){
     LaptopEntity laptopEntity = laptopMapper.mapPrinterEntityFromModel(laptopModel);
      inventoryDao.saveLaptopEntity(laptopEntity);
  }
  @Override
  public List<LaptopModel> getAllLaptopEntries(){
      List<LaptopEntity> laptopEntityList = inventoryDao.getAllLaptopEntities();
      return laptopMapper.mapPrinterModelsFromEntities(laptopEntityList);
  }
}
