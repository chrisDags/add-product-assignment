package com.dags.productdetails.services;

import com.dags.productdetails.domain.Product;
import com.dags.productdetails.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Iterable<Product> retrieveAllProducts(){
        return productRepository.findAll();
    }

    public boolean saveProduct(Product product){

            BigDecimal bigDecimal = new BigDecimal("0");

            // if the values are valid, save the product.
            if(!product.getProductName().isBlank() &&
                    product.getProductPrice() != null && product.getProductPrice().compareTo(bigDecimal) > -1){

                productRepository.save(product);
                return true;
            }
            return false;
    }
}
