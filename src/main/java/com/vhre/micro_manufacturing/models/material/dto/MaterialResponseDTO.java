package com.vhre.micro_manufacturing.models.material.dto;

import com.vhre.micro_manufacturing.models.material.enums.MaterialColor;
import com.vhre.micro_manufacturing.models.material.enums.MaterialTypes;
import com.vhre.micro_manufacturing.models.material.enums.MaterialUnit;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import java.util.UUID;

@Schema(description = "DTO para respuesta de materiales")
public record MaterialResponseDTO(
	@Schema(
		description = "ID único del material",
		example = "123e4567-e89b-12d3-a456-426614174000",
		accessMode = Schema.AccessMode.READ_ONLY
	)
	UUID id,

	@Schema(
		description = "Tipo de material",
		example = "FILAMENT"
	)
	String name,

	@Schema(
		description = "Tipo de material",
		example = "FILAMENT"
	)
	MaterialTypes type,

	@Schema(
		description = "Color del material",
		example = "BLACK"
	)
	MaterialColor color,

	@Schema(
		description = "Unidad de medida",
		example = "GRAMS"
	)
	MaterialUnit unit,

	@Schema(
		description = "Cantidad actual en inventario",
		example = "1500"
	)
	int stock,

	@Schema(
		description = "Stock mínimo antes de alertar",
		example = "100"
	)
	int minStock,

	@Schema(
		description = "Fecha de creación",
		example = "2024-01-15T10:30:00",
		accessMode = Schema.AccessMode.READ_ONLY
	)
	LocalDateTime createdAt,

	@Schema(
		description = "Fecha de última actualización",
		example = "2024-01-20T14:45:30",
		accessMode = Schema.AccessMode.READ_ONLY
	)
	LocalDateTime updatedAt
) {
}
