package com.proyecto.models;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalleVentaId implements Serializable {
    private Integer venta;
    private Integer producto;
    private Integer talla;
}
