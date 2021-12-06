package com.asl.itinventory.mapper;

import com.asl.itinventory.entity.TransferEntity;
import com.asl.itinventory.model.TransferModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TransferMapper {
  TransferEntity mapTransferEntityFromModel(TransferModel transferModel);
  TransferModel mapTransferModelsFromEntities(TransferEntity transferEntity);
  List<TransferModel> mapTransferModelsFromEntities(List<TransferEntity> transferEntityList);



}
