package com.FTIsland.BE.repository;

import com.FTIsland.BE.entity.BookContentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookContentRepository extends JpaRepository<BookContentEntity, Integer> {
    Optional<BookContentEntity> findById(Integer id);
}
