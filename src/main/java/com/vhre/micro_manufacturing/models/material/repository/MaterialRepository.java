package com.vhre.micro_manufacturing.models.material.repository;

import com.vhre.micro_manufacturing.models.material.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MaterialRepository extends JpaRepository<Material, UUID> {
}