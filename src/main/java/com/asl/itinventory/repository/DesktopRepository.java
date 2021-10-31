package com.asl.itinventory.repository;

import com.asl.itinventory.entity.DesktopEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesktopRepository extends JpaRepository<DesktopEntity, Long>{

}
