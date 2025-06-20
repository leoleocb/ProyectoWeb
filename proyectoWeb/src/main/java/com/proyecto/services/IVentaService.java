package com.proyecto.services;

import com.proyecto.models.Venta;

import java.util.Optional;

public interface IVentaService {
    Venta registrarVenta(Integer idUsuario, Integer idMetodoPago, Optional<String> codigoCupon);
}

