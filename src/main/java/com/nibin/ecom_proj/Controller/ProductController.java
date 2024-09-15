package com.nibin.ecom_proj.Controller;


import com.nibin.ecom_proj.model.Product;
import com.nibin.ecom_proj.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    ProductService service;



    @GetMapping("/products")
    public ResponseEntity<List<Product>> getprod() {
         return new  ResponseEntity<>(service.getallproducts(),HttpStatus.OK);
    }

    @GetMapping("/product/{prodid}")
    public ResponseEntity<Product> getproduct(@PathVariable int prodid)
    {
        return new ResponseEntity<>(service.getproduct(prodid), HttpStatus.FOUND);
    }
}
