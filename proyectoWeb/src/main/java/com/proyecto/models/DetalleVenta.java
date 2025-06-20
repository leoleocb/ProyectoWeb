package com.proyecto.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "detalle_venta")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(DetalleVentaId.class)
public class DetalleVenta {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_venta")
    private Venta venta;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_talla")
    private Talla talla;

    private Integer cantidad;
    private BigDecimal precioUnitario;
}

