package com.proyecto.controllers;

import com.proyecto.models.Producto;
import com.proyecto.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping
    public String listarProductos(Model model) {
        List<Producto> productos = productoService.listarTodos();
        model.addAttribute("productos", productos);
        return "productos/lista"; // → crea productos/lista.html
    }

    @GetMapping("/categoria/{id}")
    public String listarPorCategoria(@PathVariable Integer id, Model model) {
        List<Producto> productos = productoService.buscarPorCategoria(id);
        model.addAttribute("productos", productos);
        return "productos/lista";
    }

    @GetMapping("/marca/{id}")
    public String listarPorMarca(@PathVariable Integer id, Model model) {
        List<Producto> productos = productoService.buscarPorMarca(id);
        model.addAttribute("productos", productos);
        return "productos/lista";
    }

    @GetMapping("/{id}")
    public String verDetalle(@PathVariable Integer id, Model model) {
        Producto producto = productoService.buscarPorId(id).orElse(null);
        if (producto == null) return "redirect:/productos";
        model.addAttribute("producto", producto);
        return "productos/detalle"; // → crea productos/detalle.html
    }
}
