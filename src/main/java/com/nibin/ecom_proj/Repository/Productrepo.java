package com.nibin.ecom_proj.Repository;

import com.nibin.ecom_proj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productrepo extends JpaRepository<Product,Integer> {
}
