package com.proyecto.controllers;

import com.proyecto.models.Venta;
import com.proyecto.services.ICarritoService;
import com.proyecto.services.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    private IVentaService ventaService;

    @Autowired
    private ICarritoService carritoService;

    // ⚠️ Simulación de sesión (reemplazar con usuario real logueado)
    private final Integer idUsuarioSimulado = 1;

    @GetMapping("/checkout")
    public String mostrarCheckout(Model model) {
        var carrito = carritoService.obtenerOCrearCarritoPorUsuario(idUsuarioSimulado);
        var items = carritoService.listarItems(carrito.getId());

        model.addAttribute("items", items);
        model.addAttribute("carrito", carrito);
        return "venta/checkout"; // 📁 templates/venta/checkout.html
    }

    @PostMapping("/finalizar")
    public String finalizarCompra(@RequestParam("metodoPago") Integer idMetodoPago,
                                   @RequestParam(name = "codigoCupon", required = false) String codigoCupon,
                                   Model model) {
        try {
            Venta venta = ventaService.registrarVenta(idUsuarioSimulado, idMetodoPago, Optional.ofNullable(codigoCupon));
            model.addAttribute("venta", venta);
            return "venta/confirmacion"; // 📁 templates/venta/confirmacion.html
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "venta/checkout";
        }
    }
}
// Nota: Asegúrate de que las vistas checkout.html y confirmacion.html existan en el directorio templates/venta
