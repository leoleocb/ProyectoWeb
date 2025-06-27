package com.proyecto.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombres;
    private String apellidos;
    private String correo;
    private String password;
    private String direccion;
    private LocalDate fechaNacimiento;
    private String sexo;
    private Integer estado;

    @Override
    public String toString() {
        return "Usuario{id=" + id + ", correo='" + correo + "'}";
    }
}
