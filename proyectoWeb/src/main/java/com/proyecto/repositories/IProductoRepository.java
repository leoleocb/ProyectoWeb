package com.proyecto.repositories;

import com.proyecto.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {
    List<Producto> findByCategoria_Id(Integer idCategoria);
    List<Producto> findByMarca_Id(Integer idMarca);
}

