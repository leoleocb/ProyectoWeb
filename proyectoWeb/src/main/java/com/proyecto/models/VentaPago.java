package com.proyecto.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "venta_pago")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(VentaPagoId.class)
public class VentaPago {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_venta")
    private Venta venta;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_metodo_pago")
    private MetodoPago metodoPago;
}

