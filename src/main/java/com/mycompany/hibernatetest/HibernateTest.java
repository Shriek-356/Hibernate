/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hibernatetest;

import com.vdk.pojo.Product;
import com.vdk.repositories.impl.CategoryRepositoryImpl;
import com.vdk.repositories.impl.ProductRepositoryImpl;
import com.vdk.repositories.impl.StatsRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Asus
 */
public class HibernateTest {
    
    public static void main(String[] args) {
        //CategoryRepositoryImpl ctimpl = new CategoryRepositoryImpl();
        
        //ctimpl.getCatesList().forEach(c->System.out.println(c.getName()));
        
        //ProductRepositoryImpl pdimpl = new ProductRepositoryImpl();
        
        //Map<String,String> m = new HashMap<>();
        //m.put("kw", "iphone");
        //m.put("fromPrice","20000000");
        //m.put("toPrice","29000000");
        //m.put("categoryId","1");
        //m.put("page","1");
        //pdimpl.getProduct(m).forEach(c->System.out.printf("%d - %s: %.1f\n",c.getId(),c.getName(),c.getPrice()));
    
        //StatsRepositoryImpl s = new StatsRepositoryImpl();
       // s.statsRevenusByProduct().forEach( o -> System.out.printf("%d - %s: %d\n",o[0],o[1],o[2]));
        
       // System.err.println("+++++");
        
        //s.statsRevenusByTime("MONTH", 2020).forEach( o -> System.out.printf("%d : %d\n",o[0],o[1]));
        
        ProductRepositoryImpl p = new ProductRepositoryImpl();
        
        Product s = p.getProductById(1);
        System.out.printf("%s - %s",s.getId(),s.getName());
                
        
    
    }
}
