package com.vhre.micro_manufacturing.models.material.model;

import com.vhre.micro_manufacturing.models.material.enums.MaterialColor;
import com.vhre.micro_manufacturing.models.material.enums.MaterialTypes;
import com.vhre.micro_manufacturing.models.material.enums.MaterialUnit;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(
	name = "Materials",
	indexes = {
		@Index(name = "idx_material_name", columnList = "name"),
		@Index(name = "idx_material_type", columnList = "type"),
		@Index(name = "idx_material_created", columnList = "createdAt DESC")
	},
	uniqueConstraints = {
		@UniqueConstraint(name = "uk_material_name_type_color", columnNames = { "name", "material_type", "color" })
	}
)
@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EntityListeners(AuditingEntityListener.class)
public class Material {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(updatable = false, nullable = false)
	private UUID id;

	@Column(nullable = false, length = 255)
	private String name;

	@Enumerated(EnumType.STRING)
	@Column(name = "material_type", nullable = false)
	private MaterialTypes materialType;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private MaterialColor color;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private MaterialUnit unit;

	@Column(nullable = false)
	private int stock;

	@Column(name = "min_stock", nullable = false)
	private int minStock;

	@CreatedDate
	@Column(name = "created_at", nullable = false, updatable = true)
	private LocalDateTime createdAt;

	@LastModifiedDate
	@Column(name = "updated_at", insertable = false)
	private LocalDateTime updatedAt;
}
