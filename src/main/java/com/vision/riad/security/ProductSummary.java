package com.vision.riad.security;

import org.springframework.data.rest.core.config.Projection;

import com.vision.riad.model.Product;



@Projection(name="productSummary", types={Product.class})
public interface ProductSummary {
    int getId();
    double getPrix();
    String getLibelle();
}