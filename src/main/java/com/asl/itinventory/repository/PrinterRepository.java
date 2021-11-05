package com.asl.itinventory.repository;

import com.asl.itinventory.entity.PrinterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrinterRepository extends JpaRepository<PrinterEntity, Long>{

}
