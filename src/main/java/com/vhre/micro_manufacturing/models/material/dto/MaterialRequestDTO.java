package com.vhre.micro_manufacturing.models.material.dto;

import com.vhre.micro_manufacturing.models.material.enums.MaterialColor;
import com.vhre.micro_manufacturing.models.material.enums.MaterialTypes;
import com.vhre.micro_manufacturing.models.material.enums.MaterialUnit;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Schema(description = "DTO para creación y actualización de materiales")
public record MaterialRequestDTO(
	@Schema(
		description = "Nombre único del material_type",
		example = "PLA Negro Premium",
		minLength = 2,
		maxLength = 255,
		requiredMode = Schema.RequiredMode.REQUIRED
	)
	@NotBlank(message = "El nombre es obligatorio")
	@Size(min = 2, max = 255, message = "El nombre debe tener entre 2 y 255 caracteres.")
	String name,

	@Schema(
		description = "Tipo de material_type",
		example = "FILAMENT",
		requiredMode = Schema.RequiredMode.REQUIRED
	)
	@NotNull(message = "El tipo de material_type es obligatorio.")
	MaterialTypes material_type,

	@Schema(
		description = "Color del material_type",
		example = "BLACK",
		requiredMode = Schema.RequiredMode.REQUIRED
	)
	@NotNull(message = "El color del material_type es obligatorio")
	MaterialColor color,

	@Schema(
		description = "Unidad de medida",
		example = "GRAMS",
		requiredMode = Schema.RequiredMode.REQUIRED
	)
	@NotNull(message = "La unidad es obligatoria.")
	MaterialUnit unit,

	@Schema(
		description = "Cantidad actual en inventario",
		example = "1500",
		minimum = "0",
		requiredMode = Schema.RequiredMode.REQUIRED
	)
	@NotNull(message = "El stock es obligatorio.")
	@Min(value = 0, message = "El stock no puede ser negativo.")
	int stock,

	@Schema(
		description = "Stock mínimo antes de alertar",
		example = "100",
		minimum = "0",
		requiredMode = Schema.RequiredMode.REQUIRED
	)
	@NotNull(message = "El stock mínimo es obligatorio.")
	@Min(value = 0, message = "El stock mínimo no puede ser negativo")
	int minStock
) {
}
