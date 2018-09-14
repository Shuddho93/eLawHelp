/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elawhelp.dao;

import com.elawhelp.util.DBUtil;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import static com.elawhelp.util.DBUtil.session;

/**
 *
 * @author Shuddho
 */
public class DataAccess {
    
    public static int insertData(Object o){
        Session session=DBUtil.getSession();
        Transaction tr=session.beginTransaction();
        try{
        session.save(o);
        tr.commit();
        }
        catch(Exception e)
        {
            tr.rollback();
        }
        return 2;
        
    }
    
    public static void deleteData(Object o){
        Session session=DBUtil.getSession();
        Transaction tr=session.beginTransaction();
        try{
        session.delete(o);
        tr.commit();
        }
        catch(Exception e)
        {
            tr.rollback();
        }
        
    }
    
    public static void updateData(Object o){
        Configuration cfg=new Configuration();
        cfg.configure("com/BUYellowPage/resources/hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        System.out.println("Updated");
        
        session=factory.openSession();
        session=DBUtil.getSession();
        Transaction tr=session.beginTransaction();
        session.update(o);
        tr.commit();
        JOptionPane.showMessageDialog(null, "updated");
    }
}
