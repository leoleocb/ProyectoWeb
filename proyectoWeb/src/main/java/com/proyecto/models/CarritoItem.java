package com.proyecto.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "carrito_item")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(CarritoItemId.class)
public class CarritoItem {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_carrito")
    private Carrito carrito;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_talla")
    private Talla talla;

    private Integer cantidad;
}

