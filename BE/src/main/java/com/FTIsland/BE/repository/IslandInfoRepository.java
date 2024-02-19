package com.FTIsland.BE.repository;

import com.FTIsland.BE.entity.IslandInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IslandInfoRepository extends JpaRepository<IslandInfoEntity, Integer> {

     Optional<IslandInfoEntity> findById(Integer id);
}
