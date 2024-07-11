package com.ravi.webapp.service;

import com.ravi.webapp.model.Product;
import com.ravi.webapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }
    public Product getProductById(int prodId){

        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
        System.out.println(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
