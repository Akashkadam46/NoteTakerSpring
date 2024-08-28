package in.infinite.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cgf.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//creating question
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("What is Java ?");
		
		
		//Creating Answer
		Answer answer = new Answer();
		answer.setAnswerId(343);
		answer.setAnswer("It Is A Programming Language");
		answer.setQuestion(q1);
		q1.setAnswer(answer);
		
		//creating question
				Question q2 = new Question();
				q2.setQuestionId(242);
				q2.setQuestion("What is Collection Framework ?");
				
				
				//Creating Answer
				Answer answer1 = new Answer();
				answer1.setAnswerId(344);
				answer1.setAnswer("API to work with objects in java");
				answer1.setQuestion(q2);
				q2.setAnswer(answer1);
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(q1);
		s.save(answer);
		s.save(q2);
		s.save(answer1);
		
		tx.commit();
		
		//fetching
		Question newq = (Question)s.get(Question.class, 1212);
		System.out.println(newq.getQuestion());
		System.out.println(newq.getAnswer().getAnswer());
		
		
		
		s.close();
		factory.close();
	}

}
