package com.asl.itinventory.repository;

import com.asl.itinventory.entity.DesktopEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface DesktopRepository extends JpaRepository<DesktopEntity, Long>{
    @Query("select d from DesktopEntity d where d.sfid = :sfid")
    List<DesktopEntity> findBySfid(@Param("sfid") String sfid);

    @Transactional
    @Modifying
    @Query("delete from DesktopEntity d where d.sfid = :sfid")
    void deleteDesktopBySfid(@Param("sfid") String sfid);

}
