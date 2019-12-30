package com.vision.riad.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vision.riad.model.Product;

@RepositoryRestResource(collectionResourceRel = "products",path="products")
public interface ProductDB extends JpaRepository<Product,Integer>{

}
