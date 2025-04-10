/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vdk.repositories.impl;

import com.mycompany.hibernatetest.HibernateUtils; 
import com.vdk.pojo.Category;
import jakarta.persistence.Query;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Asus
 */
public class CategoryRepositoryImpl {
    
    public List<Category> getCatesList(){
        
        try(Session s = HibernateUtils.getFactory().openSession()){
            Query query = s.createQuery("from Category", Category.class);
            return query.getResultList();
        }
        
    }
    
}
