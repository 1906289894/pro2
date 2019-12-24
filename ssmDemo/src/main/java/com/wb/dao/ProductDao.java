package com.wb.dao;

import com.wb.domian.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("productDao")
public interface ProductDao {

     void save(Product product);

     @Select("select * from product")
     List<Product> findAll();
}
