package in.infinite.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.infinite.main.Student;

public class CriteriaExample { 
	
	public static void main(String[] args) {
		
		
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		
		 Criteria c = s.createCriteria(Student.class);
		
		 List<Student> students = c.list();
		 
		 
		 for (Student st : students) {
			System.out.println(st);
		}
		
		
		s.close();
	}

}
