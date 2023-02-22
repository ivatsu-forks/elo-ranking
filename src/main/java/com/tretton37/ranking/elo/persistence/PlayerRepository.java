package com.tretton37.ranking.elo.persistence;

import com.tretton37.ranking.elo.persistence.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.UUID;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, UUID> {
    Collection<PlayerEntity> findByNameContainingIgnoreCase(String name);
    PlayerEntity findByName(String name);
}
