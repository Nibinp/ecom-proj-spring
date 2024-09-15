package com.nibin.ecom_proj.Service;


import com.nibin.ecom_proj.model.Product;
import com.nibin.ecom_proj.Repository.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    Productrepo repo;

    public List<Product> getallproducts()
    {
        return repo.findAll();
    }


    public Product getproduct(int prodid) {
        return repo.findById(prodid).orElse(new Product());
    }
}
