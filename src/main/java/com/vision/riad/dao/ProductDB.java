package com.vision.riad.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vision.riad.model.Product;
import com.vision.riad.security.ProductSummary;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RepositoryRestResource(excerptProjection = ProductSummary.class,collectionResourceRel = "products",path="products")
public interface ProductDB extends JpaRepository<Product,Integer>{

}
