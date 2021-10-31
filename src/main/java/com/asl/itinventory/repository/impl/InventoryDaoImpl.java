package com.asl.itinventory.repository.impl;

import com.asl.itinventory.entity.DesktopEntity;
import com.asl.itinventory.repository.DesktopRepository;
import com.asl.itinventory.repository.InventoryDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class InventoryDaoImpl implements InventoryDao {
  
  @Autowired
  DesktopRepository desktopRepository;
  @Override
 public void saveDesktopEntity(DesktopEntity desktopEntity){desktopRepository.save(desktopEntity);}
 @Override
  public List<DesktopEntity> getAllDesktopEntities(){
    return desktopRepository.findAll();
  }
}
