package com.asl.itinventory.repository;

import com.asl.itinventory.entity.DesktopEntity;
import com.asl.itinventory.entity.LaptopEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface LaptopRepository extends JpaRepository<LaptopEntity, Long>{
    @Query("select l from LaptopEntity l where l.sfid = :sfid")
    List<LaptopEntity> findBySfid(@Param("sfid") String sfid);

    @Transactional
    @Modifying
    @Query("delete from LaptopEntity l where l.sfid = :sfid")
    void deleteLaptopBySfid(@Param("sfid") String sfid);
}
