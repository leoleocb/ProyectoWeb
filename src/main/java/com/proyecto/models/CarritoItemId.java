package com.proyecto.models;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarritoItemId implements Serializable {
    private Integer carrito;
    private Integer producto;
    private Integer talla;
}
