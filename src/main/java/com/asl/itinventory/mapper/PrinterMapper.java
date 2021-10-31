package com.asl.itinventory.mapper;

import org.mapstruct.Mapper;
import java.util.List;

@Mapper
public interface PrinterMapper {
  PrinterEntity mapPrinterEntityFromModel(PrinterModel printerModel);
  List<PrinterModel> mapPrinterModelsFromEntities(List<PrinterEntity> printerEntityList);
}
