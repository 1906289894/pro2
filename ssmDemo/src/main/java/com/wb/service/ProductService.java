package com.wb.service;

import com.wb.domian.Product;

import java.util.List;

public interface ProductService {
     void saveAccount(Product product);
     List<Product> findAll();
}
