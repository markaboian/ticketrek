package com.proyectointegrador.msplace.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Schema(name = "Detalles de ZoneOnlyDTO")
public class ZoneOnlyDTO {
    @Schema(description = "ID de la zona", example = "1")
    private Long id;

    @Schema(description = "Nombre de la zona", example = "Popular Norte")
    private String name;

    @Schema(description = "Cantidad de asientos en la zona", example = "150")
    private Integer quantitySeat;

    @Schema(description = "Cantidad de asientos disponibles en la zona", example = "150")
    private Integer availability;

    @Schema(description = "Descripcion de la entrada")
    private String description;

    @Schema(description = "Asientos")
    private Set<SeatOnlyDTO> seats;
}