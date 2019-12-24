package com.wb.test;

import com.wb.domian.Product;
import com.wb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("product")
public class Test {
    @Autowired
    private ProductService productService;
    public String main(String[] args) {
        System.out.println("表现层");
        return "list";
    }

    @RequestMapping("/findAll")
    public String findAll(){
        List<Product> products = productService.findAll();
        for(Product p:products){
            System.out.println(p.getCityName()+" " +p.getProductName());
        }
        System.out.println("表现层");
        return "list";
    }
}
