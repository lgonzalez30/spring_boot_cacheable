package com.sofka.cacheable.app.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.sofka.cacheable.app.models.Producto;
import com.sofka.cacheable.app.repository.ProductRepository;

@Service
public class ProductServicesImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;

	@Override
	@Cacheable("products")
	public List<Producto> findAll() {
		return productRepository.findAll();		
	}



}
