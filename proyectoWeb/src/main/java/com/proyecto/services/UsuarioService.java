package com.proyecto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.models.Usuario;
import com.proyecto.repositories.IUsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private IUsuarioRepository _usuarioRepository;

	public Usuario getOne(Integer id) {
		return _usuarioRepository.findById(id).orElseThrow();
	}
}
