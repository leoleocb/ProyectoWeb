package com.proyecto.models;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VentaPagoId implements Serializable {
    private Integer venta;
    private Integer metodoPago;
}

