/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernatetest;

import com.vdk.pojo.Category;
import com.vdk.pojo.Comment;
import com.vdk.pojo.OrderDetail;
import com.vdk.pojo.ProdTag;
import com.vdk.pojo.Product;
import com.vdk.pojo.SaleOrder;
import com.vdk.pojo.Tag;
import com.vdk.pojo.User;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Asus
 */
public class HibernateUtils {

    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties props = new Properties();
        props.put(Environment.DIALECT,
                "org.hibernate.dialect.MySQLDialect");
        props.put(Environment.JAKARTA_JDBC_DRIVER,
                "com.mysql.cj.jdbc.Driver");    
        props.put(Environment.JAKARTA_JDBC_URL,
                "jdbc:mysql://localhost:3306/saledb?useUnicode=true&characterEncoding=utf8");
        props.put(Environment.JAKARTA_JDBC_USER, "root");
        props.put(Environment.JAKARTA_JDBC_PASSWORD, "123456789");
        props.put(Environment.SHOW_SQL,true);      
        conf.setProperties(props);
        
        conf.addAnnotatedClass(Category.class);
        conf.addAnnotatedClass(Comment.class);
        conf.addAnnotatedClass(OrderDetail.class);
        conf.addAnnotatedClass(ProdTag.class);
        conf.addAnnotatedClass(Product.class);
        conf.addAnnotatedClass(SaleOrder.class);
        conf.addAnnotatedClass(Tag.class);
        conf.addAnnotatedClass(User.class);
        
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(serviceRegistry);
    }

    //Lay factory truoc khi thuc hien truy van
    public static SessionFactory getFactory() {
        return FACTORY;
    }
}
