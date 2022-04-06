package com.sofka.cacheable.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sofka.cacheable.app.models.Producto;

public interface ProductRepository  extends MongoRepository<Producto, String>  {

}
