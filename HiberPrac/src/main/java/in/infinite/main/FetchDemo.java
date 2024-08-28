package in.infinite.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	
	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory session = cfg.buildSessionFactory();
		Session ses = session.openSession();
		
		Student student = (Student)ses.load(Student.class, 102);
		System.out.println(student);
		session.close();
		ses.close();
		
	}

}
