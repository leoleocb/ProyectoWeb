# 🛍️ Proyecto Web - Grupo B

## 📌 Avance 1 – Funcionalidades Implementadas

### 🧾 Páginas principales:
- **Inicio**: Página de bienvenida y navegación general.
- **Productos**: Catálogo con sistema de filtrado dinámico (por nombre, marca y categoría).
- **Carrito**: Persistente por usuario. Permite agregar, eliminar y vaciar productos.
- **Mi cuenta**: *(En desarrollo)*.

---

### 🔐 Seguridad
- Implementación de **Spring Security**.
- Sistema de **inicio y cierre de sesión**.
- Contraseñas **encriptadas** con BCrypt.

---

### 🛒 Carrito de compras
- Cada usuario tiene su propio carrito.
- Funciones disponibles:
  - Agregar productos con talla.
  - Eliminar productos individualmente.
  - Vaciar todo el carrito.
- El carrito se mantiene activo durante la sesión del usuario.

---

### 💳 Ventas
- Finalización de compra con selección de **método de pago**.
- Soporte para **cupones de descuento** (por monto fijo o porcentaje).
- Validación automática de cupones:
  - Fecha válida.
  - Estado activo.
  - Monto mínimo requerido (si aplica).
- Inserciones de ejemplo incluidas en el script SQL inicial.

---

### 🧰 Extras técnicos
- Proyecto Java con Spring Boot + Maven.
- Uso de Thymeleaf como motor de plantillas.
- Base de datos relacional MySQL.
- Controladores REST y MVC.
- Buen manejo de errores y validaciones básicas.

---

## 🚧 Próximos pasos
- Finalizar página "Mi cuenta".
- Generar **boleta en PDF** al momento de la venta.
- Administración de stock más avanzada.
- Módulo para CRUD de productos por parte del admin.



