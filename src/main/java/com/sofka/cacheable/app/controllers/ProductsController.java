package com.sofka.cacheable.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sofka.cacheable.app.services.ProductService;
import com.sofka.cacheable.app.models.Producto;


@RestController
@RequestMapping("/api/products")
public class ProductsController {

	@Autowired
	private ProductService service;
	
	@GetMapping
	public List<Producto> lista(){
		return service.findAll();
	}
}
