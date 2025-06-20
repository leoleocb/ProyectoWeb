package com.proyecto.services.impl;

import com.proyecto.models.Usuario;
import com.proyecto.models.UsuarioRol;
import com.proyecto.repositories.IUsuarioRepository;
import com.proyecto.repositories.IUsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class UsuarioDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private IUsuarioRepository usuarioRepo;

    @Autowired
    private IUsuarioRolRepository usuarioRolRepo;

    @Override
    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepo.findByCorreo(correo)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));

        var roles = usuarioRolRepo.findAll().stream()
                .filter(r -> r.getUsuario().getId().equals(usuario.getId()))
                .map(r -> r.getRol().getNombre())
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());

        return new User(usuario.getCorreo(), usuario.getPassword(), roles);
    }
}

