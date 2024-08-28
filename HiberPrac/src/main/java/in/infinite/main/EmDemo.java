package in.infinite.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	
	 
	    public static void main(String[] args) {
			
	    	
	    	Configuration cfg = new Configuration();
	    	cfg.configure("hibernate.cfg.xml");
	    	SessionFactory factory =cfg.buildSessionFactory();
	    	
	    	Student student1 = new Student();
	    	student1.setId(14134);
	    	student1.setName("Akash Kadam");
	    	student1.setCity("Pimpri");
	    	
	    	
	    	Certificate certi = new Certificate();
	    	certi.setCourse("Java");
	    	certi.setDuration("3 months");
	    	student1.setCerti(certi);
	    	
	    	Student student2 = new Student();
	    	student2.setId(1212);
	    	student2.setName("Ganesh Kadam");
	    	student2.setCity("Chinchwad");
	    	
	    	
	    	Certificate certi1 = new Certificate();
	    	certi1.setCourse("Anroid");
	    	certi1.setDuration("2 months");
	    	student2.setCerti(certi1);
	    	
	    	
	    	
	    	Session ses = factory.openSession();
	    	Transaction tx = ses.beginTransaction();
	    	
	    	ses.save(student1);
	    	ses.save(student2);
	    	tx.commit();
	    	ses.close();
	    	factory.close();
	    	
	    	
		}

}
