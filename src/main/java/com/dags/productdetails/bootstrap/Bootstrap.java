package com.dags.productdetails.bootstrap;

import com.dags.productdetails.domain.Product;
import com.dags.productdetails.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Bootstrap implements CommandLineRunner {


    @Autowired
    ProductRepository productRepository;

    // putting initial data into H2 database

    @Override
    public void run(String... args) throws Exception {

        Product product = new Product();
        product.setProductName("Video Game");
        product.setProductPrice(BigDecimal.valueOf(59.99));
        productRepository.save(product);

    }
}
