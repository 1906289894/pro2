package com.wb.service.impl;

import com.wb.dao.ProductDao;
import com.wb.domian.Product;
import com.wb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {


    @Autowired
    @Qualifier("productDao")
    private ProductDao productDao;

    @Override
    public void saveAccount(Product product) {
        System.out.println("haha");
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = productDao.findAll();

        return products;
    }
}
