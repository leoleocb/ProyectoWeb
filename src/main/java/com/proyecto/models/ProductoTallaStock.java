package com.proyecto.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "producto_talla_stock")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ProductoTallaStockId.class)
public class ProductoTallaStock {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_talla")
    private Talla talla;

    private Integer stock;
}
