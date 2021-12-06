package com.asl.itinventory.repository;

import com.asl.itinventory.entity.DesktopEntity;
import com.asl.itinventory.entity.PrinterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PrinterRepository extends JpaRepository<PrinterEntity, Long>{
    @Query("select p from PrinterEntity p where p.sfid = :sfid")
    List<PrinterEntity> findBySfid(@Param("sfid") String sfid);

    @Transactional
    @Modifying
    @Query("delete from PrinterEntity p where p.sfid = :sfid")
    void deletePrinterBySfid(@Param("sfid") String sfid);
}
