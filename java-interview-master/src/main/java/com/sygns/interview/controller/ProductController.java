package com.sygns.interview.controller;

import com.sygns.interview.model.Product;
import com.sygns.interview.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/v1/validation",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public @ResponseBody
    ResponseEntity<?> validateSpecification(
            @RequestBody Product product
    ) {
        return ResponseEntity.ok(productService.validateProduct(product));
    }

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/v1/costEstimation",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public @ResponseBody
    ResponseEntity<?> estimateProductCost(
            @RequestBody Product product
    ) {
        return ResponseEntity.ok(productService.calculateProductCost(product));
    }

}
