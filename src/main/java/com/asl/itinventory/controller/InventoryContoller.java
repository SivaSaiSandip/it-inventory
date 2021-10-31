package com.asl.itinventory.controller;

import com.asl.itinventory.model.DesktopModel;
import com.asl.itinventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InventoryContoller {
  
  @Autowired
  InventoryService inventoryService;
  
  @PostMapping("/save-desktop-details")
    public ResponseEntity<Object> saveDesktopDetails(@RequestBody DesktopModel desktopModel){
      
        inventoryService.saveDesktopEntry(desktopModel);
        return new ResponseEntity<Object>("Success", HttpStatus.OK);
    }
  
  @GetMapping("/get-desktop-details")
    public ResponseEntity<Object> getDesktopDetails() {
      
        List<DesktopModel> desktopModelList  = inventoryService.getAllDesktopEntries();
        return new ResponseEntity<Object>(desktopModelList, HttpStatus.OK);
    }

}
