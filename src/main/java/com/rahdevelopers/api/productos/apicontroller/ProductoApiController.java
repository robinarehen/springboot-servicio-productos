package com.rahdevelopers.api.productos.apicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahdevelopers.api.productos.entity.ProductoEntity;
import com.rahdevelopers.api.productos.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoApiController {

	@Autowired
	private ProductoService productoService;

	@GetMapping("/listar")
	public List<ProductoEntity> getListarProductos() {
		return this.productoService.findAll();
	}

	@GetMapping("/{id}")
	public ProductoEntity getProducto(@PathVariable Long id) {
		return this.productoService.findById(id);
	}
}
