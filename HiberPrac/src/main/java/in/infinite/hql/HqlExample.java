package in.infinite.hql;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.infinite.main.Student;

public class HqlExample {
	
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		String query = "from Student where city = 'pune'";
		Query q = s.createQuery(query);
		
		//single uniqu
		
		List<Student> list = q.list();
		for (Student student : list) {
			System.out.println(student.getName());
		}
		s.close();
		factory.close();
		
		
	}

}
