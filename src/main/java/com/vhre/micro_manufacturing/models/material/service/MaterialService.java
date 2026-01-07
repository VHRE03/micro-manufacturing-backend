package com.vhre.micro_manufacturing.models.material.service;

import com.vhre.micro_manufacturing.models.material.dto.MaterialRequestDTO;
import com.vhre.micro_manufacturing.models.material.dto.MaterialResponseDTO;

import java.util.List;
import java.util.UUID;

public interface MaterialService {
	MaterialResponseDTO create(MaterialRequestDTO request);

	MaterialResponseDTO update(UUID id, MaterialRequestDTO request);

	MaterialResponseDTO findById(UUID id);

	List<MaterialResponseDTO> findAll();

	void delete(UUID id);
}
