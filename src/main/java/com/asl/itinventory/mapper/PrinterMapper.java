package com.asl.itinventory.mapper;

import com.asl.itinventory.entity.PrinterEntity;
import com.asl.itinventory.model.PrinterModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PrinterMapper {
  PrinterEntity mapPrinterEntityFromModel(PrinterModel printerModel);
  List<PrinterModel> mapPrinterModelsFromEntities(List<PrinterEntity> printerEntityList);
}
