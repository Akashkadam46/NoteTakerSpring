package in.infinite.pagination;

import org.hibernate.query.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.infinite.main.Student;

public class Pagination {
	
	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		
		Query query = s.createQuery("from Student");
		query.setFirstResult(0);
		query.setMaxResults(5);
		List<Student> list = query.list();
		
		for (Student student : list) {
			System.out.println(student.getName()+" : "+student.getCity()+" : "+student.getId()+" : ");
		}
		
		
		s.close();
		factory.close();
	}

}
