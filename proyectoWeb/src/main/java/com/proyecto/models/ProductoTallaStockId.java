package com.proyecto.models;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoTallaStockId implements Serializable {
    private Integer producto;
    private Integer talla;
}
