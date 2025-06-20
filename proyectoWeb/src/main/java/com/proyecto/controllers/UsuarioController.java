package com.proyecto.controllers;

import com.proyecto.models.Usuario;
import com.proyecto.models.Rol;
import com.proyecto.models.UsuarioRol;
import com.proyecto.services.IUsuarioService;
import com.proyecto.repositories.IRolRepository;
import com.proyecto.repositories.IUsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @Autowired
    private IRolRepository rolRepo;

    @Autowired
    private IUsuarioRolRepository usuarioRolRepo;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    // ✅ Muestra el formulario de login
    @GetMapping("/login")
    public String mostrarLogin() {
        return "login"; // Renderiza login.html desde templates
    }

    // ✅ Muestra el formulario de registro
    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }

    // ✅ Procesa el registro y asigna rol CLIENTE
    
    @PostMapping("/registro")
public String procesarRegistro(@ModelAttribute("usuario") Usuario usuario) {
    usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
    usuario.setEstado(1); // ✅ ACTIVAR usuario al registrarlo

    Usuario usuarioGuardado = usuarioService.guardar(usuario);

        // Asignar rol CLIENTE automáticamente
        Rol rolCliente = rolRepo.findByNombre("CLIENTE")
                .orElseThrow(() -> new RuntimeException("El rol CLIENTE no está registrado"));

        UsuarioRol ur = new UsuarioRol();
        ur.setUsuario(usuarioGuardado);
        ur.setRol(rolCliente);
        usuarioRolRepo.save(ur);

        return "redirect:/productos";
    }
}
