package com.elawhelp.util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shuddho
 */
public class DBUtil {
    public static Session session = null;
    
    static{
        Configuration cfg=new Configuration();
        cfg.configure("com/elawhelp/resources/hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        System.out.println("Utility accessed");
        
        session=factory.openSession();
    }
    
    public static Session getSession(){
        return session;
    }
}
