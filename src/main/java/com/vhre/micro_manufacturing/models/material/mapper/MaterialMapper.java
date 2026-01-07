package com.vhre.micro_manufacturing.models.material.mapper;

import com.vhre.micro_manufacturing.models.material.dto.MaterialRequestDTO;
import com.vhre.micro_manufacturing.models.material.dto.MaterialResponseDTO;
import com.vhre.micro_manufacturing.models.material.model.Material;
import org.springframework.stereotype.Component;

@Component
public class MaterialMapper {
	public Material toEntity(MaterialRequestDTO dto) {
		return Material.builder()
			.name(dto.name())
			.materialType(dto.material_type())
			.color(dto.color())
			.unit(dto.unit())
			.stock(dto.stock())
			.minStock(dto.minStock())
			.build();
	}

	public void updateEntity(Material entity, MaterialRequestDTO dto) {
		entity.setName(dto.name());
		entity.setMaterialType(dto.material_type());
		entity.setColor(dto.color());
		entity.setUnit(dto.unit());
		entity.setStock(dto.stock());
		entity.setMinStock(dto.minStock());
	}

	public MaterialResponseDTO toResponse(Material entity) {
		return new MaterialResponseDTO(
			entity.getId(),
			entity.getName(),
			entity.getMaterialType(),
			entity.getColor(),
			entity.getUnit(),
			entity.getStock(),
			entity.getMinStock(),
			entity.getCreatedAt(),
			entity.getUpdatedAt()
		);
	}
}
