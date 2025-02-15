package in.infinite.main;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Employ e1 = new Employ();
        Employ e2 = new Employ();
        e1.setEid(34);
        e1.setName("Akash");
        
        e2.setEid(35);
        e2.setName("Ganesh");
        
        Project p1 = new Project();
        Project p2 = new Project();
        
        p1.setPid(12121);
        p1.setProjectName("Library Management System");
        p2.setPid(14214);
        p2.setProjectName("CHATBOT");
        
        List<Employ> list1 = new ArrayList<Employ>();
        List<Project> list2 = new ArrayList<Project>();
        
        list1.add(e1);
        list1.add(e2);
        
        list2.add(p1);
        list2.add(p2);
        
        e1.setProjects(list2);
        p2.setEmps(list1);
        
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        s.save(e1);
        s.save(e2);
        s.save(p1);
        s.save(p2);
        
        tx.commit();
        s.close();
        factory.close();
    }
}
