package com.asl.itinventory.mapper;

import com.asl.itinventory.entity.LaptopEntity;
import com.asl.itinventory.entity.PrinterEntity;
import com.asl.itinventory.entity.TransferEntity;
import com.asl.itinventory.model.PrinterModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PrinterMapper {
  PrinterEntity mapPrinterEntityFromModel(PrinterModel printerModel);
  List<PrinterModel> mapPrinterModelsFromEntities(List<PrinterEntity> printerEntityList);
  PrinterModel mapPrinterModelsFromEntities(PrinterEntity printerEntity);

  @Mappings({
          @Mapping(target="sno", source="printerEntity.printerSno")
  })
  TransferEntity printerToTransferEntity(PrinterEntity printerEntity);

  List<TransferEntity> printerToTransferEntity(List<PrinterEntity> printerEntities);
}
