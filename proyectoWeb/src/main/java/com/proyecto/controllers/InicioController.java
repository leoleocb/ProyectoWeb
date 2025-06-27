package com.proyecto.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.proyecto.dtos.AutentacionFilter;
import com.proyecto.models.Usuario;
import com.proyecto.utils.Alert;

import jakarta.servlet.http.HttpSession;

@Controller
public class InicioController {

    @GetMapping({"/", "/inicio"})
    public String inicio(Model model, @AuthenticationPrincipal UserDetails userDetails) {
        if (userDetails != null) {
            model.addAttribute("usuarioCorreo", userDetails.getUsername());
        }
        return "index";
    }
    
    
}

