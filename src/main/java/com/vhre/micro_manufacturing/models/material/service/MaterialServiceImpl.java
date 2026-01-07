package com.vhre.micro_manufacturing.models.material.service;

import com.vhre.micro_manufacturing.models.material.dto.MaterialRequestDTO;
import com.vhre.micro_manufacturing.models.material.dto.MaterialResponseDTO;
import com.vhre.micro_manufacturing.models.material.mapper.MaterialMapper;
import com.vhre.micro_manufacturing.models.material.model.Material;
import com.vhre.micro_manufacturing.models.material.repository.MaterialRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class MaterialServiceImpl implements MaterialService {

	private final MaterialRepository repository;
	private final MaterialMapper mapper;

	public MaterialServiceImpl(MaterialRepository repository, MaterialMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	@Override
	public MaterialResponseDTO create(MaterialRequestDTO request) {
		Material material = mapper.toEntity(request);
		Material saved = repository.save(material);

		return mapper.toResponse(saved);
	}

	@Override
	public MaterialResponseDTO update(UUID id, MaterialRequestDTO request) {
		Material material = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Material no encontrado"));

		mapper.updateEntity(material, request);

		return mapper.toResponse(material);
	}

	@Override
	public MaterialResponseDTO findById(UUID id) {
		return null;
	}

	@Override
	public List<MaterialResponseDTO> findAll() {
		return List.of();
	}

	@Override
	public void delete(UUID id) {

	}
}
