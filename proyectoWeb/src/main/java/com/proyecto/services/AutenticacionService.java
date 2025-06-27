package com.proyecto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.dtos.AutentacionFilter;
import com.proyecto.models.Usuario;
import com.proyecto.repositories.IUsuarioRepository;

@Service
public class AutenticacionService {

	@Autowired
	private IUsuarioRepository _usuarioRepository;

	public Usuario autenticar(AutentacionFilter filter) {
		return _usuarioRepository.findByCorreoAndPassword(filter.getCorreo(), filter.getPassword());
	}
}
