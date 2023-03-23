package com.desarrollasoftware.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.desarrollasoftware.app.documents.Producto;

public interface ProductoRepository extends MongoRepository<Producto, Integer>{

	
}
