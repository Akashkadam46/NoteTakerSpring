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
        SessionFactory sf = cfg.buildSessionFactory();
        
//        //creating question
//        Question q = new Question();
//        q.setQuestionId(1212);
//        q.setQuestion("What is Java ?");
//        
//        //creating Answer
//        Answer ans = new Answer();
//        ans.setAnswerId(343);
//        ans.setAnswer("Java Is Programming Language");
//        ans.setQuestion(q);
//        
//        //creating answer
//        Answer ans1 = new Answer();
//        ans1.setAnswerId(33);
//        ans1.setAnswer("With The Help Of Java We Can Make Softwares");
//        ans1.setQuestion(q);
//       
//        Answer ans2 = new Answer();
//        ans2.setAnswerId(355);
//        ans2.setAnswer("Java Has Different Types  Of  Frameworks");
//        ans2.setQuestion(q);
//        
//        List<Answer> list = new ArrayList<Answer>();
//        list.add(ans);
//        list.add(ans1);
//        list.add(ans2);
//        q.setAnswers(list);
        
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
//        
//        s.save(q);
//        s.save(ans);
//        s.save(ans1);
//        s.save(ans2);
        
        Question q2 = s.get(Question.class, 1212);
        System.out.println(q2.getQuestionId());
        System.out.println(q2.getQuestion());
        //lazy
        System.out.println(q2.getAnswers().size());	
        
        
        tx.commit();
        s.close();
        sf.close();
        
    }
}
