package com.proyecto.repositories;

import com.proyecto.models.UsuarioRol;
import com.proyecto.models.UsuarioRolId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRolRepository extends JpaRepository<UsuarioRol, UsuarioRolId> { }
