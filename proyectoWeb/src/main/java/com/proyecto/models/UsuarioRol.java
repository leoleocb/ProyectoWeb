package com.proyecto.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario_rol")
@IdClass(UsuarioRolId.class)
public class UsuarioRol {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    @ToString.Exclude // 🔒 Evita recursión infinita
    private Usuario usuario;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;

    @Override
    public String toString() {
        return "UsuarioRol{usuarioId=" + usuario.getId() + ", rol=" + rol.getNombre() + "}";
    }
}
