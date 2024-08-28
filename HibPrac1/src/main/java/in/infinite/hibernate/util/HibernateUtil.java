package in.infinite.hibernate.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.schema.internal.StandardSequenceExporter;

import in.infinite.hibernate.model.Student;



public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory(){
		if(sessionFactory == null){
			try {
				Configuration cfg = new Configuration();
				
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/myhiber?useSSL=false");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "India@123");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				settings.put(Environment.HBM2DDL_AUTO, "create-drop");
				
				cfg.setProperties(settings);
				cfg.addAnnotatedClass(Student.class);
			
				
				ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
				
				sessionFactory = cfg.buildSessionFactory(sr);
				
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return sessionFactory;
		
	}

}
