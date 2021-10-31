package com.asl.itinventory.controller;

@RestController
public class InventoryContoller {
  
  @Autowired
  InventoryService inventoryService;
  
  @PostMapping("/save-desktop-details")
    public ResponseEntity<Object> saveDesktopDetails(@RequestBody DesktopModel desktopModel){
      
        inventoryService.saveStudentDetails(workbook);
        return new ResponseEntity<Object>("Success", HttpStatus.OK);
    }
  
  @GetMapping("/get-desktop-details")
    public ResponseEntity<Object> getDesktopDetails() {
      
        List<DesktopModel> desktopModelList  = inventoryService.getAllDesktopEntries();
        return new ResponseEntity<Object>(desktopModelList, HttpStatus.OK);
    }

}
