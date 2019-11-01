package org.sanchez.corcoles.ana.pruebasconcepto.producto.controller;

import org.sanchez.corcoles.ana.pruebasconcepto.producto.model.entity.Producto;
import org.sanchez.corcoles.ana.pruebasconcepto.producto.model.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/productos")
    public List<Producto> listar(){
        return productoService.findAll();
    }

    @GetMapping("/productos/{id}")
    public Producto ver(@PathVariable Long id){
        return productoService.findById(id);
    }
}
