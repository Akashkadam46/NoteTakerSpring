package in.infinite.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.infinite.main.Certificate;
import in.infinite.main.Student;

public class StateDemo {
	
	public static void main(String[] args) {
		System.out.println("Eample :");
		
		SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Student student = new Student();
		
		student.setId(1414);
		student.setName("Akash Kadam");
		student.setCity("PUNE");
		student.setCerti(new Certificate("Java Hibernate Course " , " 2 Month "));
		//student : Transient
		
		
		Session s = f.openSession();
		Transaction tx = s.beginTransaction();
		s.save(student);
		//student : Persistent - session,database
		student.setName("Ganesh");
		tx.commit();
		s.close();
		student.setName("uraj");
		f.close();
	}

}
