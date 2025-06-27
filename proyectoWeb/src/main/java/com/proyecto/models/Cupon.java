package com.proyecto.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "cupones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String codigo;
    private String descripcion;
    private String tipo; // P o M
    private BigDecimal valor;
    private BigDecimal montoMinimo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String estado;
}

