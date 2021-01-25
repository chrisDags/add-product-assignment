package com.dags.productdetails.controller;

import com.dags.productdetails.services.ProductService;
import com.dags.productdetails.domain.Product;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Log
@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/all")
    public ModelAndView getAllProducts(ModelMap modelMap) {

        modelMap.addAttribute("products", productService.retrieveAllProducts());
        log.info(modelMap.toString());

        return new ModelAndView("product-list", modelMap);
    }

    @PostMapping("/post")
    public ModelAndView postProduct(Product product) {

        if (productService.saveProduct(product)) {
            return new ModelAndView("index");
        } else {
            log.warning("User entered null or blank values.");
            return new ModelAndView("error");
        }
    }


}
