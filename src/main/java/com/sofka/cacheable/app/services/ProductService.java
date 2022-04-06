package com.sofka.cacheable.app.services;

import java.util.List;

import com.sofka.cacheable.app.models.Producto;

public interface  ProductService  {
	
	public List<Producto> findAll();
}
