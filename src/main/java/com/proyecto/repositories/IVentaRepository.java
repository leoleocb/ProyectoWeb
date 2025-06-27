package com.proyecto.repositories;

import com.proyecto.models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IVentaRepository extends JpaRepository<Venta, Integer> {
    List<Venta> findByUsuario_Id(Integer idUsuario);
}
