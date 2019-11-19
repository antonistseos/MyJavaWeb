package dao;

import bean.User;
import org.hibernate.*;
import util.HibernateUtil;



public class UserDAO {
    
    public int add(User user){
        Transaction t = null;
        int status=0;
        
        try {
            Session s = HibernateUtil.getSessionFactory().openSession();
            t = s.beginTransaction();
            s.save(user);
            t.commit();
            status = 1;
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    public User find(String name){
        Session s = HibernateUtil.getSessionFactory().openSession();
        
        Query q = s.createQuery("from User u where u.name = :name");
        q.setParameter("name", name);
        
        User u = (User) q.uniqueResult();
        return u;
    }
    
}
