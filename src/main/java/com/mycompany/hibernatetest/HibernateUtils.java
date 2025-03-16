/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernatetest;

import com.vdk.pojo.Category;
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
                "jdbc:mysql://localhost:3306/saledb");
        props.put(Environment.JAKARTA_JDBC_USER, "root");
        props.put(Environment.JAKARTA_JDBC_PASSWORD, "123456789");
        props.put(Environment.SHOW_SQL,true);      
        conf.setProperties(props);
        
        conf.addAnnotatedClass(Category);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(serviceRegistry);
    }

    //Lay factory truoc khi thuc hien truy van
    public static SessionFactory getFactory() {
        return FACTORY;
    }
}
