package com.asl.itinventory.controller;

import com.asl.itinventory.model.DesktopModel;
import com.asl.itinventory.model.PrinterModel;
import com.asl.itinventory.model.LaptopModel;
import com.asl.itinventory.model.TransferModel;
import com.asl.itinventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class InventoryContoller {
  
  @Autowired
  InventoryService inventoryService;
  
  @PostMapping("/save-desktop-details")
    public ResponseEntity<Object> saveDesktopDetails(@RequestBody DesktopModel desktopModel){
      
        inventoryService.saveDesktopEntry(desktopModel);
        return new ResponseEntity<Object>("Desktop Entry Saved Successfully!", HttpStatus.OK);
    }

  @GetMapping("/get-desktop-details")
    public ResponseEntity<Object> getDesktopDetails() {
      
        List<DesktopModel> desktopModelList  = inventoryService.getAllDesktopEntries();
        return new ResponseEntity<Object>(desktopModelList, HttpStatus.OK);
    }

  @PostMapping("/save-printer-details")
    public ResponseEntity<Object> savePrinterDetails(@RequestBody PrinterModel printerModel){
      
        inventoryService.savePrinterEntry(printerModel);
        return new ResponseEntity<Object>("Success", HttpStatus.OK);
    }

  @GetMapping("/get-printer-details")
    public ResponseEntity<Object> getPrinterDetails() {
      
        List<PrinterModel> printerModelList  = inventoryService.getAllPrinterEntries();
        return new ResponseEntity<Object>(printerModelList, HttpStatus.OK);
    }
  
  @PostMapping("/save-laptop-details")
    public ResponseEntity<Object> saveLaptopDetails(@RequestBody LaptopModel laptopModel){
      
        inventoryService.saveLaptopEntry(laptopModel);
        return new ResponseEntity<Object>("Success", HttpStatus.OK);
    }

  @GetMapping("/get-laptop-details")
    public ResponseEntity<Object> getLaptopDetails() {
      
        List<LaptopModel> laptopModelList  = inventoryService.getAllLaptopEntries();
        return new ResponseEntity<Object>(laptopModelList, HttpStatus.OK);
    }
    @PostMapping("/save-transfer-details")
    public ResponseEntity<Object> saveTransferDetails(@RequestBody TransferModel transferModel) {

         inventoryService.saveTransferDetails(transferModel.getSfid());
        return new ResponseEntity<Object>("success", HttpStatus.OK);
    }

}
