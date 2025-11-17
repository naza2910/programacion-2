/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Inventario {
    private final List<Producto> productos = new ArrayList<>();

    public boolean agregarProducto(Producto p) {
        if (p == null || p.getId() == null) return false;
        if (buscarProductoPorId(p.getId()).isPresent()) return false; // evitar duplicados
        return productos.add(p);
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("Inventario vacío.");
            return;
        }
        for (Producto p : productos) p.mostrarInfo();
    }

    public Optional<Producto> buscarProductoPorId(String id) {
        if (id == null) return Optional.empty();
        for (Producto p : productos) {
            if (id.equalsIgnoreCase(p.getId())) return Optional.of(p);
        }
        return Optional.empty();
    }

    public boolean eliminarProducto(String id) {
        Iterator<Producto> it = productos.iterator();
        while (it.hasNext()) {
            if (it.next().getId().equalsIgnoreCase(id)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean actualizarStock(String id, int nuevaCantidad) {
        Optional<Producto> op = buscarProductoPorId(id);
        if (op.isPresent()) {
            if (nuevaCantidad < 0) nuevaCantidad = 0;
            op.get().setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        List<Producto> res = new ArrayList<>();
        for (Producto p : productos)
            if (p.getCategoria() == categoria) res.add(p);
        return res;
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) total += p.getCantidad();
        return total;
    }

    public Optional<Producto> obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return Optional.empty();
        Producto max = productos.get(0);
        for (Producto p : productos)
            if (p.getCantidad() > max.getCantidad()) max = p;
        return Optional.of(max);
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        if (max < min) { double t = min; min = max; max = t; } // por si viene invertido
        List<Producto> res = new ArrayList<>();
        for (Producto p : productos)
            if (p.getPrecio() >= min && p.getPrecio() <= max) res.add(p);
        return res;
    }

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c.name() + " - " + c.getDescripcion());
        }
    }

    public List<Producto> getProductos() {
        return Collections.unmodifiableList(productos);
    }
}
